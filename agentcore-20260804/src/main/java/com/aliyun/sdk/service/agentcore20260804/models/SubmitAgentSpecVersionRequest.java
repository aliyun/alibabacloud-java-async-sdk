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
 * {@link SubmitAgentSpecVersionRequest} extends {@link RequestModel}
 *
 * <p>SubmitAgentSpecVersionRequest</p>
 */
public class SubmitAgentSpecVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpecName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpecName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpecVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpecVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private SubmitAgentSpecVersionRequestBody body;

    private SubmitAgentSpecVersionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentSpecName = builder.agentSpecName;
        this.agentSpecVersion = builder.agentSpecVersion;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAgentSpecVersionRequest create() {
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
     * @return agentSpecVersion
     */
    public String getAgentSpecVersion() {
        return this.agentSpecVersion;
    }

    /**
     * @return body
     */
    public SubmitAgentSpecVersionRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SubmitAgentSpecVersionRequest, Builder> {
        private String workspaceId; 
        private String agentSpecName; 
        private String agentSpecVersion; 
        private SubmitAgentSpecVersionRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAgentSpecVersionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentSpecName = request.agentSpecName;
            this.agentSpecVersion = request.agentSpecVersion;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        public Builder agentSpecVersion(String agentSpecVersion) {
            this.putPathParameter("agentSpecVersion", agentSpecVersion);
            this.agentSpecVersion = agentSpecVersion;
            return this;
        }

        /**
         * body.
         */
        public Builder body(SubmitAgentSpecVersionRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public SubmitAgentSpecVersionRequest build() {
            return new SubmitAgentSpecVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitAgentSpecVersionRequest} extends {@link TeaModel}
     *
     * <p>SubmitAgentSpecVersionRequest</p>
     */
    public static class SubmitAgentSpecVersionRequestBody extends TeaModel {
        private SubmitAgentSpecVersionRequestBody(Builder builder) {
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitAgentSpecVersionRequestBody create() {
            return builder().build();
        }

        public static final class Builder {

            private Builder() {
            } 

            private Builder(SubmitAgentSpecVersionRequestBody model) {
            } 

            public SubmitAgentSpecVersionRequestBody build() {
                return new SubmitAgentSpecVersionRequestBody(this);
            } 

        } 

    }
}
