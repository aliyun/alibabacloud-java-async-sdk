// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link DescribeNavigationConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNavigationConfigResponseBody</p>
 */
public class DescribeNavigationConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GreetingConfig")
    private GreetingConfig greetingConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SilenceTimeoutConfig")
    private SilenceTimeoutConfig silenceTimeoutConfig;

    @com.aliyun.core.annotation.NameInMap("UnrecognizingConfig")
    private UnrecognizingConfig unrecognizingConfig;

    private DescribeNavigationConfigResponseBody(Builder builder) {
        this.greetingConfig = builder.greetingConfig;
        this.requestId = builder.requestId;
        this.silenceTimeoutConfig = builder.silenceTimeoutConfig;
        this.unrecognizingConfig = builder.unrecognizingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNavigationConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return greetingConfig
     */
    public GreetingConfig getGreetingConfig() {
        return this.greetingConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return silenceTimeoutConfig
     */
    public SilenceTimeoutConfig getSilenceTimeoutConfig() {
        return this.silenceTimeoutConfig;
    }

    /**
     * @return unrecognizingConfig
     */
    public UnrecognizingConfig getUnrecognizingConfig() {
        return this.unrecognizingConfig;
    }

    public static final class Builder {
        private GreetingConfig greetingConfig; 
        private String requestId; 
        private SilenceTimeoutConfig silenceTimeoutConfig; 
        private UnrecognizingConfig unrecognizingConfig; 

        /**
         * GreetingConfig.
         */
        public Builder greetingConfig(GreetingConfig greetingConfig) {
            this.greetingConfig = greetingConfig;
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
         * SilenceTimeoutConfig.
         */
        public Builder silenceTimeoutConfig(SilenceTimeoutConfig silenceTimeoutConfig) {
            this.silenceTimeoutConfig = silenceTimeoutConfig;
            return this;
        }

        /**
         * UnrecognizingConfig.
         */
        public Builder unrecognizingConfig(UnrecognizingConfig unrecognizingConfig) {
            this.unrecognizingConfig = unrecognizingConfig;
            return this;
        }

        public DescribeNavigationConfigResponseBody build() {
            return new DescribeNavigationConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNavigationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNavigationConfigResponseBody</p>
     */
    public static class GreetingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GreetingWords")
        private String greetingWords;

        @com.aliyun.core.annotation.NameInMap("IntentTrigger")
        private String intentTrigger;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private GreetingConfig(Builder builder) {
            this.greetingWords = builder.greetingWords;
            this.intentTrigger = builder.intentTrigger;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GreetingConfig create() {
            return builder().build();
        }

        /**
         * @return greetingWords
         */
        public String getGreetingWords() {
            return this.greetingWords;
        }

        /**
         * @return intentTrigger
         */
        public String getIntentTrigger() {
            return this.intentTrigger;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String greetingWords; 
            private String intentTrigger; 
            private String sourceType; 

            /**
             * GreetingWords.
             */
            public Builder greetingWords(String greetingWords) {
                this.greetingWords = greetingWords;
                return this;
            }

            /**
             * IntentTrigger.
             */
            public Builder intentTrigger(String intentTrigger) {
                this.intentTrigger = intentTrigger;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public GreetingConfig build() {
                return new GreetingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNavigationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNavigationConfigResponseBody</p>
     */
    public static class SilenceTimeoutConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinalAction")
        private String finalAction;

        @com.aliyun.core.annotation.NameInMap("FinalActionParams")
        private String finalActionParams;

        @com.aliyun.core.annotation.NameInMap("FinalPrompt")
        private String finalPrompt;

        @com.aliyun.core.annotation.NameInMap("IntentTrigger")
        private String intentTrigger;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Integer threshold;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        private SilenceTimeoutConfig(Builder builder) {
            this.finalAction = builder.finalAction;
            this.finalActionParams = builder.finalActionParams;
            this.finalPrompt = builder.finalPrompt;
            this.intentTrigger = builder.intentTrigger;
            this.prompt = builder.prompt;
            this.sourceType = builder.sourceType;
            this.threshold = builder.threshold;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SilenceTimeoutConfig create() {
            return builder().build();
        }

        /**
         * @return finalAction
         */
        public String getFinalAction() {
            return this.finalAction;
        }

        /**
         * @return finalActionParams
         */
        public String getFinalActionParams() {
            return this.finalActionParams;
        }

        /**
         * @return finalPrompt
         */
        public String getFinalPrompt() {
            return this.finalPrompt;
        }

        /**
         * @return intentTrigger
         */
        public String getIntentTrigger() {
            return this.intentTrigger;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return threshold
         */
        public Integer getThreshold() {
            return this.threshold;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private String finalAction; 
            private String finalActionParams; 
            private String finalPrompt; 
            private String intentTrigger; 
            private String prompt; 
            private String sourceType; 
            private Integer threshold; 
            private Long timeout; 

            /**
             * FinalAction.
             */
            public Builder finalAction(String finalAction) {
                this.finalAction = finalAction;
                return this;
            }

            /**
             * FinalActionParams.
             */
            public Builder finalActionParams(String finalActionParams) {
                this.finalActionParams = finalActionParams;
                return this;
            }

            /**
             * FinalPrompt.
             */
            public Builder finalPrompt(String finalPrompt) {
                this.finalPrompt = finalPrompt;
                return this;
            }

            /**
             * <p>&quot;&quot;</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder intentTrigger(String intentTrigger) {
                this.intentTrigger = intentTrigger;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Integer threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            public SilenceTimeoutConfig build() {
                return new SilenceTimeoutConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNavigationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNavigationConfigResponseBody</p>
     */
    public static class UnrecognizingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinalAction")
        private String finalAction;

        @com.aliyun.core.annotation.NameInMap("FinalActionParams")
        private String finalActionParams;

        @com.aliyun.core.annotation.NameInMap("FinalPrompt")
        private String finalPrompt;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Integer threshold;

        private UnrecognizingConfig(Builder builder) {
            this.finalAction = builder.finalAction;
            this.finalActionParams = builder.finalActionParams;
            this.finalPrompt = builder.finalPrompt;
            this.prompt = builder.prompt;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnrecognizingConfig create() {
            return builder().build();
        }

        /**
         * @return finalAction
         */
        public String getFinalAction() {
            return this.finalAction;
        }

        /**
         * @return finalActionParams
         */
        public String getFinalActionParams() {
            return this.finalActionParams;
        }

        /**
         * @return finalPrompt
         */
        public String getFinalPrompt() {
            return this.finalPrompt;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return threshold
         */
        public Integer getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String finalAction; 
            private String finalActionParams; 
            private String finalPrompt; 
            private String prompt; 
            private Integer threshold; 

            /**
             * FinalAction.
             */
            public Builder finalAction(String finalAction) {
                this.finalAction = finalAction;
                return this;
            }

            /**
             * FinalActionParams.
             */
            public Builder finalActionParams(String finalActionParams) {
                this.finalActionParams = finalActionParams;
                return this;
            }

            /**
             * FinalPrompt.
             */
            public Builder finalPrompt(String finalPrompt) {
                this.finalPrompt = finalPrompt;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Integer threshold) {
                this.threshold = threshold;
                return this;
            }

            public UnrecognizingConfig build() {
                return new UnrecognizingConfig(this);
            } 

        } 

    }
}
