// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link TemplateVariable} extends {@link TeaModel}
 *
 * <p>TemplateVariable</p>
 */
public class TemplateVariable extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("properties")
    private Object properties;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private TemplateVariable(Builder builder) {
        this.name = builder.name;
        this.properties = builder.properties;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateVariable create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Object getProperties() {
        return this.properties;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String name; 
        private Object properties; 
        private String type; 

        private Builder() {
        } 

        private Builder(TemplateVariable model) {
            this.name = model.name;
            this.properties = model.properties;
            this.type = model.type;
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
        public Builder properties(Object properties) {
            this.properties = properties;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public TemplateVariable build() {
            return new TemplateVariable(this);
        } 

    } 

}
