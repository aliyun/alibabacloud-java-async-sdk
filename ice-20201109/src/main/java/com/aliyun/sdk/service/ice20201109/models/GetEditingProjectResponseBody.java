// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEditingProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetEditingProjectResponseBody</p>
 */
public class GetEditingProjectResponseBody extends TeaModel {
    @NameInMap("Project")
    private Project project;

    @NameInMap("RequestId")
    private String requestId;

    private GetEditingProjectResponseBody(Builder builder) {
        this.project = builder.project;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEditingProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return project
     */
    public Project getProject() {
        return this.project;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Project project; 
        private String requestId; 

        /**
         * Project.
         */
        public Builder project(Project project) {
            this.project = project;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEditingProjectResponseBody build() {
            return new GetEditingProjectResponseBody(this);
        } 

    } 

    public static class Project extends TeaModel {
        @NameInMap("BusinessConfig")
        private String businessConfig;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("ClipsParam")
        private String clipsParam;

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

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateType")
        private String templateType;

        @NameInMap("Timeline")
        private String timeline;

        @NameInMap("TimelineConvertErrorMessage")
        private String timelineConvertErrorMessage;

        @NameInMap("TimelineConvertStatus")
        private String timelineConvertStatus;

        @NameInMap("Title")
        private String title;

        private Project(Builder builder) {
            this.businessConfig = builder.businessConfig;
            this.businessStatus = builder.businessStatus;
            this.clipsParam = builder.clipsParam;
            this.coverURL = builder.coverURL;
            this.createSource = builder.createSource;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.duration = builder.duration;
            this.modifiedSource = builder.modifiedSource;
            this.modifiedTime = builder.modifiedTime;
            this.projectId = builder.projectId;
            this.projectType = builder.projectType;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.templateType = builder.templateType;
            this.timeline = builder.timeline;
            this.timelineConvertErrorMessage = builder.timelineConvertErrorMessage;
            this.timelineConvertStatus = builder.timelineConvertStatus;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
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
         * @return clipsParam
         */
        public String getClipsParam() {
            return this.clipsParam;
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
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
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
         * @return timelineConvertErrorMessage
         */
        public String getTimelineConvertErrorMessage() {
            return this.timelineConvertErrorMessage;
        }

        /**
         * @return timelineConvertStatus
         */
        public String getTimelineConvertStatus() {
            return this.timelineConvertStatus;
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
            private String clipsParam; 
            private String coverURL; 
            private String createSource; 
            private String createTime; 
            private String description; 
            private Long duration; 
            private String modifiedSource; 
            private String modifiedTime; 
            private String projectId; 
            private String projectType; 
            private String status; 
            private String templateId; 
            private String templateType; 
            private String timeline; 
            private String timelineConvertErrorMessage; 
            private String timelineConvertStatus; 
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
             * ClipsParam.
             */
            public Builder clipsParam(String clipsParam) {
                this.clipsParam = clipsParam;
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
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
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
             * TimelineConvertErrorMessage.
             */
            public Builder timelineConvertErrorMessage(String timelineConvertErrorMessage) {
                this.timelineConvertErrorMessage = timelineConvertErrorMessage;
                return this;
            }

            /**
             * TimelineConvertStatus.
             */
            public Builder timelineConvertStatus(String timelineConvertStatus) {
                this.timelineConvertStatus = timelineConvertStatus;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Project build() {
                return new Project(this);
            } 

        } 

    }
}
