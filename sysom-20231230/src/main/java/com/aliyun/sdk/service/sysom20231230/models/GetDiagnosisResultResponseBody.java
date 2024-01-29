// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiagnosisResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetDiagnosisResultResponseBody</p>
 */
public class GetDiagnosisResultResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("message")
    private String message;

    @NameInMap("request_id")
    private String requestId;

    private GetDiagnosisResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiagnosisResultResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDiagnosisResultResponseBody build() {
            return new GetDiagnosisResultResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("code")
        private Integer code;

        @NameInMap("command")
        private Object command;

        @NameInMap("err_msg")
        private String errMsg;

        @NameInMap("params")
        private Object params;

        @NameInMap("result")
        private Object result;

        @NameInMap("service_name")
        private String serviceName;

        @NameInMap("status")
        private String status;

        @NameInMap("task_id")
        private String taskId;

        @NameInMap("url")
        private String url;

        private Data(Builder builder) {
            this.code = builder.code;
            this.command = builder.command;
            this.errMsg = builder.errMsg;
            this.params = builder.params;
            this.result = builder.result;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return command
         */
        public Object getCommand() {
            return this.command;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return params
         */
        public Object getParams() {
            return this.params;
        }

        /**
         * @return result
         */
        public Object getResult() {
            return this.result;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Integer code; 
            private Object command; 
            private String errMsg; 
            private Object params; 
            private Object result; 
            private String serviceName; 
            private String status; 
            private String taskId; 
            private String url; 

            /**
             * code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * command.
             */
            public Builder command(Object command) {
                this.command = command;
                return this;
            }

            /**
             * err_msg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * params.
             */
            public Builder params(Object params) {
                this.params = params;
                return this;
            }

            /**
             * result.
             */
            public Builder result(Object result) {
                this.result = result;
                return this;
            }

            /**
             * service_name.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * task_id.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * url.
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
