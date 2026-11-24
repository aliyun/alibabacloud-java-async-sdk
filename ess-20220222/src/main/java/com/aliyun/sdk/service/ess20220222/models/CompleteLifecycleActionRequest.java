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
 * {@link CompleteLifecycleActionRequest} extends {@link RequestModel}
 *
 * <p>CompleteLifecycleActionRequest</p>
 */
public class CompleteLifecycleActionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleActionResult")
    private String lifecycleActionResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleActionToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lifecycleActionToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleHookId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lifecycleHookId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private CompleteLifecycleActionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.lifecycleActionResult = builder.lifecycleActionResult;
        this.lifecycleActionToken = builder.lifecycleActionToken;
        this.lifecycleHookId = builder.lifecycleHookId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteLifecycleActionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return lifecycleActionResult
     */
    public String getLifecycleActionResult() {
        return this.lifecycleActionResult;
    }

    /**
     * @return lifecycleActionToken
     */
    public String getLifecycleActionToken() {
        return this.lifecycleActionToken;
    }

    /**
     * @return lifecycleHookId
     */
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
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

    public static final class Builder extends Request.Builder<CompleteLifecycleActionRequest, Builder> {
        private String clientToken; 
        private String lifecycleActionResult; 
        private String lifecycleActionToken; 
        private String lifecycleHookId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(CompleteLifecycleActionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.lifecycleActionResult = request.lifecycleActionResult;
            this.lifecycleActionToken = request.lifecycleActionToken;
            this.lifecycleHookId = request.lifecycleHookId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * <p>Ensures the idempotence of the request.</p>
         * <p>You can generate a parameter value from your client to ensure that the value is unique across different requests. The value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The next action to perform after the wait state of the lifecycle hook ends. Valid values:</p>
         * <ul>
         * <li>CONTINUE: Continues the scale-out activity and adds the ECS instance to the scaling group, or continues the scale-in activity and removes the ECS instance from the scaling group.</li>
         * <li>ABANDON: Terminates the scale-out activity and releases the created ECS instance, or continues the scale-in activity and removes the ECS instance from the scaling group.</li>
         * <li>ROLLBACK: Rejects the release of the ECS instance and performs a rollback for a scale-in activity. For a scale-out activity, the effect is the same as ABANDON.</li>
         * </ul>
         * <p>If you do not specify this parameter, the next action after the wait state of the lifecycle hook ends remains the <code>DefaultResult</code> value configured for the lifecycle hook.</p>
         * <p>If multiple lifecycle hooks exist in the scaling group and are triggered simultaneously, the final next action is determined as follows:</p>
         * <ul>
         * <li>For a scale-in activity, when the wait state triggered by an ABANDON or ROLLBACK lifecycle hook ends, the wait states of subsequent lifecycle hooks are ended in advance.</li>
         * <li>If the lifecycle hook that suspends the scale-in activity is of the CONTINUE type, or for a scale-out activity, subsequent lifecycle hooks continue to suspend the scaling activity until the wait state triggered by the last lifecycle hook ends. The final next action is determined by the type of the last lifecycle hook that ends the wait state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        public Builder lifecycleActionResult(String lifecycleActionResult) {
            this.putQueryParameter("LifecycleActionResult", lifecycleActionResult);
            this.lifecycleActionResult = lifecycleActionResult;
            return this;
        }

        /**
         * <p>The identifier of the wait state for the scaling activity. You can obtain this value from the Message Service (MNS) queue or MNS topic specified by the lifecycle hook.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aaaa-bbbbb-cccc-ddddd</p>
         */
        public Builder lifecycleActionToken(String lifecycleActionToken) {
            this.putQueryParameter("LifecycleActionToken", lifecycleActionToken);
            this.lifecycleActionToken = lifecycleActionToken;
            return this;
        }

        /**
         * <p>The ID of the lifecycle hook.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ash-bp14g3ee6bt3sc98****</p>
         */
        public Builder lifecycleHookId(String lifecycleHookId) {
            this.putQueryParameter("LifecycleHookId", lifecycleHookId);
            this.lifecycleHookId = lifecycleHookId;
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

        @Override
        public CompleteLifecycleActionRequest build() {
            return new CompleteLifecycleActionRequest(this);
        } 

    } 

}
