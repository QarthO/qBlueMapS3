package gg.quartzdev.mc.qbluemaps3;

import de.bluecolored.bluemap.common.config.storage.StorageConfig;
import de.bluecolored.bluemap.common.config.storage.StorageType;
import de.bluecolored.bluemap.core.util.Key;

public final class QBlueMapS3 implements Runnable
{

    @Override
    public void run() {
        StorageType.REGISTRY.register(new StorageTypeS3());
    }

    class StorageTypeS3 implements StorageType {
        private final Key key = new Key("quartzdev", "s3");
        private final Class<? extends StorageConfig> configType = ConfigS3.class;

        @Override
        public Key getKey() {
            return key;
        }

        @Override
        public Class<? extends StorageConfig> getConfigType() {
            return configType;
        }
    }

}
