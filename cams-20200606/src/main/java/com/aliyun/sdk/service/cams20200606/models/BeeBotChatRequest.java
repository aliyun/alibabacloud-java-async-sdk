// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BeeBotChatRequest} extends {@link RequestModel}
 *
 * <p>BeeBotChatRequest</p>
 */
public class BeeBotChatRequest extends Request {
    @Body
    @NameInMap("ChatBotInstnaceId")
    @Validation(required = true)
    private String chatBotInstnaceId;

    @Body
    @NameInMap("IntentName")
    private String intentName;

    @Body
    @NameInMap("IsvCode")
    private String isvCode;

    @Body
    @NameInMap("KnowledgeId")
    private String knowledgeId;

    @Body
    @NameInMap("Perspective")
    private java.util.List < String > perspective;

    @Body
    @NameInMap("SenderId")
    private String senderId;

    @Body
    @NameInMap("SenderNick")
    private String senderNick;

    @Body
    @NameInMap("SessionId")
    private String sessionId;

    @Body
    @NameInMap("Utterance")
    @Validation(required = true)
    private String utterance;

    @Body
    @NameInMap("VendorParam")
    private java.util.Map < String, ? > vendorParam;

    private BeeBotChatRequest(Builder builder) {
        super(builder);
        this.chatBotInstnaceId = builder.chatBotInstnaceId;
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
     * @return chatBotInstnaceId
     */
    public String getChatBotInstnaceId() {
        return this.chatBotInstnaceId;
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
        private String chatBotInstnaceId; 
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
            this.chatBotInstnaceId = request.chatBotInstnaceId;
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
         * 发送号码
         */
        public Builder chatBotInstnaceId(String chatBotInstnaceId) {
            this.putBodyParameter("ChatBotInstnaceId", chatBotInstnaceId);
            this.chatBotInstnaceId = chatBotInstnaceId;
            return this;
        }

        /**
         * 对话流中意图名称，若指定此名称，机器人会直接进入此意图做问答
         */
        public Builder intentName(String intentName) {
            this.putBodyParameter("IntentName", intentName);
            this.intentName = intentName;
            return this;
        }

        /**
         * Isv校验码，用于校验子帐号是否由ISV授权
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * 知识库中知识标题ID
         */
        public Builder knowledgeId(String knowledgeId) {
            this.putBodyParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * 视觉编码，用于调用同一知识标题下不同视角的答案
         */
        public Builder perspective(java.util.List < String > perspective) {
            String perspectiveShrink = shrink(perspective, "Perspective", "json");
            this.putBodyParameter("Perspective", perspectiveShrink);
            this.perspective = perspective;
            return this;
        }

        /**
         * 访问者ID。用于识别当前会话中的用户
         */
        public Builder senderId(String senderId) {
            this.putBodyParameter("SenderId", senderId);
            this.senderId = senderId;
            return this;
        }

        /**
         * 当前会话中访问的昵称
         */
        public Builder senderNick(String senderNick) {
            this.putBodyParameter("SenderNick", senderNick);
            this.senderNick = senderNick;
            return this;
        }

        /**
         * 会话ID, 用于标识一个访问者的会话和上下文信息
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * 机器人访问者输入
         */
        public Builder utterance(String utterance) {
            this.putBodyParameter("Utterance", utterance);
            this.utterance = utterance;
            return this;
        }

        /**
         * 用户自定义参数集，可以传入用户自定义参数到圣诞工厂
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
