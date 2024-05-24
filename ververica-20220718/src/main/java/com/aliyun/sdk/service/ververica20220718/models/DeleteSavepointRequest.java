// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSavepointRequest} extends {@link RequestModel}
 *
 * <p>DeleteSavepointRequest</p>
 */
public class DeleteSavepointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("savepointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String savepointId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private DeleteSavepointRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.savepointId = builder.savepointId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSavepointRequest create() {
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
     * @return savepointId
     */
    public String getSavepointId() {
        return this.savepointId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<DeleteSavepointRequest, Builder> {
        private String namespace; 
        private String savepointId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSavepointRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.savepointId = request.savepointId;
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
         * savepointId.
         */
        public Builder savepointId(String savepointId) {
            this.putPathParameter("savepointId", savepointId);
            this.savepointId = savepointId;
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
        public DeleteSavepointRequest build() {
            return new DeleteSavepointRequest(this);
        } 

    } 

}
