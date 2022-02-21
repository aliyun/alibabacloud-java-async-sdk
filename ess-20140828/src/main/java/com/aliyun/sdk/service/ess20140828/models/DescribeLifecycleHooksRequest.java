// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLifecycleHooksRequest} extends {@link RequestModel}
 *
 * <p>DescribeLifecycleHooksRequest</p>
 */
public class DescribeLifecycleHooksRequest extends Request {
    @Query
    @NameInMap("LifecycleHookId")
    private java.util.List < String > lifecycleHookId;

    @Query
    @NameInMap("LifecycleHookName")
    private String lifecycleHookName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
    private String scalingGroupId;

    private DescribeLifecycleHooksRequest(Builder builder) {
        super(builder);
        this.lifecycleHookId = builder.lifecycleHookId;
        this.lifecycleHookName = builder.lifecycleHookName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLifecycleHooksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lifecycleHookId
     */
    public java.util.List < String > getLifecycleHookId() {
        return this.lifecycleHookId;
    }

    /**
     * @return lifecycleHookName
     */
    public String getLifecycleHookName() {
        return this.lifecycleHookName;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeLifecycleHooksRequest, Builder> {
        private java.util.List < String > lifecycleHookId; 
        private String lifecycleHookName; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLifecycleHooksRequest response) {
            super(response);
            this.lifecycleHookId = response.lifecycleHookId;
            this.lifecycleHookName = response.lifecycleHookName;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scalingGroupId = response.scalingGroupId;
        } 

        /**
         * LifecycleHookId.
         */
        public Builder lifecycleHookId(java.util.List < String > lifecycleHookId) {
            this.putQueryParameter("LifecycleHookId", lifecycleHookId);
            this.lifecycleHookId = lifecycleHookId;
            return this;
        }

        /**
         * LifecycleHookName.
         */
        public Builder lifecycleHookName(String lifecycleHookName) {
            this.putQueryParameter("LifecycleHookName", lifecycleHookName);
            this.lifecycleHookName = lifecycleHookName;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public DescribeLifecycleHooksRequest build() {
            return new DescribeLifecycleHooksRequest(this);
        } 

    } 

}
