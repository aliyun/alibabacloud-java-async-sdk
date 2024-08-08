// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoExperimentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHpoExperimentsResponseBody</p>
 */
public class ListHpoExperimentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map < String, String > detail;

    @com.aliyun.core.annotation.NameInMap("Experiments")
    private java.util.List < Experiments> experiments;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListHpoExperimentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.detail = builder.detail;
        this.experiments = builder.experiments;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHpoExperimentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return detail
     */
    public java.util.Map < String, String > getDetail() {
        return this.detail;
    }

    /**
     * @return experiments
     */
    public java.util.List < Experiments> getExperiments() {
        return this.experiments;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.Map < String, String > detail; 
        private java.util.List < Experiments> experiments; 
        private String message; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Extra error information.
         */
        public Builder detail(java.util.Map < String, String > detail) {
            this.detail = detail;
            return this;
        }

        /**
         * experiment array.
         */
        public Builder experiments(java.util.List < Experiments> experiments) {
            this.experiments = experiments;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total qualified experiment count.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHpoExperimentsResponseBody build() {
            return new ListHpoExperimentsResponseBody(this);
        } 

    } 

    public static class Experiments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accessibility")
        private String accessibility;

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

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

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

        private Experiments(Builder builder) {
            this.accessibility = builder.accessibility;
            this.configIni = builder.configIni;
            this.configYml = builder.configYml;
            this.creator = builder.creator;
            this.deleted = builder.deleted;
            this.description = builder.description;
            this.experimentId = builder.experimentId;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.jobType = builder.jobType;
            this.name = builder.name;
            this.searchSpace = builder.searchSpace;
            this.status = builder.status;
            this.trialCount = builder.trialCount;
            this.trialStatus = builder.trialStatus;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Experiments create() {
            return builder().build();
        }

        /**
         * @return accessibility
         */
        public String getAccessibility() {
            return this.accessibility;
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
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String configIni; 
            private String configYml; 
            private String creator; 
            private Boolean deleted; 
            private String description; 
            private String experimentId; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String jobType; 
            private String name; 
            private String searchSpace; 
            private String status; 
            private Integer trialCount; 
            private java.util.Map < String, String > trialStatus; 
            private String workspaceId; 

            /**
             * Experiment accessibility, private or public.
             */
            public Builder accessibility(String accessibility) {
                this.accessibility = accessibility;
                return this;
            }

            /**
             * Experiment job run environment configurations.
             */
            public Builder configIni(String configIni) {
                this.configIni = configIni;
                return this;
            }

            /**
             * HPO experiment run configuration.
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
             * If the experiment is deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * The description of the experiment.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Experiment Create Time.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * Last modified time.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * Experimetn job type.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * Experiment name
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Experiment hyperparameter search space.
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
             * How many trials the experiment have.
             */
            public Builder trialCount(Integer trialCount) {
                this.trialCount = trialCount;
                return this;
            }

            /**
             * Trial status map.
             */
            public Builder trialStatus(java.util.Map < String, String > trialStatus) {
                this.trialStatus = trialStatus;
                return this;
            }

            /**
             * The ID of the AI workspace.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Experiments build() {
                return new Experiments(this);
            } 

        } 

    }
}
