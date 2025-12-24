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
 * {@link DescribeInstanceCreateAndDeleteStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceCreateAndDeleteStatisticsResponseBody</p>
 */
public class DescribeInstanceCreateAndDeleteStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceCreateAndDeleteStatistics")
    private InstanceCreateAndDeleteStatistics instanceCreateAndDeleteStatistics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceCreateAndDeleteStatisticsResponseBody(Builder builder) {
        this.instanceCreateAndDeleteStatistics = builder.instanceCreateAndDeleteStatistics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceCreateAndDeleteStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceCreateAndDeleteStatistics
     */
    public InstanceCreateAndDeleteStatistics getInstanceCreateAndDeleteStatistics() {
        return this.instanceCreateAndDeleteStatistics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceCreateAndDeleteStatistics instanceCreateAndDeleteStatistics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceCreateAndDeleteStatisticsResponseBody model) {
            this.instanceCreateAndDeleteStatistics = model.instanceCreateAndDeleteStatistics;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceCreateAndDeleteStatistics.
         */
        public Builder instanceCreateAndDeleteStatistics(InstanceCreateAndDeleteStatistics instanceCreateAndDeleteStatistics) {
            this.instanceCreateAndDeleteStatistics = instanceCreateAndDeleteStatistics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceCreateAndDeleteStatisticsResponseBody build() {
            return new DescribeInstanceCreateAndDeleteStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceCreateAndDeleteStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceCreateAndDeleteStatisticsResponseBody</p>
     */
    public static class Statistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedVmCount")
        private Integer createdVmCount;

        @com.aliyun.core.annotation.NameInMap("DestroyedVmCount")
        private Integer destroyedVmCount;

        @com.aliyun.core.annotation.NameInMap("StartedVmCount")
        private Integer startedVmCount;

        @com.aliyun.core.annotation.NameInMap("StoppedVmCount")
        private Integer stoppedVmCount;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private Statistic(Builder builder) {
            this.createdVmCount = builder.createdVmCount;
            this.destroyedVmCount = builder.destroyedVmCount;
            this.startedVmCount = builder.startedVmCount;
            this.stoppedVmCount = builder.stoppedVmCount;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistic create() {
            return builder().build();
        }

        /**
         * @return createdVmCount
         */
        public Integer getCreatedVmCount() {
            return this.createdVmCount;
        }

        /**
         * @return destroyedVmCount
         */
        public Integer getDestroyedVmCount() {
            return this.destroyedVmCount;
        }

        /**
         * @return startedVmCount
         */
        public Integer getStartedVmCount() {
            return this.startedVmCount;
        }

        /**
         * @return stoppedVmCount
         */
        public Integer getStoppedVmCount() {
            return this.stoppedVmCount;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer createdVmCount; 
            private Integer destroyedVmCount; 
            private Integer startedVmCount; 
            private Integer stoppedVmCount; 
            private String time; 

            private Builder() {
            } 

            private Builder(Statistic model) {
                this.createdVmCount = model.createdVmCount;
                this.destroyedVmCount = model.destroyedVmCount;
                this.startedVmCount = model.startedVmCount;
                this.stoppedVmCount = model.stoppedVmCount;
                this.time = model.time;
            } 

            /**
             * CreatedVmCount.
             */
            public Builder createdVmCount(Integer createdVmCount) {
                this.createdVmCount = createdVmCount;
                return this;
            }

            /**
             * DestroyedVmCount.
             */
            public Builder destroyedVmCount(Integer destroyedVmCount) {
                this.destroyedVmCount = destroyedVmCount;
                return this;
            }

            /**
             * StartedVmCount.
             */
            public Builder startedVmCount(Integer startedVmCount) {
                this.startedVmCount = startedVmCount;
                return this;
            }

            /**
             * StoppedVmCount.
             */
            public Builder stoppedVmCount(Integer stoppedVmCount) {
                this.stoppedVmCount = stoppedVmCount;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public Statistic build() {
                return new Statistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceCreateAndDeleteStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceCreateAndDeleteStatisticsResponseBody</p>
     */
    public static class InstanceCreateAndDeleteStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Statistic")
        private java.util.List<Statistic> statistic;

        private InstanceCreateAndDeleteStatistics(Builder builder) {
            this.statistic = builder.statistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceCreateAndDeleteStatistics create() {
            return builder().build();
        }

        /**
         * @return statistic
         */
        public java.util.List<Statistic> getStatistic() {
            return this.statistic;
        }

        public static final class Builder {
            private java.util.List<Statistic> statistic; 

            private Builder() {
            } 

            private Builder(InstanceCreateAndDeleteStatistics model) {
                this.statistic = model.statistic;
            } 

            /**
             * Statistic.
             */
            public Builder statistic(java.util.List<Statistic> statistic) {
                this.statistic = statistic;
                return this;
            }

            public InstanceCreateAndDeleteStatistics build() {
                return new InstanceCreateAndDeleteStatistics(this);
            } 

        } 

    }
}
