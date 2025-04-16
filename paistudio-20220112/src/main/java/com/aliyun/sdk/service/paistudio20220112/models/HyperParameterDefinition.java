// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link HyperParameterDefinition} extends {@link TeaModel}
 *
 * <p>HyperParameterDefinition</p>
 */
public class HyperParameterDefinition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Range")
    private HyperParameterRange range;

    @com.aliyun.core.annotation.NameInMap("Required")
    private Boolean required;

    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private HyperParameterDefinition(Builder builder) {
        this.defaultValue = builder.defaultValue;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.name = builder.name;
        this.range = builder.range;
        this.required = builder.required;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HyperParameterDefinition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultValue
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return range
     */
    public HyperParameterRange getRange() {
        return this.range;
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
        private String defaultValue; 
        private String description; 
        private String displayName; 
        private String name; 
        private HyperParameterRange range; 
        private Boolean required; 
        private String type; 

        private Builder() {
        } 

        private Builder(HyperParameterDefinition model) {
            this.defaultValue = model.defaultValue;
            this.description = model.description;
            this.displayName = model.displayName;
            this.name = model.name;
            this.range = model.range;
            this.required = model.required;
            this.type = model.type;
        } 

        /**
         * DefaultValue.
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Range.
         */
        public Builder range(HyperParameterRange range) {
            this.range = range;
            return this;
        }

        /**
         * Required.
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public HyperParameterDefinition build() {
            return new HyperParameterDefinition(this);
        } 

    } 

}
