// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link SinkCmsConfiguration} extends {@link TeaModel}
 *
 * <p>SinkCmsConfiguration</p>
 */
public class SinkCmsConfiguration extends TeaModel {
    @NameInMap("enabled")
    private Boolean enabled;

    private SinkCmsConfiguration(Builder builder) {
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkCmsConfiguration create() {
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
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public SinkCmsConfiguration build() {
            return new SinkCmsConfiguration(this);
        } 

    } 

}
