// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WAFConfig} extends {@link TeaModel}
 *
 * <p>WAFConfig</p>
 */
public class WAFConfig extends TeaModel {
    @NameInMap("enableWAF")
    private Boolean enableWAF;

    private WAFConfig(Builder builder) {
        this.enableWAF = builder.enableWAF;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WAFConfig create() {
        return builder().build();
    }

    /**
     * @return enableWAF
     */
    public Boolean getEnableWAF() {
        return this.enableWAF;
    }

    public static final class Builder {
        private Boolean enableWAF; 

        /**
         * enableWAF.
         */
        public Builder enableWAF(Boolean enableWAF) {
            this.enableWAF = enableWAF;
            return this;
        }

        public WAFConfig build() {
            return new WAFConfig(this);
        } 

    } 

}
