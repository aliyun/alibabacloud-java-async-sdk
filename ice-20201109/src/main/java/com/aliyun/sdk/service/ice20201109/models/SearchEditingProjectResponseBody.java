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
 * {@link SearchEditingProjectResponseBody} extends {@link TeaModel}
 *
 * <p>SearchEditingProjectResponseBody</p>
 */
public class SearchEditingProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProjectList")
    private java.util.List<ProjectList> projectList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<ProjectList> getProjectList() {
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
        private java.util.List<ProjectList> projectList; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The maximum number of entries returned on a single page. The value is set to the maximum number of entries returned on each page except for the last page.</p>
         * <p>Examples:</p>
         * <p>Valid example: 10,10,5. Invalid example: 10,5,10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The queried online editing projects.</p>
         */
        public Builder projectList(java.util.List<ProjectList> projectList) {
            this.projectList = projectList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>9262E3DA-07FA-4862-FCBB6BC61D08</strong></strong>*</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Optional. The total number of entries returned. By default, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>110</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
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
    public static class ProjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessConfig")
        private String businessConfig;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

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

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

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

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("Timeline")
        private String timeline;

        @com.aliyun.core.annotation.NameInMap("Title")
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
             * <p>Valid values:</p>
             * <ul>
             * <li>BroadCasting:</li>
             * <li>ReservationCanceled</li>
             * <li>LiveFinished</li>
             * <li>LoadingFailed</li>
             * <li>Reserving</li>
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
             * <p>The thumbnail URL of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example-cover.jpg">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example-cover.jpg</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The method for editing the online editing project.</p>
             * <p>-OpenAPI</p>
             * <p>-AliyunConsole</p>
             * <p>-WebSDK</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AliyunConsole: The project is created in the Alibaba Cloud console.</li>
             * <li>WebSDK: The project is created by using the SDK for Web.</li>
             * <li>OpenAPI: The project is created by calling API operations.</li>
             * </ul>
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
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>sample description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The total length of the online editing project. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30.100000</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The error code returned if the production of the online editing project failed.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned if the production of the online editing project failed.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;EventTime&quot;:&quot;2021-08-12T10:04:15Z&quot;,&quot;ErrorCode&quot;:&quot;InvalidParameter&quot;,&quot;ErrorMessage&quot;:&quot;The specified parameter &quot;LiveStreamConfig&quot; is not valid. specified parameter example is not valid.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The method used when the online editing project was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder modifiedSource(String modifiedSource) {
                this.modifiedSource = modifiedSource;
                return this;
            }

            /**
             * <p>The time when the online editing project was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The type of the editing project.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>LiveEditingProject: a live stream editing project.</li>
             * <li>EditingProject: a regular editing project.</li>
             * </ul>
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
             * <p>-Draft</p>
             * <p>-Editing</p>
             * <p>-Producing</p>
             * <p>-Produced</p>
             * <p>-ProduceFailed</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Draft</li>
             * <li>Produced</li>
             * <li>Editing</li>
             * <li>Producing</li>
             * <li>ProduceFailed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRODUCE_FAILED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the template.</p>
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
             * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
             */
            public Builder timeline(String timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * <p>The title of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>title</p>
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
