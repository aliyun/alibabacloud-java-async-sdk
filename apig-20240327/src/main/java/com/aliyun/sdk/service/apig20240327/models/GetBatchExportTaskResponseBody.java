// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetBatchExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetBatchExportTaskResponseBody</p>
 */
public class GetBatchExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetBatchExportTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchExportTaskResponseBody create() {
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

        private Builder() {
        } 

        private Builder(GetBatchExportTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CE534E1D-FCE4-5930-B784-E055EC1AEE6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBatchExportTaskResponseBody build() {
            return new GetBatchExportTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBatchExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchExportTaskResponseBody</p>
     */
    public static class FailureItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        private FailureItems(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailureItems create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String errorMessage; 

            private Builder() {
            } 

            private Builder(FailureItems model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.errorMessage = model.errorMessage;
            } 

            /**
             * <p>API ID。</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxx</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>petstore</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>api definition is invalid</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public FailureItems build() {
                return new FailureItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchExportTaskResponseBody</p>
     */
    public static class SuccessItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        private SuccessItems(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessItems create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String errorMessage; 

            private Builder() {
            } 

            private Builder(SuccessItems model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.errorMessage = model.errorMessage;
            } 

            /**
             * <p>API ID。</p>
             * 
             * <strong>example:</strong>
             * <p>api-xxx</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>petstore</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>api definition is invalid</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public SuccessItems build() {
                return new SuccessItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchExportTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiType")
        private String apiType;

        @com.aliyun.core.annotation.NameInMap("failureItems")
        private java.util.List<FailureItems> failureItems;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("specContentBase64")
        private String specContentBase64;

        @com.aliyun.core.annotation.NameInMap("successItems")
        private java.util.List<SuccessItems> successItems;

        private Result(Builder builder) {
            this.apiType = builder.apiType;
            this.failureItems = builder.failureItems;
            this.gatewayId = builder.gatewayId;
            this.specContentBase64 = builder.specContentBase64;
            this.successItems = builder.successItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return apiType
         */
        public String getApiType() {
            return this.apiType;
        }

        /**
         * @return failureItems
         */
        public java.util.List<FailureItems> getFailureItems() {
            return this.failureItems;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return specContentBase64
         */
        public String getSpecContentBase64() {
            return this.specContentBase64;
        }

        /**
         * @return successItems
         */
        public java.util.List<SuccessItems> getSuccessItems() {
            return this.successItems;
        }

        public static final class Builder {
            private String apiType; 
            private java.util.List<FailureItems> failureItems; 
            private String gatewayId; 
            private String specContentBase64; 
            private java.util.List<SuccessItems> successItems; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.apiType = model.apiType;
                this.failureItems = model.failureItems;
                this.gatewayId = model.gatewayId;
                this.specContentBase64 = model.specContentBase64;
                this.successItems = model.successItems;
            } 

            /**
             * <p>The API type.</p>
             * 
             * <strong>example:</strong>
             * <p>Http</p>
             */
            public Builder apiType(String apiType) {
                this.apiType = apiType;
                return this;
            }

            /**
             * <p>The list of APIs that failed to be processed.</p>
             */
            public Builder failureItems(java.util.List<FailureItems> failureItems) {
                this.failureItems = failureItems;
                return this;
            }

            /**
             * <p>The gateway instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-xxx</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The Base64-encoded ZIP file content. After the frontend decodes the content, it can directly trigger a browser download.</p>
             * 
             * <strong>example:</strong>
             * <p>UEsDBBQAAAA...</p>
             */
            public Builder specContentBase64(String specContentBase64) {
                this.specContentBase64 = specContentBase64;
                return this;
            }

            /**
             * <p>The list of APIs that were processed successfully.</p>
             */
            public Builder successItems(java.util.List<SuccessItems> successItems) {
                this.successItems = successItems;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchExportTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("processedCount")
        private Integer processedCount;

        @com.aliyun.core.annotation.NameInMap("result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.errorMessage = builder.errorMessage;
            this.processedCount = builder.processedCount;
            this.result = builder.result;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return processedCount
         */
        public Integer getProcessedCount() {
            return this.processedCount;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
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
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String createTime; 
            private String errorMessage; 
            private Integer processedCount; 
            private Result result; 
            private String status; 
            private String taskId; 
            private String taskType; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.errorMessage = model.errorMessage;
                this.processedCount = model.processedCount;
                this.result = model.result;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The time when the task was created. Format: yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-15T10:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>some apis export failed</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The number of processed items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder processedCount(Integer processedCount) {
                this.processedCount = processedCount;
                return this;
            }

            /**
             * <p>The task result details.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The task status. Valid values: Pending, Running, Success, PartialSuccess, and Failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>async-task-xxx</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>BatchExport</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
