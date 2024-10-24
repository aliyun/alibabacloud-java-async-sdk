// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePortMaxConnsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortMaxConnsResponseBody</p>
 */
public class DescribePortMaxConnsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PortMaxConns")
    private java.util.List < PortMaxConns> portMaxConns;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>An array consisting of the details of the maximum number of connections that are established over a port of the instance.</p>
         */
        public Builder portMaxConns(java.util.List < PortMaxConns> portMaxConns) {
            this.portMaxConns = portMaxConns;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>08F79110-2AF5-4FA7-998E-7C5E75EACF9C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortMaxConnsResponseBody build() {
            return new DescribePortMaxConnsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortMaxConnsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortMaxConnsResponseBody</p>
     */
    public static class PortMaxConns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cps")
        private Long cps;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
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
             * <p>The maximum number of connections per second (CPS).</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder cps(Long cps) {
                this.cps = cps;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.<em><strong>.</strong></em>.117</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The port of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
