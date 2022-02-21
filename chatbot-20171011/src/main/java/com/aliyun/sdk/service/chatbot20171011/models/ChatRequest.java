// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

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
    @NameInMap("InstanceId")
    @Validation(required = true)
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
    @NameInMap("Recommend")
    private Boolean recommend;

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
    @NameInMap("Tag")
    private String tag;

    @Query
    @NameInMap("Utterance")
    @Validation(required = true)
    private String utterance;

    @Query
    @NameInMap("VendorParam")
    private String vendorParam;

    private ChatRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.intentName = builder.intentName;
        this.knowledgeId = builder.knowledgeId;
        this.perspective = builder.perspective;
        this.recommend = builder.recommend;
        this.senderId = builder.senderId;
        this.senderNick = builder.senderNick;
        this.sessionId = builder.sessionId;
        this.tag = builder.tag;
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
     * @return recommend
     */
    public Boolean getRecommend() {
        return this.recommend;
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
     * @return tag
     */
    public String getTag() {
        return this.tag;
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
        private String instanceId; 
        private String intentName; 
        private String knowledgeId; 
        private java.util.List < String > perspective; 
        private Boolean recommend; 
        private String senderId; 
        private String senderNick; 
        private String sessionId; 
        private String tag; 
        private String utterance; 
        private String vendorParam; 

        private Builder() {
            super();
        } 

        private Builder(ChatRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.intentName = response.intentName;
            this.knowledgeId = response.knowledgeId;
            this.perspective = response.perspective;
            this.recommend = response.recommend;
            this.senderId = response.senderId;
            this.senderNick = response.senderNick;
            this.sessionId = response.sessionId;
            this.tag = response.tag;
            this.utterance = response.utterance;
            this.vendorParam = response.vendorParam;
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
            this.putQueryParameter("Perspective", perspective);
            this.perspective = perspective;
            return this;
        }

        /**
         * Recommend.
         */
        public Builder recommend(Boolean recommend) {
            this.putQueryParameter("Recommend", recommend);
            this.recommend = recommend;
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
         * Tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
