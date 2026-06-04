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
 * {@link MetaEntityDef} extends {@link TeaModel}
 *
 * <p>MetaEntityDef</p>
 */
public class MetaEntityDef extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttributeDefs")
    private java.util.List<MetaEntityAttributeDef> attributeDefs;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private MetaEntityDef(Builder builder) {
        this.attributeDefs = builder.attributeDefs;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.entityType = builder.entityType;
        this.extend = builder.extend;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaEntityDef create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributeDefs
     */
    public java.util.List<MetaEntityAttributeDef> getAttributeDefs() {
        return this.attributeDefs;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
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

    public static final class Builder {
        private java.util.List<MetaEntityAttributeDef> attributeDefs; 
        private Long createTime; 
        private String description; 
        private String displayName; 
        private String entityType; 
        private String extend; 
        private Long modifyTime; 
        private String name; 

        private Builder() {
        } 

        private Builder(MetaEntityDef model) {
            this.attributeDefs = model.attributeDefs;
            this.createTime = model.createTime;
            this.description = model.description;
            this.displayName = model.displayName;
            this.entityType = model.entityType;
            this.extend = model.extend;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
        } 

        /**
         * AttributeDefs.
         */
        public Builder attributeDefs(java.util.List<MetaEntityAttributeDef> attributeDefs) {
            this.attributeDefs = attributeDefs;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * Extend.
         */
        public Builder extend(String extend) {
            this.extend = extend;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public MetaEntityDef build() {
            return new MetaEntityDef(this);
        } 

    } 

}
