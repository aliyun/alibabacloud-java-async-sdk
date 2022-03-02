// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link InitiateWormConfiguration} extends {@link TeaModel}
 *
 * <p>InitiateWormConfiguration</p>
 */
public class InitiateWormConfiguration extends TeaModel {
    @NameInMap("RetentionPeriodInDays")
    @Validation(required = true)
    private Integer retentionPeriodInDays;

    private InitiateWormConfiguration(Builder builder) {
        this.retentionPeriodInDays = builder.retentionPeriodInDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitiateWormConfiguration create() {
        return builder().build();
    }

    /**
     * @return retentionPeriodInDays
     */
    public Integer getRetentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    public static final class Builder {
        private Integer retentionPeriodInDays; 

        /**
         * The number of days for which objects can be retained
         */
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            return this;
        }

        public InitiateWormConfiguration build() {
            return new InitiateWormConfiguration(this);
        } 

    } 

}
