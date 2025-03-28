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
 * {@link TemplateVariableValueMap} extends {@link TeaModel}
 *
 * <p>TemplateVariableValueMap</p>
 */
public class TemplateVariableValueMap extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("services")
    private java.util.Map<String, java.util.Map<String, ?>> services;

    @com.aliyun.core.annotation.NameInMap("shared")
    private java.util.Map<String, ?> shared;

    private TemplateVariableValueMap(Builder builder) {
        this.services = builder.services;
        this.shared = builder.shared;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateVariableValueMap create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return services
     */
    public java.util.Map<String, java.util.Map<String, ?>> getServices() {
        return this.services;
    }

    /**
     * @return shared
     */
    public java.util.Map<String, ?> getShared() {
        return this.shared;
    }

    public static final class Builder {
        private java.util.Map<String, java.util.Map<String, ?>> services; 
        private java.util.Map<String, ?> shared; 

        private Builder() {
        } 

        private Builder(TemplateVariableValueMap model) {
            this.services = model.services;
            this.shared = model.shared;
        } 

        /**
         * services.
         */
        public Builder services(java.util.Map<String, java.util.Map<String, ?>> services) {
            this.services = services;
            return this;
        }

        /**
         * shared.
         */
        public Builder shared(java.util.Map<String, ?> shared) {
            this.shared = shared;
            return this;
        }

        public TemplateVariableValueMap build() {
            return new TemplateVariableValueMap(this);
        } 

    } 

}
