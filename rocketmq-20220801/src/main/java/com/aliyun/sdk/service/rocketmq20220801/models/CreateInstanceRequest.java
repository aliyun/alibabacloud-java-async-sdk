// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Specifies whether to enable auto-renewal for the instance. This parameter takes effect only if you set PaymentType to Subscription.
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
         * The auto-renewal cycle of the instance. This parameter takes effect only if you set autoRenew to true. Unit: months.
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
         * The commodity code.
         * <p>
         * 
         * *   ons_rmqpost_public_intl: pay-as-you-go
         * *   ons_rmqsub_public_intl: subscription
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
         * The network configurations.
         */
        public Builder networkInfo(NetworkInfo networkInfo) {
            this.putBodyParameter("networkInfo", networkInfo);
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * The billing method of the instance. ApsaraMQ for RocketMQ supports the subscription and pay-as-you-go billing methods.
         * <p>
         * 
         * Valid values:
         * 
         * *   PayAsYouGo: This billing method allows you to use resources before you pay for the resources.
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
         * The subscription duration of the instance. This parameter takes effect only if you set PaymentType to Subscription.
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
         * The information about the instance specifications.
         */
        public Builder productInfo(ProductInfo productInfo) {
            this.putBodyParameter("productInfo", productInfo);
            this.productInfo = productInfo;
            return this;
        }

        /**
         * The instance description.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The resource group ID.
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
         * >  After an instance is created, you can only upgrade the primary edition of the instance. The following editions are sorted in ascending order: Standard Edition, Professional Edition, Enterprise Platinum Edition. For example, you can upgrade an instance of Standard Edition to Professional Edition, but cannot downgrade an instance of Professional Edition to Standard Edition.
         */
        public Builder seriesCode(String seriesCode) {
            this.putBodyParameter("seriesCode", seriesCode);
            this.seriesCode = seriesCode;
            return this;
        }

        /**
         * The code of the service to which the instance belongs. The service code of ApsaraMQ for RocketMQ is rmq.
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
         * *   cluster_ha: High-availability Cluster Edition
         * *   single_node: Standalone Edition
         * *   serverless: Serverless Edition
         * 
         * If you set seriesCode to ultimate, you can set this parameter to only cluster_ha.
         * 
         * >  After an instance is created, you cannot change the sub-category edition of the instance.
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
        @com.aliyun.core.annotation.NameInMap("flowOutBandwidth")
        private Integer flowOutBandwidth;

        @com.aliyun.core.annotation.NameInMap("flowOutType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String flowOutType;

        @com.aliyun.core.annotation.NameInMap("internetSpec")
        @com.aliyun.core.annotation.Validation(required = true)
        private String internetSpec;

        @com.aliyun.core.annotation.NameInMap("ipWhitelist")
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
             * This parameter is required only if you set flowOutType to payByBandwidth.
             * 
             * Valid values: 1 to 1000.
             */
            public Builder flowOutBandwidth(Integer flowOutBandwidth) {
                this.flowOutBandwidth = flowOutBandwidth;
                return this;
            }

            /**
             * The billing method of Internet usage.
             * <p>
             * 
             * Valid values:
             * 
             * *   payByBandwidth: pay-by-bandwidth. If Internet access is enabled for an instance, specify this value for the parameter.
             * *   payByTraffic: pay-by-traffic. If Internet access is enabled for an instance, specify this value for the parameter.
             * *   uninvolved: No billing method is involved. If Internet access is disabled for an instance, specify this value for the parameter.
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
             * By default, ApsaraMQ for RocketMQ allows you to access instances in VPCs. If you enable Internet access for an instance, you can access the instance over the Internet. After you enable this feature, you are charged for outbound Internet traffic. For more information, see [Internet access fee](~~427240~~).
             */
            public Builder internetSpec(String internetSpec) {
                this.internetSpec = internetSpec;
                return this;
            }

            /**
             * The whitelist that includes the IP addresses that are allowed to access the ApsaraMQ for RocketMQ broker over the Internet. This parameter can be configured only if you use a public endpoint to access the instance.
             * <p>
             * 
             * *   If you do not configure an IP address whitelist, all CIDR blocks are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.
             * *   If configure an IP address whitlist, only the IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.
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
        @com.aliyun.core.annotation.NameInMap("securityGroupIds")
        private String securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * The ID of the security group to which the instance belongs.
             */
            public Builder securityGroupIds(String securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The ID of the vSwitch with which you want to associate the instance, If there are multiple vSwitchs, please concatenate them using the "|" character.
             * <p>
             * 
             * >  After an ApsaraMQ for RocketMQ instance is created, you cannot change the vSwitch with which the instance is associated. If you want to change the vSwitch with which the instance is associated, you must release the instance and purchase a new instance.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the VPC in which you want to deploy the instance.
             * <p>
             * 
             * >  After an ApsaraMQ for RocketMQ instance is created, you cannot change the VPC in which the instance is deployed. If you want to change the VPC in which the instance is deployed, you must release the instance and create a new instance.
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
        @com.aliyun.core.annotation.NameInMap("autoScaling")
        private Boolean autoScaling;

        @com.aliyun.core.annotation.NameInMap("chargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("intranetSpec")
        private String intranetSpec;

        @com.aliyun.core.annotation.NameInMap("messageRetentionTime")
        private Integer messageRetentionTime;

        @com.aliyun.core.annotation.NameInMap("msgProcessSpec")
        @com.aliyun.core.annotation.Validation(required = true)
        private String msgProcessSpec;

        @com.aliyun.core.annotation.NameInMap("sendReceiveRatio")
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
             * After you enable the elastic TPS feature for an ApsaraMQ for RocketMQ instance, you can use a specific number of TPS that exceeds the specification limit. You are charged for using the elastic TPS feature. For more information, see [Computing fees](~~427237~~).
             * 
             * >  The elastic TPS feature is supported only by instances of specific editions. For more information, see [Instance editions](~~444715~~).
             */
            public Builder autoScaling(Boolean autoScaling) {
                this.autoScaling = autoScaling;
                return this;
            }

            /**
             * The billing method.
             * <p>
             * 
             * Valid values:
             * 
             * *   provisioned
             * *   ondemand
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * This parameter is no longer used. You do not need to configure this parameter.
             */
            public Builder intranetSpec(String intranetSpec) {
                this.intranetSpec = intranetSpec;
                return this;
            }

            /**
             * The retention period of messages. Unit: hours.
             * <p>
             * 
             * For information about the valid values of this parameter, see the "Limits on resource quotas" section of the [Limits](~~440347~~) topic.
             * 
             * ApsaraMQ for RocketMQ supports serverless scaling of message storage. You are charged storage fees based on your actual storage usage. You can change the retention period of messages to manage storage capacity. For more information, see [Storage fees](~~427238~~).
             */
            public Builder messageRetentionTime(Integer messageRetentionTime) {
                this.messageRetentionTime = messageRetentionTime;
                return this;
            }

            /**
             * The computing specification that specifies the messaging transactions per second (TPS) of the instance. For information about computing specification limits, see [Instance specifications](~~444715~~).
             */
            public Builder msgProcessSpec(String msgProcessSpec) {
                this.msgProcessSpec = msgProcessSpec;
                return this;
            }

            /**
             * The proportion of message sending TPS to the messaging TPS on the instance.
             * <p>
             * 
             * For example, you create an instance whose peak messaging TPS is specified as 1,000 and the proportion of message sending TPS is specified as 0.8. In this case, the peak message sending TPS is 800 and the peak message receiving TPS is 200 on the instance.
             * 
             * Valid values: 0 to 1. Default value: 0.5.
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
