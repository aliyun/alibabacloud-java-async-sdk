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
 * {@link GetNetworkReachableAnalysisRequest} extends {@link RequestModel}
 *
 * <p>GetNetworkReachableAnalysisRequest</p>
 */
public class GetNetworkReachableAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkReachableAnalysisId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkReachableAnalysisId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetNetworkReachableAnalysisRequest(Builder builder) {
        super(builder);
        this.networkReachableAnalysisId = builder.networkReachableAnalysisId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkReachableAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkReachableAnalysisId
     */
    public String getNetworkReachableAnalysisId() {
        return this.networkReachableAnalysisId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetNetworkReachableAnalysisRequest, Builder> {
        private String networkReachableAnalysisId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetNetworkReachableAnalysisRequest request) {
            super(request);
            this.networkReachableAnalysisId = request.networkReachableAnalysisId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the task for analyzing network reachability. You can call the <strong>CreateNetworkRearchableAnalysis</strong> operation to obtain the ID of the task for analyzing network reachability.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nra-90eef36a9e6e4662****</p>
         */
        public Builder networkReachableAnalysisId(String networkReachableAnalysisId) {
            this.putQueryParameter("NetworkReachableAnalysisId", networkReachableAnalysisId);
            this.networkReachableAnalysisId = networkReachableAnalysisId;
            return this;
        }

        /**
         * <p>The ID of the region for which you want to obtain the result of network reachability analysis.</p>
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
        public GetNetworkReachableAnalysisRequest build() {
            return new GetNetworkReachableAnalysisRequest(this);
        } 

    } 

}
