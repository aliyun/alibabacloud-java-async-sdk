// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudMetricProfilingRequest} extends {@link RequestModel}
 *
 * <p>GetCloudMetricProfilingRequest</p>
 */
public class GetCloudMetricProfilingRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ProfilingId")
    @Validation(required = true)
    private String profilingId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetCloudMetricProfilingRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.profilingId = builder.profilingId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudMetricProfilingRequest create() {
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

    /**
     * @return profilingId
     */
    public String getProfilingId() {
        return this.profilingId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetCloudMetricProfilingRequest, Builder> {
        private String clusterId; 
        private String profilingId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudMetricProfilingRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.profilingId = request.profilingId;
            this.regionId = request.regionId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ProfilingId.
         */
        public Builder profilingId(String profilingId) {
            this.putQueryParameter("ProfilingId", profilingId);
            this.profilingId = profilingId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetCloudMetricProfilingRequest build() {
            return new GetCloudMetricProfilingRequest(this);
        } 

    } 

}
