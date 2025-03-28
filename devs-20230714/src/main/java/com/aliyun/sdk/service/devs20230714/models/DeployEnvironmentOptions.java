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
 * {@link DeployEnvironmentOptions} extends {@link TeaModel}
 *
 * <p>DeployEnvironmentOptions</p>
 */
public class DeployEnvironmentOptions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("services")
    private java.util.List<String> services;

    private DeployEnvironmentOptions(Builder builder) {
        this.services = builder.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployEnvironmentOptions create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return services
     */
    public java.util.List<String> getServices() {
        return this.services;
    }

    public static final class Builder {
        private java.util.List<String> services; 

        private Builder() {
        } 

        private Builder(DeployEnvironmentOptions model) {
            this.services = model.services;
        } 

        /**
         * services.
         */
        public Builder services(java.util.List<String> services) {
            this.services = services;
            return this;
        }

        public DeployEnvironmentOptions build() {
            return new DeployEnvironmentOptions(this);
        } 

    } 

}
