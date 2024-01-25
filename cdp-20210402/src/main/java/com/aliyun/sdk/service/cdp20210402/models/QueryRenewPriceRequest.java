// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRenewPriceRequest} extends {@link RequestModel}
 *
 * <p>QueryRenewPriceRequest</p>
 */
public class QueryRenewPriceRequest extends Request {
    @Query
    @NameInMap("ClusterBizId")
    @Validation(required = true)
    private String clusterBizId;

    @Query
    @NameInMap("Instances")
    @Validation(required = true)
    private String instances;

    private QueryRenewPriceRequest(Builder builder) {
        super(builder);
        this.clusterBizId = builder.clusterBizId;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRenewPriceRequest create() {
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
     * @return instances
     */
    public String getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<QueryRenewPriceRequest, Builder> {
        private String clusterBizId; 
        private String instances; 

        private Builder() {
            super();
        } 

        private Builder(QueryRenewPriceRequest request) {
            super(request);
            this.clusterBizId = request.clusterBizId;
            this.instances = request.instances;
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
         * Instances.
         */
        public Builder instances(String instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public QueryRenewPriceRequest build() {
            return new QueryRenewPriceRequest(this);
        } 

    } 

}
