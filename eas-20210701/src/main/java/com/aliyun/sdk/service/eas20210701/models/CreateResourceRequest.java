// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceRequest</p>
 */
public class CreateResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcsInstanceCount")
    private Integer ecsInstanceCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcsInstanceType")
    private String ecsInstanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SelfManagedResourceOptions")
    private SelfManagedResourceOptions selfManagedResourceOptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    @com.aliyun.core.annotation.Validation(maximum = 2000, minimum = 200)
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Zone")
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
         * Specifies whether to enable auto-renewal. Valid values:
         * <p>
         * 
         * *   false (default)
         * *   true
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.putBodyParameter("AutoRenewal", autoRenewal);
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * The billing method. Valid values:
         * <p>
         * 
         * *   PrePaid: the subscription billing method.
         * *   PostPaid: the pay-as-you-go billing method.
         * 
         * >  This parameter is required when the ResourceType parameter is set to Dedicated.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The number of ECS instances.
         * <p>
         * 
         * >  This parameter is required when the ResourceType parameter is set to Dedicated.
         */
        public Builder ecsInstanceCount(Integer ecsInstanceCount) {
            this.putBodyParameter("EcsInstanceCount", ecsInstanceCount);
            this.ecsInstanceCount = ecsInstanceCount;
            return this;
        }

        /**
         * The type of the Elastic Compute Service (ECS) instance.
         * <p>
         * 
         * >  This parameter is required when the ResourceType parameter is set to Dedicated.
         */
        public Builder ecsInstanceType(String ecsInstanceType) {
            this.putBodyParameter("EcsInstanceType", ecsInstanceType);
            this.ecsInstanceType = ecsInstanceType;
            return this;
        }

        /**
         * The type of the resource group. Valid values:
         * <p>
         * 
         * *   Dedicated: the dedicated resource group.
         * *   SelfManaged: the self-managed resource group.
         * 
         * >  If you use a self-managed resource group, you must configure a whitelist.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The configurations of the self-managed resource group.
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
         * The ID of the zone in which the instance resides.
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
        @com.aliyun.core.annotation.NameInMap("effect")
        private String effect;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("value")
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
             * The result.
             * <p>
             * 
             * Valid values:
             * 
             * *   PreferNoSchedule
             * *   NoSchedule
             * *   NoExecute
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * The key name.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The relationship between key names and key values.
             * <p>
             * 
             * Valid values:
             * 
             * *   Equal
             * *   Exists
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The key value.
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
        @com.aliyun.core.annotation.NameInMap("ExternalClusterId")
        private String externalClusterId;

        @com.aliyun.core.annotation.NameInMap("NodeMatchLabels")
        private java.util.Map < String, String > nodeMatchLabels;

        @com.aliyun.core.annotation.NameInMap("NodeTolerations")
        private java.util.List < NodeTolerations> nodeTolerations;

        @com.aliyun.core.annotation.NameInMap("RoleName")
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
             * The ID of the self-managed cluster.
             */
            public Builder externalClusterId(String externalClusterId) {
                this.externalClusterId = externalClusterId;
                return this;
            }

            /**
             * The tag key-value pairs for nodes.
             */
            public Builder nodeMatchLabels(java.util.Map < String, String > nodeMatchLabels) {
                this.nodeMatchLabels = nodeMatchLabels;
                return this;
            }

            /**
             * Tolerations for nodes.
             */
            public Builder nodeTolerations(java.util.List < NodeTolerations> nodeTolerations) {
                this.nodeTolerations = nodeTolerations;
                return this;
            }

            /**
             * The name of the RAM user to which the permissions on Elastic Algorithm Service of Platform for AI (PAI-EAS) are granted.
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
