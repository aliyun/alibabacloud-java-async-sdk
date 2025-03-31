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
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The access nodes of the queried cluster.</p>
         */
        public Builder cs(Cs cs) {
            this.cs = cs;
            return this;
        }

        /**
         * <p>The compute node groups of the queried cluster.</p>
         */
        public Builder executor(Executor executor) {
            this.executor = executor;
            return this;
        }

        /**
         * <p>The health state of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>RISK</strong></li>
         * <li><strong>NORMAL</strong></li>
         * <li><strong>UNAVAILABLE</strong></li>
         * </ul>
         * <blockquote>
         * <p> When the states of the access nodes, compute node groups, and storage node groups of a cluster are all <strong>NORMAL</strong> and a connection to the cluster is established, the state of the cluster is <strong>NORMAL</strong>. When the state of the access nodes, compute node groups, or storage node groups of the cluster is <strong>RISK</strong>, the state of the cluster is <strong>RISK</strong>. When the state of the access nodes, compute node groups, or storage node groups of the cluster is <strong>UNAVAILABLE</strong>, the state of the cluster is <strong>UNAVAILABLE</strong>.</p>
         * </blockquote>
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
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The storage node groups of the queried cluster.</p>
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
             * <p>The number of healthy access nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * <p>The total number of access nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder expectedCount(Long expectedCount) {
                this.expectedCount = expectedCount;
                return this;
            }

            /**
             * <p>The number of risky nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>The health state of access nodes. Valid values:</p>
             * <ul>
             * <li><strong>RISK</strong></li>
             * <li><strong>NORMAL</strong></li>
             * <li><strong>UNAVAILABLE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of unavailable access nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The number of healthy access nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * <p>The total number of compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder expectedCount(Long expectedCount) {
                this.expectedCount = expectedCount;
                return this;
            }

            /**
             * <p>The number of risky nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>The health state of compute node groups. Valid values:</p>
             * <ul>
             * <li><strong>RISK</strong></li>
             * <li><strong>NORMAL</strong></li>
             * <li><strong>UNAVAILABLE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of unavailable access nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>2</p>
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * <p>The total number of storage node groups.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder expectedCount(Long expectedCount) {
                this.expectedCount = expectedCount;
                return this;
            }

            /**
             * <p>The number of risky storage node groups.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>The health state of storage node groups. Valid values:</p>
             * <ul>
             * <li><strong>RISK</strong></li>
             * <li><strong>NORMAL</strong></li>
             * <li><strong>UNAVAILABLE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of unavailable storage node groups.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
