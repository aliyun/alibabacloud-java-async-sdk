// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetMemoryRuleRequest} extends {@link RequestModel}
 *
 * <p>GetMemoryRuleRequest</p>
 */
public class GetMemoryRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    private GetMemoryRuleRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<GetMemoryRuleRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetMemoryRuleRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The ID of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the memory store.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-memory</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>ruleId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-2f5f9c5a8d0e4c3b</p>
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetMemoryRuleRequest build() {
            return new GetMemoryRuleRequest(this);
        } 

    } 

}
