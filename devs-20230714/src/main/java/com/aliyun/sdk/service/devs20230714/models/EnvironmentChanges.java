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
 * {@link EnvironmentChanges} extends {@link TeaModel}
 *
 * <p>EnvironmentChanges</p>
 */
public class EnvironmentChanges extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("services")
    private java.util.Map<String, ?> services;

    private EnvironmentChanges(Builder builder) {
        this.services = builder.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentChanges create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return services
     */
    public java.util.Map<String, ?> getServices() {
        return this.services;
    }

    public static final class Builder {
        private java.util.Map<String, ?> services; 

        private Builder() {
        } 

        private Builder(EnvironmentChanges model) {
            this.services = model.services;
        } 

        /**
         * services.
         */
        public Builder services(java.util.Map<String, ?> services) {
            this.services = services;
            return this;
        }

        public EnvironmentChanges build() {
            return new EnvironmentChanges(this);
        } 

    } 

}
