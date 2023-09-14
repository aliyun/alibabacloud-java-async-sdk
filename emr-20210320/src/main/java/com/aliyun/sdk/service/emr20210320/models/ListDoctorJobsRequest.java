// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDoctorJobsRequest} extends {@link RequestModel}
 *
 * <p>ListDoctorJobsRequest</p>
 */
public class ListDoctorJobsRequest extends Request {
    @Query
    @NameInMap("AppIds")
    private java.util.List < String > appIds;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("EndRange")
    private EndRange endRange;

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
    @NameInMap("Queues")
    private java.util.List < String > queues;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartRange")
    private StartRange startRange;

    @Query
    @NameInMap("Types")
    private java.util.List < String > types;

    @Query
    @NameInMap("Users")
    private java.util.List < String > users;

    private ListDoctorJobsRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.clusterId = builder.clusterId;
        this.endRange = builder.endRange;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.orderType = builder.orderType;
        this.queues = builder.queues;
        this.regionId = builder.regionId;
        this.startRange = builder.startRange;
        this.types = builder.types;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIds
     */
    public java.util.List < String > getAppIds() {
        return this.appIds;
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
     * @return queues
     */
    public java.util.List < String > getQueues() {
        return this.queues;
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

    /**
     * @return types
     */
    public java.util.List < String > getTypes() {
        return this.types;
    }

    /**
     * @return users
     */
    public java.util.List < String > getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<ListDoctorJobsRequest, Builder> {
        private java.util.List < String > appIds; 
        private String clusterId; 
        private EndRange endRange; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String orderType; 
        private java.util.List < String > queues; 
        private String regionId; 
        private StartRange startRange; 
        private java.util.List < String > types; 
        private java.util.List < String > users; 

        private Builder() {
            super();
        } 

        private Builder(ListDoctorJobsRequest request) {
            super(request);
            this.appIds = request.appIds;
            this.clusterId = request.clusterId;
            this.endRange = request.endRange;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.orderType = request.orderType;
            this.queues = request.queues;
            this.regionId = request.regionId;
            this.startRange = request.startRange;
            this.types = request.types;
            this.users = request.users;
        } 

        /**
         * app ID数组
         */
        public Builder appIds(java.util.List < String > appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
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
         * 结束range
         */
        public Builder endRange(EndRange endRange) {
            this.putQueryParameter("EndRange", endRange);
            this.endRange = endRange;
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
         * 排序字段
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * 排序类型
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * Queues.
         */
        public Builder queues(java.util.List < String > queues) {
            this.putQueryParameter("Queues", queues);
            this.queues = queues;
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
         * 开始range
         */
        public Builder startRange(StartRange startRange) {
            this.putQueryParameter("StartRange", startRange);
            this.startRange = startRange;
            return this;
        }

        /**
         * Types.
         */
        public Builder types(java.util.List < String > types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List < String > users) {
            this.putQueryParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public ListDoctorJobsRequest build() {
            return new ListDoctorJobsRequest(this);
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
