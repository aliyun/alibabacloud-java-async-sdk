// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link EnableCollectionGraphRAGRequest} extends {@link RequestModel}
 *
 * <p>EnableCollectionGraphRAGRequest</p>
 */
public class EnableCollectionGraphRAGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> entityTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LLMModel")
    private String LLMModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagerAccount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String managerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagerAccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String managerAccountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespacePassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespacePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationshipTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> relationshipTypes;

    private EnableCollectionGraphRAGRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.DBInstanceId = builder.DBInstanceId;
        this.entityTypes = builder.entityTypes;
        this.LLMModel = builder.LLMModel;
        this.language = builder.language;
        this.managerAccount = builder.managerAccount;
        this.managerAccountPassword = builder.managerAccountPassword;
        this.namespace = builder.namespace;
        this.namespacePassword = builder.namespacePassword;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.relationshipTypes = builder.relationshipTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCollectionGraphRAGRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collection
     */
    public String getCollection() {
        return this.collection;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return entityTypes
     */
    public java.util.List<String> getEntityTypes() {
        return this.entityTypes;
    }

    /**
     * @return LLMModel
     */
    public String getLLMModel() {
        return this.LLMModel;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return managerAccount
     */
    public String getManagerAccount() {
        return this.managerAccount;
    }

    /**
     * @return managerAccountPassword
     */
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespacePassword
     */
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return relationshipTypes
     */
    public java.util.List<String> getRelationshipTypes() {
        return this.relationshipTypes;
    }

    public static final class Builder extends Request.Builder<EnableCollectionGraphRAGRequest, Builder> {
        private String collection; 
        private String DBInstanceId; 
        private java.util.List<String> entityTypes; 
        private String LLMModel; 
        private String language; 
        private String managerAccount; 
        private String managerAccountPassword; 
        private String namespace; 
        private String namespacePassword; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List<String> relationshipTypes; 

        private Builder() {
            super();
        } 

        private Builder(EnableCollectionGraphRAGRequest request) {
            super(request);
            this.collection = request.collection;
            this.DBInstanceId = request.DBInstanceId;
            this.entityTypes = request.entityTypes;
            this.LLMModel = request.LLMModel;
            this.language = request.language;
            this.managerAccount = request.managerAccount;
            this.managerAccountPassword = request.managerAccountPassword;
            this.namespace = request.namespace;
            this.namespacePassword = request.namespacePassword;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.relationshipTypes = request.relationshipTypes;
        } 

        /**
         * <p>The name of the document collection.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation to create a document collection and call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to query a list of document collections.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        public Builder collection(String collection) {
            this.putQueryParameter("Collection", collection);
            this.collection = collection;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The list of entity types.</p>
         * <blockquote>
         * <p>If the knowledge graph construction is enabled, this parameter is required.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder entityTypes(java.util.List<String> entityTypes) {
            String entityTypesShrink = shrink(entityTypes, "EntityTypes", "json");
            this.putQueryParameter("EntityTypes", entityTypesShrink);
            this.entityTypes = entityTypes;
            return this;
        }

        /**
         * <p>The name of the LLM model.</p>
         * <blockquote>
         * <p>Valid values:</p>
         * </blockquote>
         * <ul>
         * <li><p>knowledge-extract-standard: the default value.</p>
         * </li>
         * <li><p>knowledge-extract-mini</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when the knowledge graph construction is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>knowledge-extract-standard</p>
         */
        public Builder LLMModel(String LLMModel) {
            this.putQueryParameter("LLMModel", LLMModel);
            this.LLMModel = LLMModel;
            return this;
        }

        /**
         * <p>The language used to build the knowledge graph. Valid values:</p>
         * <ul>
         * <li>Simplified Chinese. The default value.</li>
         * <li>English.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when the knowledge graph construction is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Simplified Chinese</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The name of the privileged database account that has the rds_superuser permission.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2361789.html">CreateAccount</a> operation to create an account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testaccount</p>
         */
        public Builder managerAccount(String managerAccount) {
            this.putQueryParameter("ManagerAccount", managerAccount);
            this.managerAccount = managerAccount;
            return this;
        }

        /**
         * <p>The password for the privileged database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testpassword</p>
         */
        public Builder managerAccountPassword(String managerAccountPassword) {
            this.putQueryParameter("ManagerAccountPassword", managerAccountPassword);
            this.managerAccountPassword = managerAccountPassword;
            return this;
        }

        /**
         * <p>The name of the namespace. Default value: public.</p>
         * <blockquote>
         * <p>You can call the CreateNamespace operation to create a namespace and call the ListNamespaces operation to query a list of namespaces.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mynamespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The password of the namespace.</p>
         * <blockquote>
         * <p>The value of this parameter is specified by <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testpassword</p>
         */
        public Builder namespacePassword(String namespacePassword) {
            this.putQueryParameter("NamespacePassword", namespacePassword);
            this.namespacePassword = namespacePassword;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of relationship edge types.</p>
         * <blockquote>
         * <p>If the knowledge graph construction is enabled, this parameter is required.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder relationshipTypes(java.util.List<String> relationshipTypes) {
            String relationshipTypesShrink = shrink(relationshipTypes, "RelationshipTypes", "json");
            this.putQueryParameter("RelationshipTypes", relationshipTypesShrink);
            this.relationshipTypes = relationshipTypes;
            return this;
        }

        @Override
        public EnableCollectionGraphRAGRequest build() {
            return new EnableCollectionGraphRAGRequest(this);
        } 

    } 

}
