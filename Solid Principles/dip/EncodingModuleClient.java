package solid.live.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // for now I only assumed we can read and write file we can extend it to read and write file from network
        // by simply adding their respective classes which will implement their respective interfaces.
        ReadFile readFile = new ReadFile();
        EncodeFileBase64 encodeFileBase64 = new EncodeFileBase64();
        FileWriter fileWriter = new FileWriter();
        EncodingModule encodingModule  = new EncodingModule(readFile, encodeFileBase64, fileWriter);
        encodingModule.performingReadAndWriteWithEncoding();
    }
}
