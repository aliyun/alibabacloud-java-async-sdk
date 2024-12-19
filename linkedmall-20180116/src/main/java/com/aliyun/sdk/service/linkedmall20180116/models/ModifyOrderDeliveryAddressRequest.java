// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ModifyOrderDeliveryAddressRequest} extends {@link RequestModel}
 *
 * <p>ModifyOrderDeliveryAddressRequest</p>
 */
public class ModifyOrderDeliveryAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtJson")
    private String extJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LmOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long lmOrderId;

    private ModifyOrderDeliveryAddressRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.deliveryAddress = builder.deliveryAddress;
        this.extJson = builder.extJson;
        this.lmOrderId = builder.lmOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOrderDeliveryAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return deliveryAddress
     */
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /**
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    /**
     * @return lmOrderId
     */
    public Long getLmOrderId() {
        return this.lmOrderId;
    }

    public static final class Builder extends Request.Builder<ModifyOrderDeliveryAddressRequest, Builder> {
        private String bizId; 
        private String deliveryAddress; 
        private String extJson; 
        private Long lmOrderId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOrderDeliveryAddressRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.deliveryAddress = request.deliveryAddress;
            this.extJson = request.extJson;
            this.lmOrderId = request.lmOrderId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20190325****</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deliveryAddress(String deliveryAddress) {
            this.putQueryParameter("DeliveryAddress", deliveryAddress);
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        /**
         * ExtJson.
         */
        public Builder extJson(String extJson) {
            this.putQueryParameter("ExtJson", extJson);
            this.extJson = extJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>53396****</p>
         */
        public Builder lmOrderId(Long lmOrderId) {
            this.putQueryParameter("LmOrderId", lmOrderId);
            this.lmOrderId = lmOrderId;
            return this;
        }

        @Override
        public ModifyOrderDeliveryAddressRequest build() {
            return new ModifyOrderDeliveryAddressRequest(this);
        } 

    } 

}
