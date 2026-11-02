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
 * {@link CreateEditingProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEditingProjectResponseBody</p>
 */
public class CreateEditingProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Project")
    private Project project;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEditingProjectResponseBody(Builder builder) {
        this.project = builder.project;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEditingProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateEditingProjectResponseBody model) {
            this.project = model.project;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cloud editing project.</p>
         */
        public Builder project(Project project) {
            this.project = project;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEditingProjectResponseBody build() {
            return new CreateEditingProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateEditingProjectResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEditingProjectResponseBody</p>
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
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("ModifiedSource")
        private String modifiedSource;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectType")
        private String projectType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("StatusName")
        private String statusName;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("Timeline")
        private String timeline;

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
            this.statusName = builder.statusName;
            this.templateId = builder.templateId;
            this.templateType = builder.templateType;
            this.timeline = builder.timeline;
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
        public Float getDuration() {
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
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
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
            private Float duration; 
            private String modifiedSource; 
            private String modifiedTime; 
            private String projectId; 
            private String projectType; 
            private Long status; 
            private String statusName; 
            private String templateId; 
            private String templateType; 
            private String timeline; 
            private String title; 

            private Builder() {
            } 

            private Builder(Project model) {
                this.businessConfig = model.businessConfig;
                this.businessStatus = model.businessStatus;
                this.clipsParam = model.clipsParam;
                this.coverURL = model.coverURL;
                this.createSource = model.createSource;
                this.createTime = model.createTime;
                this.description = model.description;
                this.duration = model.duration;
                this.modifiedSource = model.modifiedSource;
                this.modifiedTime = model.modifiedTime;
                this.projectId = model.projectId;
                this.projectType = model.projectType;
                this.status = model.status;
                this.statusName = model.statusName;
                this.templateId = model.templateId;
                this.templateType = model.templateType;
                this.timeline = model.timeline;
                this.title = model.title;
            } 

            /**
             * <p>The business configuration of the project. You can ignore this parameter for standard editing projects.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;OutputMediaConfig&quot; :    { &quot;StorageLocation&quot;: &quot;test-bucket.oss-cn-shanghai.aliyuncs.com&quot;, &quot;Path&quot;: &quot;test-path&quot;   }, &quot;OutputMediaTarget&quot;: &quot;oss-object&quot;, &quot;ReservationTime&quot;: &quot;2021-06-21T08:05:00Z&quot; }</p>
             */
            public Builder businessConfig(String businessConfig) {
                this.businessConfig = businessConfig;
                return this;
            }

            /**
             * <p>The business status of the project. You can ignore this parameter for standard editing projects.</p>
             * <ul>
             * <li><p>Reserving</p>
             * </li>
             * <li><p>ReservationCanceled </p>
             * </li>
             * <li><p>BroadCasting</p>
             * </li>
             * <li><p>LoadingFailed</p>
             * </li>
             * <li><p>LiveFinished</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Reserving</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The material parameters for the template.</p>
             * 
             * <strong>example:</strong>
             * <p>See the template documentation</p>
             */
            public Builder clipsParam(String clipsParam) {
                this.clipsParam = clipsParam;
                return this;
            }

            /**
             * <p>The cover of the cloud editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The method used to create the cloud editing project.</p>
             * <ul>
             * <li><p>OpenAPI</p>
             * </li>
             * <li><p>AliyunConsole</p>
             * </li>
             * <li><p>WebSDK</p>
             * </li>
             * <li><p>LiveEditingOpenAPI </p>
             * </li>
             * <li><p>LiveEditingConsole</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WebSDK</p>
             */
            public Builder createSource(String createSource) {
                this.createSource = createSource;
                return this;
            }

            /**
             * <p>The time when the cloud editing project was created. The time follows the ISO 8601 standard and is displayed in UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-08T16:52:07Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>example_description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The duration of the cloud editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>3.4200000</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The method used to modify the cloud editing project.</p>
             * <ul>
             * <li>OpenAPI</li>
             * <li>AliyunConsole</li>
             * <li>WebSDK</li>
             * <li>LiveEditingOpenAPI </li>
             * <li>LiveEditingConsole</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WebSDK</p>
             */
            public Builder modifiedSource(String modifiedSource) {
                this.modifiedSource = modifiedSource;
                return this;
            }

            /**
             * <p>The time when the cloud editing project was modified. The time follows the ISO 8601 standard and is displayed in UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-08T16:52:07Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the cloud editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>01bf24bf41c78b2754cb3187</strong></strong></p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The type of the editing project. Default value: EditingProject.</p>
             * <ul>
             * <li><p>EditingProject: standard editing project.</p>
             * </li>
             * <li><p>LiveEditingProject: live streaming editing project.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LiveEditingProject</p>
             */
            public Builder projectType(String projectType) {
                this.projectType = projectType;
                return this;
            }

            /**
             * <p>The status of the cloud editing project.</p>
             * <p>All cloud editing project statuses:</p>
             * <ul>
             * <li><p>1: Draft.</p>
             * </li>
             * <li><p>2: Editing.</p>
             * </li>
             * <li><p>3: Producing.</p>
             * </li>
             * <li><p>4: Produced.</p>
             * </li>
             * <li><p>5: ProduceFailed.</p>
             * </li>
             * <li><p>7: Deleted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the cloud editing status, which corresponds to the status name in the status list.</p>
             * 
             * <strong>example:</strong>
             * <p>Editing</p>
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
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
             * <p>The template type of the cloud editing project.</p>
             * <ul>
             * <li><p>Timeline</p>
             * </li>
             * <li><p>VETemplate</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Timeline</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The timeline of the cloud editing project in JSON format. For more information about the structure, see <a href="~~198823#topic-2024662~~">TimeLine</a>. If this field is empty, an empty timeline is created and the total duration of the cloud editing project is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
             */
            public Builder timeline(String timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * <p>The title of the cloud editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>example_title</p>
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
