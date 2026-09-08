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
         * <p>The type of the image accelerator. Valid values:</p>
         * <ul>
         * <li>cpu</li>
         * <li>gpu</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gpu</p>
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * <p>The creator of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>ken</p>
         */
        public Builder authorId(String authorId) {
            this.authorId = authorId;
            return this;
        }

        /**
         * <p>The computing framework that is encapsulated by the image. Valid values:</p>
         * <ul>
         * <li>TFJob</li>
         * <li>PyTorchJob</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PyTorchJob</p>
         */
        public Builder framework(String framework) {
            this.framework = framework;
            return this;
        }

        /**
         * <p>The image type. Valid values:</p>
         * <ul>
         * <li>Community</li>
         * <li>PAI</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Community</p>
         */
        public Builder imageProviderType(String imageProviderType) {
            this.imageProviderType = imageProviderType;
            return this;
        }

        /**
         * <p>The tag of the docker image.</p>
         * 
         * <strong>example:</strong>
         * <p>tensorflow-training:2.3-cpu-py36-ubuntu18.04</p>
         */
        public Builder imageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }

        /**
         * <p>The image URL address.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-beijing.aliyuncs.com/pai-dlc/tensorflow-training:2.3-cpu-py36-ubuntu18.04</p>
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The VPC endpoint of the image URL. This address provides faster access speed.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-beijing.aliyuncs.com/pai-dlc/tensorflow-training:2.3-cpu-py36-ubuntu18.04</p>
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
