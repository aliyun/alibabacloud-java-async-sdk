// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterMemberInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterMemberInfoResponseBody</p>
 */
public class DescribeClusterMemberInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterChildren")
    private java.util.List<ClusterChildren> clusterChildren;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterChildren
     */
    public java.util.List<ClusterChildren> getClusterChildren() {
        return this.clusterChildren;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ClusterChildren> clusterChildren; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClusterMemberInfoResponseBody model) {
            this.clusterChildren = model.clusterChildren;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about data nodes in the cluster instance.</p>
         */
        public Builder clusterChildren(java.util.List<ClusterChildren> clusterChildren) {
            this.clusterChildren = clusterChildren;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2D9F3768-EDA9-4811-943E-42C8006E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterMemberInfoResponseBody build() {
            return new DescribeClusterMemberInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterMemberInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterMemberInfoResponseBody</p>
     */
    public static class ClusterChildren extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandWidth")
        private Long bandWidth;

        @com.aliyun.core.annotation.NameInMap("BinlogRetentionDays")
        private Integer binlogRetentionDays;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("Connections")
        private Long connections;

        @com.aliyun.core.annotation.NameInMap("CurrentBandWidth")
        private Long currentBandWidth;

        @com.aliyun.core.annotation.NameInMap("DiskSizeMB")
        private Integer diskSizeMB;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReplicaSize")
        private Integer replicaSize;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("ServiceVersion")
        private String serviceVersion;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(ClusterChildren model) {
                this.bandWidth = model.bandWidth;
                this.binlogRetentionDays = model.binlogRetentionDays;
                this.bizType = model.bizType;
                this.capacity = model.capacity;
                this.classCode = model.classCode;
                this.connections = model.connections;
                this.currentBandWidth = model.currentBandWidth;
                this.diskSizeMB = model.diskSizeMB;
                this.id = model.id;
                this.name = model.name;
                this.replicaSize = model.replicaSize;
                this.resourceGroupName = model.resourceGroupName;
                this.service = model.service;
                this.serviceVersion = model.serviceVersion;
                this.userId = model.userId;
            } 

            /**
             * <p>The maximum bandwidth of the node. Unit: MB/s.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>Service</strong> is <strong>redis</strong>, which indicates a data node.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder bandWidth(Long bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * <p>The retention period of binlogs.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder binlogRetentionDays(Integer binlogRetentionDays) {
                this.binlogRetentionDays = binlogRetentionDays;
                return this;
            }

            /**
             * <p>The type of workload. The return value is <strong>ALIYUN</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The maximum memory capacity per data node. Unit: MB.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>Service</strong> is <strong>redis</strong>, which indicates a data node.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The specifications of the data node. For more information, see <a href="https://help.aliyun.com/document_detail/164477.html">Community Edition instances that use cloud disks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>redis.shard.small.ce</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The maximum number of connections supported by the data node.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder connections(Long connections) {
                this.connections = connections;
                return this;
            }

            /**
             * <p>The current bandwidth of the data node, which is the sum of the default bandwidth and any extra bandwidth that is purchased. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder currentBandWidth(Long currentBandWidth) {
                this.currentBandWidth = currentBandWidth;
                return this;
            }

            /**
             * <p>The storage capacity of the <a href="https://help.aliyun.com/document_detail/122389.html">enhanced SSD (ESSD)</a> that is used by the data node. Unit: MB.</p>
             * <blockquote>
             * <p>The ESSD is used only to store system operating data, such as Persistent Memory (PMEM). It is not used as a medium to write and read data.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder diskSizeMB(Integer diskSizeMB) {
                this.diskSizeMB = diskSizeMB;
                return this;
            }

            /**
             * <p>The ID of the replica set in the node.</p>
             * 
             * <strong>example:</strong>
             * <p>501791111</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the data node.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1zxszhcgatnx****-db-0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of replica nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder replicaSize(Integer replicaSize) {
                this.replicaSize = replicaSize;
                return this;
            }

            /**
             * <p>The name of the resource group to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>GLOBAL_ZHANGJIAKOU_A</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li><strong>redis</strong>: data node</li>
             * <li><strong>redis_cs</strong>: config server</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>redis</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The major version of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>5.0</p>
             */
            public Builder serviceVersion(String serviceVersion) {
                this.serviceVersion = serviceVersion;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>2****_176498472570****</p>
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
