// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link UpdateFileRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileRequest</p>
 */
public class UpdateFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdvancedSettings")
    private String advancedSettings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplyScheduleImmediately")
    private Boolean applyScheduleImmediately;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoParsing")
    private Boolean autoParsing;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRerunIntervalMillis")
    private Integer autoRerunIntervalMillis;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRerunTimes")
    private Integer autoRerunTimes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    private String connectionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CronExpress")
    private String cronExpress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CycleType")
    private String cycleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DependentNodeIdList")
    private String dependentNodeIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DependentType")
    private String dependentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndEffectDate")
    private Long endEffectDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileDescription")
    @com.aliyun.core.annotation.Validation(maxLength = 200)
    private String fileDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileFolderPath")
    private String fileFolderPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IgnoreParentSkipRunningProperty")
    private Boolean ignoreParentSkipRunningProperty;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputList")
    private String inputList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputParameters")
    private String inputParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutputList")
    private String outputList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutputParameters")
    private String outputParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParaValue")
    private String paraValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RerunMode")
    private String rerunMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIdentifier")
    private String resourceGroupIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchedulerType")
    private String schedulerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartEffectDate")
    private Long startEffectDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartImmediately")
    private Boolean startImmediately;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Stop")
    private Boolean stop;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    private UpdateFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.advancedSettings = builder.advancedSettings;
        this.applyScheduleImmediately = builder.applyScheduleImmediately;
        this.autoParsing = builder.autoParsing;
        this.autoRerunIntervalMillis = builder.autoRerunIntervalMillis;
        this.autoRerunTimes = builder.autoRerunTimes;
        this.connectionName = builder.connectionName;
        this.content = builder.content;
        this.cronExpress = builder.cronExpress;
        this.cycleType = builder.cycleType;
        this.dependentNodeIdList = builder.dependentNodeIdList;
        this.dependentType = builder.dependentType;
        this.endEffectDate = builder.endEffectDate;
        this.fileDescription = builder.fileDescription;
        this.fileFolderPath = builder.fileFolderPath;
        this.fileId = builder.fileId;
        this.fileName = builder.fileName;
        this.ignoreParentSkipRunningProperty = builder.ignoreParentSkipRunningProperty;
        this.imageId = builder.imageId;
        this.inputList = builder.inputList;
        this.inputParameters = builder.inputParameters;
        this.outputList = builder.outputList;
        this.outputParameters = builder.outputParameters;
        this.owner = builder.owner;
        this.paraValue = builder.paraValue;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.rerunMode = builder.rerunMode;
        this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
        this.schedulerType = builder.schedulerType;
        this.startEffectDate = builder.startEffectDate;
        this.startImmediately = builder.startImmediately;
        this.stop = builder.stop;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return advancedSettings
     */
    public String getAdvancedSettings() {
        return this.advancedSettings;
    }

    /**
     * @return applyScheduleImmediately
     */
    public Boolean getApplyScheduleImmediately() {
        return this.applyScheduleImmediately;
    }

    /**
     * @return autoParsing
     */
    public Boolean getAutoParsing() {
        return this.autoParsing;
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
     * @return fileDescription
     */
    public String getFileDescription() {
        return this.fileDescription;
    }

    /**
     * @return fileFolderPath
     */
    public String getFileFolderPath() {
        return this.fileFolderPath;
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
     * @return ignoreParentSkipRunningProperty
     */
    public Boolean getIgnoreParentSkipRunningProperty() {
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
    public String getInputList() {
        return this.inputList;
    }

    /**
     * @return inputParameters
     */
    public String getInputParameters() {
        return this.inputParameters;
    }

    /**
     * @return outputList
     */
    public String getOutputList() {
        return this.outputList;
    }

    /**
     * @return outputParameters
     */
    public String getOutputParameters() {
        return this.outputParameters;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return paraValue
     */
    public String getParaValue() {
        return this.paraValue;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectIdentifier
     */
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * @return rerunMode
     */
    public String getRerunMode() {
        return this.rerunMode;
    }

    /**
     * @return resourceGroupIdentifier
     */
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
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

    public static final class Builder extends Request.Builder<UpdateFileRequest, Builder> {
        private String regionId; 
        private String advancedSettings; 
        private Boolean applyScheduleImmediately; 
        private Boolean autoParsing; 
        private Integer autoRerunIntervalMillis; 
        private Integer autoRerunTimes; 
        private String connectionName; 
        private String content; 
        private String cronExpress; 
        private String cycleType; 
        private String dependentNodeIdList; 
        private String dependentType; 
        private Long endEffectDate; 
        private String fileDescription; 
        private String fileFolderPath; 
        private Long fileId; 
        private String fileName; 
        private Boolean ignoreParentSkipRunningProperty; 
        private String imageId; 
        private String inputList; 
        private String inputParameters; 
        private String outputList; 
        private String outputParameters; 
        private String owner; 
        private String paraValue; 
        private Long projectId; 
        private String projectIdentifier; 
        private String rerunMode; 
        private String resourceGroupIdentifier; 
        private String schedulerType; 
        private Long startEffectDate; 
        private Boolean startImmediately; 
        private Boolean stop; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.advancedSettings = request.advancedSettings;
            this.applyScheduleImmediately = request.applyScheduleImmediately;
            this.autoParsing = request.autoParsing;
            this.autoRerunIntervalMillis = request.autoRerunIntervalMillis;
            this.autoRerunTimes = request.autoRerunTimes;
            this.connectionName = request.connectionName;
            this.content = request.content;
            this.cronExpress = request.cronExpress;
            this.cycleType = request.cycleType;
            this.dependentNodeIdList = request.dependentNodeIdList;
            this.dependentType = request.dependentType;
            this.endEffectDate = request.endEffectDate;
            this.fileDescription = request.fileDescription;
            this.fileFolderPath = request.fileFolderPath;
            this.fileId = request.fileId;
            this.fileName = request.fileName;
            this.ignoreParentSkipRunningProperty = request.ignoreParentSkipRunningProperty;
            this.imageId = request.imageId;
            this.inputList = request.inputList;
            this.inputParameters = request.inputParameters;
            this.outputList = request.outputList;
            this.outputParameters = request.outputParameters;
            this.owner = request.owner;
            this.paraValue = request.paraValue;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.rerunMode = request.rerunMode;
            this.resourceGroupIdentifier = request.resourceGroupIdentifier;
            this.schedulerType = request.schedulerType;
            this.startEffectDate = request.startEffectDate;
            this.startImmediately = request.startImmediately;
            this.stop = request.stop;
            this.timeout = request.timeout;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The advanced settings of the node.</p>
         * <p>This parameter corresponds to the Advanced Settings in the right-side navigation pane on the editing page for EMR Spark Streaming and EMR Streaming SQL data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * <p>Currently, only EMR Spark Streaming and EMR Streaming SQL nodes support this parameter. The parameter value is in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;queue&quot;:&quot;default&quot;,&quot;SPARK_CONF&quot;:&quot;--conf spark.driver.memory=2g&quot;}</p>
         */
        public Builder advancedSettings(String advancedSettings) {
            this.putBodyParameter("AdvancedSettings", advancedSettings);
            this.advancedSettings = advancedSettings;
            return this;
        }

        /**
         * <p>Specifies whether the scheduling configuration takes effect immediately after publishing.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder applyScheduleImmediately(Boolean applyScheduleImmediately) {
            this.putBodyParameter("ApplyScheduleImmediately", applyScheduleImmediately);
            this.applyScheduleImmediately = applyScheduleImmediately;
            return this;
        }

        /**
         * <p>Specifies whether to enable the automatic parsing feature for the file. Valid values:</p>
         * <ul>
         * <li>true: The file automatically parses code.</li>
         * <li>false: The file does not automatically parse code.</li>
         * </ul>
         * <p>This parameter corresponds to the Code Parsing setting when you select Same Cycle under Scheduling Configuration &gt; Scheduling Dependency for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoParsing(Boolean autoParsing) {
            this.putBodyParameter("AutoParsing", autoParsing);
            this.autoParsing = autoParsing;
            return this;
        }

        /**
         * <p>The interval between automatic reruns upon an error, in milliseconds. The maximum value is 1800000 milliseconds (30 minutes).</p>
         * <p>This parameter corresponds to the Rerun Interval setting under Scheduling Configuration &gt; Time Properties &gt; Auto Rerun upon Error for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.
         * The time unit for Rerun Interval in the console is minutes. Convert the time accordingly when calling this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>120000</p>
         */
        public Builder autoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
            this.putBodyParameter("AutoRerunIntervalMillis", autoRerunIntervalMillis);
            this.autoRerunIntervalMillis = autoRerunIntervalMillis;
            return this;
        }

        /**
         * <p>The number of automatic reruns after an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder autoRerunTimes(Integer autoRerunTimes) {
            this.putBodyParameter("AutoRerunTimes", autoRerunTimes);
            this.autoRerunTimes = autoRerunTimes;
            return this;
        }

        /**
         * <p>The identifier of the data source used when the node corresponding to the file runs. You can call the <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> operation to obtain the list of available data sources.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        public Builder connectionName(String connectionName) {
            this.putBodyParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * <p>The code content of the file. Files of different code types (fileType) have different code formats. In Operation Center, right-click a node of the corresponding type and select View Code to view the specific code format.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT &quot;1&quot;;</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The cron expression for timed scheduling. This parameter corresponds to the cron Expression setting under Scheduling Configuration &gt; Time Property for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. After you configure the Scheduling Epoch and Timed Scheduling time, DataWorks automatically generates the corresponding cron expression.</p>
         * <p>Examples:</p>
         * <ul>
         * <li><p>Timed scheduling at 05:30 every day: <code>00 30 05 * * ?</code>.</p>
         * </li>
         * <li><p>Timed scheduling at the 15th minute of every hour: <code>00 15 * * * ?</code>.</p>
         * </li>
         * <li><p>Schedule every 10 minutes: <code>00 00/10 * * * ?</code>.</p>
         * </li>
         * <li><p>Schedule every 10 minutes from 08:00 to 17:00 every day: <code>00 00-59/10 8-23 * * * ?</code>.</p>
         * </li>
         * <li><p>Timed scheduling at 00:20 on the 1st of every month: <code>00 20 00 1 * ?</code>.</p>
         * </li>
         * <li><p>Schedule every 3 months starting from 00:10 on January 1: <code>00 10 00 1 1-12/3 ?</code>.</p>
         * </li>
         * <li><p>Timed scheduling at 00:05 every Tuesday and Friday: <code>00 05 00 * * 2,5</code>.</p>
         * </li>
         * </ul>
         * <p>The cron expression has the following limits due to the DataWorks scheduling system rules:</p>
         * <ul>
         * <li><p>The minimum scheduling interval is 5 minutes.</p>
         * </li>
         * <li><p>The earliest scheduling time each day is 00:05.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>00 00-59/5 1-23 * * ?</p>
         */
        public Builder cronExpress(String cronExpress) {
            this.putBodyParameter("CronExpress", cronExpress);
            this.cronExpress = cronExpress;
            return this;
        }

        /**
         * <p>The type of the scheduling cycle. Valid values: NOT_DAY (minute or hour) and DAY (day, week, or month).</p>
         * <p>This parameter corresponds to the Scheduling Cycle setting under Scheduling Configuration &gt; Time Properties for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>NOT_DAY</p>
         */
        public Builder cycleType(String cycleType) {
            this.putBodyParameter("CycleType", cycleType);
            this.cycleType = cycleType;
            return this;
        }

        /**
         * <p>The IDs of the nodes on which the current file depends when DependentType is set to USER_DEFINE. Separate multiple node IDs with commas (,).</p>
         * <p>This parameter corresponds to the Settings when you select Other Nodes as the dependency after configuring Scheduling Configuration &gt; Scheduling Dependency to Previous Epoch for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. This is part of the parameter settings for scheduling dependencies.</p>
         * 
         * <strong>example:</strong>
         * <p>5,10,15,20</p>
         */
        public Builder dependentNodeIdList(String dependentNodeIdList) {
            this.putBodyParameter("DependentNodeIdList", dependentNodeIdList);
            this.dependentNodeIdList = dependentNodeIdList;
            return this;
        }

        /**
         * <p>The mode in which the node depends on the previous cycle. Valid values:</p>
         * <ul>
         * <li>SELF: The dependency is set to the current node.</li>
         * <li>CHILD: The dependency is set to first-level child nodes.</li>
         * <li>USER_DEFINE: The dependency is set to other nodes.</li>
         * <li>NONE: No dependency is selected. The node does not depend on the previous cycle.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFINE</p>
         */
        public Builder dependentType(String dependentType) {
            this.putBodyParameter("DependentType", dependentType);
            this.dependentType = dependentType;
            return this;
        }

        /**
         * <p>The timestamp in milliseconds when automatic scheduling stops.</p>
         * <p>This parameter corresponds to the end time in milliseconds under Scheduling Configuration &gt; Time Properties &gt; Effective Date for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>4155787800000</p>
         */
        public Builder endEffectDate(Long endEffectDate) {
            this.putBodyParameter("EndEffectDate", endEffectDate);
            this.endEffectDate = endEffectDate;
            return this;
        }

        /**
         * <p>The description of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>Here is the file description</p>
         */
        public Builder fileDescription(String fileDescription) {
            this.putBodyParameter("FileDescription", fileDescription);
            this.fileDescription = fileDescription;
            return this;
        }

        /**
         * <p>The path of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>Business_process/First_Business_Process/data_integration/Folder_1/Folder_2</p>
         */
        public Builder fileFolderPath(String fileFolderPath) {
            this.putBodyParameter("FileFolderPath", fileFolderPath);
            this.fileFolderPath = fileFolderPath;
            return this;
        }

        /**
         * <p>The ID of the file. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to obtain the file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100000001</p>
         */
        public Builder fileId(Long fileId) {
            this.putBodyParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The name of the file. You can modify the file name by setting FileName to a new value.
         * For example, call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the file ID in the target folder, and then call the <a href="https://help.aliyun.com/document_detail/173951.html">UpdateFile</a> operation to specify the file ID for the FileId parameter and configure the FileName parameter to rename the file.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_user_info_d</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>Specifies whether to skip the dry-run property of the upstream node under Scheduling Configuration &gt; Previous Cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ignoreParentSkipRunningProperty(Boolean ignoreParentSkipRunningProperty) {
            this.putBodyParameter("IgnoreParentSkipRunningProperty", ignoreParentSkipRunningProperty);
            this.ignoreParentSkipRunningProperty = ignoreParentSkipRunningProperty;
            return this;
        }

        /**
         * <p>The custom image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-uf6d7npxk1hhek8ng0cb</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The output names of the upstream files on which the current file depends. Separate multiple output names with commas (,).</p>
         * <p>This parameter corresponds to the Parent Node Output Name setting when you select Same Cycle under Scheduling Configuration &gt; Scheduling Dependency for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * <blockquote>
         * <p>This parameter is required when you create a batch synchronization node by calling CreateDISyncTask and UpdateFile.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>project_root,project.file1,project.001_out</p>
         */
        public Builder inputList(String inputList) {
            this.putBodyParameter("InputList", inputList);
            this.inputList = inputList;
            return this;
        }

        /**
         * <p>The input context parameters of the node. The parameter value is in JSON format. For the fields included, refer to the InputContextParameterList parameter structure in the response of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
         * <p>This parameter corresponds to the Input Parameters of Current Node setting under Scheduling Configuration &gt; Node Context for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ValueSource&quot;: &quot;project_001.first_node:bizdate_param&quot;,&quot;ParameterName&quot;: &quot;bizdate_input&quot;}]</p>
         */
        public Builder inputParameters(String inputParameters) {
            this.putBodyParameter("InputParameters", inputParameters);
            this.inputParameters = inputParameters;
            return this;
        }

        /**
         * <p>The output of the file.</p>
         * <p>This parameter corresponds to the Output Name of Current Node setting when you select Same Cycle under Scheduling Configuration &gt; Scheduling Dependency for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project.ods_user_info_d</p>
         */
        public Builder outputList(String outputList) {
            this.putBodyParameter("OutputList", outputList);
            this.outputList = outputList;
            return this;
        }

        /**
         * <p>The output context parameters of the node. The parameter value is in JSON format. For the fields included, refer to the OutputContextParameterList parameter structure in the response of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
         * <p>This parameter corresponds to the Output Parameters of Current Node setting under Scheduling Configuration &gt; Node Context for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Type&quot;: 1,&quot;Value&quot;: &quot;${bizdate}&quot;,&quot;ParameterName&quot;: &quot;bizdate_param&quot;}]</p>
         */
        public Builder outputParameters(String outputParameters) {
            this.putBodyParameter("OutputParameters", outputParameters);
            this.outputParameters = outputParameters;
            return this;
        }

        /**
         * <p>The user ID of the file owner.</p>
         * 
         * <strong>example:</strong>
         * <p>18023848927592</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The scheduling parameters.</p>
         * <p>This parameter corresponds to the Parameters setting under Scheduling Configuration for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/137548.html">Scheduling parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>x=a y=b z=c</p>
         */
        public Builder paraValue(String paraValue) {
            this.putBodyParameter("ParaValue", paraValue);
            this.paraValue = paraValue;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can logon to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Storage Management page to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Settings page to obtain the workspace name.</p>
         * <p>You must specify either this parameter or ProjectId to determine the DataWorks workspace for this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project</p>
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * <p>The rerun property. Valid values:</p>
         * <ul>
         * <li>ALL_ALLOWED: The node can be rerun regardless of whether it runs successfully or fails.</li>
         * <li>FAILURE_ALLOWED: The node can be rerun only after it fails.</li>
         * <li>ALL_DENIED: The node cannot be rerun regardless of whether it runs successfully or fails.</li>
         * </ul>
         * <p>This parameter corresponds to the Rerun Property setting under Scheduling Configuration &gt; Time Properties &gt; Rerun Property for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL_ALLOWED</p>
         */
        public Builder rerunMode(String rerunMode) {
            this.putBodyParameter("RerunMode", rerunMode);
            this.rerunMode = rerunMode;
            return this;
        }

        /**
         * <p>The schedule resource used when the file is published as a node and the node runs. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to obtain the list of available resource groups for the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>default_group</p>
         */
        public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
            this.putBodyParameter("ResourceGroupIdentifier", resourceGroupIdentifier);
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li>NORMAL: A normal scheduling node.</li>
         * <li>MANUAL: A manual node that is not scheduled on a daily basis. This corresponds to nodes in a manual workflow.</li>
         * <li>PAUSE: A paused node.</li>
         * <li>SKIP: A dry-run node that is scheduled on a daily basis but is directly set to successful when scheduling starts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder schedulerType(String schedulerType) {
            this.putBodyParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        /**
         * <p>The timestamp in milliseconds when automatic scheduling starts.</p>
         * <p>This parameter corresponds to the start time in milliseconds under Scheduling Configuration &gt; Time Properties &gt; Effective Date for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>936923400000</p>
         */
        public Builder startEffectDate(Long startEffectDate) {
            this.putBodyParameter("StartEffectDate", startEffectDate);
            this.startEffectDate = startEffectDate;
            return this;
        }

        /**
         * <p>Specifies whether to start the node immediately after publishing. Valid values:</p>
         * <ul>
         * <li>true: Starts immediately after publishing.</li>
         * <li>false: Does not start after publishing.</li>
         * </ul>
         * <p>This parameter corresponds to the Start Mode setting under Configuration &gt; Time Properties in the right-side navigation pane on the editing page for EMR Spark Streaming and EMR Streaming SQL data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder startImmediately(Boolean startImmediately) {
            this.putBodyParameter("StartImmediately", startImmediately);
            this.startImmediately = startImmediately;
            return this;
        }

        /**
         * <p>Specifies whether to pause scheduling. Valid values:</p>
         * <ul>
         * <li>true: Pauses scheduling.</li>
         * <li>false: Does not pause scheduling.</li>
         * </ul>
         * <p>This parameter corresponds to the setting when Scheduling Type is set to Pause Scheduling under Scheduling Configuration &gt; Time Properties &gt; Scheduling Type for a data development node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder stop(Boolean stop) {
            this.putBodyParameter("Stop", stop);
            this.stop = stop;
            return this;
        }

        /**
         * <p>The timeout setting for the scheduling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public UpdateFileRequest build() {
            return new UpdateFileRequest(this);
        } 

    } 

}
