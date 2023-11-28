// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeEngineVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeEngineVersionResponseBody</p>
 */
public class UpgradeEngineVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private UpgradeEngineVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeEngineVersionResponseBody create() {
        return builder().build();
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The verification information.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The type of the error. Valid values:
         * <p>
         * 
         * *   clusterStatus: the health status of the cluster.
         * *   clusterConfigYml: Cluster YML File
         * *   clusterConfigPlugins: Cluster Configuration File
         * *   clusterResource: cluster resources
         * *   clusterSnapshot: cluster snapshot
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public UpgradeEngineVersionResponseBody build() {
            return new UpgradeEngineVersionResponseBody(this);
        } 

    } 

    public static class ValidateResult extends TeaModel {
        @NameInMap("errorCode")
        private String errorCode;

        @NameInMap("errorMsg")
        private String errorMsg;

        @NameInMap("errorType")
        private String errorType;

        private ValidateResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.errorType = builder.errorType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidateResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMsg; 
            private String errorType; 

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * errorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The verification is passed. Valid values:
             * <p>
             * 
             * *   success: through
             * *   failed: failed
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            public ValidateResult build() {
                return new ValidateResult(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("status")
        private String status;

        @NameInMap("validateResult")
        private java.util.List < ValidateResult> validateResult;

        @NameInMap("validateType")
        private String validateType;

        private Result(Builder builder) {
            this.status = builder.status;
            this.validateResult = builder.validateResult;
            this.validateType = builder.validateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return validateResult
         */
        public java.util.List < ValidateResult> getValidateResult() {
            return this.validateResult;
        }

        /**
         * @return validateType
         */
        public String getValidateType() {
            return this.validateType;
        }

        public static final class Builder {
            private String status; 
            private java.util.List < ValidateResult> validateResult; 
            private String validateType; 

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder validateResult(java.util.List < ValidateResult> validateResult) {
                this.validateResult = validateResult;
                return this;
            }

            /**
             * The error code returned if the request failed.
             */
            public Builder validateType(String validateType) {
                this.validateType = validateType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
