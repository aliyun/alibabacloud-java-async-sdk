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
    @com.aliyun.core.annotation.NameInMap("autoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("commodityCode")
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
         * <p>Specifies whether to enable auto-renewal for the instance. This parameter takes effect only if you set paymentType to Subscription. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
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
         * <p>The auto-renewal cycle of the instance. This parameter takes effect only if you set autoRenew to true. Unit: months.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Monthly renewal: 1, 2, 3, 6, and 12</li>
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
         * <p>The commodity code. Valid values:</p>
         * <ul>
         * <li>ons_rmqpost_public_intl: pay-as-you-go</li>
         * <li>ons_rmqsub_public_intl: subscription</li>
         * <li>ons_rmqsrvlesspost_public_intl: serverless instance
         * serverless instance requires this parameter</li>
         * </ul>
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
         * <p>The name of the instance that you want to create.</p>
         * <p>If you leave this parameter empty, the instance ID is used as the instance name.</p>
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
         * <p>The information about the network.</p>
         * <p>This parameter is required.</p>
         */
        public Builder networkInfo(NetworkInfo networkInfo) {
            this.putBodyParameter("networkInfo", networkInfo);
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * <p>The billing method of the instance. ApsaraMQ for RocketMQ supports the subscription and pay-as-you-go billing methods.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PayAsYouGo: This billing method allows you to use resources before you pay for the resources.</li>
         * <li>Subscription: This billing method allows you to use resources after you pay for the resources.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/427234.html">Billing methods</a>.</p>
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
         * <p>The subscription duration of the instance. This parameter takes effect only if you set paymentType to Subscription.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Monthly subscription: 1, 2, 3, 4, 5, and 6</li>
         * <li>Yearly subscription: 1, 2, and 3</li>
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
         * <p>The unit of the subscription duration.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
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
         * <p>The information about instance specifications.</p>
         */
        public Builder productInfo(ProductInfo productInfo) {
            this.putBodyParameter("productInfo", productInfo);
            this.productInfo = productInfo;
            return this;
        }

        /**
         * <p>The instance description.</p>
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
         * <p>The ID of the resource group to which the instance belongs.</p>
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
         * <p>The primary edition of the instance. For information about the differences among primary edition instances, see <a href="https://help.aliyun.com/document_detail/444722.html">Instance selection</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard: Standard Edition</li>
         * <li>ultimate: Enterprise Platinum Edition</li>
         * <li>professional: Professional Edition</li>
         * </ul>
         * <blockquote>
         * <p> After you create an instance, you can only upgrade the primary edition of the instance. The following editions are sorted in ascending order: Standard Edition, Professional Edition, Enterprise Platinum Edition. For example, you can upgrade an instance from Standard Edition to Professional Edition, but you cannot downgrade an instance from Professional Edition to Standard Edition.</p>
         * </blockquote>
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
         * <p>The code of the service to which the instance belongs. The service code of ApsaraMQ for RocketMQ is rmq.</p>
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
         * <p>The sub-category edition of the instance. For information about the differences among sub-category edition instances, see <a href="https://help.aliyun.com/document_detail/444722.html">Instance selection</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cluster_ha: Cluster High-availability Edition</li>
         * <li>single_node: Standalone Edition</li>
         * <li>serverless: serverless</li>
         * </ul>
         * <p>If you set seriesCode to ultimate, you can set this parameter only to cluster_ha.</p>
         * <blockquote>
         * <p> After you create an instance, you cannot change the sub-category edition of the instance.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>serverless: serverless</li>
         * <li>cluster_ha: Cluster High-availability Edition</li>
         * <li>single_node: Standalone Edition</li>
         * </ul>
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
         * <p>The tags that you want to add to the instance.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value of this parameter, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
             * <p>The Internet bandwidth. Unit: MB/s.</p>
             * <p>This parameter is required only if you set flowOutType to payByBandwidth.</p>
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
             * <p>The metering method of Internet usage.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>payByBandwidth: pay-by-bandwidth. This value is valid only if you enable Internet access.</li>
             * <li>payByTraffic: pay-by-traffic. This value is valid only if you enable Internet access.</li>
             * <li>uninvolved: No metering method is involved. This value is valid only if you disable Internet access.</li>
             * </ul>
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
             * <p>Specifies whether to enable the Internet access feature.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>enable</li>
             * <li>disable</li>
             * </ul>
             * <p>By default, ApsaraMQ for RocketMQ allows you to access instances in VPCs. If you enable Internet access for an instance, you can access the instance over the Internet. After you enable this feature, you are charged for outbound Internet traffic. For more information, see <a href="https://help.aliyun.com/document_detail/427240.html">Internet access fees</a>.</p>
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
             * <p>The whitelist that includes the CIDR blocks that are allowed to access the ApsaraMQ for RocketMQ broker over the Internet. This parameter can be configured only if you use the public endpoint to access the instance.</p>
             * <ul>
             * <li>If you do not configure an IP address whitelist, all CIDR blocks are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</li>
             * <li>If you configure an IP address whitelist, only the CIDR blocks in the whitelist are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</li>
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
             * <p>The ID of the vSwitch with which the instance is associated.</p>
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
             * <p>The ID of the security group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp17hpmgz96tvnsdy6so</p>
             */
            public Builder securityGroupIds(String securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The ID of the vSwitch with which the instance is associated. If you want to specify multiple vSwitches, separate the vSwitches with vertical bars (|).</p>
             * <blockquote>
             * <p> After you create an ApsaraMQ for RocketMQ instance, you cannot change the vSwitch with which the instance is associated. If you want to change the vSwitch with which the instance is associated, you must release the instance and purchase a new instance.</p>
             * </blockquote>
             * <blockquote>
             * <p> We recommend that you configure vSwitches instead of this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6gwtbn6etadpv*******</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The vSwitches.</p>
             * <blockquote>
             * <p> After you create an ApsaraMQ for RocketMQ instance, you cannot change the vSwitch with which the instance is associated. If you want to change the vSwitch with which the instance is associated, you must release the instance and purchase a new instance.</p>
             * </blockquote>
             * <blockquote>
             * <p> This parameter is required. We recommend that you configure this parameter instead of vSwitchId.</p>
             * </blockquote>
             */
            public Builder vSwitches(java.util.List<VSwitches> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * <p>The ID of the VPC with which the instance to be created is associated.</p>
             * <blockquote>
             * <p> After you create an ApsaraMQ for RocketMQ instance, you cannot change the VPC with which the instance is associated. If you want to change the VPC with which the instance is associated, you must release the instance and create a new instance.</p>
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
             * <p>The Internet-related configurations.</p>
             * <p>This parameter is required.</p>
             */
            public Builder internetInfo(InternetInfo internetInfo) {
                this.internetInfo = internetInfo;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC)-related configurations.</p>
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
        @com.aliyun.core.annotation.NameInMap("autoScaling")
        private Boolean autoScaling;

        @com.aliyun.core.annotation.NameInMap("messageRetentionTime")
        private Integer messageRetentionTime;

        @com.aliyun.core.annotation.NameInMap("msgProcessSpec")
        @com.aliyun.core.annotation.Validation(required = true)
        private String msgProcessSpec;

        @com.aliyun.core.annotation.NameInMap("sendReceiveRatio")
        private Float sendReceiveRatio;

        @com.aliyun.core.annotation.NameInMap("storageEncryption")
        private Boolean storageEncryption;

        @com.aliyun.core.annotation.NameInMap("storageSecretKey")
        private String storageSecretKey;

        private ProductInfo(Builder builder) {
            this.autoScaling = builder.autoScaling;
            this.messageRetentionTime = builder.messageRetentionTime;
            this.msgProcessSpec = builder.msgProcessSpec;
            this.sendReceiveRatio = builder.sendReceiveRatio;
            this.storageEncryption = builder.storageEncryption;
            this.storageSecretKey = builder.storageSecretKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfo create() {
            return builder().build();
        }

        /**
         * @return autoScaling
         */
        public Boolean getAutoScaling() {
            return this.autoScaling;
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

        public static final class Builder {
            private Boolean autoScaling; 
            private Integer messageRetentionTime; 
            private String msgProcessSpec; 
            private Float sendReceiveRatio; 
            private Boolean storageEncryption; 
            private String storageSecretKey; 

            private Builder() {
            } 

            private Builder(ProductInfo model) {
                this.autoScaling = model.autoScaling;
                this.messageRetentionTime = model.messageRetentionTime;
                this.msgProcessSpec = model.msgProcessSpec;
                this.sendReceiveRatio = model.sendReceiveRatio;
                this.storageEncryption = model.storageEncryption;
                this.storageSecretKey = model.storageSecretKey;
            } 

            /**
             * <p>Specifies whether to enable the elastic TPS feature for the instance.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>After you enable the elastic TPS feature for an ApsaraMQ for RocketMQ instance, you can use a specific amount of TPS that exceeds the specification limit. You are charged for the elastic TPS feature. For more information, see <a href="https://help.aliyun.com/document_detail/427237.html">Computing fees</a>.</p>
             * <blockquote>
             * <p> The elastic TPS feature is supported only by instances of specific editions. For more information, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance editions</a>.</p>
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
             * <p>The retention period of messages. Unit: hours.</p>
             * <p>For information about the valid values of this parameter, see the &quot;Limits on resource quotas&quot; section of the <a href="https://help.aliyun.com/document_detail/440347.html">Limits</a> topic.</p>
             * <p>ApsaraMQ for RocketMQ supports serverless scaling of message storage. You are charged storage fees based on your actual storage usage. You can change the retention period of messages to manage storage capacity. For more information, see <a href="https://help.aliyun.com/document_detail/427238.html">Storage fees</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder messageRetentionTime(Integer messageRetentionTime) {
                this.messageRetentionTime = messageRetentionTime;
                return this;
            }

            /**
             * <p>The computing specification that specifies the messaging transactions per second (TPS) of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance editions</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq.s2.2xlarge</p>
             */
            public Builder msgProcessSpec(String msgProcessSpec) {
                this.msgProcessSpec = msgProcessSpec;
                return this;
            }

            /**
             * <p>The ratio of the message sending TPS to the messaging TPS of the instance.</p>
             * <p>For example, if the maximum messaging TPS of an instance is 1,000 and the ratio of the message sending TPS to the messaging TPS of the instance is 0.8, the maximum message sending TPS of the instance is 800 and the maximum message receiving TPS is 200.</p>
             * <p>Valid values: 0 to 1. Default value: 0.5.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder sendReceiveRatio(Float sendReceiveRatio) {
                this.sendReceiveRatio = sendReceiveRatio;
                return this;
            }

            /**
             * <p>Specifies whether to enable the encryption at rest feature.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder storageEncryption(Boolean storageEncryption) {
                this.storageEncryption = storageEncryption;
                return this;
            }

            /**
             * <p>The key for encryption at rest.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder storageSecretKey(String storageSecretKey) {
                this.storageSecretKey = storageSecretKey;
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
             * <p>The <code>key</code> of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The <code>value</code> of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>bbb</p>
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
