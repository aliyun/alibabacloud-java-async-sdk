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
 * {@link GetTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskDetailResponseBody</p>
 */
public class GetTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetTaskDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTaskDetailResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTaskDetailResponseBody build() {
            return new GetTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskDetailResponseBody</p>
     */
    public static class DqlAssociationDDLTaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ddlTaskId")
        private Long ddlTaskId;

        @com.aliyun.core.annotation.NameInMap("ddlTaskName")
        private String ddlTaskName;

        @com.aliyun.core.annotation.NameInMap("dqlTaskId")
        private Long dqlTaskId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        private DqlAssociationDDLTaskList(Builder builder) {
            this.ddlTaskId = builder.ddlTaskId;
            this.ddlTaskName = builder.ddlTaskName;
            this.dqlTaskId = builder.dqlTaskId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.tenantId = builder.tenantId;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DqlAssociationDDLTaskList create() {
            return builder().build();
        }

        /**
         * @return ddlTaskId
         */
        public Long getDdlTaskId() {
            return this.ddlTaskId;
        }

        /**
         * @return ddlTaskName
         */
        public String getDdlTaskName() {
            return this.ddlTaskName;
        }

        /**
         * @return dqlTaskId
         */
        public Long getDqlTaskId() {
            return this.dqlTaskId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
            private Long ddlTaskId; 
            private String ddlTaskName; 
            private Long dqlTaskId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String tenantId; 
            private String uid; 

            private Builder() {
            } 

            private Builder(DqlAssociationDDLTaskList model) {
                this.ddlTaskId = model.ddlTaskId;
                this.ddlTaskName = model.ddlTaskName;
                this.dqlTaskId = model.dqlTaskId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.tenantId = model.tenantId;
                this.uid = model.uid;
            } 

            /**
             * ddlTaskId.
             */
            public Builder ddlTaskId(Long ddlTaskId) {
                this.ddlTaskId = ddlTaskId;
                return this;
            }

            /**
             * ddlTaskName.
             */
            public Builder ddlTaskName(String ddlTaskName) {
                this.ddlTaskName = ddlTaskName;
                return this;
            }

            /**
             * dqlTaskId.
             */
            public Builder dqlTaskId(Long dqlTaskId) {
                this.dqlTaskId = dqlTaskId;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
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

            public DqlAssociationDDLTaskList build() {
                return new DqlAssociationDDLTaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ddlFilename")
        private String ddlFilename;

        @com.aliyun.core.annotation.NameInMap("ddlRelateType")
        private Integer ddlRelateType;

        @com.aliyun.core.annotation.NameInMap("dqlAssociationDDLTaskList")
        private java.util.List<DqlAssociationDDLTaskList> dqlAssociationDDLTaskList;

        @com.aliyun.core.annotation.NameInMap("dqlFilename")
        private String dqlFilename;

        @com.aliyun.core.annotation.NameInMap("dqlRelateDdlMessage")
        private String dqlRelateDdlMessage;

        @com.aliyun.core.annotation.NameInMap("dqlRelateTargetDatasourceId")
        private String dqlRelateTargetDatasourceId;

        @com.aliyun.core.annotation.NameInMap("dqlRelateTargetDatasourceName")
        private String dqlRelateTargetDatasourceName;

        @com.aliyun.core.annotation.NameInMap("dqlTestDatasourceId")
        private String dqlTestDatasourceId;

        @com.aliyun.core.annotation.NameInMap("dqlTestDatasourceName")
        private String dqlTestDatasourceName;

        @com.aliyun.core.annotation.NameInMap("dqlTestProject")
        private String dqlTestProject;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastImportTime")
        private String lastImportTime;

        @com.aliyun.core.annotation.NameInMap("scriptTransformStatus")
        private String scriptTransformStatus;

        @com.aliyun.core.annotation.NameInMap("sourceDatasourceId")
        private String sourceDatasourceId;

        @com.aliyun.core.annotation.NameInMap("sourceDatasourceName")
        private String sourceDatasourceName;

        @com.aliyun.core.annotation.NameInMap("sourceDialect")
        private String sourceDialect;

        @com.aliyun.core.annotation.NameInMap("sourceProject")
        private String sourceProject;

        @com.aliyun.core.annotation.NameInMap("syntaxErrorCount")
        private Integer syntaxErrorCount;

        @com.aliyun.core.annotation.NameInMap("syntaxPassCount")
        private Integer syntaxPassCount;

        @com.aliyun.core.annotation.NameInMap("syntaxValidationStatus")
        private String syntaxValidationStatus;

        @com.aliyun.core.annotation.NameInMap("targetDatasourceId")
        private String targetDatasourceId;

        @com.aliyun.core.annotation.NameInMap("targetDatasourceName")
        private String targetDatasourceName;

        @com.aliyun.core.annotation.NameInMap("targetDialect")
        private String targetDialect;

        @com.aliyun.core.annotation.NameInMap("targetProject")
        private String targetProject;

        @com.aliyun.core.annotation.NameInMap("taskDescription")
        private String taskDescription;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private Integer taskType;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("transformFailureCount")
        private Integer transformFailureCount;

        @com.aliyun.core.annotation.NameInMap("transformSchema")
        private String transformSchema;

        @com.aliyun.core.annotation.NameInMap("transformSuccessCount")
        private Integer transformSuccessCount;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("uploadedScriptUrl")
        private String uploadedScriptUrl;

        @com.aliyun.core.annotation.NameInMap("zipParsingState")
        private String zipParsingState;

        private Data(Builder builder) {
            this.ddlFilename = builder.ddlFilename;
            this.ddlRelateType = builder.ddlRelateType;
            this.dqlAssociationDDLTaskList = builder.dqlAssociationDDLTaskList;
            this.dqlFilename = builder.dqlFilename;
            this.dqlRelateDdlMessage = builder.dqlRelateDdlMessage;
            this.dqlRelateTargetDatasourceId = builder.dqlRelateTargetDatasourceId;
            this.dqlRelateTargetDatasourceName = builder.dqlRelateTargetDatasourceName;
            this.dqlTestDatasourceId = builder.dqlTestDatasourceId;
            this.dqlTestDatasourceName = builder.dqlTestDatasourceName;
            this.dqlTestProject = builder.dqlTestProject;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.lastImportTime = builder.lastImportTime;
            this.scriptTransformStatus = builder.scriptTransformStatus;
            this.sourceDatasourceId = builder.sourceDatasourceId;
            this.sourceDatasourceName = builder.sourceDatasourceName;
            this.sourceDialect = builder.sourceDialect;
            this.sourceProject = builder.sourceProject;
            this.syntaxErrorCount = builder.syntaxErrorCount;
            this.syntaxPassCount = builder.syntaxPassCount;
            this.syntaxValidationStatus = builder.syntaxValidationStatus;
            this.targetDatasourceId = builder.targetDatasourceId;
            this.targetDatasourceName = builder.targetDatasourceName;
            this.targetDialect = builder.targetDialect;
            this.targetProject = builder.targetProject;
            this.taskDescription = builder.taskDescription;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.tenantId = builder.tenantId;
            this.totalCount = builder.totalCount;
            this.transformFailureCount = builder.transformFailureCount;
            this.transformSchema = builder.transformSchema;
            this.transformSuccessCount = builder.transformSuccessCount;
            this.uid = builder.uid;
            this.uploadedScriptUrl = builder.uploadedScriptUrl;
            this.zipParsingState = builder.zipParsingState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ddlFilename
         */
        public String getDdlFilename() {
            return this.ddlFilename;
        }

        /**
         * @return ddlRelateType
         */
        public Integer getDdlRelateType() {
            return this.ddlRelateType;
        }

        /**
         * @return dqlAssociationDDLTaskList
         */
        public java.util.List<DqlAssociationDDLTaskList> getDqlAssociationDDLTaskList() {
            return this.dqlAssociationDDLTaskList;
        }

        /**
         * @return dqlFilename
         */
        public String getDqlFilename() {
            return this.dqlFilename;
        }

        /**
         * @return dqlRelateDdlMessage
         */
        public String getDqlRelateDdlMessage() {
            return this.dqlRelateDdlMessage;
        }

        /**
         * @return dqlRelateTargetDatasourceId
         */
        public String getDqlRelateTargetDatasourceId() {
            return this.dqlRelateTargetDatasourceId;
        }

        /**
         * @return dqlRelateTargetDatasourceName
         */
        public String getDqlRelateTargetDatasourceName() {
            return this.dqlRelateTargetDatasourceName;
        }

        /**
         * @return dqlTestDatasourceId
         */
        public String getDqlTestDatasourceId() {
            return this.dqlTestDatasourceId;
        }

        /**
         * @return dqlTestDatasourceName
         */
        public String getDqlTestDatasourceName() {
            return this.dqlTestDatasourceName;
        }

        /**
         * @return dqlTestProject
         */
        public String getDqlTestProject() {
            return this.dqlTestProject;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastImportTime
         */
        public String getLastImportTime() {
            return this.lastImportTime;
        }

        /**
         * @return scriptTransformStatus
         */
        public String getScriptTransformStatus() {
            return this.scriptTransformStatus;
        }

        /**
         * @return sourceDatasourceId
         */
        public String getSourceDatasourceId() {
            return this.sourceDatasourceId;
        }

        /**
         * @return sourceDatasourceName
         */
        public String getSourceDatasourceName() {
            return this.sourceDatasourceName;
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
         * @return syntaxErrorCount
         */
        public Integer getSyntaxErrorCount() {
            return this.syntaxErrorCount;
        }

        /**
         * @return syntaxPassCount
         */
        public Integer getSyntaxPassCount() {
            return this.syntaxPassCount;
        }

        /**
         * @return syntaxValidationStatus
         */
        public String getSyntaxValidationStatus() {
            return this.syntaxValidationStatus;
        }

        /**
         * @return targetDatasourceId
         */
        public String getTargetDatasourceId() {
            return this.targetDatasourceId;
        }

        /**
         * @return targetDatasourceName
         */
        public String getTargetDatasourceName() {
            return this.targetDatasourceName;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return transformFailureCount
         */
        public Integer getTransformFailureCount() {
            return this.transformFailureCount;
        }

        /**
         * @return transformSchema
         */
        public String getTransformSchema() {
            return this.transformSchema;
        }

        /**
         * @return transformSuccessCount
         */
        public Integer getTransformSuccessCount() {
            return this.transformSuccessCount;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return uploadedScriptUrl
         */
        public String getUploadedScriptUrl() {
            return this.uploadedScriptUrl;
        }

        /**
         * @return zipParsingState
         */
        public String getZipParsingState() {
            return this.zipParsingState;
        }

        public static final class Builder {
            private String ddlFilename; 
            private Integer ddlRelateType; 
            private java.util.List<DqlAssociationDDLTaskList> dqlAssociationDDLTaskList; 
            private String dqlFilename; 
            private String dqlRelateDdlMessage; 
            private String dqlRelateTargetDatasourceId; 
            private String dqlRelateTargetDatasourceName; 
            private String dqlTestDatasourceId; 
            private String dqlTestDatasourceName; 
            private String dqlTestProject; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String lastImportTime; 
            private String scriptTransformStatus; 
            private String sourceDatasourceId; 
            private String sourceDatasourceName; 
            private String sourceDialect; 
            private String sourceProject; 
            private Integer syntaxErrorCount; 
            private Integer syntaxPassCount; 
            private String syntaxValidationStatus; 
            private String targetDatasourceId; 
            private String targetDatasourceName; 
            private String targetDialect; 
            private String targetProject; 
            private String taskDescription; 
            private String taskName; 
            private Integer taskType; 
            private String tenantId; 
            private Integer totalCount; 
            private Integer transformFailureCount; 
            private String transformSchema; 
            private Integer transformSuccessCount; 
            private String uid; 
            private String uploadedScriptUrl; 
            private String zipParsingState; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ddlFilename = model.ddlFilename;
                this.ddlRelateType = model.ddlRelateType;
                this.dqlAssociationDDLTaskList = model.dqlAssociationDDLTaskList;
                this.dqlFilename = model.dqlFilename;
                this.dqlRelateDdlMessage = model.dqlRelateDdlMessage;
                this.dqlRelateTargetDatasourceId = model.dqlRelateTargetDatasourceId;
                this.dqlRelateTargetDatasourceName = model.dqlRelateTargetDatasourceName;
                this.dqlTestDatasourceId = model.dqlTestDatasourceId;
                this.dqlTestDatasourceName = model.dqlTestDatasourceName;
                this.dqlTestProject = model.dqlTestProject;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.lastImportTime = model.lastImportTime;
                this.scriptTransformStatus = model.scriptTransformStatus;
                this.sourceDatasourceId = model.sourceDatasourceId;
                this.sourceDatasourceName = model.sourceDatasourceName;
                this.sourceDialect = model.sourceDialect;
                this.sourceProject = model.sourceProject;
                this.syntaxErrorCount = model.syntaxErrorCount;
                this.syntaxPassCount = model.syntaxPassCount;
                this.syntaxValidationStatus = model.syntaxValidationStatus;
                this.targetDatasourceId = model.targetDatasourceId;
                this.targetDatasourceName = model.targetDatasourceName;
                this.targetDialect = model.targetDialect;
                this.targetProject = model.targetProject;
                this.taskDescription = model.taskDescription;
                this.taskName = model.taskName;
                this.taskType = model.taskType;
                this.tenantId = model.tenantId;
                this.totalCount = model.totalCount;
                this.transformFailureCount = model.transformFailureCount;
                this.transformSchema = model.transformSchema;
                this.transformSuccessCount = model.transformSuccessCount;
                this.uid = model.uid;
                this.uploadedScriptUrl = model.uploadedScriptUrl;
                this.zipParsingState = model.zipParsingState;
            } 

            /**
             * ddlFilename.
             */
            public Builder ddlFilename(String ddlFilename) {
                this.ddlFilename = ddlFilename;
                return this;
            }

            /**
             * ddlRelateType.
             */
            public Builder ddlRelateType(Integer ddlRelateType) {
                this.ddlRelateType = ddlRelateType;
                return this;
            }

            /**
             * dqlAssociationDDLTaskList.
             */
            public Builder dqlAssociationDDLTaskList(java.util.List<DqlAssociationDDLTaskList> dqlAssociationDDLTaskList) {
                this.dqlAssociationDDLTaskList = dqlAssociationDDLTaskList;
                return this;
            }

            /**
             * dqlFilename.
             */
            public Builder dqlFilename(String dqlFilename) {
                this.dqlFilename = dqlFilename;
                return this;
            }

            /**
             * dqlRelateDdlMessage.
             */
            public Builder dqlRelateDdlMessage(String dqlRelateDdlMessage) {
                this.dqlRelateDdlMessage = dqlRelateDdlMessage;
                return this;
            }

            /**
             * dqlRelateTargetDatasourceId.
             */
            public Builder dqlRelateTargetDatasourceId(String dqlRelateTargetDatasourceId) {
                this.dqlRelateTargetDatasourceId = dqlRelateTargetDatasourceId;
                return this;
            }

            /**
             * dqlRelateTargetDatasourceName.
             */
            public Builder dqlRelateTargetDatasourceName(String dqlRelateTargetDatasourceName) {
                this.dqlRelateTargetDatasourceName = dqlRelateTargetDatasourceName;
                return this;
            }

            /**
             * dqlTestDatasourceId.
             */
            public Builder dqlTestDatasourceId(String dqlTestDatasourceId) {
                this.dqlTestDatasourceId = dqlTestDatasourceId;
                return this;
            }

            /**
             * dqlTestDatasourceName.
             */
            public Builder dqlTestDatasourceName(String dqlTestDatasourceName) {
                this.dqlTestDatasourceName = dqlTestDatasourceName;
                return this;
            }

            /**
             * dqlTestProject.
             */
            public Builder dqlTestProject(String dqlTestProject) {
                this.dqlTestProject = dqlTestProject;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * lastImportTime.
             */
            public Builder lastImportTime(String lastImportTime) {
                this.lastImportTime = lastImportTime;
                return this;
            }

            /**
             * scriptTransformStatus.
             */
            public Builder scriptTransformStatus(String scriptTransformStatus) {
                this.scriptTransformStatus = scriptTransformStatus;
                return this;
            }

            /**
             * sourceDatasourceId.
             */
            public Builder sourceDatasourceId(String sourceDatasourceId) {
                this.sourceDatasourceId = sourceDatasourceId;
                return this;
            }

            /**
             * sourceDatasourceName.
             */
            public Builder sourceDatasourceName(String sourceDatasourceName) {
                this.sourceDatasourceName = sourceDatasourceName;
                return this;
            }

            /**
             * sourceDialect.
             */
            public Builder sourceDialect(String sourceDialect) {
                this.sourceDialect = sourceDialect;
                return this;
            }

            /**
             * sourceProject.
             */
            public Builder sourceProject(String sourceProject) {
                this.sourceProject = sourceProject;
                return this;
            }

            /**
             * syntaxErrorCount.
             */
            public Builder syntaxErrorCount(Integer syntaxErrorCount) {
                this.syntaxErrorCount = syntaxErrorCount;
                return this;
            }

            /**
             * syntaxPassCount.
             */
            public Builder syntaxPassCount(Integer syntaxPassCount) {
                this.syntaxPassCount = syntaxPassCount;
                return this;
            }

            /**
             * syntaxValidationStatus.
             */
            public Builder syntaxValidationStatus(String syntaxValidationStatus) {
                this.syntaxValidationStatus = syntaxValidationStatus;
                return this;
            }

            /**
             * targetDatasourceId.
             */
            public Builder targetDatasourceId(String targetDatasourceId) {
                this.targetDatasourceId = targetDatasourceId;
                return this;
            }

            /**
             * targetDatasourceName.
             */
            public Builder targetDatasourceName(String targetDatasourceName) {
                this.targetDatasourceName = targetDatasourceName;
                return this;
            }

            /**
             * targetDialect.
             */
            public Builder targetDialect(String targetDialect) {
                this.targetDialect = targetDialect;
                return this;
            }

            /**
             * targetProject.
             */
            public Builder targetProject(String targetProject) {
                this.targetProject = targetProject;
                return this;
            }

            /**
             * taskDescription.
             */
            public Builder taskDescription(String taskDescription) {
                this.taskDescription = taskDescription;
                return this;
            }

            /**
             * taskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * taskType.
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
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
             * totalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * transformFailureCount.
             */
            public Builder transformFailureCount(Integer transformFailureCount) {
                this.transformFailureCount = transformFailureCount;
                return this;
            }

            /**
             * transformSchema.
             */
            public Builder transformSchema(String transformSchema) {
                this.transformSchema = transformSchema;
                return this;
            }

            /**
             * transformSuccessCount.
             */
            public Builder transformSuccessCount(Integer transformSuccessCount) {
                this.transformSuccessCount = transformSuccessCount;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * uploadedScriptUrl.
             */
            public Builder uploadedScriptUrl(String uploadedScriptUrl) {
                this.uploadedScriptUrl = uploadedScriptUrl;
                return this;
            }

            /**
             * zipParsingState.
             */
            public Builder zipParsingState(String zipParsingState) {
                this.zipParsingState = zipParsingState;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
