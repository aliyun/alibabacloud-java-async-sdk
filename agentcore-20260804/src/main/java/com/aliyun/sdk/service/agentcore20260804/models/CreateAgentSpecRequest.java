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
 * {@link CreateAgentSpecRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentSpecRequest</p>
 */
public class CreateAgentSpecRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateAgentSpecRequestBody body;

    private CreateAgentSpecRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentSpecRequest create() {
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
     * @return body
     */
    public CreateAgentSpecRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateAgentSpecRequest, Builder> {
        private String workspaceId; 
        private CreateAgentSpecRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentSpecRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
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
         * body.
         */
        public Builder body(CreateAgentSpecRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public CreateAgentSpecRequest build() {
            return new CreateAgentSpecRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentSpecRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSpecRequest</p>
     */
    public static class CreateAgentSpecRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpecName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String agentSpecName;

        @com.aliyun.core.annotation.NameInMap("targetVersion")
        private String targetVersion;

        private CreateAgentSpecRequestBody(Builder builder) {
            this.agentSpecName = builder.agentSpecName;
            this.targetVersion = builder.targetVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateAgentSpecRequestBody create() {
            return builder().build();
        }

        /**
         * @return agentSpecName
         */
        public String getAgentSpecName() {
            return this.agentSpecName;
        }

        /**
         * @return targetVersion
         */
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public static final class Builder {
            private String agentSpecName; 
            private String targetVersion; 

            private Builder() {
            } 

            private Builder(CreateAgentSpecRequestBody model) {
                this.agentSpecName = model.agentSpecName;
                this.targetVersion = model.targetVersion;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-worker</p>
             */
            public Builder agentSpecName(String agentSpecName) {
                this.agentSpecName = agentSpecName;
                return this;
            }

            /**
             * targetVersion.
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
                return this;
            }

            public CreateAgentSpecRequestBody build() {
                return new CreateAgentSpecRequestBody(this);
            } 

        } 

    }
}
