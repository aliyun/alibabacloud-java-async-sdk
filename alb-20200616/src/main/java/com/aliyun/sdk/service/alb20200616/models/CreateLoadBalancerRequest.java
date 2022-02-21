// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerRequest</p>
 */
public class CreateLoadBalancerRequest extends Request {
    @Query
    @NameInMap("AddressAllocatedMode")
    private String addressAllocatedMode;

    @Query
    @NameInMap("AddressType")
    @Validation(required = true)
    private String addressType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DeletionProtectionEnabled")
    private Boolean deletionProtectionEnabled;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("LoadBalancerBillingConfig")
    @Validation(required = true)
    private LoadBalancerBillingConfig loadBalancerBillingConfig;

    @Query
    @NameInMap("LoadBalancerEdition")
    @Validation(required = true)
    private String loadBalancerEdition;

    @Query
    @NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @Query
    @NameInMap("ModificationProtectionConfig")
    private ModificationProtectionConfig modificationProtectionConfig;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("ZoneMappings")
    @Validation(required = true)
    private java.util.List < ZoneMappings> zoneMappings;

    private CreateLoadBalancerRequest(Builder builder) {
        super(builder);
        this.addressAllocatedMode = builder.addressAllocatedMode;
        this.addressType = builder.addressType;
        this.clientToken = builder.clientToken;
        this.deletionProtectionEnabled = builder.deletionProtectionEnabled;
        this.dryRun = builder.dryRun;
        this.loadBalancerBillingConfig = builder.loadBalancerBillingConfig;
        this.loadBalancerEdition = builder.loadBalancerEdition;
        this.loadBalancerName = builder.loadBalancerName;
        this.modificationProtectionConfig = builder.modificationProtectionConfig;
        this.resourceGroupId = builder.resourceGroupId;
        this.vpcId = builder.vpcId;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressAllocatedMode
     */
    public String getAddressAllocatedMode() {
        return this.addressAllocatedMode;
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deletionProtectionEnabled
     */
    public Boolean getDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerBillingConfig
     */
    public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.loadBalancerBillingConfig;
    }

    /**
     * @return loadBalancerEdition
     */
    public String getLoadBalancerEdition() {
        return this.loadBalancerEdition;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return modificationProtectionConfig
     */
    public ModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneMappings
     */
    public java.util.List < ZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder extends Request.Builder<CreateLoadBalancerRequest, Builder> {
        private String addressAllocatedMode; 
        private String addressType; 
        private String clientToken; 
        private Boolean deletionProtectionEnabled; 
        private Boolean dryRun; 
        private LoadBalancerBillingConfig loadBalancerBillingConfig; 
        private String loadBalancerEdition; 
        private String loadBalancerName; 
        private ModificationProtectionConfig modificationProtectionConfig; 
        private String resourceGroupId; 
        private String vpcId; 
        private java.util.List < ZoneMappings> zoneMappings; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerRequest response) {
            super(response);
            this.addressAllocatedMode = response.addressAllocatedMode;
            this.addressType = response.addressType;
            this.clientToken = response.clientToken;
            this.deletionProtectionEnabled = response.deletionProtectionEnabled;
            this.dryRun = response.dryRun;
            this.loadBalancerBillingConfig = response.loadBalancerBillingConfig;
            this.loadBalancerEdition = response.loadBalancerEdition;
            this.loadBalancerName = response.loadBalancerName;
            this.modificationProtectionConfig = response.modificationProtectionConfig;
            this.resourceGroupId = response.resourceGroupId;
            this.vpcId = response.vpcId;
            this.zoneMappings = response.zoneMappings;
        } 

        /**
         * 地址模式
         */
        public Builder addressAllocatedMode(String addressAllocatedMode) {
            this.putQueryParameter("AddressAllocatedMode", addressAllocatedMode);
            this.addressAllocatedMode = addressAllocatedMode;
            return this;
        }

        /**
         * 负载均衡的地址类型
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 是否开启删除保护
         */
        public Builder deletionProtectionEnabled(Boolean deletionProtectionEnabled) {
            this.putQueryParameter("DeletionProtectionEnabled", deletionProtectionEnabled);
            this.deletionProtectionEnabled = deletionProtectionEnabled;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 计费相关配置信息
         */
        public Builder loadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
            this.putQueryParameter("LoadBalancerBillingConfig", loadBalancerBillingConfig);
            this.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }

        /**
         * 负载均衡的版本
         */
        public Builder loadBalancerEdition(String loadBalancerEdition) {
            this.putQueryParameter("LoadBalancerEdition", loadBalancerEdition);
            this.loadBalancerEdition = loadBalancerEdition;
            return this;
        }

        /**
         * 名称
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putQueryParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * 负载均衡修改保护相关信息
         */
        public Builder modificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
            this.putQueryParameter("ModificationProtectionConfig", modificationProtectionConfig);
            this.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        /**
         * 资源组
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 负载均衡实例的专有网络ID。
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * 可用区及交换机映射列表
         */
        public Builder zoneMappings(java.util.List < ZoneMappings> zoneMappings) {
            this.putQueryParameter("ZoneMappings", zoneMappings);
            this.zoneMappings = zoneMappings;
            return this;
        }

        @Override
        public CreateLoadBalancerRequest build() {
            return new CreateLoadBalancerRequest(this);
        } 

    } 

    public static class LoadBalancerBillingConfig extends TeaModel {
        @NameInMap("PayType")
        @Validation(required = true)
        private String payType;

        private LoadBalancerBillingConfig(Builder builder) {
            this.payType = builder.payType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerBillingConfig create() {
            return builder().build();
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        public static final class Builder {
            private String payType; 

            /**
             * 实例的计费类型
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            public LoadBalancerBillingConfig build() {
                return new LoadBalancerBillingConfig(this);
            } 

        } 

    }
    public static class ModificationProtectionConfig extends TeaModel {
        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
        private String status;

        private ModificationProtectionConfig(Builder builder) {
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModificationProtectionConfig create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String reason; 
            private String status; 

            /**
             * 设置修改保护状态的原因
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * 负载均衡修改保护状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ModificationProtectionConfig build() {
                return new ModificationProtectionConfig(this);
            } 

        } 

    }
    public static class ZoneMappings extends TeaModel {
        @NameInMap("VSwitchId")
        @Validation(required = true)
        private String vSwitchId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneMappings create() {
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
             * 交换机标识
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * 可用区
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneMappings build() {
                return new ZoneMappings(this);
            } 

        } 

    }
}
