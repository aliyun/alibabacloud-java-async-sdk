// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHpoExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>GetHpoExperimentResponseBody</p>
 */
public class GetHpoExperimentResponseBody extends TeaModel {
    @NameInMap("Accessibility")
    private String accessibility;

    @NameInMap("Code")
    private String code;

    @NameInMap("ConfigIni")
    private String configIni;

    @NameInMap("ConfigYml")
    private String configYml;

    @NameInMap("Creator")
    private String creator;

    @NameInMap("Deleted")
    private Boolean deleted;

    @NameInMap("Description")
    private String description;

    @NameInMap("Detail")
    private java.util.Map < String, ? > detail;

    @NameInMap("ExperimentId")
    private String experimentId;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("HpoExperimentConfiguration")
    private java.util.Map < String, ? > hpoExperimentConfiguration;

    @NameInMap("JobType")
    private String jobType;

    @NameInMap("Message")
    private String message;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SearchSpace")
    private String searchSpace;

    @NameInMap("Status")
    private String status;

    @NameInMap("TrialCount")
    private Integer trialCount;

    @NameInMap("TrialStatus")
    private java.util.Map < String, String > trialStatus;

    @NameInMap("WorkspaceId")
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
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ConfigIni.
         */
        public Builder configIni(String configIni) {
            this.configIni = configIni;
            return this;
        }

        /**
         * ConfigYml.
         */
        public Builder configYml(String configYml) {
            this.configYml = configYml;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * Deleted.
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(java.util.Map < String, ? > detail) {
            this.detail = detail;
            return this;
        }

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * HpoExperimentConfiguration.
         */
        public Builder hpoExperimentConfiguration(java.util.Map < String, ? > hpoExperimentConfiguration) {
            this.hpoExperimentConfiguration = hpoExperimentConfiguration;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * SearchSpace.
         */
        public Builder searchSpace(String searchSpace) {
            this.searchSpace = searchSpace;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TrialCount.
         */
        public Builder trialCount(Integer trialCount) {
            this.trialCount = trialCount;
            return this;
        }

        /**
         * TrialStatus.
         */
        public Builder trialStatus(java.util.Map < String, String > trialStatus) {
            this.trialStatus = trialStatus;
            return this;
        }

        /**
         * WorkspaceId.
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
