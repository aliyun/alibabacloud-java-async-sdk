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
 * {@link LineageTask} extends {@link TeaModel}
 *
 * <p>LineageTask</p>
 */
public class LineageTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map<String, String> attributes;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private LineageTask(Builder builder) {
        this.attributes = builder.attributes;
        this.id = builder.id;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageTask create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.Map<String, String> attributes; 
        private String id; 
        private String type; 

        private Builder() {
        } 

        private Builder(LineageTask model) {
            this.attributes = model.attributes;
            this.id = model.id;
            this.type = model.type;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public LineageTask build() {
            return new LineageTask(this);
        } 

    } 

}
