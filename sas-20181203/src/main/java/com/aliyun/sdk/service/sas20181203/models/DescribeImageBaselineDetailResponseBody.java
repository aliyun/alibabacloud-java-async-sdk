// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineDetailResponseBody</p>
 */
public class DescribeImageBaselineDetailResponseBody extends TeaModel {
    @NameInMap("BaselineDetail")
    private BaselineDetail baselineDetail;

    @NameInMap("RequestId")
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
         * BaselineDetail.
         */
        public Builder baselineDetail(BaselineDetail baselineDetail) {
            this.baselineDetail = baselineDetail;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Advice")
        private String advice;

        @NameInMap("BaselineClassAlias")
        private String baselineClassAlias;

        @NameInMap("BaselineItemAlias")
        private String baselineItemAlias;

        @NameInMap("BaselineItemKey")
        private String baselineItemKey;

        @NameInMap("BaselineNameAlias")
        private String baselineNameAlias;

        @NameInMap("Description")
        private String description;

        @NameInMap("Level")
        private String level;

        @NameInMap("Prompt")
        private String prompt;

        @NameInMap("ResultId")
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
             * Advice.
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * BaselineClassAlias.
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * BaselineItemAlias.
             */
            public Builder baselineItemAlias(String baselineItemAlias) {
                this.baselineItemAlias = baselineItemAlias;
                return this;
            }

            /**
             * BaselineItemKey.
             */
            public Builder baselineItemKey(String baselineItemKey) {
                this.baselineItemKey = baselineItemKey;
                return this;
            }

            /**
             * BaselineNameAlias.
             */
            public Builder baselineNameAlias(String baselineNameAlias) {
                this.baselineNameAlias = baselineNameAlias;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
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
             * ResultId.
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
