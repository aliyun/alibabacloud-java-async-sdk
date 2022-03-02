// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ExtendWormConfiguration} extends {@link TeaModel}
 *
 * <p>ExtendWormConfiguration</p>
 */
public class ExtendWormConfiguration extends TeaModel {
    @NameInMap("RetentionPeriodInDays")
    private Integer retentionPeriodInDays;

    private ExtendWormConfiguration(Builder builder) {
        this.retentionPeriodInDays = builder.retentionPeriodInDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExtendWormConfiguration create() {
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

        public ExtendWormConfiguration build() {
            return new ExtendWormConfiguration(this);
        } 

    } 

}
