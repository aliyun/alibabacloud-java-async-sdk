// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
    @NameInMap("ProjectList")
    private ProjectList projectList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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
         * The number of entries to return on each page. Default value: **10**. Maximum value: **100**.
         */
        public Builder projectList(ProjectList projectList) {
            this.projectList = projectList;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **SearchEditingProject**.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the online editing project was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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
        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageLocation")
        private String storageLocation;

        @NameInMap("Title")
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
             * The ID of the online editing project.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The end of the time range to query. The query is performed based on the time range during which the required online editing projects were created. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The thumbnail URL of the online editing project.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The number of the page to return. Default value: **1**.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Queries online editing projects.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The sorting rule of results. Valid values:
             * <p>
             * 
             * *   **CreationTime:Desc**: sorts the results based on the creation time in descending order. This is the default value.
             * *   **CreationTime:Asc**: sorts the results based on the creation time in ascending order.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The path of the Object Storage Service (OSS) bucket where the produced video is stored.
             * <p>
             * 
             * > To view the path of the OSS bucket, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored), and choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, you can view the path of the OSS bucket.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
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
    public static class ProjectList extends TeaModel {
        @NameInMap("Project")
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
