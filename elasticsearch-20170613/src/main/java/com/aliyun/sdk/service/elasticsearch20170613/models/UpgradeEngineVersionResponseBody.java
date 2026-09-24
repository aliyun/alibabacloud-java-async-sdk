// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpgradeEngineVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeEngineVersionResponseBody</p>
 */
public class UpgradeEngineVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(UpgradeEngineVersionResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F99407AB-2FA9-489E-A259-40CF6DC*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List<Result> result) {
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

            private Builder() {
            } 

            private Builder(ValidateResult model) {
                this.errorCode = model.errorCode;
                this.errorMsg = model.errorMsg;
                this.errorType = model.errorType;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ClusterStatusNotHealth</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>The cluster status is not health</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The error type. Valid values:</p>
             * <ul>
             * <li>clusterStatus: cluster health status.</li>
             * <li>clusterConfigYml: cluster YML file.</li>
             * <li>clusterConfigPlugins: cluster configuration file.</li>
             * <li>clusterResource: cluster resources.</li>
             * <li>clusterSnapshot: cluster snapshot.</li>
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
        private java.util.List<ValidateResult> validateResult;

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
        public java.util.List<ValidateResult> getValidateResult() {
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
            private java.util.List<ValidateResult> validateResult; 
            private String validateType; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.status = model.status;
                this.validateResult = model.validateResult;
                this.validateType = model.validateType;
            } 

            /**
             * <p>Indicates whether the check is passed. Valid values:</p>
             * <ul>
             * <li>success: passed.</li>
             * <li>failed: not passed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The check information.</p>
             */
            public Builder validateResult(java.util.List<ValidateResult> validateResult) {
                this.validateResult = validateResult;
                return this;
            }

            /**
             * <p>The check type. Valid values:</p>
             * <ul>
             * <li>checkClusterHealth: cluster health status.</li>
             * <li>checkConfigCompatible: configuration compatibility status.</li>
             * <li>checkClusterResource: resource space status.</li>
             * <li>checkClusterSnapshot: whether a snapshot exists.</li>
             * </ul>
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
