// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceInstanceUpgradeHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceInstanceUpgradeHistoryResponseBody</p>
 */
public class ListServiceInstanceUpgradeHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UpgradeHistory")
    private java.util.List < UpgradeHistory> upgradeHistory;

    private ListServiceInstanceUpgradeHistoryResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.upgradeHistory = builder.upgradeHistory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstanceUpgradeHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return upgradeHistory
     */
    public java.util.List < UpgradeHistory> getUpgradeHistory() {
        return this.upgradeHistory;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List < UpgradeHistory> upgradeHistory; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * UpgradeHistory.
         */
        public Builder upgradeHistory(java.util.List < UpgradeHistory> upgradeHistory) {
            this.upgradeHistory = upgradeHistory;
            return this;
        }

        public ListServiceInstanceUpgradeHistoryResponseBody build() {
            return new ListServiceInstanceUpgradeHistoryResponseBody(this);
        } 

    } 

    public static class UpgradeHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FromVersion")
        private String fromVersion;

        @com.aliyun.core.annotation.NameInMap("Results")
        private String results;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ToVersion")
        private String toVersion;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpgradeHistoryId")
        private String upgradeHistoryId;

        private UpgradeHistory(Builder builder) {
            this.endTime = builder.endTime;
            this.fromVersion = builder.fromVersion;
            this.results = builder.results;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.toVersion = builder.toVersion;
            this.type = builder.type;
            this.upgradeHistoryId = builder.upgradeHistoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeHistory create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fromVersion
         */
        public String getFromVersion() {
            return this.fromVersion;
        }

        /**
         * @return results
         */
        public String getResults() {
            return this.results;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return toVersion
         */
        public String getToVersion() {
            return this.toVersion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return upgradeHistoryId
         */
        public String getUpgradeHistoryId() {
            return this.upgradeHistoryId;
        }

        public static final class Builder {
            private String endTime; 
            private String fromVersion; 
            private String results; 
            private String startTime; 
            private String status; 
            private String toVersion; 
            private String type; 
            private String upgradeHistoryId; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FromVersion.
             */
            public Builder fromVersion(String fromVersion) {
                this.fromVersion = fromVersion;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(String results) {
                this.results = results;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * ToVersion.
             */
            public Builder toVersion(String toVersion) {
                this.toVersion = toVersion;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpgradeHistoryId.
             */
            public Builder upgradeHistoryId(String upgradeHistoryId) {
                this.upgradeHistoryId = upgradeHistoryId;
                return this;
            }

            public UpgradeHistory build() {
                return new UpgradeHistory(this);
            } 

        } 

    }
}
