// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileRequest} extends {@link RequestModel}
 *
 * <p>CreateFileRequest</p>
 */
public class CreateFileRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("AdvancedSettings")
    private String advancedSettings;

    @Body
    @NameInMap("AutoParsing")
    private Boolean autoParsing;

    @Body
    @NameInMap("AutoRerunIntervalMillis")
    private Integer autoRerunIntervalMillis;

    @Body
    @NameInMap("AutoRerunTimes")
    private Integer autoRerunTimes;

    @Body
    @NameInMap("ConnectionName")
    private String connectionName;

    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("CreateFolderIfNotExists")
    private Boolean createFolderIfNotExists;

    @Body
    @NameInMap("CronExpress")
    private String cronExpress;

    @Body
    @NameInMap("CycleType")
    private String cycleType;

    @Body
    @NameInMap("DependentNodeIdList")
    private String dependentNodeIdList;

    @Body
    @NameInMap("DependentType")
    private String dependentType;

    @Body
    @NameInMap("EndEffectDate")
    private Long endEffectDate;

    @Body
    @NameInMap("FileDescription")
    private String fileDescription;

    @Body
    @NameInMap("FileFolderPath")
    private String fileFolderPath;

    @Body
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Body
    @NameInMap("FileType")
    @Validation(required = true)
    private Integer fileType;

    @Body
    @NameInMap("IgnoreParentSkipRunningProperty")
    private Boolean ignoreParentSkipRunningProperty;

    @Body
    @NameInMap("InputList")
    private String inputList;

    @Body
    @NameInMap("InputParameters")
    private String inputParameters;

    @Body
    @NameInMap("OutputParameters")
    private String outputParameters;

    @Body
    @NameInMap("Owner")
    private String owner;

    @Body
    @NameInMap("ParaValue")
    private String paraValue;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @Body
    @NameInMap("RerunMode")
    private String rerunMode;

    @Body
    @NameInMap("ResourceGroupId")
    private Long resourceGroupId;

    @Body
    @NameInMap("ResourceGroupIdentifier")
    private String resourceGroupIdentifier;

    @Body
    @NameInMap("SchedulerType")
    private String schedulerType;

    @Body
    @NameInMap("StartEffectDate")
    private Long startEffectDate;

    @Body
    @NameInMap("StartImmediately")
    private Boolean startImmediately;

    @Body
    @NameInMap("Stop")
    private Boolean stop;

    private CreateFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.advancedSettings = builder.advancedSettings;
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

    public static final class Builder extends Request.Builder<CreateFileRequest, Builder> {
        private String regionId; 
        private String advancedSettings; 
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

        private Builder() {
            super();
        } 

        private Builder(CreateFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.advancedSettings = request.advancedSettings;
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
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The advanced configurations of the node.
         * <p>
         * 
         * This parameter is valid only for an EMR Spark Streaming node or an EMR Streaming SQL node. This parameter corresponds to the Advanced Settings tab of the node in the [DataWorks console](https://workbench.data.aliyun.com/console).
         * 
         * The value of this parameter must be in the JSON format.
         */
        public Builder advancedSettings(String advancedSettings) {
            this.putBodyParameter("AdvancedSettings", advancedSettings);
            this.advancedSettings = advancedSettings;
            return this;
        }

        /**
         * Specifies whether to enable the automatic parsing feature for the file. Valid values:
         * <p>
         * 
         * *   true: enables the automatic parsing feature for the file.
         * *   false: does not enable the automatic parsing feature for the file.
         * 
         * This parameter corresponds to the Analyze Code parameter that is displayed after Same Cycle is selected in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
         */
        public Builder autoParsing(Boolean autoParsing) {
            this.putBodyParameter("AutoParsing", autoParsing);
            this.autoParsing = autoParsing;
            return this;
        }

        /**
         * The interval between automatic reruns after an error occurs. Unit: milliseconds. Maximum value: 1800000 (30 minutes).
         * <p>
         * 
         * This parameter corresponds to the Rerun Interval parameter that is displayed after the Auto Rerun upon Error check box is selected in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
         * 
         * The interval that you specify in the DataWorks console is measured in minutes. Pay attention to the conversion between the units of time when you call the operation.
         */
        public Builder autoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
            this.putBodyParameter("AutoRerunIntervalMillis", autoRerunIntervalMillis);
            this.autoRerunIntervalMillis = autoRerunIntervalMillis;
            return this;
        }

        /**
         * The number of automatic reruns that are allowed after an error occurs. Maximum value: 10.
         */
        public Builder autoRerunTimes(Integer autoRerunTimes) {
            this.putBodyParameter("AutoRerunTimes", autoRerunTimes);
            this.autoRerunTimes = autoRerunTimes;
            return this;
        }

        /**
         * The name of the data source for which the node is run.
         * <p>
         * 
         * You can call the [UpdateDataSource](~~211432~~) operation to query the available data sources in the workspace.
         */
        public Builder connectionName(String connectionName) {
            this.putBodyParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * The code for the file. The code format varies based on the file type. To view the code format for a specific file type, go to Operation Center, right-click a node of the file type, and then select View Code.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * CreateFolderIfNotExists.
         */
        public Builder createFolderIfNotExists(Boolean createFolderIfNotExists) {
            this.putBodyParameter("CreateFolderIfNotExists", createFolderIfNotExists);
            this.createFolderIfNotExists = createFolderIfNotExists;
            return this;
        }

        /**
         * The CRON expression that represents the automatic scheduling policy of the node. This parameter corresponds to the Cron Expression parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console). After you configure the Scheduling Cycle and Run At parameters in the DataWorks console, DataWorks generates the value of the Cron Expression parameter.
         * <p>
         * 
         * Examples:
         * 
         * *   CRON expression for a node that is scheduled to run at 05:30 every day: `00 30 05 * * ?`
         * *   CRON expression for a node that is scheduled to run at the fifteenth minute of each hour: `00 15 00-23/1 * * ?`
         * *   CRON expression for a node that is scheduled to run every 10 minutes: `00 00/10 * * * ?`
         * *   CRON expression for a node that is scheduled to run every 10 minutes from 08:00 to 17:00 every day: `00 00-59/10 8-17 * * * ?`
         * *   CRON expression for a node that is scheduled to run at 00:20 on the first day of each month: `00 20 00 1 * ?`
         * *   CRON expression for a node that is scheduled to run every three months starting from 00:10 on January 1: `00 10 00 1 1-12/3 ?`
         * *   CRON expression for a node that is scheduled to run at 00:05 every Tuesday and Friday: `00 05 00 * * 2,5`
         * 
         * The scheduling system of DataWorks imposes the following limits on CRON expressions:
         * 
         * *   A node can be scheduled to run at a minimum interval of 5 minutes.
         * *   A node can be scheduled to run at 00:05 every day at the earliest.
         */
        public Builder cronExpress(String cronExpress) {
            this.putBodyParameter("CronExpress", cronExpress);
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
            this.putBodyParameter("CycleType", cycleType);
            this.cycleType = cycleType;
            return this;
        }

        /**
         * The IDs of the nodes that generate instances in the previous cycle on which the current node depends.
         */
        public Builder dependentNodeIdList(String dependentNodeIdList) {
            this.putBodyParameter("DependentNodeIdList", dependentNodeIdList);
            this.dependentNodeIdList = dependentNodeIdList;
            return this;
        }

        /**
         * The type of the cross-cycle scheduling dependency of the node. Valid values:
         * <p>
         * 
         * *   SELF: The instance generated for the node in the current cycle depends on the instance generated for the node in the previous cycle.
         * 
         * *   CHILD: The instance generated for the node in the current cycle depends on the instances generated for the descendant nodes at the nearest level of the node in the previous cycle.
         * 
         * *   USER_DEFINE: The instance generated for the node in the current cycle depends on the instances generated for one or more specified nodes in the previous cycle.
         * 
         * *   NONE: No cross-cycle scheduling dependency type is selected for the node.
         * 
         * *   USER_DEFINE_AND_SELF: The instance generated for the node in the current cycle depends on the instance generated for the node in the previous cycle and the instances generated for one or more specified nodes in the previous cycle.
         * 
         * *   CHILD_AND_SELF: The instance generated for the node in the current cycle depends on the instances generated for the descendant nodes at the nearest level of the node in the previous cycle and the instance generated for the node in the previous cycle.
         */
        public Builder dependentType(String dependentType) {
            this.putBodyParameter("DependentType", dependentType);
            this.dependentType = dependentType;
            return this;
        }

        /**
         * The end time of automatic scheduling. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * This parameter corresponds to the Validity Period parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
         */
        public Builder endEffectDate(Long endEffectDate) {
            this.putBodyParameter("EndEffectDate", endEffectDate);
            this.endEffectDate = endEffectDate;
            return this;
        }

        /**
         * The description of the file.
         */
        public Builder fileDescription(String fileDescription) {
            this.putBodyParameter("FileDescription", fileDescription);
            this.fileDescription = fileDescription;
            return this;
        }

        /**
         * The path of the file.
         */
        public Builder fileFolderPath(String fileFolderPath) {
            this.putBodyParameter("FileFolderPath", fileFolderPath);
            this.fileFolderPath = fileFolderPath;
            return this;
        }

        /**
         * The name of the file.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * The type of the code in the file.
         * <p>
         * 
         * Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).
         * 
         * You can call the [ListFileType](~~212428~~) operation to query the type of the code for the file.
         */
        public Builder fileType(Integer fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
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
         * The output name of the parent file on which the current file depends. If you specify multiple output names, separate them with commas (,).
         * <p>
         * 
         * This parameter corresponds to the Output Name parameter under Parent Nodes in the Dependencies section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
         */
        public Builder inputList(String inputList) {
            this.putBodyParameter("InputList", inputList);
            this.inputList = inputList;
            return this;
        }

        /**
         * The input parameters of the node. The value of this parameter must be in the JSON format. For more information about the input parameters, see the InputContextParameterList parameter in the Response parameters section of the [GetFile](~~173954~~) operation.
         * <p>
         * 
         * This parameter corresponds to the Input Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
         */
        public Builder inputParameters(String inputParameters) {
            this.putBodyParameter("InputParameters", inputParameters);
            this.inputParameters = inputParameters;
            return this;
        }

        /**
         * The output parameters of the node. The value of this parameter must be in the JSON format. For more information about the output parameters, see the OutputContextParameterList parameter in the Response parameters section of the [GetFile](~~173954~~) operation.
         * <p>
         * 
         * This parameter corresponds to the Output Parameters table in the Input and Output Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
         */
        public Builder outputParameters(String outputParameters) {
            this.putBodyParameter("OutputParameters", outputParameters);
            this.outputParameters = outputParameters;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account used by the file owner. If this parameter is not configured, the ID of the Alibaba Cloud account of the user who calls the operation is used.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The scheduling parameters of the node. Separate multiple parameters with spaces.
         * <p>
         * 
         * This parameter corresponds to the Parameters section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console). For more information about the configurations of the scheduling parameters, see [Configure scheduling parameters](~~137548~~).
         */
        public Builder paraValue(String paraValue) {
            this.putBodyParameter("ParaValue", paraValue);
            this.paraValue = paraValue;
            return this;
        }

        /**
         * The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.
         * <p>
         * 
         * You must configure this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The name of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace name.
         * <p>
         * 
         * You must configure this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * Specifies whether the node that corresponds to the file can be rerun. Valid values:
         * <p>
         * 
         * *   ALL_ALLOWED: The node can be rerun regardless of whether it is successfully run or fails to run.
         * *   FAILURE_ALLOWED: The node can be rerun only after it fails to run.
         * *   ALL_DENIED: The node cannot be rerun regardless of whether it is successfully run or fails to run.
         * 
         * This parameter corresponds to the Rerun parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
         */
        public Builder rerunMode(String rerunMode) {
            this.putBodyParameter("RerunMode", rerunMode);
            this.rerunMode = rerunMode;
            return this;
        }

        /**
         * This parameter is deprecated. Do not use this parameter.
         * <p>
         * 
         * The identifier of the resource group that is used to run the node. This parameter corresponds to the Resource Group parameter in the Resource Group section of the Properties tab in the DataWorks console. You must configure one of the ResourceGroupId and ResourceGroupIdentifier parameters to determine the resource group that is used to run the node.
         * 
         * You can call the [ListResourceGroups](~~173913~~) operation to query the available resource groups in the workspace. When you call the operation, set the ResourceGroupType parameter to 1. The response parameter Id indicates the ID of an available resource group.
         */
        public Builder resourceGroupId(Long resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The identifier of the resource group that is used to run the node. You can call the [ListResourceGroups](~~173913~~) operation to query the available resource groups in the workspace.
         */
        public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
            this.putBodyParameter("ResourceGroupIdentifier", resourceGroupIdentifier);
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }

        /**
         * The scheduling type of the inner node. Valid values:
         * <p>
         * 
         * *   NORMAL: The node is an auto triggered node.
         * *   MANUAL: The node is a manually triggered node. Manually triggered nodes cannot be automatically triggered. They correspond to the nodes in the Manually Triggered Workflows pane.
         * *   PAUSE: The node is a paused node.
         * *   SKIP: The node is a dry-run node. Dry-run nodes are started as scheduled, but the system sets the status of the nodes to successful when it starts to run them.
         */
        public Builder schedulerType(String schedulerType) {
            this.putBodyParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        /**
         * The start time of automatic scheduling. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * This parameter corresponds to the Validity Period parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
         */
        public Builder startEffectDate(Long startEffectDate) {
            this.putBodyParameter("StartEffectDate", startEffectDate);
            this.startEffectDate = startEffectDate;
            return this;
        }

        /**
         * Specifies whether to immediately run a node after the node is deployed to the production environment.
         * <p>
         * 
         * This parameter is valid only for an EMR Spark Streaming node or an EMR Streaming SQL node. This parameter corresponds to the Start Method parameter in the Schedule section of the Configure tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
         */
        public Builder startImmediately(Boolean startImmediately) {
            this.putBodyParameter("StartImmediately", startImmediately);
            this.startImmediately = startImmediately;
            return this;
        }

        /**
         * Specifies whether to suspend the scheduling of the node. Valid values:
         * <p>
         * 
         * *   true: suspends the scheduling of the node.
         * *   false: does not suspend the scheduling of the node.
         * 
         * This parameter corresponds to the Recurrence parameter in the Schedule section of the Properties tab in the [DataWorks console](https://workbench.data.aliyun.com/console).
         */
        public Builder stop(Boolean stop) {
            this.putBodyParameter("Stop", stop);
            this.stop = stop;
            return this;
        }

        @Override
        public CreateFileRequest build() {
            return new CreateFileRequest(this);
        } 

    } 

}
