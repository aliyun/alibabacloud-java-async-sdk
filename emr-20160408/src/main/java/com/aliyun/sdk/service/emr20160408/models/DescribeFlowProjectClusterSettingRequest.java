// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowProjectClusterSettingRequest} extends {@link RequestModel}
 *
 * <p>DescribeFlowProjectClusterSettingRequest</p>
 */
public class DescribeFlowProjectClusterSettingRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeFlowProjectClusterSettingRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowProjectClusterSettingRequest create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFlowProjectClusterSettingRequest, Builder> {
        private String clusterId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFlowProjectClusterSettingRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.projectId = request.projectId;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
        public DescribeFlowProjectClusterSettingRequest build() {
            return new DescribeFlowProjectClusterSettingRequest(this);
        } 

    } 

}
