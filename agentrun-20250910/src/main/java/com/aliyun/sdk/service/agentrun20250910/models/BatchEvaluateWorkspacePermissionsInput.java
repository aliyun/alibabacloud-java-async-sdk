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
 * {@link BatchEvaluateWorkspacePermissionsInput} extends {@link TeaModel}
 *
 * <p>BatchEvaluateWorkspacePermissionsInput</p>
 */
public class BatchEvaluateWorkspacePermissionsInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> actions;

    @com.aliyun.core.annotation.NameInMap("workspaceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> workspaceIds;

    private BatchEvaluateWorkspacePermissionsInput(Builder builder) {
        this.actions = builder.actions;
        this.workspaceIds = builder.workspaceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchEvaluateWorkspacePermissionsInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actions
     */
    public java.util.List<String> getActions() {
        return this.actions;
    }

    /**
     * @return workspaceIds
     */
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

    public static final class Builder {
        private java.util.List<String> actions; 
        private java.util.List<String> workspaceIds; 

        private Builder() {
        } 

        private Builder(BatchEvaluateWorkspacePermissionsInput model) {
            this.actions = model.actions;
            this.workspaceIds = model.workspaceIds;
        } 

        /**
         * <p>RAM List 类 action 列表；支持带 agentrun: 前缀或不带（服务端归一化）；顺序与每条 permissions 一致；上限 20 条</p>
         * <p>This parameter is required.</p>
         */
        public Builder actions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * <p>Workspace 资源 ID 列表（UUID 字符串）；顺序与响应 results 一致；上限 50 条</p>
         * <p>This parameter is required.</p>
         */
        public Builder workspaceIds(java.util.List<String> workspaceIds) {
            this.workspaceIds = workspaceIds;
            return this;
        }

        public BatchEvaluateWorkspacePermissionsInput build() {
            return new BatchEvaluateWorkspacePermissionsInput(this);
        } 

    } 

}
