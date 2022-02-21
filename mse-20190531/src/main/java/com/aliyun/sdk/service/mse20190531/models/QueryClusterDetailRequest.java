// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryClusterDetailRequest</p>
 */
public class QueryClusterDetailRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OrderId")
    private String orderId;

    private QueryClusterDetailRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder extends Request.Builder<QueryClusterDetailRequest, Builder> {
        private String instanceId; 
        private String orderId; 

        private Builder() {
            super();
        } 

        private Builder(QueryClusterDetailRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.orderId = response.orderId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public QueryClusterDetailRequest build() {
            return new QueryClusterDetailRequest(this);
        } 

    } 

}
