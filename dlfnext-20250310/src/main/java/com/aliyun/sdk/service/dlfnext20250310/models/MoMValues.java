// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link MoMValues} extends {@link TeaModel}
 *
 * <p>MoMValues</p>
 */
public class MoMValues extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentValue")
    private Long currentValue;

    @com.aliyun.core.annotation.NameInMap("lastDayValue")
    private Long lastDayValue;

    @com.aliyun.core.annotation.NameInMap("lastMonthValue")
    private Long lastMonthValue;

    private MoMValues(Builder builder) {
        this.currentValue = builder.currentValue;
        this.lastDayValue = builder.lastDayValue;
        this.lastMonthValue = builder.lastMonthValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoMValues create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentValue
     */
    public Long getCurrentValue() {
        return this.currentValue;
    }

    /**
     * @return lastDayValue
     */
    public Long getLastDayValue() {
        return this.lastDayValue;
    }

    /**
     * @return lastMonthValue
     */
    public Long getLastMonthValue() {
        return this.lastMonthValue;
    }

    public static final class Builder {
        private Long currentValue; 
        private Long lastDayValue; 
        private Long lastMonthValue; 

        private Builder() {
        } 

        private Builder(MoMValues model) {
            this.currentValue = model.currentValue;
            this.lastDayValue = model.lastDayValue;
            this.lastMonthValue = model.lastMonthValue;
        } 

        /**
         * <p>total</p>
         */
        public Builder currentValue(Long currentValue) {
            this.currentValue = currentValue;
            return this;
        }

        /**
         * <p>daily addition</p>
         */
        public Builder lastDayValue(Long lastDayValue) {
            this.lastDayValue = lastDayValue;
            return this;
        }

        /**
         * <p>monthly addition</p>
         */
        public Builder lastMonthValue(Long lastMonthValue) {
            this.lastMonthValue = lastMonthValue;
            return this;
        }

        public MoMValues build() {
            return new MoMValues(this);
        } 

    } 

}
