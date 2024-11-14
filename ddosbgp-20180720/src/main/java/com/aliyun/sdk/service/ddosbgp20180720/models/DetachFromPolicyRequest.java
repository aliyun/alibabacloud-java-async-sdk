// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetachFromPolicyRequest} extends {@link RequestModel}
 *
 * <p>DetachFromPolicyRequest</p>
 */
public class DetachFromPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpPortProtocolList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < IpPortProtocolList> ipPortProtocolList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    private DetachFromPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ipPortProtocolList = builder.ipPortProtocolList;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachFromPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ipPortProtocolList
     */
    public java.util.List < IpPortProtocolList> getIpPortProtocolList() {
        return this.ipPortProtocolList;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<DetachFromPolicyRequest, Builder> {
        private String regionId; 
        private java.util.List < IpPortProtocolList> ipPortProtocolList; 
        private String policyType; 

        private Builder() {
            super();
        } 

        private Builder(DetachFromPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ipPortProtocolList = request.ipPortProtocolList;
            this.policyType = request.policyType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The protected objects.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ipPortProtocolList(java.util.List < IpPortProtocolList> ipPortProtocolList) {
            String ipPortProtocolListShrink = shrink(ipPortProtocolList, "IpPortProtocolList", "json");
            this.putQueryParameter("IpPortProtocolList", ipPortProtocolListShrink);
            this.ipPortProtocolList = ipPortProtocolList;
            return this;
        }

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: the default mitigation policies.</li>
         * <li><strong>l3</strong>: IP-specific mitigation policies.</li>
         * <li><strong>l4</strong>: port-specific mitigation policies.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>l3</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public DetachFromPolicyRequest build() {
            return new DetachFromPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link DetachFromPolicyRequest} extends {@link TeaModel}
     *
     * <p>DetachFromPolicyRequest</p>
     */
    public static class IpPortProtocolList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private IpPortProtocolList(Builder builder) {
            this.ip = builder.ip;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpPortProtocolList create() {
            return builder().build();
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
            private String ip; 
            private Integer port; 
            private String protocol; 

            /**
             * <p>The IP address of the protected object.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>47.118.172.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The port of the protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>8*</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type of the protected object. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public IpPortProtocolList build() {
                return new IpPortProtocolList(this);
            } 

        } 

    }
}
