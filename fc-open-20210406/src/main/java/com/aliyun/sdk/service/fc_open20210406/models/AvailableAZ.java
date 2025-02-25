// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AvailableAZ} extends {@link TeaModel}
 *
 * <p>AvailableAZ</p>
 */
public class AvailableAZ extends TeaModel {
    @NameInMap("availableAZs")
    private String availableAZs;

    private AvailableAZ(Builder builder) {
        this.availableAZs = builder.availableAZs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AvailableAZ create() {
        return builder().build();
    }

    /**
     * @return availableAZs
     */
    public String getAvailableAZs() {
        return this.availableAZs;
    }

    public static final class Builder {
        private String availableAZs; 

        /**
         * availableAZs.
         */
        public Builder availableAZs(String availableAZs) {
            this.availableAZs = availableAZs;
            return this;
        }

        public AvailableAZ build() {
            return new AvailableAZ(this);
        } 

    } 

}
