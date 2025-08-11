package gg.quartzdev.mc.qbluemaps3;

import java.io.IOException;
import java.util.stream.Stream;

import de.bluecolored.bluemap.core.storage.Storage;
import de.bluecolored.bluemap.core.storage.file.FileMapStorage;

public class StorageS3 implements Storage {
    

    public StorageS3() {

    }

    @Override
    public void initialize() throws IOException {

    }

    @Override
    public FileMapStorage map(String mapId) {

        return null;

    }

    @Override
    public void close() throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

    @Override
    public Stream<String> mapIds() throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mapIds'");
    }

    @Override
    public boolean isClosed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isClosed'");
    }

}