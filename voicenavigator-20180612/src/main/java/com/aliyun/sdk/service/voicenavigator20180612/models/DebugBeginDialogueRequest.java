// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebugBeginDialogueRequest} extends {@link RequestModel}
 *
 * <p>DebugBeginDialogueRequest</p>
 */
public class DebugBeginDialogueRequest extends Request {
    @Query
    @NameInMap("CalledNumber")
    private String calledNumber;

    @Query
    @NameInMap("CallingNumber")
    @Validation(required = true)
    private String callingNumber;

    @Query
    @NameInMap("ConversationId")
    @Validation(required = true)
    private String conversationId;

    @Query
    @NameInMap("InitialContext")
    private String initialContext;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DebugBeginDialogueRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.conversationId = builder.conversationId;
        this.initialContext = builder.initialContext;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugBeginDialogueRequest create() {
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

    public static final class Builder extends Request.Builder<DebugBeginDialogueRequest, Builder> {
        private String calledNumber; 
        private String callingNumber; 
        private String conversationId; 
        private String initialContext; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DebugBeginDialogueRequest response) {
            super(response);
            this.calledNumber = response.calledNumber;
            this.callingNumber = response.callingNumber;
            this.conversationId = response.conversationId;
            this.initialContext = response.initialContext;
            this.instanceId = response.instanceId;
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
         * CallingNumber.
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * ConversationId.
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DebugBeginDialogueRequest build() {
            return new DebugBeginDialogueRequest(this);
        } 

    } 

}
