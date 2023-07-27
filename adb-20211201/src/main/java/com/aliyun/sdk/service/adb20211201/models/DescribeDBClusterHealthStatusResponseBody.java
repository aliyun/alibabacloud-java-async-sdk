// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterHealthStatusResponseBody</p>
 */
public class DescribeDBClusterHealthStatusResponseBody extends TeaModel {
    @NameInMap("CS")
    private Cs cs;

    @NameInMap("Executor")
    private Executor executor;

    @NameInMap("InstanceStatus")
    private String instanceStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Worker")
    private Worker worker;

    private DescribeDBClusterHealthStatusResponseBody(Builder builder) {
        this.cs = builder.cs;
        this.executor = builder.executor;
        this.instanceStatus = builder.instanceStatus;
        this.requestId = builder.requestId;
        this.worker = builder.worker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterHealthStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return cs
     */
    public Cs getCs() {
        return this.cs;
    }

    /**
     * @return executor
     */
    public Executor getExecutor() {
        return this.executor;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return worker
     */
    public Worker getWorker() {
        return this.worker;
    }

    public static final class Builder {
        private Cs cs; 
        private Executor executor; 
        private String instanceStatus; 
        private String requestId; 
        private Worker worker; 

        /**
         * CS.
         */
        public Builder cs(Cs cs) {
            this.cs = cs;
            return this;
        }

        /**
         * Executor.
         */
        public Builder executor(Executor executor) {
            this.executor = executor;
            return this;
        }

        /**
         * InstanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
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
         * Worker.
         */
        public Builder worker(Worker worker) {
            this.worker = worker;
            return this;
        }

        public DescribeDBClusterHealthStatusResponseBody build() {
            return new DescribeDBClusterHealthStatusResponseBody(this);
        } 

    } 

    public static class Cs extends TeaModel {
        @NameInMap("ActiveCount")
        private Long activeCount;

        @NameInMap("ExpectedCount")
        private Long expectedCount;

        @NameInMap("RiskCount")
        private Long riskCount;

        @NameInMap("Status")
        private String status;

        @NameInMap("UnavailableCount")
        private Long unavailableCount;

        private Cs(Builder builder) {
            this.activeCount = builder.activeCount;
            this.expectedCount = builder.expectedCount;
            this.riskCount = builder.riskCount;
            this.status = builder.status;
            this.unavailableCount = builder.unavailableCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cs create() {
            return builder().build();
        }

        /**
         * @return activeCount
         */
        public Long getActiveCount() {
            return this.activeCount;
        }

        /**
         * @return expectedCount
         */
        public Long getExpectedCount() {
            return this.expectedCount;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unavailableCount
         */
        public Long getUnavailableCount() {
            return this.unavailableCount;
        }

        public static final class Builder {
            private Long activeCount; 
            private Long expectedCount; 
            private Long riskCount; 
            private String status; 
            private Long unavailableCount; 

            /**
             * ActiveCount.
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * ExpectedCount.
             */
            public Builder expectedCount(Long expectedCount) {
                this.expectedCount = expectedCount;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UnavailableCount.
             */
            public Builder unavailableCount(Long unavailableCount) {
                this.unavailableCount = unavailableCount;
                return this;
            }

            public Cs build() {
                return new Cs(this);
            } 

        } 

    }
    public static class Executor extends TeaModel {
        @NameInMap("ActiveCount")
        private Long activeCount;

        @NameInMap("ExpectedCount")
        private Long expectedCount;

        @NameInMap("RiskCount")
        private Long riskCount;

        @NameInMap("Status")
        private String status;

        @NameInMap("UnavailableCount")
        private Long unavailableCount;

        private Executor(Builder builder) {
            this.activeCount = builder.activeCount;
            this.expectedCount = builder.expectedCount;
            this.riskCount = builder.riskCount;
            this.status = builder.status;
            this.unavailableCount = builder.unavailableCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executor create() {
            return builder().build();
        }

        /**
         * @return activeCount
         */
        public Long getActiveCount() {
            return this.activeCount;
        }

        /**
         * @return expectedCount
         */
        public Long getExpectedCount() {
            return this.expectedCount;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unavailableCount
         */
        public Long getUnavailableCount() {
            return this.unavailableCount;
        }

        public static final class Builder {
            private Long activeCount; 
            private Long expectedCount; 
            private Long riskCount; 
            private String status; 
            private Long unavailableCount; 

            /**
             * ActiveCount.
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * ExpectedCount.
             */
            public Builder expectedCount(Long expectedCount) {
                this.expectedCount = expectedCount;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UnavailableCount.
             */
            public Builder unavailableCount(Long unavailableCount) {
                this.unavailableCount = unavailableCount;
                return this;
            }

            public Executor build() {
                return new Executor(this);
            } 

        } 

    }
    public static class Worker extends TeaModel {
        @NameInMap("ActiveCount")
        private Long activeCount;

        @NameInMap("ExpectedCount")
        private Long expectedCount;

        @NameInMap("RiskCount")
        private Long riskCount;

        @NameInMap("Status")
        private String status;

        @NameInMap("UnavailableCount")
        private Long unavailableCount;

        private Worker(Builder builder) {
            this.activeCount = builder.activeCount;
            this.expectedCount = builder.expectedCount;
            this.riskCount = builder.riskCount;
            this.status = builder.status;
            this.unavailableCount = builder.unavailableCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Worker create() {
            return builder().build();
        }

        /**
         * @return activeCount
         */
        public Long getActiveCount() {
            return this.activeCount;
        }

        /**
         * @return expectedCount
         */
        public Long getExpectedCount() {
            return this.expectedCount;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unavailableCount
         */
        public Long getUnavailableCount() {
            return this.unavailableCount;
        }

        public static final class Builder {
            private Long activeCount; 
            private Long expectedCount; 
            private Long riskCount; 
            private String status; 
            private Long unavailableCount; 

            /**
             * ActiveCount.
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * ExpectedCount.
             */
            public Builder expectedCount(Long expectedCount) {
                this.expectedCount = expectedCount;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UnavailableCount.
             */
            public Builder unavailableCount(Long unavailableCount) {
                this.unavailableCount = unavailableCount;
                return this;
            }

            public Worker build() {
                return new Worker(this);
            } 

        } 

    }
}
