// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeActiveOperationTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeActiveOperationTasksRequest</p>
 */
public class DescribeActiveOperationTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowCancel")
    private Integer allowCancel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowChange")
    private Integer allowChange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeLevel")
    private String changeLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InsName")
    private String insName;

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
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private DescribeActiveOperationTasksRequest(Builder builder) {
        super(builder);
        this.allowCancel = builder.allowCancel;
        this.allowChange = builder.allowChange;
        this.changeLevel = builder.changeLevel;
        this.dbType = builder.dbType;
        this.insName = builder.insName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productId = builder.productId;
        this.region = builder.region;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.status = builder.status;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveOperationTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowCancel
     */
    public Integer getAllowCancel() {
        return this.allowCancel;
    }

    /**
     * @return allowChange
     */
    public Integer getAllowChange() {
        return this.allowChange;
    }

    /**
     * @return changeLevel
     */
    public String getChangeLevel() {
        return this.changeLevel;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return insName
     */
    public String getInsName() {
        return this.insName;
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
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<DescribeActiveOperationTasksRequest, Builder> {
        private Integer allowCancel; 
        private Integer allowChange; 
        private String changeLevel; 
        private String dbType; 
        private String insName; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productId; 
        private String region; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private Integer status; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeActiveOperationTasksRequest request) {
            super(request);
            this.allowCancel = request.allowCancel;
            this.allowChange = request.allowChange;
            this.changeLevel = request.changeLevel;
            this.dbType = request.dbType;
            this.insName = request.insName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productId = request.productId;
            this.region = request.region;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.status = request.status;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The filter condition that is used to return tasks based on the settings of task cancellation. Default value: -1. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: returns all tasks.</li>
         * <li><strong>0</strong>: returns only tasks that cannot be canceled.</li>
         * <li><strong>1</strong>: returns only tasks that can be canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder allowCancel(Integer allowCancel) {
            this.putQueryParameter("AllowCancel", allowCancel);
            this.allowCancel = allowCancel;
            return this;
        }

        /**
         * <p>The filter condition that is used to return tasks based on the settings of the switching time. Default value: -1. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: returns all tasks.</li>
         * <li><strong>0</strong>: returns only tasks for which the switching time cannot be changed.</li>
         * <li><strong>1</strong>: returns only tasks for which the switching time can be changed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder allowChange(Integer allowChange) {
            this.putQueryParameter("AllowChange", allowChange);
            this.allowChange = allowChange;
            return this;
        }

        /**
         * <p>The filter condition that is used to return tasks based on the task level. Default value: all. Valid values:</p>
         * <ul>
         * <li><strong>all</strong>: all types</li>
         * <li><strong>S0</strong>: returns the tasks of the exception fixing level.</li>
         * <li><strong>S1</strong>: returns the tasks of the system O&amp;M level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder changeLevel(String changeLevel) {
            this.putQueryParameter("ChangeLevel", changeLevel);
            this.changeLevel = changeLevel;
            return this;
        }

        /**
         * <p>The type of the database. Default value: all. Valid values: mysql, pgsql, and mssql.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>The name of the instance. You can leave this parameter empty. If you configure this parameter, you can specify the name only of one instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp191w771kd3****</p>
         */
        public Builder insName(String insName) {
            this.putQueryParameter("InsName", insName);
            this.insName = insName;
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
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 25. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the service. Valid values: RDS, POLARDB, MongoDB, and Redis. For RDS instances, set the value to RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder productId(String productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The region ID of the pending event. You can call the DescribeRegions operation to query the most recent region list.</p>
         * <blockquote>
         * <p> The value <strong>all</strong> indicates all regions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The status of the task, which is used as a filter condition to return tasks.</p>
         * <ul>
         * <li><strong>-1</strong>: all tasks</li>
         * <li><strong>3</strong>: pending</li>
         * <li><strong>4</strong>: being processed</li>
         * <li><strong>5</strong>: completed</li>
         * <li><strong>6</strong>: failed</li>
         * <li><strong>7</strong>: canceled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>rds_apsaradb_ha</strong>: primary/secondary switchover</li>
         * <li><strong>rds_apsaradb_transfer</strong>: instance migration</li>
         * <li><strong>rds_apsaradb_upgrade</strong>: update of the minor engine version</li>
         * <li><strong>rds_apsaradb_maxscale</strong>: update of the minor version of the proxy</li>
         * <li><strong>all</strong>: all types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rds_apsaradb_upgrade</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public DescribeActiveOperationTasksRequest build() {
            return new DescribeActiveOperationTasksRequest(this);
        } 

    } 

}
