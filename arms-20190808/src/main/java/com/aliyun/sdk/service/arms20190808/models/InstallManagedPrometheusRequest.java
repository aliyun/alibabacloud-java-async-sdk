// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallManagedPrometheusRequest} extends {@link RequestModel}
 *
 * <p>InstallManagedPrometheusRequest</p>
 */
public class InstallManagedPrometheusRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterName")
    private String clusterName;

    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    @Query
    @NameInMap("GrafanaInstanceId")
    private String grafanaInstanceId;

    @Query
    @NameInMap("KubeConfig")
    private String kubeConfig;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private InstallManagedPrometheusRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.grafanaInstanceId = builder.grafanaInstanceId;
        this.kubeConfig = builder.kubeConfig;
        this.regionId = builder.regionId;
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
            this.securityGroupId = request.securityGroupId;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
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
         * 仅ClusterType为“ecs”时生效：ecs实例的名称
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * 可选值：ask、ecs
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * 绑定托管版Grafana工作区Id。为空或“free”时，表示绑定到“共享版Grafana”。
         */
        public Builder grafanaInstanceId(String grafanaInstanceId) {
            this.putQueryParameter("GrafanaInstanceId", grafanaInstanceId);
            this.grafanaInstanceId = grafanaInstanceId;
            return this;
        }

        /**
         * KubeConfig.
         */
        public Builder kubeConfig(String kubeConfig) {
            this.putQueryParameter("KubeConfig", kubeConfig);
            this.kubeConfig = kubeConfig;
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

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
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
