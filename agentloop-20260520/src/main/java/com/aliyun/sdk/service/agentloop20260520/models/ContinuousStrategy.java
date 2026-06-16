// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ContinuousStrategy} extends {@link TeaModel}
 *
 * <p>ContinuousStrategy</p>
 */
public class ContinuousStrategy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dataDelayMinutes")
    private Integer dataDelayMinutes;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("intervalUnit")
    private String intervalUnit;

    @com.aliyun.core.annotation.NameInMap("intervalValue")
    private Integer intervalValue;

    private ContinuousStrategy(Builder builder) {
        this.dataDelayMinutes = builder.dataDelayMinutes;
        this.enabled = builder.enabled;
        this.intervalUnit = builder.intervalUnit;
        this.intervalValue = builder.intervalValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinuousStrategy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDelayMinutes
     */
    public Integer getDataDelayMinutes() {
        return this.dataDelayMinutes;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return intervalUnit
     */
    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * @return intervalValue
     */
    public Integer getIntervalValue() {
        return this.intervalValue;
    }

    public static final class Builder {
        private Integer dataDelayMinutes; 
        private Boolean enabled; 
        private String intervalUnit; 
        private Integer intervalValue; 

        private Builder() {
        } 

        private Builder(ContinuousStrategy model) {
            this.dataDelayMinutes = model.dataDelayMinutes;
            this.enabled = model.enabled;
            this.intervalUnit = model.intervalUnit;
            this.intervalValue = model.intervalValue;
        } 

        /**
         * dataDelayMinutes.
         */
        public Builder dataDelayMinutes(Integer dataDelayMinutes) {
            this.dataDelayMinutes = dataDelayMinutes;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * intervalUnit.
         */
        public Builder intervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * intervalValue.
         */
        public Builder intervalValue(Integer intervalValue) {
            this.intervalValue = intervalValue;
            return this;
        }

        public ContinuousStrategy build() {
            return new ContinuousStrategy(this);
        } 

    } 

}
