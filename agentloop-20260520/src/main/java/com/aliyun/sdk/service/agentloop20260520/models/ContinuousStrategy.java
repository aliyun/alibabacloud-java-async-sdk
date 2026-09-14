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
         * <p>The data arrival delay in minutes. After a window ends, the system waits for this duration before creating a run to allow data to arrive completely. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder dataDelayMinutes(Integer dataDelayMinutes) {
            this.dataDelayMinutes = dataDelayMinutes;
            return this;
        }

        /**
         * <p>Specifies whether to enable continuous evaluation. If this parameter is not specified or is set to true, continuous evaluation is enabled. If this parameter is set to false, continuous evaluation is disabled but the configuration is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The unit of the continuous evaluation window interval. This field is required for the current polling implementation.</p>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        public Builder intervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * <p>The size of the continuous evaluation window interval. This parameter is used together with intervalUnit. The value must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
