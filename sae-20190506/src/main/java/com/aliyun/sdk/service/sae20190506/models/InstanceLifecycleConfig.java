// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link InstanceLifecycleConfig} extends {@link TeaModel}
 *
 * <p>InstanceLifecycleConfig</p>
 */
public class InstanceLifecycleConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("preFreeze")
    private LifecycleHook preFreeze;

    @com.aliyun.core.annotation.NameInMap("preStop")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(InstanceLifecycleConfig model) {
            this.preFreeze = model.preFreeze;
            this.preStop = model.preStop;
        } 

        /**
         * preFreeze.
         */
        public Builder preFreeze(LifecycleHook preFreeze) {
            this.preFreeze = preFreeze;
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
