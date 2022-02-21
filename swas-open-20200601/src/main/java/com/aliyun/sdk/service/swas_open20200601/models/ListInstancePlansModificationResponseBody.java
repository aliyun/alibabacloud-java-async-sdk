// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancePlansModificationResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancePlansModificationResponseBody</p>
 */
public class ListInstancePlansModificationResponseBody extends TeaModel {
    @NameInMap("Plans")
    private java.util.List < Plans> plans;

    @NameInMap("RequestId")
    private String requestId;

    private ListInstancePlansModificationResponseBody(Builder builder) {
        this.plans = builder.plans;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancePlansModificationResponseBody create() {
        return builder().build();
    }

    /**
     * @return plans
     */
    public java.util.List < Plans> getPlans() {
        return this.plans;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Plans> plans; 
        private String requestId; 

        /**
         * Plans.
         */
        public Builder plans(java.util.List < Plans> plans) {
            this.plans = plans;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancePlansModificationResponseBody build() {
            return new ListInstancePlansModificationResponseBody(this);
        } 

    } 

    public static class Plans extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("Core")
        private Integer core;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("DiskSize")
        private Integer diskSize;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("Flow")
        private Integer flow;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("OriginPrice")
        private Double originPrice;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("SupportPlatform")
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
            private String supportPlatform; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * Core.
             */
            public Builder core(Integer core) {
                this.core = core;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * Flow.
             */
            public Builder flow(Integer flow) {
                this.flow = flow;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * OriginPrice.
             */
            public Builder originPrice(Double originPrice) {
                this.originPrice = originPrice;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * SupportPlatform.
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
