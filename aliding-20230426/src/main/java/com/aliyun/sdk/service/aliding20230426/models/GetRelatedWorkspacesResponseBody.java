// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRelatedWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>GetRelatedWorkspacesResponseBody</p>
 */
public class GetRelatedWorkspacesResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    @NameInMap("workspaces")
    private java.util.List < Workspaces> workspaces;

    private GetRelatedWorkspacesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
        this.workspaces = builder.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRelatedWorkspacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    /**
     * @return workspaces
     */
    public java.util.List < Workspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static final class Builder {
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 
        private java.util.List < Workspaces> workspaces; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        /**
         * workspaces.
         */
        public Builder workspaces(java.util.List < Workspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }

        public GetRelatedWorkspacesResponseBody build() {
            return new GetRelatedWorkspacesResponseBody(this);
        } 

    } 

    public static class RecentList extends TeaModel {
        @NameInMap("LastEditTime")
        private Long lastEditTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("Url")
        private String url;

        private RecentList(Builder builder) {
            this.lastEditTime = builder.lastEditTime;
            this.name = builder.name;
            this.nodeId = builder.nodeId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecentList create() {
            return builder().build();
        }

        /**
         * @return lastEditTime
         */
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long lastEditTime; 
            private String name; 
            private String nodeId; 
            private String url; 

            /**
             * LastEditTime.
             */
            public Builder lastEditTime(Long lastEditTime) {
                this.lastEditTime = lastEditTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public RecentList build() {
                return new RecentList(this);
            } 

        } 

    }
    public static class Workspaces extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("RecentList")
        private java.util.List < RecentList> recentList;

        @NameInMap("Role")
        private String role;

        @NameInMap("Url")
        private String url;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        private Workspaces(Builder builder) {
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.name = builder.name;
            this.owner = builder.owner;
            this.recentList = builder.recentList;
            this.role = builder.role;
            this.url = builder.url;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workspaces create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return recentList
         */
        public java.util.List < RecentList> getRecentList() {
            return this.recentList;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Long createTime; 
            private Boolean deleted; 
            private String name; 
            private String owner; 
            private java.util.List < RecentList> recentList; 
            private String role; 
            private String url; 
            private String workspaceId; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * RecentList.
             */
            public Builder recentList(java.util.List < RecentList> recentList) {
                this.recentList = recentList;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Workspaces build() {
                return new Workspaces(this);
            } 

        } 

    }
}
