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
 * {@link CreateContextDatabaseWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateContextDatabaseWorkspaceResponseBody</p>
 */
public class CreateContextDatabaseWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("ApiKeyName")
    private String apiKeyName;

    @com.aliyun.core.annotation.NameInMap("Capabilities")
    private Capabilities capabilities;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ConsolePermissionMode")
    private String consolePermissionMode;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("MemberId")
    private String memberId;

    @com.aliyun.core.annotation.NameInMap("MemberName")
    private String memberName;

    @com.aliyun.core.annotation.NameInMap("PermissionMode")
    private String permissionMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

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

    private CreateContextDatabaseWorkspaceResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.apiKeyName = builder.apiKeyName;
        this.capabilities = builder.capabilities;
        this.clusterId = builder.clusterId;
        this.consolePermissionMode = builder.consolePermissionMode;
        this.createdAt = builder.createdAt;
        this.memberId = builder.memberId;
        this.memberName = builder.memberName;
        this.permissionMode = builder.permissionMode;
        this.requestId = builder.requestId;
        this.role = builder.role;
        this.status = builder.status;
        this.type = builder.type;
        this.viewer = builder.viewer;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextDatabaseWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return apiKeyName
     */
    public String getApiKeyName() {
        return this.apiKeyName;
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
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return memberName
     */
    public String getMemberName() {
        return this.memberName;
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
     * @return role
     */
    public String getRole() {
        return this.role;
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
        private String apiKey; 
        private String apiKeyName; 
        private Capabilities capabilities; 
        private String clusterId; 
        private String consolePermissionMode; 
        private String createdAt; 
        private String memberId; 
        private String memberName; 
        private String permissionMode; 
        private String requestId; 
        private String role; 
        private String status; 
        private String type; 
        private Viewer viewer; 
        private String workspaceId; 
        private String workspaceName; 

        private Builder() {
        } 

        private Builder(CreateContextDatabaseWorkspaceResponseBody model) {
            this.apiKey = model.apiKey;
            this.apiKeyName = model.apiKeyName;
            this.capabilities = model.capabilities;
            this.clusterId = model.clusterId;
            this.consolePermissionMode = model.consolePermissionMode;
            this.createdAt = model.createdAt;
            this.memberId = model.memberId;
            this.memberName = model.memberName;
            this.permissionMode = model.permissionMode;
            this.requestId = model.requestId;
            this.role = model.role;
            this.status = model.status;
            this.type = model.type;
            this.viewer = model.viewer;
            this.workspaceId = model.workspaceId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * <p>The plaintext of the first API key. It is returned only once during creation. Save the key properly. If GenerateInitialKey is set to <code>false</code>, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>ctxdb-*****</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The name of the first API key. The name is <code>default</code> when the key is generated. If GenerateInitialKey is set to <code>false</code>, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }

        /**
         * <p>The account-level capability information for the current call. It only indicates the operations that the account compatibility adapter can perform and does not represent resource-level authorization. This field is optional and is not returned if no account-level executable operations are provided.</p>
         */
        public Builder capabilities(Capabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        /**
         * <p>The ID of the cluster to which the workspace belongs. <code>default</code> is returned for a shared cluster, and the corresponding cluster ID is returned for a dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The permission mode used by the server to parse the identity of the current call. Valid values:</p>
         * <ul>
         * <li><code>personal_compatibility</code>: The compatibility mode.</li>
         * <li><code>advanced</code>: The advanced permission mode.</li>
         * </ul>
         * <p>This field describes the identity context of the current call. The actual permission mode of the workspace is subject to PermissionMode. Creating a workspace uses the account-level identity context, so this field may be empty.</p>
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
         * <p>The ID of the first member.</p>
         * 
         * <strong>example:</strong>
         * <p>mb-cz51tnnp8****</p>
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>The name of the first member.</p>
         * 
         * <strong>example:</strong>
         * <p>my-member</p>
         */
        public Builder memberName(String memberName) {
            this.memberName = memberName;
            return this;
        }

        /**
         * <p>The permission mode that actually takes effect after the workspace is created. A lowercase string is returned.</p>
         * <ul>
         * <li><code>personal_compatibility</code>: The compatibility mode, which corresponds to the request value <code>compatibility</code>.</li>
         * <li><code>advanced</code>: The advanced permission mode.</li>
         * </ul>
         * <p>This field is optional. If it is not returned in the response, call GetContextDatabaseWorkspace to query the workspace details and confirm the actual mode. Do not recreate the workspace simply because this field is missing.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        public Builder permissionMode(String permissionMode) {
            this.permissionMode = permissionMode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The role of the first member, which is fixed to owner.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The status of the workspace (Active: running normally; Locked: stopped due to overdue payments or locked due to expiration).</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the workspace (personal: individual, enterprise: enterprise).</p>
         * 
         * <strong>example:</strong>
         * <p>personal</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The viewer identity information for the current call, including the identity parsing mode, caller account type, and member information. Member-related fields are optional.</p>
         */
        public Builder viewer(Viewer viewer) {
            this.viewer = viewer;
            return this;
        }

        /**
         * <p>The ID of the new workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-as1llqmkol****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>my-workspace</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public CreateContextDatabaseWorkspaceResponseBody build() {
            return new CreateContextDatabaseWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateContextDatabaseWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateContextDatabaseWorkspaceResponseBody</p>
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
     * {@link CreateContextDatabaseWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateContextDatabaseWorkspaceResponseBody</p>
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
             * <p>The ID of the workspace member bound in the identity information of the current call. This field is optional and is empty if no bound member information is provided.</p>
             * 
             * <strong>example:</strong>
             * <p>member-example</p>
             */
            public Builder boundMemberId(String boundMemberId) {
                this.boundMemberId = boundMemberId;
                return this;
            }

            /**
             * <p>The role of the bound member in the workspace, such as <code>Owner</code>. This field is optional and is empty if no bound member role information is provided.</p>
             * 
             * <strong>example:</strong>
             * <p>Owner</p>
             */
            public Builder boundMemberRole(String boundMemberRole) {
                this.boundMemberRole = boundMemberRole;
                return this;
            }

            /**
             * <p>The status of the bound member, such as <code>active</code>. This field is optional and is empty if no bound member status information is provided.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder boundMemberStatus(String boundMemberStatus) {
                this.boundMemberStatus = boundMemberStatus;
                return this;
            }

            /**
             * <p>The account type of the caller for the current call, such as <code>customer</code>. This field describes the caller account and does not represent the role of the workspace member.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder callerType(String callerType) {
                this.callerType = callerType;
                return this;
            }

            /**
             * <p>The identity parsing mode for the current call. Valid values:</p>
             * <ul>
             * <li><code>account_compatibility</code>: The account compatibility identity mode.</li>
             * <li><code>bound_member</code>: The bound member identity mode.</li>
             * </ul>
             * <p>The identity parsing mode and the permission mode of the workspace are different concepts. You cannot infer whether advanced permissions are enabled for the workspace based on this field.</p>
             * 
             * <strong>example:</strong>
             * <p>account_compatibility</p>
             */
            public Builder identityMode(String identityMode) {
                this.identityMode = identityMode;
                return this;
            }

            /**
             * <p>The ID of the workspace member selected in the account compatibility identity mode. This field is optional and is empty if no member is selected for the current call. This field and the bound member ID represent the member selection result and the binding relationship, respectively.</p>
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
