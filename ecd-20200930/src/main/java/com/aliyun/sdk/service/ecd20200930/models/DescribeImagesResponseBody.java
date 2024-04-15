// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagesResponseBody</p>
 */
public class DescribeImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    private java.util.List < Images> images;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeImagesResponseBody(Builder builder) {
        this.images = builder.images;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return images
     */
    public java.util.List < Images> getImages() {
        return this.images;
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
        private java.util.List < Images> images; 
        private String nextToken; 
        private String requestId; 

        /**
         * The details of the images.
         */
        public Builder images(java.util.List < Images> images) {
            this.images = images;
            return this;
        }

        /**
         * The token that determines the start point of the next query. If this parameter is empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImagesResponseBody build() {
            return new DescribeImagesResponseBody(this);
        } 

    } 

    public static class Images extends TeaModel {
        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        @NameInMap("Description")
        private String description;

        @NameInMap("GpuCategory")
        private Boolean gpuCategory;

        @NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageType")
        private String imageType;

        @NameInMap("Name")
        private String name;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("SessionType")
        private String sessionType;

        @NameInMap("SharedCount")
        private Integer sharedCount;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupportedLanguages")
        private java.util.List < String > supportedLanguages;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @NameInMap("VolumeEncryptionKey")
        private String volumeEncryptionKey;

        private Images(Builder builder) {
            this.appVersion = builder.appVersion;
            this.creationTime = builder.creationTime;
            this.dataDiskSize = builder.dataDiskSize;
            this.description = builder.description;
            this.gpuCategory = builder.gpuCategory;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.imageId = builder.imageId;
            this.imageType = builder.imageType;
            this.name = builder.name;
            this.osType = builder.osType;
            this.platform = builder.platform;
            this.progress = builder.progress;
            this.protocolType = builder.protocolType;
            this.sessionType = builder.sessionType;
            this.sharedCount = builder.sharedCount;
            this.size = builder.size;
            this.status = builder.status;
            this.supportedLanguages = builder.supportedLanguages;
            this.updateTime = builder.updateTime;
            this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
            this.volumeEncryptionKey = builder.volumeEncryptionKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gpuCategory
         */
        public Boolean getGpuCategory() {
            return this.gpuCategory;
        }

        /**
         * @return gpuDriverVersion
         */
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return progress
         */
        public String getProgress() {
            return this.progress;
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
         * @return sharedCount
         */
        public Integer getSharedCount() {
            return this.sharedCount;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportedLanguages
         */
        public java.util.List < String > getSupportedLanguages() {
            return this.supportedLanguages;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
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
            private String appVersion; 
            private String creationTime; 
            private Integer dataDiskSize; 
            private String description; 
            private Boolean gpuCategory; 
            private String gpuDriverVersion; 
            private String imageId; 
            private String imageType; 
            private String name; 
            private String osType; 
            private String platform; 
            private String progress; 
            private String protocolType; 
            private String sessionType; 
            private Integer sharedCount; 
            private Integer size; 
            private String status; 
            private java.util.List < String > supportedLanguages; 
            private String updateTime; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 

            /**
             * The version of the image.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * The time when the image was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The size of the data disk. Unit: GiB.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * The description of the image.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the image is a GPU-accelerated image.
             */
            public Builder gpuCategory(Boolean gpuCategory) {
                this.gpuCategory = gpuCategory;
                return this;
            }

            /**
             * The version number of the GPU driver.
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The type of the image.
             * <p>
             * 
             * Valid values:
             * 
             * *   SYSTEM
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   CUSTOM
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * The name of the image.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the operating system.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The operating system type of the image.
             * <p>
             * 
             * Valid values:
             * 
             * *   Ubuntu
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Windows Server 2022
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   UOS
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   CentOS
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Windows Server 2019
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   SQL Server 2016
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Windows 10
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The creation progress of the image. Unit: %.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The protocol type.
             * <p>
             * 
             * Valid values:
             * 
             * *   HDX: High-definition Experience (HDX) protocol
             * *   ASP: in-house Adaptive Streaming Protocol (ASP) (recommended)
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The type of the image session.
             * <p>
             * 
             * Valid values:
             * 
             * *   SINGLE_SESSION: single-session image.
             * 
             * *   MULTIPLE_SESSION: multi-session image.
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * The number of shared images.
             */
            public Builder sharedCount(Integer sharedCount) {
                this.sharedCount = sharedCount;
                return this;
            }

            /**
             * The size of the image. Unit: GiB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The status of the image.
             * <p>
             * 
             * Valid values:
             * 
             * *   Creating
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Available
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   CreateFailed
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The languages of the operating system.
             */
            public Builder supportedLanguages(java.util.List < String > supportedLanguages) {
                this.supportedLanguages = supportedLanguages;
                return this;
            }

            /**
             * The time when the image was last modified.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Indicates whether disk encryption is enabled.
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to query the list of KMS keys.
             */
            public Builder volumeEncryptionKey(String volumeEncryptionKey) {
                this.volumeEncryptionKey = volumeEncryptionKey;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
