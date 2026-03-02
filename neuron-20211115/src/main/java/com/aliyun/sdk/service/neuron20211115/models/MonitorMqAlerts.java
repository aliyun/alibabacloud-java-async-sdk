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
 * {@link MonitorMqAlerts} extends {@link TeaModel}
 *
 * <p>MonitorMqAlerts</p>
 */
public class MonitorMqAlerts extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("monitorMqAlerts")
    private java.util.List<MonitorMqAlert> monitorMqAlerts;

    private MonitorMqAlerts(Builder builder) {
        this.monitorMqAlerts = builder.monitorMqAlerts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorMqAlerts create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return monitorMqAlerts
     */
    public java.util.List<MonitorMqAlert> getMonitorMqAlerts() {
        return this.monitorMqAlerts;
    }

    public static final class Builder {
        private java.util.List<MonitorMqAlert> monitorMqAlerts; 

        private Builder() {
        } 

        private Builder(MonitorMqAlerts model) {
            this.monitorMqAlerts = model.monitorMqAlerts;
        } 

        /**
         * monitorMqAlerts.
         */
        public Builder monitorMqAlerts(java.util.List<MonitorMqAlert> monitorMqAlerts) {
            this.monitorMqAlerts = monitorMqAlerts;
            return this;
        }

        public MonitorMqAlerts build() {
            return new MonitorMqAlerts(this);
        } 

    } 

}
