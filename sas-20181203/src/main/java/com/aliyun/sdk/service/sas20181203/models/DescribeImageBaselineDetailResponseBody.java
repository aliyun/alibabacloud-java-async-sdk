// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineDetailResponseBody</p>
 */
public class DescribeImageBaselineDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaselineDetail")
    private BaselineDetail baselineDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageBaselineDetailResponseBody(Builder builder) {
        this.baselineDetail = builder.baselineDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBaselineDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return baselineDetail
     */
    public BaselineDetail getBaselineDetail() {
        return this.baselineDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BaselineDetail baselineDetail; 
        private String requestId; 

        /**
         * The details about the image baseline.
         */
        public Builder baselineDetail(BaselineDetail baselineDetail) {
            this.baselineDetail = baselineDetail;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageBaselineDetailResponseBody build() {
            return new DescribeImageBaselineDetailResponseBody(this);
        } 

    } 

    public static class BaselineDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advice")
        private String advice;

        @com.aliyun.core.annotation.NameInMap("BaselineClassAlias")
        private String baselineClassAlias;

        @com.aliyun.core.annotation.NameInMap("BaselineItemAlias")
        private String baselineItemAlias;

        @com.aliyun.core.annotation.NameInMap("BaselineItemKey")
        private String baselineItemKey;

        @com.aliyun.core.annotation.NameInMap("BaselineNameAlias")
        private String baselineNameAlias;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("ResultId")
        private String resultId;

        private BaselineDetail(Builder builder) {
            this.advice = builder.advice;
            this.baselineClassAlias = builder.baselineClassAlias;
            this.baselineItemAlias = builder.baselineItemAlias;
            this.baselineItemKey = builder.baselineItemKey;
            this.baselineNameAlias = builder.baselineNameAlias;
            this.description = builder.description;
            this.level = builder.level;
            this.prompt = builder.prompt;
            this.resultId = builder.resultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineDetail create() {
            return builder().build();
        }

        /**
         * @return advice
         */
        public String getAdvice() {
            return this.advice;
        }

        /**
         * @return baselineClassAlias
         */
        public String getBaselineClassAlias() {
            return this.baselineClassAlias;
        }

        /**
         * @return baselineItemAlias
         */
        public String getBaselineItemAlias() {
            return this.baselineItemAlias;
        }

        /**
         * @return baselineItemKey
         */
        public String getBaselineItemKey() {
            return this.baselineItemKey;
        }

        /**
         * @return baselineNameAlias
         */
        public String getBaselineNameAlias() {
            return this.baselineNameAlias;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return resultId
         */
        public String getResultId() {
            return this.resultId;
        }

        public static final class Builder {
            private String advice; 
            private String baselineClassAlias; 
            private String baselineItemAlias; 
            private String baselineItemKey; 
            private String baselineNameAlias; 
            private String description; 
            private String level; 
            private String prompt; 
            private String resultId; 

            /**
             * The suggestion for the management of the risk item.
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * The alias of the baseline type.
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * The alias of the baseline check item.
             */
            public Builder baselineItemAlias(String baselineItemAlias) {
                this.baselineItemAlias = baselineItemAlias;
                return this;
            }

            /**
             * The key of the baseline check item.
             */
            public Builder baselineItemKey(String baselineItemKey) {
                this.baselineItemKey = baselineItemKey;
                return this;
            }

            /**
             * The alias of the baseline.
             */
            public Builder baselineNameAlias(String baselineNameAlias) {
                this.baselineNameAlias = baselineNameAlias;
                return this;
            }

            /**
             * The description of the risk item.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The risk level of the baseline check item. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The issue that is detected by using the baseline.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * The ID of the asynchronous request.
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            public BaselineDetail build() {
                return new BaselineDetail(this);
            } 

        } 

    }
}
