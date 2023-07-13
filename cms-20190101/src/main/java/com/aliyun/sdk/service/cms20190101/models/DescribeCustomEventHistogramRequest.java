// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomEventHistogramRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomEventHistogramRequest</p>
 */
public class DescribeCustomEventHistogramRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("SearchKeywords")
    private String searchKeywords;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeCustomEventHistogramRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.eventId = builder.eventId;
        this.groupId = builder.groupId;
        this.level = builder.level;
        this.name = builder.name;
        this.searchKeywords = builder.searchKeywords;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomEventHistogramRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return searchKeywords
     */
    public String getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeCustomEventHistogramRequest, Builder> {
        private String endTime; 
        private String eventId; 
        private String groupId; 
        private String level; 
        private String name; 
        private String searchKeywords; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomEventHistogramRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.eventId = request.eventId;
            this.groupId = request.groupId;
            this.level = request.level;
            this.name = request.name;
            this.searchKeywords = request.searchKeywords;
            this.startTime = request.startTime;
        } 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * The keywords that are contained in the content of the custom event to query. You can use a logical operator between keywords.
         * <p>
         * 
         * *   If you need to query the custom event whose content contains a and b, set the value to a and b.
         * *   If you need to query the custom event whose content contains a or b, set the value to a or b.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the custom event.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * The level of the custom event. Valid values:
         * <p>
         * 
         * *   CRITICAL
         * *   WARN
         * *   INFO
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder searchKeywords(String searchKeywords) {
            this.putQueryParameter("SearchKeywords", searchKeywords);
            this.searchKeywords = searchKeywords;
            return this;
        }

        /**
         * The end of the time range to query.
         * <p>
         * 
         * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeCustomEventHistogramRequest build() {
            return new DescribeCustomEventHistogramRequest(this);
        } 

    } 

}
