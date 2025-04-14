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
 * {@link LineageEntity} extends {@link TeaModel}
 *
 * <p>LineageEntity</p>
 */
public class LineageEntity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map<String, String> attributes;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private LineageEntity(Builder builder) {
        this.attributes = builder.attributes;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageEntity create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private java.util.Map<String, String> attributes; 
        private String id; 
        private String name; 

        private Builder() {
        } 

        private Builder(LineageEntity model) {
            this.attributes = model.attributes;
            this.id = model.id;
            this.name = model.name;
        } 

        /**
         * Attributes.
         */
        public Builder attributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public LineageEntity build() {
            return new LineageEntity(this);
        } 

    } 

}
