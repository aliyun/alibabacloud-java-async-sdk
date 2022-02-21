// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLogstashRequest} extends {@link RequestModel}
 *
 * <p>CreateLogstashRequest</p>
 */
public class CreateLogstashRequest extends Request {
    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("networkConfig")
    private NetworkConfig networkConfig;

    @Body
    @NameInMap("nodeAmount")
    private Integer nodeAmount;

    @Body
    @NameInMap("nodeSpec")
    private NodeSpec nodeSpec;

    @Body
    @NameInMap("paymentInfo")
    private PaymentInfo paymentInfo;

    @Body
    @NameInMap("paymentType")
    private String paymentType;

    @Body
    @NameInMap("version")
    private String version;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    private CreateLogstashRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.networkConfig = builder.networkConfig;
        this.nodeAmount = builder.nodeAmount;
        this.nodeSpec = builder.nodeSpec;
        this.paymentInfo = builder.paymentInfo;
        this.paymentType = builder.paymentType;
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
        private String version; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateLogstashRequest response) {
            super(response);
            this.description = response.description;
            this.networkConfig = response.networkConfig;
            this.nodeAmount = response.nodeAmount;
            this.nodeSpec = response.nodeSpec;
            this.paymentInfo = response.paymentInfo;
            this.paymentType = response.paymentType;
            this.version = response.version;
            this.clientToken = response.clientToken;
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
         * networkConfig.
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.putBodyParameter("networkConfig", networkConfig);
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * nodeAmount.
         */
        public Builder nodeAmount(Integer nodeAmount) {
            this.putBodyParameter("nodeAmount", nodeAmount);
            this.nodeAmount = nodeAmount;
            return this;
        }

        /**
         * nodeSpec.
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
         * version.
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

    public static class NetworkConfig extends TeaModel {
        @NameInMap("type")
        private String type;

        @NameInMap("vpcId")
        private String vpcId;

        @NameInMap("vsArea")
        private String vsArea;

        @NameInMap("vswitchId")
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
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * vsArea.
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * vswitchId.
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
    public static class NodeSpec extends TeaModel {
        @NameInMap("disk")
        private Long disk;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
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
             * spec.
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
    public static class PaymentInfo extends TeaModel {
        @NameInMap("autoRenewDuration")
        private Long autoRenewDuration;

        @NameInMap("duration")
        private Long duration;

        @NameInMap("isAutoRenew")
        private Boolean isAutoRenew;

        @NameInMap("pricingCycle")
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
             * 自动续费包月周期
             */
            public Builder autoRenewDuration(Long autoRenewDuration) {
                this.autoRenewDuration = autoRenewDuration;
                return this;
            }

            /**
             * 包月周期
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * 是否自动续费
             */
            public Builder isAutoRenew(Boolean isAutoRenew) {
                this.isAutoRenew = isAutoRenew;
                return this;
            }

            /**
             * 日期单位
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
