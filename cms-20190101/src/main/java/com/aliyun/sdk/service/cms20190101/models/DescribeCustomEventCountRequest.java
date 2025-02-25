// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCustomEventCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomEventCountRequest</p>
 */
public class DescribeCustomEventCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKeywords")
    private String searchKeywords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeCustomEventCountRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.eventId = builder.eventId;
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.searchKeywords = builder.searchKeywords;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomEventCountRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCustomEventCountRequest, Builder> {
        private String endTime; 
        private String eventId; 
        private String groupId; 
        private String name; 
        private String searchKeywords; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomEventCountRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.eventId = request.eventId;
            this.groupId = request.groupId;
            this.name = request.name;
            this.searchKeywords = request.searchKeywords;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1552220485596</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the custom event.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the custom event.</p>
         * 
         * <strong>example:</strong>
         * <p>BABEL_BUY</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The keywords that are contained in the content of the custom event to query. You can use a logical operator between keywords.</p>
         * <ul>
         * <li>If you need to query the custom event whose content contains a and b, set the value to a and b.</li>
         * <li>If you need to query the custom event whose content contains a or b, set the value to a or b.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cms</p>
         */
        public Builder searchKeywords(String searchKeywords) {
            this.putQueryParameter("SearchKeywords", searchKeywords);
            this.searchKeywords = searchKeywords;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1552209685596</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeCustomEventCountRequest build() {
            return new DescribeCustomEventCountRequest(this);
        } 

    } 

}
