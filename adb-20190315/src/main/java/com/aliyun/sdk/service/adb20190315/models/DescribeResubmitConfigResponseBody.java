// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeResubmitConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResubmitConfigResponseBody</p>
 */
public class DescribeResubmitConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
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
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition clusters within a region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>am-8vbyw9awuj141haf9</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8D217417-BBA7-566C-9B9D-FFCBC86112B0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The job resubmission rules.</p>
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        public DescribeResubmitConfigResponseBody build() {
            return new DescribeResubmitConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResubmitConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResubmitConfigResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExceedMemoryException")
        private Boolean exceedMemoryException;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private String peakMemory;

        @com.aliyun.core.annotation.NameInMap("QueryTime")
        private String queryTime;

        @com.aliyun.core.annotation.NameInMap("TargetGroupName")
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
             * <p>Indicates whether out-of-memory (OOM) check is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder exceedMemoryException(Boolean exceedMemoryException) {
                this.exceedMemoryException = exceedMemoryException;
                return this;
            }

            /**
             * <p>The name of the source resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>test_group</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The peak memory usage.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder peakMemory(String peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The duration of the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * <p>The name of the destination resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>test_target_group</p>
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
