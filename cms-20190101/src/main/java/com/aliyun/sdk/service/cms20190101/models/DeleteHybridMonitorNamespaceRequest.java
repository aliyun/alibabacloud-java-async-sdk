// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHybridMonitorNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteHybridMonitorNamespaceRequest</p>
 */
public class DeleteHybridMonitorNamespaceRequest extends Request {
    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private DeleteHybridMonitorNamespaceRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHybridMonitorNamespaceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteHybridMonitorNamespaceRequest, Builder> {
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHybridMonitorNamespaceRequest request) {
            super(request);
            this.namespace = request.namespace;
        } 

        /**
         * The ID of the request.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public DeleteHybridMonitorNamespaceRequest build() {
            return new DeleteHybridMonitorNamespaceRequest(this);
        } 

    } 

}
