// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DescribeElasticStrengthResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticStrengthResponseBody</p>
 */
public class DescribeElasticStrengthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticStrengthModels")
    private java.util.List<ElasticStrengthModels> elasticStrengthModels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourcePools")
    private java.util.List<ResourcePools> resourcePools;

    @com.aliyun.core.annotation.NameInMap("TotalStrength")
    private Double totalStrength;

    private DescribeElasticStrengthResponseBody(Builder builder) {
        this.elasticStrengthModels = builder.elasticStrengthModels;
        this.requestId = builder.requestId;
        this.resourcePools = builder.resourcePools;
        this.totalStrength = builder.totalStrength;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticStrengthResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticStrengthModels
     */
    public java.util.List<ElasticStrengthModels> getElasticStrengthModels() {
        return this.elasticStrengthModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourcePools
     */
    public java.util.List<ResourcePools> getResourcePools() {
        return this.resourcePools;
    }

    /**
     * @return totalStrength
     */
    public Double getTotalStrength() {
        return this.totalStrength;
    }

    public static final class Builder {
        private java.util.List<ElasticStrengthModels> elasticStrengthModels; 
        private String requestId; 
        private java.util.List<ResourcePools> resourcePools; 
        private Double totalStrength; 

        /**
         * <p>The scaling strength models.</p>
         */
        public Builder elasticStrengthModels(java.util.List<ElasticStrengthModels> elasticStrengthModels) {
            this.elasticStrengthModels = elasticStrengthModels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>73469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource pools.</p>
         */
        public Builder resourcePools(java.util.List<ResourcePools> resourcePools) {
            this.resourcePools = resourcePools;
            return this;
        }

        /**
         * <p>The scaling strength score of the scaling group. Each combination of instance type + zone is scored from 0 to 1 based on its availability, with 0 being the weakest scaling strength and 1 being the strongest. The scaling strength score of the scaling group is measured by the combined scores of all the combinations of instance type + zone.</p>
         * <p>**</p>
         * <p><strong>Warning</strong> This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        public Builder totalStrength(Double totalStrength) {
            this.totalStrength = totalStrength;
            return this;
        }

        public DescribeElasticStrengthResponseBody build() {
            return new DescribeElasticStrengthResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeElasticStrengthResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticStrengthResponseBody</p>
     */
    public static class InventoryHealth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdequacyScore")
        private Integer adequacyScore;

        @com.aliyun.core.annotation.NameInMap("HealthScore")
        private Integer healthScore;

        @com.aliyun.core.annotation.NameInMap("HotScore")
        private Integer hotScore;

        @com.aliyun.core.annotation.NameInMap("SupplyScore")
        private Integer supplyScore;

        private InventoryHealth(Builder builder) {
            this.adequacyScore = builder.adequacyScore;
            this.healthScore = builder.healthScore;
            this.hotScore = builder.hotScore;
            this.supplyScore = builder.supplyScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InventoryHealth create() {
            return builder().build();
        }

        /**
         * @return adequacyScore
         */
        public Integer getAdequacyScore() {
            return this.adequacyScore;
        }

        /**
         * @return healthScore
         */
        public Integer getHealthScore() {
            return this.healthScore;
        }

        /**
         * @return hotScore
         */
        public Integer getHotScore() {
            return this.hotScore;
        }

        /**
         * @return supplyScore
         */
        public Integer getSupplyScore() {
            return this.supplyScore;
        }

        public static final class Builder {
            private Integer adequacyScore; 
            private Integer healthScore; 
            private Integer hotScore; 
            private Integer supplyScore; 

            /**
             * <p>The adequacy score.</p>
             * <p>Valid values: 0 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder adequacyScore(Integer adequacyScore) {
                this.adequacyScore = adequacyScore;
                return this;
            }

            /**
             * <p>The score of the inventory health.</p>
             * <ul>
             * <li>A score between 5 and 6 indicates a sufficient inventory.</li>
             * <li>A score between 1 and 4 indicates that there is no guarantee of a sufficient inventory. Select a reservation as necessary.</li>
             * <li>A score between -3 and 0 indicates that the inventory is sufficient, and an alert is triggered. Select another instance type.</li>
             * </ul>
             * <p>Calculation formula: <code>HealthScore</code> = <code>AdequacyScore</code> + <code>SupplyScore</code> - <code>HotScore</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthScore(Integer healthScore) {
                this.healthScore = healthScore;
                return this;
            }

            /**
             * <p>The popularity score.</p>
             * <p>Valid values: 0 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hotScore(Integer hotScore) {
                this.hotScore = hotScore;
                return this;
            }

            /**
             * <p>The score of the replenishment capability.</p>
             * <p>Valid values: 0 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder supplyScore(Integer supplyScore) {
                this.supplyScore = supplyScore;
                return this;
            }

            public InventoryHealth build() {
                return new InventoryHealth(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeElasticStrengthResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticStrengthResponseBody</p>
     */
    public static class ElasticStrengthModelsResourcePools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InventoryHealth")
        private InventoryHealth inventoryHealth;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Strength")
        private Double strength;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ElasticStrengthModelsResourcePools(Builder builder) {
            this.code = builder.code;
            this.instanceType = builder.instanceType;
            this.inventoryHealth = builder.inventoryHealth;
            this.msg = builder.msg;
            this.status = builder.status;
            this.strength = builder.strength;
            this.vSwitchIds = builder.vSwitchIds;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticStrengthModelsResourcePools create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return inventoryHealth
         */
        public InventoryHealth getInventoryHealth() {
            return this.inventoryHealth;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strength
         */
        public Double getStrength() {
            return this.strength;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String code; 
            private String instanceType; 
            private InventoryHealth inventoryHealth; 
            private String msg; 
            private String status; 
            private Double strength; 
            private java.util.List<String> vSwitchIds; 
            private String zoneId; 

            /**
             * <p>The error code returned when the scaling strength is the weakest.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceTypesOrDiskTypesNotSupported</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The instance type of the resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.r7.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The inventory health.</p>
             */
            public Builder inventoryHealth(InventoryHealth inventoryHealth) {
                this.inventoryHealth = inventoryHealth;
                return this;
            }

            /**
             * <p>The error message returned when the scaling strength is the weakest.</p>
             * 
             * <strong>example:</strong>
             * <p>The instanceTypes or diskTypes are not supported.</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>Indicates whether the resource pool is available. Valid values:</p>
             * <ul>
             * <li>Available</li>
             * <li>Unavailable (If a constraint is not provided, the instance type is not deployed, or the instance type is out of stock, the resource pool becomes unavailable.)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The scaling strength of the resource pool.</p>
             * <p>**</p>
             * <p><strong>Warning</strong> This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder strength(Double strength) {
                this.strength = strength;
                return this;
            }

            /**
             * <p>The IDs of the vSwitches in the zones of the resource pool.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The zone ID of the resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ElasticStrengthModelsResourcePools build() {
                return new ElasticStrengthModelsResourcePools(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeElasticStrengthResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticStrengthResponseBody</p>
     */
    public static class ElasticStrengthModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticStrength")
        private String elasticStrength;

        @com.aliyun.core.annotation.NameInMap("ResourcePools")
        private java.util.List<ElasticStrengthModelsResourcePools> resourcePools;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("TotalStrength")
        private Double totalStrength;

        private ElasticStrengthModels(Builder builder) {
            this.elasticStrength = builder.elasticStrength;
            this.resourcePools = builder.resourcePools;
            this.scalingGroupId = builder.scalingGroupId;
            this.totalStrength = builder.totalStrength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticStrengthModels create() {
            return builder().build();
        }

        /**
         * @return elasticStrength
         */
        public String getElasticStrength() {
            return this.elasticStrength;
        }

        /**
         * @return resourcePools
         */
        public java.util.List<ElasticStrengthModelsResourcePools> getResourcePools() {
            return this.resourcePools;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return totalStrength
         */
        public Double getTotalStrength() {
            return this.totalStrength;
        }

        public static final class Builder {
            private String elasticStrength; 
            private java.util.List<ElasticStrengthModelsResourcePools> resourcePools; 
            private String scalingGroupId; 
            private Double totalStrength; 

            /**
             * <p>The scaling strength level of the scaling group. Valid values:</p>
             * <ul>
             * <li>Strong</li>
             * <li>Medium</li>
             * <li>Weak</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Strong</p>
             */
            public Builder elasticStrength(String elasticStrength) {
                this.elasticStrength = elasticStrength;
                return this;
            }

            /**
             * <p>The resource pools.</p>
             */
            public Builder resourcePools(java.util.List<ElasticStrengthModelsResourcePools> resourcePools) {
                this.resourcePools = resourcePools;
                return this;
            }

            /**
             * <p>The ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-wz98mnj7nblv9gc****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The scaling strength score of the scaling group. Each combination of instance type + zone is scored from 0 to 1 based on its availability, with 0 being the weakest scaling strength and 1 being the strongest. The scaling strength score of the scaling group is measured by the combined scores of all the combinations of instance type + zone.</p>
             * <p>**</p>
             * <p><strong>Warning</strong> This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5</p>
             */
            public Builder totalStrength(Double totalStrength) {
                this.totalStrength = totalStrength;
                return this;
            }

            public ElasticStrengthModels build() {
                return new ElasticStrengthModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeElasticStrengthResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticStrengthResponseBody</p>
     */
    public static class ResourcePools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Strength")
        private Double strength;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ResourcePools(Builder builder) {
            this.code = builder.code;
            this.instanceType = builder.instanceType;
            this.msg = builder.msg;
            this.strength = builder.strength;
            this.vSwitchIds = builder.vSwitchIds;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePools create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return strength
         */
        public Double getStrength() {
            return this.strength;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String code; 
            private String instanceType; 
            private String msg; 
            private Double strength; 
            private java.util.List<String> vSwitchIds; 
            private String zoneId; 

            /**
             * <p>The error code returned when the scaling strength is the weakest.</p>
             * 
             * <strong>example:</strong>
             * <p>IMG_NOT_SUPPORTED</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The instance type of the resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c7t.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The error message returned when the scaling strength is the weakest.</p>
             * 
             * <strong>example:</strong>
             * <p>The instanceType does not support the image in the configuration.</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The scaling strength of the resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder strength(Double strength) {
                this.strength = strength;
                return this;
            }

            /**
             * <p>The IDs of the vSwitches in the zones of the resource pool.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The zone ID of the resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ResourcePools build() {
                return new ResourcePools(this);
            } 

        } 

    }
}
