// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ModifyConsumerGroupPasswordRequest} extends {@link RequestModel}
 *
 * <p>ModifyConsumerGroupPasswordRequest</p>
 */
public class ModifyConsumerGroupPasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupName")
    private String consumerGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupUserName")
    private String consumerGroupUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumerGroupNewPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupNewPassword;

    private ModifyConsumerGroupPasswordRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.consumerGroupID = builder.consumerGroupID;
        this.consumerGroupName = builder.consumerGroupName;
        this.consumerGroupPassword = builder.consumerGroupPassword;
        this.consumerGroupUserName = builder.consumerGroupUserName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
        this.consumerGroupNewPassword = builder.consumerGroupNewPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyConsumerGroupPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return consumerGroupID
     */
    public String getConsumerGroupID() {
        return this.consumerGroupID;
    }

    /**
     * @return consumerGroupName
     */
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * @return consumerGroupPassword
     */
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    /**
     * @return consumerGroupUserName
     */
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    /**
     * @return consumerGroupNewPassword
     */
    public String getConsumerGroupNewPassword() {
        return this.consumerGroupNewPassword;
    }

    public static final class Builder extends Request.Builder<ModifyConsumerGroupPasswordRequest, Builder> {
        private String accountId; 
        private String consumerGroupID; 
        private String consumerGroupName; 
        private String consumerGroupPassword; 
        private String consumerGroupUserName; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String subscriptionInstanceId; 
        private String consumerGroupNewPassword; 

        private Builder() {
            super();
        } 

        private Builder(ModifyConsumerGroupPasswordRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.consumerGroupID = request.consumerGroupID;
            this.consumerGroupName = request.consumerGroupName;
            this.consumerGroupPassword = request.consumerGroupPassword;
            this.consumerGroupUserName = request.consumerGroupUserName;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.subscriptionInstanceId = request.subscriptionInstanceId;
            this.consumerGroupNewPassword = request.consumerGroupNewPassword;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The ID of the consumer group. You can call the <a href="https://help.aliyun.com/document_detail/122886.html">DescribeConsumerGroup</a> operation to query the consumer group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtswc411cg617p****</p>
         */
        public Builder consumerGroupID(String consumerGroupID) {
            this.putQueryParameter("ConsumerGroupID", consumerGroupID);
            this.consumerGroupID = consumerGroupID;
            return this;
        }

        /**
         * <p>The name of the consumer group. The name cannot exceed 128 characters in length. We recommend that you use an informative name for easy identification.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        public Builder consumerGroupName(String consumerGroupName) {
            this.putQueryParameter("ConsumerGroupName", consumerGroupName);
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        /**
         * <p>The new password of the consumer group.</p>
         * <ul>
         * <li>A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>A password must be 8 to 32 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        public Builder consumerGroupPassword(String consumerGroupPassword) {
            this.putQueryParameter("ConsumerGroupPassword", consumerGroupPassword);
            this.consumerGroupPassword = consumerGroupPassword;
            return this;
        }

        /**
         * <p>The username of the consumer group. You can call the <a href="https://help.aliyun.com/document_detail/122886.html">DescribeConsumerGroup</a> operation to query the username.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        public Builder consumerGroupUserName(String consumerGroupUserName) {
            this.putQueryParameter("ConsumerGroupUserName", consumerGroupUserName);
            this.consumerGroupUserName = consumerGroupUserName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the change tracking instance. You can call the <strong>DescribeSubscriptionInstances</strong> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsg2m10r1x15a****</p>
         */
        public Builder subscriptionInstanceId(String subscriptionInstanceId) {
            this.putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }

        /**
         * <p>The new password of the consumer group.</p>
         * <ul>
         * <li>A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>A password must be 8 to 32 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test654321</p>
         */
        public Builder consumerGroupNewPassword(String consumerGroupNewPassword) {
            this.putQueryParameter("consumerGroupNewPassword", consumerGroupNewPassword);
            this.consumerGroupNewPassword = consumerGroupNewPassword;
            return this;
        }

        @Override
        public ModifyConsumerGroupPasswordRequest build() {
            return new ModifyConsumerGroupPasswordRequest(this);
        } 

    } 

}
