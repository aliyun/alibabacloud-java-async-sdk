// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link GetEgressProxyGatewayAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetEgressProxyGatewayAttributeResponseBody</p>
 */
public class GetEgressProxyGatewayAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DefaultEgressProxyIpPoolId")
    private String defaultEgressProxyIpPoolId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DnsName")
    private String dnsName;

    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationId")
    private String egressProxyConfigurationId;

    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayId")
    private String egressProxyGatewayId;

    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayName")
    private String egressProxyGatewayName;

    @com.aliyun.core.annotation.NameInMap("ListenerProperties")
    private java.util.List<ListenerProperties> listenerProperties;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TlsInterceptProperties")
    private TlsInterceptProperties tlsInterceptProperties;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    private java.util.List<ZoneMappings> zoneMappings;

    private GetEgressProxyGatewayAttributeResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.defaultEgressProxyIpPoolId = builder.defaultEgressProxyIpPoolId;
        this.description = builder.description;
        this.dnsName = builder.dnsName;
        this.egressProxyConfigurationId = builder.egressProxyConfigurationId;
        this.egressProxyGatewayId = builder.egressProxyGatewayId;
        this.egressProxyGatewayName = builder.egressProxyGatewayName;
        this.listenerProperties = builder.listenerProperties;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tags = builder.tags;
        this.tlsInterceptProperties = builder.tlsInterceptProperties;
        this.vpcId = builder.vpcId;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEgressProxyGatewayAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return defaultEgressProxyIpPoolId
     */
    public String getDefaultEgressProxyIpPoolId() {
        return this.defaultEgressProxyIpPoolId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dnsName
     */
    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * @return egressProxyConfigurationId
     */
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    /**
     * @return egressProxyGatewayId
     */
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

    /**
     * @return egressProxyGatewayName
     */
    public String getEgressProxyGatewayName() {
        return this.egressProxyGatewayName;
    }

    /**
     * @return listenerProperties
     */
    public java.util.List<ListenerProperties> getListenerProperties() {
        return this.listenerProperties;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return tlsInterceptProperties
     */
    public TlsInterceptProperties getTlsInterceptProperties() {
        return this.tlsInterceptProperties;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneMappings
     */
    public java.util.List<ZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder {
        private String createTime; 
        private String defaultEgressProxyIpPoolId; 
        private String description; 
        private String dnsName; 
        private String egressProxyConfigurationId; 
        private String egressProxyGatewayId; 
        private String egressProxyGatewayName; 
        private java.util.List<ListenerProperties> listenerProperties; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List<Tags> tags; 
        private TlsInterceptProperties tlsInterceptProperties; 
        private String vpcId; 
        private java.util.List<ZoneMappings> zoneMappings; 

        private Builder() {
        } 

        private Builder(GetEgressProxyGatewayAttributeResponseBody model) {
            this.createTime = model.createTime;
            this.defaultEgressProxyIpPoolId = model.defaultEgressProxyIpPoolId;
            this.description = model.description;
            this.dnsName = model.dnsName;
            this.egressProxyConfigurationId = model.egressProxyConfigurationId;
            this.egressProxyGatewayId = model.egressProxyGatewayId;
            this.egressProxyGatewayName = model.egressProxyGatewayName;
            this.listenerProperties = model.listenerProperties;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.tags = model.tags;
            this.tlsInterceptProperties = model.tlsInterceptProperties;
            this.vpcId = model.vpcId;
            this.zoneMappings = model.zoneMappings;
        } 

        /**
         * <p>The time when the egress proxy gateway was created. The time is displayed in UTC and follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-02T02:49:05Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the default egress IP pool.</p>
         * 
         * <strong>example:</strong>
         * <p>eppool-gw80d96a96ca0b00****</p>
         */
        public Builder defaultEgressProxyIpPoolId(String defaultEgressProxyIpPoolId) {
            this.defaultEgressProxyIpPoolId = defaultEgressProxyIpPoolId;
            return this;
        }

        /**
         * <p>The description of the egress proxy gateway instance. The description must be 2 to 256 characters in length and can contain Chinese characters and English letters. It can also contain digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The DNS domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-gw80bb6a94f835****.cn-shanghai.epg.aliyuncs.com</p>
         */
        public Builder dnsName(String dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        /**
         * <p>The ID of the associated egress proxy configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>epc-uf609a6a8fdf9f4d****</p>
         */
        public Builder egressProxyConfigurationId(String egressProxyConfigurationId) {
            this.egressProxyConfigurationId = egressProxyConfigurationId;
            return this;
        }

        /**
         * <p>The ID of the egress proxy gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-gw80bb6a94f835db****</p>
         */
        public Builder egressProxyGatewayId(String egressProxyGatewayId) {
            this.egressProxyGatewayId = egressProxyGatewayId;
            return this;
        }

        /**
         * <p>The name of the egress proxy gateway. The name must be 2 to 128 characters in length and can contain English letters and Chinese characters. It must start with a letter or a Chinese character and can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        public Builder egressProxyGatewayName(String egressProxyGatewayName) {
            this.egressProxyGatewayName = egressProxyGatewayName;
            return this;
        }

        /**
         * <p>The list of listener properties.</p>
         */
        public Builder listenerProperties(java.util.List<ListenerProperties> listenerProperties) {
            this.listenerProperties = listenerProperties;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01A05AB7-6C14-5A12-94E7-F20F9F69AE3D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2zye42m****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The instance status of the egress proxy gateway. Valid values:</p>
         * <ul>
         * <li><strong>Provisioning</strong>: The instance is being created.</li>
         * <li><strong>Active</strong>: The instance is running.</li>
         * <li><strong>Configuring</strong>: The instance is being reconfigured.</li>
         * <li><strong>Inactive</strong>: The instance is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The TLS interception properties.</p>
         */
        public Builder tlsInterceptProperties(TlsInterceptProperties tlsInterceptProperties) {
            this.tlsInterceptProperties = tlsInterceptProperties;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-n4appznmjjr362yd3****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The list of zone and vSwitch mappings. If the current region supports two or more zones, at least two zones must be returned.</p>
         */
        public Builder zoneMappings(java.util.List<ZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }

        public GetEgressProxyGatewayAttributeResponseBody build() {
            return new GetEgressProxyGatewayAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEgressProxyGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyGatewayAttributeResponseBody</p>
     */
    public static class ListenerProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private ListenerProperties(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerProperties create() {
            return builder().build();
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
            private Integer port; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(ListenerProperties model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The listener port. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The listener protocol. Valid values:</p>
             * <ul>
             * <li><strong>HTTP</strong></li>
             * <li><strong>HTTPS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public ListenerProperties build() {
                return new ListenerProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEgressProxyGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyGatewayAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The value can be up to 256 characters in length and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEgressProxyGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyGatewayAttributeResponseBody</p>
     */
    public static class TlsInterceptProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateCaCertificateId")
        private String privateCaCertificateId;

        @com.aliyun.core.annotation.NameInMap("TlsInterceptMode")
        private String tlsInterceptMode;

        private TlsInterceptProperties(Builder builder) {
            this.privateCaCertificateId = builder.privateCaCertificateId;
            this.tlsInterceptMode = builder.tlsInterceptMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TlsInterceptProperties create() {
            return builder().build();
        }

        /**
         * @return privateCaCertificateId
         */
        public String getPrivateCaCertificateId() {
            return this.privateCaCertificateId;
        }

        /**
         * @return tlsInterceptMode
         */
        public String getTlsInterceptMode() {
            return this.tlsInterceptMode;
        }

        public static final class Builder {
            private String privateCaCertificateId; 
            private String tlsInterceptMode; 

            private Builder() {
            } 

            private Builder(TlsInterceptProperties model) {
                this.privateCaCertificateId = model.privateCaCertificateId;
                this.tlsInterceptMode = model.tlsInterceptMode;
            } 

            /**
             * <p>The ID of the private CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>1f01a6f9-a0e7-64e5-9d3c-29c056bf****</p>
             */
            public Builder privateCaCertificateId(String privateCaCertificateId) {
                this.privateCaCertificateId = privateCaCertificateId;
                return this;
            }

            /**
             * <p>The TLS Block Mode. Valid values:</p>
             * <ul>
             * <li><strong>enable</strong>: Enables the TLS Block Mode.</li>
             * <li><strong>disable</strong>: Disables the TLS Block Mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder tlsInterceptMode(String tlsInterceptMode) {
                this.tlsInterceptMode = tlsInterceptMode;
                return this;
            }

            public TlsInterceptProperties build() {
                return new TlsInterceptProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEgressProxyGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyGatewayAttributeResponseBody</p>
     */
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneMappings create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String status; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneMappings model) {
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The zone status. Valid values:</p>
             * <ul>
             * <li><strong>Provisioning</strong>: The zone is being created.</li>
             * <li><strong>Available</strong>: The zone is available.</li>
             * <li><strong>Configuring</strong>: The zone is being reconfigured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the vSwitch that corresponds to the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-f8zvrktbjs9hh3xqz****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneMappings build() {
                return new ZoneMappings(this);
            } 

        } 

    }
}
