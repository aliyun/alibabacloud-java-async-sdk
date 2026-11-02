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
 * {@link ListEditingProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEditingProjectsResponseBody</p>
 */
public class ListEditingProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProjectList")
    private java.util.List<ProjectList> projectList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEditingProjectsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.projectList = builder.projectList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEditingProjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
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

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<ProjectList> projectList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListEditingProjectsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.projectList = model.projectList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The maximum number of records returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. An empty value indicates that all data has been read.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Nzv3rcKla9wHUGua9YXHNA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of cloud editing projects.</p>
         */
        public Builder projectList(java.util.List<ProjectList> projectList) {
            this.projectList = projectList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong><strong>ACB-44F2-5F2D-88D7-1283E70</strong></strong></em></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEditingProjectsResponseBody build() {
            return new ListEditingProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEditingProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEditingProjectsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ProjectList(Builder builder) {
            this.businessConfig = builder.businessConfig;
            this.businessStatus = builder.businessStatus;
            this.coverURL = builder.coverURL;
            this.createSource = builder.createSource;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.modifiedSource = builder.modifiedSource;
            this.modifiedTime = builder.modifiedTime;
            this.projectId = builder.projectId;
            this.projectType = builder.projectType;
            this.status = builder.status;
            this.templateType = builder.templateType;
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
            private String errorCode; 
            private String errorMessage; 
            private String modifiedSource; 
            private String modifiedTime; 
            private String projectId; 
            private String projectType; 
            private String status; 
            private String templateType; 
            private String title; 

            private Builder() {
            } 

            private Builder(ProjectList model) {
                this.businessConfig = model.businessConfig;
                this.businessStatus = model.businessStatus;
                this.coverURL = model.coverURL;
                this.createSource = model.createSource;
                this.createTime = model.createTime;
                this.description = model.description;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.modifiedSource = model.modifiedSource;
                this.modifiedTime = model.modifiedTime;
                this.projectId = model.projectId;
                this.projectType = model.projectType;
                this.status = model.status;
                this.templateType = model.templateType;
                this.title = model.title;
            } 

            /**
             * <p>The business configuration of the project. You can ignore this parameter for regular editing projects.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder businessConfig(String businessConfig) {
                this.businessConfig = businessConfig;
                return this;
            }

            /**
             * <p>The business status of the project. You can ignore this parameter for regular editing projects.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The URL of the cover image for the cloud editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.com/cover/xxx.jpg">https://xxx.com/cover/xxx.jpg</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The creation source of the cloud editing project. Valid values:</p>
             * <ul>
             * <li>OpenAPI</li>
             * <li>AliyunConsole</li>
             * <li>WebSDK</li>
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
             * <p>The creation time of the cloud editing project. The time is in the ISO 8601 standard and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the cloud editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>Project description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The error code returned when the production of the cloud editing project fails.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when the production of the cloud editing project fails.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified parameter \&quot;LiveStreamConfig\&quot; is not valid. specified parameter example is not valid.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The source of the last modification.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAPI</p>
             */
            public Builder modifiedSource(String modifiedSource) {
                this.modifiedSource = modifiedSource;
                return this;
            }

            /**
             * <p>The last modification time of the cloud editing project. The time is in the ISO 8601 standard and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the cloud editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The type of the editing project. Valid values:</p>
             * <ul>
             * <li>EditingProject: regular editing project.</li>
             * <li>LiveEditingProject: live editing project.</li>
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
             * <p>The status of the cloud editing project. Valid values:</p>
             * <ul>
             * <li>Draft</li>
             * <li>Editing</li>
             * <li>Producing</li>
             * <li>Produced</li>
             * <li>ProduceFailed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Produced</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The templatetype. Valid values:</p>
             * <ul>
             * <li>Timeline: regular template.</li>
             * <li>VETemplate: advanced template.</li>
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
             * <p>The title of the cloud editing project.</p>
             * 
             * <strong>example:</strong>
             * <p>Project title</p>
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
