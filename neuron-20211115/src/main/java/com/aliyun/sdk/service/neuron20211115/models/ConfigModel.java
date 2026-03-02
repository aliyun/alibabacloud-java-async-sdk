// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ConfigModel} extends {@link TeaModel}
 *
 * <p>ConfigModel</p>
 */
public class ConfigModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("attribute")
    private String attribute;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private ConfigModel(Builder builder) {
        this.attribute = builder.attribute;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attribute
     */
    public String getAttribute() {
        return this.attribute;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String attribute; 
        private String type; 
        private String value; 

        private Builder() {
        } 

        private Builder(ConfigModel model) {
            this.attribute = model.attribute;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * attribute.
         */
        public Builder attribute(String attribute) {
            this.attribute = attribute;
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
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public ConfigModel build() {
            return new ConfigModel(this);
        } 

    } 

}
