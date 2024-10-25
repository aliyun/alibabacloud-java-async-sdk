// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyMonitorGroupInstancesRequest} extends {@link RequestModel}
 *
 * <p>ModifyMonitorGroupInstancesRequest</p>
 */
public class ModifyMonitorGroupInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Instances> instances;

    private ModifyMonitorGroupInstancesRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMonitorGroupInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<ModifyMonitorGroupInstancesRequest, Builder> {
        private Long groupId; 
        private java.util.List < Instances> instances; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMonitorGroupInstancesRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instances = request.instances;
        } 

        /**
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public ModifyMonitorGroupInstancesRequest build() {
            return new ModifyMonitorGroupInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyMonitorGroupInstancesRequest} extends {@link TeaModel}
     *
     * <p>ModifyMonitorGroupInstancesRequest</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        private Instances(Builder builder) {
            this.category = builder.category;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String category; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            /**
             * <p>The abbreviation of the name of the service to which the instances to be added to the application group belong. Valid values:</p>
             * <ul>
             * <li><p>ECS: Elastic Compute Service (ECS) instances provided by Alibaba Cloud and hosts not provided by Alibaba Cloud</p>
             * </li>
             * <li><p>RDS: ApsaraDB for RDS</p>
             * </li>
             * <li><p>ADS: AnalyticDB</p>
             * </li>
             * <li><p>SLB: Server Load Balancer (SLB)</p>
             * </li>
             * <li><p>VPC: Virtual Private Cloud (VPC)</p>
             * </li>
             * <li><p>APIGATEWAY: API Gateway</p>
             * </li>
             * <li><p>CDN: Alibaba Cloud Content Delivery Network (CDN)</p>
             * </li>
             * <li><p>CS: Container Service for Swarm</p>
             * </li>
             * <li><p>DCDN: Dynamic Route for CDN</p>
             * </li>
             * <li><p>DDoS: Anti-DDoS Pro</p>
             * </li>
             * <li><p>EIP: Elastic IP Address (EIP)</p>
             * </li>
             * <li><p>ELASTICSEARCH: Elasticsearch</p>
             * </li>
             * <li><p>EMR: E-MapReduce</p>
             * </li>
             * <li><p>ESS: Auto Scaling</p>
             * </li>
             * <li><p>HBASE: ApsaraDB for Hbase</p>
             * </li>
             * <li><p>IOT_EDGE: IoT Edge</p>
             * </li>
             * <li><p>K8S_POD: pods in Container Service for Kubernetes</p>
             * </li>
             * <li><p>KVSTORE_SHARDING: ApsaraDB for Redis of the cluster architecture</p>
             * </li>
             * <li><p>KVSTORE_SPLITRW: ApsaraDB for Redis of the read/write splitting architecture</p>
             * </li>
             * <li><p>KVSTORE_STANDARD: ApsaraDB for Redis of the standard architecture</p>
             * </li>
             * <li><p>MEMCACHE: ApsaraDB for Memcache</p>
             * </li>
             * <li><p>MNS: Message Service (MNS)</p>
             * </li>
             * <li><p>MONGODB: ApsaraDB for MongoDB of the replica set architecture</p>
             * </li>
             * <li><p>MONGODB_CLUSTER: ApsaraDB for MongoDB of the cluster architecture</p>
             * </li>
             * <li><p>MONGODB_SHARDING: ApsaraDB for MongoDB of the sharded cluster architecture</p>
             * </li>
             * <li><p>MQ_TOPIC: MNS topics</p>
             * </li>
             * <li><p>OCS: ApsaraDB for Memcache of earlier versions</p>
             * </li>
             * <li><p>OPENSEARCH: Open Search</p>
             * </li>
             * <li><p>OSS: Object Storage Service (OSS)</p>
             * </li>
             * <li><p>POLARDB: PolarDB</p>
             * </li>
             * <li><p>PETADATA: HybridDB for MySQL</p>
             * </li>
             * <li><p>SCDN: Secure Content Delivery Network (SCDN)</p>
             * </li>
             * <li><p>SHAREBANDWIDTHPACKAGES: EIP Bandwidth Plan</p>
             * </li>
             * <li><p>SLS: Log Service</p>
             * </li>
             * <li><p>VPN: VPN Gateway</p>
             * <p>Valid values of N: 1 to 2000.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The ID of the instance. Valid values of N: 1 to 2000.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-a2d5q7pm12****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance. Valid values of N: 1 to 2000.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HostName</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The ID of the region where the instance resides. Valid values of N: 1 to 2000.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
