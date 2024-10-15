// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDoctorJobsStatsRequest} extends {@link RequestModel}
 *
 * <p>ListDoctorJobsStatsRequest</p>
 */
public class ListDoctorJobsStatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndRange")
    private EndRange endRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupBy")
    private java.util.List < String > groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartRange")
    private StartRange startRange;

    private ListDoctorJobsStatsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.endRange = builder.endRange;
        this.groupBy = builder.groupBy;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.orderType = builder.orderType;
        this.regionId = builder.regionId;
        this.startRange = builder.startRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorJobsStatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return endRange
     */
    public EndRange getEndRange() {
        return this.endRange;
    }

    /**
     * @return groupBy
     */
    public java.util.List < String > getGroupBy() {
        return this.groupBy;
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
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startRange
     */
    public StartRange getStartRange() {
        return this.startRange;
    }

    public static final class Builder extends Request.Builder<ListDoctorJobsStatsRequest, Builder> {
        private String clusterId; 
        private EndRange endRange; 
        private java.util.List < String > groupBy; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String orderType; 
        private String regionId; 
        private StartRange startRange; 

        private Builder() {
            super();
        } 

        private Builder(ListDoctorJobsStatsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.endRange = request.endRange;
            this.groupBy = request.groupBy;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.orderType = request.orderType;
            this.regionId = request.regionId;
            this.startRange = request.startRange;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The range of end time. You can filter jobs whose end time falls within the specified time range.</p>
         */
        public Builder endRange(EndRange endRange) {
            this.putQueryParameter("EndRange", endRange);
            this.endRange = endRange;
            return this;
        }

        /**
         * <p>The fields that are used for grouping data.</p>
         * <p>Currently, only the first value is used for grouping data. Combinations of multiple values will be supported in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder groupBy(java.util.List < String > groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The field that you use to sort the query results. Valid values:</p>
         * <ul>
         * <li>vcoreSeconds: the aggregated number of vCPUs that are allocated to the job multiplied by the number of seconds the job has been running</li>
         * <li>memSeconds: the aggregated amount of memory that is allocated to the job multiplied by the number of seconds the job has been running</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vcoreSeconds</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The order in which you want to sort the query results. Valid values:</p>
         * <ul>
         * <li>ASC: in ascending order</li>
         * <li>DESC: in descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The range of start time. You can filter jobs whose start time falls within the specified time range.</p>
         */
        public Builder startRange(StartRange startRange) {
            this.putQueryParameter("StartRange", startRange);
            this.startRange = startRange;
            return this;
        }

        @Override
        public ListDoctorJobsStatsRequest build() {
            return new ListDoctorJobsStatsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListDoctorJobsStatsRequest} extends {@link TeaModel}
     *
     * <p>ListDoctorJobsStatsRequest</p>
     */
    public static class EndRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private EndRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            /**
             * <p>The end of the time range during which jobs ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1680019200000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The beginning of the time range during which jobs ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1675180800000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public EndRange build() {
                return new EndRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorJobsStatsRequest} extends {@link TeaModel}
     *
     * <p>ListDoctorJobsStatsRequest</p>
     */
    public static class StartRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private StartRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            /**
             * <p>The end of the time range during which jobs were submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1666406820000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The beginning of the time range during which jobs were submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1679036826987</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public StartRange build() {
                return new StartRange(this);
            } 

        } 

    }
}
