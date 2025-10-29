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
 * {@link CreateFileRequest} extends {@link RequestModel}
 *
 * <p>CreateFileRequest</p>
 */
public class CreateFileRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("CreateFolderIfNotExists")
    private Boolean createFolderIfNotExists;

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
    private String fileDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileFolderPath")
    private String fileFolderPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer fileType;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private Long resourceGroupId;

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

    private CreateFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.advancedSettings = builder.advancedSettings;
        this.applyScheduleImmediately = builder.applyScheduleImmediately;
        this.autoParsing = builder.autoParsing;
        this.autoRerunIntervalMillis = builder.autoRerunIntervalMillis;
        this.autoRerunTimes = builder.autoRerunTimes;
        this.connectionName = builder.connectionName;
        this.content = builder.content;
        this.createFolderIfNotExists = builder.createFolderIfNotExists;
        this.cronExpress = builder.cronExpress;
        this.cycleType = builder.cycleType;
        this.dependentNodeIdList = builder.dependentNodeIdList;
        this.dependentType = builder.dependentType;
        this.endEffectDate = builder.endEffectDate;
        this.fileDescription = builder.fileDescription;
        this.fileFolderPath = builder.fileFolderPath;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.ignoreParentSkipRunningProperty = builder.ignoreParentSkipRunningProperty;
        this.imageId = builder.imageId;
        this.inputList = builder.inputList;
        this.inputParameters = builder.inputParameters;
        this.outputParameters = builder.outputParameters;
        this.owner = builder.owner;
        this.paraValue = builder.paraValue;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.rerunMode = builder.rerunMode;
        this.resourceGroupId = builder.resourceGroupId;
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

    public static CreateFileRequest create() {
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
     * @return createFolderIfNotExists
     */
    public Boolean getCreateFolderIfNotExists() {
        return this.createFolderIfNotExists;
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
     * @return resourceGroupId
     */
    public Long getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<CreateFileRequest, Builder> {
        private String regionId; 
        private String advancedSettings; 
        private Boolean applyScheduleImmediately; 
        private Boolean autoParsing; 
        private Integer autoRerunIntervalMillis; 
        private Integer autoRerunTimes; 
        private String connectionName; 
        private String content; 
        private Boolean createFolderIfNotExists; 
        private String cronExpress; 
        private String cycleType; 
        private String dependentNodeIdList; 
        private String dependentType; 
        private Long endEffectDate; 
        private String fileDescription; 
        private String fileFolderPath; 
        private String fileName; 
        private Integer fileType; 
        private Boolean ignoreParentSkipRunningProperty; 
        private String imageId; 
        private String inputList; 
        private String inputParameters; 
        private String outputParameters; 
        private String owner; 
        private String paraValue; 
        private Long projectId; 
        private String projectIdentifier; 
        private String rerunMode; 
        private Long resourceGroupId; 
        private String resourceGroupIdentifier; 
        private String schedulerType; 
        private Long startEffectDate; 
        private Boolean startImmediately; 
        private Boolean stop; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.advancedSettings = request.advancedSettings;
            this.applyScheduleImmediately = request.applyScheduleImmediately;
            this.autoParsing = request.autoParsing;
            this.autoRerunIntervalMillis = request.autoRerunIntervalMillis;
            this.autoRerunTimes = request.autoRerunTimes;
            this.connectionName = request.connectionName;
            this.content = request.content;
            this.createFolderIfNotExists = request.createFolderIfNotExists;
            this.cronExpress = request.cronExpress;
            this.cycleType = request.cycleType;
            this.dependentNodeIdList = request.dependentNodeIdList;
            this.dependentType = request.dependentType;
            this.endEffectDate = request.endEffectDate;
            this.fileDescription = request.fileDescription;
            this.fileFolderPath = request.fileFolderPath;
            this.fileName = request.fileName;
            this.fileType = request.fileType;
            this.ignoreParentSkipRunningProperty = request.ignoreParentSkipRunningProperty;
            this.imageId = request.imageId;
            this.inputList = request.inputList;
            this.inputParameters = request.inputParameters;
            this.outputParameters = request.outputParameters;
            this.owner = request.owner;
            this.paraValue = request.paraValue;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.rerunMode = request.rerunMode;
            this.resourceGroupId = request.resourceGroupId;
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
         * <p>This parameter corresponds to the Advanced Settings section in the right-side navigation pane on the configuration tab of EMR Spark Streaming and EMR Streaming SQL nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * <p>Only EMR Spark Streaming and EMR Streaming SQL nodes support this parameter. The value must be in the JSON format.</p>
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
         * <p>Specifies whether to apply the scheduling configuration immediately after the file is published.</p>
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
         * <p>Specifies whether to enable automatic parsing for the file. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter corresponds to the Analyze Code setting in Properties &gt; Dependencies for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The interval at which the node is automatically rerun after a failure. Unit: milliseconds. Maximum value: 1800000 milliseconds (30 minutes).</p>
         * <p>This parameter corresponds to the Rerun interval parameter in Properties &gt; Schedule &gt; Auto Rerun upon Failure for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. In the console, the unit of the rerun interval is minutes. Convert the time unit when you call this operation.</p>
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
         * <p>The number of automatic reruns after an error occurs. Maximum value: 10.</p>
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
         * <p>The data source used when the task published from the file is run.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/211432.html">UpdateDataSource</a> operation to query the available data sources in the workspace.</p>
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
         * <p>The file code content. Different code types (fileType) have different code formats. In Operation Center, you can find a task of the corresponding type, right-click it, and select View Code to view the specific code format.</p>
         * 
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>Specifies whether to automatically create the directory specified by FileFolderPath if the directory does not exist. Valid values:</p>
         * <ul>
         * <li>true: If the directory does not exist, automatically create it.</li>
         * <li>false: If the directory does not exist, the call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder createFolderIfNotExists(Boolean createFolderIfNotExists) {
            this.putBodyParameter("CreateFolderIfNotExists", createFolderIfNotExists);
            this.createFolderIfNotExists = createFolderIfNotExists;
            return this;
        }

        /**
         * <p>The cron expression for scheduled execution. This parameter corresponds to the Cron Expression setting in Scheduling &gt; Scheduling Time for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. After you configure Scheduling Cycle and Scheduled Time, DataWorks automatically generates a cron expression.</p>
         * <p>Examples:</p>
         * <ul>
         * <li>Scheduled at 05:30 every day: <code>00 30 05 * * ?</code></li>
         * <li>Scheduled at the 15th minute of every hour: <code>00 15 00-23/1 * * ?</code></li>
         * <li>Scheduled every 10 minutes: <code>00 00/10 * * * ?</code></li>
         * <li>Scheduled every 10 minutes between 08:00 and 17:00 every day: <code>00 00-59/10 8-17 * * * ?</code></li>
         * <li>Scheduled at 00:20 on the 1st day of every month: <code>00 20 00 1 * ?</code></li>
         * <li>Scheduled every 3 months starting from 00:10 on January 1: <code>00 10 00 1 1-12/3 ?</code></li>
         * <li>Scheduled at 00:05 on every Tuesday and Friday: <code>00 05 00 * * 2,5</code></li>
         * </ul>
         * <p>Due to the rules of the DataWorks scheduling system, cron expressions have the following restrictions:</p>
         * <ul>
         * <li>The minimum scheduling interval is 5 minutes.</li>
         * <li>The earliest scheduling time each day is 00:05.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>00 05 00 * * ?</p>
         */
        public Builder cronExpress(String cronExpress) {
            this.putBodyParameter("CronExpress", cronExpress);
            this.cronExpress = cronExpress;
            return this;
        }

        /**
         * <p>The type of scheduling cycle. Valid values: NOT_DAY (minute, hour) and DAY (day, week, month).</p>
         * <p>This parameter corresponds to the Scheduling Cycle setting in Scheduling &gt; Scheduling Time for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        public Builder cycleType(String cycleType) {
            this.putBodyParameter("CycleType", cycleType);
            this.cycleType = cycleType;
            return this;
        }

        /**
         * <p>The IDs of the nodes on which the current node depends. This parameter takes effect only when the DependentType parameter is set to USER_DEFINE. Separate multiple node IDs with commas (,).</p>
         * <p>This parameter corresponds to the Other Nodes option in Properties &gt; Dependencies &gt; Cross-cycle Dependency (Original Previous-cycle Dependency) for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder dependentNodeIdList(String dependentNodeIdList) {
            this.putBodyParameter("DependentNodeIdList", dependentNodeIdList);
            this.dependentNodeIdList = dependentNodeIdList;
            return this;
        }

        /**
         * <p>The dependency mode on the previous cycle. Valid values:</p>
         * <ul>
         * <li>SELF: Depends on the current node.</li>
         * <li>CHILD: Depends on the child nodes.</li>
         * <li>USER_DEFINE: Depends on other nodes.</li>
         * <li>NONE: No dependencies. Does not depend on the previous cycle.</li>
         * <li>USER_DEFINE_AND_SELF: Depends on both the current node and other nodes in the previous cycle.</li>
         * <li>CHILD_AND_SELF: Depends on both the current node and its child nodes in the previous cycle.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder dependentType(String dependentType) {
            this.putBodyParameter("DependentType", dependentType);
            this.dependentType = dependentType;
            return this;
        }

        /**
         * <p>The timestamp (in milliseconds) when automatic scheduling stops.</p>
         * <p>This parameter corresponds to the end time of Effective Period in Scheduling &gt; Scheduling Time for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1671694850000</p>
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
         * <p>test</p>
         */
        public Builder fileDescription(String fileDescription) {
            this.putBodyParameter("FileDescription", fileDescription);
            this.fileDescription = fileDescription;
            return this;
        }

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>Business_process/First_Business_Process/MaxCompute/Folder_1/Folder_2</p>
         */
        public Builder fileFolderPath(String fileFolderPath) {
            this.putBodyParameter("FileFolderPath", fileFolderPath);
            this.fileFolderPath = fileFolderPath;
            return this;
        }

        /**
         * <p>The file name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>File name</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The code type of the file. Different file types have different code. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks node types</a>. You can call the <a href="https://help.aliyun.com/document_detail/212428.html">ListFileType</a> operation to query the code types of files.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder fileType(Integer fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>Specifies whether to inherit the dry-run status from the previous cycle. Valid values:</p>
         * <ul>
         * <li>true: Inherit the dry-run status from the previous cycle.</li>
         * <li>false: Do not inherit the dry-run status from the previous cycle.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>m-bp1h4b5a8ogkbll2f3tr</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The output names of the ancestor nodes on which the current node depends. Separate multiple output names with commas (,).</p>
         * <p>This parameter corresponds to the Output Name of Ancestor Node setting in Properties &gt; Dependencies for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The input context parameters of the node. The value must be in the JSON format. For more information about the parameter structure, see the InputContextParameterList parameter in the response parameters of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
         * <p>This parameter corresponds to the Input Parameters setting in Properties &gt; Input and Output Parameters for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The output context parameters of the node. The value must be in the JSON format. For more information about the parameter structure, see the OutputContextParameterList parameter in the response parameters of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
         * <p>This parameter corresponds to the Output Parameters setting in Properties &gt; Input and Output Parameters for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The Alibaba Cloud account ID of the file owner. If this parameter is not specified, the Alibaba Cloud account ID of the caller is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000001</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The scheduling parameters of the node. Separate multiple parameters with spaces.</p>
         * <p>This parameter corresponds to the Scheduling Parameter setting in Properties for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/137548.html">Scheduling parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>a=x b=y</p>
         */
        public Builder paraValue(String paraValue) {
            this.putBodyParameter("ParaValue", paraValue);
            this.paraValue = paraValue;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. To obtain the workspace ID, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and navigate to the workspace configuration page. You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The DataWorks workspace name. To obtain the workspace name, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and navigate to the workspace configuration page.</p>
         * <p>You must specify either this parameter or ProjectId to identify the target DataWorks workspace for this API call.</p>
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
         * <p>The rerun policy. Valid values:</p>
         * <ul>
         * <li>ALL_ALLOWED: Reruns are allowed regardless of whether the task succeeds or fails.</li>
         * <li>FAILURE_ALLOWED: Reruns are allowed only when the task fails.</li>
         * <li>ALL_DENIED: Reruns are not allowed regardless of whether the task succeeds or fails.</li>
         * </ul>
         * <p>This parameter corresponds to the Support for Rerun setting in Scheduling &gt; Scheduling Policies for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>375827434852437</p>
         */
        public Builder resourceGroupId(Long resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The resource group for the task published from the file. To obtain the ID, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, navigate to the workspace configuration page, and click Resource Groups in the left-side navigation pane to view the IDs of resource groups bound to the current workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_559_1613715566828</p>
         */
        public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
            this.putBodyParameter("ResourceGroupIdentifier", resourceGroupIdentifier);
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li>NORMAL: Normal scheduled task.</li>
         * <li>MANUAL: Manually triggered node. Not scheduled for daily execution. Corresponds to nodes in manually triggered workflows.</li>
         * <li>PAUSE: Paused task.</li>
         * <li>SKIP: Dry-run task. Scheduled for daily execution but is directly marked as successful when scheduling starts.</li>
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
         * <p>The timestamp (in milliseconds) when automatic scheduling starts.</p>
         * <p>This parameter corresponds to the start time of Effective Period in Scheduling &gt; Scheduling Time for Data Studio tasks in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1671608450000</p>
         */
        public Builder startEffectDate(Long startEffectDate) {
            this.putBodyParameter("StartEffectDate", startEffectDate);
            this.startEffectDate = startEffectDate;
            return this;
        }

        /**
         * <p>Specifies whether to immediately run the node after the node is deployed.</p>
         * <p>This parameter corresponds to the Start Method setting in Settings &gt; Schedule in the right-side navigation pane on the configuration tab of EMR Spark Streaming and EMR Streaming SQL nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>Specifies whether to skip execution. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter corresponds to the Skip Execution option in Properties &gt; Schedule &gt; Recurrence for data development nodes in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The timeout settings for scheduling configuration.</p>
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
        public CreateFileRequest build() {
            return new CreateFileRequest(this);
        } 

    } 

}
