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
 * {@link EnableConnectorRequest} extends {@link RequestModel}
 *
 * <p>EnableConnectorRequest</p>
 */
public class EnableConnectorRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("connectorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private EnableConnectorRequestBody body;

    private EnableConnectorRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.connectorName = builder.connectorName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableConnectorRequest create() {
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
     * @return connectorName
     */
    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * @return body
     */
    public EnableConnectorRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<EnableConnectorRequest, Builder> {
        private String workspaceId; 
        private String connectorName; 
        private EnableConnectorRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(EnableConnectorRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.connectorName = request.connectorName;
            this.body = request.body;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The Connector name. Currently, only qodercli is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qodercli</p>
         */
        public Builder connectorName(String connectorName) {
            this.putPathParameter("connectorName", connectorName);
            this.connectorName = connectorName;
            return this;
        }

        /**
         * <p>The enable request body.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(EnableConnectorRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public EnableConnectorRequest build() {
            return new EnableConnectorRequest(this);
        } 

    } 

    /**
     * 
     * {@link EnableConnectorRequest} extends {@link TeaModel}
     *
     * <p>EnableConnectorRequest</p>
     */
    public static class EnableConnectorRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metadata")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metadata;

        private EnableConnectorRequestBody(Builder builder) {
            this.metadata = builder.metadata;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnableConnectorRequestBody create() {
            return builder().build();
        }

        /**
         * @return metadata
         */
        public String getMetadata() {
            return this.metadata;
        }

        public static final class Builder {
            private String metadata; 

            private Builder() {
            } 

            private Builder(EnableConnectorRequestBody model) {
                this.metadata = model.metadata;
            } 

            /**
             * <p>The Connector configuration JSON string. Set site to global or cn. apiKey is required. serviceAccountKeys must contain at least one named service account key. organizationId is optional.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;site&quot;:&quot;global&quot;,&quot;organizationId&quot;:&quot;org-xxxx&quot;,&quot;apiKey&quot;:&quot;ak-xxxx&quot;,&quot;serviceAccountKeys&quot;:[{&quot;name&quot;:&quot;default&quot;,&quot;serviceAccountKey&quot;:&quot;sk-xxxx&quot;}]}</p>
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            public EnableConnectorRequestBody build() {
                return new EnableConnectorRequestBody(this);
            } 

        } 

    }
}
