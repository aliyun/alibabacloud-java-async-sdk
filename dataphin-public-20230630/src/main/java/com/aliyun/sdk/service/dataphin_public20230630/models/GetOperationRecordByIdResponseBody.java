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
 * {@link GetOperationRecordByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetOperationRecordByIdResponseBody</p>
 */
public class GetOperationRecordByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OperationLogDTO")
    private OperationLogDTO operationLogDTO;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetOperationRecordByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.operationLogDTO = builder.operationLogDTO;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperationRecordByIdResponseBody create() {
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
     * @return operationLogDTO
     */
    public OperationLogDTO getOperationLogDTO() {
        return this.operationLogDTO;
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
        private OperationLogDTO operationLogDTO; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetOperationRecordByIdResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.operationLogDTO = model.operationLogDTO;
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
         * OperationLogDTO.
         */
        public Builder operationLogDTO(OperationLogDTO operationLogDTO) {
            this.operationLogDTO = operationLogDTO;
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

        public GetOperationRecordByIdResponseBody build() {
            return new GetOperationRecordByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOperationRecordByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetOperationRecordByIdResponseBody</p>
     */
    public static class OperationLogDTO extends TeaModel {
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

        private OperationLogDTO(Builder builder) {
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

        public static OperationLogDTO create() {
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

            private Builder(OperationLogDTO model) {
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
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * CodeType.
             */
            public Builder codeType(Integer codeType) {
                this.codeType = codeType;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * OperationId.
             */
            public Builder operationId(Long operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * RelationTables.
             */
            public Builder relationTables(java.util.List<String> relationTables) {
                this.relationTables = relationTables;
                return this;
            }

            /**
             * Runner.
             */
            public Builder runner(String runner) {
                this.runner = runner;
                return this;
            }

            /**
             * RunnerName.
             */
            public Builder runnerName(String runnerName) {
                this.runnerName = runnerName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public OperationLogDTO build() {
                return new OperationLogDTO(this);
            } 

        } 

    }
}
