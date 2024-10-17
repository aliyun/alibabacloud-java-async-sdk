// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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

        /**
         * <p>The data snapshot that is generated when an extension point event is triggered.</p>
         * <p>The fields contained in data snapshots vary based on the types of the triggered extension point events. For more information, see the description of the fields.</p>
         */
        public Builder eventDetail(EventDetail eventDetail) {
            this.eventDetail = eventDetail;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
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

            /**
             * <p>The ID of the workflow to which the file belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>74328</p>
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * <p>The latest version number of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentVersion(Long currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The name of the data source with which the file is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_first</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The ID of the folder to which the file belongs. You can call the <a href="https://help.aliyun.com/document_detail/173952.html">GetFolder</a> operation to query the details of the file based on the folder ID.</p>
             * 
             * <strong>example:</strong>
             * <p>aldurie78l2falure</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The file owner.</p>
             * 
             * <strong>example:</strong>
             * <p>7384234****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the do-while node or for-each node that corresponds to the file.</p>
             * 
             * <strong>example:</strong>
             * <p>1234122</p>
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

            /**
             * <p>The output name of the parent file on which the current file depends.</p>
             * <p>This parameter corresponds to the Output Name of Ancestor Node parameter under Parent Nodes in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>dw_project_root</p>
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The mode of the configuration file dependency. Valid values:</p>
             * <ul>
             * <li>MANUAL: Scheduling dependencies are manually configured.</li>
             * <li>AUTO: Scheduling dependencies are automatically parsed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MANUAL</p>
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

            /**
             * <p>The output name of the current file.</p>
             * <p>This parameter corresponds to the Output Name parameter under Output Name of Current Node in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>dw_project.002_out</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The output table name of the current file.</p>
             * <p>This parameter corresponds to the Output Table Name parameter under Output Name of Current Node in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ods_user_info_d</p>
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
        private java.util.List < InputList> inputList;

        @com.aliyun.core.annotation.NameInMap("OutputList")
        private java.util.List < OutputList> outputList;

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
        public java.util.List < InputList> getInputList() {
            return this.inputList;
        }

        /**
         * @return outputList
         */
        public java.util.List < OutputList> getOutputList() {
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
            private java.util.List < InputList> inputList; 
            private java.util.List < OutputList> outputList; 
            private String paraValue; 
            private String rerunMode; 
            private Long resourceGroupId; 
            private String schedulerType; 

            /**
             * <p>The interval at which the node corresponding to the file is rerun. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120000</p>
             */
            public Builder autoRerunIntervalMillis(Long autoRerunIntervalMillis) {
                this.autoRerunIntervalMillis = autoRerunIntervalMillis;
                return this;
            }

            /**
             * <p>The number of times that the node corresponding to the file can be rerun.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder autoRerunTimes(Long autoRerunTimes) {
                this.autoRerunTimes = autoRerunTimes;
                return this;
            }

            /**
             * <p>The CRON expression that is used to schedule the node corresponding to the file.</p>
             * 
             * <strong>example:</strong>
             * <p>00 05 00 * * ?</p>
             */
            public Builder cronExpress(String cronExpress) {
                this.cronExpress = cronExpress;
                return this;
            }

            /**
             * <p>The type of the scheduling cycle of the node that corresponds to the file. Valid values: NOT_DAY and DAY. The value NOT_DAY indicates that the node is scheduled to run by minute or hour. The value DAY indicates that the node is scheduled to run by day, week, or month.</p>
             * <p>This parameter corresponds to the Scheduling Cycle parameter in the Schedule section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>DAY</p>
             */
            public Builder cycleType(String cycleType) {
                this.cycleType = cycleType;
                return this;
            }

            /**
             * <p>The ID of the node on which the node that corresponds to the file depends when the DependentType parameter is set to USER_DEFINE. Multiple IDs are separated by commas (,).</p>
             * <p>The value of this parameter is equivalent to the ID of the node that you specified after you select Other Nodes for Cross-Cycle Dependency (Original Previous-Cycle Dependency) in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>5,10,15,20</p>
             */
            public Builder dependentNodeIdList(String dependentNodeIdList) {
                this.dependentNodeIdList = dependentNodeIdList;
                return this;
            }

            /**
             * <p>The type of the cross-cycle scheduling dependency of the node. Valid values:</p>
             * <ul>
             * <li>SELF: The instance generated for the node in the current cycle depends on the instance generated for the node in the previous cycle.</li>
             * <li>CHILD: The instance generated for the node in the current cycle depends on the instances generated for the descendant nodes at the nearest level of the node in the previous cycle.</li>
             * <li>USER_DEFINE: The instance generated for the node in the current cycle depends on the instances generated for one or more specified nodes in the previous cycle.</li>
             * <li>NONE: No cross-cycle scheduling dependency type is selected for the node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USER_DEFINE</p>
             */
            public Builder dependentType(String dependentType) {
                this.dependentType = dependentType;
                return this;
            }

            /**
             * <p>The output names of the parent files on which the current file depends.</p>
             */
            public Builder inputList(java.util.List < InputList> inputList) {
                this.inputList = inputList;
                return this;
            }

            /**
             * <p>The output names of the current file.</p>
             * <p>This parameter corresponds to the Output Name of Current Node parameter in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             */
            public Builder outputList(java.util.List < OutputList> outputList) {
                this.outputList = outputList;
                return this;
            }

            /**
             * <p>The scheduling parameters of the node.</p>
             * <p>This parameter corresponds to the Scheduling Parameter section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. For more information about the configurations of the scheduling parameters, see <a href="https://help.aliyun.com/document_detail/137548.html">Configure scheduling parameters</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>a=x b=y</p>
             */
            public Builder paraValue(String paraValue) {
                this.paraValue = paraValue;
                return this;
            }

            /**
             * <p>Indicates whether the node that corresponds to the file can be rerun. Valid values:</p>
             * <ul>
             * <li>ALL_ALLOWED: The node can be rerun regardless of whether it is successfully run or fails to run.</li>
             * <li>FAILURE_ALLOWED: The node can be rerun only after it fails to run.</li>
             * <li>ALL_DENIED: The node cannot be rerun regardless of whether it is successfully run or fails to run.</li>
             * </ul>
             * <p>This parameter corresponds to the Rerun parameter in the Schedule section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL_ALLOWED</p>
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * <p>The ID of the resource group that is used to run the node that corresponds to the file. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to query the available resource groups in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>375827434852437</p>
             */
            public Builder resourceGroupId(Long resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The scheduling type of the node. Valid values:</p>
             * <ul>
             * <li>NORMAL: The node is an auto triggered node.</li>
             * <li>MANUAL: The node is a manually triggered node. Manually triggered nodes cannot be automatically triggered. They correspond to the nodes in the Manually Triggered Workflows pane.</li>
             * <li>PAUSE: The node is a paused node.</li>
             * <li>SKIP: The node is a dry-run node. Dry-run nodes are started as scheduled, but the system sets the status of the nodes to successful when it starts to run them.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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

            /**
             * <p>The type of the change to the file of the current version. Valid values: CREATE, UPDATE, and DELETE.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>The description of the file version.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to generate the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>7384234****</p>
             */
            public Builder committor(String committor) {
                this.committor = committor;
                return this;
            }

            /**
             * <p>The code in the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>SHOW TABLES;</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234123</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>hello_dataworks.sql</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The details of the file.</p>
             */
            public Builder filePropertyContent(FilePropertyContent filePropertyContent) {
                this.filePropertyContent = filePropertyContent;
                return this;
            }

            /**
             * <p>The type of the code for the file. Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder fileType(Long fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The scheduling properties of the node that corresponds to the file.</p>
             */
            public Builder nodeConfiguration(NodeConfiguration nodeConfiguration) {
                this.nodeConfiguration = nodeConfiguration;
                return this;
            }

            /**
             * <p>The ID of the node that is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>421429</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The module to which the file belongs. Valid values:</p>
             * <ul>
             * <li>NORMAL: The file is used for DataStudio.</li>
             * <li>MANUAL: The file is used for a manually triggered node.</li>
             * <li>MANUAL_BIZ: The file is used for a manually triggered workflow.</li>
             * <li>SKIP: The file is used for a dry-run DataStudio node.</li>
             * <li>ADHOCQUERY: The file is used for an ad hoc query.</li>
             * <li>COMPONENT: The file is used for a snippet.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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

            /**
             * <p>The ID of the workflow to which the file belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>74328</p>
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * <p>The code in the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>SHOW TABLES;</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The latest version number of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentVersion(Long currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The name of the data source with which the file is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_first</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234123</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>hello_dataworks.sql</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The type of the code for the file. Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder fileType(Long fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The ID of the folder to which the file belongs. You can call the <a href="https://help.aliyun.com/document_detail/173952.html">GetFolder</a> operation to query the details of the file based on the folder ID.</p>
             * 
             * <strong>example:</strong>
             * <p>aldurie78l2falure</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The ID of the node that is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>421429</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The file owner.</p>
             * 
             * <strong>example:</strong>
             * <p>7384234****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the do-while node or for-each node that corresponds to the file.</p>
             * 
             * <strong>example:</strong>
             * <p>1234122</p>
             */
            public Builder parentFileId(Long parentFileId) {
                this.parentFileId = parentFileId;
                return this;
            }

            /**
             * <p>The module to which the file belongs. Valid values:</p>
             * <ul>
             * <li>NORMAL: The file is used for DataStudio.</li>
             * <li>MANUAL: The file is used for a manually triggered node.</li>
             * <li>MANUAL_BIZ: The file is used for a manually triggered workflow.</li>
             * <li>SKIP: The file is used for a dry-run DataStudio node.</li>
             * <li>ADHOCQUERY: The file is used for an ad hoc query.</li>
             * <li>COMPONENT: The file is used for a snippet.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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

            /**
             * <p>The code in the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>SHOW TABLES;</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The name of the data source with which the file is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_first</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234123</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The type of the code for the file. The code for files varies based on the file type. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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

            /**
             * <p>The name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>ID</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The data type of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>BIGINT</p>
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * <p>The remarks of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>ID</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Indicates whether the column is a partition key column. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
        private java.util.List < Columns> columns;

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
        public java.util.List < Columns> getColumns() {
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
            private java.util.List < Columns> columns; 
            private String comment; 
            private String dataSourceName; 
            private String env; 
            private Long lifeCycle; 
            private String location; 
            private String tableName; 

            /**
             * <p>The columns in the table.</p>
             */
            public Builder columns(java.util.List < Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The remarks of the table.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The name of the data source to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_first</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The environment in which the table is used. Valid values:</p>
             * <ul>
             * <li>DEV</li>
             * <li>PROD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The lifecycle of the metatable. Unit: day.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder lifeCycle(Long lifeCycle) {
                this.lifeCycle = lifeCycle;
                return this;
            }

            /**
             * <p>The path of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>hdfs://path/to/object</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>tb_hello</p>
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

            /**
             * <p>The data snapshot when the file is committed and deployed.</p>
             * <p>This parameter is valid only if the message type is IDE_FILE_SUBMIT_BEFORE or IDE_FILE_DEPLOY_BEFORE.</p>
             */
            public Builder committedFile(CommittedFile committedFile) {
                this.committedFile = committedFile;
                return this;
            }

            /**
             * <p>The data snapshot when the file is deleted. This parameter is valid only if the message type is IDE_FILE_DELETE_BEFORE.</p>
             */
            public Builder deletedFile(DeletedFile deletedFile) {
                this.deletedFile = deletedFile;
                return this;
            }

            /**
             * <p>The data snapshot when the code in the file is run. This parameter is valid only if the message type is IDE_FILE_EXECUTE_BEFORE.</p>
             */
            public Builder fileExecutionCommand(FileExecutionCommand fileExecutionCommand) {
                this.fileExecutionCommand = fileExecutionCommand;
                return this;
            }

            /**
             * <p>The data snapshot when the table is committed and deployed. This parameter is valid only if the message type is IDE_TABLE_SUBMIT_BEFORE or IDE_TABLE_DEPLOY_BEFORE.</p>
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
