// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
    private java.util.Map < String, String > attributes;

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

    /**
     * @return attributes
     */
    public java.util.Map < String, String > getAttributes() {
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
        private java.util.Map < String, String > attributes; 
        private String detailUrl; 
        private String entityType; 
        private String name; 
        private String owner; 
        private String parentName; 
        private String qualifiedName; 

        /**
         * Attributes.
         */
        public Builder attributes(java.util.Map < String, String > attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * DetailUrl.
         */
        public Builder detailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * ParentName.
         */
        public Builder parentName(String parentName) {
            this.parentName = parentName;
            return this;
        }

        /**
         * QualifiedName.
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
