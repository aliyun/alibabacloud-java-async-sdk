// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelVideoTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CancelVideoTaskResponseBody</p>
 */
public class CancelVideoTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CancelVideoTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelVideoTaskResponseBody create() {
        return builder().build();
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

        /**
         * Id of the request
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public CancelVideoTaskResponseBody build() {
            return new CancelVideoTaskResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("FailReason")
        private String failReason;

        @NameInMap("IsCancel")
        private Boolean isCancel;

        @NameInMap("TaskUuid")
        private String taskUuid;

        private Data(Builder builder) {
            this.failReason = builder.failReason;
            this.isCancel = builder.isCancel;
            this.taskUuid = builder.taskUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return isCancel
         */
        public Boolean getIsCancel() {
            return this.isCancel;
        }

        /**
         * @return taskUuid
         */
        public String getTaskUuid() {
            return this.taskUuid;
        }

        public static final class Builder {
            private String failReason; 
            private Boolean isCancel; 
            private String taskUuid; 

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * IsCancel.
             */
            public Builder isCancel(Boolean isCancel) {
                this.isCancel = isCancel;
                return this;
            }

            /**
             * TaskUuid.
             */
            public Builder taskUuid(String taskUuid) {
                this.taskUuid = taskUuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
