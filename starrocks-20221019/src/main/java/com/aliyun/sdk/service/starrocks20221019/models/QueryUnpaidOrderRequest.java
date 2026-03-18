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
 * {@link QueryUnpaidOrderRequest} extends {@link RequestModel}
 *
 * <p>QueryUnpaidOrderRequest</p>
 */
public class QueryUnpaidOrderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 30)
    private String billingInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 30)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    private QueryUnpaidOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.billingInstanceId = builder.billingInstanceId;
        this.instanceId = builder.instanceId;
        this.orderType = builder.orderType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUnpaidOrderRequest create() {
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
     * @return billingInstanceId
     */
    public String getBillingInstanceId() {
        return this.billingInstanceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    public static final class Builder extends Request.Builder<QueryUnpaidOrderRequest, Builder> {
        private String regionId; 
        private String billingInstanceId; 
        private String instanceId; 
        private String orderType; 

        private Builder() {
            super();
        } 

        private Builder(QueryUnpaidOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.billingInstanceId = request.billingInstanceId;
            this.instanceId = request.instanceId;
            this.orderType = request.orderType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-12zxs328sha2</p>
         */
        public Builder billingInstanceId(String billingInstanceId) {
            this.putQueryParameter("BillingInstanceId", billingInstanceId);
            this.billingInstanceId = billingInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        @Override
        public QueryUnpaidOrderRequest build() {
            return new QueryUnpaidOrderRequest(this);
        } 

    } 

}
