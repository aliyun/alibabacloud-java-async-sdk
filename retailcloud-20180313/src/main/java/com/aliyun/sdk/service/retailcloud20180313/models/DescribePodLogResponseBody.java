// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePodLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePodLogResponseBody</p>
 */
public class DescribePodLogResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribePodLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePodLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribePodLogResponseBody build() {
            return new DescribePodLogResponseBody(this);
        } 

    } 

    public static class DeployStepList extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("StepCode")
        private String stepCode;

        @NameInMap("StepLog")
        private String stepLog;

        @NameInMap("StepName")
        private String stepName;

        private DeployStepList(Builder builder) {
            this.status = builder.status;
            this.stepCode = builder.stepCode;
            this.stepLog = builder.stepLog;
            this.stepName = builder.stepName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployStepList create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stepCode
         */
        public String getStepCode() {
            return this.stepCode;
        }

        /**
         * @return stepLog
         */
        public String getStepLog() {
            return this.stepLog;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        public static final class Builder {
            private String status; 
            private String stepCode; 
            private String stepLog; 
            private String stepName; 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StepCode.
             */
            public Builder stepCode(String stepCode) {
                this.stepCode = stepCode;
                return this;
            }

            /**
             * StepLog.
             */
            public Builder stepLog(String stepLog) {
                this.stepLog = stepLog;
                return this;
            }

            /**
             * StepName.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            public DeployStepList build() {
                return new DeployStepList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("DeployOrderName")
        private String deployOrderName;

        @NameInMap("DeployStepList")
        private java.util.List < DeployStepList> deployStepList;

        @NameInMap("EnvTypeName")
        private String envTypeName;

        private Result(Builder builder) {
            this.deployOrderName = builder.deployOrderName;
            this.deployStepList = builder.deployStepList;
            this.envTypeName = builder.envTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return deployOrderName
         */
        public String getDeployOrderName() {
            return this.deployOrderName;
        }

        /**
         * @return deployStepList
         */
        public java.util.List < DeployStepList> getDeployStepList() {
            return this.deployStepList;
        }

        /**
         * @return envTypeName
         */
        public String getEnvTypeName() {
            return this.envTypeName;
        }

        public static final class Builder {
            private String deployOrderName; 
            private java.util.List < DeployStepList> deployStepList; 
            private String envTypeName; 

            /**
             * DeployOrderName.
             */
            public Builder deployOrderName(String deployOrderName) {
                this.deployOrderName = deployOrderName;
                return this;
            }

            /**
             * DeployStepList.
             */
            public Builder deployStepList(java.util.List < DeployStepList> deployStepList) {
                this.deployStepList = deployStepList;
                return this;
            }

            /**
             * EnvTypeName.
             */
            public Builder envTypeName(String envTypeName) {
                this.envTypeName = envTypeName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
