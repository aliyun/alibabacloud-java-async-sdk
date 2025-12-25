// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListCalendarsRequest} extends {@link RequestModel}
 *
 * <p>ListCalendarsRequest</p>
 */
public class ListCalendarsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalendarName")
    private String calendarName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FetchCalendarDetail")
    private Boolean fetchCalendarDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Year")
    private Integer year;

    private ListCalendarsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.calendarName = builder.calendarName;
        this.clusterId = builder.clusterId;
        this.fetchCalendarDetail = builder.fetchCalendarDetail;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCalendarsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return calendarName
     */
    public String getCalendarName() {
        return this.calendarName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return fetchCalendarDetail
     */
    public Boolean getFetchCalendarDetail() {
        return this.fetchCalendarDetail;
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
     * @return year
     */
    public Integer getYear() {
        return this.year;
    }

    public static final class Builder extends Request.Builder<ListCalendarsRequest, Builder> {
        private String regionId; 
        private String calendarName; 
        private String clusterId; 
        private Boolean fetchCalendarDetail; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(ListCalendarsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.calendarName = request.calendarName;
            this.clusterId = request.clusterId;
            this.fetchCalendarDetail = request.fetchCalendarDetail;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.year = request.year;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CalendarName.
         */
        public Builder calendarName(String calendarName) {
            this.putQueryParameter("CalendarName", calendarName);
            this.calendarName = calendarName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * FetchCalendarDetail.
         */
        public Builder fetchCalendarDetail(Boolean fetchCalendarDetail) {
            this.putQueryParameter("FetchCalendarDetail", fetchCalendarDetail);
            this.fetchCalendarDetail = fetchCalendarDetail;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Year.
         */
        public Builder year(Integer year) {
            this.putQueryParameter("Year", year);
            this.year = year;
            return this;
        }

        @Override
        public ListCalendarsRequest build() {
            return new ListCalendarsRequest(this);
        } 

    } 

}
