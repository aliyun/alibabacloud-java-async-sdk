// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspacesResponseBody</p>
 */
public class GetWorkspacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private java.util.List<Workspace> workspace;

    private GetWorkspacesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspacesResponseBody create() {
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
     * @return workspace
     */
    public java.util.List<Workspace> getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Workspace> workspace; 

        private Builder() {
        } 

        private Builder(GetWorkspacesResponseBody model) {
            this.requestId = model.requestId;
            this.workspace = model.workspace;
        } 

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(java.util.List<Workspace> workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetWorkspacesResponseBody build() {
            return new GetWorkspacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspacesResponseBody</p>
     */
    public static class Icon extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Icon(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Icon create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Icon model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Icon build() {
                return new Icon(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspacesResponseBody</p>
     */
    public static class Workspace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("Cover")
        private String cover;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private Icon icon;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ModifierId")
        private String modifierId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PermissionRole")
        private String permissionRole;

        @com.aliyun.core.annotation.NameInMap("RootNodeId")
        private String rootNodeId;

        @com.aliyun.core.annotation.NameInMap("TeamId")
        private String teamId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Workspace(Builder builder) {
            this.corpId = builder.corpId;
            this.cover = builder.cover;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.icon = builder.icon;
            this.modifiedTime = builder.modifiedTime;
            this.modifierId = builder.modifierId;
            this.name = builder.name;
            this.permissionRole = builder.permissionRole;
            this.rootNodeId = builder.rootNodeId;
            this.teamId = builder.teamId;
            this.type = builder.type;
            this.url = builder.url;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workspace create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return cover
         */
        public String getCover() {
            return this.cover;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return icon
         */
        public Icon getIcon() {
            return this.icon;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return permissionRole
         */
        public String getPermissionRole() {
            return this.permissionRole;
        }

        /**
         * @return rootNodeId
         */
        public String getRootNodeId() {
            return this.rootNodeId;
        }

        /**
         * @return teamId
         */
        public String getTeamId() {
            return this.teamId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
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
            private String corpId; 
            private String cover; 
            private String createTime; 
            private String creatorId; 
            private String description; 
            private Icon icon; 
            private String modifiedTime; 
            private String modifierId; 
            private String name; 
            private String permissionRole; 
            private String rootNodeId; 
            private String teamId; 
            private String type; 
            private String url; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Workspace model) {
                this.corpId = model.corpId;
                this.cover = model.cover;
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.description = model.description;
                this.icon = model.icon;
                this.modifiedTime = model.modifiedTime;
                this.modifierId = model.modifierId;
                this.name = model.name;
                this.permissionRole = model.permissionRole;
                this.rootNodeId = model.rootNodeId;
                this.teamId = model.teamId;
                this.type = model.type;
                this.url = model.url;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * Cover.
             */
            public Builder cover(String cover) {
                this.cover = cover;
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
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ModifierId.
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
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
             * PermissionRole.
             */
            public Builder permissionRole(String permissionRole) {
                this.permissionRole = permissionRole;
                return this;
            }

            /**
             * RootNodeId.
             */
            public Builder rootNodeId(String rootNodeId) {
                this.rootNodeId = rootNodeId;
                return this;
            }

            /**
             * TeamId.
             */
            public Builder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
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

            public Workspace build() {
                return new Workspace(this);
            } 

        } 

    }
}
