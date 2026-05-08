// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link ListYikeWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListYikeWorkspacesResponseBody</p>
 */
public class ListYikeWorkspacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WorkspaceList")
    private java.util.List<WorkspaceList> workspaceList;

    private ListYikeWorkspacesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workspaceList = builder.workspaceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListYikeWorkspacesResponseBody create() {
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

        private Builder(ListYikeWorkspacesResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.workspaceList = model.workspaceList;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4E84BE44-58A7-<strong><strong>-</strong></strong>-FBEBEA16EF94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * WorkspaceList.
         */
        public Builder workspaceList(java.util.List<WorkspaceList> workspaceList) {
            this.workspaceList = workspaceList;
            return this;
        }

        public ListYikeWorkspacesResponseBody build() {
            return new ListYikeWorkspacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListYikeWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListYikeWorkspacesResponseBody</p>
     */
    public static class WorkspaceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultProductionId")
        private String defaultProductionId;

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
            this.defaultProductionId = builder.defaultProductionId;
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
         * @return defaultProductionId
         */
        public String getDefaultProductionId() {
            return this.defaultProductionId;
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
            private String defaultProductionId; 
            private String status; 
            private String title; 
            private String userCount; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(WorkspaceList model) {
                this.code = model.code;
                this.createTime = model.createTime;
                this.defaultProductionId = model.defaultProductionId;
                this.status = model.status;
                this.title = model.title;
                this.userCount = model.userCount;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DefaultProductionId.
             */
            public Builder defaultProductionId(String defaultProductionId) {
                this.defaultProductionId = defaultProductionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UserCount.
             */
            public Builder userCount(String userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * WorkspaceId.
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
