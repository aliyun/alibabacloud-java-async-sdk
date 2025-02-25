// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshTaobaoItemRequest} extends {@link RequestModel}
 *
 * <p>RefreshTaobaoItemRequest</p>
 */
public class RefreshTaobaoItemRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OuterId")
    private String outerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkuId")
    private String skuId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaobaoItemId")
    private String taobaoItemId;

    private RefreshTaobaoItemRequest(Builder builder) {
        super(builder);
        this.outerId = builder.outerId;
        this.skuId = builder.skuId;
        this.storeId = builder.storeId;
        this.taobaoItemId = builder.taobaoItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshTaobaoItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outerId
     */
    public String getOuterId() {
        return this.outerId;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return taobaoItemId
     */
    public String getTaobaoItemId() {
        return this.taobaoItemId;
    }

    public static final class Builder extends Request.Builder<RefreshTaobaoItemRequest, Builder> {
        private String outerId; 
        private String skuId; 
        private String storeId; 
        private String taobaoItemId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshTaobaoItemRequest request) {
            super(request);
            this.outerId = request.outerId;
            this.skuId = request.skuId;
            this.storeId = request.storeId;
            this.taobaoItemId = request.taobaoItemId;
        } 

        /**
         * OuterId.
         */
        public Builder outerId(String outerId) {
            this.putBodyParameter("OuterId", outerId);
            this.outerId = outerId;
            return this;
        }

        /**
         * SkuId.
         */
        public Builder skuId(String skuId) {
            this.putBodyParameter("SkuId", skuId);
            this.skuId = skuId;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * TaobaoItemId.
         */
        public Builder taobaoItemId(String taobaoItemId) {
            this.putBodyParameter("TaobaoItemId", taobaoItemId);
            this.taobaoItemId = taobaoItemId;
            return this;
        }

        @Override
        public RefreshTaobaoItemRequest build() {
            return new RefreshTaobaoItemRequest(this);
        } 

    } 

}
