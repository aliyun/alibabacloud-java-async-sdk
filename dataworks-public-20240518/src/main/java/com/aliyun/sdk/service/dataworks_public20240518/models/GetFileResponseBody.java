// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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

        private Builder() {
        } 

        private Builder(GetFileResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * RequestId.
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

        public GetFileResponseBody build() {
            return new GetFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(File model) {
                this.advancedSettings = model.advancedSettings;
                this.autoParsing = model.autoParsing;
                this.bizId = model.bizId;
                this.businessId = model.businessId;
                this.commitStatus = model.commitStatus;
                this.connectionName = model.connectionName;
                this.content = model.content;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.currentVersion = model.currentVersion;
                this.deletedStatus = model.deletedStatus;
                this.fileDescription = model.fileDescription;
                this.fileFolderId = model.fileFolderId;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.isMaxCompute = model.isMaxCompute;
                this.lastEditTime = model.lastEditTime;
                this.lastEditUser = model.lastEditUser;
                this.nodeId = model.nodeId;
                this.owner = model.owner;
                this.parentId = model.parentId;
                this.useType = model.useType;
            } 

            /**
             * AdvancedSettings.
             */
            public Builder advancedSettings(String advancedSettings) {
                this.advancedSettings = advancedSettings;
                return this;
            }

            /**
             * AutoParsing.
             */
            public Builder autoParsing(Boolean autoParsing) {
                this.autoParsing = autoParsing;
                return this;
            }

            /**
             * BizId.
             */
            public Builder bizId(Long bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * BusinessId.
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * CommitStatus.
             */
            public Builder commitStatus(Integer commitStatus) {
                this.commitStatus = commitStatus;
                return this;
            }

            /**
             * ConnectionName.
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * CurrentVersion.
             */
            public Builder currentVersion(Integer currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * DeletedStatus.
             */
            public Builder deletedStatus(String deletedStatus) {
                this.deletedStatus = deletedStatus;
                return this;
            }

            /**
             * FileDescription.
             */
            public Builder fileDescription(String fileDescription) {
                this.fileDescription = fileDescription;
                return this;
            }

            /**
             * FileFolderId.
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
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * IsMaxCompute.
             */
            public Builder isMaxCompute(Boolean isMaxCompute) {
                this.isMaxCompute = isMaxCompute;
                return this;
            }

            /**
             * LastEditTime.
             */
            public Builder lastEditTime(Long lastEditTime) {
                this.lastEditTime = lastEditTime;
                return this;
            }

            /**
             * LastEditUser.
             */
            public Builder lastEditUser(String lastEditUser) {
                this.lastEditUser = lastEditUser;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * UseType.
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
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(InputList model) {
                this.input = model.input;
                this.parseType = model.parseType;
            } 

            /**
             * Input.
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * ParseType.
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
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(InputParameters model) {
                this.parameterName = model.parameterName;
                this.valueSource = model.valueSource;
            } 

            /**
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * ValueSource.
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
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(OutputList model) {
                this.output = model.output;
                this.refTableName = model.refTableName;
            } 

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * RefTableName.
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
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(OutputParameters model) {
                this.description = model.description;
                this.parameterName = model.parameterName;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("IgnoreParentSkipRunningProperty")
        private String ignoreParentSkipRunningProperty;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InputList")
        private java.util.List<InputList> inputList;

        @com.aliyun.core.annotation.NameInMap("InputParameters")
        private java.util.List<InputParameters> inputParameters;

        @com.aliyun.core.annotation.NameInMap("OutputList")
        private java.util.List<OutputList> outputList;

        @com.aliyun.core.annotation.NameInMap("OutputParameters")
        private java.util.List<OutputParameters> outputParameters;

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

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        private NodeConfiguration(Builder builder) {
            this.applyScheduleImmediately = builder.applyScheduleImmediately;
            this.autoRerunIntervalMillis = builder.autoRerunIntervalMillis;
            this.autoRerunTimes = builder.autoRerunTimes;
            this.cronExpress = builder.cronExpress;
            this.cycleType = builder.cycleType;
            this.dependentNodeIdList = builder.dependentNodeIdList;
            this.dependentType = builder.dependentType;
            this.endEffectDate = builder.endEffectDate;
            this.ignoreParentSkipRunningProperty = builder.ignoreParentSkipRunningProperty;
            this.imageId = builder.imageId;
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
            this.timeout = builder.timeout;
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
         * @return ignoreParentSkipRunningProperty
         */
        public String getIgnoreParentSkipRunningProperty() {
            return this.ignoreParentSkipRunningProperty;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return inputList
         */
        public java.util.List<InputList> getInputList() {
            return this.inputList;
        }

        /**
         * @return inputParameters
         */
        public java.util.List<InputParameters> getInputParameters() {
            return this.inputParameters;
        }

        /**
         * @return outputList
         */
        public java.util.List<OutputList> getOutputList() {
            return this.outputList;
        }

        /**
         * @return outputParameters
         */
        public java.util.List<OutputParameters> getOutputParameters() {
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

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
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
            private String ignoreParentSkipRunningProperty; 
            private String imageId; 
            private java.util.List<InputList> inputList; 
            private java.util.List<InputParameters> inputParameters; 
            private java.util.List<OutputList> outputList; 
            private java.util.List<OutputParameters> outputParameters; 
            private String paraValue; 
            private String rerunMode; 
            private Long resourceGroupId; 
            private String schedulerType; 
            private Long startEffectDate; 
            private Boolean startImmediately; 
            private Boolean stop; 
            private Integer timeout; 

            private Builder() {
            } 

            private Builder(NodeConfiguration model) {
                this.applyScheduleImmediately = model.applyScheduleImmediately;
                this.autoRerunIntervalMillis = model.autoRerunIntervalMillis;
                this.autoRerunTimes = model.autoRerunTimes;
                this.cronExpress = model.cronExpress;
                this.cycleType = model.cycleType;
                this.dependentNodeIdList = model.dependentNodeIdList;
                this.dependentType = model.dependentType;
                this.endEffectDate = model.endEffectDate;
                this.ignoreParentSkipRunningProperty = model.ignoreParentSkipRunningProperty;
                this.imageId = model.imageId;
                this.inputList = model.inputList;
                this.inputParameters = model.inputParameters;
                this.outputList = model.outputList;
                this.outputParameters = model.outputParameters;
                this.paraValue = model.paraValue;
                this.rerunMode = model.rerunMode;
                this.resourceGroupId = model.resourceGroupId;
                this.schedulerType = model.schedulerType;
                this.startEffectDate = model.startEffectDate;
                this.startImmediately = model.startImmediately;
                this.stop = model.stop;
                this.timeout = model.timeout;
            } 

            /**
             * ApplyScheduleImmediately.
             */
            public Builder applyScheduleImmediately(String applyScheduleImmediately) {
                this.applyScheduleImmediately = applyScheduleImmediately;
                return this;
            }

            /**
             * AutoRerunIntervalMillis.
             */
            public Builder autoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
                this.autoRerunIntervalMillis = autoRerunIntervalMillis;
                return this;
            }

            /**
             * AutoRerunTimes.
             */
            public Builder autoRerunTimes(Integer autoRerunTimes) {
                this.autoRerunTimes = autoRerunTimes;
                return this;
            }

            /**
             * CronExpress.
             */
            public Builder cronExpress(String cronExpress) {
                this.cronExpress = cronExpress;
                return this;
            }

            /**
             * CycleType.
             */
            public Builder cycleType(String cycleType) {
                this.cycleType = cycleType;
                return this;
            }

            /**
             * DependentNodeIdList.
             */
            public Builder dependentNodeIdList(String dependentNodeIdList) {
                this.dependentNodeIdList = dependentNodeIdList;
                return this;
            }

            /**
             * DependentType.
             */
            public Builder dependentType(String dependentType) {
                this.dependentType = dependentType;
                return this;
            }

            /**
             * EndEffectDate.
             */
            public Builder endEffectDate(Long endEffectDate) {
                this.endEffectDate = endEffectDate;
                return this;
            }

            /**
             * IgnoreParentSkipRunningProperty.
             */
            public Builder ignoreParentSkipRunningProperty(String ignoreParentSkipRunningProperty) {
                this.ignoreParentSkipRunningProperty = ignoreParentSkipRunningProperty;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InputList.
             */
            public Builder inputList(java.util.List<InputList> inputList) {
                this.inputList = inputList;
                return this;
            }

            /**
             * InputParameters.
             */
            public Builder inputParameters(java.util.List<InputParameters> inputParameters) {
                this.inputParameters = inputParameters;
                return this;
            }

            /**
             * OutputList.
             */
            public Builder outputList(java.util.List<OutputList> outputList) {
                this.outputList = outputList;
                return this;
            }

            /**
             * OutputParameters.
             */
            public Builder outputParameters(java.util.List<OutputParameters> outputParameters) {
                this.outputParameters = outputParameters;
                return this;
            }

            /**
             * ParaValue.
             */
            public Builder paraValue(String paraValue) {
                this.paraValue = paraValue;
                return this;
            }

            /**
             * RerunMode.
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(Long resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SchedulerType.
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * StartEffectDate.
             */
            public Builder startEffectDate(Long startEffectDate) {
                this.startEffectDate = startEffectDate;
                return this;
            }

            /**
             * StartImmediately.
             */
            public Builder startImmediately(Boolean startImmediately) {
                this.startImmediately = startImmediately;
                return this;
            }

            /**
             * Stop.
             */
            public Builder stop(Boolean stop) {
                this.stop = stop;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            public NodeConfiguration build() {
                return new NodeConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
    public static class ResourceDownloadLink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("downloadLink")
        private String downloadLink;

        private ResourceDownloadLink(Builder builder) {
            this.downloadLink = builder.downloadLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDownloadLink create() {
            return builder().build();
        }

        /**
         * @return downloadLink
         */
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public static final class Builder {
            private String downloadLink; 

            private Builder() {
            } 

            private Builder(ResourceDownloadLink model) {
                this.downloadLink = model.downloadLink;
            } 

            /**
             * downloadLink.
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            public ResourceDownloadLink build() {
                return new ResourceDownloadLink(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("File")
        private File file;

        @com.aliyun.core.annotation.NameInMap("NodeConfiguration")
        private NodeConfiguration nodeConfiguration;

        @com.aliyun.core.annotation.NameInMap("ResourceDownloadLink")
        private ResourceDownloadLink resourceDownloadLink;

        private Data(Builder builder) {
            this.file = builder.file;
            this.nodeConfiguration = builder.nodeConfiguration;
            this.resourceDownloadLink = builder.resourceDownloadLink;
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

        /**
         * @return resourceDownloadLink
         */
        public ResourceDownloadLink getResourceDownloadLink() {
            return this.resourceDownloadLink;
        }

        public static final class Builder {
            private File file; 
            private NodeConfiguration nodeConfiguration; 
            private ResourceDownloadLink resourceDownloadLink; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.file = model.file;
                this.nodeConfiguration = model.nodeConfiguration;
                this.resourceDownloadLink = model.resourceDownloadLink;
            } 

            /**
             * File.
             */
            public Builder file(File file) {
                this.file = file;
                return this;
            }

            /**
             * NodeConfiguration.
             */
            public Builder nodeConfiguration(NodeConfiguration nodeConfiguration) {
                this.nodeConfiguration = nodeConfiguration;
                return this;
            }

            /**
             * ResourceDownloadLink.
             */
            public Builder resourceDownloadLink(ResourceDownloadLink resourceDownloadLink) {
                this.resourceDownloadLink = resourceDownloadLink;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
