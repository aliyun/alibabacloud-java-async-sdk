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
 * {@link RecordLifecycleActionHeartbeatRequest} extends {@link RequestModel}
 *
 * <p>RecordLifecycleActionHeartbeatRequest</p>
 */
public class RecordLifecycleActionHeartbeatRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("heartbeatTimeout")
    private Integer heartbeatTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lifecycleActionToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lifecycleActionToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lifecycleHookId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lifecycleHookId;

    private RecordLifecycleActionHeartbeatRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.heartbeatTimeout = builder.heartbeatTimeout;
        this.lifecycleActionToken = builder.lifecycleActionToken;
        this.lifecycleHookId = builder.lifecycleHookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecordLifecycleActionHeartbeatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return heartbeatTimeout
     */
    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
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

    public static final class Builder extends Request.Builder<RecordLifecycleActionHeartbeatRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Integer heartbeatTimeout; 
        private String lifecycleActionToken; 
        private String lifecycleHookId; 

        private Builder() {
            super();
        } 

        private Builder(RecordLifecycleActionHeartbeatRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.heartbeatTimeout = request.heartbeatTimeout;
            this.lifecycleActionToken = request.lifecycleActionToken;
            this.lifecycleHookId = request.lifecycleHookId;
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
         * <p>The wait time configured in the lifecycle hook for the scaling activity. If the wait state times out, the default execution policy is executed. Valid values: 30 to 21600. Unit: seconds.</p>
         * <p>After you create a lifecycle hook, you can call this operation to extend the wait time of the ECS instance, or call the <a href="https://help.aliyun.com/document_detail/459335.html">CompleteLifecycleAction</a> operation to end the wait state of the scaling activity in advance.</p>
         * <p>Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder heartbeatTimeout(Integer heartbeatTimeout) {
            this.putQueryParameter("heartbeatTimeout", heartbeatTimeout);
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        /**
         * <p>The wait state token of the scaling activity. When the instance is suspended, you can obtain this token from the details page of the message received from the MNS queue specified by the lifecycle hook.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/459333.html">DescribeLifecycleActions</a> operation to obtain this token.</p>
         * <p>Alternatively, you can obtain this value from the MNS topic specified by the lifecycle hook.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>F324B880-900E-4968-85DD-81691113****</p>
         */
        public Builder lifecycleActionToken(String lifecycleActionToken) {
            this.putQueryParameter("lifecycleActionToken", lifecycleActionToken);
            this.lifecycleActionToken = lifecycleActionToken;
            return this;
        }

        /**
         * <p>The ID of the lifecycle hook.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ash-bp1fxuqyi98w0aib****</p>
         */
        public Builder lifecycleHookId(String lifecycleHookId) {
            this.putQueryParameter("lifecycleHookId", lifecycleHookId);
            this.lifecycleHookId = lifecycleHookId;
            return this;
        }

        @Override
        public RecordLifecycleActionHeartbeatRequest build() {
            return new RecordLifecycleActionHeartbeatRequest(this);
        } 

    } 

}
