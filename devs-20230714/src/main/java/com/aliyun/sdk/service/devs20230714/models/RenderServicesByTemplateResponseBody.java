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
 * {@link RenderServicesByTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>RenderServicesByTemplateResponseBody</p>
 */
public class RenderServicesByTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("changedServiceNames")
    private java.util.Map<String, String> changedServiceNames;

    @com.aliyun.core.annotation.NameInMap("services")
    private java.util.Map<String, ServiceConfig> services;

    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.Map<String, Variable> variables;

    private RenderServicesByTemplateResponseBody(Builder builder) {
        this.changedServiceNames = builder.changedServiceNames;
        this.services = builder.services;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenderServicesByTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changedServiceNames
     */
    public java.util.Map<String, String> getChangedServiceNames() {
        return this.changedServiceNames;
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
        private java.util.Map<String, String> changedServiceNames; 
        private java.util.Map<String, ServiceConfig> services; 
        private java.util.Map<String, Variable> variables; 

        private Builder() {
        } 

        private Builder(RenderServicesByTemplateResponseBody model) {
            this.changedServiceNames = model.changedServiceNames;
            this.services = model.services;
            this.variables = model.variables;
        } 

        /**
         * changedServiceNames.
         */
        public Builder changedServiceNames(java.util.Map<String, String> changedServiceNames) {
            this.changedServiceNames = changedServiceNames;
            return this;
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

        public RenderServicesByTemplateResponseBody build() {
            return new RenderServicesByTemplateResponseBody(this);
        } 

    } 

}
