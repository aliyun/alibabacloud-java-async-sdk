// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterPerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBClusterPerformanceRequest</p>
 */
public class DescribeDBClusterPerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private String nodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeDBClusterPerformanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.nodeType = builder.nodeType;
        this.nodes = builder.nodes;
        this.resourceGroupName = builder.resourceGroupName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterPerformanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return nodes
     */
    public String getNodes() {
        return this.nodes;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDBClusterPerformanceRequest, Builder> {
        private String DBInstanceId; 
        private String endTime; 
        private String key; 
        private String nodeType; 
        private String nodes; 
        private String resourceGroupName; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBClusterPerformanceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.endTime = request.endTime;
            this.key = request.key;
            this.nodeType = request.nodeType;
            this.nodes = request.nodes;
            this.resourceGroupName = request.resourceGroupName;
            this.startTime = request.startTime;
        } 

        /**
         * The instance ID.
         * <p>
         * 
         * > You can call the [DescribeDBInstances](~~86911~~) operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the `YYYY-MM-DDTHH:mmZ` format.
         * <p>
         * 
         * > The end time must be later than the start time. The maximum time range that can be specified is seven days.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The performance metric that you want to query. Separate multiple values with commas (,). For more information, see [Performance parameters](~~86943~~).
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * The node type. Valid values:
         * <p>
         * 
         * *   **master**: coordinator node.
         * *   **segment**: compute node.
         * 
         * > If you do not specify this parameter, the performance metrics of all nodes are returned.
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * The nodes for which you want to query performance metrics. Separate multiple values with commas (,). Example: `master-10******1,master-10******2`. You can call the [DescribeDBClusterNode](~~390136~~) operation to query the names of nodes.
         * <p>
         * 
         * You can also filter the nodes based on their metric values. Valid values:
         * 
         * *   **top10**: the 10 nodes that have the highest metric values.
         * *   **top20**: the 20 nodes that have the highest metric values.
         * *   **bottom10**: the 10 nodes that have the lowest metric values.
         * *   **bottom20**: the 20 nodes that have the lowest metric values.
         */
        public Builder nodes(String nodes) {
            this.putQueryParameter("Nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * The name of the resource group.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the `YYYY-MM-DDTHH:mmZ` format.
         * <p>
         * 
         * > You can query monitoring information only within the last 30 days.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDBClusterPerformanceRequest build() {
            return new DescribeDBClusterPerformanceRequest(this);
        } 

    } 

}
