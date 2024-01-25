// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceRequest</p>
 */
public class CreateResourceRequest extends Request {
    @Body
    @NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @Body
    @NameInMap("ChargeType")
    private String chargeType;

    @Body
    @NameInMap("EcsInstanceCount")
    private Integer ecsInstanceCount;

    @Body
    @NameInMap("EcsInstanceType")
    private String ecsInstanceType;

    @Body
    @NameInMap("ResourceType")
    private String resourceType;

    @Body
    @NameInMap("SelfManagedResourceOptions")
    private SelfManagedResourceOptions selfManagedResourceOptions;

    @Body
    @NameInMap("SystemDiskSize")
    @Validation(maximum = 2000, minimum = 200)
    private Integer systemDiskSize;

    @Body
    @NameInMap("Zone")
    private String zone;

    private CreateResourceRequest(Builder builder) {
        super(builder);
        this.autoRenewal = builder.autoRenewal;
        this.chargeType = builder.chargeType;
        this.ecsInstanceCount = builder.ecsInstanceCount;
        this.ecsInstanceType = builder.ecsInstanceType;
        this.resourceType = builder.resourceType;
        this.selfManagedResourceOptions = builder.selfManagedResourceOptions;
        this.systemDiskSize = builder.systemDiskSize;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return ecsInstanceCount
     */
    public Integer getEcsInstanceCount() {
        return this.ecsInstanceCount;
    }

    /**
     * @return ecsInstanceType
     */
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return selfManagedResourceOptions
     */
    public SelfManagedResourceOptions getSelfManagedResourceOptions() {
        return this.selfManagedResourceOptions;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder extends Request.Builder<CreateResourceRequest, Builder> {
        private Boolean autoRenewal; 
        private String chargeType; 
        private Integer ecsInstanceCount; 
        private String ecsInstanceType; 
        private String resourceType; 
        private SelfManagedResourceOptions selfManagedResourceOptions; 
        private Integer systemDiskSize; 
        private String zone; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceRequest request) {
            super(request);
            this.autoRenewal = request.autoRenewal;
            this.chargeType = request.chargeType;
            this.ecsInstanceCount = request.ecsInstanceCount;
            this.ecsInstanceType = request.ecsInstanceType;
            this.resourceType = request.resourceType;
            this.selfManagedResourceOptions = request.selfManagedResourceOptions;
            this.systemDiskSize = request.systemDiskSize;
            this.zone = request.zone;
        } 

        /**
         * Specifies whether to enable auto-renewal. Valid values: false (default)
         * <p>
         * 
         * *   true
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.putBodyParameter("AutoRenewal", autoRenewal);
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   PrePaid: the subscription billing method.
         * *   PostPaid: the pay-as-you-go billing method.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The number of ECS instances.
         */
        public Builder ecsInstanceCount(Integer ecsInstanceCount) {
            this.putBodyParameter("EcsInstanceCount", ecsInstanceCount);
            this.ecsInstanceCount = ecsInstanceCount;
            return this;
        }

        /**
         * The type of the Elastic Compute Service (ECS) instance.
         */
        public Builder ecsInstanceType(String ecsInstanceType) {
            this.putBodyParameter("EcsInstanceType", ecsInstanceType);
            this.ecsInstanceType = ecsInstanceType;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * 自运维资源组配置选项
         */
        public Builder selfManagedResourceOptions(SelfManagedResourceOptions selfManagedResourceOptions) {
            this.putBodyParameter("SelfManagedResourceOptions", selfManagedResourceOptions);
            this.selfManagedResourceOptions = selfManagedResourceOptions;
            return this;
        }

        /**
         * The size of the system disk. Unit: GiB. Valid values: 200 to 2000. Default value: 200.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putBodyParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * The zone to which the instance belongs.
         */
        public Builder zone(String zone) {
            this.putBodyParameter("Zone", zone);
            this.zone = zone;
            return this;
        }

        @Override
        public CreateResourceRequest build() {
            return new CreateResourceRequest(this);
        } 

    } 

    public static class NodeTolerations extends TeaModel {
        @NameInMap("effect")
        private String effect;

        @NameInMap("key")
        private String key;

        @NameInMap("operator")
        private String operator;

        @NameInMap("value")
        private String value;

        private NodeTolerations(Builder builder) {
            this.effect = builder.effect;
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeTolerations create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String effect; 
            private String key; 
            private String operator; 
            private String value; 

            /**
             * 效果
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * 键名
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 键名和键值的关系
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 键值
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public NodeTolerations build() {
                return new NodeTolerations(this);
            } 

        } 

    }
    public static class SelfManagedResourceOptions extends TeaModel {
        @NameInMap("ExternalClusterId")
        private String externalClusterId;

        @NameInMap("NodeMatchLabels")
        private java.util.Map < String, String > nodeMatchLabels;

        @NameInMap("NodeTolerations")
        private java.util.List < NodeTolerations> nodeTolerations;

        @NameInMap("RoleName")
        private String roleName;

        private SelfManagedResourceOptions(Builder builder) {
            this.externalClusterId = builder.externalClusterId;
            this.nodeMatchLabels = builder.nodeMatchLabels;
            this.nodeTolerations = builder.nodeTolerations;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelfManagedResourceOptions create() {
            return builder().build();
        }

        /**
         * @return externalClusterId
         */
        public String getExternalClusterId() {
            return this.externalClusterId;
        }

        /**
         * @return nodeMatchLabels
         */
        public java.util.Map < String, String > getNodeMatchLabels() {
            return this.nodeMatchLabels;
        }

        /**
         * @return nodeTolerations
         */
        public java.util.List < NodeTolerations> getNodeTolerations() {
            return this.nodeTolerations;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String externalClusterId; 
            private java.util.Map < String, String > nodeMatchLabels; 
            private java.util.List < NodeTolerations> nodeTolerations; 
            private String roleName; 

            /**
             * 自运维集群Id
             */
            public Builder externalClusterId(String externalClusterId) {
                this.externalClusterId = externalClusterId;
                return this;
            }

            /**
             * 节点的标签键值对集合
             */
            public Builder nodeMatchLabels(java.util.Map < String, String > nodeMatchLabels) {
                this.nodeMatchLabels = nodeMatchLabels;
                return this;
            }

            /**
             * 节点污点的容忍度列表
             */
            public Builder nodeTolerations(java.util.List < NodeTolerations> nodeTolerations) {
                this.nodeTolerations = nodeTolerations;
                return this;
            }

            /**
             * 授予云服务PAI-EAS相关权限的RAM角色名称
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public SelfManagedResourceOptions build() {
                return new SelfManagedResourceOptions(this);
            } 

        } 

    }
}
