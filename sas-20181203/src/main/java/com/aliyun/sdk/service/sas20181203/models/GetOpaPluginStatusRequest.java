// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpaPluginStatusRequest} extends {@link RequestModel}
 *
 * <p>GetOpaPluginStatusRequest</p>
 */
public class GetOpaPluginStatusRequest extends Request {
    @Query
    @NameInMap("ClusterIds")
    @Validation(required = true)
    private java.util.List < String > clusterIds;

    private GetOpaPluginStatusRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpaPluginStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public java.util.List < String > getClusterIds() {
        return this.clusterIds;
    }

    public static final class Builder extends Request.Builder<GetOpaPluginStatusRequest, Builder> {
        private java.util.List < String > clusterIds; 

        private Builder() {
            super();
        } 

        private Builder(GetOpaPluginStatusRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
        } 

        /**
         * The cluster IDs.
         * <p>
         * 
         * >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.
         */
        public Builder clusterIds(java.util.List < String > clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        @Override
        public GetOpaPluginStatusRequest build() {
            return new GetOpaPluginStatusRequest(this);
        } 

    } 

}
