// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link DeleteKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteKnowledgeBaseRequest</p>
 */
public class DeleteKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String catalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String namespace;

    private DeleteKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<DeleteKnowledgeBaseRequest, Builder> {
        private String catalog; 
        private String knowledgeBaseName; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKnowledgeBaseRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.knowledgeBaseName = request.knowledgeBaseName;
            this.namespace = request.namespace;
        } 

        /**
         * <p>The data catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListCatalogs to obtain the value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.putQueryParameter("Catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>The name of the knowledge base, which is unique within the namespace. The name is specified during creation and cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-knowledge-base</p>
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.putQueryParameter("KnowledgeBaseName", knowledgeBaseName);
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListNamespaces to obtain the value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public DeleteKnowledgeBaseRequest build() {
            return new DeleteKnowledgeBaseRequest(this);
        } 

    } 

}
