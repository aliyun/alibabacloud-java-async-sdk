// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ListDoctorComputeSummaryRequest} extends {@link RequestModel}
 *
 * <p>ListDoctorComputeSummaryRequest</p>
 */
public class ListDoctorComputeSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentTypes")
    private java.util.List<String> componentTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dateTime;

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
    public java.util.List<String> getComponentTypes() {
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
        private java.util.List<String> componentTypes; 
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
         * <p>The resource types, which are used to filter query results. Valid values:</p>
         * <ul>
         * <li>engine: filters results by engine.</li>
         * <li>queue: filters results by queue.</li>
         * <li>cluster: displays the results at the cluster level.</li>
         * </ul>
         * <p>If you do not specify this parameter, the information at the cluster level is displayed by default. Currently, only one resource type is supported. If you specify multiple resource types, the first resource type is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder componentTypes(java.util.List<String> componentTypes) {
            this.putQueryParameter("ComponentTypes", componentTypes);
            this.componentTypes = componentTypes;
            return this;
        }

        /**
         * <p>Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01</p>
         */
        public Builder dateTime(String dateTime) {
            this.putQueryParameter("DateTime", dateTime);
            this.dateTime = dateTime;
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
         * <p>The basis on which you want to sort the query results. Valid values:</p>
         * <ol>
         * <li>vcoreSeconds: the total CPU consumption over time in seconds.</li>
         * <li>memSeconds: the total memory consumption over time in seconds.</li>
         * <li>vcoreUtilization: the average CPU utilization. The meaning is the same as the %CPU parameter in the output of the top command in Linux.</li>
         * <li>memUtilization: the average memory usage.</li>
         * <li>vcoreSecondsDayGrowthRatio: the day-to-day growth rate of the total CPU consumption over time in seconds.</li>
         * <li>memSecondsDayGrowthRatio: the day-to-day growth rate of the total memory consumption over time in seconds.</li>
         * <li>readSize: the total amount of data read from the file system.</li>
         * <li>writeSize: the total amount of data written to the file system.</li>
         * <li>healthyJobCount: the total number of healthy jobs.</li>
         * <li>subHealthyJobCount: the total number of sub-healthy jobs.</li>
         * <li>unhealthyJobCount: the total number of unhealthy jobs.</li>
         * <li>needAttentionJobCount: the total number of jobs that require attention.</li>
         * <li>score: the score for jobs.</li>
         * <li>scoreDayGrowthRatio: the day-to-day growth rate of the score for jobs.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>score</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The order in which you want to sort the query results. Valid values:</p>
         * <ul>
         * <li>ASC: in ascending order.</li>
         * <li>DESC: in descending order.</li>
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

        @Override
        public ListDoctorComputeSummaryRequest build() {
            return new ListDoctorComputeSummaryRequest(this);
        } 

    } 

}
