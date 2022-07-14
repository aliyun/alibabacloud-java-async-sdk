// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TcpConfig} extends {@link TeaModel}
 *
 * <p>TcpConfig</p>
 */
public class TcpConfig extends TeaModel {
    @NameInMap("EstablishedTimeout")
    @Validation(maximum = 900, minimum = 10)
    private Integer establishedTimeout;

    @NameInMap("PersistenceTimeout")
    @Validation(maximum = 3600)
    private Integer persistenceTimeout;

    @NameInMap("Scheduler")
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

        /**
         * 连接超时时间。取值：10~900（秒）。
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }

        /**
         * 会话保持的超时时间。取值：0~3600（秒）。默认值：0，表示关闭会话保持。
         */
        public Builder persistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }

        /**
         * 调度算法。取值：wrr（默认值）：权重值越高的后端服务器，被轮询到的次数（概率）也越高。wlc：除了根据每台后端服务器设定的权重值来进行轮询，同时还考虑后端服务器的实际负载（即连接数）。当权重值相同时，当前连接数越小的后端服务器被轮询到的次数（概率）也越高。rr：按照访问顺序依次将外部请求依序分发到后端服务器。sch：基于源IP地址的一致性hash，相同的源地址会调度到相同的后端服务器。
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
