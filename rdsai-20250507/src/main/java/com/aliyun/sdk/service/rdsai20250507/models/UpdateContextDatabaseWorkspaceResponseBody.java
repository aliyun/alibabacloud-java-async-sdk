// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link UpdateContextDatabaseWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateContextDatabaseWorkspaceResponseBody</p>
 */
public class UpdateContextDatabaseWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Capabilities")
    private Capabilities capabilities;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ConsolePermissionMode")
    private String consolePermissionMode;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("PermissionMode")
    private String permissionMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Viewer")
    private Viewer viewer;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private UpdateContextDatabaseWorkspaceResponseBody(Builder builder) {
        this.capabilities = builder.capabilities;
        this.clusterId = builder.clusterId;
        this.consolePermissionMode = builder.consolePermissionMode;
        this.createdAt = builder.createdAt;
        this.permissionMode = builder.permissionMode;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.type = builder.type;
        this.viewer = builder.viewer;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContextDatabaseWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capabilities
     */
    public Capabilities getCapabilities() {
        return this.capabilities;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return consolePermissionMode
     */
    public String getConsolePermissionMode() {
        return this.consolePermissionMode;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return permissionMode
     */
    public String getPermissionMode() {
        return this.permissionMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return viewer
     */
    public Viewer getViewer() {
        return this.viewer;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder {
        private Capabilities capabilities; 
        private String clusterId; 
        private String consolePermissionMode; 
        private String createdAt; 
        private String permissionMode; 
        private String requestId; 
        private String status; 
        private String type; 
        private Viewer viewer; 
        private String workspaceId; 
        private String workspaceName; 

        private Builder() {
        } 

        private Builder(UpdateContextDatabaseWorkspaceResponseBody model) {
            this.capabilities = model.capabilities;
            this.clusterId = model.clusterId;
            this.consolePermissionMode = model.consolePermissionMode;
            this.createdAt = model.createdAt;
            this.permissionMode = model.permissionMode;
            this.requestId = model.requestId;
            this.status = model.status;
            this.type = model.type;
            this.viewer = model.viewer;
            this.workspaceId = model.workspaceId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * <p>The account-level capability information of the current request. It only indicates the operations that the account compatibility adapter can perform and does not represent resource-level authorization. This field is optional and is not returned if no account-level executable operations are provided.</p>
         */
        public Builder capabilities(Capabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        /**
         * <p>The ID of the cluster to which the workspace belongs. For shared clusters, <code>default</code> is returned. For dedicated clusters, the corresponding cluster ID is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The permission mode used by the server to parse the identity of the current request. Valid values:</p>
         * <ul>
         * <li><code>personal_compatibility</code>: compatibility mode.</li>
         * <li><code>advanced</code>: advanced permission mode.</li>
         * </ul>
         * <p>This field describes the identity context of the current request. For the actual permission mode of the workspace, refer to PermissionMode.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        public Builder consolePermissionMode(String consolePermissionMode) {
            this.consolePermissionMode = consolePermissionMode;
            return this;
        }

        /**
         * <p>The creation time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-28T17:59:55Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The permission mode of the workspace. Valid values:</p>
         * <ul>
         * <li><code>personal_compatibility</code>: compatibility mode.</li>
         * <li><code>advanced</code>: advanced permission mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        public Builder permissionMode(String permissionMode) {
            this.permissionMode = permissionMode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The workspace status.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The workspace type.</p>
         * 
         * <strong>example:</strong>
         * <p>personal</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The viewer identity information of the current request, including the identity resolution mode, caller account type, and member information. Member-related fields are optional.</p>
         */
        public Builder viewer(Viewer viewer) {
            this.viewer = viewer;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-as1llqmkol****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The updated name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>my-workspace</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public UpdateContextDatabaseWorkspaceResponseBody build() {
            return new UpdateContextDatabaseWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateContextDatabaseWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateContextDatabaseWorkspaceResponseBody</p>
     */
    public static class Capabilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutableActions")
        private java.util.List<String> executableActions;

        private Capabilities(Builder builder) {
            this.executableActions = builder.executableActions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capabilities create() {
            return builder().build();
        }

        /**
         * @return executableActions
         */
        public java.util.List<String> getExecutableActions() {
            return this.executableActions;
        }

        public static final class Builder {
            private java.util.List<String> executableActions; 

            private Builder() {
            } 

            private Builder(Capabilities model) {
                this.executableActions = model.executableActions;
            } 

            /**
             * <p>The list of operation names that the account compatibility adapter can perform. The list content does not represent read/write, member group, or access control authorization for specific resources.</p>
             */
            public Builder executableActions(java.util.List<String> executableActions) {
                this.executableActions = executableActions;
                return this;
            }

            public Capabilities build() {
                return new Capabilities(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateContextDatabaseWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateContextDatabaseWorkspaceResponseBody</p>
     */
    public static class Viewer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BoundMemberId")
        private String boundMemberId;

        @com.aliyun.core.annotation.NameInMap("BoundMemberRole")
        private String boundMemberRole;

        @com.aliyun.core.annotation.NameInMap("BoundMemberStatus")
        private String boundMemberStatus;

        @com.aliyun.core.annotation.NameInMap("CallerType")
        private String callerType;

        @com.aliyun.core.annotation.NameInMap("IdentityMode")
        private String identityMode;

        @com.aliyun.core.annotation.NameInMap("SelectedMemberId")
        private String selectedMemberId;

        private Viewer(Builder builder) {
            this.boundMemberId = builder.boundMemberId;
            this.boundMemberRole = builder.boundMemberRole;
            this.boundMemberStatus = builder.boundMemberStatus;
            this.callerType = builder.callerType;
            this.identityMode = builder.identityMode;
            this.selectedMemberId = builder.selectedMemberId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Viewer create() {
            return builder().build();
        }

        /**
         * @return boundMemberId
         */
        public String getBoundMemberId() {
            return this.boundMemberId;
        }

        /**
         * @return boundMemberRole
         */
        public String getBoundMemberRole() {
            return this.boundMemberRole;
        }

        /**
         * @return boundMemberStatus
         */
        public String getBoundMemberStatus() {
            return this.boundMemberStatus;
        }

        /**
         * @return callerType
         */
        public String getCallerType() {
            return this.callerType;
        }

        /**
         * @return identityMode
         */
        public String getIdentityMode() {
            return this.identityMode;
        }

        /**
         * @return selectedMemberId
         */
        public String getSelectedMemberId() {
            return this.selectedMemberId;
        }

        public static final class Builder {
            private String boundMemberId; 
            private String boundMemberRole; 
            private String boundMemberStatus; 
            private String callerType; 
            private String identityMode; 
            private String selectedMemberId; 

            private Builder() {
            } 

            private Builder(Viewer model) {
                this.boundMemberId = model.boundMemberId;
                this.boundMemberRole = model.boundMemberRole;
                this.boundMemberStatus = model.boundMemberStatus;
                this.callerType = model.callerType;
                this.identityMode = model.identityMode;
                this.selectedMemberId = model.selectedMemberId;
            } 

            /**
             * <p>The ID of the bound workspace member in the identity information of the current request. Optional. This field is empty if no bound member information is provided.</p>
             * 
             * <strong>example:</strong>
             * <p>member-example</p>
             */
            public Builder boundMemberId(String boundMemberId) {
                this.boundMemberId = boundMemberId;
                return this;
            }

            /**
             * <p>The role of the bound member in the workspace, such as <code>Owner</code>. Optional. This field is empty if no bound member role information is provided.</p>
             * 
             * <strong>example:</strong>
             * <p>Owner</p>
             */
            public Builder boundMemberRole(String boundMemberRole) {
                this.boundMemberRole = boundMemberRole;
                return this;
            }

            /**
             * <p>The status of the bound member, such as <code>active</code>. Optional. This field is empty if no bound member status information is provided.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder boundMemberStatus(String boundMemberStatus) {
                this.boundMemberStatus = boundMemberStatus;
                return this;
            }

            /**
             * <p>The account type of the caller for the current request, such as <code>customer</code>. This field describes the caller account and does not indicate the role of a workspace member.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder callerType(String callerType) {
                this.callerType = callerType;
                return this;
            }

            /**
             * <p>The identity resolution mode of the current request. Valid values:</p>
             * <ul>
             * <li><code>account_compatibility</code>: account compatibility identity mode.</li>
             * <li><code>bound_member</code>: bound member identity mode.</li>
             * </ul>
             * <p>The identity resolution mode and the workspace permission mode are different concepts. You cannot infer whether advanced permissions are enabled for the workspace based on this field.</p>
             * 
             * <strong>example:</strong>
             * <p>account_compatibility</p>
             */
            public Builder identityMode(String identityMode) {
                this.identityMode = identityMode;
                return this;
            }

            /**
             * <p>The ID of the selected workspace member in the account compatibility identity mode. Optional. This field is empty if no member is selected for the current request. This field and the bound member ID represent the member selection result and the binding relationship, respectively.</p>
             * 
             * <strong>example:</strong>
             * <p>member-example</p>
             */
            public Builder selectedMemberId(String selectedMemberId) {
                this.selectedMemberId = selectedMemberId;
                return this;
            }

            public Viewer build() {
                return new Viewer(this);
            } 

        } 

    }
}
