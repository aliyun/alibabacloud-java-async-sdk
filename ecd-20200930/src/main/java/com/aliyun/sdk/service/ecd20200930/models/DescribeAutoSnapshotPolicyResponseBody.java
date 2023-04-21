// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoSnapshotPolicyResponseBody</p>
 */
public class DescribeAutoSnapshotPolicyResponseBody extends TeaModel {
    @NameInMap("AutoSnapshotPolicies")
    private java.util.List < AutoSnapshotPolicies> autoSnapshotPolicies;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
         * Details of the automatic snapshot policies.
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
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("CronExpression")
        private String cronExpression;

        @NameInMap("DesktopNum")
        private Integer desktopNum;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RetentionDays")
        private String retentionDays;

        @NameInMap("Status")
        private String status;

        @NameInMap("TimePoints")
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
             * The time when the automatic snapshot policy was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-mm-ddthh:mm:ssz format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The CRON expression that is used to create the snapshot.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * The number of cloud desktops that are associated with the automatic snapshot policy.
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
             * The ID of the region where the automatic snapshot policy resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The retention period of the automatic snapshot. Unit: days. Valid values:
             * <p>
             * 
             * *   \-1: The snapshot is permanently retained.
             * *   1 to 65536: The automatic snapshot is retained for the specified number of days.
             */
            public Builder retentionDays(String retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * The state of the automatic snapshot policy. Valid values:
             * <p>
             * 
             * *   Normal: The automatic snapshot policy is normal.
             * *   Expire: The automatic snapshot policy cannot be used because your account has an overdue payment.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The points in time at which automatic snapshots are created.
             * <p>
             * 
             * The time is displayed in UTC+8. Unit: hours. Valid values are 0 to 23, which correspond to the 24 points in time on the hour from 00:00:00 to 23:00:00. 1 indicates 01:00:00. Multiple points in time can be specified.
             * 
             * The parameter value is a JSON array that contains up to 24 points in time separated by commas (,). Example: `["0", "1", ... "23"]`.
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
