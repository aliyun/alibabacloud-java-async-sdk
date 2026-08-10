// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link UpdateMetaLogRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetaLogRequest</p>
 */
public class UpdateMetaLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryRegion")
    private String deliveryRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Storage")
    private Long storage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    private UpdateMetaLogRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.deliveryRegion = builder.deliveryRegion;
        this.storage = builder.storage;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetaLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return deliveryRegion
     */
    public String getDeliveryRegion() {
        return this.deliveryRegion;
    }

    /**
     * @return storage
     */
    public Long getStorage() {
        return this.storage;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<UpdateMetaLogRequest, Builder> {
        private String commodityCode; 
        private String deliveryRegion; 
        private Long storage; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetaLogRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.deliveryRegion = request.deliveryRegion;
            this.storage = request.storage;
            this.ttl = request.ttl;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * DeliveryRegion.
         */
        public Builder deliveryRegion(String deliveryRegion) {
            this.putQueryParameter("DeliveryRegion", deliveryRegion);
            this.deliveryRegion = deliveryRegion;
            return this;
        }

        /**
         * Storage.
         */
        public Builder storage(Long storage) {
            this.putQueryParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public UpdateMetaLogRequest build() {
            return new UpdateMetaLogRequest(this);
        } 

    } 

}
