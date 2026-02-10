// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

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
 * {@link GetTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskResultResponseBody</p>
 */
public class GetTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private GetTaskResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetTaskResultResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetTaskResultResponseBody build() {
            return new GetTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResultResponseBody</p>
     */
    public static class AsrResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("emotionValue")
        private Integer emotionValue;

        @com.aliyun.core.annotation.NameInMap("end")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("roleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("speechRate")
        private Integer speechRate;

        @com.aliyun.core.annotation.NameInMap("words")
        private String words;

        private AsrResult(Builder builder) {
            this.begin = builder.begin;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
            this.role = builder.role;
            this.roleName = builder.roleName;
            this.speechRate = builder.speechRate;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsrResult create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Long getBegin() {
            return this.begin;
        }

        /**
         * @return emotionValue
         */
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return words
         */
        public String getWords() {
            return this.words;
        }

        public static final class Builder {
            private Long begin; 
            private Integer emotionValue; 
            private Long end; 
            private String role; 
            private String roleName; 
            private Integer speechRate; 
            private String words; 

            private Builder() {
            } 

            private Builder(AsrResult model) {
                this.begin = model.begin;
                this.emotionValue = model.emotionValue;
                this.end = model.end;
                this.role = model.role;
                this.roleName = model.roleName;
                this.speechRate = model.speechRate;
                this.words = model.words;
            } 

            /**
             * begin.
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * emotionValue.
             */
            public Builder emotionValue(Integer emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * end.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * roleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * speechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * words.
             */
            public Builder words(String words) {
                this.words = words;
                return this;
            }

            public AsrResult build() {
                return new AsrResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResultResponseBody</p>
     */
    public static class Adaptive extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Integer inputTokens;

        @com.aliyun.core.annotation.NameInMap("invokeCount")
        private Integer invokeCount;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Integer outputTokens;

        private Adaptive(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.invokeCount = builder.invokeCount;
            this.outputTokens = builder.outputTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Adaptive create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return invokeCount
         */
        public Integer getInvokeCount() {
            return this.invokeCount;
        }

        /**
         * @return outputTokens
         */
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public static final class Builder {
            private Integer inputTokens; 
            private Integer invokeCount; 
            private Integer outputTokens; 

            private Builder() {
            } 

            private Builder(Adaptive model) {
                this.inputTokens = model.inputTokens;
                this.invokeCount = model.invokeCount;
                this.outputTokens = model.outputTokens;
            } 

            /**
             * inputTokens.
             */
            public Builder inputTokens(Integer inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * invokeCount.
             */
            public Builder invokeCount(Integer invokeCount) {
                this.invokeCount = invokeCount;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Integer outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            public Adaptive build() {
                return new Adaptive(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResultResponseBody</p>
     */
    public static class DialogSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Integer inputTokens;

        @com.aliyun.core.annotation.NameInMap("invokeCount")
        private Integer invokeCount;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Integer outputTokens;

        private DialogSummary(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.invokeCount = builder.invokeCount;
            this.outputTokens = builder.outputTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogSummary create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return invokeCount
         */
        public Integer getInvokeCount() {
            return this.invokeCount;
        }

        /**
         * @return outputTokens
         */
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public static final class Builder {
            private Integer inputTokens; 
            private Integer invokeCount; 
            private Integer outputTokens; 

            private Builder() {
            } 

            private Builder(DialogSummary model) {
                this.inputTokens = model.inputTokens;
                this.invokeCount = model.invokeCount;
                this.outputTokens = model.outputTokens;
            } 

            /**
             * inputTokens.
             */
            public Builder inputTokens(Integer inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * invokeCount.
             */
            public Builder invokeCount(Integer invokeCount) {
                this.invokeCount = invokeCount;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Integer outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            public DialogSummary build() {
                return new DialogSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResultResponseBody</p>
     */
    public static class Rag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adaptive")
        private Adaptive adaptive;

        @com.aliyun.core.annotation.NameInMap("dialogSummary")
        private DialogSummary dialogSummary;

        private Rag(Builder builder) {
            this.adaptive = builder.adaptive;
            this.dialogSummary = builder.dialogSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rag create() {
            return builder().build();
        }

        /**
         * @return adaptive
         */
        public Adaptive getAdaptive() {
            return this.adaptive;
        }

        /**
         * @return dialogSummary
         */
        public DialogSummary getDialogSummary() {
            return this.dialogSummary;
        }

        public static final class Builder {
            private Adaptive adaptive; 
            private DialogSummary dialogSummary; 

            private Builder() {
            } 

            private Builder(Rag model) {
                this.adaptive = model.adaptive;
                this.dialogSummary = model.dialogSummary;
            } 

            /**
             * adaptive.
             */
            public Builder adaptive(Adaptive adaptive) {
                this.adaptive = adaptive;
                return this;
            }

            /**
             * dialogSummary.
             */
            public Builder dialogSummary(DialogSummary dialogSummary) {
                this.dialogSummary = dialogSummary;
                return this;
            }

            public Rag build() {
                return new Rag(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResultResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("rag")
        private Rag rag;

        private Usage(Builder builder) {
            this.rag = builder.rag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return rag
         */
        public Rag getRag() {
            return this.rag;
        }

        public static final class Builder {
            private Rag rag; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.rag = model.rag;
            } 

            /**
             * rag.
             */
            public Builder rag(Rag rag) {
                this.rag = rag;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("asrResult")
        private java.util.List<AsrResult> asrResult;

        @com.aliyun.core.annotation.NameInMap("extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("ragErrorMessage")
        private String ragErrorMessage;

        @com.aliyun.core.annotation.NameInMap("ragResult")
        private String ragResult;

        @com.aliyun.core.annotation.NameInMap("ragStatus")
        private String ragStatus;

        @com.aliyun.core.annotation.NameInMap("taskErrorMessage")
        private String taskErrorMessage;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Usage usage;

        private Data(Builder builder) {
            this.asrResult = builder.asrResult;
            this.extra = builder.extra;
            this.ragErrorMessage = builder.ragErrorMessage;
            this.ragResult = builder.ragResult;
            this.ragStatus = builder.ragStatus;
            this.taskErrorMessage = builder.taskErrorMessage;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.text = builder.text;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return asrResult
         */
        public java.util.List<AsrResult> getAsrResult() {
            return this.asrResult;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return ragErrorMessage
         */
        public String getRagErrorMessage() {
            return this.ragErrorMessage;
        }

        /**
         * @return ragResult
         */
        public String getRagResult() {
            return this.ragResult;
        }

        /**
         * @return ragStatus
         */
        public String getRagStatus() {
            return this.ragStatus;
        }

        /**
         * @return taskErrorMessage
         */
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private java.util.List<AsrResult> asrResult; 
            private String extra; 
            private String ragErrorMessage; 
            private String ragResult; 
            private String ragStatus; 
            private String taskErrorMessage; 
            private String taskId; 
            private String taskStatus; 
            private String text; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.asrResult = model.asrResult;
                this.extra = model.extra;
                this.ragErrorMessage = model.ragErrorMessage;
                this.ragResult = model.ragResult;
                this.ragStatus = model.ragStatus;
                this.taskErrorMessage = model.taskErrorMessage;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.text = model.text;
                this.usage = model.usage;
            } 

            /**
             * asrResult.
             */
            public Builder asrResult(java.util.List<AsrResult> asrResult) {
                this.asrResult = asrResult;
                return this;
            }

            /**
             * extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * ragErrorMessage.
             */
            public Builder ragErrorMessage(String ragErrorMessage) {
                this.ragErrorMessage = ragErrorMessage;
                return this;
            }

            /**
             * ragResult.
             */
            public Builder ragResult(String ragResult) {
                this.ragResult = ragResult;
                return this;
            }

            /**
             * ragStatus.
             */
            public Builder ragStatus(String ragStatus) {
                this.ragStatus = ragStatus;
                return this;
            }

            /**
             * taskErrorMessage.
             */
            public Builder taskErrorMessage(String taskErrorMessage) {
                this.taskErrorMessage = taskErrorMessage;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
