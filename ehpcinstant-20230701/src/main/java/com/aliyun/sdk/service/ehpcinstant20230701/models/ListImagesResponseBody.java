// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListImagesResponseBody(Builder builder) {
        this.images = builder.images;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return images
     */
    public java.util.List<Images> getImages() {
        return this.images;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Images> images; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Images.
         */
        public Builder images(java.util.List<Images> images) {
            this.images = images;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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
        @com.aliyun.core.annotation.NameInMap("AppId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DocumentId")
        private Integer documentId;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Images(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.documentId = builder.documentId;
            this.imageId = builder.imageId;
            this.imageType = builder.imageType;
            this.name = builder.name;
            this.osTag = builder.osTag;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return documentId
         */
        public Integer getDocumentId() {
            return this.documentId;
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
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String appId; 
            private String createTime; 
            private String description; 
            private Integer documentId; 
            private String imageId; 
            private String imageType; 
            private String name; 
            private String osTag; 
            private String updateTime; 
            private String version; 
            private Integer weight; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * DocumentId.
             */
            public Builder documentId(Integer documentId) {
                this.documentId = documentId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp181x855551ww5yq****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>VM</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OsTag.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
