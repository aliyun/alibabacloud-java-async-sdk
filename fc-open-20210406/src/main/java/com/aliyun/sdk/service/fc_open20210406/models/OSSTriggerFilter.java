// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OSSTriggerFilter} extends {@link TeaModel}
 *
 * <p>OSSTriggerFilter</p>
 */
public class OSSTriggerFilter extends TeaModel {
    @NameInMap("key")
    private OSSTriggerKey key;

    private OSSTriggerFilter(Builder builder) {
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSSTriggerFilter create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public OSSTriggerKey getKey() {
        return this.key;
    }

    public static final class Builder {
        private OSSTriggerKey key; 

        /**
         * key.
         */
        public Builder key(OSSTriggerKey key) {
            this.key = key;
            return this;
        }

        public OSSTriggerFilter build() {
            return new OSSTriggerFilter(this);
        } 

    } 

}
