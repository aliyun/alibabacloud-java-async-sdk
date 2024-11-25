// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateResolverEndpointRequest} extends {@link RequestModel}
 *
 * <p>UpdateResolverEndpointRequest</p>
 */
public class UpdateResolverEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpConfig")
    private java.util.List < IpConfig> ipConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateResolverEndpointRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
        this.ipConfig = builder.ipConfig;
        this.lang = builder.lang;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResolverEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return ipConfig
     */
    public java.util.List < IpConfig> getIpConfig() {
        return this.ipConfig;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateResolverEndpointRequest, Builder> {
        private String endpointId; 
        private java.util.List < IpConfig> ipConfig; 
        private String lang; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResolverEndpointRequest request) {
            super(request);
            this.endpointId = request.endpointId;
            this.ipConfig = request.ipConfig;
            this.lang = request.lang;
            this.name = request.name;
        } 

        /**
         * <p>The endpoint ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hr****</p>
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The source IP addresses of outbound traffic. You can add two to six IP addresses.</p>
         * <blockquote>
         * <p> You must add at least two source IP addresses for outbound traffic to ensure high availability. We recommend that you add two IP addresses that reside in different zones. You can add up to six source IP addresses.</p>
         * </blockquote>
         */
        public Builder ipConfig(java.util.List < IpConfig> ipConfig) {
            this.putQueryParameter("IpConfig", ipConfig);
            this.ipConfig = ipConfig;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The endpoint name.</p>
         * 
         * <strong>example:</strong>
         * <p>endpoint-test-name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateResolverEndpointRequest build() {
            return new UpdateResolverEndpointRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateResolverEndpointRequest} extends {@link TeaModel}
     *
     * <p>UpdateResolverEndpointRequest</p>
     */
    public static class IpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AzId")
        private String azId;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private IpConfig(Builder builder) {
            this.azId = builder.azId;
            this.cidrBlock = builder.cidrBlock;
            this.ip = builder.ip;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpConfig create() {
            return builder().build();
        }

        /**
         * @return azId
         */
        public String getAzId() {
            return this.azId;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String azId; 
            private String cidrBlock; 
            private String ip; 
            private String vSwitchId; 

            /**
             * <p>The ID of the zone to which the vSwitch belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder azId(String azId) {
                this.azId = azId;
                return this;
            }

            /**
             * <p>The IPv4 CIDR block of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The source IP address of outbound traffic. The IP address must be within the specified CIDR block. If you leave this parameter empty, the system automatically allocates an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-0jlgeyq4oazkh5xue****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public IpConfig build() {
                return new IpConfig(this);
            } 

        } 

    }
}
