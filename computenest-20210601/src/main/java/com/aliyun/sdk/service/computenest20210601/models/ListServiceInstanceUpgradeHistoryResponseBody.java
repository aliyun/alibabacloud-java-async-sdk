// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
    private java.util.List<UpgradeHistory> upgradeHistory;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<UpgradeHistory> getUpgradeHistory() {
        return this.upgradeHistory;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List<UpgradeHistory> upgradeHistory; 

        private Builder() {
        } 

        private Builder(ListServiceInstanceUpgradeHistoryResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.upgradeHistory = model.upgradeHistory;
        } 

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAfu+XtuBE55iRLHEYYuojI41</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE3EDF4E-B3B1-19B6-BD01-30D4D00F6E5D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The upgrade history.</p>
         */
        public Builder upgradeHistory(java.util.List<UpgradeHistory> upgradeHistory) {
            this.upgradeHistory = upgradeHistory;
            return this;
        }

        public ListServiceInstanceUpgradeHistoryResponseBody build() {
            return new ListServiceInstanceUpgradeHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceInstanceUpgradeHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceUpgradeHistoryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(UpgradeHistory model) {
                this.endTime = model.endTime;
                this.fromVersion = model.fromVersion;
                this.results = model.results;
                this.startTime = model.startTime;
                this.status = model.status;
                this.toVersion = model.toVersion;
                this.type = model.type;
                this.upgradeHistoryId = model.upgradeHistoryId;
            } 

            /**
             * <p>The time when the update ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-26T09:09:51Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The version before the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fromVersion(String fromVersion) {
                this.fromVersion = fromVersion;
                return this;
            }

            /**
             * <p>The upgrade result.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;PreUpgradeExecutionId&quot;:&quot;exec-123&quot;}</p>
             */
            public Builder results(String results) {
                this.results = results;
                return this;
            }

            /**
             * <p>The time when the update started.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-26T08:09:51Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the update. Valid values:</p>
             * <ul>
             * <li>upgrading: The service instance is being upgraded.</li>
             * <li>UpgradeSuccessful: The service instance is upgraded.</li>
             * <li>UpgradeFailed: The service instance failed to be upgraded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UpgradeFailed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder toVersion(String toVersion) {
                this.toVersion = toVersion;
                return this;
            }

            /**
             * <p>The update type.</p>
             * 
             * <strong>example:</strong>
             * <p>Upgrade</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the upgrade record.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-123</p>
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
