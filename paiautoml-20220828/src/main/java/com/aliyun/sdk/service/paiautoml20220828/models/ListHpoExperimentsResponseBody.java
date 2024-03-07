// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoExperimentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHpoExperimentsResponseBody</p>
 */
public class ListHpoExperimentsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Detail")
    private java.util.Map < String, String > detail;

    @NameInMap("Experiments")
    private java.util.List < Experiments> experiments;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(java.util.Map < String, String > detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Experiments.
         */
        public Builder experiments(java.util.List < Experiments> experiments) {
            this.experiments = experiments;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("Accessibility")
        private String accessibility;

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

        @NameInMap("ExperimentId")
        private String experimentId;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("Name")
        private String name;

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
             * Accessibility.
             */
            public Builder accessibility(String accessibility) {
                this.accessibility = accessibility;
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
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
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

            public Experiments build() {
                return new Experiments(this);
            } 

        } 

    }
}
