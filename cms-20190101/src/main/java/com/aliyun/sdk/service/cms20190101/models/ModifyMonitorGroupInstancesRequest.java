// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the application group.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Instances.
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
             * The abbreviation of the name of the service to which the instances to be added to the application group belong. Valid values:
             * <p>
             * 
             * *   ECS: Elastic Compute Service (ECS) instances provided by Alibaba Cloud and hosts not provided by Alibaba Cloud
             * 
             * *   RDS: ApsaraDB for RDS
             * 
             * *   ADS: AnalyticDB
             * 
             * *   SLB: Server Load Balancer (SLB)
             * 
             * *   VPC: Virtual Private Cloud (VPC)
             * 
             * *   APIGATEWAY: API Gateway
             * 
             * *   CDN: Alibaba Cloud Content Delivery Network (CDN)
             * 
             * *   CS: Container Service for Swarm
             * 
             * *   DCDN: Dynamic Route for CDN
             * 
             * *   DDoS: Anti-DDoS Pro
             * 
             * *   EIP: Elastic IP Address (EIP)
             * 
             * *   ELASTICSEARCH: Elasticsearch
             * 
             * *   EMR: E-MapReduce
             * 
             * *   ESS: Auto Scaling
             * 
             * *   HBASE: ApsaraDB for Hbase
             * 
             * *   IOT_EDGE: IoT Edge
             * 
             * *   K8S_POD: pods in Container Service for Kubernetes
             * 
             * *   KVSTORE_SHARDING: ApsaraDB for Redis of the cluster architecture
             * 
             * *   KVSTORE_SPLITRW: ApsaraDB for Redis of the read/write splitting architecture
             * 
             * *   KVSTORE_STANDARD: ApsaraDB for Redis of the standard architecture
             * 
             * *   MEMCACHE: ApsaraDB for Memcache
             * 
             * *   MNS: Message Service (MNS)
             * 
             * *   MONGODB: ApsaraDB for MongoDB of the replica set architecture
             * 
             * *   MONGODB_CLUSTER: ApsaraDB for MongoDB of the cluster architecture
             * 
             * *   MONGODB_SHARDING: ApsaraDB for MongoDB of the sharded cluster architecture
             * 
             * *   MQ_TOPIC: MNS topics
             * 
             * *   OCS: ApsaraDB for Memcache of earlier versions
             * 
             * *   OPENSEARCH: Open Search
             * 
             * *   OSS: Object Storage Service (OSS)
             * 
             * *   POLARDB: PolarDB
             * 
             * *   PETADATA: HybridDB for MySQL
             * 
             * *   SCDN: Secure Content Delivery Network (SCDN)
             * 
             * *   SHAREBANDWIDTHPACKAGES: EIP Bandwidth Plan
             * 
             * *   SLS: Log Service
             * 
             * *   VPN: VPN Gateway
             * 
             *     Valid values of N: 1 to 2000.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The ID of the instance. Valid values of N: 1 to 2000.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the instance. Valid values of N: 1 to 2000.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The ID of the region where the instance resides. Valid values of N: 1 to 2000.
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
