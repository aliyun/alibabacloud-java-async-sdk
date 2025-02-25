// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DescribeLifecycleActionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeLifecycleActionsRequest</p>
 */
public class DescribeLifecycleActionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleActionStatus")
    private String lifecycleActionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingActivityId;

    private DescribeLifecycleActionsRequest(Builder builder) {
        super(builder);
        this.lifecycleActionStatus = builder.lifecycleActionStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLifecycleActionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lifecycleActionStatus
     */
    public String getLifecycleActionStatus() {
        return this.lifecycleActionStatus;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return scalingActivityId
     */
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public static final class Builder extends Request.Builder<DescribeLifecycleActionsRequest, Builder> {
        private String lifecycleActionStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingActivityId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLifecycleActionsRequest request) {
            super(request);
            this.lifecycleActionStatus = request.lifecycleActionStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingActivityId = request.scalingActivityId;
        } 

        /**
         * <p>The status of the lifecycle action. Valid values:</p>
         * <ul>
         * <li>If a lifecycle action is in the Pending state, Elastic Compute Service (ECS) instances are waiting to be added to a scaling group or waiting to be removed from a scaling group.</li>
         * <li>If a lifecycle action is in the Timeout state, the lifecycle hook that triggers the lifecycle action ends, and ECS instances are added to or removed from the scaling group.</li>
         * <li>If a lifecycle action is in the Completed state, you manually end the lifecycle hook that triggers the lifecycle action ahead of schedule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        public Builder lifecycleActionStatus(String lifecycleActionStatus) {
            this.putQueryParameter("LifecycleActionStatus", lifecycleActionStatus);
            this.lifecycleActionStatus = lifecycleActionStatus;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page. Valid values: 1 to 50.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to specify the lifecycle action from which the query starts.</p>
         * <p>For example, after the first 10 lifecycle actions are queried, the query starts from the 11th lifecycle action. Set this parameter to the NextToken value that is returned in the previous API call. If you do not specify this parameter, the query starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAcSz4VTb1Nq****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * <p>The region ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
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
         * <p>The ID of the scaling activity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-bp17mug9t0pegagw****</p>
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.putQueryParameter("ScalingActivityId", scalingActivityId);
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        @Override
        public DescribeLifecycleActionsRequest build() {
            return new DescribeLifecycleActionsRequest(this);
        } 

    } 

}
