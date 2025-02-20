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
 * {@link DeleteCustomConnectorRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomConnectorRequest</p>
 */
public class DeleteCustomConnectorRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("connectorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private DeleteCustomConnectorRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.connectorName = builder.connectorName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomConnectorRequest create() {
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
     * @return connectorName
     */
    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<DeleteCustomConnectorRequest, Builder> {
        private String namespace; 
        private String connectorName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomConnectorRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.connectorName = request.connectorName;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-flink-bigdata-default</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The name of the custom connector.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql-test</p>
         */
        public Builder connectorName(String connectorName) {
            this.putPathParameter("connectorName", connectorName);
            this.connectorName = connectorName;
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
        public DeleteCustomConnectorRequest build() {
            return new DeleteCustomConnectorRequest(this);
        } 

    } 

}
