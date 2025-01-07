// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The details about the image baseline.</p>
         */
        public Builder baselineDetail(BaselineDetail baselineDetail) {
            this.baselineDetail = baselineDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageBaselineDetailResponseBody build() {
            return new DescribeImageBaselineDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageBaselineDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBaselineDetailResponseBody</p>
     */
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
             * <p>The suggestion for the management of the risk item.</p>
             * 
             * <strong>example:</strong>
             * <p>Delete the leaked AccessKey pairs.</p>
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * <p>The alias of the baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>ak_leak</p>
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * <p>The alias of the baseline check item.</p>
             * 
             * <strong>example:</strong>
             * <p>AccessKey pair leak</p>
             */
            public Builder baselineItemAlias(String baselineItemAlias) {
                this.baselineItemAlias = baselineItemAlias;
                return this;
            }

            /**
             * <p>The key of the baseline check item.</p>
             * 
             * <strong>example:</strong>
             * <p>ak_leak</p>
             */
            public Builder baselineItemKey(String baselineItemKey) {
                this.baselineItemKey = baselineItemKey;
                return this;
            }

            /**
             * <p>The alias of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>AccessKey pair leak</p>
             */
            public Builder baselineNameAlias(String baselineNameAlias) {
                this.baselineNameAlias = baselineNameAlias;
                return this;
            }

            /**
             * <p>The description of the risk item.</p>
             * 
             * <strong>example:</strong>
             * <p>If an AccessKey pair is leaked, the AccessKey pair may be fraudulently used.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The risk level of the baseline check item. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The issue that is detected by using the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/aksk.txt:LTAI4GBEG5zaqX**********</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * <p>The ID of the asynchronous request.</p>
             * 
             * <strong>example:</strong>
             * <p>async__c6f3b0b54613383b40bdce593ffe****</p>
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
