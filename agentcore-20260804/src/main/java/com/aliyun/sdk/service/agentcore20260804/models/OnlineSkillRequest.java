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
 * {@link OnlineSkillRequest} extends {@link RequestModel}
 *
 * <p>OnlineSkillRequest</p>
 */
public class OnlineSkillRequest extends Request {
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
    private OnlineSkillRequestBody body;

    private OnlineSkillRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.skillName = builder.skillName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnlineSkillRequest create() {
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
    public OnlineSkillRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<OnlineSkillRequest, Builder> {
        private String workspaceId; 
        private String skillName; 
        private OnlineSkillRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(OnlineSkillRequest request) {
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
        public Builder body(OnlineSkillRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public OnlineSkillRequest build() {
            return new OnlineSkillRequest(this);
        } 

    } 

    /**
     * 
     * {@link OnlineSkillRequest} extends {@link TeaModel}
     *
     * <p>OnlineSkillRequest</p>
     */
    public static class OnlineSkillRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("skillVersion")
        private String skillVersion;

        private OnlineSkillRequestBody(Builder builder) {
            this.scope = builder.scope;
            this.skillVersion = builder.skillVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlineSkillRequestBody create() {
            return builder().build();
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return skillVersion
         */
        public String getSkillVersion() {
            return this.skillVersion;
        }

        public static final class Builder {
            private String scope; 
            private String skillVersion; 

            private Builder() {
            } 

            private Builder(OnlineSkillRequestBody model) {
                this.scope = model.scope;
                this.skillVersion = model.skillVersion;
            } 

            /**
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * skillVersion.
             */
            public Builder skillVersion(String skillVersion) {
                this.skillVersion = skillVersion;
                return this;
            }

            public OnlineSkillRequestBody build() {
                return new OnlineSkillRequestBody(this);
            } 

        } 

    }
}
