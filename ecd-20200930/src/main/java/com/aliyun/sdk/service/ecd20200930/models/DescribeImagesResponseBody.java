// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagesResponseBody</p>
 */
public class DescribeImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List<Images> images;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return images
     */
    public java.util.List<Images> getImages() {
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
        private java.util.List<Images> images; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeImagesResponseBody model) {
            this.images = model.images;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The collection of image information.</p>
         */
        public Builder images(java.util.List<Images> images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The pagination token for the next query. An empty value indicates that there is no next page.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4636DBE0-BBB4-4076-8B8E-94D21A9A3CFB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImagesResponseBody build() {
            return new DescribeImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagesResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GpuCategory")
        private Boolean gpuCategory;

        @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("SessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("SharedCount")
        private Integer sharedCount;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportedLanguages")
        private java.util.List<String> supportedLanguages;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionKey")
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
        public java.util.List<String> getSupportedLanguages() {
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
            private java.util.List<String> supportedLanguages; 
            private String updateTime; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.appVersion = model.appVersion;
                this.creationTime = model.creationTime;
                this.dataDiskSize = model.dataDiskSize;
                this.description = model.description;
                this.gpuCategory = model.gpuCategory;
                this.gpuDriverVersion = model.gpuDriverVersion;
                this.imageId = model.imageId;
                this.imageType = model.imageType;
                this.name = model.name;
                this.osType = model.osType;
                this.platform = model.platform;
                this.progress = model.progress;
                this.protocolType = model.protocolType;
                this.sessionType = model.sessionType;
                this.sharedCount = model.sharedCount;
                this.size = model.size;
                this.status = model.status;
                this.supportedLanguages = model.supportedLanguages;
                this.updateTime = model.updateTime;
                this.volumeEncryptionEnabled = model.volumeEncryptionEnabled;
                this.volumeEncryptionKey = model.volumeEncryptionKey;
            } 

            /**
             * <p>The image version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The time when the image was created. The time is in the ISO 8601 standard in the UTC format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-10T01:01:10Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The data cloud disk size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * <p>The image description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether the image is a GPU image.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder gpuCategory(Boolean gpuCategory) {
                this.gpuCategory = gpuCategory;
                return this;
            }

            /**
             * <p>The GPU driver version.</p>
             * 
             * <strong>example:</strong>
             * <p>417.22</p>
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-gx2x1dhsmusr2****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image type.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>testImageName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The operating system type.</p>
             * 
             * <strong>example:</strong>
             * <p>WINDOWS</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The operating system type of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows Server 2019</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The progress of image creation. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The session type of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>MULTIPLE_SESSION</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * <p>The number of shared images.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sharedCount(Integer sharedCount) {
                this.sharedCount = sharedCount;
                return this;
            }

            /**
             * <p>The image size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The image status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The operating system language.</p>
             */
            public Builder supportedLanguages(java.util.List<String> supportedLanguages) {
                this.supportedLanguages = supportedLanguages;
                return this;
            }

            /**
             * <p>The time when the image was last modified. The time is in the ISO 8601 standard in the UTC format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-22T02:48:43Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Indicates whether disk encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * <p>The ID of the KMS key used for disk encryption. You can call <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> to obtain the key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
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
