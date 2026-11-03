// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link TCPSocketAction} extends {@link TeaModel}
 *
 * <p>TCPSocketAction</p>
 */
public class TCPSocketAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    private TCPSocketAction(Builder builder) {
        this.host = builder.host;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TCPSocketAction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    public static final class Builder {
        private String host; 
        private Integer port; 

        private Builder() {
        } 

        private Builder(TCPSocketAction model) {
            this.host = model.host;
            this.port = model.port;
        } 

        /**
         * <p>Optional. The hostname to which you want to connect. The default value is the IP address of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>The port number that you want to access on the container. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        public TCPSocketAction build() {
            return new TCPSocketAction(this);
        } 

    } 

}
