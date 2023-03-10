// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortMaxConnsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortMaxConnsResponseBody</p>
 */
public class DescribePortMaxConnsResponseBody extends TeaModel {
    @NameInMap("PortMaxConns")
    private java.util.List < PortMaxConns> portMaxConns;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePortMaxConnsResponseBody(Builder builder) {
        this.portMaxConns = builder.portMaxConns;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortMaxConnsResponseBody create() {
        return builder().build();
    }

    /**
     * @return portMaxConns
     */
    public java.util.List < PortMaxConns> getPortMaxConns() {
        return this.portMaxConns;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PortMaxConns> portMaxConns; 
        private String requestId; 

        /**
         * An array consisting of the details of the maximum number of connections that are established over a port of the instance.
         */
        public Builder portMaxConns(java.util.List < PortMaxConns> portMaxConns) {
            this.portMaxConns = portMaxConns;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortMaxConnsResponseBody build() {
            return new DescribePortMaxConnsResponseBody(this);
        } 

    } 

    public static class PortMaxConns extends TeaModel {
        @NameInMap("Cps")
        private Long cps;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Port")
        private String port;

        private PortMaxConns(Builder builder) {
            this.cps = builder.cps;
            this.ip = builder.ip;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortMaxConns create() {
            return builder().build();
        }

        /**
         * @return cps
         */
        public Long getCps() {
            return this.cps;
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
            private Long cps; 
            private String ip; 
            private String port; 

            /**
             * The maximum number of connections per second (CPS).
             */
            public Builder cps(Long cps) {
                this.cps = cps;
                return this;
            }

            /**
             * The IP address of the instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The port of the instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public PortMaxConns build() {
                return new PortMaxConns(this);
            } 

        } 

    }
}
