// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetEntityStoreDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetEntityStoreDataResponseBody</p>
 */
public class GetEntityStoreDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<java.util.List<String>> data;

    @com.aliyun.core.annotation.NameInMap("header")
    private java.util.List<String> header;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("responseStatus")
    private ResponseStatus responseStatus;

    private GetEntityStoreDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.header = builder.header;
        this.requestId = builder.requestId;
        this.responseStatus = builder.responseStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEntityStoreDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<java.util.List<String>> getData() {
        return this.data;
    }

    /**
     * @return header
     */
    public java.util.List<String> getHeader() {
        return this.header;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responseStatus
     */
    public ResponseStatus getResponseStatus() {
        return this.responseStatus;
    }

    public static final class Builder {
        private java.util.List<java.util.List<String>> data; 
        private java.util.List<String> header; 
        private String requestId; 
        private ResponseStatus responseStatus; 

        private Builder() {
        } 

        private Builder(GetEntityStoreDataResponseBody model) {
            this.data = model.data;
            this.header = model.header;
            this.requestId = model.requestId;
            this.responseStatus = model.responseStatus;
        } 

        /**
         * <p>Total list of returned data</p>
         */
        public Builder data(java.util.List<java.util.List<String>> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>List of request headers</p>
         */
        public Builder header(java.util.List<String> header) {
            this.header = header;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result status</p>
         */
        public Builder responseStatus(ResponseStatus responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }

        public GetEntityStoreDataResponseBody build() {
            return new GetEntityStoreDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEntityStoreDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetEntityStoreDataResponseBody</p>
     */
    public static class StatusItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("suggestion")
        private String suggestion;

        private StatusItem(Builder builder) {
            this.code = builder.code;
            this.level = builder.level;
            this.message = builder.message;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusItem create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String code; 
            private String level; 
            private String message; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(StatusItem model) {
                this.code = model.code;
                this.level = model.level;
                this.message = model.message;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>Status code</p>
             * 
             * <strong>example:</strong>
             * <p>Success,ExecuteTimeout,UModelNotExist</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Status level</p>
             * 
             * <strong>example:</strong>
             * <p>Info,Warn,Error</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>Calculation execution information</p>
             * 
             * <strong>example:</strong>
             * <p>Query execution timeout after 30 seconds</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Suggestions when an error occurs during execution</p>
             * 
             * <strong>example:</strong>
             * <p>Try to reduce the query scope or increase timeout limit, then retry</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public StatusItem build() {
                return new StatusItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEntityStoreDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetEntityStoreDataResponseBody</p>
     */
    public static class ResponseStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("executionStates")
        private String executionStates;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("retryPolicy")
        private String retryPolicy;

        @com.aliyun.core.annotation.NameInMap("statusItem")
        private java.util.List<StatusItem> statusItem;

        private ResponseStatus(Builder builder) {
            this.executionStates = builder.executionStates;
            this.level = builder.level;
            this.result = builder.result;
            this.retryPolicy = builder.retryPolicy;
            this.statusItem = builder.statusItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseStatus create() {
            return builder().build();
        }

        /**
         * @return executionStates
         */
        public String getExecutionStates() {
            return this.executionStates;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return retryPolicy
         */
        public String getRetryPolicy() {
            return this.retryPolicy;
        }

        /**
         * @return statusItem
         */
        public java.util.List<StatusItem> getStatusItem() {
            return this.statusItem;
        }

        public static final class Builder {
            private String executionStates; 
            private String level; 
            private String result; 
            private String retryPolicy; 
            private java.util.List<StatusItem> statusItem; 

            private Builder() {
            } 

            private Builder(ResponseStatus model) {
                this.executionStates = model.executionStates;
                this.level = model.level;
                this.result = model.result;
                this.retryPolicy = model.retryPolicy;
                this.statusItem = model.statusItem;
            } 

            /**
             * <p>Information during the execution process</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder executionStates(String executionStates) {
                this.executionStates = executionStates;
                return this;
            }

            /**
             * <p>Status level</p>
             * 
             * <strong>example:</strong>
             * <p>Info,Warn,Error</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>Execution result</p>
             * 
             * <strong>example:</strong>
             * <p>Success,PartialSuccess,Error</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>Retry policy</p>
             * 
             * <strong>example:</strong>
             * <p>None,Once,Continuous</p>
             */
            public Builder retryPolicy(String retryPolicy) {
                this.retryPolicy = retryPolicy;
                return this;
            }

            /**
             * <p>Detailed status information list</p>
             */
            public Builder statusItem(java.util.List<StatusItem> statusItem) {
                this.statusItem = statusItem;
                return this;
            }

            public ResponseStatus build() {
                return new ResponseStatus(this);
            } 

        } 

    }
}
