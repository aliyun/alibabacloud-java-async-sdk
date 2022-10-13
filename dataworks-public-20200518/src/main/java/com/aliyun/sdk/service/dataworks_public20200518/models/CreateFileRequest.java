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
        this.cronExpress = builder.cronExpress;
        this.cycleType = builder.cycleType;
        this.dependentNodeIdList = builder.dependentNodeIdList;
        this.dependentType = builder.dependentType;
        this.endEffectDate = builder.endEffectDate;
        this.fileDescription = builder.fileDescription;
        this.fileFolderPath = builder.fileFolderPath;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
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
        private String cronExpress; 
        private String cycleType; 
        private String dependentNodeIdList; 
        private String dependentType; 
        private Long endEffectDate; 
        private String fileDescription; 
        private String fileFolderPath; 
        private String fileName; 
        private Integer fileType; 
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
            this.cronExpress = request.cronExpress;
            this.cycleType = request.cycleType;
            this.dependentNodeIdList = request.dependentNodeIdList;
            this.dependentType = request.dependentType;
            this.endEffectDate = request.endEffectDate;
            this.fileDescription = request.fileDescription;
            this.fileFolderPath = request.fileFolderPath;
            this.fileName = request.fileName;
            this.fileType = request.fileType;
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
         * AdvancedSettings.
         */
        public Builder advancedSettings(String advancedSettings) {
            this.putBodyParameter("AdvancedSettings", advancedSettings);
            this.advancedSettings = advancedSettings;
            return this;
        }

        /**
         * AutoParsing.
         */
        public Builder autoParsing(Boolean autoParsing) {
            this.putBodyParameter("AutoParsing", autoParsing);
            this.autoParsing = autoParsing;
            return this;
        }

        /**
         * AutoRerunIntervalMillis.
         */
        public Builder autoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
            this.putBodyParameter("AutoRerunIntervalMillis", autoRerunIntervalMillis);
            this.autoRerunIntervalMillis = autoRerunIntervalMillis;
            return this;
        }

        /**
         * AutoRerunTimes.
         */
        public Builder autoRerunTimes(Integer autoRerunTimes) {
            this.putBodyParameter("AutoRerunTimes", autoRerunTimes);
            this.autoRerunTimes = autoRerunTimes;
            return this;
        }

        /**
         * ConnectionName.
         */
        public Builder connectionName(String connectionName) {
            this.putBodyParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * CronExpress.
         */
        public Builder cronExpress(String cronExpress) {
            this.putBodyParameter("CronExpress", cronExpress);
            this.cronExpress = cronExpress;
            return this;
        }

        /**
         * CycleType.
         */
        public Builder cycleType(String cycleType) {
            this.putBodyParameter("CycleType", cycleType);
            this.cycleType = cycleType;
            return this;
        }

        /**
         * DependentNodeIdList.
         */
        public Builder dependentNodeIdList(String dependentNodeIdList) {
            this.putBodyParameter("DependentNodeIdList", dependentNodeIdList);
            this.dependentNodeIdList = dependentNodeIdList;
            return this;
        }

        /**
         * DependentType.
         */
        public Builder dependentType(String dependentType) {
            this.putBodyParameter("DependentType", dependentType);
            this.dependentType = dependentType;
            return this;
        }

        /**
         * EndEffectDate.
         */
        public Builder endEffectDate(Long endEffectDate) {
            this.putBodyParameter("EndEffectDate", endEffectDate);
            this.endEffectDate = endEffectDate;
            return this;
        }

        /**
         * FileDescription.
         */
        public Builder fileDescription(String fileDescription) {
            this.putBodyParameter("FileDescription", fileDescription);
            this.fileDescription = fileDescription;
            return this;
        }

        /**
         * FileFolderPath.
         */
        public Builder fileFolderPath(String fileFolderPath) {
            this.putBodyParameter("FileFolderPath", fileFolderPath);
            this.fileFolderPath = fileFolderPath;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(Integer fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * InputList.
         */
        public Builder inputList(String inputList) {
            this.putBodyParameter("InputList", inputList);
            this.inputList = inputList;
            return this;
        }

        /**
         * InputParameters.
         */
        public Builder inputParameters(String inputParameters) {
            this.putBodyParameter("InputParameters", inputParameters);
            this.inputParameters = inputParameters;
            return this;
        }

        /**
         * OutputParameters.
         */
        public Builder outputParameters(String outputParameters) {
            this.putBodyParameter("OutputParameters", outputParameters);
            this.outputParameters = outputParameters;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * ParaValue.
         */
        public Builder paraValue(String paraValue) {
            this.putBodyParameter("ParaValue", paraValue);
            this.paraValue = paraValue;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectIdentifier.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * RerunMode.
         */
        public Builder rerunMode(String rerunMode) {
            this.putBodyParameter("RerunMode", rerunMode);
            this.rerunMode = rerunMode;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(Long resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceGroupIdentifier.
         */
        public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
            this.putBodyParameter("ResourceGroupIdentifier", resourceGroupIdentifier);
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }

        /**
         * SchedulerType.
         */
        public Builder schedulerType(String schedulerType) {
            this.putBodyParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        /**
         * StartEffectDate.
         */
        public Builder startEffectDate(Long startEffectDate) {
            this.putBodyParameter("StartEffectDate", startEffectDate);
            this.startEffectDate = startEffectDate;
            return this;
        }

        /**
         * StartImmediately.
         */
        public Builder startImmediately(Boolean startImmediately) {
            this.putBodyParameter("StartImmediately", startImmediately);
            this.startImmediately = startImmediately;
            return this;
        }

        /**
         * Stop.
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
