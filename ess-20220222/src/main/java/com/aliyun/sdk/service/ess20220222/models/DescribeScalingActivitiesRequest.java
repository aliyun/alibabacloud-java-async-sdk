// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeScalingActivitiesRequest} extends {@link RequestModel}
 *
 * <p>DescribeScalingActivitiesRequest</p>
 */
public class DescribeScalingActivitiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceRefreshTaskId")
    private String instanceRefreshTaskId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingActivityIds")
    private java.util.List < String > scalingActivityIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private String statusCode;

    private DescribeScalingActivitiesRequest(Builder builder) {
        super(builder);
        this.instanceRefreshTaskId = builder.instanceRefreshTaskId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingActivityIds = builder.scalingActivityIds;
        this.scalingGroupId = builder.scalingGroupId;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingActivitiesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceRefreshTaskId
     */
    public String getInstanceRefreshTaskId() {
        return this.instanceRefreshTaskId;
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

    /**
     * @return scalingActivityIds
     */
    public java.util.List < String > getScalingActivityIds() {
        return this.scalingActivityIds;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return statusCode
     */
    public String getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder extends Request.Builder<DescribeScalingActivitiesRequest, Builder> {
        private String instanceRefreshTaskId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < String > scalingActivityIds; 
        private String scalingGroupId; 
        private String statusCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScalingActivitiesRequest request) {
            super(request);
            this.instanceRefreshTaskId = request.instanceRefreshTaskId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingActivityIds = request.scalingActivityIds;
            this.scalingGroupId = request.scalingGroupId;
            this.statusCode = request.statusCode;
        } 

        /**
         * InstanceRefreshTaskId.
         */
        public Builder instanceRefreshTaskId(String instanceRefreshTaskId) {
            this.putQueryParameter("InstanceRefreshTaskId", instanceRefreshTaskId);
            this.instanceRefreshTaskId = instanceRefreshTaskId;
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
         * <p>The number of the page to return. Pages start from page 1.</p>
         * <p>Default value: 1.</p>
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
         * <p>The number of entries to return on each page. Maximum value: 50.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the scaling group to which the scaling activity that you want to query belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

        /**
         * <p>The IDs of the scaling activities that you want to query.</p>
         * <blockquote>
         * <p>When you call this operation, you must specify one of the <code>ScalingGroupId</code> and <code>ScalingActivityId.N</code> parameters. Otherwise, an error is reported.</p>
         * </blockquote>
         */
        public Builder scalingActivityIds(java.util.List < String > scalingActivityIds) {
            this.putQueryParameter("ScalingActivityIds", scalingActivityIds);
            this.scalingActivityIds = scalingActivityIds;
            return this;
        }

        /**
         * <p>The ID of the scaling group.</p>
         * <blockquote>
         * <p>When you call this operation, you must specify one of the <code>ScalingGroupId</code> and <code>ScalingActivityId.N</code> parameters. Otherwise, an error is reported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The status of the scaling activity. Valid values:</p>
         * <ul>
         * <li>Successful: The scaling activity is successful.</li>
         * <li>Warning: The scaling activity is partially successful.</li>
         * <li>Failed: The scaling activity failed.</li>
         * <li>InProgress: The scaling activity is in progress.</li>
         * <li>Rejected: The request to trigger the scaling activity is rejected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder statusCode(String statusCode) {
            this.putQueryParameter("StatusCode", statusCode);
            this.statusCode = statusCode;
            return this;
        }

        @Override
        public DescribeScalingActivitiesRequest build() {
            return new DescribeScalingActivitiesRequest(this);
        } 

    } 

}
