// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20200710.models;

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
 * {@link CreateMcubeUpgradePackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcubeUpgradePackageResponseBody</p>
 */
public class CreateMcubeUpgradePackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateUpgradePackageResult")
    private CreateUpgradePackageResult createUpgradePackageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private CreateMcubeUpgradePackageResponseBody(Builder builder) {
        this.createUpgradePackageResult = builder.createUpgradePackageResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeUpgradePackageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createUpgradePackageResult
     */
    public CreateUpgradePackageResult getCreateUpgradePackageResult() {
        return this.createUpgradePackageResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private CreateUpgradePackageResult createUpgradePackageResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(CreateMcubeUpgradePackageResponseBody model) {
            this.createUpgradePackageResult = model.createUpgradePackageResult;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * CreateUpgradePackageResult.
         */
        public Builder createUpgradePackageResult(CreateUpgradePackageResult createUpgradePackageResult) {
            this.createUpgradePackageResult = createUpgradePackageResult;
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
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public CreateMcubeUpgradePackageResponseBody build() {
            return new CreateMcubeUpgradePackageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMcubeUpgradePackageResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcubeUpgradePackageResponseBody</p>
     */
    public static class CreateUpgradePackageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("UpgradePackageId")
        private String upgradePackageId;

        private CreateUpgradePackageResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.upgradePackageId = builder.upgradePackageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateUpgradePackageResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return upgradePackageId
         */
        public String getUpgradePackageId() {
            return this.upgradePackageId;
        }

        public static final class Builder {
            private String errorCode; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 
            private String upgradePackageId; 

            private Builder() {
            } 

            private Builder(CreateUpgradePackageResult model) {
                this.errorCode = model.errorCode;
                this.requestId = model.requestId;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
                this.upgradePackageId = model.upgradePackageId;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
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
             * UpgradePackageId.
             */
            public Builder upgradePackageId(String upgradePackageId) {
                this.upgradePackageId = upgradePackageId;
                return this;
            }

            public CreateUpgradePackageResult build() {
                return new CreateUpgradePackageResult(this);
            } 

        } 

    }
}
