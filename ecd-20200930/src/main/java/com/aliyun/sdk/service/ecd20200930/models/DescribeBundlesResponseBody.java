// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBundlesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBundlesResponseBody</p>
 */
public class DescribeBundlesResponseBody extends TeaModel {
    @NameInMap("Bundles")
    private java.util.List < Bundles> bundles;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBundlesResponseBody(Builder builder) {
        this.bundles = builder.bundles;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBundlesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bundles
     */
    public java.util.List < Bundles> getBundles() {
        return this.bundles;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Bundles> bundles; 
        private String nextToken; 
        private String requestId; 

        /**
         * Bundles.
         */
        public Builder bundles(java.util.List < Bundles> bundles) {
            this.bundles = bundles;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBundlesResponseBody build() {
            return new DescribeBundlesResponseBody(this);
        } 

    } 

    public static class DesktopTypeAttribute extends TeaModel {
        @NameInMap("CpuCount")
        private Integer cpuCount;

        @NameInMap("GpuCount")
        private Float gpuCount;

        @NameInMap("GpuSpec")
        private String gpuSpec;

        @NameInMap("MemorySize")
        private Integer memorySize;

        private DesktopTypeAttribute(Builder builder) {
            this.cpuCount = builder.cpuCount;
            this.gpuCount = builder.gpuCount;
            this.gpuSpec = builder.gpuSpec;
            this.memorySize = builder.memorySize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopTypeAttribute create() {
            return builder().build();
        }

        /**
         * @return cpuCount
         */
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        /**
         * @return gpuCount
         */
        public Float getGpuCount() {
            return this.gpuCount;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return memorySize
         */
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public static final class Builder {
            private Integer cpuCount; 
            private Float gpuCount; 
            private String gpuSpec; 
            private Integer memorySize; 

            /**
             * CpuCount.
             */
            public Builder cpuCount(Integer cpuCount) {
                this.cpuCount = cpuCount;
                return this;
            }

            /**
             * GpuCount.
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * GpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            public DesktopTypeAttribute build() {
                return new DesktopTypeAttribute(this);
            } 

        } 

    }
    public static class Disks extends TeaModel {
        @NameInMap("DiskPerformanceLevel")
        private String diskPerformanceLevel;

        @NameInMap("DiskSize")
        private Integer diskSize;

        @NameInMap("DiskType")
        private String diskType;

        private Disks(Builder builder) {
            this.diskPerformanceLevel = builder.diskPerformanceLevel;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return diskPerformanceLevel
         */
        public String getDiskPerformanceLevel() {
            return this.diskPerformanceLevel;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        public static final class Builder {
            private String diskPerformanceLevel; 
            private Integer diskSize; 
            private String diskType; 

            /**
             * DiskPerformanceLevel.
             */
            public Builder diskPerformanceLevel(String diskPerformanceLevel) {
                this.diskPerformanceLevel = diskPerformanceLevel;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
    public static class Bundles extends TeaModel {
        @NameInMap("BundleId")
        private String bundleId;

        @NameInMap("BundleName")
        private String bundleName;

        @NameInMap("BundleType")
        private String bundleType;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DesktopType")
        private String desktopType;

        @NameInMap("DesktopTypeAttribute")
        private DesktopTypeAttribute desktopTypeAttribute;

        @NameInMap("DesktopTypeFamily")
        private String desktopTypeFamily;

        @NameInMap("Disks")
        private java.util.List < Disks> disks;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("Language")
        private String language;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("SessionType")
        private String sessionType;

        @NameInMap("StockState")
        private String stockState;

        @NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @NameInMap("VolumeEncryptionKey")
        private String volumeEncryptionKey;

        private Bundles(Builder builder) {
            this.bundleId = builder.bundleId;
            this.bundleName = builder.bundleName;
            this.bundleType = builder.bundleType;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.desktopType = builder.desktopType;
            this.desktopTypeAttribute = builder.desktopTypeAttribute;
            this.desktopTypeFamily = builder.desktopTypeFamily;
            this.disks = builder.disks;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.language = builder.language;
            this.osType = builder.osType;
            this.platform = builder.platform;
            this.protocolType = builder.protocolType;
            this.sessionType = builder.sessionType;
            this.stockState = builder.stockState;
            this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
            this.volumeEncryptionKey = builder.volumeEncryptionKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bundles create() {
            return builder().build();
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return bundleName
         */
        public String getBundleName() {
            return this.bundleName;
        }

        /**
         * @return bundleType
         */
        public String getBundleType() {
            return this.bundleType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return desktopType
         */
        public String getDesktopType() {
            return this.desktopType;
        }

        /**
         * @return desktopTypeAttribute
         */
        public DesktopTypeAttribute getDesktopTypeAttribute() {
            return this.desktopTypeAttribute;
        }

        /**
         * @return desktopTypeFamily
         */
        public String getDesktopTypeFamily() {
            return this.desktopTypeFamily;
        }

        /**
         * @return disks
         */
        public java.util.List < Disks> getDisks() {
            return this.disks;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return sessionType
         */
        public String getSessionType() {
            return this.sessionType;
        }

        /**
         * @return stockState
         */
        public String getStockState() {
            return this.stockState;
        }

        /**
         * @return volumeEncryptionEnabled
         */
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        /**
         * @return volumeEncryptionKey
         */
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

        public static final class Builder {
            private String bundleId; 
            private String bundleName; 
            private String bundleType; 
            private String creationTime; 
            private String description; 
            private String desktopType; 
            private DesktopTypeAttribute desktopTypeAttribute; 
            private String desktopTypeFamily; 
            private java.util.List < Disks> disks; 
            private String imageId; 
            private String imageName; 
            private String language; 
            private String osType; 
            private String platform; 
            private String protocolType; 
            private String sessionType; 
            private String stockState; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 

            /**
             * BundleId.
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * BundleName.
             */
            public Builder bundleName(String bundleName) {
                this.bundleName = bundleName;
                return this;
            }

            /**
             * BundleType.
             */
            public Builder bundleType(String bundleType) {
                this.bundleType = bundleType;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DesktopType.
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * DesktopTypeAttribute.
             */
            public Builder desktopTypeAttribute(DesktopTypeAttribute desktopTypeAttribute) {
                this.desktopTypeAttribute = desktopTypeAttribute;
                return this;
            }

            /**
             * DesktopTypeFamily.
             */
            public Builder desktopTypeFamily(String desktopTypeFamily) {
                this.desktopTypeFamily = desktopTypeFamily;
                return this;
            }

            /**
             * Disks.
             */
            public Builder disks(java.util.List < Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * SessionType.
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * StockState.
             */
            public Builder stockState(String stockState) {
                this.stockState = stockState;
                return this;
            }

            /**
             * VolumeEncryptionEnabled.
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * VolumeEncryptionKey.
             */
            public Builder volumeEncryptionKey(String volumeEncryptionKey) {
                this.volumeEncryptionKey = volumeEncryptionKey;
                return this;
            }

            public Bundles build() {
                return new Bundles(this);
            } 

        } 

    }
}
