// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Body
    @NameInMap("autoRenew")
    private Boolean autoRenew;

    @Body
    @NameInMap("autoRenewPeriod")
    private Integer autoRenewPeriod;

    @Body
    @NameInMap("commodityCode")
    private String commodityCode;

    @Body
    @NameInMap("instanceName")
    private String instanceName;

    @Body
    @NameInMap("networkInfo")
    @Validation(required = true)
    private NetworkInfo networkInfo;

    @Body
    @NameInMap("paymentType")
    @Validation(required = true)
    private String paymentType;

    @Body
    @NameInMap("period")
    private Integer period;

    @Body
    @NameInMap("periodUnit")
    private String periodUnit;

    @Body
    @NameInMap("productInfo")
    private ProductInfo productInfo;

    @Body
    @NameInMap("remark")
    private String remark;

    @Body
    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("seriesCode")
    @Validation(required = true)
    private String seriesCode;

    @Body
    @NameInMap("serviceCode")
    @Validation(required = true)
    private String serviceCode;

    @Body
    @NameInMap("subSeriesCode")
    @Validation(required = true)
    private String subSeriesCode;

    @Query
    @NameInMap("clientToken")
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
            this.clientToken = request.clientToken;
        } 

        /**
         * Specifies whether to enable auto-renewal. This parameter takes effect only when the PaymentType parameter is set to Subscription.
         * <p>
         * 
         * *   true: enable
         * *   false: disable
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("autoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal cycle of the instance. This parameter takes effect only when the autoRenew parameter is set to true. Unit: months.
         * <p>
         * 
         * Valid values:
         * 
         * *   Monthly renewal: 1, 2, 3, 6, and 12
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putBodyParameter("autoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * commodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putBodyParameter("commodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * The name of the instance that you want to create.
         * <p>
         * 
         * If you do not configure this parameter, the instance ID is used as the instance name.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The information about the network.
         */
        public Builder networkInfo(NetworkInfo networkInfo) {
            this.putBodyParameter("networkInfo", networkInfo);
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * The billing method of the instance. ApsaraMQ for RocketMQ supports the subscription and pay-as-you-go billing methods.
         * <p>
         * 
         * Valid values:
         * 
         * *   PayAsYouGo: pay-as-you go. This billing method allows you to use resources before you pay for the resources.
         * *   Subscription: This billing method allows you to use resources after you pay for the resources.
         * 
         * For more information, see [Billing methods](~~427234~~).
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * The subscription duration of the instance. This parameter takes effect only when the PaymentType parameter is set to Subscription.
         * <p>
         * 
         * Valid values:
         * 
         * *   Monthly subscription: 1, 2, 3, 4, 5, and 6
         * *   Yearly subscription: 1, 2, and 3
         */
        public Builder period(Integer period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration.
         * <p>
         * 
         * Valid values:
         * 
         * *   Month
         * *   Year
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("periodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The information about the instance specification.
         */
        public Builder productInfo(ProductInfo productInfo) {
            this.putBodyParameter("productInfo", productInfo);
            this.productInfo = productInfo;
            return this;
        }

        /**
         * The description of the instance.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The primary edition of the instance. For information about the differences between primary edition instances, see [Instance selection](~~444722~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   standard: Standard Edition
         * *   ultimate: Enterprise Platinum Edition
         * *   professional: Professional Edition
         * 
         * > After you create a ApsaraMQ for RocketMQ instance, you can only upgrade the primary edition of the instance. The following editions are sorted in ascending order: Standard Edition, Professional Edition, and Platinum Edition. For example, an instance of Standard Edition can be upgraded to Professional Edition. However, an instance of Professional Edition cannot be downgraded to Standard Edition.
         */
        public Builder seriesCode(String seriesCode) {
            this.putBodyParameter("seriesCode", seriesCode);
            this.seriesCode = seriesCode;
            return this;
        }

        /**
         * The code of the service to which the instance belongs. The service code of ApsaraMQ for RocketMQ is rmq.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("serviceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * The sub-category edition of the instance. For information about the differences between sub-category edition instances, see [Instance selection](~~444722~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   cluster_ha: Cluster High-availability Edition
         * *   single_node: Standalone Edition
         * 
         * If you set the seriesCode parameter to ultimate, you can set this parameter to only cluster_ha.
         * 
         * > After you create a ApsaraMQ for RocketMQ instance, you cannot change the sub-category edition of the instance.
         */
        public Builder subSeriesCode(String subSeriesCode) {
            this.putBodyParameter("subSeriesCode", subSeriesCode);
            this.subSeriesCode = subSeriesCode;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value of this parameter, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
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

    public static class InternetInfo extends TeaModel {
        @NameInMap("flowOutBandwidth")
        private Integer flowOutBandwidth;

        @NameInMap("flowOutType")
        @Validation(required = true)
        private String flowOutType;

        @NameInMap("internetSpec")
        @Validation(required = true)
        private String internetSpec;

        @NameInMap("ipWhitelist")
        private java.util.List < String > ipWhitelist;

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
        public java.util.List < String > getIpWhitelist() {
            return this.ipWhitelist;
        }

        public static final class Builder {
            private Integer flowOutBandwidth; 
            private String flowOutType; 
            private String internetSpec; 
            private java.util.List < String > ipWhitelist; 

            /**
             * The Internet bandwidth. Unit: MB/s.
             * <p>
             * 
             * This parameter is required only when the flowOutType parameter is set to payByBandwidth.
             * 
             * Valid values: 1 to 1000.
             */
            public Builder flowOutBandwidth(Integer flowOutBandwidth) {
                this.flowOutBandwidth = flowOutBandwidth;
                return this;
            }

            /**
             * The metering method for Internet usage.
             * <p>
             * 
             * Valid values:
             * 
             * *   payByBandwidth: pay-by-bandwidth. If the Internet access feature is enabled, specify this value for the parameter.
             * *   uninvolved: N/A. If the Internet access feature is disabled, specify this value for the parameter.
             */
            public Builder flowOutType(String flowOutType) {
                this.flowOutType = flowOutType;
                return this;
            }

            /**
             * Specifies whether to enable the Internet access feature.
             * <p>
             * 
             * Valid values:
             * 
             * *   enable
             * *   disable
             * 
             * By default, ApsaraMQ for RocketMQ instances are accessed in VPCs. If you enable the Internet access feature, you are charged for Internet outbound bandwidth. For more information, see [Internet access fee](~~427240~~).
             */
            public Builder internetSpec(String internetSpec) {
                this.internetSpec = internetSpec;
                return this;
            }

            /**
             * The whitelist that includes the IP addresses that are allowed to access the ApsaraMQ for RocketMQ broker over the Internet. This parameter can be configured only when you use a public endpoint to access the ApsaraMQ for RocketMQ broker.
             * <p>
             * 
             * *   If this parameter is not configured, all IP addresses are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.
             * *   If this parameter is configured, only the IP addresses that are included in the whitelist can access the ApsaraMQ for RocketMQ broker over the Internet.
             */
            public Builder ipWhitelist(java.util.List < String > ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            public InternetInfo build() {
                return new InternetInfo(this);
            } 

        } 

    }
    public static class VpcInfo extends TeaModel {
        @NameInMap("securityGroupIds")
        private String securityGroupIds;

        @NameInMap("vSwitchId")
        @Validation(required = true)
        private String vSwitchId;

        @NameInMap("vpcId")
        @Validation(required = true)
        private String vpcId;

        private VpcInfo(Builder builder) {
            this.securityGroupIds = builder.securityGroupIds;
            this.vSwitchId = builder.vSwitchId;
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
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String securityGroupIds; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * securityGroupIds.
             */
            public Builder securityGroupIds(String securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The ID of the vSwitch with which the instance is associated.
             * <p>
             * 
             * > After you create a ApsaraMQ for RocketMQ instance, you cannot change the vSwitch to which the instance is connected. If you want to change the vSwitch with which a ApsaraMQ for RocketMQ is associated, you must release the instance and purchase a new instance.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the VPC with which the instance that you want to create is associated.
             * <p>
             * 
             * > After you create a ApsaraMQ for RocketMQ instance, you cannot change the VPC in which the instance is created. If you want to change the VPC with which a ApsaraMQ for RocketMQ is associated, you must release the instance and purchase a new instance.
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
    public static class NetworkInfo extends TeaModel {
        @NameInMap("internetInfo")
        @Validation(required = true)
        private InternetInfo internetInfo;

        @NameInMap("vpcInfo")
        @Validation(required = true)
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

            /**
             * The Internet-related configurations.
             */
            public Builder internetInfo(InternetInfo internetInfo) {
                this.internetInfo = internetInfo;
                return this;
            }

            /**
             * The virtual private cloud (VPC)-related configurations.
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
    public static class ProductInfo extends TeaModel {
        @NameInMap("autoScaling")
        private Boolean autoScaling;

        @NameInMap("chargeType")
        private String chargeType;

        @NameInMap("intranetSpec")
        private String intranetSpec;

        @NameInMap("messageRetentionTime")
        private Integer messageRetentionTime;

        @NameInMap("msgProcessSpec")
        @Validation(required = true)
        private String msgProcessSpec;

        @NameInMap("sendReceiveRatio")
        private Float sendReceiveRatio;

        private ProductInfo(Builder builder) {
            this.autoScaling = builder.autoScaling;
            this.chargeType = builder.chargeType;
            this.intranetSpec = builder.intranetSpec;
            this.messageRetentionTime = builder.messageRetentionTime;
            this.msgProcessSpec = builder.msgProcessSpec;
            this.sendReceiveRatio = builder.sendReceiveRatio;
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
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return intranetSpec
         */
        public String getIntranetSpec() {
            return this.intranetSpec;
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

        public static final class Builder {
            private Boolean autoScaling; 
            private String chargeType; 
            private String intranetSpec; 
            private Integer messageRetentionTime; 
            private String msgProcessSpec; 
            private Float sendReceiveRatio; 

            /**
             * Specifies whether to enable the elastic TPS feature for the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   true: enable
             * *   false: disable
             * 
             * After you enable the elastic TPS feature for a ApsaraMQ for RocketMQ instance, you can use a specific amount of TPS that exceeds the specification limit. You are charged for the elastic TPS feature. For more information, see [Computing fee](~~427237~~).
             * 
             * > The elastic TPS feature is supported by only specific instance editions. For more information, see [Instance specifications](~~444715~~).
             */
            public Builder autoScaling(Boolean autoScaling) {
                this.autoScaling = autoScaling;
                return this;
            }

            /**
             * chargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * intranetSpec.
             */
            public Builder intranetSpec(String intranetSpec) {
                this.intranetSpec = intranetSpec;
                return this;
            }

            /**
             * The retention period of messages. Unit: hours.
             * <p>
             * 
             * For information about the valid values of this parameter, see the "Limits on resource quotas" section in [Usage limits](~~440347~~).
             * 
             * The storage of messages in ApsaraMQ for RocketMQ is serverless and scalable. You are charged for message storage based on your actual usage. You can change the retention period of messages to adjust storage capacity. For more information, see [Storage fee](~~427238~~).
             */
            public Builder messageRetentionTime(Integer messageRetentionTime) {
                this.messageRetentionTime = messageRetentionTime;
                return this;
            }

            /**
             * The computing specification that is used to send and receive messages. For information about the upper limit of TPS, see [Instance specifications](~~444715~~).
             */
            public Builder msgProcessSpec(String msgProcessSpec) {
                this.msgProcessSpec = msgProcessSpec;
                return this;
            }

            /**
             * The ratio between sent messages and received messages in the instance.
             * <p>
             * 
             * Value values: 0.2 to 0.5.
             */
            public Builder sendReceiveRatio(Float sendReceiveRatio) {
                this.sendReceiveRatio = sendReceiveRatio;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
}
