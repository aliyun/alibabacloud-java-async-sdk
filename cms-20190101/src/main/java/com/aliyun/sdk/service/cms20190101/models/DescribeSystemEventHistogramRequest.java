// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemEventHistogramRequest} extends {@link RequestModel}
 *
 * <p>DescribeSystemEventHistogramRequest</p>
 */
public class DescribeSystemEventHistogramRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EventType")
    private String eventType;

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
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("SearchKeywords")
    private String searchKeywords;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeSystemEventHistogramRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.eventType = builder.eventType;
        this.groupId = builder.groupId;
        this.level = builder.level;
        this.name = builder.name;
        this.product = builder.product;
        this.searchKeywords = builder.searchKeywords;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemEventHistogramRequest create() {
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
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
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
     * @return product
     */
    public String getProduct() {
        return this.product;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeSystemEventHistogramRequest, Builder> {
        private String endTime; 
        private String eventType; 
        private String groupId; 
        private String level; 
        private String name; 
        private String product; 
        private String searchKeywords; 
        private String startTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSystemEventHistogramRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.eventType = request.eventType;
            this.groupId = request.groupId;
            this.level = request.level;
            this.name = request.name;
            this.product = request.product;
            this.searchKeywords = request.searchKeywords;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * The end of the time range to query.
         * <p>
         * 
         * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of the system event.
         * <p>
         * 
         * >  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to view the types of system events.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The level of the system event. Valid values:
         * <p>
         * 
         * *   CRITICAL
         * *   WARN
         * *   INFO
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * The name of the system event.
         * <p>
         * 
         * >  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to view the names of system events.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The abbreviation of the service name.
         * <p>
         * 
         * >  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to view the abbreviations of service names.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * The keywords contained in the content of the system event to query. You can use a logical operator between keywords. Examples:
         * <p>
         * 
         * *   If you need to query the system event whose content contains a and b, set the value to `a and b`.
         * *   If you need to query the system event whose content contains a or b, set the value to `a or b`.
         */
        public Builder searchKeywords(String searchKeywords) {
            this.putQueryParameter("SearchKeywords", searchKeywords);
            this.searchKeywords = searchKeywords;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The status of the system event.
         * <p>
         * 
         * >  You can call the [DescribeSystemEventMetaList](~~114972~~) operation to view the statuses of system events.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeSystemEventHistogramRequest build() {
            return new DescribeSystemEventHistogramRequest(this);
        } 

    } 

}
