// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeaturesResponseBody</p>
 */
public class ListFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Features")
    private java.util.List < Features> features;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListFeaturesResponseBody(Builder builder) {
        this.features = builder.features;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeaturesResponseBody create() {
        return builder().build();
    }

    /**
     * @return features
     */
    public java.util.List < Features> getFeatures() {
        return this.features;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Features> features; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Features.
         */
        public Builder features(java.util.List < Features> features) {
            this.features = features;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFeaturesResponseBody build() {
            return new ListFeaturesResponseBody(this);
        } 

    } 

    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("ExperimentName")
        private String experimentName;

        @com.aliyun.core.annotation.NameInMap("ExperimentOwner")
        private String experimentOwner;

        @com.aliyun.core.annotation.NameInMap("ExperimentVersionId")
        private String experimentVersionId;

        @com.aliyun.core.annotation.NameInMap("ExperimentVersionName")
        private String experimentVersionName;

        @com.aliyun.core.annotation.NameInMap("FeatureId")
        private String featureId;

        @com.aliyun.core.annotation.NameInMap("Filter")
        private String filter;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Features(Builder builder) {
            this.config = builder.config;
            this.domainId = builder.domainId;
            this.domainName = builder.domainName;
            this.experimentId = builder.experimentId;
            this.experimentName = builder.experimentName;
            this.experimentOwner = builder.experimentOwner;
            this.experimentVersionId = builder.experimentVersionId;
            this.experimentVersionName = builder.experimentVersionName;
            this.featureId = builder.featureId;
            this.filter = builder.filter;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.releaseTime = builder.releaseTime;
            this.status = builder.status;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return experimentName
         */
        public String getExperimentName() {
            return this.experimentName;
        }

        /**
         * @return experimentOwner
         */
        public String getExperimentOwner() {
            return this.experimentOwner;
        }

        /**
         * @return experimentVersionId
         */
        public String getExperimentVersionId() {
            return this.experimentVersionId;
        }

        /**
         * @return experimentVersionName
         */
        public String getExperimentVersionName() {
            return this.experimentVersionName;
        }

        /**
         * @return featureId
         */
        public String getFeatureId() {
            return this.featureId;
        }

        /**
         * @return filter
         */
        public String getFilter() {
            return this.filter;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String config; 
            private String domainId; 
            private String domainName; 
            private String experimentId; 
            private String experimentName; 
            private String experimentOwner; 
            private String experimentVersionId; 
            private String experimentVersionName; 
            private String featureId; 
            private String filter; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String name; 
            private String projectId; 
            private String projectName; 
            private String releaseTime; 
            private String status; 
            private String workspaceId; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * DomainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
             * ExperimentName.
             */
            public Builder experimentName(String experimentName) {
                this.experimentName = experimentName;
                return this;
            }

            /**
             * ExperimentOwner.
             */
            public Builder experimentOwner(String experimentOwner) {
                this.experimentOwner = experimentOwner;
                return this;
            }

            /**
             * ExperimentVersionId.
             */
            public Builder experimentVersionId(String experimentVersionId) {
                this.experimentVersionId = experimentVersionId;
                return this;
            }

            /**
             * ExperimentVersionName.
             */
            public Builder experimentVersionName(String experimentVersionName) {
                this.experimentVersionName = experimentVersionName;
                return this;
            }

            /**
             * FeatureId.
             */
            public Builder featureId(String featureId) {
                this.featureId = featureId;
                return this;
            }

            /**
             * Filter.
             */
            public Builder filter(String filter) {
                this.filter = filter;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * ReleaseTime.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
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
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
}
