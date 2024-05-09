// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallManagedPrometheusRequest} extends {@link RequestModel}
 *
 * <p>InstallManagedPrometheusRequest</p>
 */
public class InstallManagedPrometheusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaInstanceId")
    private String grafanaInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KubeConfig")
    private String kubeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private InstallManagedPrometheusRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.grafanaInstanceId = builder.grafanaInstanceId;
        this.kubeConfig = builder.kubeConfig;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallManagedPrometheusRequest create() {
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
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return grafanaInstanceId
     */
    public String getGrafanaInstanceId() {
        return this.grafanaInstanceId;
    }

    /**
     * @return kubeConfig
     */
    public String getKubeConfig() {
        return this.kubeConfig;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<InstallManagedPrometheusRequest, Builder> {
        private String clusterId; 
        private String clusterName; 
        private String clusterType; 
        private String grafanaInstanceId; 
        private String kubeConfig; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(InstallManagedPrometheusRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.clusterType = request.clusterType;
            this.grafanaInstanceId = request.grafanaInstanceId;
            this.kubeConfig = request.kubeConfig;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityGroupId = request.securityGroupId;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * The ID of the ACK cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the ECS instance. If you set the ClusterType parameter to ecs, you must configure this parameter.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * The cluster type.
         * <p>
         * 
         * Valid values:
         * 
         * *   ecs
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   one
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ask
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   pro
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The ID of the Grafana workspace used by the ASK cluster or ECS instance. If you set the value to free or leave the parameter empty, a shared Grafana workspace is used.
         */
        public Builder grafanaInstanceId(String grafanaInstanceId) {
            this.putQueryParameter("GrafanaInstanceId", grafanaInstanceId);
            this.grafanaInstanceId = grafanaInstanceId;
            return this;
        }

        /**
         * This parameter is not supported.
         */
        public Builder kubeConfig(String kubeConfig) {
            this.putQueryParameter("KubeConfig", kubeConfig);
            this.kubeConfig = kubeConfig;
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
         * The security group of the ASK cluster or ECS instance.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The vSwitch used by the ASK cluster or ECS instance.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The virtual private cloud (VPC) where the ASK cluster or ECS instance resides.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public InstallManagedPrometheusRequest build() {
            return new InstallManagedPrometheusRequest(this);
        } 

    } 

}
