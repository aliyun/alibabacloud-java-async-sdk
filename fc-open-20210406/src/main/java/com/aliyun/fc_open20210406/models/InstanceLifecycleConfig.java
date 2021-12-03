// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link InstanceLifecycleConfig} extends {@link TeaModel}
 *
 * <p>InstanceLifecycleConfig</p>
 */
public class InstanceLifecycleConfig extends TeaModel {
    @NameInMap("preFreeze")
    private LifecycleHook preFreeze;

    @NameInMap("preStop")
    private LifecycleHook preStop;


    private InstanceLifecycleConfig(Builder builder) {
        this.preFreeze = builder.preFreeze;
        this.preStop = builder.preStop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceLifecycleConfig create() {
        return builder().build();
    }

    /**
     * @return preFreeze
     */
    public LifecycleHook getPreFreeze() {
        return this.preFreeze;
    }

    /**
     * @return preStop
     */
    public LifecycleHook getPreStop() {
        return this.preStop;
    }

    public static final class Builder {
        private LifecycleHook preFreeze; 
        private LifecycleHook preStop; 

        /**
         * <p>preFreeze.</p>
         */
        public Builder preFreeze(LifecycleHook preFreeze) {
            this.preFreeze = preFreeze;
            return this;
        }

        /**
         * <p>preStop.</p>
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
