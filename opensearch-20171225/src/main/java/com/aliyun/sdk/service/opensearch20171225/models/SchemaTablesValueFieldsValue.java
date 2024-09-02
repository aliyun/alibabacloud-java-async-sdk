// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SchemaTablesValueFieldsValue} extends {@link TeaModel}
 *
 * <p>SchemaTablesValueFieldsValue</p>
 */
public class SchemaTablesValueFieldsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("primaryKey")
    private Boolean primaryKey;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("joinWith")
    private java.util.List < String > joinWith;

    @com.aliyun.core.annotation.NameInMap("label")
    private String label;

    private SchemaTablesValueFieldsValue(Builder builder) {
        this.name = builder.name;
        this.primaryKey = builder.primaryKey;
        this.type = builder.type;
        this.joinWith = builder.joinWith;
        this.label = builder.label;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SchemaTablesValueFieldsValue create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return primaryKey
     */
    public Boolean getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return joinWith
     */
    public java.util.List < String > getJoinWith() {
        return this.joinWith;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    public static final class Builder {
        private String name; 
        private Boolean primaryKey; 
        private String type; 
        private java.util.List < String > joinWith; 
        private String label; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * primaryKey.
         */
        public Builder primaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * joinWith.
         */
        public Builder joinWith(java.util.List < String > joinWith) {
            this.joinWith = joinWith;
            return this;
        }

        /**
         * label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public SchemaTablesValueFieldsValue build() {
            return new SchemaTablesValueFieldsValue(this);
        } 

    } 

}
