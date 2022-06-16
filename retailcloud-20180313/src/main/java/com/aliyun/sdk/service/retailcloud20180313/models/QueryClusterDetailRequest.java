// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

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
    @NameInMap("ClusterInstanceId")
    @Validation(required = true)
    private String clusterInstanceId;

    private QueryClusterDetailRequest(Builder builder) {
        super(builder);
        this.clusterInstanceId = builder.clusterInstanceId;
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
     * @return clusterInstanceId
     */
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
    }

    public static final class Builder extends Request.Builder<QueryClusterDetailRequest, Builder> {
        private String clusterInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryClusterDetailRequest request) {
            super(request);
            this.clusterInstanceId = request.clusterInstanceId;
        } 

        /**
         * ClusterInstanceId.
         */
        public Builder clusterInstanceId(String clusterInstanceId) {
            this.putQueryParameter("ClusterInstanceId", clusterInstanceId);
            this.clusterInstanceId = clusterInstanceId;
            return this;
        }

        @Override
        public QueryClusterDetailRequest build() {
            return new QueryClusterDetailRequest(this);
        } 

    } 

}
