// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryScaleUpOrderRequest} extends {@link RequestModel}
 *
 * <p>QueryScaleUpOrderRequest</p>
 */
public class QueryScaleUpOrderRequest extends Request {
    @Query
    @NameInMap("ClusterBizId")
    @Validation(required = true)
    private String clusterBizId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private QueryScaleUpOrderRequest(Builder builder) {
        super(builder);
        this.clusterBizId = builder.clusterBizId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryScaleUpOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterBizId
     */
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<QueryScaleUpOrderRequest, Builder> {
        private String clusterBizId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryScaleUpOrderRequest request) {
            super(request);
            this.clusterBizId = request.clusterBizId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ClusterBizId.
         */
        public Builder clusterBizId(String clusterBizId) {
            this.putQueryParameter("ClusterBizId", clusterBizId);
            this.clusterBizId = clusterBizId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public QueryScaleUpOrderRequest build() {
            return new QueryScaleUpOrderRequest(this);
        } 

    } 

}
