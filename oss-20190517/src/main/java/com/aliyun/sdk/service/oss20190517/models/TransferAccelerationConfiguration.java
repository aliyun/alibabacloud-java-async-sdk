// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link TransferAccelerationConfiguration} extends {@link TeaModel}
 *
 * <p>TransferAccelerationConfiguration</p>
 */
public class TransferAccelerationConfiguration extends TeaModel {
    @NameInMap("Enabled")
    private Boolean enabled;

    private TransferAccelerationConfiguration(Builder builder) {
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferAccelerationConfiguration create() {
        return builder().build();
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static final class Builder {
        private Boolean enabled; 

        /**
         * 是否开启传输加速
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public TransferAccelerationConfiguration build() {
            return new TransferAccelerationConfiguration(this);
        } 

    } 

}
