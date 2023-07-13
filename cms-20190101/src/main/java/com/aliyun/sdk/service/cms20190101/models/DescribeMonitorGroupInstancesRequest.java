// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitorGroupInstancesRequest</p>
 */
public class DescribeMonitorGroupInstancesRequest extends Request {
    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeMonitorGroupInstancesRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.groupId = builder.groupId;
        this.instanceIds = builder.instanceIds;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorGroupInstancesRequest create() {
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
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeMonitorGroupInstancesRequest, Builder> {
        private String category; 
        private Long groupId; 
        private String instanceIds; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitorGroupInstancesRequest request) {
            super(request);
            this.category = request.category;
            this.groupId = request.groupId;
            this.instanceIds = request.instanceIds;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The abbreviation of the name of the service to which the instances in the application group belong. Valid values:
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
         * 
         * Valid values of N: 1 to 200.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
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
         * The ID of the instance. You can query multiple instances by specifying multiple IDs.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The keyword used to search for instances. Fuzzy search based on instance name is supported.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The number of the page to return. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeMonitorGroupInstancesRequest build() {
            return new DescribeMonitorGroupInstancesRequest(this);
        } 

    } 

}
