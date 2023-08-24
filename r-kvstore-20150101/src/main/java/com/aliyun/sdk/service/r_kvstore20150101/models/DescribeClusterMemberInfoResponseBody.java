// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterMemberInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterMemberInfoResponseBody</p>
 */
public class DescribeClusterMemberInfoResponseBody extends TeaModel {
    @NameInMap("ClusterChildren")
    private java.util.List < ClusterChildren> clusterChildren;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeClusterMemberInfoResponseBody(Builder builder) {
        this.clusterChildren = builder.clusterChildren;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterMemberInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterChildren
     */
    public java.util.List < ClusterChildren> getClusterChildren() {
        return this.clusterChildren;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ClusterChildren> clusterChildren; 
        private String requestId; 

        /**
         * Details of nodes in the cluster instance.
         */
        public Builder clusterChildren(java.util.List < ClusterChildren> clusterChildren) {
            this.clusterChildren = clusterChildren;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterMemberInfoResponseBody build() {
            return new DescribeClusterMemberInfoResponseBody(this);
        } 

    } 

    public static class ClusterChildren extends TeaModel {
        @NameInMap("BandWidth")
        private Long bandWidth;

        @NameInMap("BinlogRetentionDays")
        private Integer binlogRetentionDays;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("ClassCode")
        private String classCode;

        @NameInMap("Connections")
        private Long connections;

        @NameInMap("CurrentBandWidth")
        private Long currentBandWidth;

        @NameInMap("DiskSizeMB")
        private Integer diskSizeMB;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("ReplicaSize")
        private Integer replicaSize;

        @NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @NameInMap("Service")
        private String service;

        @NameInMap("ServiceVersion")
        private String serviceVersion;

        @NameInMap("UserId")
        private String userId;

        private ClusterChildren(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.binlogRetentionDays = builder.binlogRetentionDays;
            this.bizType = builder.bizType;
            this.capacity = builder.capacity;
            this.classCode = builder.classCode;
            this.connections = builder.connections;
            this.currentBandWidth = builder.currentBandWidth;
            this.diskSizeMB = builder.diskSizeMB;
            this.id = builder.id;
            this.name = builder.name;
            this.replicaSize = builder.replicaSize;
            this.resourceGroupName = builder.resourceGroupName;
            this.service = builder.service;
            this.serviceVersion = builder.serviceVersion;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterChildren create() {
            return builder().build();
        }

        /**
         * @return bandWidth
         */
        public Long getBandWidth() {
            return this.bandWidth;
        }

        /**
         * @return binlogRetentionDays
         */
        public Integer getBinlogRetentionDays() {
            return this.binlogRetentionDays;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return connections
         */
        public Long getConnections() {
            return this.connections;
        }

        /**
         * @return currentBandWidth
         */
        public Long getCurrentBandWidth() {
            return this.currentBandWidth;
        }

        /**
         * @return diskSizeMB
         */
        public Integer getDiskSizeMB() {
            return this.diskSizeMB;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return replicaSize
         */
        public Integer getReplicaSize() {
            return this.replicaSize;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return serviceVersion
         */
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long bandWidth; 
            private Integer binlogRetentionDays; 
            private String bizType; 
            private Long capacity; 
            private String classCode; 
            private Long connections; 
            private Long currentBandWidth; 
            private Integer diskSizeMB; 
            private Long id; 
            private String name; 
            private Integer replicaSize; 
            private String resourceGroupName; 
            private String service; 
            private String serviceVersion; 
            private String userId; 

            /**
             * The maximum bandwidth of the node. Unit: MB/s.
             * <p>
             * 
             * > This parameter is returned only if the return value of **Service** is **redis**, which indicates a data node.
             */
            public Builder bandWidth(Long bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * The retention period of binlogs.
             */
            public Builder binlogRetentionDays(Integer binlogRetentionDays) {
                this.binlogRetentionDays = binlogRetentionDays;
                return this;
            }

            /**
             * The type of workload. The return value is **ALIYUN**.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The maximum memory capacity per data node. Unit: MB.
             * <p>
             * 
             * > This parameter is returned only if the return value of **Service** is **redis**, which indicates a data node.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The specifications of the data node. For more information, see [Community Edition instances that use cloud disks](~~164477~~).
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * The maximum number of connections supported by the data node.
             */
            public Builder connections(Long connections) {
                this.connections = connections;
                return this;
            }

            /**
             * The current bandwidth of the node, which consists of the default bandwidth and the increased bandwidth. Unit: MB/s.
             * <p>
             * 
             * > This parameter is returned only if the instance is created in a dedicated cluster.
             */
            public Builder currentBandWidth(Long currentBandWidth) {
                this.currentBandWidth = currentBandWidth;
                return this;
            }

            /**
             * The storage capacity of the [enhanced SSD (ESSD)](~~122389~~) that is used by the data node. Unit: MB.
             * <p>
             * 
             * > The ESSD is used only to store system operating data, such as Persistent Memory (PMEM). It is not used as a medium to write and read data.
             */
            public Builder diskSizeMB(Integer diskSizeMB) {
                this.diskSizeMB = diskSizeMB;
                return this;
            }

            /**
             * The ID of the replica set in the node.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the data node.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of replica nodes.
             */
            public Builder replicaSize(Integer replicaSize) {
                this.replicaSize = replicaSize;
                return this;
            }

            /**
             * The name of the resource group to which the node belongs.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * The node type. Valid values:
             * <p>
             * 
             * *   **redis**: data node
             * *   **redis_cs**: config server
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * The major version of the node.
             */
            public Builder serviceVersion(String serviceVersion) {
                this.serviceVersion = serviceVersion;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ClusterChildren build() {
                return new ClusterChildren(this);
            } 

        } 

    }
}
