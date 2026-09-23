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
 * {@link ListOperationRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationRecordResponseBody</p>
 */
public class ListOperationRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OperationLogListResponse")
    private OperationLogListResponse operationLogListResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListOperationRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.operationLogListResponse = builder.operationLogListResponse;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationRecordResponseBody create() {
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
     * @return operationLogListResponse
     */
    public OperationLogListResponse getOperationLogListResponse() {
        return this.operationLogListResponse;
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
        private OperationLogListResponse operationLogListResponse; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListOperationRecordResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.operationLogListResponse = model.operationLogListResponse;
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
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The backend exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The operation log list response.</p>
         */
        public Builder operationLogListResponse(OperationLogListResponse operationLogListResponse) {
            this.operationLogListResponse = operationLogListResponse;
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
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListOperationRecordResponseBody build() {
            return new ListOperationRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationRecordResponseBody</p>
     */
    public static class ResultData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("CodeType")
        private Integer codeType;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("OperationId")
        private Long operationId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RelationTables")
        private java.util.List<String> relationTables;

        @com.aliyun.core.annotation.NameInMap("Runner")
        private String runner;

        @com.aliyun.core.annotation.NameInMap("RunnerName")
        private String runnerName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        private ResultData(Builder builder) {
            this.beginTime = builder.beginTime;
            this.codeType = builder.codeType;
            this.duration = builder.duration;
            this.id = builder.id;
            this.name = builder.name;
            this.objectType = builder.objectType;
            this.operationId = builder.operationId;
            this.projectId = builder.projectId;
            this.relationTables = builder.relationTables;
            this.runner = builder.runner;
            this.runnerName = builder.runnerName;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultData create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return codeType
         */
        public Integer getCodeType() {
            return this.codeType;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return operationId
         */
        public Long getOperationId() {
            return this.operationId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return relationTables
         */
        public java.util.List<String> getRelationTables() {
            return this.relationTables;
        }

        /**
         * @return runner
         */
        public String getRunner() {
            return this.runner;
        }

        /**
         * @return runnerName
         */
        public String getRunnerName() {
            return this.runnerName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String beginTime; 
            private Integer codeType; 
            private Long duration; 
            private Long id; 
            private String name; 
            private String objectType; 
            private Long operationId; 
            private Long projectId; 
            private java.util.List<String> relationTables; 
            private String runner; 
            private String runnerName; 
            private Integer status; 
            private Long tenantId; 

            private Builder() {
            } 

            private Builder(ResultData model) {
                this.beginTime = model.beginTime;
                this.codeType = model.codeType;
                this.duration = model.duration;
                this.id = model.id;
                this.name = model.name;
                this.objectType = model.objectType;
                this.operationId = model.operationId;
                this.projectId = model.projectId;
                this.relationTables = model.relationTables;
                this.runner = model.runner;
                this.runnerName = model.runnerName;
                this.status = model.status;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-15 10:30:00</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The code type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder codeType(Integer codeType) {
                this.codeType = codeType;
                return this;
            }

            /**
             * <p>The execution duration, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试任务</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The object type.</p>
             * 
             * <strong>example:</strong>
             * <p>onedata-ide</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The operation record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>987654321</p>
             */
            public Builder operationId(Long operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>131211211</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The list of related tables.</p>
             */
            public Builder relationTables(java.util.List<String> relationTables) {
                this.relationTables = relationTables;
                return this;
            }

            /**
             * <p>The ID of the executor.</p>
             * 
             * <strong>example:</strong>
             * <p>30231123</p>
             */
            public Builder runner(String runner) {
                this.runner = runner;
                return this;
            }

            /**
             * <p>The name of the executor.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder runnerName(String runnerName) {
                this.runnerName = runnerName;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOperationRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationRecordResponseBody</p>
     */
    public static class OperationLogListResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("ResultData")
        private java.util.List<ResultData> resultData;

        private OperationLogListResponse(Builder builder) {
            this.count = builder.count;
            this.resultData = builder.resultData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLogListResponse create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return resultData
         */
        public java.util.List<ResultData> getResultData() {
            return this.resultData;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List<ResultData> resultData; 

            private Builder() {
            } 

            private Builder(OperationLogListResponse model) {
                this.count = model.count;
                this.resultData = model.resultData;
            } 

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The list of operation logs.</p>
             */
            public Builder resultData(java.util.List<ResultData> resultData) {
                this.resultData = resultData;
                return this;
            }

            public OperationLogListResponse build() {
                return new OperationLogListResponse(this);
            } 

        } 

    }
}
