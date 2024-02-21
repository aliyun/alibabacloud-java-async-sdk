// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDoctorComputeSummaryRequest} extends {@link RequestModel}
 *
 * <p>ListDoctorComputeSummaryRequest</p>
 */
public class ListDoctorComputeSummaryRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComponentTypes")
    private java.util.List < String > componentTypes;

    @Query
    @NameInMap("DateTime")
    @Validation(required = true)
    private String dateTime;

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

    private ListDoctorComputeSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentTypes = builder.componentTypes;
        this.dateTime = builder.dateTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.orderType = builder.orderType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorComputeSummaryRequest create() {
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
     * @return componentTypes
     */
    public java.util.List < String > getComponentTypes() {
        return this.componentTypes;
    }

    /**
     * @return dateTime
     */
    public String getDateTime() {
        return this.dateTime;
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

    public static final class Builder extends Request.Builder<ListDoctorComputeSummaryRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > componentTypes; 
        private String dateTime; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String orderType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDoctorComputeSummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentTypes = request.componentTypes;
            this.dateTime = request.dateTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.orderType = request.orderType;
            this.regionId = request.regionId;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The resource types, which are used to filter query results. Valid values:
         * <p>
         * 
         * *   engine: filters results by engine.
         * *   queue: filters results by queue.
         * *   cluster: displays the results at the cluster level.
         * 
         * If you do not specify this parameter, the information at the cluster level is displayed by default. Currently, only one resource type is supported. If you specify multiple resource types, the first resource type is used by default.
         */
        public Builder componentTypes(java.util.List < String > componentTypes) {
            this.putQueryParameter("ComponentTypes", componentTypes);
            this.componentTypes = componentTypes;
            return this;
        }

        /**
         * Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.
         */
        public Builder dateTime(String dateTime) {
            this.putQueryParameter("DateTime", dateTime);
            this.dateTime = dateTime;
            return this;
        }

        /**
         * The maximum number of entries to return on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The basis on which you want to sort the query results. Valid values:
         * <p>
         * 
         * 1.  vcoreSeconds: the total CPU consumption over time in seconds.
         * 2.  memSeconds: the total memory consumption over time in seconds.
         * 3.  vcoreUtilization: the average CPU utilization. The meaning is the same as the %CPU parameter in the output of the top command in Linux.
         * 4.  memUtilization: the average memory usage.
         * 5.  vcoreSecondsDayGrowthRatio: the day-to-day growth rate of the total CPU consumption over time in seconds.
         * 6.  memSecondsDayGrowthRatio: the day-to-day growth rate of the total memory consumption over time in seconds.
         * 7.  readSize: the total amount of data read from the file system.
         * 8.  writeSize: the total amount of data written to the file system.
         * 9.  healthyJobCount: the total number of healthy jobs.
         * 10. subHealthyJobCount: the total number of sub-healthy jobs.
         * 11. unhealthyJobCount: the total number of unhealthy jobs.
         * 12. needAttentionJobCount: the total number of jobs that require attention.
         * 13. score: the score for jobs.
         * 14. scoreDayGrowthRatio: the day-to-day growth rate of the score for jobs.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The order in which you want to sort the query results. Valid values:
         * <p>
         * 
         * *   ASC: in ascending order.
         * *   DESC: in descending order.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListDoctorComputeSummaryRequest build() {
            return new ListDoctorComputeSummaryRequest(this);
        } 

    } 

}
