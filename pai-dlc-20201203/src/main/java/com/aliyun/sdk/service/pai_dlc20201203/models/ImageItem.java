// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ImageItem} extends {@link TeaModel}
 *
 * <p>ImageItem</p>
 */
public class ImageItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.NameInMap("AuthorId")
    private String authorId;

    @com.aliyun.core.annotation.NameInMap("Framework")
    private String framework;

    @com.aliyun.core.annotation.NameInMap("ImageProviderType")
    private String imageProviderType;

    @com.aliyun.core.annotation.NameInMap("ImageTag")
    private String imageTag;

    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("ImageUrlVpc")
    private String imageUrlVpc;

    private ImageItem(Builder builder) {
        this.acceleratorType = builder.acceleratorType;
        this.authorId = builder.authorId;
        this.framework = builder.framework;
        this.imageProviderType = builder.imageProviderType;
        this.imageTag = builder.imageTag;
        this.imageUrl = builder.imageUrl;
        this.imageUrlVpc = builder.imageUrlVpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * @return authorId
     */
    public String getAuthorId() {
        return this.authorId;
    }

    /**
     * @return framework
     */
    public String getFramework() {
        return this.framework;
    }

    /**
     * @return imageProviderType
     */
    public String getImageProviderType() {
        return this.imageProviderType;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return imageUrlVpc
     */
    public String getImageUrlVpc() {
        return this.imageUrlVpc;
    }

    public static final class Builder {
        private String acceleratorType; 
        private String authorId; 
        private String framework; 
        private String imageProviderType; 
        private String imageTag; 
        private String imageUrl; 
        private String imageUrlVpc; 

        private Builder() {
        } 

        private Builder(ImageItem model) {
            this.acceleratorType = model.acceleratorType;
            this.authorId = model.authorId;
            this.framework = model.framework;
            this.imageProviderType = model.imageProviderType;
            this.imageTag = model.imageTag;
            this.imageUrl = model.imageUrl;
            this.imageUrlVpc = model.imageUrlVpc;
        } 

        /**
         * AcceleratorType.
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * AuthorId.
         */
        public Builder authorId(String authorId) {
            this.authorId = authorId;
            return this;
        }

        /**
         * Framework.
         */
        public Builder framework(String framework) {
            this.framework = framework;
            return this;
        }

        /**
         * ImageProviderType.
         */
        public Builder imageProviderType(String imageProviderType) {
            this.imageProviderType = imageProviderType;
            return this;
        }

        /**
         * ImageTag.
         */
        public Builder imageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * ImageUrlVpc.
         */
        public Builder imageUrlVpc(String imageUrlVpc) {
            this.imageUrlVpc = imageUrlVpc;
            return this;
        }

        public ImageItem build() {
            return new ImageItem(this);
        } 

    } 

}
