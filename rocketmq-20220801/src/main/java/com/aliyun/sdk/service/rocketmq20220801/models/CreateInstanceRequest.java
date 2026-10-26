// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aclInfo")
    private AclInfo aclInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("commodityCode")
    @Deprecated
    private String commodityCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private NetworkInfo networkInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paymentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("period")
    private Integer period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("periodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productInfo")
    private ProductInfo productInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("seriesCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String seriesCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subSeriesCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subSeriesCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.aclInfo = builder.aclInfo;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.commodityCode = builder.commodityCode;
        this.instanceName = builder.instanceName;
        this.networkInfo = builder.networkInfo;
        this.paymentType = builder.paymentType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.productInfo = builder.productInfo;
        this.remark = builder.remark;
        this.resourceGroupId = builder.resourceGroupId;
        this.seriesCode = builder.seriesCode;
        this.serviceCode = builder.serviceCode;
        this.subSeriesCode = builder.subSeriesCode;
        this.tags = builder.tags;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclInfo
     */
    public AclInfo getAclInfo() {
        return this.aclInfo;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return networkInfo
     */
    public NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return productInfo
     */
    public ProductInfo getProductInfo() {
        return this.productInfo;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return seriesCode
     */
    public String getSeriesCode() {
        return this.seriesCode;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return subSeriesCode
     */
    public String getSubSeriesCode() {
        return this.subSeriesCode;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private AclInfo aclInfo; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String commodityCode; 
        private String instanceName; 
        private NetworkInfo networkInfo; 
        private String paymentType; 
        private Integer period; 
        private String periodUnit; 
        private ProductInfo productInfo; 
        private String remark; 
        private String resourceGroupId; 
        private String seriesCode; 
        private String serviceCode; 
        private String subSeriesCode; 
        private java.util.List<Tags> tags; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.aclInfo = request.aclInfo;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.commodityCode = request.commodityCode;
            this.instanceName = request.instanceName;
            this.networkInfo = request.networkInfo;
            this.paymentType = request.paymentType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.productInfo = request.productInfo;
            this.remark = request.remark;
            this.resourceGroupId = request.resourceGroupId;
            this.seriesCode = request.seriesCode;
            this.serviceCode = request.serviceCode;
            this.subSeriesCode = request.subSeriesCode;
            this.tags = request.tags;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The access control information.</p>
         */
        public Builder aclInfo(AclInfo aclInfo) {
            this.putBodyParameter("aclInfo", aclInfo);
            this.aclInfo = aclInfo;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when the billing method of the instance is set to Subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("autoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The Unified Auto Renewal Cycle. This parameter takes effect only when auto-renewal is enabled. Unit: months.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Monthly renewal: 1, 2, 3, 6, 12</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putBodyParameter("autoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>The commodity code.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- ons_rmqsub_public_cn: subscription instance.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- ons_rmqpost_public_cn: pay-as-you-go instance.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- ons_rmqsrvlesspost_public_cn: serverless instance.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;- ons_rmqpost_public_intl: pay-as-you-go.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;- ons_rmqsub_public_intl: subscription.
         * &lt;props=&quot;intl&quot;&gt;- ons_rmqsrvlesspost_public_intl: serverless instance.
         * This parameter is required for serverless instances.</p>
         * 
         * <strong>example:</strong>
         * <p>ons_ rmqpost_public_cn</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putBodyParameter("commodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The name of the instance to be created.</p>
         * <p>If you do not specify this parameter, the instance ID is used as the instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-72u3048uxxx</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The network configuration information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder networkInfo(NetworkInfo networkInfo) {
            this.putBodyParameter("networkInfo", networkInfo);
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * <p>The billing method of the instance. ApsaraMQ for RocketMQ supports subscription and pay-as-you-go billing methods.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/427234.html">Billable methods</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The subscription duration. This parameter takes effect only when the billing method of the instance is set to Subscription.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Monthly subscription: 1, 2, 3, 4, 5, 6</p>
         * </li>
         * <li><p>Yearly subscription: 1, 2, 3</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder period(Integer period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The minimum epoch unit of the subscription duration.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("periodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The instance specification information.</p>
         */
        public Builder productInfo(ProductInfo productInfo) {
            this.putBodyParameter("productInfo", productInfo);
            this.productInfo = productInfo;
            return this;
        }

        /**
         * <p>The remarks of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>This is the remark for test.</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzy6pist7uuna</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The primary series encoding of the instance. For more information about the differences between primary series, see <a href="https://help.aliyun.com/document_detail/444722.html">Product selection</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder seriesCode(String seriesCode) {
            this.putBodyParameter("seriesCode", seriesCode);
            this.seriesCode = seriesCode;
            return this;
        }

        /**
         * <p>The service encoding of the instance. The service encoding for MSMQ for RocketMQ is rmq.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("serviceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>The sub-series encoding of the instance. For more information about the differences between sub-series, see <a href="https://help.aliyun.com/document_detail/444722.html">Product selection</a>.</p>
         * <p>If the primary series is set to ultimate (Platinum Edition), the sub-series can only be set to cluster_ha (Cluster High Availability Edition).</p>
         * <blockquote>
         * <p>Notice: After the instance is created, the sub-series cannot be changed.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster_ha</p>
         */
        public Builder subSeriesCode(String subSeriesCode) {
            this.putBodyParameter("subSeriesCode", subSeriesCode);
            this.subSeriesCode = subSeriesCode;
            return this;
        }

        /**
         * <p>The list of resource tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. The client generates the value of this parameter, which must be unique among different requests. The token can be up to 64 ASCII characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>c2c5d1274a8d4317a13bc5b0d4******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class AclInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultVpcAuthFree")
        private Boolean defaultVpcAuthFree;

        private AclInfo(Builder builder) {
            this.defaultVpcAuthFree = builder.defaultVpcAuthFree;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclInfo create() {
            return builder().build();
        }

        /**
         * @return defaultVpcAuthFree
         */
        public Boolean getDefaultVpcAuthFree() {
            return this.defaultVpcAuthFree;
        }

        public static final class Builder {
            private Boolean defaultVpcAuthFree; 

            private Builder() {
            } 

            private Builder(AclInfo model) {
                this.defaultVpcAuthFree = model.defaultVpcAuthFree;
            } 

            /**
             * <p>Specifies whether to enable authentication-free access for VPC endpoints when the intelligent identity recognition type is used. Valid values:</p>
             * <ul>
             * <li>true: Enable authentication-free access.</li>
             * <li>false: Disable authentication-free access.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultVpcAuthFree(Boolean defaultVpcAuthFree) {
                this.defaultVpcAuthFree = defaultVpcAuthFree;
                return this;
            }

            public AclInfo build() {
                return new AclInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class InternetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flowOutBandwidth")
        private Integer flowOutBandwidth;

        @com.aliyun.core.annotation.NameInMap("flowOutType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String flowOutType;

        @com.aliyun.core.annotation.NameInMap("internetSpec")
        @com.aliyun.core.annotation.Validation(required = true)
        private String internetSpec;

        @com.aliyun.core.annotation.NameInMap("ipWhitelist")
        @Deprecated
        private java.util.List<String> ipWhitelist;

        private InternetInfo(Builder builder) {
            this.flowOutBandwidth = builder.flowOutBandwidth;
            this.flowOutType = builder.flowOutType;
            this.internetSpec = builder.internetSpec;
            this.ipWhitelist = builder.ipWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternetInfo create() {
            return builder().build();
        }

        /**
         * @return flowOutBandwidth
         */
        public Integer getFlowOutBandwidth() {
            return this.flowOutBandwidth;
        }

        /**
         * @return flowOutType
         */
        public String getFlowOutType() {
            return this.flowOutType;
        }

        /**
         * @return internetSpec
         */
        public String getInternetSpec() {
            return this.internetSpec;
        }

        /**
         * @return ipWhitelist
         */
        public java.util.List<String> getIpWhitelist() {
            return this.ipWhitelist;
        }

        public static final class Builder {
            private Integer flowOutBandwidth; 
            private String flowOutType; 
            private String internetSpec; 
            private java.util.List<String> ipWhitelist; 

            private Builder() {
            } 

            private Builder(InternetInfo model) {
                this.flowOutBandwidth = model.flowOutBandwidth;
                this.flowOutType = model.flowOutType;
                this.internetSpec = model.internetSpec;
                this.ipWhitelist = model.ipWhitelist;
            } 

            /**
             * <p>The Internet bandwidth specification. Unit: Mb/s.</p>
             * <p>This parameter is required only when the Internet billing type is set to fixed bandwidth billing.</p>
             * <p>Valid values: 1 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder flowOutBandwidth(Integer flowOutBandwidth) {
                this.flowOutBandwidth = flowOutBandwidth;
                return this;
            }

            /**
             * <p>The Internet billing type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>uninvolved</p>
             */
            public Builder flowOutType(String flowOutType) {
                this.flowOutType = flowOutType;
                return this;
            }

            /**
             * <p>Specifies whether to enable public network access.</p>
             * <p>By default, instances support VPC access. If you enable public network access, ApsaraMQ for RocketMQ charges fees for public network downstream bandwidth. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427240.html">Public network access fees</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>disable</p>
             */
            public Builder internetSpec(String internetSpec) {
                this.internetSpec = internetSpec;
                return this;
            }

            /**
             * <p>The public network access IP whitelist. Only public endpoints support IP whitelist configuration. VPC endpoints do not support this feature.</p>
             * <ul>
             * <li>If no IP whitelist is configured, all IP address ranges are allowed to access the ApsaraMQ for RocketMQ server over the Internet by default.</li>
             * <li>If an IP whitelist is configured, only the IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ server over the Internet.</li>
             * </ul>
             */
            public Builder ipWhitelist(java.util.List<String> ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            public InternetInfo build() {
                return new InternetInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        private VSwitches(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(VSwitches model) {
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The ID of the vSwitch associated with the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6gwtbn6etadpv*******</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class VpcInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityGroupIds")
        private String securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        @Deprecated
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("vSwitches")
        private java.util.List<VSwitches> vSwitches;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vpcId;

        private VpcInfo(Builder builder) {
            this.securityGroupIds = builder.securityGroupIds;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitches = builder.vSwitches;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcInfo create() {
            return builder().build();
        }

        /**
         * @return securityGroupIds
         */
        public String getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitches
         */
        public java.util.List<VSwitches> getVSwitches() {
            return this.vSwitches;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String securityGroupIds; 
            private String vSwitchId; 
            private java.util.List<VSwitches> vSwitches; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(VpcInfo model) {
                this.securityGroupIds = model.securityGroupIds;
                this.vSwitchId = model.vSwitchId;
                this.vSwitches = model.vSwitches;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp17hpmgz96tvnsdy6so</p>
             */
            public Builder securityGroupIds(String securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The ID of the vSwitch associated with the instance. If multiple vSwitches exist, separate them with vertical bars (|).</p>
             * <blockquote>
             * <p>After an ApsaraMQ for RocketMQ instance is created, the selected vSwitch cannot be changed. To modify the associated vSwitch, release the existing ApsaraMQ for RocketMQ instance and purchase a new one.</p>
             * </blockquote>
             * <p><notice>This field is not recommended. Use the vSwitches field instead.</notice></p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6gwtbn6etadpv*******</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The list of vSwitches.</p>
             * <blockquote>
             * <p>After an ApsaraMQ for RocketMQ instance is created, the selected vSwitch cannot be changed. To modify the associated vSwitch, release the existing ApsaraMQ for RocketMQ instance and purchase a new one.</p>
             * </blockquote>
             * <p><notice>This is a required field. Because the vSwitchId field is no longer recommended, use this field to configure vSwitches.</notice></p>
             */
            public Builder vSwitches(java.util.List<VSwitches> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * <p>The ID of the VPC to associate with the instance.</p>
             * <blockquote>
             * <p>After an ApsaraMQ for RocketMQ instance is created, the selected VPC cannot be changed. To modify the associated VPC, release the existing ApsaraMQ for RocketMQ instance and purchase a new one.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9qt50xhtj9krb******</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcInfo build() {
                return new VpcInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class NetworkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("internetInfo")
        @com.aliyun.core.annotation.Validation(required = true)
        private InternetInfo internetInfo;

        @com.aliyun.core.annotation.NameInMap("vpcInfo")
        @com.aliyun.core.annotation.Validation(required = true)
        private VpcInfo vpcInfo;

        private NetworkInfo(Builder builder) {
            this.internetInfo = builder.internetInfo;
            this.vpcInfo = builder.vpcInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInfo create() {
            return builder().build();
        }

        /**
         * @return internetInfo
         */
        public InternetInfo getInternetInfo() {
            return this.internetInfo;
        }

        /**
         * @return vpcInfo
         */
        public VpcInfo getVpcInfo() {
            return this.vpcInfo;
        }

        public static final class Builder {
            private InternetInfo internetInfo; 
            private VpcInfo vpcInfo; 

            private Builder() {
            } 

            private Builder(NetworkInfo model) {
                this.internetInfo = model.internetInfo;
                this.vpcInfo = model.vpcInfo;
            } 

            /**
             * <p>The Internet configuration information.</p>
             * <p>This parameter is required.</p>
             */
            public Builder internetInfo(InternetInfo internetInfo) {
                this.internetInfo = internetInfo;
                return this;
            }

            /**
             * <p>The VPC configuration information.</p>
             * <p>This parameter is required.</p>
             */
            public Builder vpcInfo(VpcInfo vpcInfo) {
                this.vpcInfo = vpcInfo;
                return this;
            }

            public NetworkInfo build() {
                return new NetworkInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class ProductInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adaptiveElasticity")
        private Boolean adaptiveElasticity;

        @com.aliyun.core.annotation.NameInMap("autoScaling")
        private Boolean autoScaling;

        @com.aliyun.core.annotation.NameInMap("capacityType")
        private String capacityType;

        @com.aliyun.core.annotation.NameInMap("drReplicationMode")
        private String drReplicationMode;

        @com.aliyun.core.annotation.NameInMap("messageRetentionTime")
        private Integer messageRetentionTime;

        @com.aliyun.core.annotation.NameInMap("msgProcessSpec")
        private String msgProcessSpec;

        @com.aliyun.core.annotation.NameInMap("provisionedCapacity")
        private Long provisionedCapacity;

        @com.aliyun.core.annotation.NameInMap("sendReceiveRatio")
        private Float sendReceiveRatio;

        @com.aliyun.core.annotation.NameInMap("storageEncryption")
        private Boolean storageEncryption;

        @com.aliyun.core.annotation.NameInMap("storageSecretKey")
        private String storageSecretKey;

        @com.aliyun.core.annotation.NameInMap("traceOn")
        private Boolean traceOn;

        private ProductInfo(Builder builder) {
            this.adaptiveElasticity = builder.adaptiveElasticity;
            this.autoScaling = builder.autoScaling;
            this.capacityType = builder.capacityType;
            this.drReplicationMode = builder.drReplicationMode;
            this.messageRetentionTime = builder.messageRetentionTime;
            this.msgProcessSpec = builder.msgProcessSpec;
            this.provisionedCapacity = builder.provisionedCapacity;
            this.sendReceiveRatio = builder.sendReceiveRatio;
            this.storageEncryption = builder.storageEncryption;
            this.storageSecretKey = builder.storageSecretKey;
            this.traceOn = builder.traceOn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfo create() {
            return builder().build();
        }

        /**
         * @return adaptiveElasticity
         */
        public Boolean getAdaptiveElasticity() {
            return this.adaptiveElasticity;
        }

        /**
         * @return autoScaling
         */
        public Boolean getAutoScaling() {
            return this.autoScaling;
        }

        /**
         * @return capacityType
         */
        public String getCapacityType() {
            return this.capacityType;
        }

        /**
         * @return drReplicationMode
         */
        public String getDrReplicationMode() {
            return this.drReplicationMode;
        }

        /**
         * @return messageRetentionTime
         */
        public Integer getMessageRetentionTime() {
            return this.messageRetentionTime;
        }

        /**
         * @return msgProcessSpec
         */
        public String getMsgProcessSpec() {
            return this.msgProcessSpec;
        }

        /**
         * @return provisionedCapacity
         */
        public Long getProvisionedCapacity() {
            return this.provisionedCapacity;
        }

        /**
         * @return sendReceiveRatio
         */
        public Float getSendReceiveRatio() {
            return this.sendReceiveRatio;
        }

        /**
         * @return storageEncryption
         */
        public Boolean getStorageEncryption() {
            return this.storageEncryption;
        }

        /**
         * @return storageSecretKey
         */
        public String getStorageSecretKey() {
            return this.storageSecretKey;
        }

        /**
         * @return traceOn
         */
        public Boolean getTraceOn() {
            return this.traceOn;
        }

        public static final class Builder {
            private Boolean adaptiveElasticity; 
            private Boolean autoScaling; 
            private String capacityType; 
            private String drReplicationMode; 
            private Integer messageRetentionTime; 
            private String msgProcessSpec; 
            private Long provisionedCapacity; 
            private Float sendReceiveRatio; 
            private Boolean storageEncryption; 
            private String storageSecretKey; 
            private Boolean traceOn; 

            private Builder() {
            } 

            private Builder(ProductInfo model) {
                this.adaptiveElasticity = model.adaptiveElasticity;
                this.autoScaling = model.autoScaling;
                this.capacityType = model.capacityType;
                this.drReplicationMode = model.drReplicationMode;
                this.messageRetentionTime = model.messageRetentionTime;
                this.msgProcessSpec = model.msgProcessSpec;
                this.provisionedCapacity = model.provisionedCapacity;
                this.sendReceiveRatio = model.sendReceiveRatio;
                this.storageEncryption = model.storageEncryption;
                this.storageSecretKey = model.storageSecretKey;
                this.traceOn = model.traceOn;
            } 

            /**
             * <p>Specifies whether to enable adaptive elasticity. A value of true indicates that adaptive elasticity is enabled. A value of false indicates that adaptive elasticity is shutdown.</p>
             */
            public Builder adaptiveElasticity(Boolean adaptiveElasticity) {
                this.adaptiveElasticity = adaptiveElasticity;
                return this;
            }

            /**
             * <p>Specifies whether to enable burstable elastic capacity beyond the specification.</p>
             * <p>After burstable elastic capacity is enabled, MSMQ for RocketMQ allows the instance to exceed the TPS limit of the base specification within a certain range. The portion that exceeds the base specification incurs additional elastic specification fees. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427237.html">Computing fees</a>.</p>
             * <blockquote>
             * <p>Only instances of certain specifications support burstable elastic capacity. For more information about supported instances, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoScaling(Boolean autoScaling) {
                this.autoScaling = autoScaling;
                return this;
            }

            /**
             * <p>The capacity pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>provisioned</p>
             */
            public Builder capacityType(String capacityType) {
                this.capacityType = capacityType;
                return this;
            }

            /**
             * <p>The cross-region replication pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>async_cross_az</p>
             */
            public Builder drReplicationMode(String drReplicationMode) {
                this.drReplicationMode = drReplicationMode;
                return this;
            }

            /**
             * <p>The message retention period. Unit: hours.</p>
             * <p>For the valid value range, see <a href="https://help.aliyun.com/document_detail/440347.html">Limits</a> &gt; Resource Quotas &gt; Message Retention Period.</p>
             * <p>The log broker in MSMQ for RocketMQ is fully serverless and elastic. Fees are charged based on the actual storage space used. You can control the storage capacity by adjusting the message retention period. For more information, see <a href="https://help.aliyun.com/document_detail/427238.html">Storage fees</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder messageRetentionTime(Integer messageRetentionTime) {
                this.messageRetentionTime = messageRetentionTime;
                return this;
            }

            /**
             * <p>The message sending and receiving computing specification. For more information about the TPS upper limit for message sending and receiving, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq.s2.2xlarge</p>
             */
            public Builder msgProcessSpec(String msgProcessSpec) {
                this.msgProcessSpec = msgProcessSpec;
                return this;
            }

            /**
             * <p>The provisioned capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder provisionedCapacity(Long provisionedCapacity) {
                this.provisionedCapacity = provisionedCapacity;
                return this;
            }

            /**
             * <p>The ratio of message sending TPS to the total message sending and accepting TPS of the instance.</p>
             * <p>For example, if the TPS upper limit for message sending and accepting of the instance is 1000 per second and the message sending ratio is 0.8, the TPS upper limit for message sending is 800 per second and the TPS upper limit for message accepting is 200 per second.</p>
             * <p>Valid values: [0.05, 0.95]. Default value: 0.5.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder sendReceiveRatio(Float sendReceiveRatio) {
                this.sendReceiveRatio = sendReceiveRatio;
                return this;
            }

            /**
             * <p>Indicates whether storage encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder storageEncryption(Boolean storageEncryption) {
                this.storageEncryption = storageEncryption;
                return this;
            }

            /**
             * <p>The key for storage encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx</p>
             */
            public Builder storageSecretKey(String storageSecretKey) {
                this.storageSecretKey = storageSecretKey;
                return this;
            }

            /**
             * <p>Specifies whether to enable the message trace feature.</p>
             * <p>true: Enable the message trace feature.
             * false: Shutdown the message trace feature.
             * This parameter takes effect only for Serverless instances. If the message trace feature is enabled, message trace fees are incurred. For more information about billing, see the Serverless billing description. For pay-as-you-go and subscription instances, this parameter does not take effect. The message trace feature is supported by default regardless of whether this parameter is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder traceOn(Boolean traceOn) {
                this.traceOn = traceOn;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
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
             * <p>The key of the resource tag.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the resource tag.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxValue</p>
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
}
