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
 * {@link RunCompletionResponseBody} extends {@link TeaModel}
 *
 * <p>RunCompletionResponseBody</p>
 */
public class RunCompletionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FinishReason")
    private String finishReason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    @com.aliyun.core.annotation.NameInMap("inputTokens")
    private String inputTokens;

    @com.aliyun.core.annotation.NameInMap("outputTokens")
    private String outputTokens;

    @com.aliyun.core.annotation.NameInMap("ragStatus")
    private String ragStatus;

    @com.aliyun.core.annotation.NameInMap("totalTokens")
    private String totalTokens;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private RunCompletionResponseBody(Builder builder) {
        this.finishReason = builder.finishReason;
        this.requestId = builder.requestId;
        this.text = builder.text;
        this.inputTokens = builder.inputTokens;
        this.outputTokens = builder.outputTokens;
        this.ragStatus = builder.ragStatus;
        this.totalTokens = builder.totalTokens;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCompletionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return finishReason
     */
    public String getFinishReason() {
        return this.finishReason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return inputTokens
     */
    public String getInputTokens() {
        return this.inputTokens;
    }

    /**
     * @return outputTokens
     */
    public String getOutputTokens() {
        return this.outputTokens;
    }

    /**
     * @return ragStatus
     */
    public String getRagStatus() {
        return this.ragStatus;
    }

    /**
     * @return totalTokens
     */
    public String getTotalTokens() {
        return this.totalTokens;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private String finishReason; 
        private String requestId; 
        private String text; 
        private String inputTokens; 
        private String outputTokens; 
        private String ragStatus; 
        private String totalTokens; 
        private Usage usage; 

        private Builder() {
        } 

        private Builder(RunCompletionResponseBody model) {
            this.finishReason = model.finishReason;
            this.requestId = model.requestId;
            this.text = model.text;
            this.inputTokens = model.inputTokens;
            this.outputTokens = model.outputTokens;
            this.ragStatus = model.ragStatus;
            this.totalTokens = model.totalTokens;
            this.usage = model.usage;
        } 

        /**
         * FinishReason.
         */
        public Builder finishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * inputTokens.
         */
        public Builder inputTokens(String inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }

        /**
         * outputTokens.
         */
        public Builder outputTokens(String outputTokens) {
            this.outputTokens = outputTokens;
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
         * totalTokens.
         */
        public Builder totalTokens(String totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public RunCompletionResponseBody build() {
            return new RunCompletionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunCompletionResponseBody} extends {@link TeaModel}
     *
     * <p>RunCompletionResponseBody</p>
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
     * {@link RunCompletionResponseBody} extends {@link TeaModel}
     *
     * <p>RunCompletionResponseBody</p>
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
     * {@link RunCompletionResponseBody} extends {@link TeaModel}
     *
     * <p>RunCompletionResponseBody</p>
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
     * {@link RunCompletionResponseBody} extends {@link TeaModel}
     *
     * <p>RunCompletionResponseBody</p>
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
}
