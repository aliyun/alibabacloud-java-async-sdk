// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListLLMTokenUsageResponseBody} extends {@link TeaModel}
 *
 * <p>ListLLMTokenUsageResponseBody</p>
 */
public class ListLLMTokenUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompletionTokens")
    private Long completionTokens;

    @com.aliyun.core.annotation.NameInMap("ExplicitCachedTokens")
    private Long explicitCachedTokens;

    @com.aliyun.core.annotation.NameInMap("ImplicitCachedTokens")
    private Long implicitCachedTokens;

    @com.aliyun.core.annotation.NameInMap("PromptTokens")
    private Long promptTokens;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TokenUsages")
    private java.util.List<TokenUsages> tokenUsages;

    @com.aliyun.core.annotation.NameInMap("TotalTokens")
    private Long totalTokens;

    private ListLLMTokenUsageResponseBody(Builder builder) {
        this.completionTokens = builder.completionTokens;
        this.explicitCachedTokens = builder.explicitCachedTokens;
        this.implicitCachedTokens = builder.implicitCachedTokens;
        this.promptTokens = builder.promptTokens;
        this.requestId = builder.requestId;
        this.tokenUsages = builder.tokenUsages;
        this.totalTokens = builder.totalTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLLMTokenUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return completionTokens
     */
    public Long getCompletionTokens() {
        return this.completionTokens;
    }

    /**
     * @return explicitCachedTokens
     */
    public Long getExplicitCachedTokens() {
        return this.explicitCachedTokens;
    }

    /**
     * @return implicitCachedTokens
     */
    public Long getImplicitCachedTokens() {
        return this.implicitCachedTokens;
    }

    /**
     * @return promptTokens
     */
    public Long getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tokenUsages
     */
    public java.util.List<TokenUsages> getTokenUsages() {
        return this.tokenUsages;
    }

    /**
     * @return totalTokens
     */
    public Long getTotalTokens() {
        return this.totalTokens;
    }

    public static final class Builder {
        private Long completionTokens; 
        private Long explicitCachedTokens; 
        private Long implicitCachedTokens; 
        private Long promptTokens; 
        private String requestId; 
        private java.util.List<TokenUsages> tokenUsages; 
        private Long totalTokens; 

        private Builder() {
        } 

        private Builder(ListLLMTokenUsageResponseBody model) {
            this.completionTokens = model.completionTokens;
            this.explicitCachedTokens = model.explicitCachedTokens;
            this.implicitCachedTokens = model.implicitCachedTokens;
            this.promptTokens = model.promptTokens;
            this.requestId = model.requestId;
            this.tokenUsages = model.tokenUsages;
            this.totalTokens = model.totalTokens;
        } 

        /**
         * CompletionTokens.
         */
        public Builder completionTokens(Long completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }

        /**
         * ExplicitCachedTokens.
         */
        public Builder explicitCachedTokens(Long explicitCachedTokens) {
            this.explicitCachedTokens = explicitCachedTokens;
            return this;
        }

        /**
         * ImplicitCachedTokens.
         */
        public Builder implicitCachedTokens(Long implicitCachedTokens) {
            this.implicitCachedTokens = implicitCachedTokens;
            return this;
        }

        /**
         * PromptTokens.
         */
        public Builder promptTokens(Long promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TokenUsages.
         */
        public Builder tokenUsages(java.util.List<TokenUsages> tokenUsages) {
            this.tokenUsages = tokenUsages;
            return this;
        }

        /**
         * TotalTokens.
         */
        public Builder totalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        public ListLLMTokenUsageResponseBody build() {
            return new ListLLMTokenUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLLMTokenUsageResponseBody} extends {@link TeaModel}
     *
     * <p>ListLLMTokenUsageResponseBody</p>
     */
    public static class TokenUsages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletionReasoningTokens")
        private Long completionReasoningTokens;

        @com.aliyun.core.annotation.NameInMap("CompletionTokens")
        private Long completionTokens;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExplicitCachedTokens")
        private Long explicitCachedTokens;

        @com.aliyun.core.annotation.NameInMap("ImplicitCachedTokens")
        private Long implicitCachedTokens;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("PromptTokens")
        private Long promptTokens;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

        private TokenUsages(Builder builder) {
            this.completionReasoningTokens = builder.completionReasoningTokens;
            this.completionTokens = builder.completionTokens;
            this.endTime = builder.endTime;
            this.explicitCachedTokens = builder.explicitCachedTokens;
            this.implicitCachedTokens = builder.implicitCachedTokens;
            this.model = builder.model;
            this.promptTokens = builder.promptTokens;
            this.startTime = builder.startTime;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TokenUsages create() {
            return builder().build();
        }

        /**
         * @return completionReasoningTokens
         */
        public Long getCompletionReasoningTokens() {
            return this.completionReasoningTokens;
        }

        /**
         * @return completionTokens
         */
        public Long getCompletionTokens() {
            return this.completionTokens;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return explicitCachedTokens
         */
        public Long getExplicitCachedTokens() {
            return this.explicitCachedTokens;
        }

        /**
         * @return implicitCachedTokens
         */
        public Long getImplicitCachedTokens() {
            return this.implicitCachedTokens;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return promptTokens
         */
        public Long getPromptTokens() {
            return this.promptTokens;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long completionReasoningTokens; 
            private Long completionTokens; 
            private String endTime; 
            private Long explicitCachedTokens; 
            private Long implicitCachedTokens; 
            private String model; 
            private Long promptTokens; 
            private String startTime; 
            private Long totalTokens; 

            private Builder() {
            } 

            private Builder(TokenUsages model) {
                this.completionReasoningTokens = model.completionReasoningTokens;
                this.completionTokens = model.completionTokens;
                this.endTime = model.endTime;
                this.explicitCachedTokens = model.explicitCachedTokens;
                this.implicitCachedTokens = model.implicitCachedTokens;
                this.model = model.model;
                this.promptTokens = model.promptTokens;
                this.startTime = model.startTime;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * CompletionReasoningTokens.
             */
            public Builder completionReasoningTokens(Long completionReasoningTokens) {
                this.completionReasoningTokens = completionReasoningTokens;
                return this;
            }

            /**
             * CompletionTokens.
             */
            public Builder completionTokens(Long completionTokens) {
                this.completionTokens = completionTokens;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExplicitCachedTokens.
             */
            public Builder explicitCachedTokens(Long explicitCachedTokens) {
                this.explicitCachedTokens = explicitCachedTokens;
                return this;
            }

            /**
             * ImplicitCachedTokens.
             */
            public Builder implicitCachedTokens(Long implicitCachedTokens) {
                this.implicitCachedTokens = implicitCachedTokens;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * PromptTokens.
             */
            public Builder promptTokens(Long promptTokens) {
                this.promptTokens = promptTokens;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TotalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public TokenUsages build() {
                return new TokenUsages(this);
            } 

        } 

    }
}
