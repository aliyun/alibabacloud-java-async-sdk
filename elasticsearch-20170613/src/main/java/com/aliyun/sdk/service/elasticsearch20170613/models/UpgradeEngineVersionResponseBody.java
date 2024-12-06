// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpgradeEngineVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeEngineVersionResponseBody</p>
 */
public class UpgradeEngineVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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
         * <p>The verification information.</p>
         * 
         * <strong>example:</strong>
         * <p>F99407AB-2FA9-489E-A259-40CF6DC*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the error. Valid values:</p>
         * <ul>
         * <li>clusterStatus: the health status of the cluster.</li>
         * <li>clusterConfigYml: Cluster YML File</li>
         * <li>clusterConfigPlugins: Cluster Configuration File</li>
         * <li>clusterResource: cluster resources</li>
         * <li>clusterSnapshot: cluster snapshot</li>
         * </ul>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public UpgradeEngineVersionResponseBody build() {
            return new UpgradeEngineVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpgradeEngineVersionResponseBody} extends {@link TeaModel}
     *
     * <p>UpgradeEngineVersionResponseBody</p>
     */
    public static class ValidateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("errorType")
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
             * <p>The verification is passed. Valid values:</p>
             * <ul>
             * <li>success: through</li>
             * <li>failed: failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>clusterStatus</p>
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
    /**
     * 
     * {@link UpgradeEngineVersionResponseBody} extends {@link TeaModel}
     *
     * <p>UpgradeEngineVersionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("validateResult")
        private java.util.List < ValidateResult> validateResult;

        @com.aliyun.core.annotation.NameInMap("validateType")
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
             * <p>The error message returned.</p>
             */
            public Builder validateResult(java.util.List < ValidateResult> validateResult) {
                this.validateResult = validateResult;
                return this;
            }

            /**
             * <p>The error code returned if the request failed.</p>
             * 
             * <strong>example:</strong>
             * <p>checkClusterHealth</p>
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
