// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetManagedPrometheusStatusRequest} extends {@link RequestModel}
 *
 * <p>GetManagedPrometheusStatusRequest</p>
 */
public class GetManagedPrometheusStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private GetManagedPrometheusStatusRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterType = builder.clusterType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetManagedPrometheusStatusRequest create() {
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
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<GetManagedPrometheusStatusRequest, Builder> {
        private String clusterId; 
        private String clusterType; 
        private String regionId; 
        private String resourceGroupId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(GetManagedPrometheusStatusRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterType = request.clusterType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.vpcId = request.vpcId;
        } 

        /**
         * The ID of the ASK cluster. This parameter is required if the ClusterType parameter is set to ask.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The type of the monitoring object. Valid values: ask , acs , one and ecs.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the Prometheus instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * This parameter is required if the ClusterType parameter is set to ecs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public GetManagedPrometheusStatusRequest build() {
            return new GetManagedPrometheusStatusRequest(this);
        } 

    } 

}
