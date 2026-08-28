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
 * {@link UpdateSkillScopeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSkillScopeRequest</p>
 */
public class UpdateSkillScopeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("skillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateSkillScopeRequestBody body;

    private UpdateSkillScopeRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.skillName = builder.skillName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillScopeRequest create() {
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
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return body
     */
    public UpdateSkillScopeRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateSkillScopeRequest, Builder> {
        private String workspaceId; 
        private String skillName; 
        private UpdateSkillScopeRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSkillScopeRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.skillName = request.skillName;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-skill</p>
         */
        public Builder skillName(String skillName) {
            this.putPathParameter("skillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateSkillScopeRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateSkillScopeRequest build() {
            return new UpdateSkillScopeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSkillScopeRequest} extends {@link TeaModel}
     *
     * <p>UpdateSkillScopeRequest</p>
     */
    public static class UpdateSkillScopeRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scope")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scope;

        private UpdateSkillScopeRequestBody(Builder builder) {
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateSkillScopeRequestBody create() {
            return builder().build();
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String scope; 

            private Builder() {
            } 

            private Builder(UpdateSkillScopeRequestBody model) {
                this.scope = model.scope;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public UpdateSkillScopeRequestBody build() {
                return new UpdateSkillScopeRequestBody(this);
            } 

        } 

    }
}
