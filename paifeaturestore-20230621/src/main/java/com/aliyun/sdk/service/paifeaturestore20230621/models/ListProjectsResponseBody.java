// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Projects")
    private java.util.List < Projects> projects;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListProjectsResponseBody(Builder builder) {
        this.projects = builder.projects;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return projects
     */
    public java.util.List < Projects> getProjects() {
        return this.projects;
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
        private java.util.List < Projects> projects; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Projects.
         */
        public Builder projects(java.util.List < Projects> projects) {
            this.projects = projects;
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

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FeatureEntityCount")
        private Integer featureEntityCount;

        @com.aliyun.core.annotation.NameInMap("FeatureViewCount")
        private Integer featureViewCount;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ModelCount")
        private Integer modelCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OfflineDatasourceId")
        private String offlineDatasourceId;

        @com.aliyun.core.annotation.NameInMap("OfflineDatasourceName")
        private String offlineDatasourceName;

        @com.aliyun.core.annotation.NameInMap("OfflineDatasourceType")
        private String offlineDatasourceType;

        @com.aliyun.core.annotation.NameInMap("OfflineLifecycle")
        private Integer offlineLifecycle;

        @com.aliyun.core.annotation.NameInMap("OnlineDatasourceId")
        private String onlineDatasourceId;

        @com.aliyun.core.annotation.NameInMap("OnlineDatasourceName")
        private String onlineDatasourceName;

        @com.aliyun.core.annotation.NameInMap("OnlineDatasourceType")
        private String onlineDatasourceType;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        private Projects(Builder builder) {
            this.description = builder.description;
            this.featureEntityCount = builder.featureEntityCount;
            this.featureViewCount = builder.featureViewCount;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.modelCount = builder.modelCount;
            this.name = builder.name;
            this.offlineDatasourceId = builder.offlineDatasourceId;
            this.offlineDatasourceName = builder.offlineDatasourceName;
            this.offlineDatasourceType = builder.offlineDatasourceType;
            this.offlineLifecycle = builder.offlineLifecycle;
            this.onlineDatasourceId = builder.onlineDatasourceId;
            this.onlineDatasourceName = builder.onlineDatasourceName;
            this.onlineDatasourceType = builder.onlineDatasourceType;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return featureEntityCount
         */
        public Integer getFeatureEntityCount() {
            return this.featureEntityCount;
        }

        /**
         * @return featureViewCount
         */
        public Integer getFeatureViewCount() {
            return this.featureViewCount;
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
         * @return modelCount
         */
        public Integer getModelCount() {
            return this.modelCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return offlineDatasourceId
         */
        public String getOfflineDatasourceId() {
            return this.offlineDatasourceId;
        }

        /**
         * @return offlineDatasourceName
         */
        public String getOfflineDatasourceName() {
            return this.offlineDatasourceName;
        }

        /**
         * @return offlineDatasourceType
         */
        public String getOfflineDatasourceType() {
            return this.offlineDatasourceType;
        }

        /**
         * @return offlineLifecycle
         */
        public Integer getOfflineLifecycle() {
            return this.offlineLifecycle;
        }

        /**
         * @return onlineDatasourceId
         */
        public String getOnlineDatasourceId() {
            return this.onlineDatasourceId;
        }

        /**
         * @return onlineDatasourceName
         */
        public String getOnlineDatasourceName() {
            return this.onlineDatasourceName;
        }

        /**
         * @return onlineDatasourceType
         */
        public String getOnlineDatasourceType() {
            return this.onlineDatasourceType;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String description; 
            private Integer featureEntityCount; 
            private Integer featureViewCount; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private Integer modelCount; 
            private String name; 
            private String offlineDatasourceId; 
            private String offlineDatasourceName; 
            private String offlineDatasourceType; 
            private Integer offlineLifecycle; 
            private String onlineDatasourceId; 
            private String onlineDatasourceName; 
            private String onlineDatasourceType; 
            private String owner; 
            private String projectId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FeatureEntityCount.
             */
            public Builder featureEntityCount(Integer featureEntityCount) {
                this.featureEntityCount = featureEntityCount;
                return this;
            }

            /**
             * FeatureViewCount.
             */
            public Builder featureViewCount(Integer featureViewCount) {
                this.featureViewCount = featureViewCount;
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
             * ModelCount.
             */
            public Builder modelCount(Integer modelCount) {
                this.modelCount = modelCount;
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
             * OfflineDatasourceId.
             */
            public Builder offlineDatasourceId(String offlineDatasourceId) {
                this.offlineDatasourceId = offlineDatasourceId;
                return this;
            }

            /**
             * OfflineDatasourceName.
             */
            public Builder offlineDatasourceName(String offlineDatasourceName) {
                this.offlineDatasourceName = offlineDatasourceName;
                return this;
            }

            /**
             * OfflineDatasourceType.
             */
            public Builder offlineDatasourceType(String offlineDatasourceType) {
                this.offlineDatasourceType = offlineDatasourceType;
                return this;
            }

            /**
             * OfflineLifecycle.
             */
            public Builder offlineLifecycle(Integer offlineLifecycle) {
                this.offlineLifecycle = offlineLifecycle;
                return this;
            }

            /**
             * OnlineDatasourceId.
             */
            public Builder onlineDatasourceId(String onlineDatasourceId) {
                this.onlineDatasourceId = onlineDatasourceId;
                return this;
            }

            /**
             * OnlineDatasourceName.
             */
            public Builder onlineDatasourceName(String onlineDatasourceName) {
                this.onlineDatasourceName = onlineDatasourceName;
                return this;
            }

            /**
             * OnlineDatasourceType.
             */
            public Builder onlineDatasourceType(String onlineDatasourceType) {
                this.onlineDatasourceType = onlineDatasourceType;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
}
