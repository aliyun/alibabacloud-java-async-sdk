// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link EnvironmentStagedConfigs} extends {@link TeaModel}
 *
 * <p>EnvironmentStagedConfigs</p>
 */
public class EnvironmentStagedConfigs extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("services")
    private java.util.Map<String, ServiceConfig> services;

    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.Map<String, Variable> variables;

    private EnvironmentStagedConfigs(Builder builder) {
        this.services = builder.services;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentStagedConfigs create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return services
     */
    public java.util.Map<String, ServiceConfig> getServices() {
        return this.services;
    }

    /**
     * @return variables
     */
    public java.util.Map<String, Variable> getVariables() {
        return this.variables;
    }

    public static final class Builder {
        private java.util.Map<String, ServiceConfig> services; 
        private java.util.Map<String, Variable> variables; 

        private Builder() {
        } 

        private Builder(EnvironmentStagedConfigs model) {
            this.services = model.services;
            this.variables = model.variables;
        } 

        /**
         * services.
         */
        public Builder services(java.util.Map<String, ServiceConfig> services) {
            this.services = services;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(java.util.Map<String, Variable> variables) {
            this.variables = variables;
            return this;
        }

        public EnvironmentStagedConfigs build() {
            return new EnvironmentStagedConfigs(this);
        } 

    } 

}
