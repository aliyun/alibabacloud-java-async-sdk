// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ModelParameterRule} extends {@link TeaModel}
 *
 * <p>ModelParameterRule</p>
 */
public class ModelParameterRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("default")
    private Object _default;

    @com.aliyun.core.annotation.NameInMap("max")
    private Integer max;

    @com.aliyun.core.annotation.NameInMap("min")
    private Integer min;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("required")
    private Boolean required;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ModelParameterRule(Builder builder) {
        this._default = builder._default;
        this.max = builder.max;
        this.min = builder.min;
        this.name = builder.name;
        this.required = builder.required;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelParameterRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return _default
     */
    public Object get_default() {
        return this._default;
    }

    /**
     * @return max
     */
    public Integer getMax() {
        return this.max;
    }

    /**
     * @return min
     */
    public Integer getMin() {
        return this.min;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return required
     */
    public Boolean getRequired() {
        return this.required;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Object _default; 
        private Integer max; 
        private Integer min; 
        private String name; 
        private Boolean required; 
        private String type; 

        private Builder() {
        } 

        private Builder(ModelParameterRule model) {
            this._default = model._default;
            this.max = model.max;
            this.min = model.min;
            this.name = model.name;
            this.required = model.required;
            this.type = model.type;
        } 

        /**
         * default.
         */
        public Builder _default(Object _default) {
            this._default = _default;
            return this;
        }

        /**
         * max.
         */
        public Builder max(Integer max) {
            this.max = max;
            return this;
        }

        /**
         * min.
         */
        public Builder min(Integer min) {
            this.min = min;
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
         * required.
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ModelParameterRule build() {
            return new ModelParameterRule(this);
        } 

    } 

}
