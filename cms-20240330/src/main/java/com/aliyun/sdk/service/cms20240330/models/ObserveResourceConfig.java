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
 * {@link ObserveResourceConfig} extends {@link TeaModel}
 *
 * <p>ObserveResourceConfig</p>
 */
public class ObserveResourceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("entityDomain")
    private String entityDomain;

    @com.aliyun.core.annotation.NameInMap("entityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("productCategory")
    private String productCategory;

    @com.aliyun.core.annotation.NameInMap("relationType")
    private String relationType;

    @com.aliyun.core.annotation.NameInMap("resources")
    private java.util.List<String> resources;

    private ObserveResourceConfig(Builder builder) {
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

    public static ObserveResourceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityDomain
     */
    public String getEntityDomain() {
        return this.entityDomain;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return productCategory
     */
    public String getProductCategory() {
        return this.productCategory;
    }

    /**
     * @return relationType
     */
    public String getRelationType() {
        return this.relationType;
    }

    /**
     * @return resources
     */
    public java.util.List<String> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String entityDomain; 
        private String entityType; 
        private String namespace; 
        private String productCategory; 
        private String relationType; 
        private java.util.List<String> resources; 

        private Builder() {
        } 

        private Builder(ObserveResourceConfig model) {
            this.entityDomain = model.entityDomain;
            this.entityType = model.entityType;
            this.namespace = model.namespace;
            this.productCategory = model.productCategory;
            this.relationType = model.relationType;
            this.resources = model.resources;
        } 

        /**
         * <p>The UModel entity domain.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_monitor</p>
         */
        public Builder entityDomain(String entityDomain) {
            this.entityDomain = entityDomain;
            return this;
        }

        /**
         * <p>The UModel entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>The CloudMonitor namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The CloudMonitor product category.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCategory(String productCategory) {
            this.productCategory = productCategory;
            return this;
        }

        /**
         * <p>The relation type. TAG is supported only for alert rules where datasourceConfig.type is APM and queryConfig.type is APM_MULTI_QUERY. UMODEL_ENTITY does not support write operations and is used only to read existing data.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder relationType(String relationType) {
            this.relationType = relationType;
            return this;
        }

        /**
         * <p>The resource list. This field can be left empty when relationType is set to ALL, which indicates all resources. When relationType is set to TAG, this field is a list of tags in the key=value format, such as [&quot;env=prod&quot;, &quot;app=foo&quot;]. Only the APM data source and APM_MULTI_QUERY are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;i-bp1a2b3c4d5e6f7g8h9i&quot;,&quot;i-bp9h8g7f6e5d4c3b2a1&quot;]</p>
         */
        public Builder resources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }

        public ObserveResourceConfig build() {
            return new ObserveResourceConfig(this);
        } 

    } 

}
