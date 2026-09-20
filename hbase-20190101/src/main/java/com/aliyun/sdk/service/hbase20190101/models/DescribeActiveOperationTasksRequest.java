// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
         * <p>Specifies whether the task can be canceled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task cannot be canceled.</li>
         * <li><strong>1</strong>: The task can be canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder allowCancel(Integer allowCancel) {
            this.putQueryParameter("AllowCancel", allowCancel);
            this.allowCancel = allowCancel;
            return this;
        }

        /**
         * <p>Specifies whether the time can be modified. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The time cannot be modified.</li>
         * <li><strong>1</strong>: The time can be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder allowChange(Integer allowChange) {
            this.putQueryParameter("AllowChange", allowChange);
            this.allowChange = allowChange;
            return this;
        }

        /**
         * <p>The change level. Valid values:</p>
         * <ul>
         * <li><strong>S0</strong>: Exception fix.</li>
         * <li><strong>S1</strong>: System O&amp;M.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        public Builder changeLevel(String changeLevel) {
            this.putQueryParameter("ChangeLevel", changeLevel);
            this.changeLevel = changeLevel;
            return this;
        }

        /**
         * <p>The database type. Valid values:</p>
         * <ul>
         * <li><strong>hbaseue</strong>: ApsaraDB for HBase Enhanced Edition.</li>
         * <li><strong>hbase</strong>: ApsaraDB for HBase Standard Edition.</li>
         * <li><strong>bds</strong>: BDS data synchronization service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hbaseue</p>
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>The HBase instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp150tns0sjxs****</p>
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
         * <p>The page number. The value must be greater than <strong>0</strong> and cannot exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
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
         * <p>The maximum number of records that can be displayed per page. The value must be greater than <strong>10</strong>. Default value: <strong>30</strong>.</p>
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
         * <p>The product name. Default value: <strong>hbase</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>hbase</p>
         */
        public Builder productId(String productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The region ID of the event to be processed. You can call <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> to obtain the region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The task running status. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Waiting for the user to specify a time.</li>
         * <li><strong>3</strong>: Waiting for processing.</li>
         * <li><strong>4</strong>: Processing.</li>
         * <li><strong>5</strong>: Succeeded.</li>
         * <li><strong>6</strong>: Failed.</li>
         * <li><strong>7</strong>: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The task type. Set the value to <strong>rds_apsaradb_upgrade</strong>, which indicates a minor version upgrade.</p>
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
