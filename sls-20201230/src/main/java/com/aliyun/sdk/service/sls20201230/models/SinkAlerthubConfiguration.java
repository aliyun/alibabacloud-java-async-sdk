// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link SinkAlerthubConfiguration} extends {@link TeaModel}
 *
 * <p>SinkAlerthubConfiguration</p>
 */
public class SinkAlerthubConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    private SinkAlerthubConfiguration(Builder builder) {
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkAlerthubConfiguration create() {
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

        public SinkAlerthubConfiguration build() {
            return new SinkAlerthubConfiguration(this);
        } 

    } 

}
