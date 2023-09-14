// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDoctorJobsStatsRequest} extends {@link RequestModel}
 *
 * <p>ListDoctorJobsStatsRequest</p>
 */
public class ListDoctorJobsStatsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("EndRange")
    private EndRange endRange;

    @Query
    @NameInMap("GroupBy")
    private java.util.List < String > groupBy;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartRange")
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
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * EndRange.
         */
        public Builder endRange(EndRange endRange) {
            this.putQueryParameter("EndRange", endRange);
            this.endRange = endRange;
            return this;
        }

        /**
         * GroupBy.
         */
        public Builder groupBy(java.util.List < String > groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * 一次获取的最大记录数。取值范围：1~100。
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 标记当前开始读取的位置，置空表示从头开始。
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartRange.
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

    public static class EndRange extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("StartTime")
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
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
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
    public static class StartRange extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("StartTime")
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
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
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
