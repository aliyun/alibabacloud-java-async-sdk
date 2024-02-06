// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResubmitConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResubmitConfigResponseBody</p>
 */
public class DescribeResubmitConfigResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rules")
    private java.util.List < Rules> rules;

    private DescribeResubmitConfigResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResubmitConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String requestId; 
        private java.util.List < Rules> rules; 

        /**
         * The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The job resubmission rules.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        public DescribeResubmitConfigResponseBody build() {
            return new DescribeResubmitConfigResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @NameInMap("ExceedMemoryException")
        private Boolean exceedMemoryException;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("PeakMemory")
        private String peakMemory;

        @NameInMap("QueryTime")
        private String queryTime;

        @NameInMap("TargetGroupName")
        private String targetGroupName;

        private Rules(Builder builder) {
            this.exceedMemoryException = builder.exceedMemoryException;
            this.groupName = builder.groupName;
            this.peakMemory = builder.peakMemory;
            this.queryTime = builder.queryTime;
            this.targetGroupName = builder.targetGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return exceedMemoryException
         */
        public Boolean getExceedMemoryException() {
            return this.exceedMemoryException;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return peakMemory
         */
        public String getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return queryTime
         */
        public String getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return targetGroupName
         */
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

        public static final class Builder {
            private Boolean exceedMemoryException; 
            private String groupName; 
            private String peakMemory; 
            private String queryTime; 
            private String targetGroupName; 

            /**
             * Indicates whether out-of-memory (OOM) check is configured.
             */
            public Builder exceedMemoryException(Boolean exceedMemoryException) {
                this.exceedMemoryException = exceedMemoryException;
                return this;
            }

            /**
             * The name of the source resource group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The peak memory usage.
             */
            public Builder peakMemory(String peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * The duration of the SQL statement. Unit: milliseconds.
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * The name of the destination resource group.
             */
            public Builder targetGroupName(String targetGroupName) {
                this.targetGroupName = targetGroupName;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
