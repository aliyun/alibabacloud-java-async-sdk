// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeDBClusterHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterHealthStatusResponseBody</p>
 */
public class DescribeDBClusterHealthStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("CS")
    private Cs cs;

    @com.aliyun.core.annotation.NameInMap("Executor")
    private Executor executor;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Worker")
    private Worker worker;

    private DescribeDBClusterHealthStatusResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private Cs cs; 
        private Executor executor; 
        private String instanceStatus; 
        private String requestId; 
        private Worker worker; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterHealthStatusResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.cs = model.cs;
            this.executor = model.executor;
            this.instanceStatus = model.instanceStatus;
            this.requestId = model.requestId;
            this.worker = model.worker;
        } 

        /**
         * <p>The details of the authentication failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Authentication failed.</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The list of instance access node statuses.</p>
         */
        public Builder cs(Cs cs) {
            this.cs = cs;
            return this;
        }

        /**
         * <p>The list of health statuses for compute node groups.</p>
         */
        public Builder executor(Executor executor) {
            this.executor = executor;
            return this;
        }

        /**
         * <p>The health status of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>RISK</strong>: At risk.</li>
         * <li><strong>NORMAL</strong>: Healthy.</li>
         * <li><strong>UNAVAILABLE</strong>: Unavailable.<blockquote>
         * <p>If the instance access node status, compute node group health status, and storage node group health status are all <strong>Healthy</strong> and the instance health check succeeds, the cluster health status is <strong>Healthy</strong>. If any of the three statuses is <strong>At risk</strong>, the cluster health status is <strong>At risk</strong>. If any of the three statuses is <strong>Unavailable</strong>, the cluster health status is <strong>Unavailable</strong>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CAV</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of health statuses for storage node groups.</p>
         */
        public Builder worker(Worker worker) {
            this.worker = worker;
            return this;
        }

        public DescribeDBClusterHealthStatusResponseBody build() {
            return new DescribeDBClusterHealthStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterHealthStatusResponseBody</p>
     */
    public static class Cs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCount")
        private Long activeCount;

        @com.aliyun.core.annotation.NameInMap("ExpectedCount")
        private Long expectedCount;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Long riskCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UnavailableCount")
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

            private Builder() {
            } 

            private Builder(Cs model) {
                this.activeCount = model.activeCount;
                this.expectedCount = model.expectedCount;
                this.riskCount = model.riskCount;
                this.status = model.status;
                this.unavailableCount = model.unavailableCount;
            } 

            /**
             * <p>The number of healthy nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * <p>The total number of access nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder expectedCount(Long expectedCount) {
                this.expectedCount = expectedCount;
                return this;
            }

            /**
             * <p>The number of nodes at risk.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>The status of instance access nodes. Valid values:</p>
             * <ul>
             * <li><strong>RISK</strong>: At risk.</li>
             * <li><strong>NORMAL</strong>: Healthy.</li>
             * <li><strong>UNAVAILABLE</strong>: Unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UNAVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of unavailable nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeDBClusterHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterHealthStatusResponseBody</p>
     */
    public static class Executor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCount")
        private Long activeCount;

        @com.aliyun.core.annotation.NameInMap("ExpectedCount")
        private Long expectedCount;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Long riskCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UnavailableCount")
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

            private Builder() {
            } 

            private Builder(Executor model) {
                this.activeCount = model.activeCount;
                this.expectedCount = model.expectedCount;
                this.riskCount = model.riskCount;
                this.status = model.status;
                this.unavailableCount = model.unavailableCount;
            } 

            /**
             * <p>The number of healthy nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * <p>The total number of compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder expectedCount(Long expectedCount) {
                this.expectedCount = expectedCount;
                return this;
            }

            /**
             * <p>The number of nodes at risk.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>The health status of compute node groups. Valid values:</p>
             * <ul>
             * <li><strong>RISK</strong>: At risk.</li>
             * <li><strong>NORMAL</strong>: Healthy.</li>
             * <li><strong>UNAVAILABLE</strong>: Unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UNAVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of unavailable nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeDBClusterHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterHealthStatusResponseBody</p>
     */
    public static class Worker extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCount")
        private Long activeCount;

        @com.aliyun.core.annotation.NameInMap("ExpectedCount")
        private Long expectedCount;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Long riskCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UnavailableCount")
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

            private Builder() {
            } 

            private Builder(Worker model) {
                this.activeCount = model.activeCount;
                this.expectedCount = model.expectedCount;
                this.riskCount = model.riskCount;
                this.status = model.status;
                this.unavailableCount = model.unavailableCount;
            } 

            /**
             * <p>The number of healthy storage node groups.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * <p>The total number of storage node groups.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder expectedCount(Long expectedCount) {
                this.expectedCount = expectedCount;
                return this;
            }

            /**
             * <p>The number of storage node groups at risk.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>The health status of storage node groups. Valid values:</p>
             * <ul>
             * <li><strong>RISK</strong>: At risk.</li>
             * <li><strong>NORMAL</strong>: Healthy.</li>
             * <li><strong>UNAVAILABLE</strong>: Unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UNAVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of unavailable storage node groups.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
