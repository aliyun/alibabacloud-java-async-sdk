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

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private CreateContextDatabaseWorkspaceResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.apiKeyName = builder.apiKeyName;
        this.createdAt = builder.createdAt;
        this.memberId = builder.memberId;
        this.memberName = builder.memberName;
        this.permissionMode = builder.permissionMode;
        this.requestId = builder.requestId;
        this.role = builder.role;
        this.status = builder.status;
        this.type = builder.type;
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
        private String createdAt; 
        private String memberId; 
        private String memberName; 
        private String permissionMode; 
        private String requestId; 
        private String role; 
        private String status; 
        private String type; 
        private String workspaceId; 
        private String workspaceName; 

        private Builder() {
        } 

        private Builder(CreateContextDatabaseWorkspaceResponseBody model) {
            this.apiKey = model.apiKey;
            this.apiKeyName = model.apiKeyName;
            this.createdAt = model.createdAt;
            this.memberId = model.memberId;
            this.memberName = model.memberName;
            this.permissionMode = model.permissionMode;
            this.requestId = model.requestId;
            this.role = model.role;
            this.status = model.status;
            this.type = model.type;
            this.workspaceId = model.workspaceId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * <p>The plaintext API key. This key is returned only once upon creation. The caller must persist the key.</p>
         * 
         * <strong>example:</strong>
         * <p>ctxdb-*****</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The name of the first API key. The value is fixed to default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
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
         * <p>The permission mode that actually takes effect after the workspace is created. The value is returned as a lowercase string:</p>
         * <ul>
         * <li><code>personal_compatibility</code>: Compatibility mode, which corresponds to the request value <code>compatibility</code>.</li>
         * <li><code>advanced</code>: Advanced permission mode.</li>
         * </ul>
         * <p>This field is optional. If it is not returned in the response, check the actual mode in the workspace details. Do not recreate the workspace only because this field is missing.</p>
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
         * <p>The role of the first member. The value is fixed to owner.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The status of the workspace. Valid values: Active (running normally) and Locked (stopped due to an overdue payment or locked due to expiration).</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the workspace. Valid values: personal and enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>personal</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The ID of the newly created workspace.</p>
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

}
