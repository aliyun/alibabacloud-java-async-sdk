// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveOperationTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeActiveOperationTasksRequest</p>
 */
public class DescribeActiveOperationTasksRequest extends Request {
    @Query
    @NameInMap("AllowCancel")
    private Integer allowCancel;

    @Query
    @NameInMap("AllowChange")
    private Integer allowChange;

    @Query
    @NameInMap("ChangeLevel")
    private String changeLevel;

    @Query
    @NameInMap("DbType")
    private String dbType;

    @Query
    @NameInMap("InsName")
    private String insName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @Query
    @NameInMap("ProductId")
    private String productId;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("TaskType")
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
            this.status = request.status;
            this.taskType = request.taskType;
        } 

        /**
         * Specifies whether to allow the cancellation operation. Valid values:
         * <p>
         * 
         * *   **0**: The cancellation operation is not allowed.
         * *   **1**: The cancellation operation is allowed.
         */
        public Builder allowCancel(Integer allowCancel) {
            this.putQueryParameter("AllowCancel", allowCancel);
            this.allowCancel = allowCancel;
            return this;
        }

        /**
         * Specifies whether to allow the modification operation. Valid values:
         * <p>
         * 
         * *   **0**: The modification operation is not allowed.
         * *   **1**: The modification operation is allowed.
         */
        public Builder allowChange(Integer allowChange) {
            this.putQueryParameter("AllowChange", allowChange);
            this.allowChange = allowChange;
            return this;
        }

        /**
         * The type of task configuration change. Valid values:
         * <p>
         * 
         * *   **all** (default): The configurations of all O\&M tasks are changed.
         * *   **S0**: The configurations of tasks initiated to fix exceptions are changed.
         * *   **S1**: The configurations of system O\&M tasks are changed.
         */
        public Builder changeLevel(String changeLevel) {
            this.putQueryParameter("ChangeLevel", changeLevel);
            this.changeLevel = changeLevel;
            return this;
        }

        /**
         * The type of the database engine.
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * The name of the instance.
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
         * The page number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **30, 50, and 100**. Default value: **30**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the service.
         */
        public Builder productId(String productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * The region ID of the instance.
         * <p>
         * 
         * >  If you set the Region parameter to **all**, all tasks created within your Alibaba Cloud account are queried. In this case, you must set the **taskType** parameter to **all**.
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
         * The status of the task. Valid values:
         * <p>
         * 
         * *   **0**: waiting for execution
         * *   **1**: being executed
         * *   **2**: successful
         * *   **3**: failed
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The task type.
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
