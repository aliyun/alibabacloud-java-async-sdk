// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CustomDNS} extends {@link TeaModel}
 *
 * <p>CustomDNS</p>
 */
public class CustomDNS extends TeaModel {
    @NameInMap("dnsOptions")
    private java.util.List < DNSOption > dnsOptions;

    @NameInMap("nameServers")
    private java.util.List < String > nameServers;

    @NameInMap("searches")
    private java.util.List < String > searches;

    private CustomDNS(Builder builder) {
        this.dnsOptions = builder.dnsOptions;
        this.nameServers = builder.nameServers;
        this.searches = builder.searches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomDNS create() {
        return builder().build();
    }

    /**
     * @return dnsOptions
     */
    public java.util.List < DNSOption > getDnsOptions() {
        return this.dnsOptions;
    }

    /**
     * @return nameServers
     */
    public java.util.List < String > getNameServers() {
        return this.nameServers;
    }

    /**
     * @return searches
     */
    public java.util.List < String > getSearches() {
        return this.searches;
    }

    public static final class Builder {
        private java.util.List < DNSOption > dnsOptions; 
        private java.util.List < String > nameServers; 
        private java.util.List < String > searches; 

        /**
         * DNS resolver 配置参数列表
         */
        public Builder dnsOptions(java.util.List < DNSOption > dnsOptions) {
            this.dnsOptions = dnsOptions;
            return this;
        }

        /**
         * DNS 服务器的 IP 地址列表
         */
        public Builder nameServers(java.util.List < String > nameServers) {
            this.nameServers = nameServers;
            return this;
        }

        /**
         * DNS 搜索域的列表
         */
        public Builder searches(java.util.List < String > searches) {
            this.searches = searches;
            return this;
        }

        public CustomDNS build() {
            return new CustomDNS(this);
        } 

    } 

}
