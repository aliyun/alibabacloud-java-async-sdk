// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link PopEditTaskRequest} extends {@link RequestModel}
 *
 * <p>PopEditTaskRequest</p>
 */
public class PopEditTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    private Configuration configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataTypeMappingFile")
    private Object dataTypeMappingFile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataTypeOssFileName")
    private String dataTypeOssFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataTypeOssObjectName")
    private String dataTypeOssObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataTypeRealFileName")
    private String dataTypeRealFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dqlAssociationDDLTaskList")
    private String dqlAssociationDDLTaskList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dqlRelateTargetDatasourceId")
    private String dqlRelateTargetDatasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dqlTestDatasourceId")
    private String dqlTestDatasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dqlTestProject")
    private String dqlTestProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("globalParams")
    private String globalParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identifier")
    private String identifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ossObjectName")
    private String ossObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("realFileName")
    private String realFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("relatedDdlContentOssFileName")
    private String relatedDdlContentOssFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("relatedDdlContentOssObjectName")
    private String relatedDdlContentOssObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("relatedDdlContentRealFileName")
    private String relatedDdlContentRealFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceDatasourceId")
    private String sourceDatasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceDialect")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceDialect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceProject")
    private String sourceProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableNameMappingFile")
    private Object tableNameMappingFile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableNameOssFileName")
    private String tableNameOssFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableNameOssObjectName")
    private String tableNameOssObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableNameRealFileName")
    private String tableNameRealFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetDatasourceId")
    private String targetDatasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetDialect")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetDialect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetProject")
    private String targetProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskDescription")
    private String taskDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("transformSchema")
    private String transformSchema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private PopEditTaskRequest(Builder builder) {
        super(builder);
        this.configuration = builder.configuration;
        this.dataTypeMappingFile = builder.dataTypeMappingFile;
        this.dataTypeOssFileName = builder.dataTypeOssFileName;
        this.dataTypeOssObjectName = builder.dataTypeOssObjectName;
        this.dataTypeRealFileName = builder.dataTypeRealFileName;
        this.dqlAssociationDDLTaskList = builder.dqlAssociationDDLTaskList;
        this.dqlRelateTargetDatasourceId = builder.dqlRelateTargetDatasourceId;
        this.dqlTestDatasourceId = builder.dqlTestDatasourceId;
        this.dqlTestProject = builder.dqlTestProject;
        this.fileName = builder.fileName;
        this.globalParams = builder.globalParams;
        this.identifier = builder.identifier;
        this.ossObjectName = builder.ossObjectName;
        this.realFileName = builder.realFileName;
        this.relatedDdlContentOssFileName = builder.relatedDdlContentOssFileName;
        this.relatedDdlContentOssObjectName = builder.relatedDdlContentOssObjectName;
        this.relatedDdlContentRealFileName = builder.relatedDdlContentRealFileName;
        this.sourceDatasourceId = builder.sourceDatasourceId;
        this.sourceDialect = builder.sourceDialect;
        this.sourceProject = builder.sourceProject;
        this.tableNameMappingFile = builder.tableNameMappingFile;
        this.tableNameOssFileName = builder.tableNameOssFileName;
        this.tableNameOssObjectName = builder.tableNameOssObjectName;
        this.tableNameRealFileName = builder.tableNameRealFileName;
        this.targetDatasourceId = builder.targetDatasourceId;
        this.targetDialect = builder.targetDialect;
        this.targetProject = builder.targetProject;
        this.taskDescription = builder.taskDescription;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
        this.tenantId = builder.tenantId;
        this.transformSchema = builder.transformSchema;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopEditTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public Configuration getConfiguration() {
        return this.configuration;
    }

    /**
     * @return dataTypeMappingFile
     */
    public Object getDataTypeMappingFile() {
        return this.dataTypeMappingFile;
    }

    /**
     * @return dataTypeOssFileName
     */
    public String getDataTypeOssFileName() {
        return this.dataTypeOssFileName;
    }

    /**
     * @return dataTypeOssObjectName
     */
    public String getDataTypeOssObjectName() {
        return this.dataTypeOssObjectName;
    }

    /**
     * @return dataTypeRealFileName
     */
    public String getDataTypeRealFileName() {
        return this.dataTypeRealFileName;
    }

    /**
     * @return dqlAssociationDDLTaskList
     */
    public String getDqlAssociationDDLTaskList() {
        return this.dqlAssociationDDLTaskList;
    }

    /**
     * @return dqlRelateTargetDatasourceId
     */
    public String getDqlRelateTargetDatasourceId() {
        return this.dqlRelateTargetDatasourceId;
    }

    /**
     * @return dqlTestDatasourceId
     */
    public String getDqlTestDatasourceId() {
        return this.dqlTestDatasourceId;
    }

    /**
     * @return dqlTestProject
     */
    public String getDqlTestProject() {
        return this.dqlTestProject;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return globalParams
     */
    public String getGlobalParams() {
        return this.globalParams;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return ossObjectName
     */
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    /**
     * @return realFileName
     */
    public String getRealFileName() {
        return this.realFileName;
    }

    /**
     * @return relatedDdlContentOssFileName
     */
    public String getRelatedDdlContentOssFileName() {
        return this.relatedDdlContentOssFileName;
    }

    /**
     * @return relatedDdlContentOssObjectName
     */
    public String getRelatedDdlContentOssObjectName() {
        return this.relatedDdlContentOssObjectName;
    }

    /**
     * @return relatedDdlContentRealFileName
     */
    public String getRelatedDdlContentRealFileName() {
        return this.relatedDdlContentRealFileName;
    }

    /**
     * @return sourceDatasourceId
     */
    public String getSourceDatasourceId() {
        return this.sourceDatasourceId;
    }

    /**
     * @return sourceDialect
     */
    public String getSourceDialect() {
        return this.sourceDialect;
    }

    /**
     * @return sourceProject
     */
    public String getSourceProject() {
        return this.sourceProject;
    }

    /**
     * @return tableNameMappingFile
     */
    public Object getTableNameMappingFile() {
        return this.tableNameMappingFile;
    }

    /**
     * @return tableNameOssFileName
     */
    public String getTableNameOssFileName() {
        return this.tableNameOssFileName;
    }

    /**
     * @return tableNameOssObjectName
     */
    public String getTableNameOssObjectName() {
        return this.tableNameOssObjectName;
    }

    /**
     * @return tableNameRealFileName
     */
    public String getTableNameRealFileName() {
        return this.tableNameRealFileName;
    }

    /**
     * @return targetDatasourceId
     */
    public String getTargetDatasourceId() {
        return this.targetDatasourceId;
    }

    /**
     * @return targetDialect
     */
    public String getTargetDialect() {
        return this.targetDialect;
    }

    /**
     * @return targetProject
     */
    public String getTargetProject() {
        return this.targetProject;
    }

    /**
     * @return taskDescription
     */
    public String getTaskDescription() {
        return this.taskDescription;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public Integer getTaskType() {
        return this.taskType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return transformSchema
     */
    public String getTransformSchema() {
        return this.transformSchema;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<PopEditTaskRequest, Builder> {
        private Configuration configuration; 
        private Object dataTypeMappingFile; 
        private String dataTypeOssFileName; 
        private String dataTypeOssObjectName; 
        private String dataTypeRealFileName; 
        private String dqlAssociationDDLTaskList; 
        private String dqlRelateTargetDatasourceId; 
        private String dqlTestDatasourceId; 
        private String dqlTestProject; 
        private String fileName; 
        private String globalParams; 
        private String identifier; 
        private String ossObjectName; 
        private String realFileName; 
        private String relatedDdlContentOssFileName; 
        private String relatedDdlContentOssObjectName; 
        private String relatedDdlContentRealFileName; 
        private String sourceDatasourceId; 
        private String sourceDialect; 
        private String sourceProject; 
        private Object tableNameMappingFile; 
        private String tableNameOssFileName; 
        private String tableNameOssObjectName; 
        private String tableNameRealFileName; 
        private String targetDatasourceId; 
        private String targetDialect; 
        private String targetProject; 
        private String taskDescription; 
        private Long taskId; 
        private String taskName; 
        private Integer taskType; 
        private String tenantId; 
        private String transformSchema; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(PopEditTaskRequest request) {
            super(request);
            this.configuration = request.configuration;
            this.dataTypeMappingFile = request.dataTypeMappingFile;
            this.dataTypeOssFileName = request.dataTypeOssFileName;
            this.dataTypeOssObjectName = request.dataTypeOssObjectName;
            this.dataTypeRealFileName = request.dataTypeRealFileName;
            this.dqlAssociationDDLTaskList = request.dqlAssociationDDLTaskList;
            this.dqlRelateTargetDatasourceId = request.dqlRelateTargetDatasourceId;
            this.dqlTestDatasourceId = request.dqlTestDatasourceId;
            this.dqlTestProject = request.dqlTestProject;
            this.fileName = request.fileName;
            this.globalParams = request.globalParams;
            this.identifier = request.identifier;
            this.ossObjectName = request.ossObjectName;
            this.realFileName = request.realFileName;
            this.relatedDdlContentOssFileName = request.relatedDdlContentOssFileName;
            this.relatedDdlContentOssObjectName = request.relatedDdlContentOssObjectName;
            this.relatedDdlContentRealFileName = request.relatedDdlContentRealFileName;
            this.sourceDatasourceId = request.sourceDatasourceId;
            this.sourceDialect = request.sourceDialect;
            this.sourceProject = request.sourceProject;
            this.tableNameMappingFile = request.tableNameMappingFile;
            this.tableNameOssFileName = request.tableNameOssFileName;
            this.tableNameOssObjectName = request.tableNameOssObjectName;
            this.tableNameRealFileName = request.tableNameRealFileName;
            this.targetDatasourceId = request.targetDatasourceId;
            this.targetDialect = request.targetDialect;
            this.targetProject = request.targetProject;
            this.taskDescription = request.taskDescription;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
            this.tenantId = request.tenantId;
            this.transformSchema = request.transformSchema;
            this.uid = request.uid;
        } 

        /**
         * configuration.
         */
        public Builder configuration(Configuration configuration) {
            this.putBodyParameter("configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * dataTypeMappingFile.
         */
        public Builder dataTypeMappingFile(Object dataTypeMappingFile) {
            this.putBodyParameter("dataTypeMappingFile", dataTypeMappingFile);
            this.dataTypeMappingFile = dataTypeMappingFile;
            return this;
        }

        /**
         * dataTypeOssFileName.
         */
        public Builder dataTypeOssFileName(String dataTypeOssFileName) {
            this.putBodyParameter("dataTypeOssFileName", dataTypeOssFileName);
            this.dataTypeOssFileName = dataTypeOssFileName;
            return this;
        }

        /**
         * dataTypeOssObjectName.
         */
        public Builder dataTypeOssObjectName(String dataTypeOssObjectName) {
            this.putBodyParameter("dataTypeOssObjectName", dataTypeOssObjectName);
            this.dataTypeOssObjectName = dataTypeOssObjectName;
            return this;
        }

        /**
         * dataTypeRealFileName.
         */
        public Builder dataTypeRealFileName(String dataTypeRealFileName) {
            this.putBodyParameter("dataTypeRealFileName", dataTypeRealFileName);
            this.dataTypeRealFileName = dataTypeRealFileName;
            return this;
        }

        /**
         * dqlAssociationDDLTaskList.
         */
        public Builder dqlAssociationDDLTaskList(String dqlAssociationDDLTaskList) {
            this.putBodyParameter("dqlAssociationDDLTaskList", dqlAssociationDDLTaskList);
            this.dqlAssociationDDLTaskList = dqlAssociationDDLTaskList;
            return this;
        }

        /**
         * dqlRelateTargetDatasourceId.
         */
        public Builder dqlRelateTargetDatasourceId(String dqlRelateTargetDatasourceId) {
            this.putBodyParameter("dqlRelateTargetDatasourceId", dqlRelateTargetDatasourceId);
            this.dqlRelateTargetDatasourceId = dqlRelateTargetDatasourceId;
            return this;
        }

        /**
         * dqlTestDatasourceId.
         */
        public Builder dqlTestDatasourceId(String dqlTestDatasourceId) {
            this.putBodyParameter("dqlTestDatasourceId", dqlTestDatasourceId);
            this.dqlTestDatasourceId = dqlTestDatasourceId;
            return this;
        }

        /**
         * dqlTestProject.
         */
        public Builder dqlTestProject(String dqlTestProject) {
            this.putBodyParameter("dqlTestProject", dqlTestProject);
            this.dqlTestProject = dqlTestProject;
            return this;
        }

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * globalParams.
         */
        public Builder globalParams(String globalParams) {
            this.putBodyParameter("globalParams", globalParams);
            this.globalParams = globalParams;
            return this;
        }

        /**
         * identifier.
         */
        public Builder identifier(String identifier) {
            this.putBodyParameter("identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * ossObjectName.
         */
        public Builder ossObjectName(String ossObjectName) {
            this.putBodyParameter("ossObjectName", ossObjectName);
            this.ossObjectName = ossObjectName;
            return this;
        }

        /**
         * realFileName.
         */
        public Builder realFileName(String realFileName) {
            this.putBodyParameter("realFileName", realFileName);
            this.realFileName = realFileName;
            return this;
        }

        /**
         * relatedDdlContentOssFileName.
         */
        public Builder relatedDdlContentOssFileName(String relatedDdlContentOssFileName) {
            this.putBodyParameter("relatedDdlContentOssFileName", relatedDdlContentOssFileName);
            this.relatedDdlContentOssFileName = relatedDdlContentOssFileName;
            return this;
        }

        /**
         * relatedDdlContentOssObjectName.
         */
        public Builder relatedDdlContentOssObjectName(String relatedDdlContentOssObjectName) {
            this.putBodyParameter("relatedDdlContentOssObjectName", relatedDdlContentOssObjectName);
            this.relatedDdlContentOssObjectName = relatedDdlContentOssObjectName;
            return this;
        }

        /**
         * relatedDdlContentRealFileName.
         */
        public Builder relatedDdlContentRealFileName(String relatedDdlContentRealFileName) {
            this.putBodyParameter("relatedDdlContentRealFileName", relatedDdlContentRealFileName);
            this.relatedDdlContentRealFileName = relatedDdlContentRealFileName;
            return this;
        }

        /**
         * sourceDatasourceId.
         */
        public Builder sourceDatasourceId(String sourceDatasourceId) {
            this.putBodyParameter("sourceDatasourceId", sourceDatasourceId);
            this.sourceDatasourceId = sourceDatasourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sourceDialect(String sourceDialect) {
            this.putBodyParameter("sourceDialect", sourceDialect);
            this.sourceDialect = sourceDialect;
            return this;
        }

        /**
         * sourceProject.
         */
        public Builder sourceProject(String sourceProject) {
            this.putBodyParameter("sourceProject", sourceProject);
            this.sourceProject = sourceProject;
            return this;
        }

        /**
         * tableNameMappingFile.
         */
        public Builder tableNameMappingFile(Object tableNameMappingFile) {
            this.putBodyParameter("tableNameMappingFile", tableNameMappingFile);
            this.tableNameMappingFile = tableNameMappingFile;
            return this;
        }

        /**
         * tableNameOssFileName.
         */
        public Builder tableNameOssFileName(String tableNameOssFileName) {
            this.putBodyParameter("tableNameOssFileName", tableNameOssFileName);
            this.tableNameOssFileName = tableNameOssFileName;
            return this;
        }

        /**
         * tableNameOssObjectName.
         */
        public Builder tableNameOssObjectName(String tableNameOssObjectName) {
            this.putBodyParameter("tableNameOssObjectName", tableNameOssObjectName);
            this.tableNameOssObjectName = tableNameOssObjectName;
            return this;
        }

        /**
         * tableNameRealFileName.
         */
        public Builder tableNameRealFileName(String tableNameRealFileName) {
            this.putBodyParameter("tableNameRealFileName", tableNameRealFileName);
            this.tableNameRealFileName = tableNameRealFileName;
            return this;
        }

        /**
         * targetDatasourceId.
         */
        public Builder targetDatasourceId(String targetDatasourceId) {
            this.putBodyParameter("targetDatasourceId", targetDatasourceId);
            this.targetDatasourceId = targetDatasourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder targetDialect(String targetDialect) {
            this.putBodyParameter("targetDialect", targetDialect);
            this.targetDialect = targetDialect;
            return this;
        }

        /**
         * targetProject.
         */
        public Builder targetProject(String targetProject) {
            this.putBodyParameter("targetProject", targetProject);
            this.targetProject = targetProject;
            return this;
        }

        /**
         * taskDescription.
         */
        public Builder taskDescription(String taskDescription) {
            this.putBodyParameter("taskDescription", taskDescription);
            this.taskDescription = taskDescription;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskType(Integer taskType) {
            this.putBodyParameter("taskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * transformSchema.
         */
        public Builder transformSchema(String transformSchema) {
            this.putBodyParameter("transformSchema", transformSchema);
            this.transformSchema = transformSchema;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putBodyParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public PopEditTaskRequest build() {
            return new PopEditTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link PopEditTaskRequest} extends {@link TeaModel}
     *
     * <p>PopEditTaskRequest</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataTypeMappingFile")
        private Object dataTypeMappingFile;

        @com.aliyun.core.annotation.NameInMap("dataTypeOssFileName")
        private String dataTypeOssFileName;

        @com.aliyun.core.annotation.NameInMap("dataTypeOssObjectName")
        private String dataTypeOssObjectName;

        @com.aliyun.core.annotation.NameInMap("dataTypeRealFileName")
        private String dataTypeRealFileName;

        @com.aliyun.core.annotation.NameInMap("globalParams")
        private String globalParams;

        @com.aliyun.core.annotation.NameInMap("tableNameMappingFile")
        private Object tableNameMappingFile;

        @com.aliyun.core.annotation.NameInMap("tableNameOssFileName")
        private String tableNameOssFileName;

        @com.aliyun.core.annotation.NameInMap("tableNameOssObjectName")
        private String tableNameOssObjectName;

        @com.aliyun.core.annotation.NameInMap("tableNameRealFileName")
        private String tableNameRealFileName;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        private Configuration(Builder builder) {
            this.dataTypeMappingFile = builder.dataTypeMappingFile;
            this.dataTypeOssFileName = builder.dataTypeOssFileName;
            this.dataTypeOssObjectName = builder.dataTypeOssObjectName;
            this.dataTypeRealFileName = builder.dataTypeRealFileName;
            this.globalParams = builder.globalParams;
            this.tableNameMappingFile = builder.tableNameMappingFile;
            this.tableNameOssFileName = builder.tableNameOssFileName;
            this.tableNameOssObjectName = builder.tableNameOssObjectName;
            this.tableNameRealFileName = builder.tableNameRealFileName;
            this.taskId = builder.taskId;
            this.tenantId = builder.tenantId;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return dataTypeMappingFile
         */
        public Object getDataTypeMappingFile() {
            return this.dataTypeMappingFile;
        }

        /**
         * @return dataTypeOssFileName
         */
        public String getDataTypeOssFileName() {
            return this.dataTypeOssFileName;
        }

        /**
         * @return dataTypeOssObjectName
         */
        public String getDataTypeOssObjectName() {
            return this.dataTypeOssObjectName;
        }

        /**
         * @return dataTypeRealFileName
         */
        public String getDataTypeRealFileName() {
            return this.dataTypeRealFileName;
        }

        /**
         * @return globalParams
         */
        public String getGlobalParams() {
            return this.globalParams;
        }

        /**
         * @return tableNameMappingFile
         */
        public Object getTableNameMappingFile() {
            return this.tableNameMappingFile;
        }

        /**
         * @return tableNameOssFileName
         */
        public String getTableNameOssFileName() {
            return this.tableNameOssFileName;
        }

        /**
         * @return tableNameOssObjectName
         */
        public String getTableNameOssObjectName() {
            return this.tableNameOssObjectName;
        }

        /**
         * @return tableNameRealFileName
         */
        public String getTableNameRealFileName() {
            return this.tableNameRealFileName;
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
            private Object dataTypeMappingFile; 
            private String dataTypeOssFileName; 
            private String dataTypeOssObjectName; 
            private String dataTypeRealFileName; 
            private String globalParams; 
            private Object tableNameMappingFile; 
            private String tableNameOssFileName; 
            private String tableNameOssObjectName; 
            private String tableNameRealFileName; 
            private Long taskId; 
            private String tenantId; 
            private String uid; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.dataTypeMappingFile = model.dataTypeMappingFile;
                this.dataTypeOssFileName = model.dataTypeOssFileName;
                this.dataTypeOssObjectName = model.dataTypeOssObjectName;
                this.dataTypeRealFileName = model.dataTypeRealFileName;
                this.globalParams = model.globalParams;
                this.tableNameMappingFile = model.tableNameMappingFile;
                this.tableNameOssFileName = model.tableNameOssFileName;
                this.tableNameOssObjectName = model.tableNameOssObjectName;
                this.tableNameRealFileName = model.tableNameRealFileName;
                this.taskId = model.taskId;
                this.tenantId = model.tenantId;
                this.uid = model.uid;
            } 

            /**
             * dataTypeMappingFile.
             */
            public Builder dataTypeMappingFile(Object dataTypeMappingFile) {
                this.dataTypeMappingFile = dataTypeMappingFile;
                return this;
            }

            /**
             * dataTypeOssFileName.
             */
            public Builder dataTypeOssFileName(String dataTypeOssFileName) {
                this.dataTypeOssFileName = dataTypeOssFileName;
                return this;
            }

            /**
             * dataTypeOssObjectName.
             */
            public Builder dataTypeOssObjectName(String dataTypeOssObjectName) {
                this.dataTypeOssObjectName = dataTypeOssObjectName;
                return this;
            }

            /**
             * dataTypeRealFileName.
             */
            public Builder dataTypeRealFileName(String dataTypeRealFileName) {
                this.dataTypeRealFileName = dataTypeRealFileName;
                return this;
            }

            /**
             * globalParams.
             */
            public Builder globalParams(String globalParams) {
                this.globalParams = globalParams;
                return this;
            }

            /**
             * tableNameMappingFile.
             */
            public Builder tableNameMappingFile(Object tableNameMappingFile) {
                this.tableNameMappingFile = tableNameMappingFile;
                return this;
            }

            /**
             * tableNameOssFileName.
             */
            public Builder tableNameOssFileName(String tableNameOssFileName) {
                this.tableNameOssFileName = tableNameOssFileName;
                return this;
            }

            /**
             * tableNameOssObjectName.
             */
            public Builder tableNameOssObjectName(String tableNameOssObjectName) {
                this.tableNameOssObjectName = tableNameOssObjectName;
                return this;
            }

            /**
             * tableNameRealFileName.
             */
            public Builder tableNameRealFileName(String tableNameRealFileName) {
                this.tableNameRealFileName = tableNameRealFileName;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
}
