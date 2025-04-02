// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link AddGatewayRequest} extends {@link RequestModel}
 *
 * <p>AddGatewayRequest</p>
 */
public class AddGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClbNetworkType")
    private String clbNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableHardwareAcceleration")
    private Boolean enableHardwareAcceleration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSls")
    private Boolean enableSls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableXtrace")
    private Boolean enableXtrace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseSecurityGroup")
    private Boolean enterpriseSecurityGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetSlbSpec")
    private String internetSlbSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MserVersion")
    private String mserVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NlbNetworkType")
    private String nlbNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replica")
    private Integer replica;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbSpec")
    private String slbSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId2")
    private String vSwitchId2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vpc")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XtraceRatio")
    private String xtraceRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneInfo")
    private java.util.List<ZoneInfo> zoneInfo;

    private AddGatewayRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.chargeType = builder.chargeType;
        this.clbNetworkType = builder.clbNetworkType;
        this.enableHardwareAcceleration = builder.enableHardwareAcceleration;
        this.enableSls = builder.enableSls;
        this.enableXtrace = builder.enableXtrace;
        this.enterpriseSecurityGroup = builder.enterpriseSecurityGroup;
        this.internetSlbSpec = builder.internetSlbSpec;
        this.mserVersion = builder.mserVersion;
        this.name = builder.name;
        this.nlbNetworkType = builder.nlbNetworkType;
        this.region = builder.region;
        this.replica = builder.replica;
        this.requestPars = builder.requestPars;
        this.resourceGroupId = builder.resourceGroupId;
        this.slbSpec = builder.slbSpec;
        this.spec = builder.spec;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vSwitchId2 = builder.vSwitchId2;
        this.vpc = builder.vpc;
        this.xtraceRatio = builder.xtraceRatio;
        this.zoneInfo = builder.zoneInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clbNetworkType
     */
    public String getClbNetworkType() {
        return this.clbNetworkType;
    }

    /**
     * @return enableHardwareAcceleration
     */
    public Boolean getEnableHardwareAcceleration() {
        return this.enableHardwareAcceleration;
    }

    /**
     * @return enableSls
     */
    public Boolean getEnableSls() {
        return this.enableSls;
    }

    /**
     * @return enableXtrace
     */
    public Boolean getEnableXtrace() {
        return this.enableXtrace;
    }

    /**
     * @return enterpriseSecurityGroup
     */
    public Boolean getEnterpriseSecurityGroup() {
        return this.enterpriseSecurityGroup;
    }

    /**
     * @return internetSlbSpec
     */
    public String getInternetSlbSpec() {
        return this.internetSlbSpec;
    }

    /**
     * @return mserVersion
     */
    public String getMserVersion() {
        return this.mserVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nlbNetworkType
     */
    public String getNlbNetworkType() {
        return this.nlbNetworkType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return replica
     */
    public Integer getReplica() {
        return this.replica;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return slbSpec
     */
    public String getSlbSpec() {
        return this.slbSpec;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vSwitchId2
     */
    public String getVSwitchId2() {
        return this.vSwitchId2;
    }

    /**
     * @return vpc
     */
    public String getVpc() {
        return this.vpc;
    }

    /**
     * @return xtraceRatio
     */
    public String getXtraceRatio() {
        return this.xtraceRatio;
    }

    /**
     * @return zoneInfo
     */
    public java.util.List<ZoneInfo> getZoneInfo() {
        return this.zoneInfo;
    }

    public static final class Builder extends Request.Builder<AddGatewayRequest, Builder> {
        private String acceptLanguage; 
        private String chargeType; 
        private String clbNetworkType; 
        private Boolean enableHardwareAcceleration; 
        private Boolean enableSls; 
        private Boolean enableXtrace; 
        private Boolean enterpriseSecurityGroup; 
        private String internetSlbSpec; 
        private String mserVersion; 
        private String name; 
        private String nlbNetworkType; 
        private String region; 
        private Integer replica; 
        private String requestPars; 
        private String resourceGroupId; 
        private String slbSpec; 
        private String spec; 
        private java.util.List<Tag> tag; 
        private String vSwitchId; 
        private String vSwitchId2; 
        private String vpc; 
        private String xtraceRatio; 
        private java.util.List<ZoneInfo> zoneInfo; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewayRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.chargeType = request.chargeType;
            this.clbNetworkType = request.clbNetworkType;
            this.enableHardwareAcceleration = request.enableHardwareAcceleration;
            this.enableSls = request.enableSls;
            this.enableXtrace = request.enableXtrace;
            this.enterpriseSecurityGroup = request.enterpriseSecurityGroup;
            this.internetSlbSpec = request.internetSlbSpec;
            this.mserVersion = request.mserVersion;
            this.name = request.name;
            this.nlbNetworkType = request.nlbNetworkType;
            this.region = request.region;
            this.replica = request.replica;
            this.requestPars = request.requestPars;
            this.resourceGroupId = request.resourceGroupId;
            this.slbSpec = request.slbSpec;
            this.spec = request.spec;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vSwitchId2 = request.vSwitchId2;
            this.vpc = request.vpc;
            this.xtraceRatio = request.xtraceRatio;
            this.zoneInfo = request.zoneInfo;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The billing method you specify when you purchase an ordinary instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PREPAY: subscription</li>
         * <li>POSTPAY: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The network type of the purchased Classic Load Balancer (CLB) instance that is billed based on LCUs.</p>
         * <ul>
         * <li>pubnet: Internet</li>
         * <li>privatenet: private network</li>
         * <li>privatepubnet: Internet and private network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pubnet</p>
         */
        public Builder clbNetworkType(String clbNetworkType) {
            this.putQueryParameter("ClbNetworkType", clbNetworkType);
            this.clbNetworkType = clbNetworkType;
            return this;
        }

        /**
         * <p>Specifies whether to activate Tracing Analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableHardwareAcceleration(Boolean enableHardwareAcceleration) {
            this.putQueryParameter("EnableHardwareAcceleration", enableHardwareAcceleration);
            this.enableHardwareAcceleration = enableHardwareAcceleration;
            return this;
        }

        /**
         * <p>The tag of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableSls(Boolean enableSls) {
            this.putQueryParameter("EnableSls", enableSls);
            this.enableSls = enableSls;
            return this;
        }

        /**
         * <p>The sampling rate of Tracing Analysis. Valid values: [1,100].</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableXtrace(Boolean enableXtrace) {
            this.putQueryParameter("EnableXtrace", enableXtrace);
            this.enableXtrace = enableXtrace;
            return this;
        }

        /**
         * <p>Specifies whether to enable hardware acceleration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enterpriseSecurityGroup(Boolean enterpriseSecurityGroup) {
            this.putQueryParameter("EnterpriseSecurityGroup", enterpriseSecurityGroup);
            this.enterpriseSecurityGroup = enterpriseSecurityGroup;
            return this;
        }

        /**
         * <p>The specifications of the Internet-facing Server Load Balancer (SLB) instance. Valid values:</p>
         * <ul>
         * <li>slb.s1.small</li>
         * <li>slb.s2.smal</li>
         * <li>slb.s2.medium</li>
         * <li>slb.s3.small</li>
         * <li>slb.s3.medium</li>
         * <li>slb.s3.large</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>slb.s2.small</p>
         */
        public Builder internetSlbSpec(String internetSlbSpec) {
            this.putQueryParameter("InternetSlbSpec", internetSlbSpec);
            this.internetSlbSpec = internetSlbSpec;
            return this;
        }

        /**
         * <p>The MSE instance type. Valid values:</p>
         * <ul>
         * <li>mse_pro: ordinary instance</li>
         * <li>mse_serverless: serverless instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mse_pro</p>
         */
        public Builder mserVersion(String mserVersion) {
            this.putQueryParameter("MserVersion", mserVersion);
            this.mserVersion = mserVersion;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ceshi</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The network type of the Network Load Balancer (NLB) instance you specify when you purchase a serverless instance.</p>
         * <ul>
         * <li>pubnet: Internet</li>
         * <li>privatenet: private network</li>
         * <li>privatepubnet: Internet and private network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pubnet</p>
         */
        public Builder nlbNetworkType(String nlbNetworkType) {
            this.putQueryParameter("NlbNetworkType", nlbNetworkType);
            this.nlbNetworkType = nlbNetworkType;
            return this;
        }

        /**
         * <p>The specifications of the internal-facing Server Load Balancer (SLB) instance. Valid values:</p>
         * <ul>
         * <li>slb.s1.small</li>
         * <li>slb.s2.small</li>
         * <li>slb.s2.medium</li>
         * <li>slb.s3.small</li>
         * <li>slb.s3.medium</li>
         * <li>slb.s3.large</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The number of nodes you specify when you purchase an ordinary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder replica(Integer replica) {
            this.putQueryParameter("Replica", replica);
            this.replica = replica;
            return this;
        }

        /**
         * <p>The extended field.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm34x43l*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The specifications of the internal-facing Server Load Balancer (SLB) instance. Valid values:</p>
         * <ul>
         * <li>slb.s1.small</li>
         * <li>slb.s2.small</li>
         * <li>slb.s2.medium</li>
         * <li>slb.s3.small</li>
         * <li>slb.s3.medium</li>
         * <li>slb.s3.large</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>slb.s2.small</p>
         */
        public Builder slbSpec(String slbSpec) {
            this.putQueryParameter("SlbSpec", slbSpec);
            this.slbSpec = slbSpec;
            return this;
        }

        /**
         * <p>The node specifications you specify when you purchase an ordinary instance. Valid values:</p>
         * <ul>
         * <li>MSE_GTW_16_32_200_c(16C32G)</li>
         * <li>MSE_GTW_2_4_200_c(2C4G)</li>
         * <li>MSE_GTW_4_8_200_c(4C8G)</li>
         * <li>MSE_GTW_8_16_200_c(8C16G)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MSE_GTW_2_4_200_c</p>
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>The tag object.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the primary vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1q8th57frl5khj2li43</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>Specifies whether to use an advanced security group.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz9bu6o5vsvitt5mrxo6s</p>
         */
        public Builder vSwitchId2(String vSwitchId2) {
            this.putQueryParameter("VSwitchId2", vSwitchId2);
            this.vSwitchId2 = vSwitchId2;
            return this;
        }

        /**
         * <p>The ID of the primary vSwitch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15mncnrtm83uauxd1xb</p>
         */
        public Builder vpc(String vpc) {
            this.putQueryParameter("Vpc", vpc);
            this.vpc = vpc;
            return this;
        }

        /**
         * <p>Specifies whether to activate Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder xtraceRatio(String xtraceRatio) {
            this.putQueryParameter("XtraceRatio", xtraceRatio);
            this.xtraceRatio = xtraceRatio;
            return this;
        }

        /**
         * <p>The details of the zone.</p>
         */
        public Builder zoneInfo(java.util.List<ZoneInfo> zoneInfo) {
            String zoneInfoShrink = shrink(zoneInfo, "ZoneInfo", "json");
            this.putQueryParameter("ZoneInfo", zoneInfoShrink);
            this.zoneInfo = zoneInfo;
            return this;
        }

        @Override
        public AddGatewayRequest build() {
            return new AddGatewayRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddGatewayRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRequest</p>
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
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
     * {@link AddGatewayRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRequest</p>
     */
    public static class ZoneInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ZoneInfo(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneInfo create() {
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

            private Builder(ZoneInfo model) {
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp*****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen-e</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneInfo build() {
                return new ZoneInfo(this);
            } 

        } 

    }
}
