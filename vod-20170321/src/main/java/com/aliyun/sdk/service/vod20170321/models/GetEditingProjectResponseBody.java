// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>63E8B7C7-4812-46*****AD-0FA56029AC86</p>
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
        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

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

        @com.aliyun.core.annotation.NameInMap("Timeline")
        private String timeline;

        @com.aliyun.core.annotation.NameInMap("Title")
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
             * <p>The thumbnail URL of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>https://<strong><strong>.com/6AB4D0E1E1C74468883516C2349</strong></strong>.png</p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the online editing project was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-10-23T13:33:40Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>testdescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The last time when the online editing project was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-10-23T14:27:26Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>fb2101bf24b27*****54cb318787dc</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The region where the online editing project was created.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the online editing project. Separate multiple states with commas (,). By default, all online editing projects were queried. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: indicates that the online editing project is in draft.</li>
             * <li><strong>Producing</strong>: indicates that the video is being produced.</li>
             * <li><strong>Produced</strong>: indicates that the video was produced.</li>
             * <li><strong>ProduceFailed</strong>: indicates that the video failed to be produced.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The path of the Object Storage Service (OSS) bucket where the online editing project is stored.</p>
             * <blockquote>
             * <p>To view the path of the OSS bucket, log on to the <a href="https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored">ApsaraVideo VOD console</a>, and choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong>. On the Storage page, you can view the path of the OSS bucket.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>location_s</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The timeline of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;TimelineIn&quot;:0,&quot;TimelineOut&quot;:9.42}</p>
             */
            public Builder timeline(String timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * <p>The title of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>video_1508736815000</p>
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
