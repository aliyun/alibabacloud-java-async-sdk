// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScheduledTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeScheduledTasksRequest</p>
 */
public class DescribeScheduledTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledAction")
    private java.util.List < String > scheduledAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledTaskId")
    private java.util.List < String > scheduledTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledTaskName")
    private java.util.List < String > scheduledTaskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeScheduledTasksRequest(Builder builder) {
        super(builder);
        this.scheduledAction = builder.scheduledAction;
        this.scheduledTaskId = builder.scheduledTaskId;
        this.scheduledTaskName = builder.scheduledTaskName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScheduledTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scheduledAction
     */
    public java.util.List < String > getScheduledAction() {
        return this.scheduledAction;
    }

    /**
     * @return scheduledTaskId
     */
    public java.util.List < String > getScheduledTaskId() {
        return this.scheduledTaskId;
    }

    /**
     * @return scheduledTaskName
     */
    public java.util.List < String > getScheduledTaskName() {
        return this.scheduledTaskName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DescribeScheduledTasksRequest, Builder> {
        private java.util.List < String > scheduledAction; 
        private java.util.List < String > scheduledTaskId; 
        private java.util.List < String > scheduledTaskName; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScheduledTasksRequest request) {
            super(request);
            this.scheduledAction = request.scheduledAction;
            this.scheduledTaskId = request.scheduledTaskId;
            this.scheduledTaskName = request.scheduledTaskName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * ScheduledAction.
         */
        public Builder scheduledAction(java.util.List < String > scheduledAction) {
            this.putQueryParameter("ScheduledAction", scheduledAction);
            this.scheduledAction = scheduledAction;
            return this;
        }

        /**
         * ScheduledTaskId.
         */
        public Builder scheduledTaskId(java.util.List < String > scheduledTaskId) {
            this.putQueryParameter("ScheduledTaskId", scheduledTaskId);
            this.scheduledTaskId = scheduledTaskId;
            return this;
        }

        /**
         * ScheduledTaskName.
         */
        public Builder scheduledTaskName(java.util.List < String > scheduledTaskName) {
            this.putQueryParameter("ScheduledTaskName", scheduledTaskName);
            this.scheduledTaskName = scheduledTaskName;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        @Override
        public DescribeScheduledTasksRequest build() {
            return new DescribeScheduledTasksRequest(this);
        } 

    } 

}
