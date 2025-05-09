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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
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
         * <p>The action that you want Auto Scaling to perform after the lifecycle hook times out. Valid values:</p>
         * <ul>
         * <li>CONTINUE: Auto Scaling continues to respond to a scale-in or scale-out request.</li>
         * <li>ABANDON: Auto Scaling releases Elastic Compute Service (ECS) instances that are created during scale-out activities or removes ECS instances from the scaling group during scale-in activities.</li>
         * <li>ROLLBACK: For scale-in activities, Auto Scaling rejects the requests to release ECS instances but rolls back ECS instances. For scale-out activities, the ROLLBACK setting has the same effect as the ABANDON setting.</li>
         * </ul>
         * <p>If you do not specify this parameter, Auto Scaling performs the action that is specified by the <code>DefaultResult</code> parameter after the lifecycle hook times out.</p>
         * <p>If multiple lifecycle hooks exist in a scaling group and the lifecycle hooks are triggered at the same time, the following rules apply:</p>
         * <ul>
         * <li>For scale-in activities, when lifecycle hooks whose LifecycleActionResult parameter is set to ABANDON or ROLLBACK time out, other lifecycle hooks time out ahead of schedule.</li>
         * <li>For scale-in and scale-out activities, if you set the LifecycleActionResult parameter for all lifecycle hooks to CONTINUE, Auto Scaling performs the next action only after the last lifecycle hook times out. The action that Auto Scaling performs varies based on the value that you specify for the LifecycleActionResult parameter of the lifecycle hook that last times out.</li>
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
         * <p>The token of the lifecycle action. You can obtain the token from the Simple Message Queue (SMQ, formerly MNS) queue or topic that is specified for the lifecycle hook.</p>
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
