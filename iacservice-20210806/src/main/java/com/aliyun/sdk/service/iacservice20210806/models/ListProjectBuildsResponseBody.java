// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListProjectBuildsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectBuildsResponseBody</p>
 */
public class ListProjectBuildsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectBuilds")
    private java.util.List<ProjectBuilds> projectBuilds;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListProjectBuildsResponseBody(Builder builder) {
        this.projectBuilds = builder.projectBuilds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectBuildsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectBuilds
     */
    public java.util.List<ProjectBuilds> getProjectBuilds() {
        return this.projectBuilds;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
        private java.util.List<ProjectBuilds> projectBuilds; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProjectBuildsResponseBody model) {
            this.projectBuilds = model.projectBuilds;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ProjectBuilds.
         */
        public Builder projectBuilds(java.util.List<ProjectBuilds> projectBuilds) {
            this.projectBuilds = projectBuilds;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>89154E16-FB0A-573D-8AF5-CF3F2FE28913</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProjectBuildsResponseBody build() {
            return new ListProjectBuildsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectBuildsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectBuildsResponseBody</p>
     */
    public static class ProjectBuilds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("projectBuildAction")
        private String projectBuildAction;

        @com.aliyun.core.annotation.NameInMap("projectBuildId")
        private String projectBuildId;

        @com.aliyun.core.annotation.NameInMap("projectBuildIndex")
        private Long projectBuildIndex;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("triggerStrategy")
        private String triggerStrategy;

        private ProjectBuilds(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.projectBuildAction = builder.projectBuildAction;
            this.projectBuildId = builder.projectBuildId;
            this.projectBuildIndex = builder.projectBuildIndex;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.terraformProviderVersion = builder.terraformProviderVersion;
            this.timestamp = builder.timestamp;
            this.triggerStrategy = builder.triggerStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectBuilds create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return projectBuildAction
         */
        public String getProjectBuildAction() {
            return this.projectBuildAction;
        }

        /**
         * @return projectBuildId
         */
        public String getProjectBuildId() {
            return this.projectBuildId;
        }

        /**
         * @return projectBuildIndex
         */
        public Long getProjectBuildIndex() {
            return this.projectBuildIndex;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return terraformProviderVersion
         */
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return triggerStrategy
         */
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

        public static final class Builder {
            private String createTime; 
            private String endTime; 
            private String projectBuildAction; 
            private String projectBuildId; 
            private Long projectBuildIndex; 
            private String projectId; 
            private String status; 
            private String terraformProviderVersion; 
            private Long timestamp; 
            private String triggerStrategy; 

            private Builder() {
            } 

            private Builder(ProjectBuilds model) {
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.projectBuildAction = model.projectBuildAction;
                this.projectBuildId = model.projectBuildId;
                this.projectBuildIndex = model.projectBuildIndex;
                this.projectId = model.projectId;
                this.status = model.status;
                this.terraformProviderVersion = model.terraformProviderVersion;
                this.timestamp = model.timestamp;
                this.triggerStrategy = model.triggerStrategy;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * projectBuildAction.
             */
            public Builder projectBuildAction(String projectBuildAction) {
                this.projectBuildAction = projectBuildAction;
                return this;
            }

            /**
             * projectBuildId.
             */
            public Builder projectBuildId(String projectBuildId) {
                this.projectBuildId = projectBuildId;
                return this;
            }

            /**
             * projectBuildIndex.
             */
            public Builder projectBuildIndex(Long projectBuildIndex) {
                this.projectBuildIndex = projectBuildIndex;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * terraformProviderVersion.
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * triggerStrategy.
             */
            public Builder triggerStrategy(String triggerStrategy) {
                this.triggerStrategy = triggerStrategy;
                return this;
            }

            public ProjectBuilds build() {
                return new ProjectBuilds(this);
            } 

        } 

    }
}
