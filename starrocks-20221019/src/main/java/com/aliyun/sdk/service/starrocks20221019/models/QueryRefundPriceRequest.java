// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link QueryRefundPriceRequest} extends {@link RequestModel}
 *
 * <p>QueryRefundPriceRequest</p>
 */
public class QueryRefundPriceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("billingInstanceIds")
    private String billingInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    private QueryRefundPriceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.billingInstanceIds = builder.billingInstanceIds;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRefundPriceRequest create() {
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
     * @return billingInstanceIds
     */
    public String getBillingInstanceIds() {
        return this.billingInstanceIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<QueryRefundPriceRequest, Builder> {
        private String regionId; 
        private String billingInstanceIds; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRefundPriceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.billingInstanceIds = request.billingInstanceIds;
            this.instanceId = request.instanceId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * billingInstanceIds.
         */
        public Builder billingInstanceIds(String billingInstanceIds) {
            this.putQueryParameter("billingInstanceIds", billingInstanceIds);
            this.billingInstanceIds = billingInstanceIds;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public QueryRefundPriceRequest build() {
            return new QueryRefundPriceRequest(this);
        } 

    } 

}
