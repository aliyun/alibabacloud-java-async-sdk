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
 * {@link ListServiceInstanceDeployDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceInstanceDeployDetailsRequest</p>
 */
public class ListServiceInstanceDeployDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CycleTimeZone")
    private String cycleTimeZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CycleType")
    private String cycleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimension")
    private java.util.List<String> dimension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private ListServiceInstanceDeployDetailsRequest(Builder builder) {
        super(builder);
        this.cycleTimeZone = builder.cycleTimeZone;
        this.cycleType = builder.cycleType;
        this.dimension = builder.dimension;
        this.endTime = builder.endTime;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstanceDeployDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cycleTimeZone
     */
    public String getCycleTimeZone() {
        return this.cycleTimeZone;
    }

    /**
     * @return cycleType
     */
    public String getCycleType() {
        return this.cycleType;
    }

    /**
     * @return dimension
     */
    public java.util.List<String> getDimension() {
        return this.dimension;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return filter
     */
    public java.util.List<Filter> getFilter() {
        return this.filter;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListServiceInstanceDeployDetailsRequest, Builder> {
        private String cycleTimeZone; 
        private String cycleType; 
        private java.util.List<String> dimension; 
        private String endTime; 
        private java.util.List<Filter> filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceInstanceDeployDetailsRequest request) {
            super(request);
            this.cycleTimeZone = request.cycleTimeZone;
            this.cycleType = request.cycleType;
            this.dimension = request.dimension;
            this.endTime = request.endTime;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The time zone.</p>
         * <p>Reference Format: &quot;+08:00&quot;</p>
         * <p>Valid Range: &quot;-12:59&quot; to &quot;+13:00&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>+08:00</p>
         */
        public Builder cycleTimeZone(String cycleTimeZone) {
            this.putQueryParameter("CycleTimeZone", cycleTimeZone);
            this.cycleTimeZone = cycleTimeZone;
            return this;
        }

        /**
         * <p>Determines the time period over which data is aggregated. If no aggregation dimension is specified, the query defaults to providing detailed, unaggregated results.</p>
         * <p>Optional Values:</p>
         * <ul>
         * <li>Year</li>
         * <li>Month</li>
         * <li>Day</li>
         * <li>All</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder cycleType(String cycleType) {
            this.putQueryParameter("CycleType", cycleType);
            this.cycleType = cycleType;
            return this;
        }

        /**
         * <p>The dimension names. (Equivalent to SQL&quot;s GROUP BY Clause)
         * Optional Values:</p>
         * <ul>
         * <li>UserId</li>
         * <li>ServiceId</li>
         * <li>ServiceVersion</li>
         * <li>ServiceInstanceId</li>
         * <li>DeploySucceeded</li>
         * <li>ErrorType</li>
         * <li>ErrorCode</li>
         * </ul>
         */
        public Builder dimension(java.util.List<String> dimension) {
            this.putQueryParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-31T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The filter.</p>
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAZbOYA+x9UgM6xrgcMqFUjk=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-25T02:23:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListServiceInstanceDeployDetailsRequest build() {
            return new ListServiceInstanceDeployDetailsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceInstanceDeployDetailsRequest} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceDeployDetailsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private Filter(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> value; 

            /**
             * <p>Filter Value Names (Equivalent to SQL&quot;s WHERE Clause)</p>
             * <p>Available Options:</p>
             * <ul>
             * <li>UserId</li>
             * <li>ServiceId</li>
             * <li>ServiceVersion</li>
             * <li>ServiceInstanceId</li>
             * <li>DeploySucceeded (Accepts True or False and case-insensitive)</li>
             * <li>ErrorType</li>
             * <li>ErrorCode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ServiceId</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>A value of the filter condition.</p>
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
