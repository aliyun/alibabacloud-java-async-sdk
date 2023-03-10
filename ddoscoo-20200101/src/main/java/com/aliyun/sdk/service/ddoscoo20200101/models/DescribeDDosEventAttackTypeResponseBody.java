// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventAttackTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventAttackTypeResponseBody</p>
 */
public class DescribeDDosEventAttackTypeResponseBody extends TeaModel {
    @NameInMap("AttackTypes")
    private java.util.List < AttackTypes> attackTypes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDDosEventAttackTypeResponseBody(Builder builder) {
        this.attackTypes = builder.attackTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosEventAttackTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return attackTypes
     */
    public java.util.List < AttackTypes> getAttackTypes() {
        return this.attackTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AttackTypes> attackTypes; 
        private String requestId; 

        /**
         * The information about the attack types.
         */
        public Builder attackTypes(java.util.List < AttackTypes> attackTypes) {
            this.attackTypes = attackTypes;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDosEventAttackTypeResponseBody build() {
            return new DescribeDDosEventAttackTypeResponseBody(this);
        } 

    } 

    public static class AttackTypes extends TeaModel {
        @NameInMap("AttackType")
        private String attackType;

        @NameInMap("InPkts")
        private Long inPkts;

        private AttackTypes(Builder builder) {
            this.attackType = builder.attackType;
            this.inPkts = builder.inPkts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackTypes create() {
            return builder().build();
        }

        /**
         * @return attackType
         */
        public String getAttackType() {
            return this.attackType;
        }

        /**
         * @return inPkts
         */
        public Long getInPkts() {
            return this.inPkts;
        }

        public static final class Builder {
            private String attackType; 
            private Long inPkts; 

            /**
             * The type of the attack Valid values:
             * <p>
             * 
             * *   **QOTD-Reflect-Flood**: QOTD reflection attacks
             * *   **CharGEN-Reflect-Flood**: CHARGEN reflection attacks
             * *   **DNS-Reflect-Flood**: DNS reflection attacks
             * *   **TFTP-Reflect-Flood**: TFTP reflection attacks
             * *   **Portmap-Reflect-Flood**: Portmap reflection attacks
             * *   **NTP-Reflect-Flood**: NTP reflection attacks
             * *   **NetBIOS-Reflect-Flood**: NetBIOS reflection attacks
             * *   **SNMPv2-Reflect-Flood**: SNMPv2 reflection attacks
             * *   **CLDAP-Reflect-Flood**: CLDAP reflection attacks
             * *   **Ripv1-Reflect-Flood**: RIPv1 reflection attacks
             * *   **OpenVPN-Reflect-Flood**: OpenVPN reflection attacks
             * *   **SSDP-Reflect-Flood**: SSDP reflection attacks
             * *   **NetAssistant-Reflect-Flood**: NetAssistant reflection attacks
             * *   **WSDiscovery-Reflect-Flood**: WS-Discovery reflection attacks
             * *   **Kad-Reflect-Flood**: Kad reflection attacks
             * *   **mDNS-Reflect-Flood**: mDNS reflection attacks
             * *   **10001-Reflect-Flood**: reflection attacks over port 10001
             * *   **Memcached-Reflect-Flood**: Memcached reflection attacks
             * *   **QNP-Reflect-Flood**: QNP reflection attacks
             * *   **DVR-Reflect-Flood**: DVR reflection attacks
             * *   **CoAP-Reflect-Flood**: CoAP reflection attacks
             * *   **ADDP-Reflect-Flood**: ADDP reflection attacks
             * *   **Tcp-Syn**: TCP SYN flood attacks
             * *   **Tcp-Fin**: TCP FIN flood attacks
             * *   **Tcp-Ack**: TCP ACK flood attacks
             * *   **Tcp-Rst**: TCP RST flood attacks
             * *   **Tcp-Pushack**: TCP PSH-ACK flood attacks
             * *   **Tcp-Synack**: TCP SYN-ACK flood attacks
             * *   **Udp-None**: UDP attacks
             * *   **Udp-Ssh**: UDP-based SSH attacks
             * *   **Udp-Dns**: UDP-based DNS attacks
             * *   **Udp-Http**: UDP-based HTTP attacks
             * *   **Udp-Https**: UDP-based HTTPS attacks
             * *   **Udp-Ntp**: UDP-based NTP attacks
             * *   **Udp-Ldap**: UDP-based LDAP attacks
             * *   **Udp-Ssdp**: UDP-based SSDP attacks
             * *   **Udp-Memcached**: Memcached UDP reflection attacks
             * *   **Tcp-Other**: other TCP attacks
             * *   **Icmp**: ICMP flood attacks
             * *   **Igmp**: IGMP flood attacks
             * *   **Ipv6**: IPv6 attacks
             */
            public Builder attackType(String attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * The number of request packets of the attack type.
             */
            public Builder inPkts(Long inPkts) {
                this.inPkts = inPkts;
                return this;
            }

            public AttackTypes build() {
                return new AttackTypes(this);
            } 

        } 

    }
}
