// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsyncTaskResponseBody</p>
 */
public class GetAsyncTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private GetAsyncTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncTaskResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String requestId; 
        private String success; 

        /**
         * Code.
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetAsyncTaskResponseBody build() {
            return new GetAsyncTaskResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AsyncTaskId")
        private String asyncTaskId;

        @NameInMap("ConsumedProcess")
        private String consumedProcess;

        @NameInMap("ErrCode")
        private Long errCode;

        @NameInMap("Message")
        private String message;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalProcess")
        private Long totalProcess;

        @NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.asyncTaskId = builder.asyncTaskId;
            this.consumedProcess = builder.consumedProcess;
            this.errCode = builder.errCode;
            this.message = builder.message;
            this.status = builder.status;
            this.totalProcess = builder.totalProcess;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return asyncTaskId
         */
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        /**
         * @return consumedProcess
         */
        public String getConsumedProcess() {
            return this.consumedProcess;
        }

        /**
         * @return errCode
         */
        public Long getErrCode() {
            return this.errCode;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalProcess
         */
        public Long getTotalProcess() {
            return this.totalProcess;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String asyncTaskId; 
            private String consumedProcess; 
            private Long errCode; 
            private String message; 
            private String status; 
            private Long totalProcess; 
            private String url; 

            /**
             * AsyncTaskId.
             */
            public Builder asyncTaskId(String asyncTaskId) {
                this.asyncTaskId = asyncTaskId;
                return this;
            }

            /**
             * ConsumedProcess.
             */
            public Builder consumedProcess(String consumedProcess) {
                this.consumedProcess = consumedProcess;
                return this;
            }

            /**
             * ErrCode.
             */
            public Builder errCode(Long errCode) {
                this.errCode = errCode;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalProcess.
             */
            public Builder totalProcess(Long totalProcess) {
                this.totalProcess = totalProcess;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
