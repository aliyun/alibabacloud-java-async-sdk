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
 * {@link ServiceComponentStep} extends {@link TeaModel}
 *
 * <p>ServiceComponentStep</p>
 */
public class ServiceComponentStep extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("component")
    private String component;

    private ServiceComponentStep(Builder builder) {
        this.component = builder.component;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceComponentStep create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return component
     */
    public String getComponent() {
        return this.component;
    }

    public static final class Builder {
        private String component; 

        private Builder() {
        } 

        private Builder(ServiceComponentStep model) {
            this.component = model.component;
        } 

        /**
         * component.
         */
        public Builder component(String component) {
            this.component = component;
            return this;
        }

        public ServiceComponentStep build() {
            return new ServiceComponentStep(this);
        } 

    } 

}
