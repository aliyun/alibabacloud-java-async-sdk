// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetEditingProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetEditingProjectResponseBody</p>
 */
public class GetEditingProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Project")
    private Project project;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the online editing project.</p>
         */
        public Builder project(Project project) {
            this.project = project;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEditingProjectResponseBody build() {
            return new GetEditingProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEditingProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetEditingProjectResponseBody</p>
     */
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessConfig")
        private String businessConfig;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("ClipsParam")
        private String clipsParam;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreateSource")
        private String createSource;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("ModifiedSource")
        private String modifiedSource;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectType")
        private String projectType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("Timeline")
        private String timeline;

        @com.aliyun.core.annotation.NameInMap("TimelineConvertErrorMessage")
        private String timelineConvertErrorMessage;

        @com.aliyun.core.annotation.NameInMap("TimelineConvertStatus")
        private String timelineConvertStatus;

        @com.aliyun.core.annotation.NameInMap("Title")
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
             * <p>The business configuration of the project. This parameter can be ignored for general editing projects.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;OutputMediaConfig&quot; : { &quot;StorageLocation&quot;: &quot;test-bucket.oss-cn-shanghai.aliyuncs.com&quot;, &quot;Path&quot;: &quot;test-path&quot; }, &quot;OutputMediaTarget&quot;: &quot;oss-object&quot;, &quot;ReservationTime&quot;: &quot;2021-06-21T08:05:00Z&quot; }</p>
             */
            public Builder businessConfig(String businessConfig) {
                this.businessConfig = businessConfig;
                return this;
            }

            /**
             * <p>The business status of the project. This parameter can be ignored for general editing projects. Valid values:</p>
             * <p>Reserving</p>
             * <p>ReservationCanceled</p>
             * <p>BroadCasting</p>
             * <p>LoadingFailed</p>
             * <p>LiveFinished</p>
             * 
             * <strong>example:</strong>
             * <p>Reserving</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The material parameter corresponding to the template, in the JSON format. If TemplateId is specified, ClipsParam must also be specified. For more information&lt;props=&quot;china&quot;&gt;, see <a href="https://help.aliyun.com/document_detail/328557.html">Create and use a regular template</a> and <a href="https://help.aliyun.com/document_detail/291418.html">Create and use an advanced template</a>.</p>
             */
            public Builder clipsParam(String clipsParam) {
                this.clipsParam = clipsParam;
                return this;
            }

            /**
             * <p>The thumbnail URL of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://example-bucket/example.jpg</p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The method for creating the online editing project. Valid values:</p>
             * <p>- OpenAPI</p>
             * <p>- AliyunConsole</p>
             * <p>- WebSDK</p>
             * <p>- LiveEditingOpenAPI</p>
             * <p>- LiveEditingConsole</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAPI</p>
             */
            public Builder createSource(String createSource) {
                this.createSource = createSource;
                return this;
            }

            /**
             * <p>The time when the online editing project was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the online editing project.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The total duration of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>24.120000</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The method for editing the online editing project. Valid values:</p>
             * <p>- OpenAPI</p>
             * <p>- AliyunConsole</p>
             * <p>- WebSDK</p>
             * <p>- LiveEditingOpenAPI</p>
             * <p>- LiveEditingConsole</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAPI</p>
             */
            public Builder modifiedSource(String modifiedSource) {
                this.modifiedSource = modifiedSource;
                return this;
            }

            /**
             * <p>The time when the online editing project was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T13:00:00Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>fb2101bf24b2754cb318787dc</strong></strong></p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The type of the editing project. Default value: EditingProject. Valid values:</p>
             * <p>- EditingProject: a regular editing project.</p>
             * <p>- LiveEditingProject: a live stream editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>EditingProject</p>
             */
            public Builder projectType(String projectType) {
                this.projectType = projectType;
                return this;
            }

            /**
             * <p>The status of the online editing project. Valid values:</p>
             * <p>- Draft</p>
             * <p>- Editing</p>
             * <p>- Producing</p>
             * <p>- Produced</p>
             * <p>- ProduceFailed</p>
             * <p>- Deleted</p>
             * 
             * <strong>example:</strong>
             * <p>Editing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template type of the online editing project. Valid values:</p>
             * <p>- Timeline</p>
             * <p>- VETemplate</p>
             * 
             * <strong>example:</strong>
             * <p>Timeline</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The timeline of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>9b4d7cf14dc7b83b0e801cbe</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>9b4d7cf14dc7b83b0e801cbe</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>1656bca4474999c961a6d2a2</strong></strong>&quot;}]}]}</p>
             */
            public Builder timeline(String timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * <p>The error message returned if the project conversion failed. The error message displays the detailed information about the failure, and is returned only if the value of TimelineConvertStatus is ConvertFailed.</p>
             * 
             * <strong>example:</strong>
             * <p>The StorageLocation must be in the same division(apiRegion) as ICE service access point.</p>
             */
            public Builder timelineConvertErrorMessage(String timelineConvertErrorMessage) {
                this.timelineConvertErrorMessage = timelineConvertErrorMessage;
                return this;
            }

            /**
             * <p>The project conversion status. Conversion of an API-style timeline into a frontend-style timeline is an asynchronous process and takes effect only if RequestSource:WebSDK is specified.</p>
             * <p>- Unconverted</p>
             * <p>- Converting</p>
             * <p>- Converted</p>
             * <p>- ConvertFailed</p>
             * 
             * <strong>example:</strong>
             * <p>Converted</p>
             */
            public Builder timelineConvertStatus(String timelineConvertStatus) {
                this.timelineConvertStatus = timelineConvertStatus;
                return this;
            }

            /**
             * <p>The title of the online editing project.</p>
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
