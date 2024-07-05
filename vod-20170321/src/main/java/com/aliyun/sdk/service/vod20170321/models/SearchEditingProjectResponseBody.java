// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchEditingProjectResponseBody} extends {@link TeaModel}
 *
 * <p>SearchEditingProjectResponseBody</p>
 */
public class SearchEditingProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectList")
    private ProjectList projectList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private SearchEditingProjectResponseBody(Builder builder) {
        this.projectList = builder.projectList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchEditingProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return projectList
     */
    public ProjectList getProjectList() {
        return this.projectList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private ProjectList projectList; 
        private String requestId; 
        private Integer total; 

        /**
         * The list of online editing projects.
         */
        public Builder projectList(ProjectList projectList) {
            this.projectList = projectList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of online editing projects returned.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public SearchEditingProjectResponseBody build() {
            return new SearchEditingProjectResponseBody(this);
        } 

    } 

    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageLocation")
        private String storageLocation;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Project(Builder builder) {
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.duration = builder.duration;
            this.modifiedTime = builder.modifiedTime;
            this.projectId = builder.projectId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
            return builder().build();
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageLocation
         */
        public String getStorageLocation() {
            return this.storageLocation;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String coverURL; 
            private String creationTime; 
            private String description; 
            private Float duration; 
            private String modifiedTime; 
            private String projectId; 
            private String regionId; 
            private String status; 
            private String storageLocation; 
            private String title; 

            /**
             * The thumbnail URL of the online editing project.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The time when the online editing project was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the online editing project.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The duration of the online editing project, which must be consistent with the duration of the timeline.
             * <p>
             * > The Timeline parameter is not included in response parameters.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The last time when the online editing project was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The ID of the online editing project.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The region where the online editing project was created.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the online editing project. Separate multiple states with commas (,). By default, all online editing projects were queried. Valid values:
             * <p>
             * *   **Normal**: indicates that the online editing project is in draft.
             * *   **Producing**: indicates that the video is being produced.
             * *   **Produced**: indicates that the video was produced.
             * *   **ProduceFailed**: indicates that the video failed to be produced.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The path of the Object Storage Service (OSS) bucket where the produced video is stored.
             * <p>
             * > To view the path of the OSS bucket, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored), and choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, you can view the path of the OSS bucket.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The title of the online editing project.
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
    public static class ProjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Project")
        private java.util.List < Project> project;

        private ProjectList(Builder builder) {
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectList create() {
            return builder().build();
        }

        /**
         * @return project
         */
        public java.util.List < Project> getProject() {
            return this.project;
        }

        public static final class Builder {
            private java.util.List < Project> project; 

            /**
             * Project.
             */
            public Builder project(java.util.List < Project> project) {
                this.project = project;
                return this;
            }

            public ProjectList build() {
                return new ProjectList(this);
            } 

        } 

    }
}
