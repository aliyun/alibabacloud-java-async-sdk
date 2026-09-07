// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeAutoSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoSnapshotPolicyResponseBody</p>
 */
public class DescribeAutoSnapshotPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicies")
    private java.util.List<AutoSnapshotPolicies> autoSnapshotPolicies;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSnapshotPolicies
     */
    public java.util.List<AutoSnapshotPolicies> getAutoSnapshotPolicies() {
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
        private java.util.List<AutoSnapshotPolicies> autoSnapshotPolicies; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAutoSnapshotPolicyResponseBody model) {
            this.autoSnapshotPolicies = model.autoSnapshotPolicies;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of automatic snapshot policies.</p>
         */
        public Builder autoSnapshotPolicies(java.util.List<AutoSnapshotPolicies> autoSnapshotPolicies) {
            this.autoSnapshotPolicies = autoSnapshotPolicies;
            return this;
        }

        /**
         * <p>The pagination token for the next query. If NextToken is empty, no more results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A7F6612E-59CC-59F9-9DD1-91867FCC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAutoSnapshotPolicyResponseBody build() {
            return new DescribeAutoSnapshotPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoSnapshotPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoSnapshotPolicyResponseBody</p>
     */
    public static class AutoSnapshotPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("DesktopNum")
        private Integer desktopNum;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

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
            this.diskType = builder.diskType;
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
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
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
            private String diskType; 
            private String policyId; 
            private String policyName; 
            private String regionId; 
            private String retentionDays; 
            private String status; 
            private String timePoints; 

            private Builder() {
            } 

            private Builder(AutoSnapshotPolicies model) {
                this.creationTime = model.creationTime;
                this.cronExpression = model.cronExpression;
                this.desktopNum = model.desktopNum;
                this.diskType = model.diskType;
                this.policyId = model.policyId;
                this.policyName = model.policyName;
                this.regionId = model.regionId;
                this.retentionDays = model.retentionDays;
                this.status = model.status;
                this.timePoints = model.timePoints;
            } 

            /**
             * <p>The creation time. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-11T09:14:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The cron expression that specifies the snapshot creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 5,7 ? * 2/2</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The number of cloud computers to which the snapshot policy is attached.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopNum(Integer desktopNum) {
                this.desktopNum = desktopNum;
                return this;
            }

            /**
             * <p>The cloud disk type.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The ID of the automatic snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-3e3bmfcdkjfl1****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The Policy Name of the automatic snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>snapshot01</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The region ID of the automatic snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The retention period of automatic snapshots, in days. Valid values: 1 to 180.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder retentionDays(String retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * <p>The status of the automatic snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The points in time at which automatic snapshots are created.</p>
             * <p>The parameter value is a JSON array in the format of <code>[&quot;0&quot;, &quot;1&quot;, ... &quot;23&quot;]</code>, with a maximum of 24 time points separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;17&quot;,&quot;18&quot;]</p>
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
