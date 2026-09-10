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
 * {@link CreateExecuteSqlConversionRequest} extends {@link RequestModel}
 *
 * <p>CreateExecuteSqlConversionRequest</p>
 */
public class CreateExecuteSqlConversionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceDialect")
    private String sourceDialect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceSqlScript")
    private java.util.List<SourceSqlScript> sourceSqlScript;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetDialect")
    private String targetDialect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskDescription")
    private String taskDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    private CreateExecuteSqlConversionRequest(Builder builder) {
        super(builder);
        this.sourceDialect = builder.sourceDialect;
        this.sourceSqlScript = builder.sourceSqlScript;
        this.targetDialect = builder.targetDialect;
        this.taskDescription = builder.taskDescription;
        this.taskName = builder.taskName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExecuteSqlConversionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceDialect
     */
    public String getSourceDialect() {
        return this.sourceDialect;
    }

    /**
     * @return sourceSqlScript
     */
    public java.util.List<SourceSqlScript> getSourceSqlScript() {
        return this.sourceSqlScript;
    }

    /**
     * @return targetDialect
     */
    public String getTargetDialect() {
        return this.targetDialect;
    }

    /**
     * @return taskDescription
     */
    public String getTaskDescription() {
        return this.taskDescription;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateExecuteSqlConversionRequest, Builder> {
        private String sourceDialect; 
        private java.util.List<SourceSqlScript> sourceSqlScript; 
        private String targetDialect; 
        private String taskDescription; 
        private String taskName; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateExecuteSqlConversionRequest request) {
            super(request);
            this.sourceDialect = request.sourceDialect;
            this.sourceSqlScript = request.sourceSqlScript;
            this.targetDialect = request.targetDialect;
            this.taskDescription = request.taskDescription;
            this.taskName = request.taskName;
            this.type = request.type;
        } 

        /**
         * <p>The source dialect.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder sourceDialect(String sourceDialect) {
            this.putBodyParameter("sourceDialect", sourceDialect);
            this.sourceDialect = sourceDialect;
            return this;
        }

        /**
         * <p>The list of source SQL scripts.</p>
         */
        public Builder sourceSqlScript(java.util.List<SourceSqlScript> sourceSqlScript) {
            this.putBodyParameter("sourceSqlScript", sourceSqlScript);
            this.sourceSqlScript = sourceSqlScript;
            return this;
        }

        /**
         * <p>The target dialect.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder targetDialect(String targetDialect) {
            this.putBodyParameter("targetDialect", targetDialect);
            this.targetDialect = targetDialect;
            return this;
        }

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>Data validation task description</p>
         */
        public Builder taskDescription(String taskDescription) {
            this.putBodyParameter("taskDescription", taskDescription);
            this.taskDescription = taskDescription;
            return this;
        }

        /**
         * <p>The task name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>data_check_task_demo</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The script type. Valid values: 0 (DDL) and 1 (DQL).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder type(Integer type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateExecuteSqlConversionRequest build() {
            return new CreateExecuteSqlConversionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateExecuteSqlConversionRequest} extends {@link TeaModel}
     *
     * <p>CreateExecuteSqlConversionRequest</p>
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
     * {@link CreateExecuteSqlConversionRequest} extends {@link TeaModel}
     *
     * <p>CreateExecuteSqlConversionRequest</p>
     */
    public static class SourceSqlScript extends TeaModel {
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

        private SourceSqlScript(Builder builder) {
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

        public static SourceSqlScript create() {
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

            private Builder(SourceSqlScript model) {
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
             * <p>The time when the conversion is completed.</p>
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
             * <p>The script conversion status. In conversion job scenarios, valid values: pass (conversion succeeded), turning (conversion in progress), fail (conversion failed). In some scenarios, the following values are used: success (succeeded), failed (failed), skipped (skipped).</p>
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
             * <p>The table name mappings for conversion.</p>
             */
            public Builder tableMappingList(java.util.List<TableMappingList> tableMappingList) {
                this.tableMappingList = tableMappingList;
                return this;
            }

            public SourceSqlScript build() {
                return new SourceSqlScript(this);
            } 

        } 

    }
}
