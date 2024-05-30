// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BeeBotChatRequest} extends {@link RequestModel}
 *
 * <p>BeeBotChatRequest</p>
 */
public class BeeBotChatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChatBotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chatBotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntentName")
    private String intentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsvCode")
    private String isvCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeId")
    private String knowledgeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Perspective")
    private java.util.List < String > perspective;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SenderId")
    private String senderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SenderNick")
    private String senderNick;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Utterance")
    @com.aliyun.core.annotation.Validation(required = true)
    private String utterance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VendorParam")
    private java.util.Map < String, ? > vendorParam;

    private BeeBotChatRequest(Builder builder) {
        super(builder);
        this.chatBotInstanceId = builder.chatBotInstanceId;
        this.custSpaceId = builder.custSpaceId;
        this.intentName = builder.intentName;
        this.isvCode = builder.isvCode;
        this.knowledgeId = builder.knowledgeId;
        this.perspective = builder.perspective;
        this.senderId = builder.senderId;
        this.senderNick = builder.senderNick;
        this.sessionId = builder.sessionId;
        this.utterance = builder.utterance;
        this.vendorParam = builder.vendorParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BeeBotChatRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatBotInstanceId
     */
    public String getChatBotInstanceId() {
        return this.chatBotInstanceId;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return intentName
     */
    public String getIntentName() {
        return this.intentName;
    }

    /**
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
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
    public java.util.Map < String, ? > getVendorParam() {
        return this.vendorParam;
    }

    public static final class Builder extends Request.Builder<BeeBotChatRequest, Builder> {
        private String chatBotInstanceId; 
        private String custSpaceId; 
        private String intentName; 
        private String isvCode; 
        private String knowledgeId; 
        private java.util.List < String > perspective; 
        private String senderId; 
        private String senderNick; 
        private String sessionId; 
        private String utterance; 
        private java.util.Map < String, ? > vendorParam; 

        private Builder() {
            super();
        } 

        private Builder(BeeBotChatRequest request) {
            super(request);
            this.chatBotInstanceId = request.chatBotInstanceId;
            this.custSpaceId = request.custSpaceId;
            this.intentName = request.intentName;
            this.isvCode = request.isvCode;
            this.knowledgeId = request.knowledgeId;
            this.perspective = request.perspective;
            this.senderId = request.senderId;
            this.senderNick = request.senderNick;
            this.sessionId = request.sessionId;
            this.utterance = request.utterance;
            this.vendorParam = request.vendorParam;
        } 

        /**
         * The ID of the bot instance.
         */
        public Builder chatBotInstanceId(String chatBotInstanceId) {
            this.putBodyParameter("ChatBotInstanceId", chatBotInstanceId);
            this.chatBotInstanceId = chatBotInstanceId;
            return this;
        }

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The name of the intent in the dialog flow. When this parameter is specified, the bot conducts a Q\&A based on the intent.
         */
        public Builder intentName(String intentName) {
            this.putBodyParameter("IntentName", intentName);
            this.intentName = intentName;
            return this;
        }

        /**
         * The ISV verification code, which is used to verify whether the user is authorized by the ISV account.
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * The ID of the knowledge title in the knowledge base.
         */
        public Builder knowledgeId(String knowledgeId) {
            this.putBodyParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * The list of codes for answers from different perspectives.
         */
        public Builder perspective(java.util.List < String > perspective) {
            String perspectiveShrink = shrink(perspective, "Perspective", "json");
            this.putBodyParameter("Perspective", perspectiveShrink);
            this.perspective = perspective;
            return this;
        }

        /**
         * The ID of the visitor, which is used to identify users in the current session.
         */
        public Builder senderId(String senderId) {
            this.putBodyParameter("SenderId", senderId);
            this.senderId = senderId;
            return this;
        }

        /**
         * The nickname of the visitor in the current session.
         */
        public Builder senderNick(String senderNick) {
            this.putBodyParameter("SenderNick", senderNick);
            this.senderNick = senderNick;
            return this;
        }

        /**
         * The ID of the session, which is used to identify the session and store context information of the session.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * The input of the visitor.
         */
        public Builder utterance(String utterance) {
            this.putBodyParameter("Utterance", utterance);
            this.utterance = utterance;
            return this;
        }

        /**
         * The user-defined parameter set in JSON format. You can specify user-defined parameters for conversation engines.
         */
        public Builder vendorParam(java.util.Map < String, ? > vendorParam) {
            String vendorParamShrink = shrink(vendorParam, "VendorParam", "json");
            this.putBodyParameter("VendorParam", vendorParamShrink);
            this.vendorParam = vendorParam;
            return this;
        }

        @Override
        public BeeBotChatRequest build() {
            return new BeeBotChatRequest(this);
        } 

    } 

}
