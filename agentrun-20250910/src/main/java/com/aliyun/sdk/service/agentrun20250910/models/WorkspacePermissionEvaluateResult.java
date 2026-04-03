// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link WorkspacePermissionEvaluateResult} extends {@link TeaModel}
 *
 * <p>WorkspacePermissionEvaluateResult</p>
 */
public class WorkspacePermissionEvaluateResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("permissions")
    private java.util.List<WorkspacePermissionItem> permissions;

    @com.aliyun.core.annotation.NameInMap("workspaceFound")
    private Boolean workspaceFound;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private WorkspacePermissionEvaluateResult(Builder builder) {
        this.permissions = builder.permissions;
        this.workspaceFound = builder.workspaceFound;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WorkspacePermissionEvaluateResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return permissions
     */
    public java.util.List<WorkspacePermissionItem> getPermissions() {
        return this.permissions;
    }

    /**
     * @return workspaceFound
     */
    public Boolean getWorkspaceFound() {
        return this.workspaceFound;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private java.util.List<WorkspacePermissionItem> permissions; 
        private Boolean workspaceFound; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(WorkspacePermissionEvaluateResult model) {
            this.permissions = model.permissions;
            this.workspaceFound = model.workspaceFound;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>各 action 的校验结果；顺序与请求 actions 一致</p>
         */
        public Builder permissions(java.util.List<WorkspacePermissionItem> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>当前租户下是否解析到该 workspace；为 false 时各 permissions 一般为 allowed: false，不会调用 RAM</p>
         */
        public Builder workspaceFound(Boolean workspaceFound) {
            this.workspaceFound = workspaceFound;
            return this;
        }

        /**
         * <p>回显请求中的 workspace ID（trim 后）</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public WorkspacePermissionEvaluateResult build() {
            return new WorkspacePermissionEvaluateResult(this);
        } 

    } 

}
