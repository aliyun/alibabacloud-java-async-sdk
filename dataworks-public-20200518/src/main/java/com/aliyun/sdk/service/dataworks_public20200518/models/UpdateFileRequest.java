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
         * <p>The advanced configurations of the node.</p>
         * <p>This parameter is valid only for an EMR Spark Streaming node or an EMR Streaming SQL node. This parameter corresponds to the Advanced Settings tab of the node in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * <p>This parameter is configured in the JSON format.</p>
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
         * ApplyScheduleImmediately.
         */
        public Builder applyScheduleImmediately(Boolean applyScheduleImmediately) {
            this.putBodyParameter("ApplyScheduleImmediately", applyScheduleImmediately);
            this.applyScheduleImmediately = applyScheduleImmediately;
            return this;
        }

        /**
         * <p>Specifies whether the automatic parsing feature is enabled for the file. Valid values:</p>
         * <ul>
         * <li>true: The automatic parsing feature is enabled for the file.</li>
         * <li>false: The automatic parsing feature is not enabled for the file.</li>
         * </ul>
         * <p>This parameter corresponds to the Analyze Code parameter that is displayed after Same Cycle is selected in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The interval between two consecutive automatic reruns after an error occurs. Unit: milliseconds. Maximum value: 1800000 (30 minutes).</p>
         * <p>This parameter corresponds to the Rerun Interval parameter that is displayed after the Auto Rerun upon Error check box is selected in the Schedule section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * <p>The interval that you specify in the DataWorks console is measured in minutes. Pay attention to the conversion between the units of time when you call the operation.</p>
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
         * <p>The number of automatic reruns that are allowed after an error occurs.</p>
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
         * <p>The name of the connected data source that is used to run the node. You can call the <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> operation to query the available data sources of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        public Builder connectionName(String connectionName) {
            this.putBodyParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * <p>The code of the file. The code format varies based on the file type. To view the code format for a specific file type, go to Operation Center, right-click a node of the file type, and then select View Code.</p>
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
         * <p>The CRON expression that represents the periodic scheduling policy of the node. This parameter corresponds to the Cron Expression parameter in the Schedule section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. After you configure the Scheduling Cycle and Run At parameters in the DataWorks console, DataWorks automatically generates a value for the Cron Expression parameter.</p>
         * <p>Examples:</p>
         * <ul>
         * <li>CRON expression for a node that is scheduled to run at 05:30 every day: <code>00 30 05 * * ?</code></li>
         * <li>CRON expression for a node that is scheduled to run at the fifteenth minute of each hour: <code>00 15 * * * ?</code></li>
         * <li>CRON expression for a node that is scheduled to run every 10 minutes: <code>00 00/10 * * * ?</code></li>
         * <li>CRON expression for a node that is scheduled to run every 10 minutes from 08:00 to 17:00 every day: <code>00 00-59/10 8-23 * * * ?</code></li>
         * <li>CRON expression for a node that is scheduled to run at 00:20 on the first day of each month: <code>00 20 00 1 * ?</code></li>
         * <li>CRON expression for a node that is scheduled to run every three months starting from 00:10 on January 1: <code>00 10 00 1 1-12/3 ?</code></li>
         * <li>CRON expression for a node that is scheduled to run at 00:05 every Tuesday and Friday: <code>00 05 00 * * 2,5</code></li>
         * </ul>
         * <p>The scheduling system of DataWorks imposes the following limits on CRON expressions:</p>
         * <ul>
         * <li>A node can be scheduled to run at a minimum interval of 5 minutes.</li>
         * <li>A node can be scheduled to run at 00:05 every day at the earliest.</li>
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
         * <p>The type of the scheduling cycle of the node that corresponds to the file. Valid values: NOT_DAY and DAY. The value NOT_DAY indicates that the node is scheduled to run by minute or hour. The value DAY indicates that the node is scheduled to run by day, week, or month.</p>
         * <p>This parameter corresponds to the Scheduling Cycle parameter in the Schedule section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The ID of the node on which the node corresponding to the file depends when the DependentType parameter is set to USER_DEFINE. Multiple IDs are separated by commas (,).</p>
         * <p>The value of this parameter corresponds to the ID of the node that you specified after you select Previous Cycle and set Depend On to Other Nodes in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
            this.putBodyParameter("DependentType", dependentType);
            this.dependentType = dependentType;
            return this;
        }

        /**
         * <p>The end time of automatic scheduling. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter corresponds to the end time specified for the Validity Period parameter in the Schedule section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         */
        public Builder fileDescription(String fileDescription) {
            this.putBodyParameter("FileDescription", fileDescription);
            this.fileDescription = fileDescription;
            return this;
        }

        /**
         * <p>The path of the file.</p>
         */
        public Builder fileFolderPath(String fileFolderPath) {
            this.putBodyParameter("FileFolderPath", fileFolderPath);
            this.fileFolderPath = fileFolderPath;
            return this;
        }

        /**
         * <p>The ID of the file. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to obtain the ID.</p>
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
         * <p>The name of the file. You can set the FileName parameter to a new value to change the file name.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the ID of the file whose name you want to change. Then, you can set the FileId parameter to the ID and set the FileName parameter to a new value when you call the <a href="https://help.aliyun.com/document_detail/173951.html">UpdateFile</a> operation.</p>
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
         * IgnoreParentSkipRunningProperty.
         */
        public Builder ignoreParentSkipRunningProperty(Boolean ignoreParentSkipRunningProperty) {
            this.putBodyParameter("IgnoreParentSkipRunningProperty", ignoreParentSkipRunningProperty);
            this.ignoreParentSkipRunningProperty = ignoreParentSkipRunningProperty;
            return this;
        }

        /**
         * <p>The output name of the parent file on which the current file depends. If you specify multiple output names, separate them with commas (,).</p>
         * <p>This parameter corresponds to the Parent Nodes parameter that is displayed after you select Same Cycle in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * <blockquote>
         * <p> You must configure this parameter when you call the CreateDISyncTask or UpdateFile operation to create a batch synchronization task.</p>
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
         * <p>The input parameters of the node. This parameter is configured in the JSON format. For more information about the input parameters, refer to the InputContextParameterList parameter in the Response parameters section of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
         * <p>This parameter corresponds to the Input Parameters table in the Input and Output Parameters section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The output name of the current file.</p>
         * <p>This parameter corresponds to the Output Name parameter in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The output parameters of the node. This parameter is configured in the JSON format. For more information about the output parameters, refer to the OutputContextParameterList parameter in the Response parameters section of the <a href="https://help.aliyun.com/document_detail/173954.html">GetFile</a> operation.</p>
         * <p>This parameter corresponds to the Output Parameters table in the Input and Output Parameters section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The ID of the file owner.</p>
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
         * <p>The scheduling parameters of the node.</p>
         * <p>This parameter corresponds to the Parameters section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/137548.html">Configure scheduling parameters</a>.</p>
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
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the workspace ID.</p>
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
         * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the workspace name.</p>
         * <p>You must configure this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
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
         * <p>Specifies whether the node that corresponds to the file can be rerun. Valid values:</p>
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
            this.putBodyParameter("RerunMode", rerunMode);
            this.rerunMode = rerunMode;
            return this;
        }

        /**
         * <p>The identifier of the resource group that is used to run the node. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to query the available resource groups in the workspace.</p>
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
            this.putBodyParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        /**
         * <p>The start time of automatic scheduling. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter corresponds to the Validity Period parameter in the Schedule section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>Specifies whether to immediately run a node after the node is deployed to the production environment. Valid values:</p>
         * <ul>
         * <li>true: A node is immediately run after the node is deployed to the production environment.</li>
         * <li>false: A node is not immediately run after the node is deployed to the production environment.</li>
         * </ul>
         * <p>This parameter is valid only for an EMR Spark Streaming node or an EMR Streaming SQL node. This parameter corresponds to the Start Method parameter in the Schedule section of the Configure tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>Specifies whether to suspend the scheduling of the node. Valid values:</p>
         * <ul>
         * <li>true: suspends the scheduling of the node.</li>
         * <li>false: does not suspend the scheduling of the node.</li>
         * </ul>
         * <p>This parameter corresponds to the Recurrence parameter in the Schedule section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * Timeout.
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
