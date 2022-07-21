// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImageItem} extends {@link TeaModel}
 *
 * <p>ImageItem</p>
 */
public class ImageItem extends TeaModel {
    @NameInMap("AcceleratorType")
    private String acceleratorType;

    @NameInMap("AuthorId")
    private String authorId;

    @NameInMap("Framework")
    private String framework;

    @NameInMap("ImageProviderType")
    private String imageProviderType;

    @NameInMap("ImageTag")
    private String imageTag;

    @NameInMap("ImageUrl")
    private String imageUrl;

    @NameInMap("ImageUrlVpc")
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

        /**
         * 加速器类型
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * 镜像作者
         */
        public Builder authorId(String authorId) {
            this.authorId = authorId;
            return this;
        }

        /**
         * 镜像包含的框架类型
         */
        public Builder framework(String framework) {
            this.framework = framework;
            return this;
        }

        /**
         * 镜像类型
         */
        public Builder imageProviderType(String imageProviderType) {
            this.imageProviderType = imageProviderType;
            return this;
        }

        /**
         * 镜像Tag
         */
        public Builder imageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }

        /**
         * 镜像地址
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * 镜像vpc地址
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
