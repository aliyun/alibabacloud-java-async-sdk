// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link GetCloudMetricProfilingRequest} extends {@link RequestModel}
 *
 * <p>GetCloudMetricProfilingRequest</p>
 */
public class GetCloudMetricProfilingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProfilingId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String profilingId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-jeJki6****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The profiling ID. You can call the <a href="https://help.aliyun.com/document_detail/188711.html">ListCloudMetricProfilings</a> operation to obtain the profiling ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-i-bplukzqgl****_21687_2019-09-09-02-37-40</p>
         */
        public Builder profilingId(String profilingId) {
            this.putQueryParameter("ProfilingId", profilingId);
            this.profilingId = profilingId;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
