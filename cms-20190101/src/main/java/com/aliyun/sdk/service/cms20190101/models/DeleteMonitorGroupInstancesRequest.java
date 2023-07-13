// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMonitorGroupInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorGroupInstancesRequest</p>
 */
public class DeleteMonitorGroupInstancesRequest extends Request {
    @Query
    @NameInMap("Category")
    @Validation(required = true)
    private String category;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("InstanceIdList")
    @Validation(required = true)
    private String instanceIdList;

    private DeleteMonitorGroupInstancesRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.groupId = builder.groupId;
        this.instanceIdList = builder.instanceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorGroupInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceIdList
     */
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public static final class Builder extends Request.Builder<DeleteMonitorGroupInstancesRequest, Builder> {
        private String category; 
        private Long groupId; 
        private String instanceIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitorGroupInstancesRequest request) {
            super(request);
            this.category = request.category;
            this.groupId = request.groupId;
            this.instanceIdList = request.instanceIdList;
        } 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The instances to be removed from the application group. Separate multiple instances with commas (,). You can remove a maximum of 20 instances from an application group at a time.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The abbreviation of the service name. Valid values:
         * <p>
         * 
         * *   ECS: Elastic Compute Service (ECS) instances provided by Alibaba Cloud and hosts not provided by Alibaba Cloud
         * *   RDS: ApsaraDB for RDS
         * *   ADS: AnalyticDB
         * *   SLB: Server Load Balancer (SLB)
         * *   VPC: Virtual Private Cloud (VPC)
         * *   APIGATEWAY: API Gateway
         * *   CDN: Alibaba Cloud Content Delivery Network (CDN)
         * *   CS: Container Service for Swarm
         * *   DCDN: Dynamic Route for CDN
         * *   DDoS: Anti-DDoS Pro
         * *   EIP: Elastic IP Address (EIP)
         * *   ELASTICSEARCH: Elasticsearch
         * *   EMR: E-MapReduce
         * *   ESS: Auto Scaling
         * *   HBASE: ApsaraDB for Hbase
         * *   IOT_EDGE: IoT Edge
         * *   K8S_POD: pods in Container Service for Kubernetes
         * *   KVSTORE_SHARDING: ApsaraDB for Redis of the cluster architecture
         * *   KVSTORE_SPLITRW: ApsaraDB for Redis of the read/write splitting architecture
         * *   KVSTORE_STANDARD: ApsaraDB for Redis of the standard architecture
         * *   MEMCACHE: ApsaraDB for Memcache
         * *   MNS: Message Service (MNS)
         * *   MONGODB: ApsaraDB for MongoDB of the replica set architecture
         * *   MONGODB_CLUSTER: ApsaraDB for MongoDB of the cluster architecture
         * *   MONGODB_SHARDING: ApsaraDB for MongoDB of the sharded cluster architecture
         * *   MQ_TOPIC: MNS topics
         * *   OCS: ApsaraDB for Memcache of earlier versions
         * *   OPENSEARCH: Open Search
         * *   OSS: Object Storage Service (OSS)
         * *   POLARDB: PolarDB
         * *   PETADATA: HybridDB for MySQL
         * *   SCDN: Secure Content Delivery Network (SCDN)
         * *   SHAREBANDWIDTHPACKAGES: EIP Bandwidth Plan
         * *   SLS: Log Service
         * *   VPN: VPN Gateway
         */
        public Builder instanceIdList(String instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        @Override
        public DeleteMonitorGroupInstancesRequest build() {
            return new DeleteMonitorGroupInstancesRequest(this);
        } 

    } 

}
