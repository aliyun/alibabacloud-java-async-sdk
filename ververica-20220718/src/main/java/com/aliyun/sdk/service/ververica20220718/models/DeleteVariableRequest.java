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
 * {@link DeleteVariableRequest} extends {@link RequestModel}
 *
 * <p>DeleteVariableRequest</p>
 */
public class DeleteVariableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private DeleteVariableRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.name = builder.name;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVariableRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<DeleteVariableRequest, Builder> {
        private String namespace; 
        private String name; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVariableRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.name = request.name;
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
         * <p>The name of the variable that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>variableName</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
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
        public DeleteVariableRequest build() {
            return new DeleteVariableRequest(this);
        } 

    } 

}
