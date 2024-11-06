// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDcdnKvNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteDcdnKvNamespaceRequest</p>
 */
public class DeleteDcdnKvNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private DeleteDcdnKvNamespaceRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnKvNamespaceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDcdnKvNamespaceRequest, Builder> {
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDcdnKvNamespaceRequest request) {
            super(request);
            this.namespace = request.namespace;
        } 

        /**
         * <p>The name of the namespace. You can call the <a href="~~PutDcdnKvNamespace~~">PutDcdnKvNamespace</a> operation to query the name of a namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public DeleteDcdnKvNamespaceRequest build() {
            return new DeleteDcdnKvNamespaceRequest(this);
        } 

    } 

}
