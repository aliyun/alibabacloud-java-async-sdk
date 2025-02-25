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
 * {@link CreateKvNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateKvNamespaceRequest</p>
 */
public class CreateKvNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private CreateKvNamespaceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKvNamespaceRequest create() {
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

    public static final class Builder extends Request.Builder<CreateKvNamespaceRequest, Builder> {
        private String description; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(CreateKvNamespaceRequest request) {
            super(request);
            this.description = request.description;
            this.namespace = request.namespace;
        } 

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test namespace.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public CreateKvNamespaceRequest build() {
            return new CreateKvNamespaceRequest(this);
        } 

    } 

}
