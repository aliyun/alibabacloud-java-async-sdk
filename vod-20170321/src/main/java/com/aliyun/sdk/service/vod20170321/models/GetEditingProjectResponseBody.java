// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * The region where the online editing project was created.
         */
        public Builder project(Project project) {
            this.project = project;
            return this;
        }

        /**
         * The ID of the online editing project.
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
        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

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

        @NameInMap("Timeline")
        private String timeline;

        @NameInMap("Title")
        private String title;

        private Project(Builder builder) {
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.modifiedTime = builder.modifiedTime;
            this.projectId = builder.projectId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
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
            private String coverURL; 
            private String creationTime; 
            private String description; 
            private String modifiedTime; 
            private String projectId; 
            private String regionId; 
            private String status; 
            private String storageLocation; 
            private String timeline; 
            private String title; 

            /**
             * The ID of the request.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The title of the online editing project.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The time when the online editing project was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The information about the online editing project.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * 58928
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
             * The path of the Object Storage Service (OSS) bucket where the online editing project is stored.
             * <p>
             * 
             * > To view the path of the OSS bucket, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored), and choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, you can view the path of the OSS bucket.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the online editing project.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * 朴灵
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

            public Project build() {
                return new Project(this);
            } 

        } 

    }
}
