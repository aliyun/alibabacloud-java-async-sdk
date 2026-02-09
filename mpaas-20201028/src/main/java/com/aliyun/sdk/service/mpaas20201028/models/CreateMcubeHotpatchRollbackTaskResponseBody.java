// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link CreateMcubeHotpatchRollbackTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcubeHotpatchRollbackTaskResponseBody</p>
 */
public class CreateMcubeHotpatchRollbackTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateHotpatchRollbackTaskResult")
    private CreateHotpatchRollbackTaskResult createHotpatchRollbackTaskResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private CreateMcubeHotpatchRollbackTaskResponseBody(Builder builder) {
        this.createHotpatchRollbackTaskResult = builder.createHotpatchRollbackTaskResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeHotpatchRollbackTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createHotpatchRollbackTaskResult
     */
    public CreateHotpatchRollbackTaskResult getCreateHotpatchRollbackTaskResult() {
        return this.createHotpatchRollbackTaskResult;
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
        private CreateHotpatchRollbackTaskResult createHotpatchRollbackTaskResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(CreateMcubeHotpatchRollbackTaskResponseBody model) {
            this.createHotpatchRollbackTaskResult = model.createHotpatchRollbackTaskResult;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * CreateHotpatchRollbackTaskResult.
         */
        public Builder createHotpatchRollbackTaskResult(CreateHotpatchRollbackTaskResult createHotpatchRollbackTaskResult) {
            this.createHotpatchRollbackTaskResult = createHotpatchRollbackTaskResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
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

        public CreateMcubeHotpatchRollbackTaskResponseBody build() {
            return new CreateMcubeHotpatchRollbackTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMcubeHotpatchRollbackTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcubeHotpatchRollbackTaskResponseBody</p>
     */
    public static class CreateHotpatchRollbackTaskResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("RollbackTaskId")
        private String rollbackTaskId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private CreateHotpatchRollbackTaskResult(Builder builder) {
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.rollbackTaskId = builder.rollbackTaskId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateHotpatchRollbackTaskResult create() {
            return builder().build();
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
         * @return rollbackTaskId
         */
        public String getRollbackTaskId() {
            return this.rollbackTaskId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String requestId; 
            private String resultMsg; 
            private String rollbackTaskId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(CreateHotpatchRollbackTaskResult model) {
                this.requestId = model.requestId;
                this.resultMsg = model.resultMsg;
                this.rollbackTaskId = model.rollbackTaskId;
                this.success = model.success;
            } 

            /**
             * <p>Id of the request</p>
             * 
             * <strong>example:</strong>
             * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
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
             * RollbackTaskId.
             */
            public Builder rollbackTaskId(String rollbackTaskId) {
                this.rollbackTaskId = rollbackTaskId;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public CreateHotpatchRollbackTaskResult build() {
                return new CreateHotpatchRollbackTaskResult(this);
            } 

        } 

    }
}
