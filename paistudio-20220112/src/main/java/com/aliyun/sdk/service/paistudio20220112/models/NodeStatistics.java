// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link NodeStatistics} extends {@link TeaModel}
 *
 * <p>NodeStatistics</p>
 */
public class NodeStatistics extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActualMinResources")
    private StatisticsResources actualMinResources;

    @com.aliyun.core.annotation.NameInMap("GPUDetails")
    private java.util.List<GPUDetails> GPUDetails;

    @com.aliyun.core.annotation.NameInMap("HyperNodeDetails")
    private java.util.List<HyperNodeDetails> hyperNodeDetails;

    @com.aliyun.core.annotation.NameInMap("IdleResources")
    private StatisticsResources idleResources;

    @com.aliyun.core.annotation.NameInMap("SchedulableResources")
    private StatisticsResources schedulableResources;

    @com.aliyun.core.annotation.NameInMap("SystemReservedResources")
    private StatisticsResources systemReservedResources;

    private NodeStatistics(Builder builder) {
        this.actualMinResources = builder.actualMinResources;
        this.GPUDetails = builder.GPUDetails;
        this.hyperNodeDetails = builder.hyperNodeDetails;
        this.idleResources = builder.idleResources;
        this.schedulableResources = builder.schedulableResources;
        this.systemReservedResources = builder.systemReservedResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeStatistics create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actualMinResources
     */
    public StatisticsResources getActualMinResources() {
        return this.actualMinResources;
    }

    /**
     * @return GPUDetails
     */
    public java.util.List<GPUDetails> getGPUDetails() {
        return this.GPUDetails;
    }

    /**
     * @return hyperNodeDetails
     */
    public java.util.List<HyperNodeDetails> getHyperNodeDetails() {
        return this.hyperNodeDetails;
    }

    /**
     * @return idleResources
     */
    public StatisticsResources getIdleResources() {
        return this.idleResources;
    }

    /**
     * @return schedulableResources
     */
    public StatisticsResources getSchedulableResources() {
        return this.schedulableResources;
    }

    /**
     * @return systemReservedResources
     */
    public StatisticsResources getSystemReservedResources() {
        return this.systemReservedResources;
    }

    public static final class Builder {
        private StatisticsResources actualMinResources; 
        private java.util.List<GPUDetails> GPUDetails; 
        private java.util.List<HyperNodeDetails> hyperNodeDetails; 
        private StatisticsResources idleResources; 
        private StatisticsResources schedulableResources; 
        private StatisticsResources systemReservedResources; 

        private Builder() {
        } 

        private Builder(NodeStatistics model) {
            this.actualMinResources = model.actualMinResources;
            this.GPUDetails = model.GPUDetails;
            this.hyperNodeDetails = model.hyperNodeDetails;
            this.idleResources = model.idleResources;
            this.schedulableResources = model.schedulableResources;
            this.systemReservedResources = model.systemReservedResources;
        } 

        /**
         * ActualMinResources.
         */
        public Builder actualMinResources(StatisticsResources actualMinResources) {
            this.actualMinResources = actualMinResources;
            return this;
        }

        /**
         * GPUDetails.
         */
        public Builder GPUDetails(java.util.List<GPUDetails> GPUDetails) {
            this.GPUDetails = GPUDetails;
            return this;
        }

        /**
         * HyperNodeDetails.
         */
        public Builder hyperNodeDetails(java.util.List<HyperNodeDetails> hyperNodeDetails) {
            this.hyperNodeDetails = hyperNodeDetails;
            return this;
        }

        /**
         * IdleResources.
         */
        public Builder idleResources(StatisticsResources idleResources) {
            this.idleResources = idleResources;
            return this;
        }

        /**
         * SchedulableResources.
         */
        public Builder schedulableResources(StatisticsResources schedulableResources) {
            this.schedulableResources = schedulableResources;
            return this;
        }

        /**
         * SystemReservedResources.
         */
        public Builder systemReservedResources(StatisticsResources systemReservedResources) {
            this.systemReservedResources = systemReservedResources;
            return this;
        }

        public NodeStatistics build() {
            return new NodeStatistics(this);
        } 

    } 

    /**
     * 
     * {@link NodeStatistics} extends {@link TeaModel}
     *
     * <p>NodeStatistics</p>
     */
    public static class GPUDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("IdleNum")
        private Long idleNum;

        private GPUDetails(Builder builder) {
            this.count = builder.count;
            this.idleNum = builder.idleNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GPUDetails create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return idleNum
         */
        public Long getIdleNum() {
            return this.idleNum;
        }

        public static final class Builder {
            private Long count; 
            private Long idleNum; 

            private Builder() {
            } 

            private Builder(GPUDetails model) {
                this.count = model.count;
                this.idleNum = model.idleNum;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * IdleNum.
             */
            public Builder idleNum(Long idleNum) {
                this.idleNum = idleNum;
                return this;
            }

            public GPUDetails build() {
                return new GPUDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link NodeStatistics} extends {@link TeaModel}
     *
     * <p>NodeStatistics</p>
     */
    public static class HyperNodeDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("IdleNum")
        private Long idleNum;

        private HyperNodeDetails(Builder builder) {
            this.count = builder.count;
            this.idleNum = builder.idleNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HyperNodeDetails create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return idleNum
         */
        public Long getIdleNum() {
            return this.idleNum;
        }

        public static final class Builder {
            private Long count; 
            private Long idleNum; 

            private Builder() {
            } 

            private Builder(HyperNodeDetails model) {
                this.count = model.count;
                this.idleNum = model.idleNum;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * IdleNum.
             */
            public Builder idleNum(Long idleNum) {
                this.idleNum = idleNum;
                return this;
            }

            public HyperNodeDetails build() {
                return new HyperNodeDetails(this);
            } 

        } 

    }
}
