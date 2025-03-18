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
 * {@link UdpConfig} extends {@link TeaModel}
 *
 * <p>UdpConfig</p>
 */
public class UdpConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HashKey")
    private String hashKey;

    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    private UdpConfig(Builder builder) {
        this.hashKey = builder.hashKey;
        this.scheduler = builder.scheduler;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UdpConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hashKey
     */
    public String getHashKey() {
        return this.hashKey;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    public static final class Builder {
        private String hashKey; 
        private String scheduler; 

        private Builder() {
        } 

        private Builder(UdpConfig model) {
            this.hashKey = model.hashKey;
            this.scheduler = model.scheduler;
        } 

        /**
         * HashKey.
         */
        public Builder hashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }

        /**
         * Scheduler.
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        public UdpConfig build() {
            return new UdpConfig(this);
        } 

    } 

}
