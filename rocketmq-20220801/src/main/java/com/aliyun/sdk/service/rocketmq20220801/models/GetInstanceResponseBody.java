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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetInstanceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>MissingInstanceId</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter instanceId is mandatory for this action .</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. Each request has a unique ID, which you can use to troubleshoot and locate issues.</p>
         * 
         * <strong>example:</strong>
         * <p>05AB7FBD-F1D3-5D87-BF78-BD782249****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AccountInfo model) {
                this.username = model.username;
            } 

            /**
             * <p>The username of the instance. When you use public network access, you must configure the username and password of the instance in the SDK code for identity verification.</p>
             * 
             * <strong>example:</strong>
             * <p>6W0xz2uPfiwp****</p>
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
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class AclInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aclType")
        @Deprecated
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("aclTypes")
        private java.util.List<String> aclTypes;

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
        public java.util.List<String> getAclTypes() {
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
            private java.util.List<String> aclTypes; 
            private Boolean defaultVpcAuthFree; 

            private Builder() {
            } 

            private Builder(AclInfo model) {
                this.aclType = model.aclType;
                this.aclTypes = model.aclTypes;
                this.defaultVpcAuthFree = model.defaultVpcAuthFree;
            } 

            /**
             * <p>The authentication type of the instance. This parameter is deprecated. Use the aclTypes parameter instead.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * <p>The authentication types of the instance.</p>
             */
            public Builder aclTypes(java.util.List<String> aclTypes) {
                this.aclTypes = aclTypes;
                return this;
            }

            /**
             * <p>Indicates whether the authentication-free in VPC feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ExtConfig model) {
                this.aclType = model.aclType;
                this.autoScaling = model.autoScaling;
                this.flowOutBandwidth = model.flowOutBandwidth;
                this.flowOutType = model.flowOutType;
                this.internetSpec = model.internetSpec;
                this.messageRetentionTime = model.messageRetentionTime;
                this.msgProcessSpec = model.msgProcessSpec;
                this.sendReceiveRatio = model.sendReceiveRatio;
                this.supportAutoScaling = model.supportAutoScaling;
            } 

            /**
             * <p>The authentication type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * <p>Indicates whether burstable elastic capacity beyond the base specification is enabled.</p>
             * <p>This parameter takes effect only when the value of supportAutoScaling is enable, which means the instance supports enabling elastic capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoScaling(Boolean autoScaling) {
                this.autoScaling = autoScaling;
                return this;
            }

            /**
             * <p>The Internet bandwidth specification. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder flowOutBandwidth(Integer flowOutBandwidth) {
                this.flowOutBandwidth = flowOutBandwidth;
                return this;
            }

            /**
             * <p>The billing type for public network usage.</p>
             * 
             * <strong>example:</strong>
             * <p>payByBandwidth</p>
             */
            public Builder flowOutType(String flowOutType) {
                this.flowOutType = flowOutType;
                return this;
            }

            /**
             * <p>Indicates whether public network access is enabled.</p>
             * <p>The instance supports VPC access by default. If public network access is enabled, ApsaraMQ for RocketMQ charges fees for public downstream bandwidth. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427240.html">Public network access fees</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder internetSpec(String internetSpec) {
                this.internetSpec = internetSpec;
                return this;
            }

            /**
             * <p>The message retention period. Unit: hours.</p>
             * <p>For the value range, see <a href="https://help.aliyun.com/document_detail/440347.html">Limits</a> &gt; Resource Quotas &gt; Message retention period.</p>
             * <p>The message storage of ApsaraMQ for RocketMQ is fully serverless and elastic. You are charged based on the actual storage space used. You can control the storage capacity by adjusting the message retention period. For more information, see <a href="https://help.aliyun.com/document_detail/427238.html">Storage fees</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder messageRetentionTime(Integer messageRetentionTime) {
                this.messageRetentionTime = messageRetentionTime;
                return this;
            }

            /**
             * <p>The message processing specification. For the TPS upper limit of message sending and receiving, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq.s2.2xlarge</p>
             */
            public Builder msgProcessSpec(String msgProcessSpec) {
                this.msgProcessSpec = msgProcessSpec;
                return this;
            }

            /**
             * <p>The ratio of message sending to message receiving.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder sendReceiveRatio(Float sendReceiveRatio) {
                this.sendReceiveRatio = sendReceiveRatio;
                return this;
            }

            /**
             * <p>Indicates whether the instance supports enabling burstable elastic capacity beyond the base specification.</p>
             * <p>After burstable elastic capacity is enabled, ApsaraMQ for RocketMQ allows the instance to exceed the TPS limit of the base specification within a certain range. Additional elastic specification fees are charged for the portion that exceeds the base specification. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427237.html">Computing fees</a>.</p>
             * <blockquote>
             * <p>Only instances of specific specifications support burstable elastic capacity. For more information about supported instances, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(InstanceQuotas model) {
                this.freeCount = model.freeCount;
                this.quotaName = model.quotaName;
                this.totalCount = model.totalCount;
                this.usedCount = model.usedCount;
            } 

            /**
             * <p>The free quota. Unit: count.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder freeCount(Double freeCount) {
                this.freeCount = freeCount;
                return this;
            }

            /**
             * <p>The quota name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>TOPIC_COUNT</p>
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * <p>The total quota. Unit: count.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Double totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The used quota. Unit: count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("endpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("endpointUrl")
        private String endpointUrl;

        @com.aliyun.core.annotation.NameInMap("ipWhitelist")
        private java.util.List<String> ipWhitelist;

        private Endpoints(Builder builder) {
            this.endpointId = builder.endpointId;
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
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
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
        public java.util.List<String> getIpWhitelist() {
            return this.ipWhitelist;
        }

        public static final class Builder {
            private String endpointId; 
            private String endpointType; 
            private String endpointUrl; 
            private java.util.List<String> ipWhitelist; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.endpointId = model.endpointId;
                this.endpointType = model.endpointType;
                this.endpointUrl = model.endpointUrl;
                this.ipWhitelist = model.ipWhitelist;
            } 

            /**
             * <p>The associated PrivateLink endpoint instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-bpxxx</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The endpoint type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP_INTERNET</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-c4d2tbk****-vpc.cn-hangzhou.rmq.aliyuncs.com:8080</p>
             */
            public Builder endpointUrl(String endpointUrl) {
                this.endpointUrl = endpointUrl;
                return this;
            }

            /**
             * <p>The IP whitelist for public network access. IP whitelists are supported only for Internet endpoints and are not supported for VPC endpoints.</p>
             * <ul>
             * <li>If no IP whitelist is configured, all IP address ranges are allowed to access the MSMQ for RocketMQ queue broker over the Internet by default.</li>
             * <li>If an IP whitelist is configured, only IP addresses in the whitelist are allowed to access the MSMQ for RocketMQ queue broker over the Internet.</li>
             * </ul>
             * <p>This field is no longer recommended. Use the internetInfo.ipWhitelist field instead.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.x.x/24</p>
             */
            public Builder ipWhitelist(java.util.List<String> ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class InternetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flowOutBandwidth")
        private Integer flowOutBandwidth;

        @com.aliyun.core.annotation.NameInMap("flowOutType")
        private String flowOutType;

        @com.aliyun.core.annotation.NameInMap("internetSpec")
        private String internetSpec;

        @com.aliyun.core.annotation.NameInMap("ipWhitelist")
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
             * <p>The Internet bandwidth specification. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flowOutBandwidth(Integer flowOutBandwidth) {
                this.flowOutBandwidth = flowOutBandwidth;
                return this;
            }

            /**
             * <p>The billing type for public network usage.</p>
             * 
             * <strong>example:</strong>
             * <p>payByBandwidth</p>
             */
            public Builder flowOutType(String flowOutType) {
                this.flowOutType = flowOutType;
                return this;
            }

            /**
             * <p>Indicates whether public network access is enabled.</p>
             * <p>The instance supports VPC access by default. If public network access is enabled, ApsaraMQ for RocketMQ charges fees for public downstream bandwidth. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427240.html">Public network access fees</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder internetSpec(String internetSpec) {
                this.internetSpec = internetSpec;
                return this;
            }

            /**
             * <p>The IP whitelist for public network access.</p>
             * <ul>
             * <li>If the IP whitelist is not configured, all IP address ranges are allowed to access the ApsaraMQ for RocketMQ broker over the public network by default.</li>
             * <li>If the IP whitelist is configured, only the IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ broker over the public network.</li>
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
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(VSwitches model) {
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6gwtbn6etadpvz7****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
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
             * <p>sg-hp35r2hc3a3sv8q2sb16</p>
             */
            public Builder securityGroupIds(String securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The ID of the vSwitch associated with the instance.</p>
             * <p><notice>This field is not recommended. Use the vSwitches field instead. For compatibility, this field currently returns only one vSwitch.</notice></p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6gwtbn6etadpvz7****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The list of vSwitches.</p>
             */
            public Builder vSwitches(java.util.List<VSwitches> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * <p>The ID of the VPC associated with the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6of9452b2pba82c****</p>
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
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class NetworkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoints")
        private java.util.List<Endpoints> endpoints;

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
        public java.util.List<Endpoints> getEndpoints() {
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
            private java.util.List<Endpoints> endpoints; 
            private InternetInfo internetInfo; 
            private VpcInfo vpcInfo; 

            private Builder() {
            } 

            private Builder(NetworkInfo model) {
                this.endpoints = model.endpoints;
                this.internetInfo = model.internetInfo;
                this.vpcInfo = model.vpcInfo;
            } 

            /**
             * <p>The endpoint information.</p>
             */
            public Builder endpoints(java.util.List<Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The public network information of the instance.</p>
             */
            public Builder internetInfo(InternetInfo internetInfo) {
                this.internetInfo = internetInfo;
                return this;
            }

            /**
             * <p>The VPC information.</p>
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
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("maxDelayTime")
        private Integer maxDelayTime;

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

        @com.aliyun.core.annotation.NameInMap("supportAutoScaling")
        private Boolean supportAutoScaling;

        @com.aliyun.core.annotation.NameInMap("traceOn")
        private Boolean traceOn;

        private ProductInfo(Builder builder) {
            this.adaptiveElasticity = builder.adaptiveElasticity;
            this.autoScaling = builder.autoScaling;
            this.capacityType = builder.capacityType;
            this.drReplicationMode = builder.drReplicationMode;
            this.maxDelayTime = builder.maxDelayTime;
            this.messageRetentionTime = builder.messageRetentionTime;
            this.msgProcessSpec = builder.msgProcessSpec;
            this.provisionedCapacity = builder.provisionedCapacity;
            this.sendReceiveRatio = builder.sendReceiveRatio;
            this.storageEncryption = builder.storageEncryption;
            this.storageSecretKey = builder.storageSecretKey;
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
         * @return maxDelayTime
         */
        public Integer getMaxDelayTime() {
            return this.maxDelayTime;
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
            private Boolean adaptiveElasticity; 
            private Boolean autoScaling; 
            private String capacityType; 
            private String drReplicationMode; 
            private Integer maxDelayTime; 
            private Integer messageRetentionTime; 
            private String msgProcessSpec; 
            private Long provisionedCapacity; 
            private Float sendReceiveRatio; 
            private Boolean storageEncryption; 
            private String storageSecretKey; 
            private Boolean supportAutoScaling; 
            private Boolean traceOn; 

            private Builder() {
            } 

            private Builder(ProductInfo model) {
                this.adaptiveElasticity = model.adaptiveElasticity;
                this.autoScaling = model.autoScaling;
                this.capacityType = model.capacityType;
                this.drReplicationMode = model.drReplicationMode;
                this.maxDelayTime = model.maxDelayTime;
                this.messageRetentionTime = model.messageRetentionTime;
                this.msgProcessSpec = model.msgProcessSpec;
                this.provisionedCapacity = model.provisionedCapacity;
                this.sendReceiveRatio = model.sendReceiveRatio;
                this.storageEncryption = model.storageEncryption;
                this.storageSecretKey = model.storageSecretKey;
                this.supportAutoScaling = model.supportAutoScaling;
                this.traceOn = model.traceOn;
            } 

            /**
             * <p>The adaptive elasticity.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder adaptiveElasticity(Boolean adaptiveElasticity) {
                this.adaptiveElasticity = adaptiveElasticity;
                return this;
            }

            /**
             * <p>Indicates whether burstable elastic capacity beyond the base specification is enabled for seamless scaling.</p>
             * <p>This parameter takes effect only when the value of supportAutoScaling is enable, which means the instance supports enabling elastic capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoScaling(Boolean autoScaling) {
                this.autoScaling = autoScaling;
                return this;
            }

            /**
             * <p>The capacity mode.</p>
             * 
             * <strong>example:</strong>
             * <p>provisioned</p>
             */
            public Builder capacityType(String capacityType) {
                this.capacityType = capacityType;
                return this;
            }

            /**
             * <p>The cross-region replication mode.</p>
             * 
             * <strong>example:</strong>
             * <p>async_cross_az</p>
             */
            public Builder drReplicationMode(String drReplicationMode) {
                this.drReplicationMode = drReplicationMode;
                return this;
            }

            /**
             * <p>The maximum interval for scheduled messages. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3456000</p>
             */
            public Builder maxDelayTime(Integer maxDelayTime) {
                this.maxDelayTime = maxDelayTime;
                return this;
            }

            /**
             * <p>The message retention period. Unit: hours.</p>
             * <p>For the value range, see <a href="https://help.aliyun.com/document_detail/440347.html">Limits</a> &gt; Resource Quotas &gt; Message retention period.</p>
             * <p>The message storage of ApsaraMQ for RocketMQ is fully serverless and elastic. You are charged based on the actual storage space used. You can control the storage capacity by adjusting the message retention period. For more information, see <a href="https://help.aliyun.com/document_detail/427238.html">Storage fees</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder messageRetentionTime(Integer messageRetentionTime) {
                this.messageRetentionTime = messageRetentionTime;
                return this;
            }

            /**
             * <p>The message processing specification. For the TPS upper limit of message sending and receiving, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
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
             * <p>3000</p>
             */
            public Builder provisionedCapacity(Long provisionedCapacity) {
                this.provisionedCapacity = provisionedCapacity;
                return this;
            }

            /**
             * <p>The ratio of message sending to message receiving.</p>
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
             * <p>The storage encryption key.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx</p>
             */
            public Builder storageSecretKey(String storageSecretKey) {
                this.storageSecretKey = storageSecretKey;
                return this;
            }

            /**
             * <p>Indicates whether the burstable elastic capability beyond the base specification is enabled.</p>
             * <p>After the burstable elastic capability is enabled, ApsaraMQ for RocketMQ allows the instance to exceed the TPS limit of the base specification within a certain range. Additional elastic specification fees are charged for the portion that exceeds the base specification. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427237.html">Computing capability fees</a>.</p>
             * <blockquote>
             * <p>Only instances of specific specifications support the burstable elastic capability. For more information about supported instances, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportAutoScaling(Boolean supportAutoScaling) {
                this.supportAutoScaling = supportAutoScaling;
                return this;
            }

            /**
             * <p>Indicates whether the message trace feature is enabled.</p>
             * <ul>
             * <li>true: The message trace feature is enabled.</li>
             * <li>false: The message trace feature is disabled.</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;This parameter does not take effect. Instances support the message trace feature by default regardless of whether this parameter is enabled.
             * &lt;props=&quot;china&quot;&gt;This parameter takes effect only for Serverless instances. If the message trace feature is enabled, message trace fees are incurred. For more information about billing, see <a href="https://help.aliyun.com/document_detail/2586280.html">Serverless billing</a>.</p>
             * <p>&lt;props=&quot;china&quot;&gt;For pay-as-you-go and subscription instances, this parameter does not take effect. The message trace feature is supported by default regardless of whether this parameter is enabled.</p>
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
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Software extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maintainTime")
        @Deprecated
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

            private Builder() {
            } 

            private Builder(Software model) {
                this.maintainTime = model.maintainTime;
                this.softwareVersion = model.softwareVersion;
                this.upgradeMethod = model.upgradeMethod;
            } 

            /**
             * <p>The upgrade time window, in the format of HH:mm-HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>02:00-06:00</p>
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * <p>The software version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.0-rmq-20230619-1</p>
             */
            public Builder softwareVersion(String softwareVersion) {
                this.softwareVersion = softwareVersion;
                return this;
            }

            /**
             * <p>The upgrade method.</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
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
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
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
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the resource tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountInfo")
        private AccountInfo accountInfo;

        @com.aliyun.core.annotation.NameInMap("aclInfo")
        private AclInfo aclInfo;

        @com.aliyun.core.annotation.NameInMap("autoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("autoRenewPeriod")
        private Integer autoRenewPeriod;

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
        private java.util.List<InstanceQuotas> instanceQuotas;

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
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("topicCount")
        private Long topicCount;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Data(Builder builder) {
            this.accountInfo = builder.accountInfo;
            this.aclInfo = builder.aclInfo;
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
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
        public java.util.List<InstanceQuotas> getInstanceQuotas() {
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
        public java.util.List<Tags> getTags() {
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
            private Boolean autoRenew; 
            private Integer autoRenewPeriod; 
            private String bid; 
            private String commodityCode; 
            private String createTime; 
            private String expireTime; 
            private ExtConfig extConfig; 
            private Long groupCount; 
            private String instanceId; 
            private String instanceName; 
            private java.util.List<InstanceQuotas> instanceQuotas; 
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
            private java.util.List<Tags> tags; 
            private Long topicCount; 
            private String updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountInfo = model.accountInfo;
                this.aclInfo = model.aclInfo;
                this.autoRenew = model.autoRenew;
                this.autoRenewPeriod = model.autoRenewPeriod;
                this.bid = model.bid;
                this.commodityCode = model.commodityCode;
                this.createTime = model.createTime;
                this.expireTime = model.expireTime;
                this.extConfig = model.extConfig;
                this.groupCount = model.groupCount;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceQuotas = model.instanceQuotas;
                this.networkInfo = model.networkInfo;
                this.paymentType = model.paymentType;
                this.productInfo = model.productInfo;
                this.regionId = model.regionId;
                this.releaseTime = model.releaseTime;
                this.remark = model.remark;
                this.resourceGroupId = model.resourceGroupId;
                this.seriesCode = model.seriesCode;
                this.serviceCode = model.serviceCode;
                this.software = model.software;
                this.startTime = model.startTime;
                this.status = model.status;
                this.subSeriesCode = model.subSeriesCode;
                this.tags = model.tags;
                this.topicCount = model.topicCount;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * <p>The account information.</p>
             */
            public Builder accountInfo(AccountInfo accountInfo) {
                this.accountInfo = accountInfo;
                return this;
            }

            /**
             * <p>The access control information.</p>
             */
            public Builder aclInfo(AclInfo aclInfo) {
                this.aclInfo = aclInfo;
                return this;
            }

            /**
             * <p>Indicates whether auto-renewal is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>Indicates whether auto-renewal is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenewPeriod(Integer autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * <p>The BID of the sales channel for the commodity.</p>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * <p>The commodity code of an MSMQ for RocketMQ 5.x series instance, such as ons_rmqsub_public_cn.</p>
             * 
             * <strong>example:</strong>
             * <p>ons_rmqsub_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The time when the instance was created. The value is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the instance expires. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-01 00:00:00</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The extended configuration. This field is no longer recommended. Use the productInfo, internetInfo, and aclInfo fields instead.</p>
             */
            public Builder extConfig(ExtConfig extConfig) {
                this.extConfig = extConfig;
                return this;
            }

            /**
             * <p>The number of consumer groups.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder groupCount(Long groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-7e22ody****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test instance</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The capacity information.</p>
             */
            public Builder instanceQuotas(java.util.List<InstanceQuotas> instanceQuotas) {
                this.instanceQuotas = instanceQuotas;
                return this;
            }

            /**
             * <p>The network information.</p>
             */
            public Builder networkInfo(NetworkInfo networkInfo) {
                this.networkInfo = networkInfo;
                return this;
            }

            /**
             * <p>The payment type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Subscription</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The extended configuration of the instance.</p>
             */
            public Builder productInfo(ProductInfo productInfo) {
                this.productInfo = productInfo;
                return this;
            }

            /**
             * <p>The ID of the region where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The time when the instance was released. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-07 00:00:00</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The remarks for the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>This is remark for instance.</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm3tmjruyribi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The primary series code of the instance. For differences between primary series, see <a href="https://help.aliyun.com/document_detail/444722.html">Product selection</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder seriesCode(String seriesCode) {
                this.seriesCode = seriesCode;
                return this;
            }

            /**
             * <p>The service code of the instance. The service code for MSMQ for RocketMQ is rmq.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>The instance software information.</p>
             */
            public Builder software(Software software) {
                this.software = software;
                return this;
            }

            /**
             * <p>The time when the instance was started. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sub-series code of the instance. For differences between sub-series, see <a href="https://help.aliyun.com/document_detail/444722.html">Product selection</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster_ha</p>
             */
            public Builder subSeriesCode(String subSeriesCode) {
                this.subSeriesCode = subSeriesCode;
                return this;
            }

            /**
             * <p>The resource tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The number of topics.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder topicCount(Long topicCount) {
                this.topicCount = topicCount;
                return this;
            }

            /**
             * <p>The time when the instance was last modified. The value is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-02 00:00:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the user to whom the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>111111111111111</p>
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
