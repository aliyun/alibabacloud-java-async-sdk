// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("dynamicCode")
    private String dynamicCode;

    @NameInMap("dynamicMessage")
    private String dynamicMessage;

    @NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("message")
    private String message;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 返回结果
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 动态错误码
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * 动态错误信息
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * HTTP状态码
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    public static class AccountInfo extends TeaModel {
        @NameInMap("username")
        private String username;

        private AccountInfo(Builder builder) {
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountInfo create() {
            return builder().build();
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String username; 

            /**
             * 用户名
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public AccountInfo build() {
                return new AccountInfo(this);
            } 

        } 

    }
    public static class AclInfo extends TeaModel {
        @NameInMap("aclType")
        private String aclType;

        private AclInfo(Builder builder) {
            this.aclType = builder.aclType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclInfo create() {
            return builder().build();
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        public static final class Builder {
            private String aclType; 

            /**
             * 访问控制类型
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            public AclInfo build() {
                return new AclInfo(this);
            } 

        } 

    }
    public static class ExtConfig extends TeaModel {
        @NameInMap("aclType")
        private String aclType;

        @NameInMap("autoScaling")
        private Boolean autoScaling;

        @NameInMap("flowOutBandwidth")
        private Integer flowOutBandwidth;

        @NameInMap("flowOutType")
        private String flowOutType;

        @NameInMap("internetSpec")
        private String internetSpec;

        @NameInMap("messageRetentionTime")
        private Integer messageRetentionTime;

        @NameInMap("msgProcessSpec")
        private String msgProcessSpec;

        @NameInMap("sendReceiveRatio")
        private Float sendReceiveRatio;

        @NameInMap("supportAutoScaling")
        private Boolean supportAutoScaling;

        private ExtConfig(Builder builder) {
            this.aclType = builder.aclType;
            this.autoScaling = builder.autoScaling;
            this.flowOutBandwidth = builder.flowOutBandwidth;
            this.flowOutType = builder.flowOutType;
            this.internetSpec = builder.internetSpec;
            this.messageRetentionTime = builder.messageRetentionTime;
            this.msgProcessSpec = builder.msgProcessSpec;
            this.sendReceiveRatio = builder.sendReceiveRatio;
            this.supportAutoScaling = builder.supportAutoScaling;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtConfig create() {
            return builder().build();
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return autoScaling
         */
        public Boolean getAutoScaling() {
            return this.autoScaling;
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
         * @return supportAutoScaling
         */
        public Boolean getSupportAutoScaling() {
            return this.supportAutoScaling;
        }

        public static final class Builder {
            private String aclType; 
            private Boolean autoScaling; 
            private Integer flowOutBandwidth; 
            private String flowOutType; 
            private String internetSpec; 
            private Integer messageRetentionTime; 
            private String msgProcessSpec; 
            private Float sendReceiveRatio; 
            private Boolean supportAutoScaling; 

            /**
             * 鉴权类型
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * 自适应弹性伸缩
             */
            public Builder autoScaling(Boolean autoScaling) {
                this.autoScaling = autoScaling;
                return this;
            }

            /**
             * 公网带宽规格
             */
            public Builder flowOutBandwidth(Integer flowOutBandwidth) {
                this.flowOutBandwidth = flowOutBandwidth;
                return this;
            }

            /**
             * 公网计费类型
             */
            public Builder flowOutType(String flowOutType) {
                this.flowOutType = flowOutType;
                return this;
            }

            /**
             * 是否开通公网
             */
            public Builder internetSpec(String internetSpec) {
                this.internetSpec = internetSpec;
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
             * 消息收发计算规格
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

            /**
             * 是否支持自适应弹性伸缩
             */
            public Builder supportAutoScaling(Boolean supportAutoScaling) {
                this.supportAutoScaling = supportAutoScaling;
                return this;
            }

            public ExtConfig build() {
                return new ExtConfig(this);
            } 

        } 

    }
    public static class InstanceQuotas extends TeaModel {
        @NameInMap("freeCount")
        private Double freeCount;

        @NameInMap("quotaName")
        private String quotaName;

        @NameInMap("totalCount")
        private Double totalCount;

        @NameInMap("usedCount")
        private Double usedCount;

        private InstanceQuotas(Builder builder) {
            this.freeCount = builder.freeCount;
            this.quotaName = builder.quotaName;
            this.totalCount = builder.totalCount;
            this.usedCount = builder.usedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceQuotas create() {
            return builder().build();
        }

        /**
         * @return freeCount
         */
        public Double getFreeCount() {
            return this.freeCount;
        }

        /**
         * @return quotaName
         */
        public String getQuotaName() {
            return this.quotaName;
        }

        /**
         * @return totalCount
         */
        public Double getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return usedCount
         */
        public Double getUsedCount() {
            return this.usedCount;
        }

        public static final class Builder {
            private Double freeCount; 
            private String quotaName; 
            private Double totalCount; 
            private Double usedCount; 

            /**
             * 免费
             */
            public Builder freeCount(Double freeCount) {
                this.freeCount = freeCount;
                return this;
            }

            /**
             * 配额名称
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * 总配额
             */
            public Builder totalCount(Double totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * 已使用量
             */
            public Builder usedCount(Double usedCount) {
                this.usedCount = usedCount;
                return this;
            }

            public InstanceQuotas build() {
                return new InstanceQuotas(this);
            } 

        } 

    }
    public static class Endpoints extends TeaModel {
        @NameInMap("endpointType")
        private String endpointType;

        @NameInMap("endpointUrl")
        private String endpointUrl;

        @NameInMap("ipWhitelist")
        private String ipWhitelist;

        private Endpoints(Builder builder) {
            this.endpointType = builder.endpointType;
            this.endpointUrl = builder.endpointUrl;
            this.ipWhitelist = builder.ipWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return endpointUrl
         */
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        /**
         * @return ipWhitelist
         */
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

        public static final class Builder {
            private String endpointType; 
            private String endpointUrl; 
            private String ipWhitelist; 

            /**
             * 接入点类型
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * 接入点地址
             */
            public Builder endpointUrl(String endpointUrl) {
                this.endpointUrl = endpointUrl;
                return this;
            }

            /**
             * 公网IP白名单，建议使用公网信息中的白名单字段
             */
            public Builder ipWhitelist(String ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    public static class InternetInfo extends TeaModel {
        @NameInMap("flowOutBandwidth")
        private Integer flowOutBandwidth;

        @NameInMap("flowOutType")
        private String flowOutType;

        @NameInMap("internetSpec")
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
             */
            public Builder flowOutType(String flowOutType) {
                this.flowOutType = flowOutType;
                return this;
            }

            /**
             * 是否开通公网
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
        private String vSwitchId;

        @NameInMap("vpcId")
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
        @NameInMap("endpoints")
        private java.util.List < Endpoints> endpoints;

        @NameInMap("internetInfo")
        private InternetInfo internetInfo;

        @NameInMap("vpcInfo")
        private VpcInfo vpcInfo;

        private NetworkInfo(Builder builder) {
            this.endpoints = builder.endpoints;
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
         * @return endpoints
         */
        public java.util.List < Endpoints> getEndpoints() {
            return this.endpoints;
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
            private java.util.List < Endpoints> endpoints; 
            private InternetInfo internetInfo; 
            private VpcInfo vpcInfo; 

            /**
             * 接入点列表
             */
            public Builder endpoints(java.util.List < Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

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
        private String msgProcessSpec;

        @NameInMap("sendReceiveRatio")
        private Float sendReceiveRatio;

        @NameInMap("supportAutoScaling")
        private Boolean supportAutoScaling;

        private ProductInfo(Builder builder) {
            this.autoScaling = builder.autoScaling;
            this.messageRetentionTime = builder.messageRetentionTime;
            this.msgProcessSpec = builder.msgProcessSpec;
            this.sendReceiveRatio = builder.sendReceiveRatio;
            this.supportAutoScaling = builder.supportAutoScaling;
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
         * @return supportAutoScaling
         */
        public Boolean getSupportAutoScaling() {
            return this.supportAutoScaling;
        }

        public static final class Builder {
            private Boolean autoScaling; 
            private Integer messageRetentionTime; 
            private String msgProcessSpec; 
            private Float sendReceiveRatio; 
            private Boolean supportAutoScaling; 

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

            /**
             * 是否支持弹性伸缩
             */
            public Builder supportAutoScaling(Boolean supportAutoScaling) {
                this.supportAutoScaling = supportAutoScaling;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("accountInfo")
        private AccountInfo accountInfo;

        @NameInMap("aclInfo")
        private AclInfo aclInfo;

        @NameInMap("bid")
        private String bid;

        @NameInMap("commodityCode")
        private String commodityCode;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("expireTime")
        private String expireTime;

        @NameInMap("extConfig")
        private ExtConfig extConfig;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("instanceName")
        private String instanceName;

        @NameInMap("instanceQuotas")
        private java.util.List < InstanceQuotas> instanceQuotas;

        @NameInMap("networkInfo")
        private NetworkInfo networkInfo;

        @NameInMap("paymentType")
        private String paymentType;

        @NameInMap("productInfo")
        private ProductInfo productInfo;

        @NameInMap("regionId")
        private String regionId;

        @NameInMap("releaseTime")
        private String releaseTime;

        @NameInMap("remark")
        private String remark;

        @NameInMap("resourceGroupId")
        private String resourceGroupId;

        @NameInMap("seriesCode")
        private String seriesCode;

        @NameInMap("serviceCode")
        private String serviceCode;

        @NameInMap("startTime")
        private String startTime;

        @NameInMap("status")
        private String status;

        @NameInMap("subSeriesCode")
        private String subSeriesCode;

        @NameInMap("updateTime")
        private String updateTime;

        @NameInMap("userId")
        private String userId;

        private Data(Builder builder) {
            this.accountInfo = builder.accountInfo;
            this.aclInfo = builder.aclInfo;
            this.bid = builder.bid;
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.extConfig = builder.extConfig;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceQuotas = builder.instanceQuotas;
            this.networkInfo = builder.networkInfo;
            this.paymentType = builder.paymentType;
            this.productInfo = builder.productInfo;
            this.regionId = builder.regionId;
            this.releaseTime = builder.releaseTime;
            this.remark = builder.remark;
            this.resourceGroupId = builder.resourceGroupId;
            this.seriesCode = builder.seriesCode;
            this.serviceCode = builder.serviceCode;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.subSeriesCode = builder.subSeriesCode;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountInfo
         */
        public AccountInfo getAccountInfo() {
            return this.accountInfo;
        }

        /**
         * @return aclInfo
         */
        public AclInfo getAclInfo() {
            return this.aclInfo;
        }

        /**
         * @return bid
         */
        public String getBid() {
            return this.bid;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return extConfig
         */
        public ExtConfig getExtConfig() {
            return this.extConfig;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceQuotas
         */
        public java.util.List < InstanceQuotas> getInstanceQuotas() {
            return this.instanceQuotas;
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
         * @return productInfo
         */
        public ProductInfo getProductInfo() {
            return this.productInfo;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subSeriesCode
         */
        public String getSubSeriesCode() {
            return this.subSeriesCode;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private AccountInfo accountInfo; 
            private AclInfo aclInfo; 
            private String bid; 
            private String commodityCode; 
            private String createTime; 
            private String expireTime; 
            private ExtConfig extConfig; 
            private String instanceId; 
            private String instanceName; 
            private java.util.List < InstanceQuotas> instanceQuotas; 
            private NetworkInfo networkInfo; 
            private String paymentType; 
            private ProductInfo productInfo; 
            private String regionId; 
            private String releaseTime; 
            private String remark; 
            private String resourceGroupId; 
            private String seriesCode; 
            private String serviceCode; 
            private String startTime; 
            private String status; 
            private String subSeriesCode; 
            private String updateTime; 
            private String userId; 

            /**
             * 账号信息
             */
            public Builder accountInfo(AccountInfo accountInfo) {
                this.accountInfo = accountInfo;
                return this;
            }

            /**
             * 访问控制信息
             */
            public Builder aclInfo(AclInfo aclInfo) {
                this.aclInfo = aclInfo;
                return this;
            }

            /**
             * BID
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * 商品编码
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 过期时间
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * 扩展配置，不再推荐使用，建议使用产品信息、网络信息中的字段替换
             */
            public Builder extConfig(ExtConfig extConfig) {
                this.extConfig = extConfig;
                return this;
            }

            /**
             * 实例ID
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 实例名称
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * 容量信息
             */
            public Builder instanceQuotas(java.util.List < InstanceQuotas> instanceQuotas) {
                this.instanceQuotas = instanceQuotas;
                return this;
            }

            /**
             * 网络信息
             */
            public Builder networkInfo(NetworkInfo networkInfo) {
                this.networkInfo = networkInfo;
                return this;
            }

            /**
             * 付费类型
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * 产品信息
             */
            public Builder productInfo(ProductInfo productInfo) {
                this.productInfo = productInfo;
                return this;
            }

            /**
             * 区域ID
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 释放时间
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * 备注
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * 资源组ID
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * 系列编码
             */
            public Builder seriesCode(String seriesCode) {
                this.seriesCode = seriesCode;
                return this;
            }

            /**
             * 服务编码
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * 开服时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 实例状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 子系列编码
             */
            public Builder subSeriesCode(String subSeriesCode) {
                this.subSeriesCode = subSeriesCode;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * 所属人ID
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
