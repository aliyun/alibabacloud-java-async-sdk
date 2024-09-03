// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileResponseBody</p>
 */
public class GetFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetFileResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the file.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request is successful.
         * *   false: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFileResponseBody build() {
            return new GetFileResponseBody(this);
        } 

    } 

    public static class File extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedSettings")
        private String advancedSettings;

        @com.aliyun.core.annotation.NameInMap("AutoParsing")
        private Boolean autoParsing;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private Long bizId;

        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private Long businessId;

        @com.aliyun.core.annotation.NameInMap("CommitStatus")
        private Integer commitStatus;

        @com.aliyun.core.annotation.NameInMap("ConnectionName")
        private String connectionName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private Integer currentVersion;

        @com.aliyun.core.annotation.NameInMap("DeletedStatus")
        private String deletedStatus;

        @com.aliyun.core.annotation.NameInMap("FileDescription")
        private String fileDescription;

        @com.aliyun.core.annotation.NameInMap("FileFolderId")
        private String fileFolderId;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("IsMaxCompute")
        private Boolean isMaxCompute;

        @com.aliyun.core.annotation.NameInMap("LastEditTime")
        private Long lastEditTime;

        @com.aliyun.core.annotation.NameInMap("LastEditUser")
        private String lastEditUser;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("UseType")
        private String useType;

        private File(Builder builder) {
            this.advancedSettings = builder.advancedSettings;
            this.autoParsing = builder.autoParsing;
            this.bizId = builder.bizId;
            this.businessId = builder.businessId;
            this.commitStatus = builder.commitStatus;
            this.connectionName = builder.connectionName;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.currentVersion = builder.currentVersion;
            this.deletedStatus = builder.deletedStatus;
            this.fileDescription = builder.fileDescription;
            this.fileFolderId = builder.fileFolderId;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.isMaxCompute = builder.isMaxCompute;
            this.lastEditTime = builder.lastEditTime;
            this.lastEditUser = builder.lastEditUser;
            this.nodeId = builder.nodeId;
            this.owner = builder.owner;
            this.parentId = builder.parentId;
            this.useType = builder.useType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static File create() {
            return builder().build();
        }

        /**
         * @return advancedSettings
         */
        public String getAdvancedSettings() {
            return this.advancedSettings;
        }

        /**
         * @return autoParsing
         */
        public Boolean getAutoParsing() {
            return this.autoParsing;
        }

        /**
         * @return bizId
         */
        public Long getBizId() {
            return this.bizId;
        }

        /**
         * @return businessId
         */
        public Long getBusinessId() {
            return this.businessId;
        }

        /**
         * @return commitStatus
         */
        public Integer getCommitStatus() {
            return this.commitStatus;
        }

        /**
         * @return connectionName
         */
        public String getConnectionName() {
            return this.connectionName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return currentVersion
         */
        public Integer getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return deletedStatus
         */
        public String getDeletedStatus() {
            return this.deletedStatus;
        }

        /**
         * @return fileDescription
         */
        public String getFileDescription() {
            return this.fileDescription;
        }

        /**
         * @return fileFolderId
         */
        public String getFileFolderId() {
            return this.fileFolderId;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return isMaxCompute
         */
        public Boolean getIsMaxCompute() {
            return this.isMaxCompute;
        }

        /**
         * @return lastEditTime
         */
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        /**
         * @return lastEditUser
         */
        public String getLastEditUser() {
            return this.lastEditUser;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return useType
         */
        public String getUseType() {
            return this.useType;
        }

        public static final class Builder {
            private String advancedSettings; 
            private Boolean autoParsing; 
            private Long bizId; 
            private Long businessId; 
            private Integer commitStatus; 
            private String connectionName; 
            private String content; 
            private Long createTime; 
            private String createUser; 
            private Integer currentVersion; 
            private String deletedStatus; 
            private String fileDescription; 
            private String fileFolderId; 
            private Long fileId; 
            private String fileName; 
            private Integer fileType; 
            private Boolean isMaxCompute; 
            private Long lastEditTime; 
            private String lastEditUser; 
            private Long nodeId; 
            private String owner; 
            private Long parentId; 
            private String useType; 

            /**
             * The advanced configurations of the node.
             * <p>
             * 
             * This parameter is valid for an EMR node. This parameter corresponds to the Advanced Settings tab in the right-side navigation pane on the configuration tab of the node in the [DataWorks console](https://workbench.data.aliyun.com/console).
             * 
             * >  You cannot configure advanced parameters for EMR Shell nodes.
             * 
             * For information about the advanced parameters of each type of EMR node, see [Develop EMR tasks](~~473077~~).
             */
            public Builder advancedSettings(String advancedSettings) {
                this.advancedSettings = advancedSettings;
                return this;
            }

            /**
             * Indicates whether the automatic parsing feature is enabled for the file. Valid values:
             * <p>
             * 
             * *   true: The automatic parsing feature is enabled for the file.
             * *   false: The automatic parsing feature is not enabled for the file.
             * 
             * This parameter corresponds to the Analyze Code parameter that is displayed after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder autoParsing(Boolean autoParsing) {
                this.autoParsing = autoParsing;
                return this;
            }

            /**
             * The ID of the workflow to which the file belongs. This parameter is deprecated and replaced by the BusinessId parameter.
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * The ID of the workflow to which the file belongs.
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * Indicates whether the latest code in the file is committed. Valid values: 0 and 1. The value 0 indicates that the latest code in the file is not committed. The value 1 indicates that the latest code in the file is committed.
             */
            public Builder commitStatus(Integer commitStatus) {
                this.commitStatus = commitStatus;
                return this;
            }

            /**
             * The ID of the compute engine instance that is used to run the node that corresponds to the file.
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * The code in the file.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The time when the file was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used to create the file.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * The latest version number of the file.
             */
            public Builder currentVersion(Integer currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * The status of the file. Valid values:
             * <p>
             * 
             * *   NORMAL: The file is not deleted.
             * *   RECYCLE_BIN: The file is stored in the recycle bin.
             * *   DELETED: The file is deleted.
             */
            public Builder deletedStatus(String deletedStatus) {
                this.deletedStatus = deletedStatus;
                return this;
            }

            /**
             * The description of the file.
             */
            public Builder fileDescription(String fileDescription) {
                this.fileDescription = fileDescription;
                return this;
            }

            /**
             * The ID of the folder to which the file belongs.
             */
            public Builder fileFolderId(String fileFolderId) {
                this.fileFolderId = fileFolderId;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * The name of the file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The type of the code for the file. Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * Indicates whether the file needs to be uploaded to MaxCompute.
             * <p>
             * 
             * This parameter is returned only if the file is a MaxCompute resource file.
             */
            public Builder isMaxCompute(Boolean isMaxCompute) {
                this.isMaxCompute = isMaxCompute;
                return this;
            }

            /**
             * The time when the file was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder lastEditTime(Long lastEditTime) {
                this.lastEditTime = lastEditTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used to last modify the file.
             */
            public Builder lastEditUser(String lastEditUser) {
                this.lastEditUser = lastEditUser;
                return this;
            }

            /**
             * The ID of the auto triggered node that is generated in the scheduling system after the file is committed.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the file owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The ID of the node group file to which the current file belongs. This parameter is returned only if the current file is an inner file of the node group file.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The module to which the file belongs. Valid values:
             * <p>
             * 
             * *   NORMAL: The file is used for DataStudio.
             * *   MANUAL: The file is used for a manually triggered node.
             * *   MANUAL_BIZ: The file is used for a manually triggered workflow.
             * *   SKIP: The file is used for a dry-run DataStudio node.
             * *   ADHOCQUERY: The file is used for an ad hoc query.
             * *   COMPONENT: The file is used for a snippet.
             */
            public Builder useType(String useType) {
                this.useType = useType;
                return this;
            }

            public File build() {
                return new File(this);
            } 

        } 

    }
    public static class InputList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Input")
        private String input;

        @com.aliyun.core.annotation.NameInMap("ParseType")
        private String parseType;

        private InputList(Builder builder) {
            this.input = builder.input;
            this.parseType = builder.parseType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputList create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        /**
         * @return parseType
         */
        public String getParseType() {
            return this.parseType;
        }

        public static final class Builder {
            private String input; 
            private String parseType; 

            /**
             * The output name of the parent file on which the current file depends.
             * <p>
             * 
             * This parameter corresponds to the Output Name of Ancestor Node parameter under Parent Nodes after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * The mode of the configuration file dependency. Valid values:
             * <p>
             * 
             * *   MANUAL: Scheduling dependencies are manually configured.
             * *   AUTO: Scheduling dependencies are automatically parsed.
             */
            public Builder parseType(String parseType) {
                this.parseType = parseType;
                return this;
            }

            public InputList build() {
                return new InputList(this);
            } 

        } 

    }
    public static class InputParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ValueSource")
        private String valueSource;

        private InputParameters(Builder builder) {
            this.parameterName = builder.parameterName;
            this.valueSource = builder.valueSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputParameters create() {
            return builder().build();
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return valueSource
         */
        public String getValueSource() {
            return this.valueSource;
        }

        public static final class Builder {
            private String parameterName; 
            private String valueSource; 

            /**
             * The name of the input parameter of the node. In the code, you can use the ${...} method to reference the input parameter of the node.
             * <p>
             * 
             * This parameter corresponds to the Parameter Name parameter in the Input Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The value source of the input parameter of the node.
             * <p>
             * 
             * This parameter corresponds to the Value Source parameter in the Input Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder valueSource(String valueSource) {
                this.valueSource = valueSource;
                return this;
            }

            public InputParameters build() {
                return new InputParameters(this);
            } 

        } 

    }
    public static class OutputList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("RefTableName")
        private String refTableName;

        private OutputList(Builder builder) {
            this.output = builder.output;
            this.refTableName = builder.refTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputList create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return refTableName
         */
        public String getRefTableName() {
            return this.refTableName;
        }

        public static final class Builder {
            private String output; 
            private String refTableName; 

            /**
             * The output name of the current file.
             * <p>
             * 
             * This parameter corresponds to the Output Name parameter under Output after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * The output table name of the current file.
             * <p>
             * 
             * This parameter corresponds to the Output Table Name parameter under Output after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder refTableName(String refTableName) {
                this.refTableName = refTableName;
                return this;
            }

            public OutputList build() {
                return new OutputList(this);
            } 

        } 

    }
    public static class OutputParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private OutputParameters(Builder builder) {
            this.description = builder.description;
            this.parameterName = builder.parameterName;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputParameters create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String parameterName; 
            private String type; 
            private String value; 

            /**
             * The description of the output parameter of the node.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the output parameter of the node.
             * <p>
             * 
             * This parameter corresponds to the Parameter Name parameter in the Output Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The type of the output parameter of the node. Valid values:
             * <p>
             * 
             * *   1: indicates a constant.
             * *   2: indicates a variable.
             * *   3: indicates a pass-through variable.
             * 
             * This parameter corresponds to the Type parameter in the Output Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the output parameter of the node.
             * <p>
             * 
             * This parameter corresponds to the Value parameter in the Output Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OutputParameters build() {
                return new OutputParameters(this);
            } 

        } 

    }
    public static class NodeConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyScheduleImmediately")
        private String applyScheduleImmediately;

        @com.aliyun.core.annotation.NameInMap("AutoRerunIntervalMillis")
        private Integer autoRerunIntervalMillis;

        @com.aliyun.core.annotation.NameInMap("AutoRerunTimes")
        private Integer autoRerunTimes;

        @com.aliyun.core.annotation.NameInMap("CronExpress")
        private String cronExpress;

        @com.aliyun.core.annotation.NameInMap("CycleType")
        private String cycleType;

        @com.aliyun.core.annotation.NameInMap("DependentNodeIdList")
        private String dependentNodeIdList;

        @com.aliyun.core.annotation.NameInMap("DependentType")
        private String dependentType;

        @com.aliyun.core.annotation.NameInMap("EndEffectDate")
        private Long endEffectDate;

        @com.aliyun.core.annotation.NameInMap("InputList")
        private java.util.List < InputList> inputList;

        @com.aliyun.core.annotation.NameInMap("InputParameters")
        private java.util.List < InputParameters> inputParameters;

        @com.aliyun.core.annotation.NameInMap("OutputList")
        private java.util.List < OutputList> outputList;

        @com.aliyun.core.annotation.NameInMap("OutputParameters")
        private java.util.List < OutputParameters> outputParameters;

        @com.aliyun.core.annotation.NameInMap("ParaValue")
        private String paraValue;

        @com.aliyun.core.annotation.NameInMap("RerunMode")
        private String rerunMode;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private Long resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SchedulerType")
        private String schedulerType;

        @com.aliyun.core.annotation.NameInMap("StartEffectDate")
        private Long startEffectDate;

        @com.aliyun.core.annotation.NameInMap("StartImmediately")
        private Boolean startImmediately;

        @com.aliyun.core.annotation.NameInMap("Stop")
        private Boolean stop;

        private NodeConfiguration(Builder builder) {
            this.applyScheduleImmediately = builder.applyScheduleImmediately;
            this.autoRerunIntervalMillis = builder.autoRerunIntervalMillis;
            this.autoRerunTimes = builder.autoRerunTimes;
            this.cronExpress = builder.cronExpress;
            this.cycleType = builder.cycleType;
            this.dependentNodeIdList = builder.dependentNodeIdList;
            this.dependentType = builder.dependentType;
            this.endEffectDate = builder.endEffectDate;
            this.inputList = builder.inputList;
            this.inputParameters = builder.inputParameters;
            this.outputList = builder.outputList;
            this.outputParameters = builder.outputParameters;
            this.paraValue = builder.paraValue;
            this.rerunMode = builder.rerunMode;
            this.resourceGroupId = builder.resourceGroupId;
            this.schedulerType = builder.schedulerType;
            this.startEffectDate = builder.startEffectDate;
            this.startImmediately = builder.startImmediately;
            this.stop = builder.stop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeConfiguration create() {
            return builder().build();
        }

        /**
         * @return applyScheduleImmediately
         */
        public String getApplyScheduleImmediately() {
            return this.applyScheduleImmediately;
        }

        /**
         * @return autoRerunIntervalMillis
         */
        public Integer getAutoRerunIntervalMillis() {
            return this.autoRerunIntervalMillis;
        }

        /**
         * @return autoRerunTimes
         */
        public Integer getAutoRerunTimes() {
            return this.autoRerunTimes;
        }

        /**
         * @return cronExpress
         */
        public String getCronExpress() {
            return this.cronExpress;
        }

        /**
         * @return cycleType
         */
        public String getCycleType() {
            return this.cycleType;
        }

        /**
         * @return dependentNodeIdList
         */
        public String getDependentNodeIdList() {
            return this.dependentNodeIdList;
        }

        /**
         * @return dependentType
         */
        public String getDependentType() {
            return this.dependentType;
        }

        /**
         * @return endEffectDate
         */
        public Long getEndEffectDate() {
            return this.endEffectDate;
        }

        /**
         * @return inputList
         */
        public java.util.List < InputList> getInputList() {
            return this.inputList;
        }

        /**
         * @return inputParameters
         */
        public java.util.List < InputParameters> getInputParameters() {
            return this.inputParameters;
        }

        /**
         * @return outputList
         */
        public java.util.List < OutputList> getOutputList() {
            return this.outputList;
        }

        /**
         * @return outputParameters
         */
        public java.util.List < OutputParameters> getOutputParameters() {
            return this.outputParameters;
        }

        /**
         * @return paraValue
         */
        public String getParaValue() {
            return this.paraValue;
        }

        /**
         * @return rerunMode
         */
        public String getRerunMode() {
            return this.rerunMode;
        }

        /**
         * @return resourceGroupId
         */
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        /**
         * @return startEffectDate
         */
        public Long getStartEffectDate() {
            return this.startEffectDate;
        }

        /**
         * @return startImmediately
         */
        public Boolean getStartImmediately() {
            return this.startImmediately;
        }

        /**
         * @return stop
         */
        public Boolean getStop() {
            return this.stop;
        }

        public static final class Builder {
            private String applyScheduleImmediately; 
            private Integer autoRerunIntervalMillis; 
            private Integer autoRerunTimes; 
            private String cronExpress; 
            private String cycleType; 
            private String dependentNodeIdList; 
            private String dependentType; 
            private Long endEffectDate; 
            private java.util.List < InputList> inputList; 
            private java.util.List < InputParameters> inputParameters; 
            private java.util.List < OutputList> outputList; 
            private java.util.List < OutputParameters> outputParameters; 
            private String paraValue; 
            private String rerunMode; 
            private Long resourceGroupId; 
            private String schedulerType; 
            private Long startEffectDate; 
            private Boolean startImmediately; 
            private Boolean stop; 

            /**
             * ApplyScheduleImmediately.
             */
            public Builder applyScheduleImmediately(String applyScheduleImmediately) {
                this.applyScheduleImmediately = applyScheduleImmediately;
                return this;
            }

            /**
             * The interval between automatic reruns after an error occurs. Unit: milliseconds.
             * <p>
             * 
             * This parameter corresponds to the Rerun Interval parameter that is displayed after the Auto Rerun upon Error check box is selected in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             * 
             * The interval that you specify in the DataWorks console is measured in minutes. Pay attention to the conversion between the units of time when you call the operation.
             */
            public Builder autoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
                this.autoRerunIntervalMillis = autoRerunIntervalMillis;
                return this;
            }

            /**
             * The number of automatic reruns that are allowed after an error occurs.
             */
            public Builder autoRerunTimes(Integer autoRerunTimes) {
                this.autoRerunTimes = autoRerunTimes;
                return this;
            }

            /**
             * The CRON expression that represents the periodic scheduling policy of the node.
             */
            public Builder cronExpress(String cronExpress) {
                this.cronExpress = cronExpress;
                return this;
            }

            /**
             * The type of the scheduling cycle. Valid values: NOT_DAY and DAY. The value NOT_DAY indicates that the node is scheduled to run by minute or hour. The value DAY indicates that the node is scheduled to run by day, week, or month.
             * <p>
             * 
             * This parameter corresponds to the Scheduling Cycle parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder cycleType(String cycleType) {
                this.cycleType = cycleType;
                return this;
            }

            /**
             * The ID of the node on which the node corresponding to the file depends when the DependentType parameter is set to USER_DEFINE. Multiple IDs are separated by commas (,).
             * <p>
             * 
             * The value of this parameter is equivalent to the ID of the node that you specified after you select Previous Cycle and set Depend On to Other Nodes in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder dependentNodeIdList(String dependentNodeIdList) {
                this.dependentNodeIdList = dependentNodeIdList;
                return this;
            }

            /**
             * The type of the cross-cycle scheduling dependency of the node. Valid values:
             * <p>
             * 
             * *   SELF: The instance generated for the node in the current cycle depends on the instance generated for the node in the previous cycle.
             * *   CHILD: The instance generated for the node in the current cycle depends on the instances generated for the descendant nodes at the nearest level of the node in the previous cycle.
             * *   USER_DEFINE: The instance generated for the node in the current cycle depends on the instances generated for one or more specified nodes in the previous cycle.
             * *   NONE: No cross-cycle scheduling dependency type is selected for the node.
             */
            public Builder dependentType(String dependentType) {
                this.dependentType = dependentType;
                return this;
            }

            /**
             * The end time of automatic scheduling. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             * <p>
             * 
             * This parameter corresponds to the Validity Period parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder endEffectDate(Long endEffectDate) {
                this.endEffectDate = endEffectDate;
                return this;
            }

            /**
             * The output names of the parent files on which the current file depends.
             */
            public Builder inputList(java.util.List < InputList> inputList) {
                this.inputList = inputList;
                return this;
            }

            /**
             * Input parameters of the node.
             * <p>
             * 
             * This parameter corresponds to the Input Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder inputParameters(java.util.List < InputParameters> inputParameters) {
                this.inputParameters = inputParameters;
                return this;
            }

            /**
             * The output names of the current file.
             * <p>
             * 
             * This parameter corresponds to the Output Name parameter under Output after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder outputList(java.util.List < OutputList> outputList) {
                this.outputList = outputList;
                return this;
            }

            /**
             * Output parameters of the node.
             * <p>
             * 
             * This parameter corresponds to the Output Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder outputParameters(java.util.List < OutputParameters> outputParameters) {
                this.outputParameters = outputParameters;
                return this;
            }

            /**
             * The scheduling parameters of the node.
             * <p>
             * 
             * This parameter corresponds to the Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console). For more information about the configurations of the scheduling parameters, see [Configure scheduling parameters](~~137548~~).
             */
            public Builder paraValue(String paraValue) {
                this.paraValue = paraValue;
                return this;
            }

            /**
             * Indicates whether the node that corresponds to the file can be rerun. Valid values:
             * <p>
             * 
             * *   ALL_ALLOWED: The node can be rerun regardless of whether it is successfully run or fails to run.
             * *   FAILURE_ALLOWED: The node can be rerun only after it fails to run.
             * *   ALL_DENIED: The node cannot be rerun regardless of whether it is successfully run or fails to run.
             * 
             * This parameter corresponds to the Rerun parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * The ID of the resource group that is used to run the node. You can call the [ListResourceGroups](~~173913~~) operation to query the available resource groups in the workspace.
             */
            public Builder resourceGroupId(Long resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The scheduling type of the node. Valid values:
             * <p>
             * 
             * *   NORMAL: The node is an auto triggered node.
             * *   MANUAL: The node is a manually triggered node. Manually triggered nodes cannot be automatically triggered. They correspond to the nodes in the Manually Triggered Workflows pane.
             * *   PAUSE: The node is a paused node.
             * *   SKIP: The node is a dry-run node. Dry-run nodes are started as scheduled but the system sets the status of the nodes to successful when it starts to run them.
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * The start time of automatic scheduling. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             * <p>
             * 
             * This parameter corresponds to the Validity Period parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder startEffectDate(Long startEffectDate) {
                this.startEffectDate = startEffectDate;
                return this;
            }

            /**
             * Indicates whether a node is immediately run after the node is deployed to the production environment.
             * <p>
             * 
             * This parameter is valid only for an EMR Spark Streaming node or an EMR Streaming SQL node. This parameter corresponds to the Start Method parameter in the Schedule section of the Configure tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder startImmediately(Boolean startImmediately) {
                this.startImmediately = startImmediately;
                return this;
            }

            /**
             * Indicates whether the scheduling for the node is suspended Valid values:
             * <p>
             * 
             * *   true: The scheduling for the node is suspended.
             * *   false: The scheduling for the node is not suspended.
             * 
             * This parameter corresponds to the Recurrence parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
             */
            public Builder stop(Boolean stop) {
                this.stop = stop;
                return this;
            }

            public NodeConfiguration build() {
                return new NodeConfiguration(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("File")
        private File file;

        @com.aliyun.core.annotation.NameInMap("NodeConfiguration")
        private NodeConfiguration nodeConfiguration;

        private Data(Builder builder) {
            this.file = builder.file;
            this.nodeConfiguration = builder.nodeConfiguration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return file
         */
        public File getFile() {
            return this.file;
        }

        /**
         * @return nodeConfiguration
         */
        public NodeConfiguration getNodeConfiguration() {
            return this.nodeConfiguration;
        }

        public static final class Builder {
            private File file; 
            private NodeConfiguration nodeConfiguration; 

            /**
             * The basic information about the file.
             */
            public Builder file(File file) {
                this.file = file;
                return this;
            }

            /**
             * The scheduling configurations of the file.
             */
            public Builder nodeConfiguration(NodeConfiguration nodeConfiguration) {
                this.nodeConfiguration = nodeConfiguration;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
