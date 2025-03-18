// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDTHH:mmZ</code> format.</p>
         * <blockquote>
         * <p>The end time must be later than the start time. The maximum time range that can be specified is seven days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-03T15:10Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The performance metric that you want to query. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/86943.html">Performance parameters</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpg_conn_count</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>master</strong>: coordinator node.</li>
         * <li><strong>segment</strong>: compute node.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the performance metrics of all nodes are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>The nodes for which you want to query performance metrics. Separate multiple values with commas (,). Example: <code>master-10******1,master-10******2</code>. You can call the <a href="https://help.aliyun.com/document_detail/390136.html">DescribeDBClusterNode</a> operation to query the names of nodes.</p>
         * <p>You can also filter the nodes based on their metric values. Valid values:</p>
         * <ul>
         * <li><strong>top10</strong>: the 10 nodes that have the highest metric values.</li>
         * <li><strong>top20</strong>: the 20 nodes that have the highest metric values.</li>
         * <li><strong>bottom10</strong>: the 10 nodes that have the lowest metric values.</li>
         * <li><strong>bottom20</strong>: the 20 nodes that have the lowest metric values.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>top10</p>
         */
        public Builder nodes(String nodes) {
            this.putQueryParameter("Nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>testgroup</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDTHH:mmZ</code> format.</p>
         * <blockquote>
         * <p>You can query monitoring information only within the last 30 days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-03T15:00Z</p>
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
