// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatRequest} extends {@link RequestModel}
 *
 * <p>ChatRequest</p>
 */
public class ChatRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("IntentName")
    private String intentName;

    @Query
    @NameInMap("KnowledgeId")
    private String knowledgeId;

    @Query
    @NameInMap("Perspective")
    private java.util.List < String > perspective;

    @Query
    @NameInMap("SandBox")
    private Boolean sandBox;

    @Query
    @NameInMap("SenderId")
    private String senderId;

    @Query
    @NameInMap("SenderNick")
    private String senderNick;

    @Query
    @NameInMap("SessionId")
    private String sessionId;

    @Query
    @NameInMap("Utterance")
    private String utterance;

    @Query
    @NameInMap("VendorParam")
    private String vendorParam;

    private ChatRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.intentName = builder.intentName;
        this.knowledgeId = builder.knowledgeId;
        this.perspective = builder.perspective;
        this.sandBox = builder.sandBox;
        this.senderId = builder.senderId;
        this.senderNick = builder.senderNick;
        this.sessionId = builder.sessionId;
        this.utterance = builder.utterance;
        this.vendorParam = builder.vendorParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return intentName
     */
    public String getIntentName() {
        return this.intentName;
    }

    /**
     * @return knowledgeId
     */
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return perspective
     */
    public java.util.List < String > getPerspective() {
        return this.perspective;
    }

    /**
     * @return sandBox
     */
    public Boolean getSandBox() {
        return this.sandBox;
    }

    /**
     * @return senderId
     */
    public String getSenderId() {
        return this.senderId;
    }

    /**
     * @return senderNick
     */
    public String getSenderNick() {
        return this.senderNick;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return utterance
     */
    public String getUtterance() {
        return this.utterance;
    }

    /**
     * @return vendorParam
     */
    public String getVendorParam() {
        return this.vendorParam;
    }

    public static final class Builder extends Request.Builder<ChatRequest, Builder> {
        private String agentKey; 
        private String instanceId; 
        private String intentName; 
        private String knowledgeId; 
        private java.util.List < String > perspective; 
        private Boolean sandBox; 
        private String senderId; 
        private String senderNick; 
        private String sessionId; 
        private String utterance; 
        private String vendorParam; 

        private Builder() {
            super();
        } 

        private Builder(ChatRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.intentName = request.intentName;
            this.knowledgeId = request.knowledgeId;
            this.perspective = request.perspective;
            this.sandBox = request.sandBox;
            this.senderId = request.senderId;
            this.senderNick = request.senderNick;
            this.sessionId = request.sessionId;
            this.utterance = request.utterance;
            this.vendorParam = request.vendorParam;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IntentName.
         */
        public Builder intentName(String intentName) {
            this.putQueryParameter("IntentName", intentName);
            this.intentName = intentName;
            return this;
        }

        /**
         * KnowledgeId.
         */
        public Builder knowledgeId(String knowledgeId) {
            this.putQueryParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * Perspective.
         */
        public Builder perspective(java.util.List < String > perspective) {
            String perspectiveShrink = shrink(perspective, "Perspective", "json");
            this.putQueryParameter("Perspective", perspectiveShrink);
            this.perspective = perspective;
            return this;
        }

        /**
         * SandBox.
         */
        public Builder sandBox(Boolean sandBox) {
            this.putQueryParameter("SandBox", sandBox);
            this.sandBox = sandBox;
            return this;
        }

        /**
         * SenderId.
         */
        public Builder senderId(String senderId) {
            this.putQueryParameter("SenderId", senderId);
            this.senderId = senderId;
            return this;
        }

        /**
         * SenderNick.
         */
        public Builder senderNick(String senderNick) {
            this.putQueryParameter("SenderNick", senderNick);
            this.senderNick = senderNick;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Utterance.
         */
        public Builder utterance(String utterance) {
            this.putQueryParameter("Utterance", utterance);
            this.utterance = utterance;
            return this;
        }

        /**
         * VendorParam.
         */
        public Builder vendorParam(String vendorParam) {
            this.putQueryParameter("VendorParam", vendorParam);
            this.vendorParam = vendorParam;
            return this;
        }

        @Override
        public ChatRequest build() {
            return new ChatRequest(this);
        } 

    } 

}
