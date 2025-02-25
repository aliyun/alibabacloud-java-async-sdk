// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>ListDiagnosisResponseBody</p>
 */
public class ListDiagnosisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListDiagnosisResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnosisResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private Long total; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListDiagnosisResponseBody build() {
            return new ListDiagnosisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDiagnosisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDiagnosisResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("command")
        private Object command;

        @com.aliyun.core.annotation.NameInMap("created_at")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("err_msg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("params")
        private Object params;

        @com.aliyun.core.annotation.NameInMap("result")
        private Object result;

        @com.aliyun.core.annotation.NameInMap("service_name")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("task_id")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("updated_at")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Data(Builder builder) {
            this.code = builder.code;
            this.command = builder.command;
            this.createdAt = builder.createdAt;
            this.errMsg = builder.errMsg;
            this.params = builder.params;
            this.result = builder.result;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.updatedAt = builder.updatedAt;
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
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
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
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
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
            private String createdAt; 
            private String errMsg; 
            private Object params; 
            private Object result; 
            private String serviceName; 
            private String status; 
            private String taskId; 
            private String updatedAt; 
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
             * created_at.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
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
             * updated_at.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
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
