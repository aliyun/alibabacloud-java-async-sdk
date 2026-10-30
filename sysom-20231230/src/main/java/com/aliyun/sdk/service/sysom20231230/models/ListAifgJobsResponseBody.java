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
 * {@link ListAifgJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAifgJobsResponseBody</p>
 */
public class ListAifgJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListAifgJobsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAifgJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListAifgJobsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data under the root node.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of records to retrieve at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Indicates the read position returned by the current call. An empty value indicates that all data has been read.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, world!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination cursor. A non-empty value indicates that more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>U+w1wv2R4ZWR5oZLXD0+Dp4dD+2BRJj42DLT6GrZysw=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAifgJobsResponseBody build() {
            return new ListAifgJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAifgJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAifgJobsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("command")
        private Object command;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("params")
        private Object params;

        @com.aliyun.core.annotation.NameInMap("result")
        private Object result;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subStatus")
        private String subStatus;

        @com.aliyun.core.annotation.NameInMap("submitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("traceTaskId")
        private String traceTaskId;

        private Data(Builder builder) {
            this.command = builder.command;
            this.id = builder.id;
            this.params = builder.params;
            this.result = builder.result;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.subStatus = builder.subStatus;
            this.submitTime = builder.submitTime;
            this.taskId = builder.taskId;
            this.traceTaskId = builder.traceTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public Object getCommand() {
            return this.command;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return subStatus
         */
        public String getSubStatus() {
            return this.subStatus;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return traceTaskId
         */
        public String getTraceTaskId() {
            return this.traceTaskId;
        }

        public static final class Builder {
            private Object command; 
            private Long id; 
            private Object params; 
            private Object result; 
            private String serviceName; 
            private String status; 
            private String subStatus; 
            private String submitTime; 
            private String taskId; 
            private String traceTaskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.command = model.command;
                this.id = model.id;
                this.params = model.params;
                this.result = model.result;
                this.serviceName = model.serviceName;
                this.status = model.status;
                this.subStatus = model.subStatus;
                this.submitTime = model.submitTime;
                this.taskId = model.taskId;
                this.traceTaskId = model.traceTaskId;
            } 

            /**
             * <p>The first command in the data list.</p>
             * 
             * <strong>example:</strong>
             * <p>start</p>
             */
            public Builder command(Object command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The ID of the first element in the data list.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The first parameter in the root data.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;key1\&quot;: \&quot;value1\&quot;}</p>
             */
            public Builder params(Object params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The first result in the root data.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder result(Object result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>user-service</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The status of the data item.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sub-status of data item 0.</p>
             * 
             * <strong>example:</strong>
             * <p>processing</p>
             */
            public Builder subStatus(String subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * <p>The time when the data was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-01 12:00:00</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The unique identifier of the trace task.</p>
             * 
             * <strong>example:</strong>
             * <p>T123456789</p>
             */
            public Builder traceTaskId(String traceTaskId) {
                this.traceTaskId = traceTaskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
