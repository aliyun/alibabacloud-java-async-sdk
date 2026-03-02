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
 * {@link ComponentTemplateUpdateCmd} extends {@link TeaModel}
 *
 * <p>ComponentTemplateUpdateCmd</p>
 */
public class ComponentTemplateUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configuration")
    private java.util.List<ConfigModel> configuration;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("useScope")
    private String useScope;

    @com.aliyun.core.annotation.NameInMap("useType")
    private String useType;

    private ComponentTemplateUpdateCmd(Builder builder) {
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.id = builder.id;
        this.useScope = builder.useScope;
        this.useType = builder.useType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ComponentTemplateUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public java.util.List<ConfigModel> getConfiguration() {
        return this.configuration;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return useScope
     */
    public String getUseScope() {
        return this.useScope;
    }

    /**
     * @return useType
     */
    public String getUseType() {
        return this.useType;
    }

    public static final class Builder {
        private java.util.List<ConfigModel> configuration; 
        private String description; 
        private Long id; 
        private String useScope; 
        private String useType; 

        private Builder() {
        } 

        private Builder(ComponentTemplateUpdateCmd model) {
            this.configuration = model.configuration;
            this.description = model.description;
            this.id = model.id;
            this.useScope = model.useScope;
            this.useType = model.useType;
        } 

        /**
         * configuration.
         */
        public Builder configuration(java.util.List<ConfigModel> configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * useScope.
         */
        public Builder useScope(String useScope) {
            this.useScope = useScope;
            return this;
        }

        /**
         * useType.
         */
        public Builder useType(String useType) {
            this.useType = useType;
            return this;
        }

        public ComponentTemplateUpdateCmd build() {
            return new ComponentTemplateUpdateCmd(this);
        } 

    } 

}
