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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RealTimeDialogResponseBody model) {
            this.choices = model.choices;
            this.created = model.created;
            this.id = model.id;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>An array of generated content. It can contain one or more choice objects.</p>
         */
        public Builder choices(java.util.List<Choices> choices) {
            this.choices = choices;
            return this;
        }

        /**
         * <p>The timestamp when this request was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1735139569523</p>
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * <p>The unique identifier for this call. Each chunk object has the same ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eb2b6139-ddf1-91a0-a47f-df7617ae9032</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5E3FBAF1-17AF-53B7-AF0A-CDCEEB6DE658</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        @com.aliyun.core.annotation.NameInMap("interrupt")
        private Boolean interrupt;

        @com.aliyun.core.annotation.NameInMap("recommendIntention")
        private String recommendIntention;

        @com.aliyun.core.annotation.NameInMap("recommendScript")
        private String recommendScript;

        @com.aliyun.core.annotation.NameInMap("selfDirectedScript")
        private String selfDirectedScript;

        @com.aliyun.core.annotation.NameInMap("selfDirectedScriptFullContent")
        private String selfDirectedScriptFullContent;

        @com.aliyun.core.annotation.NameInMap("skipCurrentRecognize")
        private Boolean skipCurrentRecognize;

        private Delta(Builder builder) {
            this.analysisProcess = builder.analysisProcess;
            this.callTime = builder.callTime;
            this.hangUpDialog = builder.hangUpDialog;
            this.intentionCode = builder.intentionCode;
            this.intentionName = builder.intentionName;
            this.intentionScript = builder.intentionScript;
            this.interrupt = builder.interrupt;
            this.recommendIntention = builder.recommendIntention;
            this.recommendScript = builder.recommendScript;
            this.selfDirectedScript = builder.selfDirectedScript;
            this.selfDirectedScriptFullContent = builder.selfDirectedScriptFullContent;
            this.skipCurrentRecognize = builder.skipCurrentRecognize;
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
         * @return interrupt
         */
        public Boolean getInterrupt() {
            return this.interrupt;
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

        /**
         * @return skipCurrentRecognize
         */
        public Boolean getSkipCurrentRecognize() {
            return this.skipCurrentRecognize;
        }

        public static final class Builder {
            private String analysisProcess; 
            private String callTime; 
            private Boolean hangUpDialog; 
            private String intentionCode; 
            private String intentionName; 
            private String intentionScript; 
            private Boolean interrupt; 
            private String recommendIntention; 
            private String recommendScript; 
            private String selfDirectedScript; 
            private String selfDirectedScriptFullContent; 
            private Boolean skipCurrentRecognize; 

            private Builder() {
            } 

            private Builder(Delta model) {
                this.analysisProcess = model.analysisProcess;
                this.callTime = model.callTime;
                this.hangUpDialog = model.hangUpDialog;
                this.intentionCode = model.intentionCode;
                this.intentionName = model.intentionName;
                this.intentionScript = model.intentionScript;
                this.interrupt = model.interrupt;
                this.recommendIntention = model.recommendIntention;
                this.recommendScript = model.recommendScript;
                this.selfDirectedScript = model.selfDirectedScript;
                this.selfDirectedScriptFullContent = model.selfDirectedScriptFullContent;
                this.skipCurrentRecognize = model.skipCurrentRecognize;
            } 

            /**
             * <p>The analysis process.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder analysisProcess(String analysisProcess) {
                this.analysisProcess = analysisProcess;
                return this;
            }

            /**
             * <p>The time.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder callTime(String callTime) {
                this.callTime = callTime;
                return this;
            }

            /**
             * <p>Hangs up the dialog.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hangUpDialog(Boolean hangUpDialog) {
                this.hangUpDialog = hangUpDialog;
                return this;
            }

            /**
             * <p>The intent code.</p>
             * 
             * <strong>example:</strong>
             * <p>1853360771162058752</p>
             */
            public Builder intentionCode(String intentionCode) {
                this.intentionCode = intentionCode;
                return this;
            }

            /**
             * <p>The intent name.</p>
             * 
             * <strong>example:</strong>
             * <p>其他</p>
             */
            public Builder intentionName(String intentionName) {
                this.intentionName = intentionName;
                return this;
            }

            /**
             * <p>The intent script.</p>
             * 
             * <strong>example:</strong>
             * <p>抱歉，我没有明白您的意思，或者您可以拨打我们的客服热线，请客服人员为您解答。</p>
             */
            public Builder intentionScript(String intentionScript) {
                this.intentionScript = intentionScript;
                return this;
            }

            /**
             * <p>Specifies whether the conversation was interrupted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder interrupt(Boolean interrupt) {
                this.interrupt = interrupt;
                return this;
            }

            /**
             * <p>The recommended intent.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder recommendIntention(String recommendIntention) {
                this.recommendIntention = recommendIntention;
                return this;
            }

            /**
             * <p>The recommended script.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder recommendScript(String recommendScript) {
                this.recommendScript = recommendScript;
                return this;
            }

            /**
             * <p>The script for the Q\&amp;A pair. This is incremental data.</p>
             * 
             * <strong>example:</strong>
             * <p>话题</p>
             */
            public Builder selfDirectedScript(String selfDirectedScript) {
                this.selfDirectedScript = selfDirectedScript;
                return this;
            }

            /**
             * <p>The script for the Q\&amp;A pair. This is the full data.</p>
             * 
             * <strong>example:</strong>
             * <p>关于宇宙的大小，这是一个非常深奥的科学话题</p>
             */
            public Builder selfDirectedScriptFullContent(String selfDirectedScriptFullContent) {
                this.selfDirectedScriptFullContent = selfDirectedScriptFullContent;
                return this;
            }

            /**
             * <p>Specifies whether to skip the current recognition.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skipCurrentRecognize(Boolean skipCurrentRecognize) {
                this.skipCurrentRecognize = skipCurrentRecognize;
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

        @com.aliyun.core.annotation.NameInMap("interrupt")
        private Boolean interrupt;

        @com.aliyun.core.annotation.NameInMap("recommendIntention")
        private String recommendIntention;

        @com.aliyun.core.annotation.NameInMap("recommendScript")
        private String recommendScript;

        @com.aliyun.core.annotation.NameInMap("selfDirectedScript")
        private String selfDirectedScript;

        @com.aliyun.core.annotation.NameInMap("selfDirectedScriptFullContent")
        private String selfDirectedScriptFullContent;

        @com.aliyun.core.annotation.NameInMap("skipCurrentRecognize")
        private Boolean skipCurrentRecognize;

        private Message(Builder builder) {
            this.analysisProcess = builder.analysisProcess;
            this.callTime = builder.callTime;
            this.hangUpDialog = builder.hangUpDialog;
            this.intentionCode = builder.intentionCode;
            this.intentionName = builder.intentionName;
            this.intentionScript = builder.intentionScript;
            this.interrupt = builder.interrupt;
            this.recommendIntention = builder.recommendIntention;
            this.recommendScript = builder.recommendScript;
            this.selfDirectedScript = builder.selfDirectedScript;
            this.selfDirectedScriptFullContent = builder.selfDirectedScriptFullContent;
            this.skipCurrentRecognize = builder.skipCurrentRecognize;
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
         * @return interrupt
         */
        public Boolean getInterrupt() {
            return this.interrupt;
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

        /**
         * @return skipCurrentRecognize
         */
        public Boolean getSkipCurrentRecognize() {
            return this.skipCurrentRecognize;
        }

        public static final class Builder {
            private String analysisProcess; 
            private String callTime; 
            private Boolean hangUpDialog; 
            private String intentionCode; 
            private String intentionName; 
            private String intentionScript; 
            private Boolean interrupt; 
            private String recommendIntention; 
            private String recommendScript; 
            private String selfDirectedScript; 
            private String selfDirectedScriptFullContent; 
            private Boolean skipCurrentRecognize; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.analysisProcess = model.analysisProcess;
                this.callTime = model.callTime;
                this.hangUpDialog = model.hangUpDialog;
                this.intentionCode = model.intentionCode;
                this.intentionName = model.intentionName;
                this.intentionScript = model.intentionScript;
                this.interrupt = model.interrupt;
                this.recommendIntention = model.recommendIntention;
                this.recommendScript = model.recommendScript;
                this.selfDirectedScript = model.selfDirectedScript;
                this.selfDirectedScriptFullContent = model.selfDirectedScriptFullContent;
                this.skipCurrentRecognize = model.skipCurrentRecognize;
            } 

            /**
             * <p>The analysis process.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder analysisProcess(String analysisProcess) {
                this.analysisProcess = analysisProcess;
                return this;
            }

            /**
             * <p>The time.</p>
             * 
             * <strong>example:</strong>
             * <p>1735139569523</p>
             */
            public Builder callTime(String callTime) {
                this.callTime = callTime;
                return this;
            }

            /**
             * <p>Hang up the dialog.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hangUpDialog(Boolean hangUpDialog) {
                this.hangUpDialog = hangUpDialog;
                return this;
            }

            /**
             * <p>The intent code.</p>
             * 
             * <strong>example:</strong>
             * <p>1853360771162058752</p>
             */
            public Builder intentionCode(String intentionCode) {
                this.intentionCode = intentionCode;
                return this;
            }

            /**
             * <p>The intent name.</p>
             * 
             * <strong>example:</strong>
             * <p>其它</p>
             */
            public Builder intentionName(String intentionName) {
                this.intentionName = intentionName;
                return this;
            }

            /**
             * <p>The intent script.</p>
             * 
             * <strong>example:</strong>
             * <p>抱歉，我没有明白您的意思，或者您可以拨打我们的客服热线，请客服人员为您解答。</p>
             */
            public Builder intentionScript(String intentionScript) {
                this.intentionScript = intentionScript;
                return this;
            }

            /**
             * <p>Specifies whether the conversation was interrupted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder interrupt(Boolean interrupt) {
                this.interrupt = interrupt;
                return this;
            }

            /**
             * <p>The recommended intent.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder recommendIntention(String recommendIntention) {
                this.recommendIntention = recommendIntention;
                return this;
            }

            /**
             * <p>The recommended script.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder recommendScript(String recommendScript) {
                this.recommendScript = recommendScript;
                return this;
            }

            /**
             * <p>The script for the Q\&amp;A pair. This is incremental data. This is empty for streaming responses.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder selfDirectedScript(String selfDirectedScript) {
                this.selfDirectedScript = selfDirectedScript;
                return this;
            }

            /**
             * <p>The script for the Q\&amp;A pair. This is the full data.</p>
             * 
             * <strong>example:</strong>
             * <p>关于宇宙的大小，这是一个非常深奥的科学话题</p>
             */
            public Builder selfDirectedScriptFullContent(String selfDirectedScriptFullContent) {
                this.selfDirectedScriptFullContent = selfDirectedScriptFullContent;
                return this;
            }

            /**
             * <p>Specifies whether to skip the current recognition.</p>
             */
            public Builder skipCurrentRecognize(Boolean skipCurrentRecognize) {
                this.skipCurrentRecognize = skipCurrentRecognize;
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

            private Builder() {
            } 

            private Builder(Choices model) {
                this.delta = model.delta;
                this.finishReason = model.finishReason;
                this.index = model.index;
                this.message = model.message;
            } 

            /**
             * <p>The incremental result returned for streaming responses. This is empty for non-streaming responses.</p>
             */
            public Builder delta(Delta delta) {
                this.delta = delta;
                return this;
            }

            /**
             * <p>The value is \<code>stop\\</code> if the session ends. The value is \<code>null\\</code> if the session is in progress. If \<code>success\\</code> is \<code>false\\</code>, this parameter returns an error message.</p>
             * 
             * <strong>example:</strong>
             * <p>stop</p>
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * <p>The sequence number in the choices list.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The full result returned for non-streaming responses. This is empty for streaming responses.</p>
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
