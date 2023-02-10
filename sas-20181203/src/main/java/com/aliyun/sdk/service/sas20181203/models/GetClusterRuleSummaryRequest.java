// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterRuleSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetClusterRuleSummaryRequest</p>
 */
public class GetClusterRuleSummaryRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private GetClusterRuleSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterRuleSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<GetClusterRuleSummaryRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterRuleSummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The ID of the container cluster.
         * <p>
         * 
         * >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public GetClusterRuleSummaryRequest build() {
            return new GetClusterRuleSummaryRequest(this);
        } 

    } 

}
