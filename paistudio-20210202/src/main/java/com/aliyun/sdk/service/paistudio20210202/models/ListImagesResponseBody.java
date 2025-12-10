// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListImagesResponseBody(Builder builder) {
        this.images = builder.images;
        this.totalCount = builder.totalCount;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Images> images; 
        private Long totalCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListImagesResponseBody model) {
            this.images = model.images;
            this.totalCount = model.totalCount;
            this.requestId = model.requestId;
        } 

        /**
         * Images.
         */
        public Builder images(java.util.List<Images> images) {
            this.images = images;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * requestId.
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
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListImagesResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageUri")
        private String imageUri;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Images(Builder builder) {
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.imageId = builder.imageId;
            this.imageUri = builder.imageUri;
            this.labels = builder.labels;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageUri
         */
        public String getImageUri() {
            return this.imageUri;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String gmtCreateTime; 
            private String imageId; 
            private String imageUri; 
            private java.util.List<Labels> labels; 
            private String name; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.description = model.description;
                this.gmtCreateTime = model.gmtCreateTime;
                this.imageId = model.imageId;
                this.imageUri = model.imageUri;
                this.labels = model.labels;
                this.name = model.name;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
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
             * ImageUri.
             */
            public Builder imageUri(String imageUri) {
                this.imageUri = imageUri;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
