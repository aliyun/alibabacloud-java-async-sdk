// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link DeleteNetworkReachableAnalysisRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkReachableAnalysisRequest</p>
 */
public class DeleteNetworkReachableAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkReachableAnalysisIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> networkReachableAnalysisIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteNetworkReachableAnalysisRequest(Builder builder) {
        super(builder);
        this.networkReachableAnalysisIds = builder.networkReachableAnalysisIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkReachableAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkReachableAnalysisIds
     */
    public java.util.List<String> getNetworkReachableAnalysisIds() {
        return this.networkReachableAnalysisIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkReachableAnalysisRequest, Builder> {
        private java.util.List<String> networkReachableAnalysisIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkReachableAnalysisRequest request) {
            super(request);
            this.networkReachableAnalysisIds = request.networkReachableAnalysisIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of the tasks for analyzing network reachability.</p>
         * <p>This parameter is required.</p>
         */
        public Builder networkReachableAnalysisIds(java.util.List<String> networkReachableAnalysisIds) {
            String networkReachableAnalysisIdsShrink = shrink(networkReachableAnalysisIds, "NetworkReachableAnalysisIds", "json");
            this.putQueryParameter("NetworkReachableAnalysisIds", networkReachableAnalysisIdsShrink);
            this.networkReachableAnalysisIds = networkReachableAnalysisIds;
            return this;
        }

        /**
         * <p>The ID of the region for which you want to delete a task for analyzing network reachability.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteNetworkReachableAnalysisRequest build() {
            return new DeleteNetworkReachableAnalysisRequest(this);
        } 

    } 

}
