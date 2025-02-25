// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link GetAsyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsyncTaskResponseBody</p>
 */
public class GetAsyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The operation result. If the request was successful, a success message is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetAsyncTaskResponseBody build() {
            return new GetAsyncTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAsyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetAsyncTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsyncTaskId")
        private String asyncTaskId;

        @com.aliyun.core.annotation.NameInMap("ConsumedProcess")
        private String consumedProcess;

        @com.aliyun.core.annotation.NameInMap("ErrCode")
        private Long errCode;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalProcess")
        private Long totalProcess;

        @com.aliyun.core.annotation.NameInMap("Url")
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
             * <p>The asynchronous task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>000e89fb-cf8f-11e9-8ab4-b6e98080****</p>
             */
            public Builder asyncTaskId(String asyncTaskId) {
                this.asyncTaskId = asyncTaskId;
                return this;
            }

            /**
             * <p>The total number of asynchronous tasks that are processed. Example: the number of files that are packaged and downloaded on the server.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder consumedProcess(String consumedProcess) {
                this.consumedProcess = consumedProcess;
                return this;
            }

            /**
             * <p>The error code of the asynchronous task.</p>
             * 
             * <strong>example:</strong>
             * <p>InternalError</p>
             */
            public Builder errCode(Long errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * <p>The error message of the asynchronous task.</p>
             * 
             * <strong>example:</strong>
             * <p>The request has been failed due to some unknown error. Please try again later.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The task status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Failed: The task failed.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Running: The task was running.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>PartialSucceed: The task did not completely succeed.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Succeed: The task succeeded.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Failed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total number of asynchronous tasks to be processed, such as the amount of files to be downloaded and packaged on the server.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder totalProcess(Long totalProcess) {
                this.totalProcess = totalProcess;
                return this;
            }

            /**
             * <p>The URL to download data generated by the asynchronous task. Example: the URL to package and download tasks on the server.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
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
