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
 * {@link MonitorAlertHistoryPageResult} extends {@link TeaModel}
 *
 * <p>MonitorAlertHistoryPageResult</p>
 */
public class MonitorAlertHistoryPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertHistories")
    private java.util.List<MonitorAlertHistory> alertHistories;

    @com.aliyun.core.annotation.NameInMap("intTotal")
    private Integer intTotal;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private MonitorAlertHistoryPageResult(Builder builder) {
        this.alertHistories = builder.alertHistories;
        this.intTotal = builder.intTotal;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorAlertHistoryPageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertHistories
     */
    public java.util.List<MonitorAlertHistory> getAlertHistories() {
        return this.alertHistories;
    }

    /**
     * @return intTotal
     */
    public Integer getIntTotal() {
        return this.intTotal;
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
        private java.util.List<MonitorAlertHistory> alertHistories; 
        private Integer intTotal; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(MonitorAlertHistoryPageResult model) {
            this.alertHistories = model.alertHistories;
            this.intTotal = model.intTotal;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * alertHistories.
         */
        public Builder alertHistories(java.util.List<MonitorAlertHistory> alertHistories) {
            this.alertHistories = alertHistories;
            return this;
        }

        /**
         * intTotal.
         */
        public Builder intTotal(Integer intTotal) {
            this.intTotal = intTotal;
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

        public MonitorAlertHistoryPageResult build() {
            return new MonitorAlertHistoryPageResult(this);
        } 

    } 

}
