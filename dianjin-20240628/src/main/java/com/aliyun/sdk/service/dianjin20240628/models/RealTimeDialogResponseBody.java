// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link RealTimeDialogResponseBody} extends {@link TeaModel}
 *
 * <p>RealTimeDialogResponseBody</p>
 */
public class RealTimeDialogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("choices")
    private java.util.List<Choices> choices;

    @com.aliyun.core.annotation.NameInMap("created")
    private String created;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private RealTimeDialogResponseBody(Builder builder) {
        this.choices = builder.choices;
        this.created = builder.created;
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RealTimeDialogResponseBody create() {
        return builder().build();
    }

    /**
     * @return choices
     */
    public java.util.List<Choices> getChoices() {
        return this.choices;
    }

    /**
     * @return created
     */
    public String getCreated() {
        return this.created;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<Choices> choices; 
        private String created; 
        private String id; 
        private String requestId; 
        private Boolean success; 

        /**
         * choices.
         */
        public Builder choices(java.util.List<Choices> choices) {
            this.choices = choices;
            return this;
        }

        /**
         * created.
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RealTimeDialogResponseBody build() {
            return new RealTimeDialogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RealTimeDialogResponseBody} extends {@link TeaModel}
     *
     * <p>RealTimeDialogResponseBody</p>
     */
    public static class Delta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysisProcess")
        private String analysisProcess;

        @com.aliyun.core.annotation.NameInMap("callTime")
        private String callTime;

        @com.aliyun.core.annotation.NameInMap("hangUpDialog")
        private Boolean hangUpDialog;

        @com.aliyun.core.annotation.NameInMap("intentionCode")
        private String intentionCode;

        @com.aliyun.core.annotation.NameInMap("intentionName")
        private String intentionName;

        @com.aliyun.core.annotation.NameInMap("intentionScript")
        private String intentionScript;

        @com.aliyun.core.annotation.NameInMap("recommendIntention")
        private String recommendIntention;

        @com.aliyun.core.annotation.NameInMap("recommendScript")
        private String recommendScript;

        @com.aliyun.core.annotation.NameInMap("selfDirectedScript")
        private String selfDirectedScript;

        @com.aliyun.core.annotation.NameInMap("selfDirectedScriptFullContent")
        private String selfDirectedScriptFullContent;

        private Delta(Builder builder) {
            this.analysisProcess = builder.analysisProcess;
            this.callTime = builder.callTime;
            this.hangUpDialog = builder.hangUpDialog;
            this.intentionCode = builder.intentionCode;
            this.intentionName = builder.intentionName;
            this.intentionScript = builder.intentionScript;
            this.recommendIntention = builder.recommendIntention;
            this.recommendScript = builder.recommendScript;
            this.selfDirectedScript = builder.selfDirectedScript;
            this.selfDirectedScriptFullContent = builder.selfDirectedScriptFullContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delta create() {
            return builder().build();
        }

        /**
         * @return analysisProcess
         */
        public String getAnalysisProcess() {
            return this.analysisProcess;
        }

        /**
         * @return callTime
         */
        public String getCallTime() {
            return this.callTime;
        }

        /**
         * @return hangUpDialog
         */
        public Boolean getHangUpDialog() {
            return this.hangUpDialog;
        }

        /**
         * @return intentionCode
         */
        public String getIntentionCode() {
            return this.intentionCode;
        }

        /**
         * @return intentionName
         */
        public String getIntentionName() {
            return this.intentionName;
        }

        /**
         * @return intentionScript
         */
        public String getIntentionScript() {
            return this.intentionScript;
        }

        /**
         * @return recommendIntention
         */
        public String getRecommendIntention() {
            return this.recommendIntention;
        }

        /**
         * @return recommendScript
         */
        public String getRecommendScript() {
            return this.recommendScript;
        }

        /**
         * @return selfDirectedScript
         */
        public String getSelfDirectedScript() {
            return this.selfDirectedScript;
        }

        /**
         * @return selfDirectedScriptFullContent
         */
        public String getSelfDirectedScriptFullContent() {
            return this.selfDirectedScriptFullContent;
        }

        public static final class Builder {
            private String analysisProcess; 
            private String callTime; 
            private Boolean hangUpDialog; 
            private String intentionCode; 
            private String intentionName; 
            private String intentionScript; 
            private String recommendIntention; 
            private String recommendScript; 
            private String selfDirectedScript; 
            private String selfDirectedScriptFullContent; 

            /**
             * analysisProcess.
             */
            public Builder analysisProcess(String analysisProcess) {
                this.analysisProcess = analysisProcess;
                return this;
            }

            /**
             * <p>time</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder callTime(String callTime) {
                this.callTime = callTime;
                return this;
            }

            /**
             * hangUpDialog.
             */
            public Builder hangUpDialog(Boolean hangUpDialog) {
                this.hangUpDialog = hangUpDialog;
                return this;
            }

            /**
             * intentionCode.
             */
            public Builder intentionCode(String intentionCode) {
                this.intentionCode = intentionCode;
                return this;
            }

            /**
             * intentionName.
             */
            public Builder intentionName(String intentionName) {
                this.intentionName = intentionName;
                return this;
            }

            /**
             * intentionScript.
             */
            public Builder intentionScript(String intentionScript) {
                this.intentionScript = intentionScript;
                return this;
            }

            /**
             * recommendIntention.
             */
            public Builder recommendIntention(String recommendIntention) {
                this.recommendIntention = recommendIntention;
                return this;
            }

            /**
             * recommendScript.
             */
            public Builder recommendScript(String recommendScript) {
                this.recommendScript = recommendScript;
                return this;
            }

            /**
             * selfDirectedScript.
             */
            public Builder selfDirectedScript(String selfDirectedScript) {
                this.selfDirectedScript = selfDirectedScript;
                return this;
            }

            /**
             * selfDirectedScriptFullContent.
             */
            public Builder selfDirectedScriptFullContent(String selfDirectedScriptFullContent) {
                this.selfDirectedScriptFullContent = selfDirectedScriptFullContent;
                return this;
            }

            public Delta build() {
                return new Delta(this);
            } 

        } 

    }
    /**
     * 
     * {@link RealTimeDialogResponseBody} extends {@link TeaModel}
     *
     * <p>RealTimeDialogResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysisProcess")
        private String analysisProcess;

        @com.aliyun.core.annotation.NameInMap("callTime")
        private String callTime;

        @com.aliyun.core.annotation.NameInMap("hangUpDialog")
        private Boolean hangUpDialog;

        @com.aliyun.core.annotation.NameInMap("intentionCode")
        private String intentionCode;

        @com.aliyun.core.annotation.NameInMap("intentionName")
        private String intentionName;

        @com.aliyun.core.annotation.NameInMap("intentionScript")
        private String intentionScript;

        @com.aliyun.core.annotation.NameInMap("recommendIntention")
        private String recommendIntention;

        @com.aliyun.core.annotation.NameInMap("recommendScript")
        private String recommendScript;

        @com.aliyun.core.annotation.NameInMap("selfDirectedScript")
        private String selfDirectedScript;

        @com.aliyun.core.annotation.NameInMap("selfDirectedScriptFullContent")
        private String selfDirectedScriptFullContent;

        private Message(Builder builder) {
            this.analysisProcess = builder.analysisProcess;
            this.callTime = builder.callTime;
            this.hangUpDialog = builder.hangUpDialog;
            this.intentionCode = builder.intentionCode;
            this.intentionName = builder.intentionName;
            this.intentionScript = builder.intentionScript;
            this.recommendIntention = builder.recommendIntention;
            this.recommendScript = builder.recommendScript;
            this.selfDirectedScript = builder.selfDirectedScript;
            this.selfDirectedScriptFullContent = builder.selfDirectedScriptFullContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return analysisProcess
         */
        public String getAnalysisProcess() {
            return this.analysisProcess;
        }

        /**
         * @return callTime
         */
        public String getCallTime() {
            return this.callTime;
        }

        /**
         * @return hangUpDialog
         */
        public Boolean getHangUpDialog() {
            return this.hangUpDialog;
        }

        /**
         * @return intentionCode
         */
        public String getIntentionCode() {
            return this.intentionCode;
        }

        /**
         * @return intentionName
         */
        public String getIntentionName() {
            return this.intentionName;
        }

        /**
         * @return intentionScript
         */
        public String getIntentionScript() {
            return this.intentionScript;
        }

        /**
         * @return recommendIntention
         */
        public String getRecommendIntention() {
            return this.recommendIntention;
        }

        /**
         * @return recommendScript
         */
        public String getRecommendScript() {
            return this.recommendScript;
        }

        /**
         * @return selfDirectedScript
         */
        public String getSelfDirectedScript() {
            return this.selfDirectedScript;
        }

        /**
         * @return selfDirectedScriptFullContent
         */
        public String getSelfDirectedScriptFullContent() {
            return this.selfDirectedScriptFullContent;
        }

        public static final class Builder {
            private String analysisProcess; 
            private String callTime; 
            private Boolean hangUpDialog; 
            private String intentionCode; 
            private String intentionName; 
            private String intentionScript; 
            private String recommendIntention; 
            private String recommendScript; 
            private String selfDirectedScript; 
            private String selfDirectedScriptFullContent; 

            /**
             * analysisProcess.
             */
            public Builder analysisProcess(String analysisProcess) {
                this.analysisProcess = analysisProcess;
                return this;
            }

            /**
             * <p>time</p>
             * 
             * <strong>example:</strong>
             * <p>1735139569523</p>
             */
            public Builder callTime(String callTime) {
                this.callTime = callTime;
                return this;
            }

            /**
             * hangUpDialog.
             */
            public Builder hangUpDialog(Boolean hangUpDialog) {
                this.hangUpDialog = hangUpDialog;
                return this;
            }

            /**
             * intentionCode.
             */
            public Builder intentionCode(String intentionCode) {
                this.intentionCode = intentionCode;
                return this;
            }

            /**
             * intentionName.
             */
            public Builder intentionName(String intentionName) {
                this.intentionName = intentionName;
                return this;
            }

            /**
             * intentionScript.
             */
            public Builder intentionScript(String intentionScript) {
                this.intentionScript = intentionScript;
                return this;
            }

            /**
             * recommendIntention.
             */
            public Builder recommendIntention(String recommendIntention) {
                this.recommendIntention = recommendIntention;
                return this;
            }

            /**
             * recommendScript.
             */
            public Builder recommendScript(String recommendScript) {
                this.recommendScript = recommendScript;
                return this;
            }

            /**
             * selfDirectedScript.
             */
            public Builder selfDirectedScript(String selfDirectedScript) {
                this.selfDirectedScript = selfDirectedScript;
                return this;
            }

            /**
             * selfDirectedScriptFullContent.
             */
            public Builder selfDirectedScriptFullContent(String selfDirectedScriptFullContent) {
                this.selfDirectedScriptFullContent = selfDirectedScriptFullContent;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    /**
     * 
     * {@link RealTimeDialogResponseBody} extends {@link TeaModel}
     *
     * <p>RealTimeDialogResponseBody</p>
     */
    public static class Choices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("delta")
        private Delta delta;

        @com.aliyun.core.annotation.NameInMap("finishReason")
        private String finishReason;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("message")
        private Message message;

        private Choices(Builder builder) {
            this.delta = builder.delta;
            this.finishReason = builder.finishReason;
            this.index = builder.index;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Choices create() {
            return builder().build();
        }

        /**
         * @return delta
         */
        public Delta getDelta() {
            return this.delta;
        }

        /**
         * @return finishReason
         */
        public String getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return message
         */
        public Message getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Delta delta; 
            private String finishReason; 
            private Integer index; 
            private Message message; 

            /**
             * delta.
             */
            public Builder delta(Delta delta) {
                this.delta = delta;
                return this;
            }

            /**
             * finishReason.
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * message.
             */
            public Builder message(Message message) {
                this.message = message;
                return this;
            }

            public Choices build() {
                return new Choices(this);
            } 

        } 

    }
}
