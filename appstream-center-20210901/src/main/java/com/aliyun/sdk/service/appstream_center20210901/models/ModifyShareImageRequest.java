// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyShareImageRequest} extends {@link RequestModel}
 *
 * <p>ModifyShareImageRequest</p>
 */
public class ModifyShareImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddAccount")
    private java.util.List<Long> addAccount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemoveAccount")
    private java.util.List<Long> removeAccount;

    private ModifyShareImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addAccount = builder.addAccount;
        this.bizType = builder.bizType;
        this.imageId = builder.imageId;
        this.productType = builder.productType;
        this.removeAccount = builder.removeAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyShareImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return addAccount
     */
    public java.util.List<Long> getAddAccount() {
        return this.addAccount;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return removeAccount
     */
    public java.util.List<Long> getRemoveAccount() {
        return this.removeAccount;
    }

    public static final class Builder extends Request.Builder<ModifyShareImageRequest, Builder> {
        private String regionId; 
        private java.util.List<Long> addAccount; 
        private Integer bizType; 
        private String imageId; 
        private String productType; 
        private java.util.List<Long> removeAccount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyShareImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addAccount = request.addAccount;
            this.bizType = request.bizType;
            this.imageId = request.imageId;
            this.productType = request.productType;
            this.removeAccount = request.removeAccount;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IDs of the Alibaba Cloud accounts to share the image with.</p>
         */
        public Builder addAccount(java.util.List<Long> addAccount) {
            this.putBodyParameter("AddAccount", addAccount);
            this.addAccount = addAccount;
            return this;
        }

        /**
         * <p>The business line. Only the Enterprise Edition scenario is supported. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The ID of the source image.</p>
         * 
         * <strong>example:</strong>
         * <p>img-bp13mu****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The product type, such as Cloud Desktop, cloud application, or workstation.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The IDs of the Alibaba Cloud accounts to remove from the image sharing list.</p>
         */
        public Builder removeAccount(java.util.List<Long> removeAccount) {
            this.putBodyParameter("RemoveAccount", removeAccount);
            this.removeAccount = removeAccount;
            return this;
        }

        @Override
        public ModifyShareImageRequest build() {
            return new ModifyShareImageRequest(this);
        } 

    } 

}
