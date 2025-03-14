// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link ListPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListPlansResponseBody</p>
 */
public class ListPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Plans")
    private java.util.List<Plans> plans;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPlansResponseBody(Builder builder) {
        this.plans = builder.plans;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPlansResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return plans
     */
    public java.util.List<Plans> getPlans() {
        return this.plans;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Plans> plans; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPlansResponseBody model) {
            this.plans = model.plans;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the plans.</p>
         */
        public Builder plans(java.util.List<Plans> plans) {
            this.plans = plans;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPlansResponseBody build() {
            return new ListPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListPlansResponseBody</p>
     */
    public static class Plans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("Core")
        private Integer core;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("Flow")
        private Integer flow;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("OriginPrice")
        private Double originPrice;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("SupportPlatform")
        private String supportPlatform;

        private Plans(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.core = builder.core;
            this.currency = builder.currency;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.flow = builder.flow;
            this.memory = builder.memory;
            this.originPrice = builder.originPrice;
            this.planId = builder.planId;
            this.planType = builder.planType;
            this.supportPlatform = builder.supportPlatform;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plans create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return core
         */
        public Integer getCore() {
            return this.core;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return flow
         */
        public Integer getFlow() {
            return this.flow;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return originPrice
         */
        public Double getOriginPrice() {
            return this.originPrice;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return supportPlatform
         */
        public String getSupportPlatform() {
            return this.supportPlatform;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private Integer core; 
            private String currency; 
            private Integer diskSize; 
            private String diskType; 
            private Integer flow; 
            private Integer memory; 
            private Double originPrice; 
            private String planId; 
            private String planType; 
            private String supportPlatform; 

            private Builder() {
            } 

            private Builder(Plans model) {
                this.bandwidth = model.bandwidth;
                this.core = model.core;
                this.currency = model.currency;
                this.diskSize = model.diskSize;
                this.diskType = model.diskType;
                this.flow = model.flow;
                this.memory = model.memory;
                this.originPrice = model.originPrice;
                this.planId = model.planId;
                this.planType = model.planType;
                this.supportPlatform = model.supportPlatform;
            } 

            /**
             * <p>The peak bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder core(Integer core) {
                this.core = core;
                return this;
            }

            /**
             * <p>The unit of the plan price. Valid values:</p>
             * <ul>
             * <li>CNY</li>
             * <li>USD</li>
             * </ul>
             * <blockquote>
             * <p> CNY is for the China site (aliyun.com). USD is for the international site (alibabacloud.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The category of the disk. Valid values:</p>
             * <ul>
             * <li>SSD: standard SSDs</li>
             * <li>ESSD: enhanced SSDs</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ESSD</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The monthly data transfer quota. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder flow(Integer flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The monthly price of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder originPrice(Double originPrice) {
                this.originPrice = originPrice;
                return this;
            }

            /**
             * <p>The ID of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>swas.s2.c2m1s40b3t04</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * PlanType.
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * <p>The operating system types supported by the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Linux&quot;,&quot;Windows&quot;]</p>
             */
            public Builder supportPlatform(String supportPlatform) {
                this.supportPlatform = supportPlatform;
                return this;
            }

            public Plans build() {
                return new Plans(this);
            } 

        } 

    }
}
