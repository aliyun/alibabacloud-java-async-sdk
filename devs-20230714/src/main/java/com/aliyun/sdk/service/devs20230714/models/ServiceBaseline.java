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
 * {@link ServiceBaseline} extends {@link TeaModel}
 *
 * <p>ServiceBaseline</p>
 */
public class ServiceBaseline extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("serviceInstance")
    private ServiceInstance serviceInstance;

    private ServiceBaseline(Builder builder) {
        this.serviceInstance = builder.serviceInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceBaseline create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceInstance
     */
    public ServiceInstance getServiceInstance() {
        return this.serviceInstance;
    }

    public static final class Builder {
        private ServiceInstance serviceInstance; 

        private Builder() {
        } 

        private Builder(ServiceBaseline model) {
            this.serviceInstance = model.serviceInstance;
        } 

        /**
         * serviceInstance.
         */
        public Builder serviceInstance(ServiceInstance serviceInstance) {
            this.serviceInstance = serviceInstance;
            return this;
        }

        public ServiceBaseline build() {
            return new ServiceBaseline(this);
        } 

    } 

}
