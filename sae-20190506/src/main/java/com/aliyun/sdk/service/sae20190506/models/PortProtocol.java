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
 * {@link PortProtocol} extends {@link TeaModel}
 *
 * <p>PortProtocol</p>
 */
public class PortProtocol extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("TargetPort")
    private Integer targetPort;

    private PortProtocol(Builder builder) {
        this.port = builder.port;
        this.protocol = builder.protocol;
        this.targetPort = builder.targetPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PortProtocol create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return targetPort
     */
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public static final class Builder {
        private Integer port; 
        private String protocol; 
        private Integer targetPort; 

        private Builder() {
        } 

        private Builder(PortProtocol model) {
            this.port = model.port;
            this.protocol = model.protocol;
            this.targetPort = model.targetPort;
        } 

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * TargetPort.
         */
        public Builder targetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }

        public PortProtocol build() {
            return new PortProtocol(this);
        } 

    } 

}
