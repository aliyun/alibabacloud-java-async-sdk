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
 * {@link MetaEntityAttributeDef} extends {@link TeaModel}
 *
 * <p>MetaEntityAttributeDef</p>
 */
public class MetaEntityAttributeDef extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowedValues")
    private java.util.List<String> allowedValues;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayEnabled")
    private Boolean displayEnabled;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("IsOptional")
    private Boolean isOptional;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("SearchFilterEnabled")
    private Boolean searchFilterEnabled;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private MetaEntityAttributeDef(Builder builder) {
        this.allowedValues = builder.allowedValues;
        this.description = builder.description;
        this.displayEnabled = builder.displayEnabled;
        this.displayName = builder.displayName;
        this.isOptional = builder.isOptional;
        this.name = builder.name;
        this.searchFilterEnabled = builder.searchFilterEnabled;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaEntityAttributeDef create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedValues
     */
    public java.util.List<String> getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayEnabled
     */
    public Boolean getDisplayEnabled() {
        return this.displayEnabled;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return isOptional
     */
    public Boolean getIsOptional() {
        return this.isOptional;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return searchFilterEnabled
     */
    public Boolean getSearchFilterEnabled() {
        return this.searchFilterEnabled;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<String> allowedValues; 
        private String description; 
        private Boolean displayEnabled; 
        private String displayName; 
        private Boolean isOptional; 
        private String name; 
        private Boolean searchFilterEnabled; 
        private String type; 

        private Builder() {
        } 

        private Builder(MetaEntityAttributeDef model) {
            this.allowedValues = model.allowedValues;
            this.description = model.description;
            this.displayEnabled = model.displayEnabled;
            this.displayName = model.displayName;
            this.isOptional = model.isOptional;
            this.name = model.name;
            this.searchFilterEnabled = model.searchFilterEnabled;
            this.type = model.type;
        } 

        /**
         * AllowedValues.
         */
        public Builder allowedValues(java.util.List<String> allowedValues) {
            this.allowedValues = allowedValues;
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
         * DisplayEnabled.
         */
        public Builder displayEnabled(Boolean displayEnabled) {
            this.displayEnabled = displayEnabled;
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
         * IsOptional.
         */
        public Builder isOptional(Boolean isOptional) {
            this.isOptional = isOptional;
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
         * SearchFilterEnabled.
         */
        public Builder searchFilterEnabled(Boolean searchFilterEnabled) {
            this.searchFilterEnabled = searchFilterEnabled;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public MetaEntityAttributeDef build() {
            return new MetaEntityAttributeDef(this);
        } 

    } 

}
