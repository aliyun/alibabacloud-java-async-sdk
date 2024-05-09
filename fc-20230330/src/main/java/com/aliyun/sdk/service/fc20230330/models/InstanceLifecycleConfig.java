// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstanceLifecycleConfig} extends {@link TeaModel}
 *
 * <p>InstanceLifecycleConfig</p>
 */
public class InstanceLifecycleConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("initializer")
    private LifecycleHook initializer;

    @com.aliyun.core.annotation.NameInMap("preStop")
    private LifecycleHook preStop;

    private InstanceLifecycleConfig(Builder builder) {
        this.initializer = builder.initializer;
        this.preStop = builder.preStop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceLifecycleConfig create() {
        return builder().build();
    }

    /**
     * @return initializer
     */
    public LifecycleHook getInitializer() {
        return this.initializer;
    }

    /**
     * @return preStop
     */
    public LifecycleHook getPreStop() {
        return this.preStop;
    }

    public static final class Builder {
        private LifecycleHook initializer; 
        private LifecycleHook preStop; 

        /**
         * initializer.
         */
        public Builder initializer(LifecycleHook initializer) {
            this.initializer = initializer;
            return this;
        }

        /**
         * preStop.
         */
        public Builder preStop(LifecycleHook preStop) {
            this.preStop = preStop;
            return this;
        }

        public InstanceLifecycleConfig build() {
            return new InstanceLifecycleConfig(this);
        } 

    } 

}
