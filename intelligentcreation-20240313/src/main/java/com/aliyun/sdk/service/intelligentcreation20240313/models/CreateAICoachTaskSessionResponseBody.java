// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateAICoachTaskSessionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAICoachTaskSessionResponseBody</p>
 */
public class CreateAICoachTaskSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channelToken")
    private String channelToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scriptInfo")
    private ScriptInfo scriptInfo;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("sessionStatus")
    private Long sessionStatus;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("webSocketUrl")
    private String webSocketUrl;

    private CreateAICoachTaskSessionResponseBody(Builder builder) {
        this.channelToken = builder.channelToken;
        this.requestId = builder.requestId;
        this.scriptInfo = builder.scriptInfo;
        this.sessionId = builder.sessionId;
        this.sessionStatus = builder.sessionStatus;
        this.token = builder.token;
        this.webSocketUrl = builder.webSocketUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAICoachTaskSessionResponseBody create() {
        return builder().build();
    }

    /**
     * @return channelToken
     */
    public String getChannelToken() {
        return this.channelToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scriptInfo
     */
    public ScriptInfo getScriptInfo() {
        return this.scriptInfo;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionStatus
     */
    public Long getSessionStatus() {
        return this.sessionStatus;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return webSocketUrl
     */
    public String getWebSocketUrl() {
        return this.webSocketUrl;
    }

    public static final class Builder {
        private String channelToken; 
        private String requestId; 
        private ScriptInfo scriptInfo; 
        private String sessionId; 
        private Long sessionStatus; 
        private String token; 
        private String webSocketUrl; 

        /**
         * <p>rtctoken</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder channelToken(String channelToken) {
            this.channelToken = channelToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * scriptInfo.
         */
        public Builder scriptInfo(ScriptInfo scriptInfo) {
            this.scriptInfo = scriptInfo;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * sessionStatus.
         */
        public Builder sessionStatus(Long sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }

        /**
         * <p>Token</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * webSocketUrl.
         */
        public Builder webSocketUrl(String webSocketUrl) {
            this.webSocketUrl = webSocketUrl;
            return this;
        }

        public CreateAICoachTaskSessionResponseBody build() {
            return new CreateAICoachTaskSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAICoachTaskSessionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAICoachTaskSessionResponseBody</p>
     */
    public static class ScriptInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentIconUrl")
        private String agentIconUrl;

        @com.aliyun.core.annotation.NameInMap("characterName")
        private String characterName;

        @com.aliyun.core.annotation.NameInMap("dialogueTextFlag")
        private Boolean dialogueTextFlag;

        @com.aliyun.core.annotation.NameInMap("dialogueTipFlag")
        private Boolean dialogueTipFlag;

        @com.aliyun.core.annotation.NameInMap("initiator")
        private String initiator;

        @com.aliyun.core.annotation.NameInMap("inputTypeList")
        private java.util.List<String> inputTypeList;

        @com.aliyun.core.annotation.NameInMap("maxDuration")
        private Long maxDuration;

        @com.aliyun.core.annotation.NameInMap("scriptDesc")
        private String scriptDesc;

        @com.aliyun.core.annotation.NameInMap("scriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("scriptRecordId")
        private String scriptRecordId;

        @com.aliyun.core.annotation.NameInMap("scriptType")
        private Long scriptType;

        @com.aliyun.core.annotation.NameInMap("sparringTipContent")
        private String sparringTipContent;

        @com.aliyun.core.annotation.NameInMap("sparringTipTitle")
        private String sparringTipTitle;

        @com.aliyun.core.annotation.NameInMap("studentThinkTimeFlag")
        private Boolean studentThinkTimeFlag;

        @com.aliyun.core.annotation.NameInMap("studentThinkTimeLimit")
        private Long studentThinkTimeLimit;

        private ScriptInfo(Builder builder) {
            this.agentIconUrl = builder.agentIconUrl;
            this.characterName = builder.characterName;
            this.dialogueTextFlag = builder.dialogueTextFlag;
            this.dialogueTipFlag = builder.dialogueTipFlag;
            this.initiator = builder.initiator;
            this.inputTypeList = builder.inputTypeList;
            this.maxDuration = builder.maxDuration;
            this.scriptDesc = builder.scriptDesc;
            this.scriptName = builder.scriptName;
            this.scriptRecordId = builder.scriptRecordId;
            this.scriptType = builder.scriptType;
            this.sparringTipContent = builder.sparringTipContent;
            this.sparringTipTitle = builder.sparringTipTitle;
            this.studentThinkTimeFlag = builder.studentThinkTimeFlag;
            this.studentThinkTimeLimit = builder.studentThinkTimeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptInfo create() {
            return builder().build();
        }

        /**
         * @return agentIconUrl
         */
        public String getAgentIconUrl() {
            return this.agentIconUrl;
        }

        /**
         * @return characterName
         */
        public String getCharacterName() {
            return this.characterName;
        }

        /**
         * @return dialogueTextFlag
         */
        public Boolean getDialogueTextFlag() {
            return this.dialogueTextFlag;
        }

        /**
         * @return dialogueTipFlag
         */
        public Boolean getDialogueTipFlag() {
            return this.dialogueTipFlag;
        }

        /**
         * @return initiator
         */
        public String getInitiator() {
            return this.initiator;
        }

        /**
         * @return inputTypeList
         */
        public java.util.List<String> getInputTypeList() {
            return this.inputTypeList;
        }

        /**
         * @return maxDuration
         */
        public Long getMaxDuration() {
            return this.maxDuration;
        }

        /**
         * @return scriptDesc
         */
        public String getScriptDesc() {
            return this.scriptDesc;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return scriptRecordId
         */
        public String getScriptRecordId() {
            return this.scriptRecordId;
        }

        /**
         * @return scriptType
         */
        public Long getScriptType() {
            return this.scriptType;
        }

        /**
         * @return sparringTipContent
         */
        public String getSparringTipContent() {
            return this.sparringTipContent;
        }

        /**
         * @return sparringTipTitle
         */
        public String getSparringTipTitle() {
            return this.sparringTipTitle;
        }

        /**
         * @return studentThinkTimeFlag
         */
        public Boolean getStudentThinkTimeFlag() {
            return this.studentThinkTimeFlag;
        }

        /**
         * @return studentThinkTimeLimit
         */
        public Long getStudentThinkTimeLimit() {
            return this.studentThinkTimeLimit;
        }

        public static final class Builder {
            private String agentIconUrl; 
            private String characterName; 
            private Boolean dialogueTextFlag; 
            private Boolean dialogueTipFlag; 
            private String initiator; 
            private java.util.List<String> inputTypeList; 
            private Long maxDuration; 
            private String scriptDesc; 
            private String scriptName; 
            private String scriptRecordId; 
            private Long scriptType; 
            private String sparringTipContent; 
            private String sparringTipTitle; 
            private Boolean studentThinkTimeFlag; 
            private Long studentThinkTimeLimit; 

            /**
             * agentIconUrl.
             */
            public Builder agentIconUrl(String agentIconUrl) {
                this.agentIconUrl = agentIconUrl;
                return this;
            }

            /**
             * characterName.
             */
            public Builder characterName(String characterName) {
                this.characterName = characterName;
                return this;
            }

            /**
             * dialogueTextFlag.
             */
            public Builder dialogueTextFlag(Boolean dialogueTextFlag) {
                this.dialogueTextFlag = dialogueTextFlag;
                return this;
            }

            /**
             * dialogueTipFlag.
             */
            public Builder dialogueTipFlag(Boolean dialogueTipFlag) {
                this.dialogueTipFlag = dialogueTipFlag;
                return this;
            }

            /**
             * initiator.
             */
            public Builder initiator(String initiator) {
                this.initiator = initiator;
                return this;
            }

            /**
             * inputTypeList.
             */
            public Builder inputTypeList(java.util.List<String> inputTypeList) {
                this.inputTypeList = inputTypeList;
                return this;
            }

            /**
             * maxDuration.
             */
            public Builder maxDuration(Long maxDuration) {
                this.maxDuration = maxDuration;
                return this;
            }

            /**
             * scriptDesc.
             */
            public Builder scriptDesc(String scriptDesc) {
                this.scriptDesc = scriptDesc;
                return this;
            }

            /**
             * scriptName.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * scriptRecordId.
             */
            public Builder scriptRecordId(String scriptRecordId) {
                this.scriptRecordId = scriptRecordId;
                return this;
            }

            /**
             * scriptType.
             */
            public Builder scriptType(Long scriptType) {
                this.scriptType = scriptType;
                return this;
            }

            /**
             * sparringTipContent.
             */
            public Builder sparringTipContent(String sparringTipContent) {
                this.sparringTipContent = sparringTipContent;
                return this;
            }

            /**
             * sparringTipTitle.
             */
            public Builder sparringTipTitle(String sparringTipTitle) {
                this.sparringTipTitle = sparringTipTitle;
                return this;
            }

            /**
             * studentThinkTimeFlag.
             */
            public Builder studentThinkTimeFlag(Boolean studentThinkTimeFlag) {
                this.studentThinkTimeFlag = studentThinkTimeFlag;
                return this;
            }

            /**
             * studentThinkTimeLimit.
             */
            public Builder studentThinkTimeLimit(Long studentThinkTimeLimit) {
                this.studentThinkTimeLimit = studentThinkTimeLimit;
                return this;
            }

            public ScriptInfo build() {
                return new ScriptInfo(this);
            } 

        } 

    }
}
