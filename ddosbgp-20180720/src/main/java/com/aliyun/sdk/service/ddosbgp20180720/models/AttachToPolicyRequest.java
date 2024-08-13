// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachToPolicyRequest} extends {@link RequestModel}
 *
 * <p>AttachToPolicyRequest</p>
 */
public class AttachToPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpPortProtocolList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < IpPortProtocolList> ipPortProtocolList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private AttachToPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ipPortProtocolList = builder.ipPortProtocolList;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachToPolicyRequest create() {
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<AttachToPolicyRequest, Builder> {
        private String regionId; 
        private java.util.List < IpPortProtocolList> ipPortProtocolList; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(AttachToPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ipPortProtocolList = request.ipPortProtocolList;
            this.policyId = request.policyId;
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
         * The protected objects.
         */
        public Builder ipPortProtocolList(java.util.List < IpPortProtocolList> ipPortProtocolList) {
            String ipPortProtocolListShrink = shrink(ipPortProtocolList, "IpPortProtocolList", "json");
            this.putQueryParameter("IpPortProtocolList", ipPortProtocolListShrink);
            this.ipPortProtocolList = ipPortProtocolList;
            return this;
        }

        /**
         * The policy ID.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public AttachToPolicyRequest build() {
            return new AttachToPolicyRequest(this);
        } 

    } 

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
             * The IP address of the protected object.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The port number of the protected object.
             * <p>
             * 
             * >  This parameter is available for only port-specific mitigation policies.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol type of the protected object. Valid values:
             * <p>
             * 
             * *   **tcp**
             * *   **udp**
             * 
             * >  This parameter is available for only port-specific mitigation policies.
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
