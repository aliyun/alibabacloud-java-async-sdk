// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link QueryPipelineSubmitResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPipelineSubmitResultResponseBody</p>
 */
public class QueryPipelineSubmitResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryPipelineSubmitResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPipelineSubmitResultResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryPipelineSubmitResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The asynchronous execution result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend response exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryPipelineSubmitResultResponseBody build() {
            return new QueryPipelineSubmitResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPipelineSubmitResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPipelineSubmitResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsyncId")
        private Long asyncId;

        @com.aliyun.core.annotation.NameInMap("CheckDetail")
        private String checkDetail;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("HostMachine")
        private String hostMachine;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private Long pipelineId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitId")
        private Long submitId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.asyncId = builder.asyncId;
            this.checkDetail = builder.checkDetail;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.hostMachine = builder.hostMachine;
            this.nodeId = builder.nodeId;
            this.pipelineId = builder.pipelineId;
            this.status = builder.status;
            this.submitId = builder.submitId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return asyncId
         */
        public Long getAsyncId() {
            return this.asyncId;
        }

        /**
         * @return checkDetail
         */
        public String getCheckDetail() {
            return this.checkDetail;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return hostMachine
         */
        public String getHostMachine() {
            return this.hostMachine;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return pipelineId
         */
        public Long getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitId
         */
        public Long getSubmitId() {
            return this.submitId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long asyncId; 
            private String checkDetail; 
            private String errorCode; 
            private String errorMessage; 
            private String hostMachine; 
            private String nodeId; 
            private Long pipelineId; 
            private String status; 
            private Long submitId; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.asyncId = model.asyncId;
                this.checkDetail = model.checkDetail;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.hostMachine = model.hostMachine;
                this.nodeId = model.nodeId;
                this.pipelineId = model.pipelineId;
                this.status = model.status;
                this.submitId = model.submitId;
                this.version = model.version;
            } 

            /**
             * <p>The query ID for asynchronous execution.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder asyncId(Long asyncId) {
                this.asyncId = asyncId;
                return this;
            }

            /**
             * <p>The check result of the commit details. The value is a JSON character string and is returned only for the asynchronous commit process. The structure is consistent with the commit details on the product page.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test01&quot;:&quot;success&quot;}</p>
             */
            public Builder checkDetail(String checkDetail) {
                this.checkDetail = checkDetail;
                return this;
            }

            /**
             * <p>The error code returned when an execution exception occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>DPN.Pipeline.InnerError</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when an execution exception occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>NullPointException</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The server host information for request execution.</p>
             * 
             * <strong>example:</strong>
             * <p>hostName:hostIp</p>
             */
            public Builder hostMachine(String hostMachine) {
                this.hostMachine = hostMachine;
                return this;
            }

            /**
             * <p>The ID of the schedule node for the pipeline task.</p>
             * 
             * <strong>example:</strong>
             * <p>n_123</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The primary key ID of the pipeline.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder pipelineId(Long pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The current execution status. Valid values: SUCCESS: execution succeeded. FAILED: execution failed. RUNNING: execution in progress.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The publish ID generated after the pipeline task is submitted, which is used to publish the task through the publish domain.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder submitId(Long submitId) {
                this.submitId = submitId;
                return this;
            }

            /**
             * <p>The version number generated when the pipeline task is submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
