// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateChatbotInstanceRequest} extends {@link RequestModel}
 *
 * <p>AssociateChatbotInstanceRequest</p>
 */
public class AssociateChatbotInstanceRequest extends Request {
    @Query
    @NameInMap("ChatbotInstanceId")
    @Validation(required = true)
    private String chatbotInstanceId;

    @Query
    @NameInMap("ChatbotName")
    private String chatbotName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private AssociateChatbotInstanceRequest(Builder builder) {
        super(builder);
        this.chatbotInstanceId = builder.chatbotInstanceId;
        this.chatbotName = builder.chatbotName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateChatbotInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatbotInstanceId
     */
    public String getChatbotInstanceId() {
        return this.chatbotInstanceId;
    }

    /**
     * @return chatbotName
     */
    public String getChatbotName() {
        return this.chatbotName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<AssociateChatbotInstanceRequest, Builder> {
        private String chatbotInstanceId; 
        private String chatbotName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateChatbotInstanceRequest response) {
            super(response);
            this.chatbotInstanceId = response.chatbotInstanceId;
            this.chatbotName = response.chatbotName;
            this.instanceId = response.instanceId;
        } 

        /**
         * ChatbotInstanceId.
         */
        public Builder chatbotInstanceId(String chatbotInstanceId) {
            this.putQueryParameter("ChatbotInstanceId", chatbotInstanceId);
            this.chatbotInstanceId = chatbotInstanceId;
            return this;
        }

        /**
         * ChatbotName.
         */
        public Builder chatbotName(String chatbotName) {
            this.putQueryParameter("ChatbotName", chatbotName);
            this.chatbotName = chatbotName;
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
        public AssociateChatbotInstanceRequest build() {
            return new AssociateChatbotInstanceRequest(this);
        } 

    } 

}
