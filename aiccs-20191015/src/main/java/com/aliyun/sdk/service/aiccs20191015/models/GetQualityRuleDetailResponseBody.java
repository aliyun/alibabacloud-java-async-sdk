// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityRuleDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityRuleDetailResponseBody</p>
 */
public class GetQualityRuleDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetQualityRuleDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityRuleDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQualityRuleDetailResponseBody build() {
            return new GetQualityRuleDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("KeyWords")
        private java.util.List < String > keyWords;

        @NameInMap("MatchType")
        private Integer matchType;

        @NameInMap("Name")
        private String name;

        @NameInMap("RuleCreateTime")
        private String ruleCreateTime;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("RuleTag")
        private Integer ruleTag;

        private Data(Builder builder) {
            this.keyWords = builder.keyWords;
            this.matchType = builder.matchType;
            this.name = builder.name;
            this.ruleCreateTime = builder.ruleCreateTime;
            this.ruleId = builder.ruleId;
            this.ruleTag = builder.ruleTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return keyWords
         */
        public java.util.List < String > getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return matchType
         */
        public Integer getMatchType() {
            return this.matchType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleCreateTime
         */
        public String getRuleCreateTime() {
            return this.ruleCreateTime;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleTag
         */
        public Integer getRuleTag() {
            return this.ruleTag;
        }

        public static final class Builder {
            private java.util.List < String > keyWords; 
            private Integer matchType; 
            private String name; 
            private String ruleCreateTime; 
            private Long ruleId; 
            private Integer ruleTag; 

            /**
             * KeyWords.
             */
            public Builder keyWords(java.util.List < String > keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * MatchType.
             */
            public Builder matchType(Integer matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleCreateTime.
             */
            public Builder ruleCreateTime(String ruleCreateTime) {
                this.ruleCreateTime = ruleCreateTime;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleTag.
             */
            public Builder ruleTag(Integer ruleTag) {
                this.ruleTag = ruleTag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
