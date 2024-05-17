// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeUpgradeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcubeUpgradeTaskResponseBody</p>
 */
public class CreateMcubeUpgradeTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTaskResult")
    private CreateTaskResult createTaskResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private CreateMcubeUpgradeTaskResponseBody(Builder builder) {
        this.createTaskResult = builder.createTaskResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeUpgradeTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTaskResult
     */
    public CreateTaskResult getCreateTaskResult() {
        return this.createTaskResult;
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
        private CreateTaskResult createTaskResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * CreateTaskResult.
         */
        public Builder createTaskResult(CreateTaskResult createTaskResult) {
            this.createTaskResult = createTaskResult;
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

        public CreateMcubeUpgradeTaskResponseBody build() {
            return new CreateMcubeUpgradeTaskResponseBody(this);
        } 

    } 

    public static class CreateTaskResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("upgradeTaskId")
        private String upgradeTaskId;

        private CreateTaskResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.upgradeTaskId = builder.upgradeTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateTaskResult create() {
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
         * @return upgradeTaskId
         */
        public String getUpgradeTaskId() {
            return this.upgradeTaskId;
        }

        public static final class Builder {
            private String errorCode; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 
            private String upgradeTaskId; 

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
             * upgradeTaskId.
             */
            public Builder upgradeTaskId(String upgradeTaskId) {
                this.upgradeTaskId = upgradeTaskId;
                return this;
            }

            public CreateTaskResult build() {
                return new CreateTaskResult(this);
            } 

        } 

    }
}
