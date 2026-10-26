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
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aclInfo")
    private AclInfo aclInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkInfo")
    private NetworkInfo networkInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productInfo")
    private ProductInfo productInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.aclInfo = builder.aclInfo;
        this.instanceName = builder.instanceName;
        this.networkInfo = builder.networkInfo;
        this.productInfo = builder.productInfo;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return aclInfo
     */
    public AclInfo getAclInfo() {
        return this.aclInfo;
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

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String instanceId; 
        private AclInfo aclInfo; 
        private String instanceName; 
        private NetworkInfo networkInfo; 
        private ProductInfo productInfo; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.aclInfo = request.aclInfo;
            this.instanceName = request.instanceName;
            this.networkInfo = request.networkInfo;
            this.productInfo = request.productInfo;
            this.remark = request.remark;
        } 

        /**
         * <p>The ID of the instance to be updated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
         * <p>The updated instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_instance</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The updated network information of the instance.</p>
         */
        public Builder networkInfo(NetworkInfo networkInfo) {
            this.putBodyParameter("networkInfo", networkInfo);
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * <p>The extension configurations of the instance.</p>
         */
        public Builder productInfo(ProductInfo productInfo) {
            this.putBodyParameter("productInfo", productInfo);
            this.productInfo = productInfo;
            return this;
        }

        /**
         * <p>The updated remarks for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>This is the remark for test.</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class AclInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aclTypes")
        private java.util.List<String> aclTypes;

        @com.aliyun.core.annotation.NameInMap("defaultVpcAuthFree")
        private Boolean defaultVpcAuthFree;

        private AclInfo(Builder builder) {
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
            private java.util.List<String> aclTypes; 
            private Boolean defaultVpcAuthFree; 

            private Builder() {
            } 

            private Builder(AclInfo model) {
                this.aclTypes = model.aclTypes;
                this.defaultVpcAuthFree = model.defaultVpcAuthFree;
            } 

            /**
             * <p>The authentication type of the instance.</p>
             */
            public Builder aclTypes(java.util.List<String> aclTypes) {
                this.aclTypes = aclTypes;
                return this;
            }

            /**
             * <p>Indicates whether password-free access is enabled for VPC connections under the intelligent identity recognition type.</p>
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
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class InternetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ipWhitelist")
        private java.util.List<String> ipWhitelist;

        private InternetInfo(Builder builder) {
            this.ipWhitelist = builder.ipWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternetInfo create() {
            return builder().build();
        }

        /**
         * @return ipWhitelist
         */
        public java.util.List<String> getIpWhitelist() {
            return this.ipWhitelist;
        }

        public static final class Builder {
            private java.util.List<String> ipWhitelist; 

            private Builder() {
            } 

            private Builder(InternetInfo model) {
                this.ipWhitelist = model.ipWhitelist;
            } 

            /**
             * <p>The public network access IP whitelist.</p>
             * <ul>
             * <li>If no IP whitelist is configured, all IP address ranges are allowed to access the ApsaraMQ for RocketMQ server over the public network by default.</li>
             * <li>If an IP whitelist is configured, only the IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ server over the public network.</li>
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
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class NetworkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("internetInfo")
        private InternetInfo internetInfo;

        private NetworkInfo(Builder builder) {
            this.internetInfo = builder.internetInfo;
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

        public static final class Builder {
            private InternetInfo internetInfo; 

            private Builder() {
            } 

            private Builder(NetworkInfo model) {
                this.internetInfo = model.internetInfo;
            } 

            /**
             * <p>The public network information. This parameter is valid only when the public network access feature is enabled for the instance.</p>
             */
            public Builder internetInfo(InternetInfo internetInfo) {
                this.internetInfo = internetInfo;
                return this;
            }

            public NetworkInfo build() {
                return new NetworkInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class ProductInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adaptiveElasticity")
        private Boolean adaptiveElasticity;

        @com.aliyun.core.annotation.NameInMap("autoScaling")
        private Boolean autoScaling;

        @com.aliyun.core.annotation.NameInMap("messageRetentionTime")
        private Integer messageRetentionTime;

        @com.aliyun.core.annotation.NameInMap("sendReceiveRatio")
        private Float sendReceiveRatio;

        @com.aliyun.core.annotation.NameInMap("traceOn")
        private Boolean traceOn;

        private ProductInfo(Builder builder) {
            this.adaptiveElasticity = builder.adaptiveElasticity;
            this.autoScaling = builder.autoScaling;
            this.messageRetentionTime = builder.messageRetentionTime;
            this.sendReceiveRatio = builder.sendReceiveRatio;
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
         * @return messageRetentionTime
         */
        public Integer getMessageRetentionTime() {
            return this.messageRetentionTime;
        }

        /**
         * @return sendReceiveRatio
         */
        public Float getSendReceiveRatio() {
            return this.sendReceiveRatio;
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
            private Integer messageRetentionTime; 
            private Float sendReceiveRatio; 
            private Boolean traceOn; 

            private Builder() {
            } 

            private Builder(ProductInfo model) {
                this.adaptiveElasticity = model.adaptiveElasticity;
                this.autoScaling = model.autoScaling;
                this.messageRetentionTime = model.messageRetentionTime;
                this.sendReceiveRatio = model.sendReceiveRatio;
                this.traceOn = model.traceOn;
            } 

            /**
             * <p>Specifies whether to enable the adaptive elasticity capability. A value of true indicates enabled, and a value of false indicates shutdown.</p>
             */
            public Builder adaptiveElasticity(Boolean adaptiveElasticity) {
                this.adaptiveElasticity = adaptiveElasticity;
                return this;
            }

            /**
             * <p>Specifies whether to enable the burstable elastic capacity beyond the specification.</p>
             * <p>After the burstable elastic capacity is enabled, ApsaraMQ for RocketMQ allows the instance to exceed the TPS limit of the base specification within a certain range. The portion that exceeds the base specification incurs additional elastic specification fees. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427237.html">Computing fee</a>.</p>
             * <blockquote>
             * <p>Only instances of specific specifications support the burstable elastic specification capability. For more information about supported instances, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
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
             * <p>The message retention period. Unit: hours.</p>
             * <p>For the valid values, see <a href="https://help.aliyun.com/document_detail/440347.html">Limits</a> &gt; Resource Quotas &gt; Message retention period limit.</p>
             * <p>The log broker in ApsaraMQ for RocketMQ is fully serverless and elastic. Fees are charged based on the actual storage space used. You can control the storage capacity of messages by adjusting the message retention period. For more information, see <a href="https://help.aliyun.com/document_detail/427238.html">Storage fee</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder messageRetentionTime(Integer messageRetentionTime) {
                this.messageRetentionTime = messageRetentionTime;
                return this;
            }

            /**
             * <p>The ratio of messages sent to messages accepted.</p>
             * <p>Valid values: [0.25, 1]</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder sendReceiveRatio(Float sendReceiveRatio) {
                this.sendReceiveRatio = sendReceiveRatio;
                return this;
            }

            /**
             * <p>Specifies whether to enable the message trace feature.</p>
             * <p>&lt;props=&quot;intl&quot;&gt;This parameter does not take effect. Regardless of whether this parameter is enabled, the instance supports the message trace feature by default.
             * &lt;props=&quot;china&quot;&gt;This parameter takes effect only for Serverless instances. If the message trace feature is enabled, message trace fees are incurred. For more information about billing, see <a href="https://help.aliyun.com/document_detail/2586280.html">Serverless billing</a>.
             * &lt;props=&quot;china&quot;&gt;For pay-as-you-go and subscription instances, this parameter does not take effect. The message trace feature is supported by default regardless of whether this parameter is enabled.</p>
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
}
