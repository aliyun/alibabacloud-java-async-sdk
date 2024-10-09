// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link LogReservePolicy} extends {@link TeaModel}
 *
 * <p>LogReservePolicy</p>
 */
public class LogReservePolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expirationDays")
    private Long expirationDays;

    @com.aliyun.core.annotation.NameInMap("openHistory")
    private Boolean openHistory;

    private LogReservePolicy(Builder builder) {
        this.expirationDays = builder.expirationDays;
        this.openHistory = builder.openHistory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogReservePolicy create() {
        return builder().build();
    }

    /**
     * @return expirationDays
     */
    public Long getExpirationDays() {
        return this.expirationDays;
    }

    /**
     * @return openHistory
     */
    public Boolean getOpenHistory() {
        return this.openHistory;
    }

    public static final class Builder {
        private Long expirationDays; 
        private Boolean openHistory; 

        /**
         * expirationDays.
         */
        public Builder expirationDays(Long expirationDays) {
            this.expirationDays = expirationDays;
            return this;
        }

        /**
         * openHistory.
         */
        public Builder openHistory(Boolean openHistory) {
            this.openHistory = openHistory;
            return this;
        }

        public LogReservePolicy build() {
            return new LogReservePolicy(this);
        } 

    } 

}
