// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link ReadSchedulerxCalendarRequest} extends {@link RequestModel}
 *
 * <p>ReadSchedulerxCalendarRequest</p>
 */
public class ReadSchedulerxCalendarRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalendarName")
    private String calendarName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FetchCalendarDetail")
    private Boolean fetchCalendarDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FetchSystemCalendar")
    private Boolean fetchSystemCalendar;

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
    @com.aliyun.core.annotation.NameInMap("Year")
    private Integer year;

    private ReadSchedulerxCalendarRequest(Builder builder) {
        super(builder);
        this.calendarName = builder.calendarName;
        this.fetchCalendarDetail = builder.fetchCalendarDetail;
        this.fetchSystemCalendar = builder.fetchSystemCalendar;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadSchedulerxCalendarRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calendarName
     */
    public String getCalendarName() {
        return this.calendarName;
    }

    /**
     * @return fetchCalendarDetail
     */
    public Boolean getFetchCalendarDetail() {
        return this.fetchCalendarDetail;
    }

    /**
     * @return fetchSystemCalendar
     */
    public Boolean getFetchSystemCalendar() {
        return this.fetchSystemCalendar;
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
     * @return year
     */
    public Integer getYear() {
        return this.year;
    }

    public static final class Builder extends Request.Builder<ReadSchedulerxCalendarRequest, Builder> {
        private String calendarName; 
        private Boolean fetchCalendarDetail; 
        private Boolean fetchSystemCalendar; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(ReadSchedulerxCalendarRequest request) {
            super(request);
            this.calendarName = request.calendarName;
            this.fetchCalendarDetail = request.fetchCalendarDetail;
            this.fetchSystemCalendar = request.fetchSystemCalendar;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.year = request.year;
        } 

        /**
         * <p>The calendar name.</p>
         * 
         * <strong>example:</strong>
         * <p>2025workday</p>
         */
        public Builder calendarName(String calendarName) {
            this.putQueryParameter("CalendarName", calendarName);
            this.calendarName = calendarName;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve calendar details. The default value is false.</p>
         * <ul>
         * <li>false: Returns only basic information without the detailed list of days for each month.</li>
         * <li>true: Returns the detailed list of days for each month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fetchCalendarDetail(Boolean fetchCalendarDetail) {
            this.putQueryParameter("FetchCalendarDetail", fetchCalendarDetail);
            this.fetchCalendarDetail = fetchCalendarDetail;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve system calendars. The default value is false.</p>
         * <ul>
         * <li>false: Returns only user-defined calendars.</li>
         * <li>true: Returns both system calendars and user-defined calendars.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fetchSystemCalendar(Boolean fetchSystemCalendar) {
            this.putQueryParameter("FetchSystemCalendar", fetchSystemCalendar);
            this.fetchSystemCalendar = fetchSystemCalendar;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on this call. The default value is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A token that specifies the starting position for retrieving the next page of data. You do not need to provide this parameter for the first request. An empty value indicates that all data has been read.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdYzT97YjSXWT8TQmxIAI5g=</p>
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
         * <p>The year.</p>
         * 
         * <strong>example:</strong>
         * <p>2025</p>
         */
        public Builder year(Integer year) {
            this.putQueryParameter("Year", year);
            this.year = year;
            return this;
        }

        @Override
        public ReadSchedulerxCalendarRequest build() {
            return new ReadSchedulerxCalendarRequest(this);
        } 

    } 

}
