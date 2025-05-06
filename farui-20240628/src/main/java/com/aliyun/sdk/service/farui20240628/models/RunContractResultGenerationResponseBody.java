// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

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
 * {@link RunContractResultGenerationResponseBody} extends {@link TeaModel}
 *
 * <p>RunContractResultGenerationResponseBody</p>
 */
public class RunContractResultGenerationResponseBody extends TeaModel {
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
    private String httpStatusCode;

    private RunContractResultGenerationResponseBody(Builder builder) {
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

    public static RunContractResultGenerationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Output output; 
        private String requestId; 
        private Boolean success; 
        private Usage usage; 
        private String httpStatusCode; 

        private Builder() {
        } 

        private Builder(RunContractResultGenerationResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.output = model.output;
            this.requestId = model.requestId;
            this.success = model.success;
            this.usage = model.usage;
            this.httpStatusCode = model.httpStatusCode;
        } 

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
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        public RunContractResultGenerationResponseBody build() {
            return new RunContractResultGenerationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunContractResultGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunContractResultGenerationResponseBody</p>
     */
    public static class SubRisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("originalContent")
        private String originalContent;

        @com.aliyun.core.annotation.NameInMap("resultContent")
        private String resultContent;

        @com.aliyun.core.annotation.NameInMap("resultType")
        private String resultType;

        @com.aliyun.core.annotation.NameInMap("riskBrief")
        private String riskBrief;

        @com.aliyun.core.annotation.NameInMap("riskClause")
        private String riskClause;

        @com.aliyun.core.annotation.NameInMap("riskExplain")
        private String riskExplain;

        private SubRisks(Builder builder) {
            this.originalContent = builder.originalContent;
            this.resultContent = builder.resultContent;
            this.resultType = builder.resultType;
            this.riskBrief = builder.riskBrief;
            this.riskClause = builder.riskClause;
            this.riskExplain = builder.riskExplain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubRisks create() {
            return builder().build();
        }

        /**
         * @return originalContent
         */
        public String getOriginalContent() {
            return this.originalContent;
        }

        /**
         * @return resultContent
         */
        public String getResultContent() {
            return this.resultContent;
        }

        /**
         * @return resultType
         */
        public String getResultType() {
            return this.resultType;
        }

        /**
         * @return riskBrief
         */
        public String getRiskBrief() {
            return this.riskBrief;
        }

        /**
         * @return riskClause
         */
        public String getRiskClause() {
            return this.riskClause;
        }

        /**
         * @return riskExplain
         */
        public String getRiskExplain() {
            return this.riskExplain;
        }

        public static final class Builder {
            private String originalContent; 
            private String resultContent; 
            private String resultType; 
            private String riskBrief; 
            private String riskClause; 
            private String riskExplain; 

            private Builder() {
            } 

            private Builder(SubRisks model) {
                this.originalContent = model.originalContent;
                this.resultContent = model.resultContent;
                this.resultType = model.resultType;
                this.riskBrief = model.riskBrief;
                this.riskClause = model.riskClause;
                this.riskExplain = model.riskExplain;
            } 

            /**
             * originalContent.
             */
            public Builder originalContent(String originalContent) {
                this.originalContent = originalContent;
                return this;
            }

            /**
             * resultContent.
             */
            public Builder resultContent(String resultContent) {
                this.resultContent = resultContent;
                return this;
            }

            /**
             * resultType.
             */
            public Builder resultType(String resultType) {
                this.resultType = resultType;
                return this;
            }

            /**
             * riskBrief.
             */
            public Builder riskBrief(String riskBrief) {
                this.riskBrief = riskBrief;
                return this;
            }

            /**
             * riskClause.
             */
            public Builder riskClause(String riskClause) {
                this.riskClause = riskClause;
                return this;
            }

            /**
             * riskExplain.
             */
            public Builder riskExplain(String riskExplain) {
                this.riskExplain = riskExplain;
                return this;
            }

            public SubRisks build() {
                return new SubRisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunContractResultGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunContractResultGenerationResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("examineBrief")
        private String examineBrief;

        @com.aliyun.core.annotation.NameInMap("examineResult")
        private String examineResult;

        @com.aliyun.core.annotation.NameInMap("riskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("ruleSequence")
        private String ruleSequence;

        @com.aliyun.core.annotation.NameInMap("ruleTag")
        private String ruleTag;

        @com.aliyun.core.annotation.NameInMap("ruleTitle")
        private String ruleTitle;

        @com.aliyun.core.annotation.NameInMap("subRisks")
        private java.util.List<SubRisks> subRisks;

        private Result(Builder builder) {
            this.examineBrief = builder.examineBrief;
            this.examineResult = builder.examineResult;
            this.riskLevel = builder.riskLevel;
            this.ruleSequence = builder.ruleSequence;
            this.ruleTag = builder.ruleTag;
            this.ruleTitle = builder.ruleTitle;
            this.subRisks = builder.subRisks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return examineBrief
         */
        public String getExamineBrief() {
            return this.examineBrief;
        }

        /**
         * @return examineResult
         */
        public String getExamineResult() {
            return this.examineResult;
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

        /**
         * @return subRisks
         */
        public java.util.List<SubRisks> getSubRisks() {
            return this.subRisks;
        }

        public static final class Builder {
            private String examineBrief; 
            private String examineResult; 
            private String riskLevel; 
            private String ruleSequence; 
            private String ruleTag; 
            private String ruleTitle; 
            private java.util.List<SubRisks> subRisks; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.examineBrief = model.examineBrief;
                this.examineResult = model.examineResult;
                this.riskLevel = model.riskLevel;
                this.ruleSequence = model.ruleSequence;
                this.ruleTag = model.ruleTag;
                this.ruleTitle = model.ruleTitle;
                this.subRisks = model.subRisks;
            } 

            /**
             * examineBrief.
             */
            public Builder examineBrief(String examineBrief) {
                this.examineBrief = examineBrief;
                return this;
            }

            /**
             * examineResult.
             */
            public Builder examineResult(String examineResult) {
                this.examineResult = examineResult;
                return this;
            }

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

            /**
             * subRisks.
             */
            public Builder subRisks(java.util.List<SubRisks> subRisks) {
                this.subRisks = subRisks;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunContractResultGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunContractResultGenerationResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("resultTaskId")
        private String resultTaskId;

        private Output(Builder builder) {
            this.result = builder.result;
            this.resultTaskId = builder.resultTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return resultTaskId
         */
        public String getResultTaskId() {
            return this.resultTaskId;
        }

        public static final class Builder {
            private Result result; 
            private String resultTaskId; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.result = model.result;
                this.resultTaskId = model.resultTaskId;
            } 

            /**
             * result.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * resultTaskId.
             */
            public Builder resultTaskId(String resultTaskId) {
                this.resultTaskId = resultTaskId;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunContractResultGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>RunContractResultGenerationResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Usage model) {
                this.input = model.input;
                this.unit = model.unit;
            } 

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
