// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link TcpConfig} extends {@link TeaModel}
 *
 * <p>TcpConfig</p>
 */
public class TcpConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EstablishedTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 900, minimum = 10)
    private Integer establishedTimeout;

    @com.aliyun.core.annotation.NameInMap("PersistenceTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 3600)
    private Integer persistenceTimeout;

    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    private TcpConfig(Builder builder) {
        this.establishedTimeout = builder.establishedTimeout;
        this.persistenceTimeout = builder.persistenceTimeout;
        this.scheduler = builder.scheduler;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TcpConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return establishedTimeout
     */
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    /**
     * @return persistenceTimeout
     */
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    public static final class Builder {
        private Integer establishedTimeout; 
        private Integer persistenceTimeout; 
        private String scheduler; 

        private Builder() {
        } 

        private Builder(TcpConfig model) {
            this.establishedTimeout = model.establishedTimeout;
            this.persistenceTimeout = model.persistenceTimeout;
            this.scheduler = model.scheduler;
        } 

        /**
         * EstablishedTimeout.
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }

        /**
         * PersistenceTimeout.
         */
        public Builder persistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }

        /**
         * Scheduler.
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        public TcpConfig build() {
            return new TcpConfig(this);
        } 

    } 

}
