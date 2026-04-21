// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketDomain} extends {@link TeaModel}
 *
 * <p>HiMarketDomain</p>
 */
public class HiMarketDomain extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("networkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    private HiMarketDomain(Builder builder) {
        this.domain = builder.domain;
        this.networkType = builder.networkType;
        this.port = builder.port;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketDomain create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder {
        private String domain; 
        private String networkType; 
        private Integer port; 
        private String protocol; 

        private Builder() {
        } 

        private Builder(HiMarketDomain model) {
            this.domain = model.domain;
            this.networkType = model.networkType;
            this.port = model.port;
            this.protocol = model.protocol;
        } 

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * networkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public HiMarketDomain build() {
            return new HiMarketDomain(this);
        } 

    } 

}
