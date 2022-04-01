// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RdsTriggerConfig} extends {@link TeaModel}
 *
 * <p>RdsTriggerConfig</p>
 */
public class RdsTriggerConfig extends TeaModel {
    @NameInMap("concurrency")
    private Long concurrency;

    @NameInMap("eventFormat")
    private String eventFormat;

    @NameInMap("retry")
    private Long retry;

    @NameInMap("subscriptionObjects")
    private java.util.List < String > subscriptionObjects;

    private RdsTriggerConfig(Builder builder) {
        this.concurrency = builder.concurrency;
        this.eventFormat = builder.eventFormat;
        this.retry = builder.retry;
        this.subscriptionObjects = builder.subscriptionObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RdsTriggerConfig create() {
        return builder().build();
    }

    /**
     * @return concurrency
     */
    public Long getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return eventFormat
     */
    public String getEventFormat() {
        return this.eventFormat;
    }

    /**
     * @return retry
     */
    public Long getRetry() {
        return this.retry;
    }

    /**
     * @return subscriptionObjects
     */
    public java.util.List < String > getSubscriptionObjects() {
        return this.subscriptionObjects;
    }

    public static final class Builder {
        private Long concurrency; 
        private String eventFormat; 
        private Long retry; 
        private java.util.List < String > subscriptionObjects; 

        /**
         * concurrency
         */
        public Builder concurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        /**
         * eventFormat
         */
        public Builder eventFormat(String eventFormat) {
            this.eventFormat = eventFormat;
            return this;
        }

        /**
         * retry
         */
        public Builder retry(Long retry) {
            this.retry = retry;
            return this;
        }

        /**
         * subscriptionObjects
         */
        public Builder subscriptionObjects(java.util.List < String > subscriptionObjects) {
            this.subscriptionObjects = subscriptionObjects;
            return this;
        }

        public RdsTriggerConfig build() {
            return new RdsTriggerConfig(this);
        } 

    } 

}
