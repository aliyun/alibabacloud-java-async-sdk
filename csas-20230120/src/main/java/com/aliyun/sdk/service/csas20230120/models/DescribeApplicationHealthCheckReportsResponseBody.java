// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DescribeApplicationHealthCheckReportsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationHealthCheckReportsResponseBody</p>
 */
public class DescribeApplicationHealthCheckReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Reports")
    private java.util.List<Reports> reports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApplicationHealthCheckReportsResponseBody(Builder builder) {
        this.reports = builder.reports;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationHealthCheckReportsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reports
     */
    public java.util.List<Reports> getReports() {
        return this.reports;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Reports> reports; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeApplicationHealthCheckReportsResponseBody model) {
            this.reports = model.reports;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of health check reports.</p>
         */
        public Builder reports(java.util.List<Reports> reports) {
            this.reports = reports;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>748CFDC7-1EB6-5B8B-9405-DA76ED5BB60D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApplicationHealthCheckReportsResponseBody build() {
            return new DescribeApplicationHealthCheckReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationHealthCheckReportsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationHealthCheckReportsResponseBody</p>
     */
    public static class Reports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("FailedAddresses")
        private java.util.List<String> failedAddresses;

        @com.aliyun.core.annotation.NameInMap("FailedRegions")
        private java.util.List<String> failedRegions;

        @com.aliyun.core.annotation.NameInMap("FailureCount")
        private Long failureCount;

        @com.aliyun.core.annotation.NameInMap("FailureReasons")
        private java.util.List<String> failureReasons;

        @com.aliyun.core.annotation.NameInMap("HealthCheckStatus")
        private String healthCheckStatus;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Long successCount;

        private Reports(Builder builder) {
            this.applicationId = builder.applicationId;
            this.failedAddresses = builder.failedAddresses;
            this.failedRegions = builder.failedRegions;
            this.failureCount = builder.failureCount;
            this.failureReasons = builder.failureReasons;
            this.healthCheckStatus = builder.healthCheckStatus;
            this.mode = builder.mode;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return failedAddresses
         */
        public java.util.List<String> getFailedAddresses() {
            return this.failedAddresses;
        }

        /**
         * @return failedRegions
         */
        public java.util.List<String> getFailedRegions() {
            return this.failedRegions;
        }

        /**
         * @return failureCount
         */
        public Long getFailureCount() {
            return this.failureCount;
        }

        /**
         * @return failureReasons
         */
        public java.util.List<String> getFailureReasons() {
            return this.failureReasons;
        }

        /**
         * @return healthCheckStatus
         */
        public String getHealthCheckStatus() {
            return this.healthCheckStatus;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return successCount
         */
        public Long getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private String applicationId; 
            private java.util.List<String> failedAddresses; 
            private java.util.List<String> failedRegions; 
            private Long failureCount; 
            private java.util.List<String> failureReasons; 
            private String healthCheckStatus; 
            private String mode; 
            private Long successCount; 

            private Builder() {
            } 

            private Builder(Reports model) {
                this.applicationId = model.applicationId;
                this.failedAddresses = model.failedAddresses;
                this.failedRegions = model.failedRegions;
                this.failureCount = model.failureCount;
                this.failureReasons = model.failureReasons;
                this.healthCheckStatus = model.healthCheckStatus;
                this.mode = model.mode;
                this.successCount = model.successCount;
            } 

            /**
             * <p>The ID of the internal-facing application.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-application-e12860ef6c48****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The list of addresses where health checks failed.</p>
             */
            public Builder failedAddresses(java.util.List<String> failedAddresses) {
                this.failedAddresses = failedAddresses;
                return this;
            }

            /**
             * <p>The list of regions where health checks failed.</p>
             */
            public Builder failedRegions(java.util.List<String> failedRegions) {
                this.failedRegions = failedRegions;
                return this;
            }

            /**
             * <p>The number of failed health checks within the query time range.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder failureCount(Long failureCount) {
                this.failureCount = failureCount;
                return this;
            }

            /**
             * <p>The list of reasons for health check failures.</p>
             */
            public Builder failureReasons(java.util.List<String> failureReasons) {
                this.failureReasons = failureReasons;
                return this;
            }

            /**
             * <p>The status calculated based on the latest check result. Valid values:</p>
             * <ul>
             * <li>normal: The success rate of the latest check is greater than or equal to 95%.</li>
             * <li>partialError: The success rate of the latest check is greater than 0 and less than 95%.</li>
             * <li>error: The success rate of the latest check is 0.</li>
             * <li>uncompleted: No check results are available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder healthCheckStatus(String healthCheckStatus) {
                this.healthCheckStatus = healthCheckStatus;
                return this;
            }

            /**
             * <p>The health check mode. Valid values:</p>
             * <ul>
             * <li>OnAccess: on-access check</li>
             * <li>Continuous: continuous check</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OnAccess</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The number of successful health checks within the query time range.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder successCount(Long successCount) {
                this.successCount = successCount;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
}
