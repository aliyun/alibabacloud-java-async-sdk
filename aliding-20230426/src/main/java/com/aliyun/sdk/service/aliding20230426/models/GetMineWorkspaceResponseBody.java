// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMineWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetMineWorkspaceResponseBody</p>
 */
public class GetMineWorkspaceResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("workspace")
    private Workspace workspace;

    private GetMineWorkspaceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMineWorkspaceResponseBody create() {
        return builder().build();
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
    public Workspace getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String requestId; 
        private Workspace workspace; 

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(Workspace workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetMineWorkspaceResponseBody build() {
            return new GetMineWorkspaceResponseBody(this);
        } 

    } 

    public static class Icon extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
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
    public static class Workspace extends TeaModel {
        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("Cover")
        private String cover;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Icon")
        private Icon icon;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ModifierId")
        private String modifierId;

        @NameInMap("Name")
        private String name;

        @NameInMap("PermissionRole")
        private String permissionRole;

        @NameInMap("RootNodeId")
        private String rootNodeId;

        @NameInMap("TeamId")
        private String teamId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        @NameInMap("WorkspaceId")
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
