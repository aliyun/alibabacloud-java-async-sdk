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
 * {@link Namespace} extends {@link TeaModel}
 *
 * <p>Namespace</p>
 */
public class Namespace extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalog;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("properties")
    private String properties;

    private Namespace(Builder builder) {
        this.catalog = builder.catalog;
        this.comment = builder.comment;
        this.name = builder.name;
        this.properties = builder.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Namespace create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return properties
     */
    public String getProperties() {
        return this.properties;
    }

    public static final class Builder {
        private String catalog; 
        private String comment; 
        private String name; 
        private String properties; 

        private Builder() {
        } 

        private Builder(Namespace model) {
            this.catalog = model.catalog;
            this.comment = model.comment;
            this.name = model.name;
            this.properties = model.properties;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder catalog(String catalog) {
            this.catalog = catalog;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
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
         * properties.
         */
        public Builder properties(String properties) {
            this.properties = properties;
            return this;
        }

        public Namespace build() {
            return new Namespace(this);
        } 

    } 

}
