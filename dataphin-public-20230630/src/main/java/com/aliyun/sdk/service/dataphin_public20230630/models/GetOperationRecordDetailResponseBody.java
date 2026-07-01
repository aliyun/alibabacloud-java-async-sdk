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
 * {@link GetOperationRecordDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetOperationRecordDetailResponseBody</p>
 */
public class GetOperationRecordDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OperationRecordDetailResponse")
    private OperationRecordDetailResponse operationRecordDetailResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetOperationRecordDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.operationRecordDetailResponse = builder.operationRecordDetailResponse;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperationRecordDetailResponseBody create() {
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
     * @return operationRecordDetailResponse
     */
    public OperationRecordDetailResponse getOperationRecordDetailResponse() {
        return this.operationRecordDetailResponse;
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
        private Integer httpStatusCode; 
        private String message; 
        private OperationRecordDetailResponse operationRecordDetailResponse; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetOperationRecordDetailResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.operationRecordDetailResponse = model.operationRecordDetailResponse;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * OperationRecordDetailResponse.
         */
        public Builder operationRecordDetailResponse(OperationRecordDetailResponse operationRecordDetailResponse) {
            this.operationRecordDetailResponse = operationRecordDetailResponse;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOperationRecordDetailResponseBody build() {
            return new GetOperationRecordDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOperationRecordDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOperationRecordDetailResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Results(Builder builder) {
            this.index = builder.index;
            this.result = builder.result;
            this.sql = builder.sql;
            this.taskId = builder.taskId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Integer index; 
            private String result; 
            private String sql; 
            private String taskId; 
            private String title; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.index = model.index;
                this.result = model.result;
                this.sql = model.sql;
                this.taskId = model.taskId;
                this.title = model.title;
            } 

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * Sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOperationRecordDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOperationRecordDetailResponseBody</p>
     */
    public static class OperationRecordDetailResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("LogContent")
        private String logContent;

        @com.aliyun.core.annotation.NameInMap("OperationId")
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        private OperationRecordDetailResponse(Builder builder) {
            this.fileId = builder.fileId;
            this.logContent = builder.logContent;
            this.operationId = builder.operationId;
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationRecordDetailResponse create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return logContent
         */
        public String getLogContent() {
            return this.logContent;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        public static final class Builder {
            private Long fileId; 
            private String logContent; 
            private String operationId; 
            private java.util.List<Results> results; 

            private Builder() {
            } 

            private Builder(OperationRecordDetailResponse model) {
                this.fileId = model.fileId;
                this.logContent = model.logContent;
                this.operationId = model.operationId;
                this.results = model.results;
            } 

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * LogContent.
             */
            public Builder logContent(String logContent) {
                this.logContent = logContent;
                return this;
            }

            /**
             * OperationId.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            public OperationRecordDetailResponse build() {
                return new OperationRecordDetailResponse(this);
            } 

        } 

    }
}
