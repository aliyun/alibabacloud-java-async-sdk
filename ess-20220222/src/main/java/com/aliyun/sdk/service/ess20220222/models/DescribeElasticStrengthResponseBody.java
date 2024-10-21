// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
    private java.util.List < ElasticStrengthModels> elasticStrengthModels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourcePools")
    private java.util.List < ResourcePools> resourcePools;

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
    public java.util.List < ElasticStrengthModels> getElasticStrengthModels() {
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
    public java.util.List < ResourcePools> getResourcePools() {
        return this.resourcePools;
    }

    /**
     * @return totalStrength
     */
    public Double getTotalStrength() {
        return this.totalStrength;
    }

    public static final class Builder {
        private java.util.List < ElasticStrengthModels> elasticStrengthModels; 
        private String requestId; 
        private java.util.List < ResourcePools> resourcePools; 
        private Double totalStrength; 

        /**
         * ElasticStrengthModels.
         */
        public Builder elasticStrengthModels(java.util.List < ElasticStrengthModels> elasticStrengthModels) {
            this.elasticStrengthModels = elasticStrengthModels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourcePools.
         */
        public Builder resourcePools(java.util.List < ResourcePools> resourcePools) {
            this.resourcePools = resourcePools;
            return this;
        }

        /**
         * TotalStrength.
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
    public static class ElasticStrengthModelsResourcePools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Strength")
        private Double strength;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ElasticStrengthModelsResourcePools(Builder builder) {
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
        public java.util.List < String > getVSwitchIds() {
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
            private java.util.List < String > vSwitchIds; 
            private String zoneId; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * Strength.
             */
            public Builder strength(Double strength) {
                this.strength = strength;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * ZoneId.
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
        @com.aliyun.core.annotation.NameInMap("ResourcePools")
        private java.util.List < ElasticStrengthModelsResourcePools> resourcePools;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("TotalStrength")
        private Double totalStrength;

        private ElasticStrengthModels(Builder builder) {
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
         * @return resourcePools
         */
        public java.util.List < ElasticStrengthModelsResourcePools> getResourcePools() {
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
            private java.util.List < ElasticStrengthModelsResourcePools> resourcePools; 
            private String scalingGroupId; 
            private Double totalStrength; 

            /**
             * ResourcePools.
             */
            public Builder resourcePools(java.util.List < ElasticStrengthModelsResourcePools> resourcePools) {
                this.resourcePools = resourcePools;
                return this;
            }

            /**
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * TotalStrength.
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
        private java.util.List < String > vSwitchIds;

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
        public java.util.List < String > getVSwitchIds() {
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
            private java.util.List < String > vSwitchIds; 
            private String zoneId; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * Strength.
             */
            public Builder strength(Double strength) {
                this.strength = strength;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * ZoneId.
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
