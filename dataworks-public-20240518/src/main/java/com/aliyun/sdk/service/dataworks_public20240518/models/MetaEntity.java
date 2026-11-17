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
 * {@link MetaEntity} extends {@link TeaModel}
 *
 * <p>MetaEntity</p>
 */
public class MetaEntity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map<String, String> attributes;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("CustomAttributes")
    private java.util.Map<String, java.util.List<String>> customAttributes;

    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("MetaEntityDef")
    private MetaEntityDef metaEntityDef;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    private MetaEntity(Builder builder) {
        this.attributes = builder.attributes;
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.customAttributes = builder.customAttributes;
        this.entityType = builder.entityType;
        this.id = builder.id;
        this.metaEntityDef = builder.metaEntityDef;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaEntity create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return metaEntityDef
     */
    public MetaEntityDef getMetaEntityDef() {
        return this.metaEntityDef;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder {
        private java.util.Map<String, String> attributes; 
        private String comment; 
        private Long createTime; 
        private java.util.Map<String, java.util.List<String>> customAttributes; 
        private String entityType; 
        private String id; 
        private MetaEntityDef metaEntityDef; 
        private Long modifyTime; 
        private String name; 
        private String ownerId; 

        private Builder() {
        } 

        private Builder(MetaEntity model) {
            this.attributes = model.attributes;
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.customAttributes = model.customAttributes;
            this.entityType = model.entityType;
            this.id = model.id;
            this.metaEntityDef = model.metaEntityDef;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
            this.ownerId = model.ownerId;
        } 

        /**
         * <p>The entity properties. Complex values are represented as JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;: &quot;v1&quot;}</p>
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
         * <p>The creation time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1780553640613</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The custom attribute values. The key is the custom attribute identifier, and the value is a list of attribute values.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;owner_name&quot;:[&quot;Zhang San&quot;]}</p>
         */
        public Builder customAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }

        /**
         * <p>The entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_entity-customer_api</p>
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>The entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_entity-customer_api:api_001</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The property definition of the custom entity. <notice>This legacy property is not populated. To retrieve the entity type definition, call GetMetaEntityDef.</notice></p>
         */
        public Builder metaEntityDef(MetaEntityDef metaEntityDef) {
            this.metaEntityDef = metaEntityDef;
            return this;
        }

        /**
         * <p>The modification time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1763380628000</p>
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The entity name.</p>
         * 
         * <strong>example:</strong>
         * <p>api_001</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The owner ID. Default value: the Alibaba Cloud UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>207924799988354</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public MetaEntity build() {
            return new MetaEntity(this);
        } 

    } 

}
