// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link ChatRequest} extends {@link RequestModel}
 *
 * <p>ChatRequest</p>
 */
public class ChatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentName")
    private String intentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeId")
    private String knowledgeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Perspective")
    private java.util.List<String> perspective;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SandBox")
    private Boolean sandBox;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderId")
    private String senderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderNick")
    private String senderNick;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Utterance")
    private String utterance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VendorParam")
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
    public java.util.List<String> getPerspective() {
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
        private java.util.List<String> perspective; 
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
         * <p>The business space key. If this parameter is not specified, the default business space is accessed. Obtain the key value from the business management page of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The unique chatbot identifier (chatbot ID). Log on to the Chatbot console and navigate to Chatbot Details &gt; Session Interface to view the chatbot instance information and obtain the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-mp90s2lrk00050</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The intent name in the dialog flow. If this name is specified, the chatbot directly enters this intent for Q&amp;A.</p>
         * 
         * <strong>example:</strong>
         * <p>CheckWeatherIntent</p>
         */
        public Builder intentName(String intentName) {
            this.putQueryParameter("IntentName", intentName);
            this.intentName = intentName;
            return this;
        }

        /**
         * <p>The ID of a knowledge title in the knowledge base. If this ID is specified, the chatbot directly returns the answer for the specified knowledge title.</p>
         * 
         * <strong>example:</strong>
         * <p>30002406051</p>
         */
        public Builder knowledgeId(String knowledgeId) {
            this.putQueryParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * <p>The array of perspective codes, which is used to call answers from different perspectives under the same knowledge title. Example: Perspective=[&quot;FZJBY3raWr&quot;]. When using the SDK, use the parameters defined in the SDK.</p>
         */
        public Builder perspective(java.util.List<String> perspective) {
            String perspectiveShrink = shrink(perspective, "Perspective", "json");
            this.putQueryParameter("Perspective", perspectiveShrink);
            this.perspective = perspective;
            return this;
        }

        /**
         * <p>Specifies whether to use the test or production environment. Default value: false (production environment). Valid values:</p>
         * <ul>
         * <li>true: Test environment. This is for testing only. Using it in production may cause instability and QPS throttling.</li>
         * <li>false: Production environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sandBox(Boolean sandBox) {
            this.putQueryParameter("SandBox", sandBox);
            this.sandBox = sandBox;
            return this;
        }

        /**
         * <p>The visitor ID, which identifies the user in the current session.</p>
         * 
         * <strong>example:</strong>
         * <p>custumer_123456</p>
         */
        public Builder senderId(String senderId) {
            this.putQueryParameter("SenderId", senderId);
            this.senderId = senderId;
            return this;
        }

        /**
         * <p>The nickname of the visitor in the current session.</p>
         * 
         * <strong>example:</strong>
         * <p>User123456</p>
         */
        public Builder senderNick(String senderNick) {
            this.putQueryParameter("SenderNick", senderNick);
            this.senderNick = senderNick;
            return this;
        }

        /**
         * <p>The session ID, which identifies a visitor\&quot;s session and maintains context information. For a new visitor, you do not need to pass this field when calling the Chat operation for the first time. The chatbot starts a session and returns the SessionId in the response of the Chat operation. For subsequent conversation turns of the visitor, pass the SessionId of the current session when calling the Chat operation so that the chatbot can continue the conversation based on the SessionId. Maximum length: 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>9c6ebdc6e66f46ecadab3434314f6959</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The input from the chatbot visitor.</p>
         * 
         * <strong>example:</strong>
         * <p>How is the weather today?</p>
         */
        public Builder utterance(String utterance) {
            this.putQueryParameter("Utterance", utterance);
            this.utterance = utterance;
            return this;
        }

        /**
         * <p>A JSON-formatted set of user-defined parameters that can be passed to various dialog engines.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;phone&quot;:123456789}</p>
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
