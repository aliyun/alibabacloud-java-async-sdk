// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The list of online editing projects.</p>
         */
        public Builder projectList(ProjectList projectList) {
            this.projectList = projectList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9262E3DA-07FA-48*****62-FCBB6BC61D08</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of online editing projects returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public SearchEditingProjectResponseBody build() {
            return new SearchEditingProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchEditingProjectResponseBody} extends {@link TeaModel}
     *
     * <p>SearchEditingProjectResponseBody</p>
     */
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
             * <p>The thumbnail URL of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>cover_url</p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the online editing project was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>test project 001</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The duration of the online editing project, which must be consistent with the duration of the timeline.</p>
             * <blockquote>
             * <p>The Timeline parameter is not included in response parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>22.65</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The last time when the online editing project was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T13:00:00Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>25cfc178d2de4*****e77aebed6afcd</p>
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
             * <p>The path of the Object Storage Service (OSS) bucket where the produced video is stored.</p>
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
             * <p>The title of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>video_150873681****</p>
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
    /**
     * 
     * {@link SearchEditingProjectResponseBody} extends {@link TeaModel}
     *
     * <p>SearchEditingProjectResponseBody</p>
     */
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
