// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderRequest} extends {@link RequestModel}
 *
 * <p>QueryOrderRequest</p>
 */
public class QueryOrderRequest extends Request {
    @Query
    @NameInMap("ClusterBizId")
    private String clusterBizId;

    private QueryOrderRequest(Builder builder) {
        super(builder);
        this.clusterBizId = builder.clusterBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderRequest create() {
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

    public static final class Builder extends Request.Builder<QueryOrderRequest, Builder> {
        private String clusterBizId; 

        private Builder() {
            super();
        } 

        private Builder(QueryOrderRequest request) {
            super(request);
            this.clusterBizId = request.clusterBizId;
        } 

        /**
         * ClusterBizId.
         */
        public Builder clusterBizId(String clusterBizId) {
            this.putQueryParameter("ClusterBizId", clusterBizId);
            this.clusterBizId = clusterBizId;
            return this;
        }

        @Override
        public QueryOrderRequest build() {
            return new QueryOrderRequest(this);
        } 

    } 

}
