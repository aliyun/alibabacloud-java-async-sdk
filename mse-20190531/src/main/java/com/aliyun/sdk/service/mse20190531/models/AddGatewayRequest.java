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
    @Validation(required = true)
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

    private AddGatewayRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.enableHardwareAcceleration = builder.enableHardwareAcceleration;
        this.enableSls = builder.enableSls;
        this.enableXtrace = builder.enableXtrace;
        this.enterpriseSecurityGroup = builder.enterpriseSecurityGroup;
        this.internetSlbSpec = builder.internetSlbSpec;
        this.name = builder.name;
        this.region = builder.region;
        this.replica = builder.replica;
        this.resourceGroupId = builder.resourceGroupId;
        this.slbSpec = builder.slbSpec;
        this.spec = builder.spec;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vSwitchId2 = builder.vSwitchId2;
        this.vpc = builder.vpc;
        this.xtraceRatio = builder.xtraceRatio;
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

    public static final class Builder extends Request.Builder<AddGatewayRequest, Builder> {
        private String acceptLanguage; 
        private Boolean enableHardwareAcceleration; 
        private Boolean enableSls; 
        private Boolean enableXtrace; 
        private Boolean enterpriseSecurityGroup; 
        private String internetSlbSpec; 
        private String name; 
        private String region; 
        private Integer replica; 
        private String resourceGroupId; 
        private String slbSpec; 
        private String spec; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private String vSwitchId2; 
        private String vpc; 
        private String xtraceRatio; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewayRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.enableHardwareAcceleration = request.enableHardwareAcceleration;
            this.enableSls = request.enableSls;
            this.enableXtrace = request.enableXtrace;
            this.enterpriseSecurityGroup = request.enterpriseSecurityGroup;
            this.internetSlbSpec = request.internetSlbSpec;
            this.name = request.name;
            this.region = request.region;
            this.replica = request.replica;
            this.resourceGroupId = request.resourceGroupId;
            this.slbSpec = request.slbSpec;
            this.spec = request.spec;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vSwitchId2 = request.vSwitchId2;
            this.vpc = request.vpc;
            this.xtraceRatio = request.xtraceRatio;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Specifies whether to enable hardware acceleration.
         */
        public Builder enableHardwareAcceleration(Boolean enableHardwareAcceleration) {
            this.putQueryParameter("EnableHardwareAcceleration", enableHardwareAcceleration);
            this.enableHardwareAcceleration = enableHardwareAcceleration;
            return this;
        }

        /**
         * Specifies whether to enable Log Service.
         */
        public Builder enableSls(Boolean enableSls) {
            this.putQueryParameter("EnableSls", enableSls);
            this.enableSls = enableSls;
            return this;
        }

        /**
         * Specifies whether to enable Tracing Analysis.
         */
        public Builder enableXtrace(Boolean enableXtrace) {
            this.putQueryParameter("EnableXtrace", enableXtrace);
            this.enableXtrace = enableXtrace;
            return this;
        }

        /**
         * Specifies whether to use an advanced security group.
         */
        public Builder enterpriseSecurityGroup(Boolean enterpriseSecurityGroup) {
            this.putQueryParameter("EnterpriseSecurityGroup", enterpriseSecurityGroup);
            this.enterpriseSecurityGroup = enterpriseSecurityGroup;
            return this;
        }

        /**
         * The specifications of the Internet-facing SLB instance.
         * <p>
         * 
         * *   slb.s1.small
         * *   slb.s2.small
         * *   slb.s2.medium
         * *   slb.s3.small
         * *   slb.s3.medium
         * *   slb.s3.large
         */
        public Builder internetSlbSpec(String internetSlbSpec) {
            this.putQueryParameter("InternetSlbSpec", internetSlbSpec);
            this.internetSlbSpec = internetSlbSpec;
            return this;
        }

        /**
         * The name of the gateway.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The number of nodes.
         */
        public Builder replica(Integer replica) {
            this.putQueryParameter("Replica", replica);
            this.replica = replica;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The specifications of the internal-facing Server Load Balancer (SLB) instance.
         * <p>
         * 
         * *   slb.s1.small
         * *   slb.s2.small
         * *   slb.s2.medium
         * *   slb.s3.small
         * *   slb.s3.medium
         * *   slb.s3.large
         */
        public Builder slbSpec(String slbSpec) {
            this.putQueryParameter("SlbSpec", slbSpec);
            this.slbSpec = slbSpec;
            return this;
        }

        /**
         * The node specifications.
         * <p>
         * 
         * *   MSE_GTW\_16\_32\_200\_c(16C32G)
         * *   MSE_GTW\_2\_4\_200\_c(2C4G)
         * *   MSE_GTW\_4\_8\_200\_c(4C8G)
         * *   MSE_GTW\_8\_16\_200\_c(8C16G)
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * The tag of the gateway.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the primary vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the secondary vSwitch.
         */
        public Builder vSwitchId2(String vSwitchId2) {
            this.putQueryParameter("VSwitchId2", vSwitchId2);
            this.vSwitchId2 = vSwitchId2;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC).
         */
        public Builder vpc(String vpc) {
            this.putQueryParameter("Vpc", vpc);
            this.vpc = vpc;
            return this;
        }

        /**
         * The sample rate of Tracing Analysis. Valid values: \[1,100].
         */
        public Builder xtraceRatio(String xtraceRatio) {
            this.putQueryParameter("XtraceRatio", xtraceRatio);
            this.xtraceRatio = xtraceRatio;
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
}
