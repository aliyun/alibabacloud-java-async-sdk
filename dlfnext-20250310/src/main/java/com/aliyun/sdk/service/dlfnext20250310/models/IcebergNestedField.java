// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link IcebergNestedField} extends {@link TeaModel}
 *
 * <p>IcebergNestedField</p>
 */
public class IcebergNestedField extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("doc")
    private String doc;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("optional")
    private Boolean optional;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private IcebergNestedField(Builder builder) {
        this.doc = builder.doc;
        this.id = builder.id;
        this.name = builder.name;
        this.optional = builder.optional;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IcebergNestedField create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return doc
     */
    public String getDoc() {
        return this.doc;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return optional
     */
    public Boolean getOptional() {
        return this.optional;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String doc; 
        private Long id; 
        private String name; 
        private Boolean optional; 
        private String type; 

        private Builder() {
        } 

        private Builder(IcebergNestedField model) {
            this.doc = model.doc;
            this.id = model.id;
            this.name = model.name;
            this.optional = model.optional;
            this.type = model.type;
        } 

        /**
         * doc.
         */
        public Builder doc(String doc) {
            this.doc = doc;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * optional.
         */
        public Builder optional(Boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public IcebergNestedField build() {
            return new IcebergNestedField(this);
        } 

    } 

}
