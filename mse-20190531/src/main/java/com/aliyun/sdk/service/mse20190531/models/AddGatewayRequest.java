// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGatewayRequest} extends {@link RequestModel}
 *
 * <p>AddGatewayRequest</p>
 */
public class AddGatewayRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("EnableHardwareAcceleration")
    private Boolean enableHardwareAcceleration;

    @Query
    @NameInMap("EnableSls")
    private Boolean enableSls;

    @Query
    @NameInMap("EnableXtrace")
    private Boolean enableXtrace;

    @Query
    @NameInMap("EnterpriseSecurityGroup")
    private Boolean enterpriseSecurityGroup;

    @Query
    @NameInMap("InternetSlbSpec")
    private String internetSlbSpec;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("Replica")
    @Validation(required = true)
    private Integer replica;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SlbSpec")
    private String slbSpec;

    @Query
    @NameInMap("Spec")
    @Validation(required = true)
    private String spec;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VSwitchId2")
    private String vSwitchId2;

    @Query
    @NameInMap("Vpc")
    @Validation(required = true)
    private String vpc;

    @Query
    @NameInMap("XtraceRatio")
    private String xtraceRatio;

    @Query
    @NameInMap("ZoneInfo")
    private java.util.List < ZoneInfo> zoneInfo;

    private AddGatewayRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.chargeType = builder.chargeType;
        this.enableHardwareAcceleration = builder.enableHardwareAcceleration;
        this.enableSls = builder.enableSls;
        this.enableXtrace = builder.enableXtrace;
        this.enterpriseSecurityGroup = builder.enterpriseSecurityGroup;
        this.internetSlbSpec = builder.internetSlbSpec;
        this.name = builder.name;
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
     * @return name
     */
    public String getName() {
        return this.name;
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
    public java.util.List < Tag> getTag() {
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
    public java.util.List < ZoneInfo> getZoneInfo() {
        return this.zoneInfo;
    }

    public static final class Builder extends Request.Builder<AddGatewayRequest, Builder> {
        private String acceptLanguage; 
        private String chargeType; 
        private Boolean enableHardwareAcceleration; 
        private Boolean enableSls; 
        private Boolean enableXtrace; 
        private Boolean enterpriseSecurityGroup; 
        private String internetSlbSpec; 
        private String name; 
        private String region; 
        private Integer replica; 
        private String requestPars; 
        private String resourceGroupId; 
        private String slbSpec; 
        private String spec; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private String vSwitchId2; 
        private String vpc; 
        private String xtraceRatio; 
        private java.util.List < ZoneInfo> zoneInfo; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewayRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.chargeType = request.chargeType;
            this.enableHardwareAcceleration = request.enableHardwareAcceleration;
            this.enableSls = request.enableSls;
            this.enableXtrace = request.enableXtrace;
            this.enterpriseSecurityGroup = request.enterpriseSecurityGroup;
            this.internetSlbSpec = request.internetSlbSpec;
            this.name = request.name;
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
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * 是否开启硬件加速
         */
        public Builder enableHardwareAcceleration(Boolean enableHardwareAcceleration) {
            this.putQueryParameter("EnableHardwareAcceleration", enableHardwareAcceleration);
            this.enableHardwareAcceleration = enableHardwareAcceleration;
            return this;
        }

        /**
         * 是否开启SLS日志投递
         */
        public Builder enableSls(Boolean enableSls) {
            this.putQueryParameter("EnableSls", enableSls);
            this.enableSls = enableSls;
            return this;
        }

        /**
         * 是否开启xtrace
         */
        public Builder enableXtrace(Boolean enableXtrace) {
            this.putQueryParameter("EnableXtrace", enableXtrace);
            this.enableXtrace = enableXtrace;
            return this;
        }

        /**
         * 是否企业安全组类型
         */
        public Builder enterpriseSecurityGroup(Boolean enterpriseSecurityGroup) {
            this.putQueryParameter("EnterpriseSecurityGroup", enterpriseSecurityGroup);
            this.enterpriseSecurityGroup = enterpriseSecurityGroup;
            return this;
        }

        /**
         * 外网SLB规格
         */
        public Builder internetSlbSpec(String internetSlbSpec) {
            this.putQueryParameter("InternetSlbSpec", internetSlbSpec);
            this.internetSlbSpec = internetSlbSpec;
            return this;
        }

        /**
         * illegal request:%s
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * mse-200-021
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * system error
         */
        public Builder replica(Integer replica) {
            this.putQueryParameter("Replica", replica);
            this.replica = replica;
            return this;
        }

        /**
         * 扩展字段。
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * clusterNotFound
         */
        public Builder slbSpec(String slbSpec) {
            this.putQueryParameter("SlbSpec", slbSpec);
            this.slbSpec = slbSpec;
            return this;
        }

        /**
         * systemError
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * 标签列表，最多包含20个子项
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * mse-100-001
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * 备交换机ID
         */
        public Builder vSwitchId2(String vSwitchId2) {
            this.putQueryParameter("VSwitchId2", vSwitchId2);
            this.vSwitchId2 = vSwitchId2;
            return this;
        }

        /**
         * cluster not found
         */
        public Builder vpc(String vpc) {
            this.putQueryParameter("Vpc", vpc);
            this.vpc = vpc;
            return this;
        }

        /**
         * xtrace采样率，取值[0,100]
         */
        public Builder xtraceRatio(String xtraceRatio) {
            this.putQueryParameter("XtraceRatio", xtraceRatio);
            this.xtraceRatio = xtraceRatio;
            return this;
        }

        /**
         * ZoneInfo.
         */
        public Builder zoneInfo(java.util.List < ZoneInfo> zoneInfo) {
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

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * 标签键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值
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
    public static class ZoneInfo extends TeaModel {
        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
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

            /**
             * mse-100-001
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
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
