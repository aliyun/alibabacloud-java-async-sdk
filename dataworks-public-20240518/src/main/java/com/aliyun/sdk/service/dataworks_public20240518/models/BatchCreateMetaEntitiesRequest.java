// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link BatchCreateMetaEntitiesRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateMetaEntitiesRequest</p>
 */
public class BatchCreateMetaEntitiesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Entities")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Entities> entities;

    private BatchCreateMetaEntitiesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entities = builder.entities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateMetaEntitiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return entities
     */
    public java.util.List<Entities> getEntities() {
        return this.entities;
    }

    public static final class Builder extends Request.Builder<BatchCreateMetaEntitiesRequest, Builder> {
        private String regionId; 
        private java.util.List<Entities> entities; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateMetaEntitiesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entities = request.entities;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of entities. A maximum of five entities are supported. All entities in the same batch must have the same entityType.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder entities(java.util.List<Entities> entities) {
            String entitiesShrink = shrink(entities, "Entities", "json");
            this.putBodyParameter("Entities", entitiesShrink);
            this.entities = entities;
            return this;
        }

        @Override
        public BatchCreateMetaEntitiesRequest build() {
            return new BatchCreateMetaEntitiesRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateMetaEntitiesRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateMetaEntitiesRequest</p>
     */
    public static class Entities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.Map<String, String> attributes;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CustomAttributes")
        private java.util.Map<String, java.util.List<String>> customAttributes;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private Entities(Builder builder) {
            this.attributes = builder.attributes;
            this.comment = builder.comment;
            this.customAttributes = builder.customAttributes;
            this.entityType = builder.entityType;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entities create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return customAttributes
         */
        public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
            return this.customAttributes;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.Map<String, String> attributes; 
            private String comment; 
            private java.util.Map<String, java.util.List<String>> customAttributes; 
            private String entityType; 
            private String name; 

            private Builder() {
            } 

            private Builder(Entities model) {
                this.attributes = model.attributes;
                this.comment = model.comment;
                this.customAttributes = model.customAttributes;
                this.entityType = model.entityType;
                this.name = model.name;
            } 

            /**
             * <p>The entity attributes. Complex values must be serialized as JSON strings.</p>
             */
            public Builder attributes(java.util.Map<String, String> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The comment.</p>
             * 
             * <strong>example:</strong>
             * <p>this is a comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The custom attribute values. The key is the custom attribute identifier, and the value currently supports only a single value.
             * <notice>The custom attributes used here must be created in advance by calling the CreateCustomAttribute operation. For example, after you call the API to create a custom attribute with the ID <code>custom-attribute:owner_name</code>, you can configure {\&quot;owner_name\&quot;: [\&quot;Bob\&quot;]} here to complete the custom attribute configuration.</notice></p>
             */
            public Builder customAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
                this.customAttributes = customAttributes;
                return this;
            }

            /**
             * <p>The entity type. All entities in the same batch must have the same type. The following types are supported:</p>
             * <ul>
             * <li>Custom entity types, such as custom_entity-biz_api.</li>
             * <li>Extension table types. If the metadata entity type custom_dw-table is registered, you can create objects of the corresponding database type custom_dw-database and table type custom_dw-table.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>custom_entity-customer_api</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The entity name. The name can contain uppercase letters, lowercase letters, digits, and underscores (_). It must start with a letter and can be up to 64 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>api_001</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Entities build() {
                return new Entities(this);
            } 

        } 

    }
}
