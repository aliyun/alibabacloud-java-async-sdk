// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link LineageEntityVO} extends {@link TeaModel}
 *
 * <p>LineageEntityVO</p>
 */
public class LineageEntityVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map<String, String> attributes;

    @com.aliyun.core.annotation.NameInMap("DetailUrl")
    private String detailUrl;

    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("ParentName")
    private String parentName;

    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    private String qualifiedName;

    private LineageEntityVO(Builder builder) {
        this.attributes = builder.attributes;
        this.detailUrl = builder.detailUrl;
        this.entityType = builder.entityType;
        this.name = builder.name;
        this.owner = builder.owner;
        this.parentName = builder.parentName;
        this.qualifiedName = builder.qualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageEntityVO create() {
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
     * @return detailUrl
     */
    public String getDetailUrl() {
        return this.detailUrl;
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

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return parentName
     */
    public String getParentName() {
        return this.parentName;
    }

    /**
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public static final class Builder {
        private java.util.Map<String, String> attributes; 
        private String detailUrl; 
        private String entityType; 
        private String name; 
        private String owner; 
        private String parentName; 
        private String qualifiedName; 

        private Builder() {
        } 

        private Builder(LineageEntityVO model) {
            this.attributes = model.attributes;
            this.detailUrl = model.detailUrl;
            this.entityType = model.entityType;
            this.name = model.name;
            this.owner = model.owner;
            this.parentName = model.parentName;
            this.qualifiedName = model.qualifiedName;
        } 

        /**
         * <p>A map of additional key-value attributes for the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>attribute map</p>
         */
        public Builder attributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>A URL for more details about the entity.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://domain.test.url/entity">http://domain.test.url/entity</a></p>
         */
        public Builder detailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }

        /**
         * <p>The type of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table</p>
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>The human-readable name of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>tableName</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The owner of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>The name of the entity\&quot;s parent container, such as a database.</p>
         * 
         * <strong>example:</strong>
         * <p>dbName</p>
         */
        public Builder parentName(String parentName) {
            this.parentName = parentName;
            return this;
        }

        /**
         * <p>The unique, fully qualified name of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table.projectName.tablename</p>
         */
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        public LineageEntityVO build() {
            return new LineageEntityVO(this);
        } 

    } 

}
