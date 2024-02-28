// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrometheusInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreatePrometheusInstanceRequest</p>
 */
public class CreatePrometheusInstanceRequest extends Request {
    @Query
    @NameInMap("AllSubClustersSuccess")
    private Boolean allSubClustersSuccess;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterName")
    private String clusterName;

    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("GrafanaInstanceId")
    private String grafanaInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SubClustersJson")
    private String subClustersJson;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private CreatePrometheusInstanceRequest(Builder builder) {
        super(builder);
        this.allSubClustersSuccess = builder.allSubClustersSuccess;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.duration = builder.duration;
        this.grafanaInstanceId = builder.grafanaInstanceId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.subClustersJson = builder.subClustersJson;
        this.tags = builder.tags;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrometheusInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allSubClustersSuccess
     */
    public Boolean getAllSubClustersSuccess() {
        return this.allSubClustersSuccess;
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
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return grafanaInstanceId
     */
    public String getGrafanaInstanceId() {
        return this.grafanaInstanceId;
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
     * @return subClustersJson
     */
    public String getSubClustersJson() {
        return this.subClustersJson;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
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

    public static final class Builder extends Request.Builder<CreatePrometheusInstanceRequest, Builder> {
        private Boolean allSubClustersSuccess; 
        private String clusterId; 
        private String clusterName; 
        private String clusterType; 
        private Integer duration; 
        private String grafanaInstanceId; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private String subClustersJson; 
        private java.util.List < Tags> tags; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrometheusInstanceRequest request) {
            super(request);
            this.allSubClustersSuccess = request.allSubClustersSuccess;
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.clusterType = request.clusterType;
            this.duration = request.duration;
            this.grafanaInstanceId = request.grafanaInstanceId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityGroupId = request.securityGroupId;
            this.subClustersJson = request.subClustersJson;
            this.tags = request.tags;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * To edit a GlobalView aggregated instance, do you require all passed child instances to be verified successfully before creating a GlobalView instance (optional, default to false):
         * <p>
         * - true
         * - false
         */
        public Builder allSubClustersSuccess(Boolean allSubClustersSuccess) {
            this.putQueryParameter("AllSubClustersSuccess", allSubClustersSuccess);
            this.allSubClustersSuccess = allSubClustersSuccess;
            return this;
        }

        /**
         * The ID of the cluster. This parameter is required if you set ClusterType to aliyun-cs.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the cluster. This parameter is required if you set ClusterType to remote-write, ecs, or global-view.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * Types include:
         * <p>
         * - remote-write: General-purpose Instance
         * - ecs: Prometheus for ECS
         * - global-view: Global Aggregation Instance
         * - aliyun-cs: Prometheus Instance for Container Service
         * - cloud-product: Prometheus for cloud monitor
         * - cloud-monitor: Prometheus for enterprise cloud monitor
         * - flink: Prometheus for Flink
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The ID of the Grafana dedicated instance. This parameter is available if you set ClusterType to ecs.
         */
        public Builder grafanaInstanceId(String grafanaInstanceId) {
            this.putQueryParameter("GrafanaInstanceId", grafanaInstanceId);
            this.grafanaInstanceId = grafanaInstanceId;
            return this;
        }

        /**
         * The region ID. If you create a Prometheus instance for a cloud service in China, set this parameter to cn-shanghai.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the custom resource group. You can specify this parameter to bind the instance to the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the security group. This parameter is required if you set ClusterType to ecs or create an ASK managed cluster.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The child instances of the Prometheus instance for GlobalView. The value is a JSON string.
         */
        public Builder subClustersJson(String subClustersJson) {
            this.putQueryParameter("SubClustersJson", subClustersJson);
            this.subClustersJson = subClustersJson;
            return this;
        }

        /**
         * The tags of the instance. You can specify this parameter to manage tags for the instance.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The ID of the vSwitch. This parameter is required if you set ClusterType to ecs or create an ASK managed cluster.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC). This parameter is required if you set ClusterType to ecs or create a serverless Kubernetes (ASK) managed cluster.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreatePrometheusInstanceRequest build() {
            return new CreatePrometheusInstanceRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
