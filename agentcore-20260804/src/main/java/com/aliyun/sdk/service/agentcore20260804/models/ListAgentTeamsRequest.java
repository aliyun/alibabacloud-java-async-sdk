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
 * {@link ListAgentTeamsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentTeamsRequest</p>
 */
public class ListAgentTeamsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ListAgentTeamsRequestBody body;

    private ListAgentTeamsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentTeamsRequest create() {
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
    public ListAgentTeamsRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ListAgentTeamsRequest, Builder> {
        private String workspaceId; 
        private ListAgentTeamsRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentTeamsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(ListAgentTeamsRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public ListAgentTeamsRequest build() {
            return new ListAgentTeamsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentTeamsRequest} extends {@link TeaModel}
     *
     * <p>ListAgentTeamsRequest</p>
     */
    public static class ListAgentTeamsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> agentIds;

        private ListAgentTeamsRequestBody(Builder builder) {
            this.agentIds = builder.agentIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListAgentTeamsRequestBody create() {
            return builder().build();
        }

        /**
         * @return agentIds
         */
        public java.util.List<String> getAgentIds() {
            return this.agentIds;
        }

        public static final class Builder {
            private java.util.List<String> agentIds; 

            private Builder() {
            } 

            private Builder(ListAgentTeamsRequestBody model) {
                this.agentIds = model.agentIds;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder agentIds(java.util.List<String> agentIds) {
                this.agentIds = agentIds;
                return this;
            }

            public ListAgentTeamsRequestBody build() {
                return new ListAgentTeamsRequestBody(this);
            } 

        } 

    }
}
