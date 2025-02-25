// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeRunningLogRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRunningLogRecordsRequest</p>
 */
public class DescribeRunningLogRecordsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalOperator")
    private String logicalOperator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 30)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryKeywords")
    private String queryKeywords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    private String roleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeRunningLogRecordsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.endTime = builder.endTime;
        this.logicalOperator = builder.logicalOperator;
        this.nodeId = builder.nodeId;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryKeywords = builder.queryKeywords;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleId = builder.roleId;
        this.roleType = builder.roleType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRunningLogRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return logicalOperator
     */
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    /**
     * @return queryKeywords
     */
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeRunningLogRecordsRequest, Builder> {
        private String regionId; 
        private String DBInstanceId; 
        private String DBName; 
        private String endTime; 
        private String logicalOperator; 
        private String nodeId; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryKeywords; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String roleId; 
        private String roleType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRunningLogRecordsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.endTime = request.endTime;
            this.logicalOperator = request.logicalOperator;
            this.nodeId = request.nodeId;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryKeywords = request.queryKeywords;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.roleId = request.roleId;
            this.roleType = request.roleType;
            this.startTime = request.startTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p> If you set this parameter to the ID of a sharded cluster instance, you must also specify the <strong>NodeId</strong> parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bpxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>mongodbtest</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time and within 24 hours from the start time. Otherwise, the query fails.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T13:10Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The logical relationship among multiple keywords.</p>
         * <ul>
         * <li><strong>or</strong></li>
         * <li><strong>and</strong> (default value)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        public Builder logicalOperator(String logicalOperator) {
            this.putQueryParameter("LogicalOperator", logicalOperator);
            this.logicalOperator = logicalOperator;
            return this;
        }

        /**
         * <p>The ID of the mongos node or shard node whose operational logs you want to query in the instance. If the instance is a sharded cluster instance, you must specify this parameter.</p>
         * <blockquote>
         * <p> This parameter is valid only when <strong>DBInstanceId</strong> is set to the ID of a sharded cluster instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d-bpxxxxxxxx</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The order of time in which the operational log entries to return are sorted. Valid values:</p>
         * <ul>
         * <li>asc: The log entries are sorted by time in ascending order.</li>
         * <li>desc: The log entries are sorted by time in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: <strong>30</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The keywords used for query. You can enter up to 10 keywords at a time. If you enter multiple keywords, separate the keywords with spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>test test2</p>
         */
        public Builder queryKeywords(String queryKeywords) {
            this.putQueryParameter("QueryKeywords", queryKeywords);
            this.queryKeywords = queryKeywords;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bpxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The role ID of the node. You can call the <a href="https://help.aliyun.com/document_detail/62134.html">DescribeReplicaSetRole</a> operation to query the role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>651xxxxx</p>
         */
        public Builder roleId(String roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * <p>The role of the node whose error logs you want to query in the instance. Valid values:</p>
         * <ul>
         * <li><strong>primary</strong></li>
         * <li><strong>secondary</strong></li>
         * </ul>
         * <blockquote>
         * <p> If you set the <strong>NodeId</strong> parameter to the ID of a mongos node, the <strong>RoleType</strong> parameter must be set to <strong>primary</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T12:10Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeRunningLogRecordsRequest build() {
            return new DescribeRunningLogRecordsRequest(this);
        } 

    } 

}
