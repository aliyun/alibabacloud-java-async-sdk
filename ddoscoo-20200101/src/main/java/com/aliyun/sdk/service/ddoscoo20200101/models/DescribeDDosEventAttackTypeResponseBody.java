// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeDDosEventAttackTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventAttackTypeResponseBody</p>
 */
public class DescribeDDosEventAttackTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttackTypes")
    private java.util.List<AttackTypes> attackTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackTypes
     */
    public java.util.List<AttackTypes> getAttackTypes() {
        return this.attackTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AttackTypes> attackTypes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDDosEventAttackTypeResponseBody model) {
            this.attackTypes = model.attackTypes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The attack type information.</p>
         */
        public Builder attackTypes(java.util.List<AttackTypes> attackTypes) {
            this.attackTypes = attackTypes;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6F644A6E-40E7-483F-9DBB-CC27E16BB555</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDosEventAttackTypeResponseBody build() {
            return new DescribeDDosEventAttackTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDosEventAttackTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDosEventAttackTypeResponseBody</p>
     */
    public static class AttackTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackType")
        private String attackType;

        @com.aliyun.core.annotation.NameInMap("InPkts")
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

            private Builder() {
            } 

            private Builder(AttackTypes model) {
                this.attackType = model.attackType;
                this.inPkts = model.inPkts;
            } 

            /**
             * <p>The attack type. Valid values:</p>
             * <ul>
             * <li><strong>QOTD-Reflect-Flood</strong>: QOTD reflection attack</li>
             * <li><strong>CharGEN-Reflect-Flood</strong>: CharGEN reflection attack</li>
             * <li><strong>DNS-Reflect-Flood</strong>: DNS reflection attack</li>
             * <li><strong>TFTP-Reflect-Flood</strong>: TFTP reflection attack</li>
             * <li><strong>Portmap-Reflect-Flood</strong>: Portmap reflection attack</li>
             * <li><strong>NTP-Reflect-Flood</strong>: NTP reflection attack</li>
             * <li><strong>NetBIOS-Reflect-Flood</strong>: NetBIOS reflection attack</li>
             * <li><strong>SNMPv2-Reflect-Flood</strong>: SNMPv2 reflection attack</li>
             * <li><strong>CLDAP-Reflect-Flood</strong>: CLDAP reflection attack</li>
             * <li><strong>Ripv1-Reflect-Flood</strong>: Ripv1 reflection attack</li>
             * <li><strong>OpenVPN-Reflect-Flood</strong>: OpenVPN reflection attack</li>
             * <li><strong>SSDP-Reflect-Flood</strong>: SSDP reflection attack</li>
             * <li><strong>NetAssistant-Reflect-Flood</strong>: NetAssistant reflection attack</li>
             * <li><strong>WSDiscovery-Reflect-Flood</strong>: WSDiscovery reflection attack</li>
             * <li><strong>Kad-Reflect-Flood</strong>: Kad reflection attack</li>
             * <li><strong>mDNS-Reflect-Flood</strong>: mDNS reflection attack</li>
             * <li><strong>10001-Reflect-Flood</strong>: 10001 reflection attack</li>
             * <li><strong>Memcached-Reflect-Flood</strong>: Memcached reflection attack</li>
             * <li><strong>QNP-Reflect-Flood</strong>: QNP reflection attack</li>
             * <li><strong>DVR-Reflect-Flood</strong>: DVR reflection attack</li>
             * <li><strong>CoAP-Reflect-Flood</strong>: CoAP reflection attack</li>
             * <li><strong>ADDP-Reflect-Flood</strong>: ADDP reflection attack</li>
             * <li><strong>Tcp-Syn</strong>: TCP SYN flood attacks</li>
             * <li><strong>Tcp-Fin</strong>: TCP FIN flood attack</li>
             * <li><strong>Tcp-Ack</strong>: TCP ACK Flood attacks</li>
             * <li><strong>Tcp-Rst</strong>: TCP RST flood attack</li>
             * <li><strong>Tcp-Pushack</strong>: TCP PSH+ACK flood attack</li>
             * <li><strong>Tcp-Synack</strong>: TCP SYN+ACK flood attack</li>
             * <li><strong>Udp-None</strong>: UDP attack</li>
             * <li><strong>Udp-Ssh</strong>: UDP SSH protocol attack</li>
             * <li><strong>Udp-Dns</strong>: UDP DNS protocol attack</li>
             * <li><strong>Udp-Http</strong>: UDP HTTP protocol attack</li>
             * <li><strong>Udp-Https</strong>: UDP HTTPS protocol attack</li>
             * <li><strong>Udp-Ntp</strong>: UDP NTP protocol attack</li>
             * <li><strong>Udp-Ldap</strong>: UDP LDAP protocol attack</li>
             * <li><strong>Udp-Ssdp</strong>: UDP SSDP protocol attack</li>
             * <li><strong>Udp-Memcached</strong>: Memcache UDP reflection amplification attack</li>
             * <li><strong>Tcp-Other</strong>: TCP other type attack</li>
             * <li><strong>Icmp</strong>: ICMP flood attack</li>
             * <li><strong>Igmp</strong>: IGMP flood attack</li>
             * <li><strong>Ipv6</strong>: IPv6 attack</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Tcp-Syn</p>
             */
            public Builder attackType(String attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * <p>The number of request packets of the attack type.</p>
             * 
             * <strong>example:</strong>
             * <p>145902</p>
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
