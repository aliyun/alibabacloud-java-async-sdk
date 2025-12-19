// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateNatIpResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNatIpResponseBody</p>
 */
public class CreateNatIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv4Prefix")
    private String ipv4Prefix;

    @com.aliyun.core.annotation.NameInMap("NatIp")
    private String natIp;

    @com.aliyun.core.annotation.NameInMap("NatIpId")
    private String natIpId;

    @com.aliyun.core.annotation.NameInMap("NatIps")
    private java.util.List<NatIps> natIps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNatIpResponseBody(Builder builder) {
        this.ipv4Prefix = builder.ipv4Prefix;
        this.natIp = builder.natIp;
        this.natIpId = builder.natIpId;
        this.natIps = builder.natIps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatIpResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipv4Prefix
     */
    public String getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    /**
     * @return natIp
     */
    public String getNatIp() {
        return this.natIp;
    }

    /**
     * @return natIpId
     */
    public String getNatIpId() {
        return this.natIpId;
    }

    /**
     * @return natIps
     */
    public java.util.List<NatIps> getNatIps() {
        return this.natIps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipv4Prefix; 
        private String natIp; 
        private String natIpId; 
        private java.util.List<NatIps> natIps; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateNatIpResponseBody model) {
            this.ipv4Prefix = model.ipv4Prefix;
            this.natIp = model.natIp;
            this.natIpId = model.natIpId;
            this.natIps = model.natIps;
            this.requestId = model.requestId;
        } 

        /**
         * Ipv4Prefix.
         */
        public Builder ipv4Prefix(String ipv4Prefix) {
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }

        /**
         * <p>The NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.34</p>
         */
        public Builder natIp(String natIp) {
            this.natIp = natIp;
            return this;
        }

        /**
         * <p>The ID of the NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcnatip-gw8y7q3cpk3fggs8****</p>
         */
        public Builder natIpId(String natIpId) {
            this.natIpId = natIpId;
            return this;
        }

        /**
         * NatIps.
         */
        public Builder natIps(java.util.List<NatIps> natIps) {
            this.natIps = natIps;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E9AD97A0-5338-43F8-8A80-5E274CCBA11B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNatIpResponseBody build() {
            return new CreateNatIpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateNatIpResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNatIpResponseBody</p>
     */
    public static class NatIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4Prefix")
        private String ipv4Prefix;

        @com.aliyun.core.annotation.NameInMap("NatIp")
        private String natIp;

        @com.aliyun.core.annotation.NameInMap("NatIpId")
        private String natIpId;

        private NatIps(Builder builder) {
            this.ipv4Prefix = builder.ipv4Prefix;
            this.natIp = builder.natIp;
            this.natIpId = builder.natIpId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatIps create() {
            return builder().build();
        }

        /**
         * @return ipv4Prefix
         */
        public String getIpv4Prefix() {
            return this.ipv4Prefix;
        }

        /**
         * @return natIp
         */
        public String getNatIp() {
            return this.natIp;
        }

        /**
         * @return natIpId
         */
        public String getNatIpId() {
            return this.natIpId;
        }

        public static final class Builder {
            private String ipv4Prefix; 
            private String natIp; 
            private String natIpId; 

            private Builder() {
            } 

            private Builder(NatIps model) {
                this.ipv4Prefix = model.ipv4Prefix;
                this.natIp = model.natIp;
                this.natIpId = model.natIpId;
            } 

            /**
             * Ipv4Prefix.
             */
            public Builder ipv4Prefix(String ipv4Prefix) {
                this.ipv4Prefix = ipv4Prefix;
                return this;
            }

            /**
             * <p>The NAT IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.34</p>
             */
            public Builder natIp(String natIp) {
                this.natIp = natIp;
                return this;
            }

            /**
             * <p>The ID of the NAT IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>vpcnatip-gw8y7q3cpk3fggs8****</p>
             */
            public Builder natIpId(String natIpId) {
                this.natIpId = natIpId;
                return this;
            }

            public NatIps build() {
                return new NatIps(this);
            } 

        } 

    }
}
