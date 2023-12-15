// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishDialogFlowRequest} extends {@link RequestModel}
 *
 * <p>PublishDialogFlowRequest</p>
 */
public class PublishDialogFlowRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private Long dialogId;

    private PublishDialogFlowRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.dialogId = builder.dialogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishDialogFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return dialogId
     */
    public Long getDialogId() {
        return this.dialogId;
    }

    public static final class Builder extends Request.Builder<PublishDialogFlowRequest, Builder> {
        private String agentKey; 
        private Long dialogId; 

        private Builder() {
            super();
        } 

        private Builder(PublishDialogFlowRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.dialogId = request.dialogId;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * DialogId.
         */
        public Builder dialogId(Long dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
            return this;
        }

        @Override
        public PublishDialogFlowRequest build() {
            return new PublishDialogFlowRequest(this);
        } 

    } 

}
