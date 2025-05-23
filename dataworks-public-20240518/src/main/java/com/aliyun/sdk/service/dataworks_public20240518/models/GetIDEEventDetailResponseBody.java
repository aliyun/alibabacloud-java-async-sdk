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
 * {@link GetIDEEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetIDEEventDetailResponseBody</p>
 */
public class GetIDEEventDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventDetail")
    private EventDetail eventDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIDEEventDetailResponseBody(Builder builder) {
        this.eventDetail = builder.eventDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIDEEventDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventDetail
     */
    public EventDetail getEventDetail() {
        return this.eventDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EventDetail eventDetail; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIDEEventDetailResponseBody model) {
            this.eventDetail = model.eventDetail;
            this.requestId = model.requestId;
        } 

        /**
         * EventDetail.
         */
        public Builder eventDetail(EventDetail eventDetail) {
            this.eventDetail = eventDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIDEEventDetailResponseBody build() {
            return new GetIDEEventDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIDEEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetIDEEventDetailResponseBody</p>
     */
    public static class FilePropertyContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private Long businessId;

        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private Long currentVersion;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ParentFileId")
        private Long parentFileId;

        private FilePropertyContent(Builder builder) {
            this.businessId = builder.businessId;
            this.currentVersion = builder.currentVersion;
            this.dataSourceName = builder.dataSourceName;
            this.folderId = builder.folderId;
            this.owner = builder.owner;
            this.parentFileId = builder.parentFileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilePropertyContent create() {
            return builder().build();
        }

        /**
         * @return businessId
         */
        public Long getBusinessId() {
            return this.businessId;
        }

        /**
         * @return currentVersion
         */
        public Long getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return parentFileId
         */
        public Long getParentFileId() {
            return this.parentFileId;
        }

        public static final class Builder {
            private Long businessId; 
            private Long currentVersion; 
            private String dataSourceName; 
            private String folderId; 
            private String owner; 
            private Long parentFileId; 

            private Builder() {
            } 

            private Builder(FilePropertyContent model) {
                this.businessId = model.businessId;
                this.currentVersion = model.currentVersion;
                this.dataSourceName = model.dataSourceName;
                this.folderId = model.folderId;
                this.owner = model.owner;
                this.parentFileId = model.parentFileId;
            } 

            /**
             * BusinessId.
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * CurrentVersion.
             */
            public Builder currentVersion(Long currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * DataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * FolderId.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
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
             * ParentFileId.
             */
            public Builder parentFileId(Long parentFileId) {
                this.parentFileId = parentFileId;
                return this;
            }

            public FilePropertyContent build() {
                return new FilePropertyContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIDEEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetIDEEventDetailResponseBody</p>
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
     * {@link GetIDEEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetIDEEventDetailResponseBody</p>
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
     * {@link GetIDEEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetIDEEventDetailResponseBody</p>
     */
    public static class NodeConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRerunIntervalMillis")
        private Long autoRerunIntervalMillis;

        @com.aliyun.core.annotation.NameInMap("AutoRerunTimes")
        private Long autoRerunTimes;

        @com.aliyun.core.annotation.NameInMap("CronExpress")
        private String cronExpress;

        @com.aliyun.core.annotation.NameInMap("CycleType")
        private String cycleType;

        @com.aliyun.core.annotation.NameInMap("DependentNodeIdList")
        private String dependentNodeIdList;

        @com.aliyun.core.annotation.NameInMap("DependentType")
        private String dependentType;

        @com.aliyun.core.annotation.NameInMap("InputList")
        private java.util.List<InputList> inputList;

        @com.aliyun.core.annotation.NameInMap("OutputList")
        private java.util.List<OutputList> outputList;

        @com.aliyun.core.annotation.NameInMap("ParaValue")
        private String paraValue;

        @com.aliyun.core.annotation.NameInMap("RerunMode")
        private String rerunMode;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private Long resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SchedulerType")
        private String schedulerType;

        private NodeConfiguration(Builder builder) {
            this.autoRerunIntervalMillis = builder.autoRerunIntervalMillis;
            this.autoRerunTimes = builder.autoRerunTimes;
            this.cronExpress = builder.cronExpress;
            this.cycleType = builder.cycleType;
            this.dependentNodeIdList = builder.dependentNodeIdList;
            this.dependentType = builder.dependentType;
            this.inputList = builder.inputList;
            this.outputList = builder.outputList;
            this.paraValue = builder.paraValue;
            this.rerunMode = builder.rerunMode;
            this.resourceGroupId = builder.resourceGroupId;
            this.schedulerType = builder.schedulerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeConfiguration create() {
            return builder().build();
        }

        /**
         * @return autoRerunIntervalMillis
         */
        public Long getAutoRerunIntervalMillis() {
            return this.autoRerunIntervalMillis;
        }

        /**
         * @return autoRerunTimes
         */
        public Long getAutoRerunTimes() {
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
         * @return inputList
         */
        public java.util.List<InputList> getInputList() {
            return this.inputList;
        }

        /**
         * @return outputList
         */
        public java.util.List<OutputList> getOutputList() {
            return this.outputList;
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

        public static final class Builder {
            private Long autoRerunIntervalMillis; 
            private Long autoRerunTimes; 
            private String cronExpress; 
            private String cycleType; 
            private String dependentNodeIdList; 
            private String dependentType; 
            private java.util.List<InputList> inputList; 
            private java.util.List<OutputList> outputList; 
            private String paraValue; 
            private String rerunMode; 
            private Long resourceGroupId; 
            private String schedulerType; 

            private Builder() {
            } 

            private Builder(NodeConfiguration model) {
                this.autoRerunIntervalMillis = model.autoRerunIntervalMillis;
                this.autoRerunTimes = model.autoRerunTimes;
                this.cronExpress = model.cronExpress;
                this.cycleType = model.cycleType;
                this.dependentNodeIdList = model.dependentNodeIdList;
                this.dependentType = model.dependentType;
                this.inputList = model.inputList;
                this.outputList = model.outputList;
                this.paraValue = model.paraValue;
                this.rerunMode = model.rerunMode;
                this.resourceGroupId = model.resourceGroupId;
                this.schedulerType = model.schedulerType;
            } 

            /**
             * AutoRerunIntervalMillis.
             */
            public Builder autoRerunIntervalMillis(Long autoRerunIntervalMillis) {
                this.autoRerunIntervalMillis = autoRerunIntervalMillis;
                return this;
            }

            /**
             * AutoRerunTimes.
             */
            public Builder autoRerunTimes(Long autoRerunTimes) {
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
             * InputList.
             */
            public Builder inputList(java.util.List<InputList> inputList) {
                this.inputList = inputList;
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

            public NodeConfiguration build() {
                return new NodeConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIDEEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetIDEEventDetailResponseBody</p>
     */
    public static class CommittedFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private String changeType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Committor")
        private String committor;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FilePropertyContent")
        private FilePropertyContent filePropertyContent;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Long fileType;

        @com.aliyun.core.annotation.NameInMap("NodeConfiguration")
        private NodeConfiguration nodeConfiguration;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("UseType")
        private String useType;

        private CommittedFile(Builder builder) {
            this.changeType = builder.changeType;
            this.comment = builder.comment;
            this.committor = builder.committor;
            this.content = builder.content;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.filePropertyContent = builder.filePropertyContent;
            this.fileType = builder.fileType;
            this.nodeConfiguration = builder.nodeConfiguration;
            this.nodeId = builder.nodeId;
            this.useType = builder.useType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommittedFile create() {
            return builder().build();
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return committor
         */
        public String getCommittor() {
            return this.committor;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
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
         * @return filePropertyContent
         */
        public FilePropertyContent getFilePropertyContent() {
            return this.filePropertyContent;
        }

        /**
         * @return fileType
         */
        public Long getFileType() {
            return this.fileType;
        }

        /**
         * @return nodeConfiguration
         */
        public NodeConfiguration getNodeConfiguration() {
            return this.nodeConfiguration;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return useType
         */
        public String getUseType() {
            return this.useType;
        }

        public static final class Builder {
            private String changeType; 
            private String comment; 
            private String committor; 
            private String content; 
            private Long fileId; 
            private String fileName; 
            private FilePropertyContent filePropertyContent; 
            private Long fileType; 
            private NodeConfiguration nodeConfiguration; 
            private Long nodeId; 
            private String useType; 

            private Builder() {
            } 

            private Builder(CommittedFile model) {
                this.changeType = model.changeType;
                this.comment = model.comment;
                this.committor = model.committor;
                this.content = model.content;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.filePropertyContent = model.filePropertyContent;
                this.fileType = model.fileType;
                this.nodeConfiguration = model.nodeConfiguration;
                this.nodeId = model.nodeId;
                this.useType = model.useType;
            } 

            /**
             * ChangeType.
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Committor.
             */
            public Builder committor(String committor) {
                this.committor = committor;
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
             * FilePropertyContent.
             */
            public Builder filePropertyContent(FilePropertyContent filePropertyContent) {
                this.filePropertyContent = filePropertyContent;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(Long fileType) {
                this.fileType = fileType;
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
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * UseType.
             */
            public Builder useType(String useType) {
                this.useType = useType;
                return this;
            }

            public CommittedFile build() {
                return new CommittedFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIDEEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetIDEEventDetailResponseBody</p>
     */
    public static class DeletedFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private Long businessId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private Long currentVersion;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Long fileType;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ParentFileId")
        private Long parentFileId;

        @com.aliyun.core.annotation.NameInMap("UseType")
        private String useType;

        private DeletedFile(Builder builder) {
            this.businessId = builder.businessId;
            this.content = builder.content;
            this.currentVersion = builder.currentVersion;
            this.dataSourceName = builder.dataSourceName;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.folderId = builder.folderId;
            this.nodeId = builder.nodeId;
            this.owner = builder.owner;
            this.parentFileId = builder.parentFileId;
            this.useType = builder.useType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeletedFile create() {
            return builder().build();
        }

        /**
         * @return businessId
         */
        public Long getBusinessId() {
            return this.businessId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return currentVersion
         */
        public Long getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
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
        public Long getFileType() {
            return this.fileType;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
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
         * @return parentFileId
         */
        public Long getParentFileId() {
            return this.parentFileId;
        }

        /**
         * @return useType
         */
        public String getUseType() {
            return this.useType;
        }

        public static final class Builder {
            private Long businessId; 
            private String content; 
            private Long currentVersion; 
            private String dataSourceName; 
            private Long fileId; 
            private String fileName; 
            private Long fileType; 
            private String folderId; 
            private Long nodeId; 
            private String owner; 
            private Long parentFileId; 
            private String useType; 

            private Builder() {
            } 

            private Builder(DeletedFile model) {
                this.businessId = model.businessId;
                this.content = model.content;
                this.currentVersion = model.currentVersion;
                this.dataSourceName = model.dataSourceName;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.folderId = model.folderId;
                this.nodeId = model.nodeId;
                this.owner = model.owner;
                this.parentFileId = model.parentFileId;
                this.useType = model.useType;
            } 

            /**
             * BusinessId.
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
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
             * CurrentVersion.
             */
            public Builder currentVersion(Long currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * DataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
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
            public Builder fileType(Long fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * FolderId.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
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
             * ParentFileId.
             */
            public Builder parentFileId(Long parentFileId) {
                this.parentFileId = parentFileId;
                return this;
            }

            /**
             * UseType.
             */
            public Builder useType(String useType) {
                this.useType = useType;
                return this;
            }

            public DeletedFile build() {
                return new DeletedFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIDEEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetIDEEventDetailResponseBody</p>
     */
    public static class FileExecutionCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Long fileType;

        private FileExecutionCommand(Builder builder) {
            this.content = builder.content;
            this.dataSourceName = builder.dataSourceName;
            this.fileId = builder.fileId;
            this.fileType = builder.fileType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileExecutionCommand create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return fileType
         */
        public Long getFileType() {
            return this.fileType;
        }

        public static final class Builder {
            private String content; 
            private String dataSourceName; 
            private Long fileId; 
            private Long fileType; 

            private Builder() {
            } 

            private Builder(FileExecutionCommand model) {
                this.content = model.content;
                this.dataSourceName = model.dataSourceName;
                this.fileId = model.fileId;
                this.fileType = model.fileType;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
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
             * FileType.
             */
            public Builder fileType(Long fileType) {
                this.fileType = fileType;
                return this;
            }

            public FileExecutionCommand build() {
                return new FileExecutionCommand(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIDEEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetIDEEventDetailResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("IsPartitionColumn")
        private Boolean isPartitionColumn;

        private Columns(Builder builder) {
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.comment = builder.comment;
            this.isPartitionColumn = builder.isPartitionColumn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return isPartitionColumn
         */
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

        public static final class Builder {
            private String columnName; 
            private String columnType; 
            private String comment; 
            private Boolean isPartitionColumn; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.columnName = model.columnName;
                this.columnType = model.columnType;
                this.comment = model.comment;
                this.isPartitionColumn = model.isPartitionColumn;
            } 

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * ColumnType.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * IsPartitionColumn.
             */
            public Builder isPartitionColumn(Boolean isPartitionColumn) {
                this.isPartitionColumn = isPartitionColumn;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIDEEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetIDEEventDetailResponseBody</p>
     */
    public static class TableModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<Columns> columns;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("LifeCycle")
        private Long lifeCycle;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private TableModel(Builder builder) {
            this.columns = builder.columns;
            this.comment = builder.comment;
            this.dataSourceName = builder.dataSourceName;
            this.env = builder.env;
            this.lifeCycle = builder.lifeCycle;
            this.location = builder.location;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableModel create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<Columns> getColumns() {
            return this.columns;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return lifeCycle
         */
        public Long getLifeCycle() {
            return this.lifeCycle;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List<Columns> columns; 
            private String comment; 
            private String dataSourceName; 
            private String env; 
            private Long lifeCycle; 
            private String location; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(TableModel model) {
                this.columns = model.columns;
                this.comment = model.comment;
                this.dataSourceName = model.dataSourceName;
                this.env = model.env;
                this.lifeCycle = model.lifeCycle;
                this.location = model.location;
                this.tableName = model.tableName;
            } 

            /**
             * Columns.
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * DataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * LifeCycle.
             */
            public Builder lifeCycle(Long lifeCycle) {
                this.lifeCycle = lifeCycle;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableModel build() {
                return new TableModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIDEEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetIDEEventDetailResponseBody</p>
     */
    public static class EventDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommittedFile")
        private CommittedFile committedFile;

        @com.aliyun.core.annotation.NameInMap("DeletedFile")
        private DeletedFile deletedFile;

        @com.aliyun.core.annotation.NameInMap("FileExecutionCommand")
        private FileExecutionCommand fileExecutionCommand;

        @com.aliyun.core.annotation.NameInMap("TableModel")
        private TableModel tableModel;

        private EventDetail(Builder builder) {
            this.committedFile = builder.committedFile;
            this.deletedFile = builder.deletedFile;
            this.fileExecutionCommand = builder.fileExecutionCommand;
            this.tableModel = builder.tableModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventDetail create() {
            return builder().build();
        }

        /**
         * @return committedFile
         */
        public CommittedFile getCommittedFile() {
            return this.committedFile;
        }

        /**
         * @return deletedFile
         */
        public DeletedFile getDeletedFile() {
            return this.deletedFile;
        }

        /**
         * @return fileExecutionCommand
         */
        public FileExecutionCommand getFileExecutionCommand() {
            return this.fileExecutionCommand;
        }

        /**
         * @return tableModel
         */
        public TableModel getTableModel() {
            return this.tableModel;
        }

        public static final class Builder {
            private CommittedFile committedFile; 
            private DeletedFile deletedFile; 
            private FileExecutionCommand fileExecutionCommand; 
            private TableModel tableModel; 

            private Builder() {
            } 

            private Builder(EventDetail model) {
                this.committedFile = model.committedFile;
                this.deletedFile = model.deletedFile;
                this.fileExecutionCommand = model.fileExecutionCommand;
                this.tableModel = model.tableModel;
            } 

            /**
             * CommittedFile.
             */
            public Builder committedFile(CommittedFile committedFile) {
                this.committedFile = committedFile;
                return this;
            }

            /**
             * DeletedFile.
             */
            public Builder deletedFile(DeletedFile deletedFile) {
                this.deletedFile = deletedFile;
                return this;
            }

            /**
             * FileExecutionCommand.
             */
            public Builder fileExecutionCommand(FileExecutionCommand fileExecutionCommand) {
                this.fileExecutionCommand = fileExecutionCommand;
                return this;
            }

            /**
             * TableModel.
             */
            public Builder tableModel(TableModel tableModel) {
                this.tableModel = tableModel;
                return this;
            }

            public EventDetail build() {
                return new EventDetail(this);
            } 

        } 

    }
}
