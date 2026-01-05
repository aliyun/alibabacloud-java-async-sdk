// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link UpdateProductRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductRequest</p>
 */
public class UpdateProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
    private String productName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
    private String providerName;

    private UpdateProductRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.providerName = builder.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return providerName
     */
    public String getProviderName() {
        return this.providerName;
    }

    public static final class Builder extends Request.Builder<UpdateProductRequest, Builder> {
        private String description; 
        private String productId; 
        private String productName; 
        private String providerName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductRequest request) {
            super(request);
            this.description = request.description;
            this.productId = request.productId;
            this.productName = request.productName;
            this.providerName = request.providerName;
        } 

        /**
         * <p>产品描述</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-bp18r7q127****</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>代表资源名称的资源属性字段</p>
         * <p>This parameter is required.</p>
         */
        public Builder productName(String productName) {
            this.putBodyParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * <p>产品提供方</p>
         * <p>This parameter is required.</p>
         */
        public Builder providerName(String providerName) {
            this.putBodyParameter("ProviderName", providerName);
            this.providerName = providerName;
            return this;
        }

        @Override
        public UpdateProductRequest build() {
            return new UpdateProductRequest(this);
        } 

    } 

}
