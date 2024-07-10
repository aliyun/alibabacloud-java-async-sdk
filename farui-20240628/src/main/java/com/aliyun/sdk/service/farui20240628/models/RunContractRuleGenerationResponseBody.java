// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunContractRuleGenerationResponseBody} extends {@link TeaModel}
 *
 * <p>RunContractRuleGenerationResponseBody</p>
 */
public class RunContractRuleGenerationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Output")
    private Output output;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Usage")
    private Usage usage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    private RunContractRuleGenerationResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.output = builder.output;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.usage = builder.usage;
        this.httpStatusCode = builder.httpStatusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunContractRuleGenerationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
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

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Output output; 
        private String requestId; 
        private Boolean success; 
        private Usage usage; 
        private Integer httpStatusCode; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Output.
         */
        public Builder output(Output output) {
            this.output = output;
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

        /**
         * Usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        public RunContractRuleGenerationResponseBody build() {
            return new RunContractRuleGenerationResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("riskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("ruleSequence")
        private String ruleSequence;

        @com.aliyun.core.annotation.NameInMap("ruleTag")
        private String ruleTag;

        @com.aliyun.core.annotation.NameInMap("ruleTitle")
        private String ruleTitle;

        private Rules(Builder builder) {
            this.riskLevel = builder.riskLevel;
            this.ruleSequence = builder.ruleSequence;
            this.ruleTag = builder.ruleTag;
            this.ruleTitle = builder.ruleTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return ruleSequence
         */
        public String getRuleSequence() {
            return this.ruleSequence;
        }

        /**
         * @return ruleTag
         */
        public String getRuleTag() {
            return this.ruleTag;
        }

        /**
         * @return ruleTitle
         */
        public String getRuleTitle() {
            return this.ruleTitle;
        }

        public static final class Builder {
            private String riskLevel; 
            private String ruleSequence; 
            private String ruleTag; 
            private String ruleTitle; 

            /**
             * riskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * ruleSequence.
             */
            public Builder ruleSequence(String ruleSequence) {
                this.ruleSequence = ruleSequence;
                return this;
            }

            /**
             * ruleTag.
             */
            public Builder ruleTag(String ruleTag) {
                this.ruleTag = ruleTag;
                return this;
            }

            /**
             * ruleTitle.
             */
            public Builder ruleTitle(String ruleTitle) {
                this.ruleTitle = ruleTitle;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ruleTaskId")
        private String ruleTaskId;

        @com.aliyun.core.annotation.NameInMap("rules")
        private java.util.List < Rules> rules;

        private Output(Builder builder) {
            this.ruleTaskId = builder.ruleTaskId;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return ruleTaskId
         */
        public String getRuleTaskId() {
            return this.ruleTaskId;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String ruleTaskId; 
            private java.util.List < Rules> rules; 

            /**
             * ruleTaskId.
             */
            public Builder ruleTaskId(String ruleTaskId) {
                this.ruleTaskId = ruleTaskId;
                return this;
            }

            /**
             * rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("input")
        private Long input;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Usage(Builder builder) {
            this.input = builder.input;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public Long getInput() {
            return this.input;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Long input; 
            private String unit; 

            /**
             * input.
             */
            public Builder input(Long input) {
                this.input = input;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
