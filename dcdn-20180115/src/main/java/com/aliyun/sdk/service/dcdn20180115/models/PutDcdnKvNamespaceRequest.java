// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutDcdnKvNamespaceRequest} extends {@link RequestModel}
 *
 * <p>PutDcdnKvNamespaceRequest</p>
 */
public class PutDcdnKvNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The description of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>the first namespace</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the namespace. The name can contain letters, digits, hyphens (-), and underscores (_).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
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
