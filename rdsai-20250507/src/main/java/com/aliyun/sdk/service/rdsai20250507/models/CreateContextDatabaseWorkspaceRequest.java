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
 * {@link CreateContextDatabaseWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateContextDatabaseWorkspaceRequest</p>
 */
public class CreateContextDatabaseWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GenerateInitialKey")
    private Boolean generateInitialKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberName")
    private String memberName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionMode")
    private String permissionMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    private CreateContextDatabaseWorkspaceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.generateInitialKey = builder.generateInitialKey;
        this.memberName = builder.memberName;
        this.permissionMode = builder.permissionMode;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextDatabaseWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return generateInitialKey
     */
    public Boolean getGenerateInitialKey() {
        return this.generateInitialKey;
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
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder extends Request.Builder<CreateContextDatabaseWorkspaceRequest, Builder> {
        private String clusterId; 
        private Boolean generateInitialKey; 
        private String memberName; 
        private String permissionMode; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateContextDatabaseWorkspaceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.generateInitialKey = request.generateInitialKey;
            this.memberName = request.memberName;
            this.permissionMode = request.permissionMode;
            this.workspaceName = request.workspaceName;
        } 

        /**
         * <p>The ID of the cluster to which the workspace belongs. This parameter is optional.</p>
         * <ul>
         * <li>If you do not specify this parameter, the cluster selection logic that prioritizes account-exclusive storage is used.</li>
         * <li><code>default</code>: The shared cluster is used.</li>
         * <li>Cluster IDs starting with <code>acc-</code>: The associated dedicated cluster is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to generate an initial API key. This parameter is optional. Default value: <code>true</code>.</p>
         * <ul>
         * <li><code>true</code>: Generates the first API key and returns the key name and plaintext key.</li>
         * <li><code>false</code>: Does not generate an initial API key. The ApiKeyName and ApiKey fields in the response are empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder generateInitialKey(Boolean generateInitialKey) {
            this.putQueryParameter("GenerateInitialKey", generateInitialKey);
            this.generateInitialKey = generateInitialKey;
            return this;
        }

        /**
         * <p>The name of the first member when the workspace is created. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>my-member</p>
         */
        public Builder memberName(String memberName) {
            this.putQueryParameter("MemberName", memberName);
            this.memberName = memberName;
            return this;
        }

        /**
         * <p>The permission mode selected when the workspace is created. Valid values:</p>
         * <ul>
         * <li><code>compatibility</code>: The compatibility mode. This mode is used if you do not specify this parameter.</li>
         * <li><code>advanced</code>: The advanced permission mode. Only the Alibaba Cloud account can select this mode. It takes effect immediately after the workspace is created and cannot be disabled.</li>
         * </ul>
         * <p>This parameter is a string, not a Boolean switch. Valid values are case-insensitive and ignore leading and trailing whitespace. If you explicitly pass an empty string, pure whitespace, or other values, <code>InvalidParameter</code> (HTTP 400) is returned. If a RAM user selects <code>advanced</code>, <code>NoPermission</code> (HTTP 403) is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        public Builder permissionMode(String permissionMode) {
            this.putQueryParameter("PermissionMode", permissionMode);
            this.permissionMode = permissionMode;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-workspace</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putQueryParameter("WorkspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        @Override
        public CreateContextDatabaseWorkspaceRequest build() {
            return new CreateContextDatabaseWorkspaceRequest(this);
        } 

    } 

}
