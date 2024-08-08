// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHpoExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>GetHpoExperimentResponseBody</p>
 */
public class GetHpoExperimentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ConfigIni")
    private String configIni;

    @com.aliyun.core.annotation.NameInMap("ConfigYml")
    private String configYml;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Deleted")
    private Boolean deleted;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map < String, ? > detail;

    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("HpoExperimentConfiguration")
    private java.util.Map < String, ? > hpoExperimentConfiguration;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchSpace")
    private String searchSpace;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TrialCount")
    private Integer trialCount;

    @com.aliyun.core.annotation.NameInMap("TrialStatus")
    private java.util.Map < String, String > trialStatus;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetHpoExperimentResponseBody(Builder builder) {
        this.accessibility = builder.accessibility;
        this.code = builder.code;
        this.configIni = builder.configIni;
        this.configYml = builder.configYml;
        this.creator = builder.creator;
        this.deleted = builder.deleted;
        this.description = builder.description;
        this.detail = builder.detail;
        this.experimentId = builder.experimentId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.hpoExperimentConfiguration = builder.hpoExperimentConfiguration;
        this.jobType = builder.jobType;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.searchSpace = builder.searchSpace;
        this.status = builder.status;
        this.trialCount = builder.trialCount;
        this.trialStatus = builder.trialStatus;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHpoExperimentResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return configIni
     */
    public String getConfigIni() {
        return this.configIni;
    }

    /**
     * @return configYml
     */
    public String getConfigYml() {
        return this.configYml;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return detail
     */
    public java.util.Map < String, ? > getDetail() {
        return this.detail;
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return hpoExperimentConfiguration
     */
    public java.util.Map < String, ? > getHpoExperimentConfiguration() {
        return this.hpoExperimentConfiguration;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchSpace
     */
    public String getSearchSpace() {
        return this.searchSpace;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return trialCount
     */
    public Integer getTrialCount() {
        return this.trialCount;
    }

    /**
     * @return trialStatus
     */
    public java.util.Map < String, String > getTrialStatus() {
        return this.trialStatus;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private String code; 
        private String configIni; 
        private String configYml; 
        private String creator; 
        private Boolean deleted; 
        private String description; 
        private java.util.Map < String, ? > detail; 
        private String experimentId; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.Map < String, ? > hpoExperimentConfiguration; 
        private String jobType; 
        private String message; 
        private String name; 
        private String requestId; 
        private String searchSpace; 
        private String status; 
        private Integer trialCount; 
        private java.util.Map < String, String > trialStatus; 
        private String workspaceId; 

        /**
         * Accessibility of expriment, public or private.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * Error when the API call is not success.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Experiment run environment configurations.
         */
        public Builder configIni(String configIni) {
            this.configIni = configIni;
            return this;
        }

        /**
         * HPO search config yaml.
         */
        public Builder configYml(String configYml) {
            this.configYml = configYml;
            return this;
        }

        /**
         * The one who created the experiment.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * If the Experiment if deleted.
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * Description of the experiment.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Extra error message info.
         */
        public Builder detail(java.util.Map < String, ? > detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Experiment ID.
         */
        public Builder experimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Experiment create time.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * Experiment last update time.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Experiment configuration in json format.
         */
        public Builder hpoExperimentConfiguration(java.util.Map < String, ? > hpoExperimentConfiguration) {
            this.hpoExperimentConfiguration = hpoExperimentConfiguration;
            return this;
        }

        /**
         * Experiment  Job type.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * Error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Experiment name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * HPO hyperparameter search space.
         */
        public Builder searchSpace(String searchSpace) {
            this.searchSpace = searchSpace;
            return this;
        }

        /**
         * Experiment status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Trials amount run till now.
         */
        public Builder trialCount(Integer trialCount) {
            this.trialCount = trialCount;
            return this;
        }

        /**
         * Status if a trial
         */
        public Builder trialStatus(java.util.Map < String, String > trialStatus) {
            this.trialStatus = trialStatus;
            return this;
        }

        /**
         * AI Workspace ID.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetHpoExperimentResponseBody build() {
            return new GetHpoExperimentResponseBody(this);
        } 

    } 

}
