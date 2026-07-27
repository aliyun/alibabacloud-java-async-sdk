// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ObserveResourceConfigFilter} extends {@link TeaModel}
 *
 * <p>ObserveResourceConfigFilter</p>
 */
public class ObserveResourceConfigFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("entityDomain")
    private QueryAlertRulesEntityDomainFilter entityDomain;

    @com.aliyun.core.annotation.NameInMap("entityType")
    private QueryAlertRulesEntityTypeFilter entityType;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private QueryAlertRulesNamespaceFilter namespace;

    @com.aliyun.core.annotation.NameInMap("productCategory")
    private QueryAlertRulesProductCategoryFilter productCategory;

    @com.aliyun.core.annotation.NameInMap("relationType")
    private QueryAlertRulesRelationTypeFilter relationType;

    @com.aliyun.core.annotation.NameInMap("resources")
    private QueryAlertRulesResourcesFilter resources;

    private ObserveResourceConfigFilter(Builder builder) {
        this.entityDomain = builder.entityDomain;
        this.entityType = builder.entityType;
        this.namespace = builder.namespace;
        this.productCategory = builder.productCategory;
        this.relationType = builder.relationType;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveResourceConfigFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityDomain
     */
    public QueryAlertRulesEntityDomainFilter getEntityDomain() {
        return this.entityDomain;
    }

    /**
     * @return entityType
     */
    public QueryAlertRulesEntityTypeFilter getEntityType() {
        return this.entityType;
    }

    /**
     * @return namespace
     */
    public QueryAlertRulesNamespaceFilter getNamespace() {
        return this.namespace;
    }

    /**
     * @return productCategory
     */
    public QueryAlertRulesProductCategoryFilter getProductCategory() {
        return this.productCategory;
    }

    /**
     * @return relationType
     */
    public QueryAlertRulesRelationTypeFilter getRelationType() {
        return this.relationType;
    }

    /**
     * @return resources
     */
    public QueryAlertRulesResourcesFilter getResources() {
        return this.resources;
    }

    public static final class Builder {
        private QueryAlertRulesEntityDomainFilter entityDomain; 
        private QueryAlertRulesEntityTypeFilter entityType; 
        private QueryAlertRulesNamespaceFilter namespace; 
        private QueryAlertRulesProductCategoryFilter productCategory; 
        private QueryAlertRulesRelationTypeFilter relationType; 
        private QueryAlertRulesResourcesFilter resources; 

        private Builder() {
        } 

        private Builder(ObserveResourceConfigFilter model) {
            this.entityDomain = model.entityDomain;
            this.entityType = model.entityType;
            this.namespace = model.namespace;
            this.productCategory = model.productCategory;
            this.relationType = model.relationType;
            this.resources = model.resources;
        } 

        /**
         * entityDomain.
         */
        public Builder entityDomain(QueryAlertRulesEntityDomainFilter entityDomain) {
            this.entityDomain = entityDomain;
            return this;
        }

        /**
         * entityType.
         */
        public Builder entityType(QueryAlertRulesEntityTypeFilter entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(QueryAlertRulesNamespaceFilter namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * productCategory.
         */
        public Builder productCategory(QueryAlertRulesProductCategoryFilter productCategory) {
            this.productCategory = productCategory;
            return this;
        }

        /**
         * relationType.
         */
        public Builder relationType(QueryAlertRulesRelationTypeFilter relationType) {
            this.relationType = relationType;
            return this;
        }

        /**
         * resources.
         */
        public Builder resources(QueryAlertRulesResourcesFilter resources) {
            this.resources = resources;
            return this;
        }

        public ObserveResourceConfigFilter build() {
            return new ObserveResourceConfigFilter(this);
        } 

    } 

}
