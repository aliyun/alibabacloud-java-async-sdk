// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoSnapshotPolicyResponseBody</p>
 */
public class DescribeAutoSnapshotPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicies")
    private java.util.List < AutoSnapshotPolicies> autoSnapshotPolicies;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAutoSnapshotPolicyResponseBody(Builder builder) {
        this.autoSnapshotPolicies = builder.autoSnapshotPolicies;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoSnapshotPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoSnapshotPolicies
     */
    public java.util.List < AutoSnapshotPolicies> getAutoSnapshotPolicies() {
        return this.autoSnapshotPolicies;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AutoSnapshotPolicies> autoSnapshotPolicies; 
        private String nextToken; 
        private String requestId; 

        /**
         * The details of the queried automatic snapshot policies.
         */
        public Builder autoSnapshotPolicies(java.util.List < AutoSnapshotPolicies> autoSnapshotPolicies) {
            this.autoSnapshotPolicies = autoSnapshotPolicies;
            return this;
        }

        /**
         * The token that is used to start the next query. If this parameter is empty, all results haven been returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAutoSnapshotPolicyResponseBody build() {
            return new DescribeAutoSnapshotPolicyResponseBody(this);
        } 

    } 

    public static class AutoSnapshotPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("DesktopNum")
        private Integer desktopNum;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RetentionDays")
        private String retentionDays;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimePoints")
        private String timePoints;

        private AutoSnapshotPolicies(Builder builder) {
            this.creationTime = builder.creationTime;
            this.cronExpression = builder.cronExpression;
            this.desktopNum = builder.desktopNum;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.regionId = builder.regionId;
            this.retentionDays = builder.retentionDays;
            this.status = builder.status;
            this.timePoints = builder.timePoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSnapshotPolicies create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return desktopNum
         */
        public Integer getDesktopNum() {
            return this.desktopNum;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return retentionDays
         */
        public String getRetentionDays() {
            return this.retentionDays;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timePoints
         */
        public String getTimePoints() {
            return this.timePoints;
        }

        public static final class Builder {
            private String creationTime; 
            private String cronExpression; 
            private Integer desktopNum; 
            private String policyId; 
            private String policyName; 
            private String regionId; 
            private String retentionDays; 
            private String status; 
            private String timePoints; 

            /**
             * The time when the automatic snapshot policy was created. The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-mm-ddthh:mm:ssz` format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The cron expression that specifies when Elastic Desktop Service creates snapshots on the cloud computers.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * The number of cloud computers to which the automatic snapshot policy is applied.
             */
            public Builder desktopNum(Integer desktopNum) {
                this.desktopNum = desktopNum;
                return this;
            }

            /**
             * The ID of the automatic snapshot policy.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The name of the automatic snapshot policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The ID of the region to which the automatic snapshot policy belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The retention period of the automatic snapshots. Unit: days. Valid values: 1 to 180.
             */
            public Builder retentionDays(String retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * The status of the automatic snapshot policy.
             * <p>
             * 
             * Valid values:
             * 
             * *   Expire: The automatic snapshot policy cannot be used because you have overdue payments in your account.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Normal: The automatic snapshot policy is normal.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The points in time at which the auto snapshots were created.
             * <p>
             * 
             * The parameter values are a JSON array. Example: `["0", "1", ... "23"]`. A maximum of 24 points in time are returned. The points in time are separated with commas (,).
             */
            public Builder timePoints(String timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            public AutoSnapshotPolicies build() {
                return new AutoSnapshotPolicies(this);
            } 

        } 

    }
}
