// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FieldSchema} extends {@link TeaModel}
 *
 * <p>FieldSchema</p>
 */
public class FieldSchema extends TeaModel {
    @NameInMap("Comment")
    private String comment;

    @NameInMap("Name")
    private String name;

    @NameInMap("Parameters")
    private java.util.Map < String, String > parameters;

    @NameInMap("Type")
    private String type;

    private FieldSchema(Builder builder) {
        this.comment = builder.comment;
        this.name = builder.name;
        this.parameters = builder.parameters;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FieldSchema create() {
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
     * @return parameters
     */
    public java.util.Map < String, String > getParameters() {
        return this.parameters;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String comment; 
        private String name; 
        private java.util.Map < String, String > parameters; 
        private String type; 

        /**
         * Comment
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Name
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, String > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Type
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public FieldSchema build() {
            return new FieldSchema(this);
        } 

    } 

}
