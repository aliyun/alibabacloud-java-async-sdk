// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateSqlStatementRequest} extends {@link RequestModel}
 *
 * <p>ValidateSqlStatementRequest</p>
 */
public class ValidateSqlStatementRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private SqlStatementWithContext body;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private ValidateSqlStatementRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.body = builder.body;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateSqlStatementRequest create() {
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
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ValidateSqlStatementRequest, Builder> {
        private String namespace; 
        private SqlStatementWithContext body; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ValidateSqlStatementRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.body = request.body;
            this.workspace = request.workspace;
        } 

        /**
         * The name of the namespace.
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The content of the code that you want to verify.
         */
        public Builder body(SqlStatementWithContext body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The workspace ID.
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ValidateSqlStatementRequest build() {
            return new ValidateSqlStatementRequest(this);
        } 

    } 

}
