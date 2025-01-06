// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link BeginDialogueRequest} extends {@link RequestModel}
 *
 * <p>BeginDialogueRequest</p>
 */
public class BeginDialogueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitialContext")
    private String initialContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceOwnerId")
    private Long instanceOwnerId;

    private BeginDialogueRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.conversationId = builder.conversationId;
        this.initialContext = builder.initialContext;
        this.instanceId = builder.instanceId;
        this.instanceOwnerId = builder.instanceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BeginDialogueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return initialContext
     */
    public String getInitialContext() {
        return this.initialContext;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceOwnerId
     */
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public static final class Builder extends Request.Builder<BeginDialogueRequest, Builder> {
        private String calledNumber; 
        private String callingNumber; 
        private String conversationId; 
        private String initialContext; 
        private String instanceId; 
        private Long instanceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(BeginDialogueRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.callingNumber = request.callingNumber;
            this.conversationId = request.conversationId;
            this.initialContext = request.initialContext;
            this.instanceId = request.instanceId;
            this.instanceOwnerId = request.instanceOwnerId;
        } 

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1358158****</p>
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c28fc549-d88f-4f6e-85ad-a0806e5e39c0</p>
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * InitialContext.
         */
        public Builder initialContext(String initialContext) {
            this.putQueryParameter("InitialContext", initialContext);
            this.initialContext = initialContext;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4d7db6670b8e41b5adb1f21560ea9272</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceOwnerId.
         */
        public Builder instanceOwnerId(Long instanceOwnerId) {
            this.putQueryParameter("InstanceOwnerId", instanceOwnerId);
            this.instanceOwnerId = instanceOwnerId;
            return this;
        }

        @Override
        public BeginDialogueRequest build() {
            return new BeginDialogueRequest(this);
        } 

    } 

}
