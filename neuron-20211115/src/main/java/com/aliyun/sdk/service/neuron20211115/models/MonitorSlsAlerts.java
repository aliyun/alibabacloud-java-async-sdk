// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MonitorSlsAlerts} extends {@link TeaModel}
 *
 * <p>MonitorSlsAlerts</p>
 */
public class MonitorSlsAlerts extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("monitorSlsAlerts")
    private java.util.List<MonitorSlsAlert> monitorSlsAlerts;

    private MonitorSlsAlerts(Builder builder) {
        this.monitorSlsAlerts = builder.monitorSlsAlerts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorSlsAlerts create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return monitorSlsAlerts
     */
    public java.util.List<MonitorSlsAlert> getMonitorSlsAlerts() {
        return this.monitorSlsAlerts;
    }

    public static final class Builder {
        private java.util.List<MonitorSlsAlert> monitorSlsAlerts; 

        private Builder() {
        } 

        private Builder(MonitorSlsAlerts model) {
            this.monitorSlsAlerts = model.monitorSlsAlerts;
        } 

        /**
         * monitorSlsAlerts.
         */
        public Builder monitorSlsAlerts(java.util.List<MonitorSlsAlert> monitorSlsAlerts) {
            this.monitorSlsAlerts = monitorSlsAlerts;
            return this;
        }

        public MonitorSlsAlerts build() {
            return new MonitorSlsAlerts(this);
        } 

    } 

}
