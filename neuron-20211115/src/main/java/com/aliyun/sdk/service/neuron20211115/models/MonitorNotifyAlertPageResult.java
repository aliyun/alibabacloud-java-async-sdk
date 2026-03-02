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
 * {@link MonitorNotifyAlertPageResult} extends {@link TeaModel}
 *
 * <p>MonitorNotifyAlertPageResult</p>
 */
public class MonitorNotifyAlertPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("intTotal")
    private Integer intTotal;

    @com.aliyun.core.annotation.NameInMap("notifyAlerts")
    private java.util.List<MonitorNotifyAlert> notifyAlerts;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private MonitorNotifyAlertPageResult(Builder builder) {
        this.intTotal = builder.intTotal;
        this.notifyAlerts = builder.notifyAlerts;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorNotifyAlertPageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intTotal
     */
    public Integer getIntTotal() {
        return this.intTotal;
    }

    /**
     * @return notifyAlerts
     */
    public java.util.List<MonitorNotifyAlert> getNotifyAlerts() {
        return this.notifyAlerts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer intTotal; 
        private java.util.List<MonitorNotifyAlert> notifyAlerts; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(MonitorNotifyAlertPageResult model) {
            this.intTotal = model.intTotal;
            this.notifyAlerts = model.notifyAlerts;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * intTotal.
         */
        public Builder intTotal(Integer intTotal) {
            this.intTotal = intTotal;
            return this;
        }

        /**
         * notifyAlerts.
         */
        public Builder notifyAlerts(java.util.List<MonitorNotifyAlert> notifyAlerts) {
            this.notifyAlerts = notifyAlerts;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public MonitorNotifyAlertPageResult build() {
            return new MonitorNotifyAlertPageResult(this);
        } 

    } 

}
