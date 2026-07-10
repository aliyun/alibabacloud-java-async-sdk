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
 * {@link StartSqlExecutionRequest} extends {@link RequestModel}
 *
 * <p>StartSqlExecutionRequest</p>
 */
public class StartSqlExecutionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private StartSqlExecutionBody body;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private StartSqlExecutionRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.body = builder.body;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSqlExecutionRequest create() {
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
    public StartSqlExecutionBody getBody() {
        return this.body;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<StartSqlExecutionRequest, Builder> {
        private String namespace; 
        private StartSqlExecutionBody body; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(StartSqlExecutionRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.body = request.body;
            this.workspace = request.workspace;
        } 

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * body.
         */
        public Builder body(StartSqlExecutionBody body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bda1c4a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public StartSqlExecutionRequest build() {
            return new StartSqlExecutionRequest(this);
        } 

    } 

}
