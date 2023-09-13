// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchEditingProjectResponseBody} extends {@link TeaModel}
 *
 * <p>SearchEditingProjectResponseBody</p>
 */
public class SearchEditingProjectResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("ProjectList")
    private java.util.List < ProjectList> projectList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private SearchEditingProjectResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.projectList = builder.projectList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchEditingProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return projectList
     */
    public java.util.List < ProjectList> getProjectList() {
        return this.projectList;
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
        private Long maxResults; 
        private String nextToken; 
        private java.util.List < ProjectList> projectList; 
        private String requestId; 
        private Long totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ProjectList.
         */
        public Builder projectList(java.util.List < ProjectList> projectList) {
            this.projectList = projectList;
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

        public SearchEditingProjectResponseBody build() {
            return new SearchEditingProjectResponseBody(this);
        } 

    } 

    public static class ProjectList extends TeaModel {
        @NameInMap("BusinessConfig")
        private String businessConfig;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("CreateSource")
        private String createSource;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ModifiedSource")
        private String modifiedSource;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("ProjectType")
        private String projectType;

        @NameInMap("Status")
        private String status;

        @NameInMap("TemplateType")
        private String templateType;

        @NameInMap("Timeline")
        private String timeline;

        @NameInMap("Title")
        private String title;

        private ProjectList(Builder builder) {
            this.businessConfig = builder.businessConfig;
            this.businessStatus = builder.businessStatus;
            this.coverURL = builder.coverURL;
            this.createSource = builder.createSource;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.duration = builder.duration;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.modifiedSource = builder.modifiedSource;
            this.modifiedTime = builder.modifiedTime;
            this.projectId = builder.projectId;
            this.projectType = builder.projectType;
            this.status = builder.status;
            this.templateType = builder.templateType;
            this.timeline = builder.timeline;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectList create() {
            return builder().build();
        }

        /**
         * @return businessConfig
         */
        public String getBusinessConfig() {
            return this.businessConfig;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return createSource
         */
        public String getCreateSource() {
            return this.createSource;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return modifiedSource
         */
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectType
         */
        public String getProjectType() {
            return this.projectType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return timeline
         */
        public String getTimeline() {
            return this.timeline;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String businessConfig; 
            private String businessStatus; 
            private String coverURL; 
            private String createSource; 
            private String createTime; 
            private String description; 
            private Long duration; 
            private String errorCode; 
            private String errorMessage; 
            private String modifiedSource; 
            private String modifiedTime; 
            private String projectId; 
            private String projectType; 
            private String status; 
            private String templateType; 
            private String timeline; 
            private String title; 

            /**
             * BusinessConfig.
             */
            public Builder businessConfig(String businessConfig) {
                this.businessConfig = businessConfig;
                return this;
            }

            /**
             * BusinessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * CoverURL.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * CreateSource.
             */
            public Builder createSource(String createSource) {
                this.createSource = createSource;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * ModifiedSource.
             */
            public Builder modifiedSource(String modifiedSource) {
                this.modifiedSource = modifiedSource;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
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
             * ProjectType.
             */
            public Builder projectType(String projectType) {
                this.projectType = projectType;
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
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * Timeline.
             */
            public Builder timeline(String timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ProjectList build() {
                return new ProjectList(this);
            } 

        } 

    }
}
