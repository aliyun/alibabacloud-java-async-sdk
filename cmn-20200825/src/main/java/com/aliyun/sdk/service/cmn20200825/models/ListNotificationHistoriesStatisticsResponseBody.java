// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNotificationHistoriesStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNotificationHistoriesStatisticsResponseBody</p>
 */
public class ListNotificationHistoriesStatisticsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    @Validation(required = true)
    private String nextToken;

    @NameInMap("Quota")
    private java.util.List < Quota> quota;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Statistics")
    private java.util.List < Statistics> statistics;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListNotificationHistoriesStatisticsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.quota = builder.quota;
        this.requestId = builder.requestId;
        this.statistics = builder.statistics;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNotificationHistoriesStatisticsResponseBody create() {
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
     * @return quota
     */
    public java.util.List < Quota> getQuota() {
        return this.quota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statistics
     */
    public java.util.List < Statistics> getStatistics() {
        return this.statistics;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < Quota> quota; 
        private String requestId; 
        private java.util.List < Statistics> statistics; 
        private Integer totalCount; 

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
         * Quota.
         */
        public Builder quota(java.util.List < Quota> quota) {
            this.quota = quota;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Statistics.
         */
        public Builder statistics(java.util.List < Statistics> statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNotificationHistoriesStatisticsResponseBody build() {
            return new ListNotificationHistoriesStatisticsResponseBody(this);
        } 

    } 

    public static class Quota extends TeaModel {
        @NameInMap("Count")
        private String count;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Quota")
        private String quota;

        private Quota(Builder builder) {
            this.count = builder.count;
            this.mode = builder.mode;
            this.quota = builder.quota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return quota
         */
        public String getQuota() {
            return this.quota;
        }

        public static final class Builder {
            private String count; 
            private String mode; 
            private String quota; 

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Quota.
             */
            public Builder quota(String quota) {
                this.quota = quota;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    public static class Statistics extends TeaModel {
        @NameInMap("Count")
        private String count;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResourceId")
        private String resourceId;

        private Statistics(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private String count; 
            private String name; 
            private String resourceId; 

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
