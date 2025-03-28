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
 * {@link EnvironmentBaseline} extends {@link TeaModel}
 *
 * <p>EnvironmentBaseline</p>
 */
public class EnvironmentBaseline extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("servicesInstances")
    private java.util.Map<String, ServiceInstance> servicesInstances;

    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.Map<String, Variable> variables;

    private EnvironmentBaseline(Builder builder) {
        this.servicesInstances = builder.servicesInstances;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentBaseline create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return servicesInstances
     */
    public java.util.Map<String, ServiceInstance> getServicesInstances() {
        return this.servicesInstances;
    }

    /**
     * @return variables
     */
    public java.util.Map<String, Variable> getVariables() {
        return this.variables;
    }

    public static final class Builder {
        private java.util.Map<String, ServiceInstance> servicesInstances; 
        private java.util.Map<String, Variable> variables; 

        private Builder() {
        } 

        private Builder(EnvironmentBaseline model) {
            this.servicesInstances = model.servicesInstances;
            this.variables = model.variables;
        } 

        /**
         * servicesInstances.
         */
        public Builder servicesInstances(java.util.Map<String, ServiceInstance> servicesInstances) {
            this.servicesInstances = servicesInstances;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(java.util.Map<String, Variable> variables) {
            this.variables = variables;
            return this;
        }

        public EnvironmentBaseline build() {
            return new EnvironmentBaseline(this);
        } 

    } 

}
