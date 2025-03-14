// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ShopCreateRequest} extends {@link RequestModel}
 *
 * <p>ShopCreateRequest</p>
 */
public class ShopCreateRequest extends Request {
    @com.aliyun.core.annotation.NameInMap("afterSaleDingTalkId")
    private String afterSaleDingTalkId;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 500)
    private String description;

    @com.aliyun.core.annotation.NameInMap("operatorDingTalkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatorDingTalkId;

    @com.aliyun.core.annotation.NameInMap("preSaleDingTalkId")
    private String preSaleDingTalkId;

    @com.aliyun.core.annotation.NameInMap("shopName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100)
    private String shopName;

    private ShopCreateRequest(Builder builder) {
        super(builder);
        this.afterSaleDingTalkId = builder.afterSaleDingTalkId;
        this.description = builder.description;
        this.operatorDingTalkId = builder.operatorDingTalkId;
        this.preSaleDingTalkId = builder.preSaleDingTalkId;
        this.shopName = builder.shopName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShopCreateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return afterSaleDingTalkId
     */
    public String getAfterSaleDingTalkId() {
        return this.afterSaleDingTalkId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return operatorDingTalkId
     */
    public String getOperatorDingTalkId() {
        return this.operatorDingTalkId;
    }

    /**
     * @return preSaleDingTalkId
     */
    public String getPreSaleDingTalkId() {
        return this.preSaleDingTalkId;
    }

    /**
     * @return shopName
     */
    public String getShopName() {
        return this.shopName;
    }

    public static final class Builder extends Request.Builder<ShopCreateRequest, Builder> {
        private String afterSaleDingTalkId; 
        private String description; 
        private String operatorDingTalkId; 
        private String preSaleDingTalkId; 
        private String shopName; 

        private Builder() {
            super();
        } 

        private Builder(ShopCreateRequest request) {
            super(request);
            this.afterSaleDingTalkId = request.afterSaleDingTalkId;
            this.description = request.description;
            this.operatorDingTalkId = request.operatorDingTalkId;
            this.preSaleDingTalkId = request.preSaleDingTalkId;
            this.shopName = request.shopName;
        } 

        /**
         * afterSaleDingTalkId.
         */
        public Builder afterSaleDingTalkId(String afterSaleDingTalkId) {
            this.afterSaleDingTalkId = afterSaleDingTalkId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>店铺描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12344335</p>
         */
        public Builder operatorDingTalkId(String operatorDingTalkId) {
            this.operatorDingTalkId = operatorDingTalkId;
            return this;
        }

        /**
         * preSaleDingTalkId.
         */
        public Builder preSaleDingTalkId(String preSaleDingTalkId) {
            this.preSaleDingTalkId = preSaleDingTalkId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>店铺名称</p>
         */
        public Builder shopName(String shopName) {
            this.shopName = shopName;
            return this;
        }

        @Override
        public ShopCreateRequest build() {
            return new ShopCreateRequest(this);
        } 

    } 

}
