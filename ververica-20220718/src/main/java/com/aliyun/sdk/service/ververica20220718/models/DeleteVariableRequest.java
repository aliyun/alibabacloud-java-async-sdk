// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVariableRequest} extends {@link RequestModel}
 *
 * <p>DeleteVariableRequest</p>
 */
public class DeleteVariableRequest extends Request {
    @Path
    @NameInMap("namespace")
    @Validation(required = true)
    private String namespace;

    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Header
    @NameInMap("workspace")
    @Validation(required = true)
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
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * workspace.
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
