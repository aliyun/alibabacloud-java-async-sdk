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
 * {@link UpdateAgentSpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentSpecRequest</p>
 */
public class UpdateAgentSpecRequest extends Request {
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
    private UpdateAgentSpecRequestBody body;

    private UpdateAgentSpecRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentSpecName = builder.agentSpecName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentSpecRequest create() {
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
    public UpdateAgentSpecRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateAgentSpecRequest, Builder> {
        private String workspaceId; 
        private String agentSpecName; 
        private UpdateAgentSpecRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentSpecRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentSpecName = request.agentSpecName;
            this.body = request.body;
        } 

        /**
         * <p>The workspace ID.</p>
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
         * <p>The unique name of the AgentSpec.</p>
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
         * <p>The request body.</p>
         */
        public Builder body(UpdateAgentSpecRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateAgentSpecRequest build() {
            return new UpdateAgentSpecRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAgentSpecRequest} extends {@link TeaModel}
     *
     * <p>UpdateAgentSpecRequest</p>
     */
    public static class UpdateAgentSpecRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizTags")
        private String bizTags;

        @com.aliyun.core.annotation.NameInMap("labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        private UpdateAgentSpecRequestBody(Builder builder) {
            this.bizTags = builder.bizTags;
            this.labels = builder.labels;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateAgentSpecRequestBody create() {
            return builder().build();
        }

        /**
         * @return bizTags
         */
        public String getBizTags() {
            return this.bizTags;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String bizTags; 
            private String labels; 
            private String scope; 

            private Builder() {
            } 

            private Builder(UpdateAgentSpecRequestBody model) {
                this.bizTags = model.bizTags;
                this.labels = model.labels;
                this.scope = model.scope;
            } 

            /**
             * <p>The business tags as a JSON-formatted string.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;ai&quot;,&quot;agent&quot;]</p>
             */
            public Builder bizTags(String bizTags) {
                this.bizTags = bizTags;
                return this;
            }

            /**
             * <p>The label mapping as a JSON-formatted string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;latest&quot;:&quot;0.0.1&quot;}</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The visibility scope. Valid values:</p>
             * <ul>
             * <li>PUBLIC</li>
             * <li>PRIVATE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public UpdateAgentSpecRequestBody build() {
                return new UpdateAgentSpecRequestBody(this);
            } 

        } 

    }
}
