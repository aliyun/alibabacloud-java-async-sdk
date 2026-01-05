// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

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
 * {@link IpPort} extends {@link TeaModel}
 *
 * <p>IpPort</p>
 */
public class IpPort extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    private IpPort(Builder builder) {
        this.ip = builder.ip;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IpPort create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    public static final class Builder {
        private String ip; 
        private String port; 

        private Builder() {
        } 

        private Builder(IpPort model) {
            this.ip = model.ip;
            this.port = model.port;
        } 

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        public IpPort build() {
            return new IpPort(this);
        } 

    } 

}
