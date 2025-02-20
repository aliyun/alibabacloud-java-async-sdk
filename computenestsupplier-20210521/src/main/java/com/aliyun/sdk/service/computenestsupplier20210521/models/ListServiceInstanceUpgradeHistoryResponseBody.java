// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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

        /**
         * <p>The number of items to return per page when paginating results. The maximum is 100, and the default is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token to use for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbAx7BkQzyYC+ONO+WudHGKEdB0uWSY7AGnM3qCgm/Ynge7zU6NWdbj0Tegyajyqyc=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86CAC31E-3527-562C-869F-347E931C9B25</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total count of upgrade history</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>List of upgrade histories.</p>
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

            /**
             * <p>End time of the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-26T09:09:51Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Version before the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fromVersion(String fromVersion) {
                this.fromVersion = fromVersion;
                return this;
            }

            /**
             * <p>Upgrade result.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;PreUpgradeExecutionId&quot;:&quot;exec-123&quot;}</p>
             */
            public Builder results(String results) {
                this.results = results;
                return this;
            }

            /**
             * <p>Start time of the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-26T08:09:51Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Upgrade status. Possible values:</p>
             * <ul>
             * <li><p>upgrading: In progress.</p>
             * </li>
             * <li><p>UpgradeSuccessful: Upgrade successful.</p>
             * </li>
             * <li><p>UpgradeFailed: Upgrade failed.</p>
             * </li>
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
             * <p>Version after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder toVersion(String toVersion) {
                this.toVersion = toVersion;
                return this;
            }

            /**
             * <p>Upgrade type.</p>
             * <ul>
             * <li>Upgrade</li>
             * <li>Rollback</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Upgrade</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Upgrade history ID.</p>
             * 
             * <strong>example:</strong>
             * <p>uh-1b21d65f75e94fa09745</p>
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
