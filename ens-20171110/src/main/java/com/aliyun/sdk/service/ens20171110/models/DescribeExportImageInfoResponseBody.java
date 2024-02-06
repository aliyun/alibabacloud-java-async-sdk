// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportImageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExportImageInfoResponseBody</p>
 */
public class DescribeExportImageInfoResponseBody extends TeaModel {
    @NameInMap("Images")
    private Images images;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeExportImageInfoResponseBody(Builder builder) {
        this.images = builder.images;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExportImageInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return images
     */
    public Images getImages() {
        return this.images;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Images images; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The returned result. For more information, see the Images parameter described in the JSON-formatted sample success response.
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeExportImageInfoResponseBody build() {
            return new DescribeExportImageInfoResponseBody(this);
        } 

    } 

    public static class Image extends TeaModel {
        @NameInMap("Architecture")
        private String architecture;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("ExportedImageURL")
        private String exportedImageURL;

        @NameInMap("ImageExportStatus")
        private String imageExportStatus;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("Platform")
        private String platform;

        private Image(Builder builder) {
            this.architecture = builder.architecture;
            this.creationTime = builder.creationTime;
            this.exportedImageURL = builder.exportedImageURL;
            this.imageExportStatus = builder.imageExportStatus;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.platform = builder.platform;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return exportedImageURL
         */
        public String getExportedImageURL() {
            return this.exportedImageURL;
        }

        /**
         * @return imageExportStatus
         */
        public String getImageExportStatus() {
            return this.imageExportStatus;
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
         * @return imageOwnerAlias
         */
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        public static final class Builder {
            private String architecture; 
            private String creationTime; 
            private String exportedImageURL; 
            private String imageExportStatus; 
            private String imageId; 
            private String imageName; 
            private String imageOwnerAlias; 
            private String platform; 

            /**
             * The architecture of the image. Example: **x86\_64**.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
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
             * The URL of the exported image.
             */
            public Builder exportedImageURL(String exportedImageURL) {
                this.exportedImageURL = exportedImageURL;
                return this;
            }

            /**
             * The export status of the image. Valid values:
             * <p>
             * 
             * *   Exporting
             * *   Exported
             * *   ExportError
             * *   Unexported
             */
            public Builder imageExportStatus(String imageExportStatus) {
                this.imageExportStatus = imageExportStatus;
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
             * The name of the image.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The source of the image. Valid values:
             * <p>
             * 
             * *   system: public image
             * *   self: custom image
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * The OS.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    public static class Images extends TeaModel {
        @NameInMap("Image")
        private java.util.List < Image> image;

        private Images(Builder builder) {
            this.image = builder.image;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public java.util.List < Image> getImage() {
            return this.image;
        }

        public static final class Builder {
            private java.util.List < Image> image; 

            /**
             * Image.
             */
            public Builder image(java.util.List < Image> image) {
                this.image = image;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
