// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasclaw20260626.models;

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
 * {@link ChatUserSecAgentRequest} extends {@link RequestModel}
 *
 * <p>ChatUserSecAgentRequest</p>
 */
public class ChatUserSecAgentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Agent")
    private String agent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AttachmentStagingId")
    private String attachmentStagingId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Attachments")
    private String attachments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutionMode")
    private String executionMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtraParams")
    private String extraParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Boolean memory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseLanguage")
    private String responseLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Skill")
    private String skill;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TalkId")
    private String talkId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserInputInfo")
    private String userInputInfo;

    private ChatUserSecAgentRequest(Builder builder) {
        super(builder);
        this.agent = builder.agent;
        this.attachmentStagingId = builder.attachmentStagingId;
        this.attachments = builder.attachments;
        this.channel = builder.channel;
        this.executionMode = builder.executionMode;
        this.extraParams = builder.extraParams;
        this.memory = builder.memory;
        this.model = builder.model;
        this.prompt = builder.prompt;
        this.responseLanguage = builder.responseLanguage;
        this.sessionId = builder.sessionId;
        this.skill = builder.skill;
        this.stream = builder.stream;
        this.talkId = builder.talkId;
        this.target = builder.target;
        this.timeZone = builder.timeZone;
        this.userInputInfo = builder.userInputInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatUserSecAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agent
     */
    public String getAgent() {
        return this.agent;
    }

    /**
     * @return attachmentStagingId
     */
    public String getAttachmentStagingId() {
        return this.attachmentStagingId;
    }

    /**
     * @return attachments
     */
    public String getAttachments() {
        return this.attachments;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return memory
     */
    public Boolean getMemory() {
        return this.memory;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return responseLanguage
     */
    public String getResponseLanguage() {
        return this.responseLanguage;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return skill
     */
    public String getSkill() {
        return this.skill;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return talkId
     */
    public String getTalkId() {
        return this.talkId;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return userInputInfo
     */
    public String getUserInputInfo() {
        return this.userInputInfo;
    }

    public static final class Builder extends Request.Builder<ChatUserSecAgentRequest, Builder> {
        private String agent; 
        private String attachmentStagingId; 
        private String attachments; 
        private String channel; 
        private String executionMode; 
        private String extraParams; 
        private Boolean memory; 
        private String model; 
        private String prompt; 
        private String responseLanguage; 
        private String sessionId; 
        private String skill; 
        private Boolean stream; 
        private String talkId; 
        private String target; 
        private String timeZone; 
        private String userInputInfo; 

        private Builder() {
            super();
        } 

        private Builder(ChatUserSecAgentRequest request) {
            super(request);
            this.agent = request.agent;
            this.attachmentStagingId = request.attachmentStagingId;
            this.attachments = request.attachments;
            this.channel = request.channel;
            this.executionMode = request.executionMode;
            this.extraParams = request.extraParams;
            this.memory = request.memory;
            this.model = request.model;
            this.prompt = request.prompt;
            this.responseLanguage = request.responseLanguage;
            this.sessionId = request.sessionId;
            this.skill = request.skill;
            this.stream = request.stream;
            this.talkId = request.talkId;
            this.target = request.target;
            this.timeZone = request.timeZone;
            this.userInputInfo = request.userInputInfo;
        } 

        /**
         * Agent.
         */
        public Builder agent(String agent) {
            this.putBodyParameter("Agent", agent);
            this.agent = agent;
            return this;
        }

        /**
         * <p>附件暂存 ID</p>
         * 
         * <strong>example:</strong>
         * <p>stg-6f1d9c8b7a2e4530</p>
         */
        public Builder attachmentStagingId(String attachmentStagingId) {
            this.putBodyParameter("AttachmentStagingId", attachmentStagingId);
            this.attachmentStagingId = attachmentStagingId;
            return this;
        }

        /**
         * <p>附件列表 JSON 字符串</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;oss/input.txt&quot;,&quot;oss/raw.txt&quot;]</p>
         */
        public Builder attachments(String attachments) {
            this.putBodyParameter("Attachments", attachments);
            this.attachments = attachments;
            return this;
        }

        /**
         * <p>逻辑渠道名</p>
         * 
         * <strong>example:</strong>
         * <p>console</p>
         */
        public Builder channel(String channel) {
            this.putBodyParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>执行模式: single/team/role</p>
         * 
         * <strong>example:</strong>
         * <p>single</p>
         */
        public Builder executionMode(String executionMode) {
            this.putBodyParameter("ExecutionMode", executionMode);
            this.executionMode = executionMode;
            return this;
        }

        /**
         * <p>扩展参数 JSON 字符串，如 execution_mode、target 等</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;execution_mode&quot;:&quot;team&quot;,&quot;target&quot;:&quot;team:auto&quot;}</p>
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Boolean memory) {
            this.putBodyParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>用户提问；新会话时必填，恢复/交互时可空</p>
         * 
         * <strong>example:</strong>
         * <p>帮我梳理最近 24 小时的高危告警并给出处置建议</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * ResponseLanguage.
         */
        public Builder responseLanguage(String responseLanguage) {
            this.putBodyParameter("ResponseLanguage", responseLanguage);
            this.responseLanguage = responseLanguage;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Skill.
         */
        public Builder skill(String skill) {
            this.putBodyParameter("Skill", skill);
            this.skill = skill;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * TalkId.
         */
        public Builder talkId(String talkId) {
            this.putBodyParameter("TalkId", talkId);
            this.talkId = talkId;
            return this;
        }

        /**
         * <p>执行目标</p>
         * 
         * <strong>example:</strong>
         * <p>sec-ops-team-01</p>
         */
        public Builder target(String target) {
            this.putBodyParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * TimeZone.
         */
        public Builder timeZone(String timeZone) {
            this.putBodyParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        /**
         * <p>会话恢复/交互提交信息 JSON 字符串</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sessionId&quot;:&quot;session_example&quot;,&quot;talkId&quot;:&quot;talk_example&quot;,&quot;formId&quot;:&quot;interaction_example&quot;,&quot;formValues&quot;:{&quot;q1&quot;:{&quot;kind&quot;:&quot;selected&quot;,&quot;optionIds&quot;:[&quot;q1_o1&quot;]}},&quot;formAction&quot;:&quot;submit&quot;}</p>
         */
        public Builder userInputInfo(String userInputInfo) {
            this.putBodyParameter("UserInputInfo", userInputInfo);
            this.userInputInfo = userInputInfo;
            return this;
        }

        @Override
        public ChatUserSecAgentRequest build() {
            return new ChatUserSecAgentRequest(this);
        } 

    } 

}
