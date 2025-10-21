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
 * {@link RegisterCustomConnectorRequest} extends {@link RequestModel}
 *
 * <p>RegisterCustomConnectorRequest</p>
 */
public class RegisterCustomConnectorRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jarUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jarUrl;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private RegisterCustomConnectorRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.jarUrl = builder.jarUrl;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterCustomConnectorRequest create() {
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
     * @return jarUrl
     */
    public String getJarUrl() {
        return this.jarUrl;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<RegisterCustomConnectorRequest, Builder> {
        private String namespace; 
        private String jarUrl; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(RegisterCustomConnectorRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.jarUrl = request.jarUrl;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The name of the namespace.</p>
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
         * <p>The URL in which the JAR package of the custom connector is stored. The platform must be able to access this address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://flink/connector/mysql123</p>
         */
        public Builder jarUrl(String jarUrl) {
            this.putQueryParameter("jarUrl", jarUrl);
            this.jarUrl = jarUrl;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
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
        public RegisterCustomConnectorRequest build() {
            return new RegisterCustomConnectorRequest(this);
        } 

    } 

}
