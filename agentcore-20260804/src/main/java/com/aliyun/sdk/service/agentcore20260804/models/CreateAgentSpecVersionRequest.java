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
 * {@link CreateAgentSpecVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentSpecVersionRequest</p>
 */
public class CreateAgentSpecVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpecName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpecName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateAgentSpecVersionRequestBody body;

    private CreateAgentSpecVersionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentSpecName = builder.agentSpecName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentSpecVersionRequest create() {
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
     * @return agentSpecName
     */
    public String getAgentSpecName() {
        return this.agentSpecName;
    }

    /**
     * @return body
     */
    public CreateAgentSpecVersionRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateAgentSpecVersionRequest, Builder> {
        private String workspaceId; 
        private String agentSpecName; 
        private CreateAgentSpecVersionRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentSpecVersionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentSpecName = request.agentSpecName;
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
         * <p>my-worker</p>
         */
        public Builder agentSpecName(String agentSpecName) {
            this.putPathParameter("agentSpecName", agentSpecName);
            this.agentSpecName = agentSpecName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(CreateAgentSpecVersionRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public CreateAgentSpecVersionRequest build() {
            return new CreateAgentSpecVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentSpecVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSpecVersionRequest</p>
     */
    public static class CreateAgentSpecVersionRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("basedOnVersion")
        private String basedOnVersion;

        @com.aliyun.core.annotation.NameInMap("targetVersion")
        private String targetVersion;

        private CreateAgentSpecVersionRequestBody(Builder builder) {
            this.basedOnVersion = builder.basedOnVersion;
            this.targetVersion = builder.targetVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateAgentSpecVersionRequestBody create() {
            return builder().build();
        }

        /**
         * @return basedOnVersion
         */
        public String getBasedOnVersion() {
            return this.basedOnVersion;
        }

        /**
         * @return targetVersion
         */
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public static final class Builder {
            private String basedOnVersion; 
            private String targetVersion; 

            private Builder() {
            } 

            private Builder(CreateAgentSpecVersionRequestBody model) {
                this.basedOnVersion = model.basedOnVersion;
                this.targetVersion = model.targetVersion;
            } 

            /**
             * basedOnVersion.
             */
            public Builder basedOnVersion(String basedOnVersion) {
                this.basedOnVersion = basedOnVersion;
                return this;
            }

            /**
             * targetVersion.
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
                return this;
            }

            public CreateAgentSpecVersionRequestBody build() {
                return new CreateAgentSpecVersionRequestBody(this);
            } 

        } 

    }
}
