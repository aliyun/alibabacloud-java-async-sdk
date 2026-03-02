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
 * {@link MonitorArmsAlerts} extends {@link TeaModel}
 *
 * <p>MonitorArmsAlerts</p>
 */
public class MonitorArmsAlerts extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("monitorArmsAlerts")
    private java.util.List<MonitorArmsAlert> monitorArmsAlerts;

    private MonitorArmsAlerts(Builder builder) {
        this.monitorArmsAlerts = builder.monitorArmsAlerts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorArmsAlerts create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return monitorArmsAlerts
     */
    public java.util.List<MonitorArmsAlert> getMonitorArmsAlerts() {
        return this.monitorArmsAlerts;
    }

    public static final class Builder {
        private java.util.List<MonitorArmsAlert> monitorArmsAlerts; 

        private Builder() {
        } 

        private Builder(MonitorArmsAlerts model) {
            this.monitorArmsAlerts = model.monitorArmsAlerts;
        } 

        /**
         * monitorArmsAlerts.
         */
        public Builder monitorArmsAlerts(java.util.List<MonitorArmsAlert> monitorArmsAlerts) {
            this.monitorArmsAlerts = monitorArmsAlerts;
            return this;
        }

        public MonitorArmsAlerts build() {
            return new MonitorArmsAlerts(this);
        } 

    } 

}
