package Misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class FileBundle
{
    public static ResponseEntity<Object> ReturnPNG(String FilePath)
    {
        HttpHeaders Header = new HttpHeaders();
        
        Header.setContentType(MediaType.IMAGE_PNG);
            
        try
        {
            return new ResponseEntity<>(Files.readAllBytes(Paths.get(FilePath)), Header, HttpStatus.CREATED);
        }
        catch(IOException E)
        {
            return null;
        }
    }
    
    public static ResponseEntity<Object> ReturnPDF(String FilePath)
    {
        HttpHeaders Header = new HttpHeaders();
        
        Header.setContentType(MediaType.APPLICATION_PDF);
        
        try
        {
            return new ResponseEntity<>(Files.readAllBytes(Paths.get(FilePath)), Header, HttpStatus.CREATED);
        }
        catch(IOException E)
        {
            return null;
        }
    }
}
