package solid.live.dip;


import net.iharder.Base64;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
   Reader reader;
   Encoder encoder;
   Writer writer;
    EncodingModule(Reader reader, Encoder encoder, Writer writer){
        this.reader = reader;
        this.encoder = encoder;
        this.writer = writer;
    }

    void performingReadAndWriteWithEncoding(){
        String data = reader.read();
        String encodedData = encoder.encode(data);
        writer.Write(encodedData);
    }
}

