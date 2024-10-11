// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAutoSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoSnapshotPolicyResponseBody</p>
 */
public class GetAutoSnapshotPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAutoSnapshotPolicyResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoSnapshotPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAutoSnapshotPolicyResponseBody build() {
            return new GetAutoSnapshotPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoSnapshotPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoSnapshotPolicyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AppliedDbfsNumber")
        private Integer appliedDbfsNumber;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepeatWeekdays")
        private java.util.List < String > repeatWeekdays;

        @com.aliyun.core.annotation.NameInMap("RetentionDays")
        private Integer retentionDays;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDetail")
        private String statusDetail;

        @com.aliyun.core.annotation.NameInMap("TimePoints")
        private java.util.List < String > timePoints;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.appliedDbfsNumber = builder.appliedDbfsNumber;
            this.createdTime = builder.createdTime;
            this.lastModified = builder.lastModified;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.regionId = builder.regionId;
            this.repeatWeekdays = builder.repeatWeekdays;
            this.retentionDays = builder.retentionDays;
            this.status = builder.status;
            this.statusDetail = builder.statusDetail;
            this.timePoints = builder.timePoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return appliedDbfsNumber
         */
        public Integer getAppliedDbfsNumber() {
            return this.appliedDbfsNumber;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
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
         * @return repeatWeekdays
         */
        public java.util.List < String > getRepeatWeekdays() {
            return this.repeatWeekdays;
        }

        /**
         * @return retentionDays
         */
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDetail
         */
        public String getStatusDetail() {
            return this.statusDetail;
        }

        /**
         * @return timePoints
         */
        public java.util.List < String > getTimePoints() {
            return this.timePoints;
        }

        public static final class Builder {
            private String accountId; 
            private Integer appliedDbfsNumber; 
            private String createdTime; 
            private String lastModified; 
            private String policyId; 
            private String policyName; 
            private String regionId; 
            private java.util.List < String > repeatWeekdays; 
            private Integer retentionDays; 
            private String status; 
            private String statusDetail; 
            private java.util.List < String > timePoints; 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AppliedDbfsNumber.
             */
            public Builder appliedDbfsNumber(Integer appliedDbfsNumber) {
                this.appliedDbfsNumber = appliedDbfsNumber;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RepeatWeekdays.
             */
            public Builder repeatWeekdays(java.util.List < String > repeatWeekdays) {
                this.repeatWeekdays = repeatWeekdays;
                return this;
            }

            /**
             * RetentionDays.
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
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
             * StatusDetail.
             */
            public Builder statusDetail(String statusDetail) {
                this.statusDetail = statusDetail;
                return this;
            }

            /**
             * TimePoints.
             */
            public Builder timePoints(java.util.List < String > timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
