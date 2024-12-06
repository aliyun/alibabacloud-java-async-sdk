// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateLogstashRequest} extends {@link RequestModel}
 *
 * <p>CreateLogstashRequest</p>
 */
public class CreateLogstashRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private NetworkConfig networkConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeAmount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer nodeAmount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private NodeSpec nodeSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentInfo")
    private PaymentInfo paymentInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateLogstashRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.networkConfig = builder.networkConfig;
        this.nodeAmount = builder.nodeAmount;
        this.nodeSpec = builder.nodeSpec;
        this.paymentInfo = builder.paymentInfo;
        this.paymentType = builder.paymentType;
        this.resourceGroupId = builder.resourceGroupId;
        this.version = builder.version;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLogstashRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return networkConfig
     */
    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * @return nodeAmount
     */
    public Integer getNodeAmount() {
        return this.nodeAmount;
    }

    /**
     * @return nodeSpec
     */
    public NodeSpec getNodeSpec() {
        return this.nodeSpec;
    }

    /**
     * @return paymentInfo
     */
    public PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateLogstashRequest, Builder> {
        private String description; 
        private NetworkConfig networkConfig; 
        private Integer nodeAmount; 
        private NodeSpec nodeSpec; 
        private PaymentInfo paymentInfo; 
        private String paymentType; 
        private String resourceGroupId; 
        private String version; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateLogstashRequest request) {
            super(request);
            this.description = request.description;
            this.networkConfig = request.networkConfig;
            this.nodeAmount = request.nodeAmount;
            this.nodeSpec = request.nodeSpec;
            this.paymentInfo = request.paymentInfo;
            this.paymentType = request.paymentType;
            this.resourceGroupId = request.resourceGroupId;
            this.version = request.version;
            this.clientToken = request.clientToken;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.putBodyParameter("networkConfig", networkConfig);
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nodeAmount(Integer nodeAmount) {
            this.putBodyParameter("nodeAmount", nodeAmount);
            this.nodeAmount = nodeAmount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder nodeSpec(NodeSpec nodeSpec) {
            this.putBodyParameter("nodeSpec", nodeSpec);
            this.nodeSpec = nodeSpec;
            return this;
        }

        /**
         * paymentInfo.
         */
        public Builder paymentInfo(PaymentInfo paymentInfo) {
            this.putBodyParameter("paymentInfo", paymentInfo);
            this.paymentInfo = paymentInfo;
            return this;
        }

        /**
         * paymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6.7_with_X-Pack</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
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
        public CreateLogstashRequest build() {
            return new CreateLogstashRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLogstashRequest} extends {@link TeaModel}
     *
     * <p>CreateLogstashRequest</p>
     */
    public static class NetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vsArea")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vsArea;

        @com.aliyun.core.annotation.NameInMap("vswitchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vswitchId;

        private NetworkConfig(Builder builder) {
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vsArea = builder.vsArea;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vsArea
         */
        public String getVsArea() {
            return this.vsArea;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String type; 
            private String vpcId; 
            private String vsArea; 
            private String vswitchId; 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp16k1dvzxtmagcva****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1k4ec6s7sjdbudw****</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateLogstashRequest} extends {@link TeaModel}
     *
     * <p>CreateLogstashRequest</p>
     */
    public static class NodeSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("disk")
        private Long disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        @com.aliyun.core.annotation.Validation(required = true)
        private String spec;

        private NodeSpec(Builder builder) {
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeSpec create() {
            return builder().build();
        }

        /**
         * @return disk
         */
        public Long getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Long disk; 
            private String diskType; 
            private String spec; 

            /**
             * disk.
             */
            public Builder disk(Long disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>logstash.n4.small</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public NodeSpec build() {
                return new NodeSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateLogstashRequest} extends {@link TeaModel}
     *
     * <p>CreateLogstashRequest</p>
     */
    public static class PaymentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoRenewDuration")
        private Long autoRenewDuration;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("isAutoRenew")
        private Boolean isAutoRenew;

        @com.aliyun.core.annotation.NameInMap("pricingCycle")
        private String pricingCycle;

        private PaymentInfo(Builder builder) {
            this.autoRenewDuration = builder.autoRenewDuration;
            this.duration = builder.duration;
            this.isAutoRenew = builder.isAutoRenew;
            this.pricingCycle = builder.pricingCycle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PaymentInfo create() {
            return builder().build();
        }

        /**
         * @return autoRenewDuration
         */
        public Long getAutoRenewDuration() {
            return this.autoRenewDuration;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return isAutoRenew
         */
        public Boolean getIsAutoRenew() {
            return this.isAutoRenew;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public static final class Builder {
            private Long autoRenewDuration; 
            private Long duration; 
            private Boolean isAutoRenew; 
            private String pricingCycle; 

            /**
             * autoRenewDuration.
             */
            public Builder autoRenewDuration(Long autoRenewDuration) {
                this.autoRenewDuration = autoRenewDuration;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * isAutoRenew.
             */
            public Builder isAutoRenew(Boolean isAutoRenew) {
                this.isAutoRenew = isAutoRenew;
                return this;
            }

            /**
             * pricingCycle.
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            public PaymentInfo build() {
                return new PaymentInfo(this);
            } 

        } 

    }
}
