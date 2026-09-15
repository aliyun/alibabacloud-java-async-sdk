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
 * {@link GetLumaDocumentDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetLumaDocumentDownloadUrlRequest</p>
 */
public class GetLumaDocumentDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String catalog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    private GetLumaDocumentDownloadUrlRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.catalog = builder.catalog;
        this.documentId = builder.documentId;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.namespace = builder.namespace;
        this.networkType = builder.networkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLumaDocumentDownloadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return documentId
     */
    public String getDocumentId() {
        return this.documentId;
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

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    public static final class Builder extends Request.Builder<GetLumaDocumentDownloadUrlRequest, Builder> {
        private String agentName; 
        private String catalog; 
        private String documentId; 
        private String knowledgeBaseName; 
        private String namespace; 
        private String networkType; 

        private Builder() {
            super();
        } 

        private Builder(GetLumaDocumentDownloadUrlRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.catalog = request.catalog;
            this.documentId = request.documentId;
            this.knowledgeBaseName = request.knowledgeBaseName;
            this.namespace = request.namespace;
            this.networkType = request.networkType;
        } 

        /**
         * <p>The name of the Agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_agent</p>
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>The name of the data catalog bound to the Agent. You can call ListLumaCatalogs to obtain this value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.putBodyParameter("Catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>The unique identifier of the document. You can call ListLumaDocuments to obtain this value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-a1b2c3d4</p>
         */
        public Builder documentId(String documentId) {
            this.putBodyParameter("DocumentId", documentId);
            this.documentId = documentId;
            return this;
        }

        /**
         * <p>The name of the knowledge base bound to the Agent. You can call ListLumaKnowledgeBases to obtain this value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-knowledge-base</p>
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.putBodyParameter("KnowledgeBaseName", knowledgeBaseName);
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * <p>The name of the namespace bound to the Agent. You can call ListLumaNamespaces to obtain this value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>public: public network.</li>
         * <li>vpc: internal network.</li>
         * </ul>
         * <p>Default value: public.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        @Override
        public GetLumaDocumentDownloadUrlRequest build() {
            return new GetLumaDocumentDownloadUrlRequest(this);
        } 

    } 

}
