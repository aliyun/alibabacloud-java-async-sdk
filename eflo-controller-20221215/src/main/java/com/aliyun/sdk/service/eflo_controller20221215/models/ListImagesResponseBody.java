// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListImagesResponseBody</p>
 */
public class ListImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List<Images> images;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListImagesResponseBody(Builder builder) {
        this.images = builder.images;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesResponseBody create() {
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

        private Builder(ListImagesResponseBody model) {
            this.images = model.images;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Image details</p>
         */
        public Builder images(java.util.List<Images> images) {
            this.images = images;
            return this;
        }

        /**
         * <p>NextToken for the next page, include this value when requesting the next page</p>
         * 
         * <strong>example:</strong>
         * <p>3a6b93229825ac667104463b56790c91</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0FC4A1C7-421C-5EAB-9361-4C0338EFA287</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListImagesResponseBody build() {
            return new ListImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListImagesResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Long nodeCount;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ReleaseFileMd5")
        private String releaseFileMd5;

        @com.aliyun.core.annotation.NameInMap("ReleaseFileSize")
        private Long releaseFileSize;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Images(Builder builder) {
            this.architecture = builder.architecture;
            this.description = builder.description;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageVersion = builder.imageVersion;
            this.nodeCount = builder.nodeCount;
            this.platform = builder.platform;
            this.releaseFileMd5 = builder.releaseFileMd5;
            this.releaseFileSize = builder.releaseFileSize;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return nodeCount
         */
        public Long getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return releaseFileMd5
         */
        public String getReleaseFileMd5() {
            return this.releaseFileMd5;
        }

        /**
         * @return releaseFileSize
         */
        public Long getReleaseFileSize() {
            return this.releaseFileSize;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String architecture; 
            private String description; 
            private String imageId; 
            private String imageName; 
            private String imageVersion; 
            private Long nodeCount; 
            private String platform; 
            private String releaseFileMd5; 
            private Long releaseFileSize; 
            private String type; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.architecture = model.architecture;
                this.description = model.description;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageVersion = model.imageVersion;
                this.nodeCount = model.nodeCount;
                this.platform = model.platform;
                this.releaseFileMd5 = model.releaseFileMd5;
                this.releaseFileSize = model.releaseFileSize;
                this.type = model.type;
            } 

            /**
             * <p>Architecture</p>
             * 
             * <strong>example:</strong>
             * <p>x86_64</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba cloud linux 3 full for H800</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Image ID</p>
             * 
             * <strong>example:</strong>
             * <p>i190951671671438639388</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>Image name</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.9_x86_64_FULL_20221110</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>Image version</p>
             * 
             * <strong>example:</strong>
             * <p>7.9</p>
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * <p>node count</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder nodeCount(Long nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>Platform</p>
             * 
             * <strong>example:</strong>
             * <p>ALinux3</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>File MD5</p>
             * 
             * <strong>example:</strong>
             * <p>40741292480fc6d778138adcf8c</p>
             */
            public Builder releaseFileMd5(String releaseFileMd5) {
                this.releaseFileMd5 = releaseFileMd5;
                return this;
            }

            /**
             * <p>Image size</p>
             * 
             * <strong>example:</strong>
             * <p>5.8G</p>
             */
            public Builder releaseFileSize(Long releaseFileSize) {
                this.releaseFileSize = releaseFileSize;
                return this;
            }

            /**
             * <p>image type</p>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
