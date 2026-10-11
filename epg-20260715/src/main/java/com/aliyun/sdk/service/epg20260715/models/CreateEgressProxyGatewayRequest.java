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
 * {@link CreateEgressProxyGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateEgressProxyGatewayRequest</p>
 */
public class CreateEgressProxyGatewayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyConfigurationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyGatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListenerProperties")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ListenerProperties> listenerProperties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TlsInterceptProperties")
    private TlsInterceptProperties tlsInterceptProperties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ZoneMappings> zoneMappings;

    private CreateEgressProxyGatewayRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.egressProxyConfigurationId = builder.egressProxyConfigurationId;
        this.egressProxyGatewayName = builder.egressProxyGatewayName;
        this.listenerProperties = builder.listenerProperties;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.tlsInterceptProperties = builder.tlsInterceptProperties;
        this.vpcId = builder.vpcId;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEgressProxyGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return egressProxyConfigurationId
     */
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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

    public static final class Builder extends Request.Builder<CreateEgressProxyGatewayRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String egressProxyConfigurationId; 
        private String egressProxyGatewayName; 
        private java.util.List<ListenerProperties> listenerProperties; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 
        private TlsInterceptProperties tlsInterceptProperties; 
        private String vpcId; 
        private java.util.List<ZoneMappings> zoneMappings; 

        private Builder() {
            super();
        } 

        private Builder(CreateEgressProxyGatewayRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.egressProxyConfigurationId = request.egressProxyConfigurationId;
            this.egressProxyGatewayName = request.egressProxyGatewayName;
            this.listenerProperties = request.listenerProperties;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.tlsInterceptProperties = request.tlsInterceptProperties;
            this.vpcId = request.vpcId;
            this.zoneMappings = request.zoneMappings;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>Note If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the egress proxy gateway instance.</p>
         * <p>The description must be 2 to 256 characters in length, and can contain Chinese characters, letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: prechecks the request without creating the egress proxy gateway instance. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the DryRunOperation error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends the request. If the request passes the precheck, the HTTP 2xx status code is returned and the operation is performed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the egress proxy configuration that is associated with the egress proxy gateway instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epc-uf609a6a8fdf9f4****</p>
         */
        public Builder egressProxyConfigurationId(String egressProxyConfigurationId) {
            this.putBodyParameter("EgressProxyConfigurationId", egressProxyConfigurationId);
            this.egressProxyConfigurationId = egressProxyConfigurationId;
            return this;
        }

        /**
         * <p>The name of the egress proxy gateway instance.</p>
         * <p>The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        public Builder egressProxyGatewayName(String egressProxyGatewayName) {
            this.putBodyParameter("EgressProxyGatewayName", egressProxyGatewayName);
            this.egressProxyGatewayName = egressProxyGatewayName;
            return this;
        }

        /**
         * <p>The listener configurations of the egress proxy gateway instance.</p>
         * <p>Listeners in the same gateway instance cannot use the same port.</p>
         * <p>This parameter is required.</p>
         */
        public Builder listenerProperties(java.util.List<ListenerProperties> listenerProperties) {
            this.putBodyParameter("ListenerProperties", listenerProperties);
            this.listenerProperties = listenerProperties;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-gw80bb6a94f835db****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The TLS interception configuration of the egress proxy gateway instance.</p>
         */
        public Builder tlsInterceptProperties(TlsInterceptProperties tlsInterceptProperties) {
            this.putBodyParameter("TlsInterceptProperties", tlsInterceptProperties);
            this.tlsInterceptProperties = tlsInterceptProperties;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the egress proxy gateway instance belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-zm0ejg5unozkhvuhd****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone and vSwitch mappings of the egress proxy gateway instance.</p>
         * <p>If the current region supports two or more zones, add at least two zones to improve availability.</p>
         * <p>This parameter is required.</p>
         */
        public Builder zoneMappings(java.util.List<ZoneMappings> zoneMappings) {
            this.putBodyParameter("ZoneMappings", zoneMappings);
            this.zoneMappings = zoneMappings;
            return this;
        }

        @Override
        public CreateEgressProxyGatewayRequest build() {
            return new CreateEgressProxyGatewayRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEgressProxyGatewayRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyGatewayRequest</p>
     */
    public static class ListenerProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The listener port.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type of the listener. Valid values:</p>
             * <ul>
             * <li><p><strong>HTTP</strong>: HTTP.</p>
             * </li>
             * <li><p><strong>HTTPS</strong>: HTTPS.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
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
     * {@link CreateEgressProxyGatewayRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyGatewayRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The value can be up to 256 characters in length, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyGatewayRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyGatewayRequest</p>
     */
    public static class TlsInterceptProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateCaCertificateId")
        private String privateCaCertificateId;

        @com.aliyun.core.annotation.NameInMap("TlsInterceptMode")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <ul>
             * <li>This parameter is required when <strong>TlsInterceptMode</strong> is set to <strong>enable</strong>.</li>
             * <li>Do not specify this parameter when <strong>TlsInterceptMode</strong> is set to <strong>disable</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1f01a6f9-a0e7-64e5-9d3c-29c056bf****</p>
             */
            public Builder privateCaCertificateId(String privateCaCertificateId) {
                this.privateCaCertificateId = privateCaCertificateId;
                return this;
            }

            /**
             * <p>Specifies whether to enable TLS interception. Valid values:</p>
             * <ul>
             * <li><p><strong>enable</strong>: enables TLS interception.</p>
             * </li>
             * <li><p><strong>disable</strong>: disables TLS interception.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
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
     * {@link CreateEgressProxyGatewayRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyGatewayRequest</p>
     */
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String zoneId;

        private ZoneMappings(Builder builder) {
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
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneMappings model) {
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The ID of the vSwitch that corresponds to the zone.</p>
             * <p>The vSwitch must belong to the specified VPC and match the zone specified by ZoneId.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-wz9aejevoin852mo****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * <p>You can call the DescribeZones operation to query information about zones in a region.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-m</p>
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
