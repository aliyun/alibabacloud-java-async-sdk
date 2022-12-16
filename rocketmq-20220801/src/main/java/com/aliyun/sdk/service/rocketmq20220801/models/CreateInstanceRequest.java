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
         * 是否自动续费，只有预付费支持
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("autoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * 自动续费周期，只有预付费支持
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putBodyParameter("autoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * 实例名称
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * 网络信息
         */
        public Builder networkInfo(NetworkInfo networkInfo) {
            this.putBodyParameter("networkInfo", networkInfo);
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * 付费类型,
         * <p>
         * 预付费：Subscription
         * 后付费：PayAsYouGo
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * 购买时长，只有预付费支持
         */
        public Builder period(Integer period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * 购买时长单位，只有预付费支持
         * <p>
         * 月：Month
         * 年：Year
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("periodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * 产品信息
         */
        public Builder productInfo(ProductInfo productInfo) {
            this.putBodyParameter("productInfo", productInfo);
            this.productInfo = productInfo;
            return this;
        }

        /**
         * 备注信息
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * 资源组ID
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 系列编码
         */
        public Builder seriesCode(String seriesCode) {
            this.putBodyParameter("seriesCode", seriesCode);
            this.seriesCode = seriesCode;
            return this;
        }

        /**
         * 服务编码
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("serviceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * 子系列编码
         */
        public Builder subSeriesCode(String subSeriesCode) {
            this.putBodyParameter("subSeriesCode", subSeriesCode);
            this.subSeriesCode = subSeriesCode;
            return this;
        }

        /**
         * clientToken.
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
             * 公网带宽规格
             */
            public Builder flowOutBandwidth(Integer flowOutBandwidth) {
                this.flowOutBandwidth = flowOutBandwidth;
                return this;
            }

            /**
             * 公网计费类型
             * <p>
             * 固定带宽计费：payByBandwidth
             */
            public Builder flowOutType(String flowOutType) {
                this.flowOutType = flowOutType;
                return this;
            }

            /**
             * 是否开启公网
             * <p>
             * 开启：enable
             * 关闭：disable
             */
            public Builder internetSpec(String internetSpec) {
                this.internetSpec = internetSpec;
                return this;
            }

            /**
             * 公网IP白名单列表
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
        @NameInMap("vSwitchId")
        @Validation(required = true)
        private String vSwitchId;

        @NameInMap("vpcId")
        @Validation(required = true)
        private String vpcId;

        private VpcInfo(Builder builder) {
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
            private String vSwitchId; 
            private String vpcId; 

            /**
             * 交换机ID
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * 专有网络ID
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
             * 公网信息
             */
            public Builder internetInfo(InternetInfo internetInfo) {
                this.internetInfo = internetInfo;
                return this;
            }

            /**
             * 专有网络信息
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

        @NameInMap("messageRetentionTime")
        private Integer messageRetentionTime;

        @NameInMap("msgProcessSpec")
        @Validation(required = true)
        private String msgProcessSpec;

        @NameInMap("sendReceiveRatio")
        private Float sendReceiveRatio;

        private ProductInfo(Builder builder) {
            this.autoScaling = builder.autoScaling;
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
            private Integer messageRetentionTime; 
            private String msgProcessSpec; 
            private Float sendReceiveRatio; 

            /**
             * 是否开启弹性伸缩
             */
            public Builder autoScaling(Boolean autoScaling) {
                this.autoScaling = autoScaling;
                return this;
            }

            /**
             * 消息保留时长
             */
            public Builder messageRetentionTime(Integer messageRetentionTime) {
                this.messageRetentionTime = messageRetentionTime;
                return this;
            }

            /**
             * 消息收发规格
             */
            public Builder msgProcessSpec(String msgProcessSpec) {
                this.msgProcessSpec = msgProcessSpec;
                return this;
            }

            /**
             * 消息收发比例
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
