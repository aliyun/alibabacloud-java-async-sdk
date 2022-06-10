// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VendorConfig} extends {@link TeaModel}
 *
 * <p>VendorConfig</p>
 */
public class VendorConfig extends TeaModel {
    @NameInMap("meteringConfig")
    private MeteringConfig meteringConfig;

    private VendorConfig(Builder builder) {
        this.meteringConfig = builder.meteringConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VendorConfig create() {
        return builder().build();
    }

    /**
     * @return meteringConfig
     */
    public MeteringConfig getMeteringConfig() {
        return this.meteringConfig;
    }

    public static final class Builder {
        private MeteringConfig meteringConfig; 

        /**
         * meteringConfig.
         */
        public Builder meteringConfig(MeteringConfig meteringConfig) {
            this.meteringConfig = meteringConfig;
            return this;
        }

        public VendorConfig build() {
            return new VendorConfig(this);
        } 

    } 

}
