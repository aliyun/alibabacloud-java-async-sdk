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
 * {@link SinkKnowledgeBaseParameters} extends {@link TeaModel}
 *
 * <p>SinkKnowledgeBaseParameters</p>
 */
public class SinkKnowledgeBaseParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Catalog")
    private String catalog;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseName")
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    private SinkKnowledgeBaseParameters(Builder builder) {
        this.catalog = builder.catalog;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkKnowledgeBaseParameters create() {
        return builder().build();
    }

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

    public static final class Builder {
        private String catalog; 
        private String knowledgeBaseName; 
        private String namespace; 

        private Builder() {
        } 

        private Builder(SinkKnowledgeBaseParameters model) {
            this.catalog = model.catalog;
            this.knowledgeBaseName = model.knowledgeBaseName;
            this.namespace = model.namespace;
        } 

        /**
         * <p>The data catalog to which the target knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies the knowledge base. You can call ListCatalogs to obtain this value.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>The name of the target knowledge base, which is unique within the namespace. You can call ListKnowledgeBases to obtain this value.</p>
         * 
         * <strong>example:</strong>
         * <p>my-knowledge-base</p>
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * <p>The namespace to which the target knowledge base belongs. The namespace must belong to the specified data catalog. You can call ListNamespaces to obtain this value.</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        public SinkKnowledgeBaseParameters build() {
            return new SinkKnowledgeBaseParameters(this);
        } 

    } 

}
