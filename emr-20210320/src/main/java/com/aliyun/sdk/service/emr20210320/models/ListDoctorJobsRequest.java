// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDoctorJobsRequest} extends {@link RequestModel}
 *
 * <p>ListDoctorJobsRequest</p>
 */
public class ListDoctorJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    private java.util.List < String > appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndRange")
    private EndRange endRange;

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
    @com.aliyun.core.annotation.NameInMap("Queues")
    private java.util.List < String > queues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartRange")
    private StartRange startRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List < String > types;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Users")
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
         * <p>The IDs of the jobs that are submitted to YARN.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder appIds(java.util.List < String > appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
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
         * <li>ASC: the ascending order</li>
         * <li>DESC: the descending order</li>
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
         * <p>The YARN queues to which the jobs are submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder queues(java.util.List < String > queues) {
            this.putQueryParameter("Queues", queues);
            this.queues = queues;
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

        /**
         * <p>The YARN engines to which the jobs are submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder types(java.util.List < String > types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * <p>The users who submit the jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
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

    /**
     * 
     * {@link ListDoctorJobsRequest} extends {@link TeaModel}
     *
     * <p>ListDoctorJobsRequest</p>
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
             * <p>The end of the time range during which jobs ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1666865137099</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The beginning of the time range during which jobs ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1679135111960</p>
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
     * {@link ListDoctorJobsRequest} extends {@link TeaModel}
     *
     * <p>ListDoctorJobsRequest</p>
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
             * <p>1683340662020</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The beginning of the time range during which jobs were submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1683340662016</p>
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
