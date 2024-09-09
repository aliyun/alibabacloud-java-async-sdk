// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
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
         * The error code returned if the call failed.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The dynamic error code.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic error message.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful.
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
        @com.aliyun.core.annotation.NameInMap("username")
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
             * The username of the instance. If you access a ApsaraMQ for RocketMQ instance over the Internet, you must configure the username and password of the instance in the SDK code for authentication.
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
        @com.aliyun.core.annotation.NameInMap("aclType")
        @Deprecated
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("aclTypes")
        private java.util.List < String > aclTypes;

        @com.aliyun.core.annotation.NameInMap("defaultVpcAuthFree")
        private Boolean defaultVpcAuthFree;

        private AclInfo(Builder builder) {
            this.aclType = builder.aclType;
            this.aclTypes = builder.aclTypes;
            this.defaultVpcAuthFree = builder.defaultVpcAuthFree;
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

        /**
         * @return aclTypes
         */
        public java.util.List < String > getAclTypes() {
            return this.aclTypes;
        }

        /**
         * @return defaultVpcAuthFree
         */
        public Boolean getDefaultVpcAuthFree() {
            return this.defaultVpcAuthFree;
        }

        public static final class Builder {
            private String aclType; 
            private java.util.List < String > aclTypes; 
            private Boolean defaultVpcAuthFree; 

            /**
             * The authentication type of the instance. This parameter is no longer in use. We recommend that you configure aclTypes.
             * <p>
             * 
             * Valid values:
             * 
             * - default: intelligent identity authentication
             * 
             * - apache_acl:access control list (ACL) identity authentication**
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * The authentication types of the instance.
             */
            public Builder aclTypes(java.util.List < String > aclTypes) {
                this.aclTypes = aclTypes;
                return this;
            }

            /**
             * Indicates whether the authentication-free in VPCs feature is enabled.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
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
    public static class ExtConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aclType")
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("autoScaling")
        private Boolean autoScaling;

        @com.aliyun.core.annotation.NameInMap("flowOutBandwidth")
        private Integer flowOutBandwidth;

        @com.aliyun.core.annotation.NameInMap("flowOutType")
        private String flowOutType;

        @com.aliyun.core.annotation.NameInMap("internetSpec")
        private String internetSpec;

        @com.aliyun.core.annotation.NameInMap("messageRetentionTime")
        private Integer messageRetentionTime;

        @com.aliyun.core.annotation.NameInMap("msgProcessSpec")
        private String msgProcessSpec;

        @com.aliyun.core.annotation.NameInMap("sendReceiveRatio")
        private Float sendReceiveRatio;

        @com.aliyun.core.annotation.NameInMap("supportAutoScaling")
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
             * The authentication type of the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   default: intelligent authentication
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * Specifies whether to enable the elastic TPS feature for the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   true: enable
             * *   false: disable
             * 
             * This parameter is valid only when the supportAutoScaling parameter is set to enable.
             */
            public Builder autoScaling(Boolean autoScaling) {
                this.autoScaling = autoScaling;
                return this;
            }

            /**
             * The Internet bandwidth. Unit: MB/s.
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
             * *   PayByTraffic: pay-by-traffic
             * *   paybybandwidth: pay-by-bandwidth
             * *   uninvolved: N/A
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
             * By default, ApsaraMQ for RocketMQ instances are accessed in virtual private clouds (VPCs). If you enable the Internet access feature, you are charged for Internet outbound bandwidth. For more information, see [Internet access fee](~~427240~~).
             */
            public Builder internetSpec(String internetSpec) {
                this.internetSpec = internetSpec;
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
             */
            public Builder sendReceiveRatio(Float sendReceiveRatio) {
                this.sendReceiveRatio = sendReceiveRatio;
                return this;
            }

            /**
             * Specifies whether the elastic TPS feature is supported by the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   true: enable
             * *   false: disable
             * 
             * After you enable the elastic TPS feature for a ApsaraMQ for RocketMQ instance, you can use a specific amount of TPS that exceeds the specification limit. You are charged for the elastic TPS feature. For more information, see [Computing fee](~~427237~~).
             * 
             * > The elastic TPS feature is supported only by specific instance editions. For more information, see [Instance specifications](~~444715~~).
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
        @com.aliyun.core.annotation.NameInMap("freeCount")
        private Double freeCount;

        @com.aliyun.core.annotation.NameInMap("quotaName")
        private String quotaName;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Double totalCount;

        @com.aliyun.core.annotation.NameInMap("usedCount")
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
             * The number of topics that are free of charge on the instance.
             */
            public Builder freeCount(Double freeCount) {
                this.freeCount = freeCount;
                return this;
            }

            /**
             * The quota name.
             * <p>
             * 
             * Valid value:
             * 
             * *   TOPIC_COUNT: the number of topics that can be created on the instance
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * The total number of topics on the instance.
             */
            public Builder totalCount(Double totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The number of used topics on the instance.
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
        @com.aliyun.core.annotation.NameInMap("endpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("endpointUrl")
        private String endpointUrl;

        @com.aliyun.core.annotation.NameInMap("ipWhitelist")
        private java.util.List < String > ipWhitelist;

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
        public java.util.List < String > getIpWhitelist() {
            return this.ipWhitelist;
        }

        public static final class Builder {
            private String endpointType; 
            private String endpointUrl; 
            private java.util.List < String > ipWhitelist; 

            /**
             * The type of the endpoint that is used to access the instance.
             * <p>
             * 
             * Valid values:
             * 
             * - TCP_VPC: VPC endpoint
             * - TCP_INTERNET:public endpoint
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The endpoint that is used to access the instance.
             */
            public Builder endpointUrl(String endpointUrl) {
                this.endpointUrl = endpointUrl;
                return this;
            }

            /**
             * The whitelist that includes the IP addresses that are allowed to access the ApsaraMQ for RocketMQ broker over the Internet. This parameter can be configured only if you use the public endpoint to access the instance.
             * <p>
             * 
             * *   If you do not configure an IP address whitelist, all CIDR blocks are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.
             * *   If you configure an IP address whitelist, only the IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.
             * 
             * We recommend that you configure internetInfo.ipWhitelist instead of this parameter.
             */
            public Builder ipWhitelist(java.util.List < String > ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    public static class InternetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flowOutBandwidth")
        private Integer flowOutBandwidth;

        @com.aliyun.core.annotation.NameInMap("flowOutType")
        private String flowOutType;

        @com.aliyun.core.annotation.NameInMap("internetSpec")
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
             * *   PayByBandwidth: pay-by-bandwidth. If the Internet access feature is enabled, specify this value for the parameter.
             * *   uninvolved: N/A. If the Internet access feature is not enabled, specify this value for the parameter.
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
             * By default, ApsaraMQ for RocketMQ instances are accessed in virtual private clouds (VPCs). If you enable the Internet access feature, you are charged for Internet outbound bandwidth. For more information, see [Internet access fee](~~427240~~).
             */
            public Builder internetSpec(String internetSpec) {
                this.internetSpec = internetSpec;
                return this;
            }

            /**
             * The whitelist that includes the IP addresses that are allowed to access the ApsaraMQ for RocketMQ broker.
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
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private VSwitches(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
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
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
    public static class VpcInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityGroupIds")
        private String securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        @Deprecated
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("vSwitches")
        private java.util.List < VSwitches> vSwitches;

        @com.aliyun.core.annotation.NameInMap("vpcId")
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
        public java.util.List < VSwitches> getVSwitches() {
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
            private java.util.List < VSwitches> vSwitches; 
            private String vpcId; 

            /**
             * The security group ID.
             */
            public Builder securityGroupIds(String securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The ID of the vSwitch with which the instance is associated.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The vSwitches.
             */
            public Builder vSwitches(java.util.List < VSwitches> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * The ID of the VPC with which the instance is associated.
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
        @com.aliyun.core.annotation.NameInMap("endpoints")
        private java.util.List < Endpoints> endpoints;

        @com.aliyun.core.annotation.NameInMap("internetInfo")
        private InternetInfo internetInfo;

        @com.aliyun.core.annotation.NameInMap("vpcInfo")
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
             * The information about endpoints.
             */
            public Builder endpoints(java.util.List < Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * The information about the Internet.
             */
            public Builder internetInfo(InternetInfo internetInfo) {
                this.internetInfo = internetInfo;
                return this;
            }

            /**
             * The virtual private cloud (VPC) information.
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

        @com.aliyun.core.annotation.NameInMap("messageRetentionTime")
        private Integer messageRetentionTime;

        @com.aliyun.core.annotation.NameInMap("msgProcessSpec")
        private String msgProcessSpec;

        @com.aliyun.core.annotation.NameInMap("sendReceiveRatio")
        private Float sendReceiveRatio;

        @com.aliyun.core.annotation.NameInMap("supportAutoScaling")
        private Boolean supportAutoScaling;

        @com.aliyun.core.annotation.NameInMap("traceOn")
        private Boolean traceOn;

        private ProductInfo(Builder builder) {
            this.autoScaling = builder.autoScaling;
            this.messageRetentionTime = builder.messageRetentionTime;
            this.msgProcessSpec = builder.msgProcessSpec;
            this.sendReceiveRatio = builder.sendReceiveRatio;
            this.supportAutoScaling = builder.supportAutoScaling;
            this.traceOn = builder.traceOn;
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

        /**
         * @return traceOn
         */
        public Boolean getTraceOn() {
            return this.traceOn;
        }

        public static final class Builder {
            private Boolean autoScaling; 
            private Integer messageRetentionTime; 
            private String msgProcessSpec; 
            private Float sendReceiveRatio; 
            private Boolean supportAutoScaling; 
            private Boolean traceOn; 

            /**
             * Specifies whether to enable the elastic TPS feature for the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   true: enable
             * *   false: disable
             * 
             * This parameter is valid only when the supportAutoScaling parameter is set to enable.
             */
            public Builder autoScaling(Boolean autoScaling) {
                this.autoScaling = autoScaling;
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
             */
            public Builder sendReceiveRatio(Float sendReceiveRatio) {
                this.sendReceiveRatio = sendReceiveRatio;
                return this;
            }

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
            public Builder supportAutoScaling(Boolean supportAutoScaling) {
                this.supportAutoScaling = supportAutoScaling;
                return this;
            }

            /**
             * Indicates whether the message trace feature is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * This parameter is not in use. By default, the message trace feature is enabled for ApsaraMQ for RocketMQ instances, regardless of whether this parameter is configured.
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
    public static class Software extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maintainTime")
        private String maintainTime;

        @com.aliyun.core.annotation.NameInMap("softwareVersion")
        private String softwareVersion;

        @com.aliyun.core.annotation.NameInMap("upgradeMethod")
        private String upgradeMethod;

        private Software(Builder builder) {
            this.maintainTime = builder.maintainTime;
            this.softwareVersion = builder.softwareVersion;
            this.upgradeMethod = builder.upgradeMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Software create() {
            return builder().build();
        }

        /**
         * @return maintainTime
         */
        public String getMaintainTime() {
            return this.maintainTime;
        }

        /**
         * @return softwareVersion
         */
        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

        /**
         * @return upgradeMethod
         */
        public String getUpgradeMethod() {
            return this.upgradeMethod;
        }

        public static final class Builder {
            private String maintainTime; 
            private String softwareVersion; 
            private String upgradeMethod; 

            /**
             * The period of upgrade time.
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * The version of software.
             */
            public Builder softwareVersion(String softwareVersion) {
                this.softwareVersion = softwareVersion;
                return this;
            }

            /**
             * The upgrade method.
             * <p>
             * 
             * Valid values:
             * 
             * - Auto: automatic upgrade
             * 
             * - Manual: manual upgrade
             */
            public Builder upgradeMethod(String upgradeMethod) {
                this.upgradeMethod = upgradeMethod;
                return this;
            }

            public Software build() {
                return new Software(this);
            } 

        } 

    }
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

            /**
             * The tag key of the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the resource.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountInfo")
        private AccountInfo accountInfo;

        @com.aliyun.core.annotation.NameInMap("aclInfo")
        private AclInfo aclInfo;

        @com.aliyun.core.annotation.NameInMap("bid")
        private String bid;

        @com.aliyun.core.annotation.NameInMap("commodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("extConfig")
        @Deprecated
        private ExtConfig extConfig;

        @com.aliyun.core.annotation.NameInMap("groupCount")
        private Long groupCount;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("instanceQuotas")
        private java.util.List < InstanceQuotas> instanceQuotas;

        @com.aliyun.core.annotation.NameInMap("networkInfo")
        private NetworkInfo networkInfo;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("productInfo")
        private ProductInfo productInfo;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("releaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("seriesCode")
        private String seriesCode;

        @com.aliyun.core.annotation.NameInMap("serviceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("software")
        private Software software;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subSeriesCode")
        private String subSeriesCode;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("topicCount")
        private Long topicCount;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Data(Builder builder) {
            this.accountInfo = builder.accountInfo;
            this.aclInfo = builder.aclInfo;
            this.bid = builder.bid;
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.extConfig = builder.extConfig;
            this.groupCount = builder.groupCount;
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
            this.software = builder.software;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.subSeriesCode = builder.subSeriesCode;
            this.tags = builder.tags;
            this.topicCount = builder.topicCount;
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
         * @return groupCount
         */
        public Long getGroupCount() {
            return this.groupCount;
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
         * @return software
         */
        public Software getSoftware() {
            return this.software;
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return topicCount
         */
        public Long getTopicCount() {
            return this.topicCount;
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
            private Long groupCount; 
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
            private Software software; 
            private String startTime; 
            private String status; 
            private String subSeriesCode; 
            private java.util.List < Tags> tags; 
            private Long topicCount; 
            private String updateTime; 
            private String userId; 

            /**
             * The account information.
             */
            public Builder accountInfo(AccountInfo accountInfo) {
                this.accountInfo = accountInfo;
                return this;
            }

            /**
             * The information about access control.
             */
            public Builder aclInfo(AclInfo aclInfo) {
                this.aclInfo = aclInfo;
                return this;
            }

            /**
             * The business ID (BID) of the commodity.
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * The commodity code of the instance. The commodity code of a ApsaraMQ for RocketMQ 5.0 instance has a similar format as ons_rmqsub_public_cn.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The time when the instance was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the instance expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The extended configurations. We recommend you configure productInfo, internetInfo, or aclInfo instead of this parameter.
             */
            public Builder extConfig(ExtConfig extConfig) {
                this.extConfig = extConfig;
                return this;
            }

            /**
             * The number of groups.
             */
            public Builder groupCount(Long groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * The ID of the instance
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The instance quotas.
             */
            public Builder instanceQuotas(java.util.List < InstanceQuotas> instanceQuotas) {
                this.instanceQuotas = instanceQuotas;
                return this;
            }

            /**
             * The network information.
             */
            public Builder networkInfo(NetworkInfo networkInfo) {
                this.networkInfo = networkInfo;
                return this;
            }

            /**
             * The billing method of the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   PayAsYouGo: pay-as-you-go
             * *   Subscription
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * The extended configurations of the instance.
             */
            public Builder productInfo(ProductInfo productInfo) {
                this.productInfo = productInfo;
                return this;
            }

            /**
             * The ID of the region in which the instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The time when the instance was released.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
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
             */
            public Builder seriesCode(String seriesCode) {
                this.seriesCode = seriesCode;
                return this;
            }

            /**
             * The code of the service to which the instance belongs. The service code of ApsaraMQ for RocketMQ is rmq.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * The instance software information.
             */
            public Builder software(Software software) {
                this.software = software;
                return this;
            }

            /**
             * The time when the instance was started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   RELEASED
             * *   RUNNING
             * *   STOPPED
             * *   CHANGING
             * *   CREATING
             */
            public Builder status(String status) {
                this.status = status;
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
             */
            public Builder subSeriesCode(String subSeriesCode) {
                this.subSeriesCode = subSeriesCode;
                return this;
            }

            /**
             * The resource tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The number of topics.
             */
            public Builder topicCount(Long topicCount) {
                this.topicCount = topicCount;
                return this;
            }

            /**
             * The time when the instance was last modified.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user who owns the instance.
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
