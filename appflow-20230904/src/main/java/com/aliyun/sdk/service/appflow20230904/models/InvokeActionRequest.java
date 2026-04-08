// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904.models;

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
 * {@link InvokeActionRequest} extends {@link RequestModel}
 *
 * <p>InvokeActionRequest</p>
 */
public class InvokeActionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionVersion")
    private String actionVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthConfig")
    private AuthConfig authConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    private java.util.Map<String, ?> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorVersion")
    private String connectorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private java.util.Map<String, String> path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private java.util.Map<String, String> query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stream")
    private Boolean stream;

    private InvokeActionRequest(Builder builder) {
        super(builder);
        this.actionId = builder.actionId;
        this.actionVersion = builder.actionVersion;
        this.authConfig = builder.authConfig;
        this.body = builder.body;
        this.connectorId = builder.connectorId;
        this.connectorVersion = builder.connectorVersion;
        this.headers = builder.headers;
        this.path = builder.path;
        this.query = builder.query;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeActionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionId
     */
    public String getActionId() {
        return this.actionId;
    }

    /**
     * @return actionVersion
     */
    public String getActionVersion() {
        return this.actionVersion;
    }

    /**
     * @return authConfig
     */
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return body
     */
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    /**
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * @return connectorVersion
     */
    public String getConnectorVersion() {
        return this.connectorVersion;
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return path
     */
    public java.util.Map<String, String> getPath() {
        return this.path;
    }

    /**
     * @return query
     */
    public java.util.Map<String, String> getQuery() {
        return this.query;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<InvokeActionRequest, Builder> {
        private String actionId; 
        private String actionVersion; 
        private AuthConfig authConfig; 
        private java.util.Map<String, ?> body; 
        private String connectorId; 
        private String connectorVersion; 
        private java.util.Map<String, String> headers; 
        private java.util.Map<String, String> path; 
        private java.util.Map<String, String> query; 
        private Boolean stream; 

        private Builder() {
            super();
        } 

        private Builder(InvokeActionRequest request) {
            super(request);
            this.actionId = request.actionId;
            this.actionVersion = request.actionVersion;
            this.authConfig = request.authConfig;
            this.body = request.body;
            this.connectorId = request.connectorId;
            this.connectorVersion = request.connectorVersion;
            this.headers = request.headers;
            this.path = request.path;
            this.query = request.query;
            this.stream = request.stream;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>action-xxx</p>
         */
        public Builder actionId(String actionId) {
            this.putQueryParameter("ActionId", actionId);
            this.actionId = actionId;
            return this;
        }

        /**
         * ActionVersion.
         */
        public Builder actionVersion(String actionVersion) {
            this.putQueryParameter("ActionVersion", actionVersion);
            this.actionVersion = actionVersion;
            return this;
        }

        /**
         * AuthConfig.
         */
        public Builder authConfig(AuthConfig authConfig) {
            String authConfigShrink = shrink(authConfig, "AuthConfig", "json");
            this.putQueryParameter("AuthConfig", authConfigShrink);
            this.authConfig = authConfig;
            return this;
        }

        /**
         * Body.
         */
        public Builder body(java.util.Map<String, ?> body) {
            String bodyShrink = shrink(body, "Body", "json");
            this.putQueryParameter("Body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-xxx</p>
         */
        public Builder connectorId(String connectorId) {
            this.putQueryParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        /**
         * ConnectorVersion.
         */
        public Builder connectorVersion(String connectorVersion) {
            this.putQueryParameter("ConnectorVersion", connectorVersion);
            this.connectorVersion = connectorVersion;
            return this;
        }

        /**
         * Headers.
         */
        public Builder headers(java.util.Map<String, String> headers) {
            String headersShrink = shrink(headers, "Headers", "json");
            this.putQueryParameter("Headers", headersShrink);
            this.headers = headers;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(java.util.Map<String, String> path) {
            String pathShrink = shrink(path, "Path", "json");
            this.putQueryParameter("Path", pathShrink);
            this.path = path;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(java.util.Map<String, String> query) {
            String queryShrink = shrink(query, "Query", "json");
            this.putQueryParameter("Query", queryShrink);
            this.query = query;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(Boolean stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public InvokeActionRequest build() {
            return new InvokeActionRequest(this);
        } 

    } 

    /**
     * 
     * {@link InvokeActionRequest} extends {@link TeaModel}
     *
     * <p>InvokeActionRequest</p>
     */
    public static class AuthConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private AuthConfig(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private Object value; 

            private Builder() {
            } 

            private Builder(AuthConfig model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public AuthConfig build() {
                return new AuthConfig(this);
            } 

        } 

    }
}
