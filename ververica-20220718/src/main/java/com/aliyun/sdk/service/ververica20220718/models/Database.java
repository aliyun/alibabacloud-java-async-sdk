// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Database} extends {@link TeaModel}
 *
 * <p>Database</p>
 */
public class Database extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.Map < String, ? > properties;

    private Database(Builder builder) {
        this.comment = builder.comment;
        this.name = builder.name;
        this.properties = builder.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Database create() {
        return builder().build();
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
    public java.util.Map < String, ? > getProperties() {
        return this.properties;
    }

    public static final class Builder {
        private String comment; 
        private String name; 
        private java.util.Map < String, ? > properties; 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
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
         * properties.
         */
        public Builder properties(java.util.Map < String, ? > properties) {
            this.properties = properties;
            return this;
        }

        public Database build() {
            return new Database(this);
        } 

    } 

}
