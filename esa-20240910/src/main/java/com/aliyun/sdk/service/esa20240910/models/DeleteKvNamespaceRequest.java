// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DeleteKvNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteKvNamespaceRequest</p>
 */
public class DeleteKvNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private DeleteKvNamespaceRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKvNamespaceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteKvNamespaceRequest, Builder> {
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKvNamespaceRequest request) {
            super(request);
            this.namespace = request.namespace;
        } 

        /**
         * <p>The name of the namespace that you specify when you call the <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public DeleteKvNamespaceRequest build() {
            return new DeleteKvNamespaceRequest(this);
        } 

    } 

}
