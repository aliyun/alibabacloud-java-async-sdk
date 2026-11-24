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
 * {@link DescribePatternTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePatternTypesResponseBody</p>
 */
public class DescribePatternTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PatternTypes")
    private java.util.List<PatternTypes> patternTypes;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return patternTypes
     */
    public java.util.List<PatternTypes> getPatternTypes() {
        return this.patternTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PatternTypes> patternTypes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePatternTypesResponseBody model) {
            this.patternTypes = model.patternTypes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance types that meet the specified requirements.</p>
         */
        public Builder patternTypes(java.util.List<PatternTypes> patternTypes) {
            this.patternTypes = patternTypes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePatternTypesResponseBody build() {
            return new DescribePatternTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePatternTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePatternTypesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PatternTypes model) {
                this.cores = model.cores;
                this.instanceFamilyLevel = model.instanceFamilyLevel;
                this.instanceType = model.instanceType;
                this.instanceTypeFamily = model.instanceTypeFamily;
                this.memory = model.memory;
            } 

            /**
             * <p>The number of vCPUs for the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The level of the instance family.</p>
             * <ul>
             * <li>EntryLevel: Entry-level. This level refers to shared instance types. These instance types are more cost-effective but cannot guarantee stable computing performance. They are suitable for business scenarios with low CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance types</a>.</li>
             * <li>EnterpriseLevel: Enterprise-level. These instance types provide stable performance and dedicated resources, and are suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
             * <li>CreditEntryLevel: Credit entry-level. This level refers to burstable instances. These instance types use CPU credits to ensure computing performance and are suitable for business scenarios with low CPU utilization but occasional spikes in CPU usage. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instances</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EnterpriseLevel</p>
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * <p>The name of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c7.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The instance family.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c7</p>
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * <p>The memory size of the instance type. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
