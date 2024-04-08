// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutDcdnKvNamespaceRequest} extends {@link RequestModel}
 *
 * <p>PutDcdnKvNamespaceRequest</p>
 */
public class PutDcdnKvNamespaceRequest extends Request {
    @Body
    @NameInMap("Description")
    @Validation(required = true, maxLength = 1024)
    private String description;

    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private PutDcdnKvNamespaceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDcdnKvNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<PutDcdnKvNamespaceRequest, Builder> {
        private String description; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(PutDcdnKvNamespaceRequest request) {
            super(request);
            this.description = request.description;
            this.namespace = request.namespace;
        } 

        /**
         * The description of the namespace.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the namespace. The name can contain letters, digits, hyphens (-), and underscores (\_).
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public PutDcdnKvNamespaceRequest build() {
            return new PutDcdnKvNamespaceRequest(this);
        } 

    } 

}
