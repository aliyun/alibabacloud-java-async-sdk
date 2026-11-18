// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProjectList")
    private java.util.List<ProjectList> projectList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProjectsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.projectList = builder.projectList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
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

        private Builder(ListProjectsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.projectList = model.projectList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A response field retained for backward compatibility. This field is not used for pagination. Do not rely on this field.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A response field retained for backward compatibility. This field is not used for pagination. Do not rely on this field.</p>
         * 
         * <strong>example:</strong>
         * <p>Token</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of projects on the current page.</p>
         */
        public Builder projectList(java.util.List<ProjectList> projectList) {
            this.projectList = projectList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class ProjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Auth")
        private String auth;

        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private ProjectList(Builder builder) {
            this.auth = builder.auth;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.createUserName = builder.createUserName;
            this.description = builder.description;
            this.projectId = builder.projectId;
            this.title = builder.title;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectList create() {
            return builder().build();
        }

        /**
         * @return auth
         */
        public String getAuth() {
            return this.auth;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String auth; 
            private String coverUrl; 
            private String createTime; 
            private String createUserName; 
            private String description; 
            private String projectId; 
            private String title; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(ProjectList model) {
                this.auth = model.auth;
                this.coverUrl = model.coverUrl;
                this.createTime = model.createTime;
                this.createUserName = model.createUserName;
                this.description = model.description;
                this.projectId = model.projectId;
                this.title = model.title;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The permissions of the current caller in the project. For example, Manage indicates management permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>Manage</p>
             */
            public Builder auth(String auth) {
                this.auth = auth;
                return this;
            }

            /**
             * <p>The URL of the cover image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/cover.png">https://example.com/cover.png</a></p>
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * <p>The creation time. The time is in UTC and follows the ISO 8601 standard, ending with Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-07T02:21:36Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The username of the user who created the project.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_183320****</p>
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * <p>The description of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>Product demo project</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>pd_061716****</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>Product Demo</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>ws_zna577pdximv***</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public ProjectList build() {
                return new ProjectList(this);
            } 

        } 

    }
}
