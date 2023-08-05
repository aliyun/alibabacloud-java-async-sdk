// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterceptionSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetInterceptionSummaryRequest</p>
 */
public class GetInterceptionSummaryRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    private GetInterceptionSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterceptionSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<GetInterceptionSummaryRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(GetInterceptionSummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeGroupedContainerInstances](~~421736~~) operation to query the IDs of clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public GetInterceptionSummaryRequest build() {
            return new GetInterceptionSummaryRequest(this);
        } 

    } 

}
