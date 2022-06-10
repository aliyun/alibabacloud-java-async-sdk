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
            this.senderId = request.senderId;
            this.senderNick = request.senderNick;
            this.sessionId = request.sessionId;
            this.utterance = request.utterance;
            this.vendorParam = request.vendorParam;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * 机器人实例ID。登录云小蜜控制台，机器人详情->会话接口，查看机器人实例信息，可获得该实例ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 对话流中意图名称。 若指定此名称，机器人会直接进入此意图做问答
         */
        public Builder intentName(String intentName) {
            this.putQueryParameter("IntentName", intentName);
            this.intentName = intentName;
            return this;
        }

        /**
         * 知识库中知识标题的ID。若指定此ID，那么机器人会直接返回指定知识标题的答案
         */
        public Builder knowledgeId(String knowledgeId) {
            this.putQueryParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * 视角编码，用于调用同一知识标题下不同视角的答案。如：Perspective=["FZJBY3raWr"]。使用SDK时以SDK中定义的参数为准
         */
        public Builder perspective(java.util.List < String > perspective) {
            String perspectiveShrink = shrink(perspective, "Perspective", "json");
            this.putQueryParameter("Perspective", perspectiveShrink);
            this.perspective = perspective;
            return this;
        }

        /**
         * 访问者ID。用于识别当前会话中的用户
         */
        public Builder senderId(String senderId) {
            this.putQueryParameter("SenderId", senderId);
            this.senderId = senderId;
            return this;
        }

        /**
         * 当前会话中访问的昵称
         */
        public Builder senderNick(String senderNick) {
            this.putQueryParameter("SenderNick", senderNick);
            this.senderNick = senderNick;
            return this;
        }

        /**
         * 会话ID，用于标识一个访问者的会话和保持上下文信息。对于一个新的访问者，首次调用Chat接口时无需传递此字段，机器人会开启一个会话，并在Chat接口的响应中返回该会话的SessionId。对于该访问者的后续轮次的会话，调用Chat接口时传递当前会话的SessionId，机器人即可基于SessionId继续该轮次会话。长度限制是64个字符
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * 机器人访问者的输入
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
