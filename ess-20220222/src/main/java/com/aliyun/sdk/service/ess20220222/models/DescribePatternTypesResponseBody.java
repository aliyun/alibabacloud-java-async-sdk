// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePatternTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePatternTypesResponseBody</p>
 */
public class DescribePatternTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PatternTypes")
    private java.util.List < PatternTypes> patternTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePatternTypesResponseBody(Builder builder) {
        this.patternTypes = builder.patternTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePatternTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return patternTypes
     */
    public java.util.List < PatternTypes> getPatternTypes() {
        return this.patternTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PatternTypes> patternTypes; 
        private String requestId; 

        /**
         * The instance types that meet the specified requirements.
         */
        public Builder patternTypes(java.util.List < PatternTypes> patternTypes) {
            this.patternTypes = patternTypes;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePatternTypesResponseBody build() {
            return new DescribePatternTypesResponseBody(this);
        } 

    } 

    public static class PatternTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private Integer cores;

        @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        private PatternTypes(Builder builder) {
            this.cores = builder.cores;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.instanceType = builder.instanceType;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PatternTypes create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return instanceFamilyLevel
         */
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Integer cores; 
            private String instanceFamilyLevel; 
            private String instanceType; 
            private String instanceTypeFamily; 
            private Float memory; 

            /**
             * The number of vCPUs that are assigned to the instance type.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * The level of the instance family.
             * <p>
             * 
             * *   EntryLevel: entry level (shared instance types) Instance types of this level are the most cost-effective but may not provide stable computing performance. Instance types of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see [Shared instance families](~~108489~~).
             * *   EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources and are suitable for scenarios that require high stability. For more information, see [Overview of instance families](~~25378~~).
             * *   CreditEntryLevel: credit-based entry level (burstable instance types). CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see [Overview of burstable instances](~~59977~~).
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * The name of the instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The instance family.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * The memory size that are assigned to the instance type. Unit: GiB.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public PatternTypes build() {
                return new PatternTypes(this);
            } 

        } 

    }
}
