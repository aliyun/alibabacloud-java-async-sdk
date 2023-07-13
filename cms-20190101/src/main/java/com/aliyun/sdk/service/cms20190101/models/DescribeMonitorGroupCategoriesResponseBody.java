// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorGroupCategoriesResponseBody</p>
 */
public class DescribeMonitorGroupCategoriesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("MonitorGroupCategories")
    private MonitorGroupCategories monitorGroupCategories;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeMonitorGroupCategoriesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.monitorGroupCategories = builder.monitorGroupCategories;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorGroupCategoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return monitorGroupCategories
     */
    public MonitorGroupCategories getMonitorGroupCategories() {
        return this.monitorGroupCategories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private MonitorGroupCategories monitorGroupCategories; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The cloud services to which the resources in the application group belong and the number of resources that belong to the cloud service.
         */
        public Builder monitorGroupCategories(MonitorGroupCategories monitorGroupCategories) {
            this.monitorGroupCategories = monitorGroupCategories;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMonitorGroupCategoriesResponseBody build() {
            return new DescribeMonitorGroupCategoriesResponseBody(this);
        } 

    } 

    public static class CategoryItem extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Count")
        private Integer count;

        private CategoryItem(Builder builder) {
            this.category = builder.category;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryItem create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private String category; 
            private Integer count; 

            /**
             * The name of the cloud service. Valid values:
             * <p>
             * 
             * *   ecs: Elastic Compute Service (ECS) instances that are provided by Alibaba Cloud and hosts that are not provided by Alibaba Cloud
             * *   rds: ApsaraDB RDS
             * *   ads: AnalyticDB
             * *   slb: Server Load Balancer (SLB)
             * *   vpc: Virtual Private Cloud (VPC)
             * *   apigateway: API Gateway
             * *   cdn: Alibaba Cloud Content Delivery Network (CDN)
             * *   cs: Container Service for Swarm
             * *   dcdn: Dynamic Route for CDN (DCDN)
             * *   ddos: Anti-DDoS
             * *   eip: Elastic IP Address (EIP)
             * *   elasticsearch: Elasticsearch
             * *   emr: E-MapReduce
             * *   ess: Auto Scaling
             * *   hbase: ApsaraDB for HBase
             * *   iot_edge: IoT Edge
             * *   k8s_pod: pods in Container Service for Kubernetes (ACK)
             * *   kvstore_sharding: ApsaraDB for Redis of the cluster master-replica architecture
             * *   kvstore_splitrw: ApsaraDB for Redis of the read/write splitting architecture
             * *   kvstore_standard: ApsaraDB for Redis of the standard master-replica architecture
             * *   memcache: ApsaraDB for Memcache
             * *   mns: Message Service (MNS)
             * *   mongodb: ApsaraDB for MongoDB of the replica set architecture
             * *   mongodb_cluster: ApsaraDB for MongoDB of the cluster architecture
             * *   mongodb_sharding: ApsaraDB for MongoDB of the sharded cluster architecture
             * *   mq_topic: MNS topics
             * *   ocs: ApsaraDB for Memcache of earlier versions
             * *   opensearch: Open Search
             * *   oss: Object Storage Service (OSS)
             * *   polardb: PolarDB
             * *   petadata: HybridDB for MySQL
             * *   scdn: Secure CDN (SCDN)
             * *   sharebandwidthpackages: EIP Bandwidth Plan
             * *   sls: Log Service
             * *   vpn: VPN Gateway
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The number of resources that belong to the cloud service.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            public CategoryItem build() {
                return new CategoryItem(this);
            } 

        } 

    }
    public static class MonitorGroupCategory extends TeaModel {
        @NameInMap("CategoryItem")
        private java.util.List < CategoryItem> categoryItem;

        private MonitorGroupCategory(Builder builder) {
            this.categoryItem = builder.categoryItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorGroupCategory create() {
            return builder().build();
        }

        /**
         * @return categoryItem
         */
        public java.util.List < CategoryItem> getCategoryItem() {
            return this.categoryItem;
        }

        public static final class Builder {
            private java.util.List < CategoryItem> categoryItem; 

            /**
             * CategoryItem.
             */
            public Builder categoryItem(java.util.List < CategoryItem> categoryItem) {
                this.categoryItem = categoryItem;
                return this;
            }

            public MonitorGroupCategory build() {
                return new MonitorGroupCategory(this);
            } 

        } 

    }
    public static class MonitorGroupCategories extends TeaModel {
        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("MonitorGroupCategory")
        private MonitorGroupCategory monitorGroupCategory;

        private MonitorGroupCategories(Builder builder) {
            this.groupId = builder.groupId;
            this.monitorGroupCategory = builder.monitorGroupCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorGroupCategories create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return monitorGroupCategory
         */
        public MonitorGroupCategory getMonitorGroupCategory() {
            return this.monitorGroupCategory;
        }

        public static final class Builder {
            private Long groupId; 
            private MonitorGroupCategory monitorGroupCategory; 

            /**
             * The ID of the application group.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * One of the cloud services to which the resources in the application group belong and the number of resources that belong to the cloud service.
             */
            public Builder monitorGroupCategory(MonitorGroupCategory monitorGroupCategory) {
                this.monitorGroupCategory = monitorGroupCategory;
                return this;
            }

            public MonitorGroupCategories build() {
                return new MonitorGroupCategories(this);
            } 

        } 

    }
}
