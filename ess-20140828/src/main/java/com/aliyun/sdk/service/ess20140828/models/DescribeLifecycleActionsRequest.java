// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLifecycleActionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeLifecycleActionsRequest</p>
 */
public class DescribeLifecycleActionsRequest extends Request {
    @Query
    @NameInMap("LifecycleActionStatus")
    private String lifecycleActionStatus;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingActivityId")
    @Validation(required = true)
    private String scalingActivityId;

    private DescribeLifecycleActionsRequest(Builder builder) {
        super(builder);
        this.lifecycleActionStatus = builder.lifecycleActionStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerId = builder.ownerId;
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
        private String resourceOwnerAccount; 
        private String scalingActivityId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLifecycleActionsRequest response) {
            super(response);
            this.lifecycleActionStatus = response.lifecycleActionStatus;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scalingActivityId = response.scalingActivityId;
        } 

        /**
         * LifecycleActionStatus.
         */
        public Builder lifecycleActionStatus(String lifecycleActionStatus) {
            this.putQueryParameter("LifecycleActionStatus", lifecycleActionStatus);
            this.lifecycleActionStatus = lifecycleActionStatus;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ScalingActivityId.
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
