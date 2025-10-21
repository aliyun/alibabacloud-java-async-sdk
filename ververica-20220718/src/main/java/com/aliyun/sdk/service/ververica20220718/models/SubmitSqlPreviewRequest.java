// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link SubmitSqlPreviewRequest} extends {@link RequestModel}
 *
 * <p>SubmitSqlPreviewRequest</p>
 */
public class SubmitSqlPreviewRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private SqlStatementWithContext body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionClusterName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private SubmitSqlPreviewRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.body = builder.body;
        this.sessionClusterName = builder.sessionClusterName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSqlPreviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return body
     */
    public SqlStatementWithContext getBody() {
        return this.body;
    }

    /**
     * @return sessionClusterName
     */
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<SubmitSqlPreviewRequest, Builder> {
        private String namespace; 
        private SqlStatementWithContext body; 
        private String sessionClusterName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSqlPreviewRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.body = request.body;
            this.sessionClusterName = request.sessionClusterName;
            this.workspace = request.workspace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * body.
         */
        public Builder body(SqlStatementWithContext body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-session</p>
         */
        public Builder sessionClusterName(String sessionClusterName) {
            this.putQueryParameter("sessionClusterName", sessionClusterName);
            this.sessionClusterName = sessionClusterName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public SubmitSqlPreviewRequest build() {
            return new SubmitSqlPreviewRequest(this);
        } 

    } 

}
