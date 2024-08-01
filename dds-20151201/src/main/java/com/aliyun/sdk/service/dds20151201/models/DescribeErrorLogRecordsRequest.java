// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeErrorLogRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeErrorLogRecordsRequest</p>
 */
public class DescribeErrorLogRecordsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeErrorLogRecordsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.endTime = builder.endTime;
        this.logicalOperator = builder.logicalOperator;
        this.nodeId = builder.nodeId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryKeywords = builder.queryKeywords;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleType = builder.roleType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeErrorLogRecordsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeErrorLogRecordsRequest, Builder> {
        private String regionId; 
        private String DBInstanceId; 
        private String DBName; 
        private String endTime; 
        private String logicalOperator; 
        private String nodeId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryKeywords; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String roleType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeErrorLogRecordsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.endTime = request.endTime;
            this.logicalOperator = request.logicalOperator;
            this.nodeId = request.nodeId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryKeywords = request.queryKeywords;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * The ID of the instance.
         * <p>
         * 
         * >  If you set this parameter to the ID of a sharded cluster instance, you must also specify the **NodeId** parameter.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * The end of the time range to query. The end time must be later than the start time and within 24 hours from the start time. Specify the time in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The logical relationship between multiple keywords. Valid values:
         * <p>
         * 
         * *   **or**
         * *   **and** (default value)
         */
        public Builder logicalOperator(String logicalOperator) {
            this.putQueryParameter("LogicalOperator", logicalOperator);
            this.logicalOperator = logicalOperator;
            return this;
        }

        /**
         * The ID of the mongos node or shard node whose error logs you want to query in the instance. If the instance is a sharded cluster instance, you must specify this parameter.
         * <p>
         * 
         * >  This parameter is valid only when **DBInstanceId** is set to the ID of a sharded cluster instance.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
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
         * The number of the page to return. The value must be an integer that is greater than 0. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **30** to **100**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The keywords used for query. You can enter up to 10 keywords at a time. If you enter multiple keywords, separate the keywords with spaces.
         */
        public Builder queryKeywords(String queryKeywords) {
            this.putQueryParameter("QueryKeywords", queryKeywords);
            this.queryKeywords = queryKeywords;
            return this;
        }

        /**
         * The ID of the resource group. For more information, see [View basic information of a resource group](~~151181~~).
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
         * The role of the node whose error logs you want to query in the instance. Valid values:
         * <p>
         * 
         * *   **primary**
         * *   **secondary**
         * 
         * >  If you set the **NodeId** parameter to the ID of a mongos node, the RoleType parameter must be set to **primary**.
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeErrorLogRecordsRequest build() {
            return new DescribeErrorLogRecordsRequest(this);
        } 

    } 

}
