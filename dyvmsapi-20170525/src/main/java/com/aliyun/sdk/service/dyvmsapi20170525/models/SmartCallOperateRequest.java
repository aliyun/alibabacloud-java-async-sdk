// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SmartCallOperateRequest} extends {@link RequestModel}
 *
 * <p>SmartCallOperateRequest</p>
 */
public class SmartCallOperateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Command")
    @com.aliyun.core.annotation.Validation(required = true)
    private String command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private SmartCallOperateRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.command = builder.command;
        this.ownerId = builder.ownerId;
        this.param = builder.param;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartCallOperateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
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

    public static final class Builder extends Request.Builder<SmartCallOperateRequest, Builder> {
        private String callId; 
        private String command; 
        private Long ownerId; 
        private String param; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SmartCallOperateRequest request) {
            super(request);
            this.callId = request.callId;
            this.command = request.command;
            this.ownerId = request.ownerId;
            this.param = request.param;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The unique receipt ID of the call. You can call the <a href="https://help.aliyun.com/document_detail/393526.html">SmartCall</a> operation to obtain the receipt ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>116012854210^1028142****</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>The action that is initiated to the called number of an outbound robocall.</p>
         * <blockquote>
         * <p>Only the value <strong>parallelBridge</strong> is supported. This value indicates that a bridge action is initiated between a called number and an agent of the call center.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>parallelBridge</p>
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
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
         * <p>The extended field.</p>
         * 
         * <strong>example:</strong>
         * <p>Param</p>
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
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
        public SmartCallOperateRequest build() {
            return new SmartCallOperateRequest(this);
        } 

    } 

}
