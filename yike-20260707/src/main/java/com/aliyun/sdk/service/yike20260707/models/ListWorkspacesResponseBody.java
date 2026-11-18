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
 * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspacesResponseBody</p>
 */
public class ListWorkspacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WorkspaceList")
    private java.util.List<WorkspaceList> workspaceList;

    private ListWorkspacesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workspaceList = builder.workspaceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workspaceList
     */
    public java.util.List<WorkspaceList> getWorkspaceList() {
        return this.workspaceList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<WorkspaceList> workspaceList; 

        private Builder() {
        } 

        private Builder(ListWorkspacesResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.workspaceList = model.workspaceList;
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

        /**
         * <p>The total number of workspaces that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of workspaces on the current page.</p>
         */
        public Builder workspaceList(java.util.List<WorkspaceList> workspaceList) {
            this.workspaceList = workspaceList;
            return this;
        }

        public ListWorkspacesResponseBody build() {
            return new ListWorkspacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class WorkspaceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultProjectId")
        private String defaultProjectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UserCount")
        private String userCount;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private WorkspaceList(Builder builder) {
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.defaultProjectId = builder.defaultProjectId;
            this.status = builder.status;
            this.title = builder.title;
            this.userCount = builder.userCount;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkspaceList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultProjectId
         */
        public String getDefaultProjectId() {
            return this.defaultProjectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return userCount
         */
        public String getUserCount() {
            return this.userCount;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String code; 
            private String createTime; 
            private String defaultProjectId; 
            private String status; 
            private String title; 
            private String userCount; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(WorkspaceList model) {
                this.code = model.code;
                this.createTime = model.createTime;
                this.defaultProjectId = model.defaultProjectId;
                this.status = model.status;
                this.title = model.title;
                this.userCount = model.userCount;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The workspace code.</p>
             * 
             * <strong>example:</strong>
             * <p>c40***</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The creation time. The time follows the ISO 8601 standard and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-07T02:21:36Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the default project for the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>pd_061716****</p>
             */
            public Builder defaultProjectId(String defaultProjectId) {
                this.defaultProjectId = defaultProjectId;
                return this;
            }

            /**
             * <p>The workspace status. Valid values: Online: enabled. Offline: disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The workspace name.</p>
             * 
             * <strong>example:</strong>
             * <p>Video Production Workspace</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The current number of users in the workspace, returned as a string.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder userCount(String userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws_zna577pdximv***</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public WorkspaceList build() {
                return new WorkspaceList(this);
            } 

        } 

    }
}
