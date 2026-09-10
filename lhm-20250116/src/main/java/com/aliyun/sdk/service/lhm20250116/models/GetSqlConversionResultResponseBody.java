// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetSqlConversionResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetSqlConversionResultResponseBody</p>
 */
public class GetSqlConversionResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private GetSqlConversionResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlConversionResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetSqlConversionResultResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The data list returned by the operation. For the structure of each element, see the child parameters.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The page size, which is the number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check errCode and errMessage for troubleshooting.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that meet the query conditions. This value is used for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetSqlConversionResultResponseBody build() {
            return new GetSqlConversionResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSqlConversionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSqlConversionResultResponseBody</p>
     */
    public static class TableMappingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("sourceSchema")
        private String sourceSchema;

        @com.aliyun.core.annotation.NameInMap("sourceTableName")
        private String sourceTableName;

        @com.aliyun.core.annotation.NameInMap("targetTableName")
        private String targetTableName;

        @com.aliyun.core.annotation.NameInMap("targetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        private TableMappingList(Builder builder) {
            this.id = builder.id;
            this.sourceSchema = builder.sourceSchema;
            this.sourceTableName = builder.sourceTableName;
            this.targetTableName = builder.targetTableName;
            this.targetType = builder.targetType;
            this.taskId = builder.taskId;
            this.tenantId = builder.tenantId;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableMappingList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sourceSchema
         */
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        /**
         * @return sourceTableName
         */
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        /**
         * @return targetTableName
         */
        public String getTargetTableName() {
            return this.targetTableName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private Long id; 
            private String sourceSchema; 
            private String sourceTableName; 
            private String targetTableName; 
            private String targetType; 
            private Long taskId; 
            private String tenantId; 
            private String uid; 

            private Builder() {
            } 

            private Builder(TableMappingList model) {
                this.id = model.id;
                this.sourceSchema = model.sourceSchema;
                this.sourceTableName = model.sourceTableName;
                this.targetTableName = model.targetTableName;
                this.targetType = model.targetType;
                this.taskId = model.taskId;
                this.tenantId = model.tenantId;
                this.uid = model.uid;
            } 

            /**
             * <p>The primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The source type. Valid values: DB and Schema.</p>
             * 
             * <strong>example:</strong>
             * <p>db_demo</p>
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            /**
             * <p>The source table name.</p>
             * 
             * <strong>example:</strong>
             * <p>table_demo</p>
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * <p>The target table name.</p>
             * 
             * <strong>example:</strong>
             * <p>table_demo</p>
             */
            public Builder targetTableName(String targetTableName) {
                this.targetTableName = targetTableName;
                return this;
            }

            /**
             * <p>The target type. Valid values: DB and Schema.</p>
             * 
             * <strong>example:</strong>
             * <p>hive</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The SQL conversion task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public TableMappingList build() {
                return new TableMappingList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSqlConversionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSqlConversionResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("finishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("scriptId")
        private Long scriptId;

        @com.aliyun.core.annotation.NameInMap("scriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("scriptTransformStatus")
        private String scriptTransformStatus;

        @com.aliyun.core.annotation.NameInMap("sqlResultContent")
        private String sqlResultContent;

        @com.aliyun.core.annotation.NameInMap("sqlSourceContent")
        private String sqlSourceContent;

        @com.aliyun.core.annotation.NameInMap("tableMappingList")
        private java.util.List<TableMappingList> tableMappingList;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.finishTime = builder.finishTime;
            this.scriptId = builder.scriptId;
            this.scriptName = builder.scriptName;
            this.scriptTransformStatus = builder.scriptTransformStatus;
            this.sqlResultContent = builder.sqlResultContent;
            this.sqlSourceContent = builder.sqlSourceContent;
            this.tableMappingList = builder.tableMappingList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return scriptId
         */
        public Long getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return scriptTransformStatus
         */
        public String getScriptTransformStatus() {
            return this.scriptTransformStatus;
        }

        /**
         * @return sqlResultContent
         */
        public String getSqlResultContent() {
            return this.sqlResultContent;
        }

        /**
         * @return sqlSourceContent
         */
        public String getSqlSourceContent() {
            return this.sqlSourceContent;
        }

        /**
         * @return tableMappingList
         */
        public java.util.List<TableMappingList> getTableMappingList() {
            return this.tableMappingList;
        }

        public static final class Builder {
            private String errorMessage; 
            private String finishTime; 
            private Long scriptId; 
            private String scriptName; 
            private String scriptTransformStatus; 
            private String sqlResultContent; 
            private String sqlSourceContent; 
            private java.util.List<TableMappingList> tableMappingList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorMessage = model.errorMessage;
                this.finishTime = model.finishTime;
                this.scriptId = model.scriptId;
                this.scriptName = model.scriptName;
                this.scriptTransformStatus = model.scriptTransformStatus;
                this.sqlResultContent = model.sqlResultContent;
                this.sqlSourceContent = model.sqlSourceContent;
                this.tableMappingList = model.tableMappingList;
            } 

            /**
             * <p>The error reason.</p>
             * 
             * <strong>example:</strong>
             * <p>connection timeout</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16T10:00:00Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The script ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder scriptId(Long scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>The script name.</p>
             * 
             * <strong>example:</strong>
             * <p>node_script_demo</p>
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * <p>The script conversion status. In conversion job scenarios: pass for conversion succeeded, turning for converting, and fail for conversion failed. In some scenarios: success for succeeded, failed for failed, and skipped for skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder scriptTransformStatus(String scriptTransformStatus) {
                this.scriptTransformStatus = scriptTransformStatus;
                return this;
            }

            /**
             * <p>The converted script content.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM t;</p>
             */
            public Builder sqlResultContent(String sqlResultContent) {
                this.sqlResultContent = sqlResultContent;
                return this;
            }

            /**
             * <p>The original script content.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM t;</p>
             */
            public Builder sqlSourceContent(String sqlSourceContent) {
                this.sqlSourceContent = sqlSourceContent;
                return this;
            }

            /**
             * <p>The table name mapping.</p>
             */
            public Builder tableMappingList(java.util.List<TableMappingList> tableMappingList) {
                this.tableMappingList = tableMappingList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
