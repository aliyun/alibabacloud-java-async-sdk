// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link MaterialInspectionResponseBody} extends {@link TeaModel}
 *
 * <p>MaterialInspectionResponseBody</p>
 */
public class MaterialInspectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private MaterialInspectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MaterialInspectionResponseBody create() {
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

        private Builder() {
        } 

        private Builder(MaterialInspectionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. This parameter is not returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The material display detection result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. This parameter is not returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public MaterialInspectionResponseBody build() {
            return new MaterialInspectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MaterialInspectionResponseBody} extends {@link TeaModel}
     *
     * <p>MaterialInspectionResponseBody</p>
     */
    public static class Steps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("StepId")
        private String stepId;

        private Steps(Builder builder) {
            this.result = builder.result;
            this.stepId = builder.stepId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Steps create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return stepId
         */
        public String getStepId() {
            return this.stepId;
        }

        public static final class Builder {
            private String result; 
            private String stepId; 

            private Builder() {
            } 

            private Builder(Steps model) {
                this.result = model.result;
                this.stepId = model.stepId;
            } 

            /**
             * <p>The determination result of the step. Valid values: PASS, FAIL, and UNABLE_TO_JUDGE.</p>
             * 
             * <strong>example:</strong>
             * <p>PASS</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The step ID.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX</p>
             */
            public Builder stepId(String stepId) {
                this.stepId = stepId;
                return this;
            }

            public Steps build() {
                return new Steps(this);
            } 

        } 

    }
    /**
     * 
     * {@link MaterialInspectionResponseBody} extends {@link TeaModel}
     *
     * <p>MaterialInspectionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Evidence")
        private String evidence;

        @com.aliyun.core.annotation.NameInMap("OverallResult")
        private String overallResult;

        @com.aliyun.core.annotation.NameInMap("ReqId")
        private String reqId;

        @com.aliyun.core.annotation.NameInMap("Steps")
        private java.util.List<Steps> steps;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.evidence = builder.evidence;
            this.overallResult = builder.overallResult;
            this.reqId = builder.reqId;
            this.steps = builder.steps;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return evidence
         */
        public String getEvidence() {
            return this.evidence;
        }

        /**
         * @return overallResult
         */
        public String getOverallResult() {
            return this.overallResult;
        }

        /**
         * @return reqId
         */
        public String getReqId() {
            return this.reqId;
        }

        /**
         * @return steps
         */
        public java.util.List<Steps> getSteps() {
            return this.steps;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String evidence; 
            private String overallResult; 
            private String reqId; 
            private java.util.List<Steps> steps; 
            private String type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.evidence = model.evidence;
                this.overallResult = model.overallResult;
                this.reqId = model.reqId;
                this.steps = model.steps;
                this.type = model.type;
            } 

            /**
             * <p>The natural language summary, such as &quot;1 rule: 1 PASS, all inspection items are compliant.&quot;</p>
             * 
             * <strong>example:</strong>
             * <p>1 rule: 1 PASS, all inspection items are compliant</p>
             */
            public Builder evidence(String evidence) {
                this.evidence = evidence;
                return this;
            }

            /**
             * <p>The overall determination result. Valid values: PASS and FAIL.</p>
             * 
             * <strong>example:</strong>
             * <p>PASS</p>
             */
            public Builder overallResult(String overallResult) {
                this.overallResult = overallResult;
                return this;
            }

            /**
             * <p>The request ID returned as-is from the request.</p>
             * 
             * <strong>example:</strong>
             * <p>req-001</p>
             */
            public Builder reqId(String reqId) {
                this.reqId = reqId;
                return this;
            }

            /**
             * <p>The list of detection steps.</p>
             */
            public Builder steps(java.util.List<Steps> steps) {
                this.steps = steps;
                return this;
            }

            /**
             * <p>The detection type.</p>
             * 
             * <strong>example:</strong>
             * <p>Stamp</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link MaterialInspectionResponseBody} extends {@link TeaModel}
     *
     * <p>MaterialInspectionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.result = builder.result;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private Result result; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.result = model.result;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The inspection result.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The usage information. The key is the usage metric name and the value is the count.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ProcessingCount&quot;:1}</p>
             */
            public Builder usageMap(java.util.Map<String, Long> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
