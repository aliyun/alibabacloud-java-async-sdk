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
 * {@link BatchEvaluateWorkspacePermissionsOutput} extends {@link TeaModel}
 *
 * <p>BatchEvaluateWorkspacePermissionsOutput</p>
 */
public class BatchEvaluateWorkspacePermissionsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<WorkspacePermissionEvaluateResult> results;

    private BatchEvaluateWorkspacePermissionsOutput(Builder builder) {
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchEvaluateWorkspacePermissionsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return results
     */
    public java.util.List<WorkspacePermissionEvaluateResult> getResults() {
        return this.results;
    }

    public static final class Builder {
        private java.util.List<WorkspacePermissionEvaluateResult> results; 

        private Builder() {
        } 

        private Builder(BatchEvaluateWorkspacePermissionsOutput model) {
            this.results = model.results;
        } 

        /**
         * <p>各 workspace 的权限校验结果列表；顺序与请求 workspaceIds 一致</p>
         */
        public Builder results(java.util.List<WorkspacePermissionEvaluateResult> results) {
            this.results = results;
            return this;
        }

        public BatchEvaluateWorkspacePermissionsOutput build() {
            return new BatchEvaluateWorkspacePermissionsOutput(this);
        } 

    } 

}
