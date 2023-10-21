// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemEventCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeSystemEventCountRequest</p>
 */
public class DescribeSystemEventCountRequest extends Request {
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

    private DescribeSystemEventCountRequest(Builder builder) {
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

    public static DescribeSystemEventCountRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeSystemEventCountRequest, Builder> {
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

        private Builder(DescribeSystemEventCountRequest request) {
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
         * The timestamp that specifies the end of the time range to query. Unit: milliseconds.
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
         * You can call the DescribeSystemEventMetaList operation to obtain the value of the response parameter `EventType`. The value of the EventType parameter indicates the types of system events that occurred for all cloud services in your Alibaba Cloud account. For more information, see [DescribeSystemEventMetaList](~~114972~~).
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
         * *   Critical
         * *   Warn
         * *   Info
         * 
         * You can call the DescribeSystemEventMetaList operation to obtain the value of the response parameter `Level`. The value of the Level parameter indicates the levels of system events that occurred for all cloud services in your Alibaba Cloud account. For more information, see [DescribeSystemEventMetaList](~~114972~~).
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
         * You can call the DescribeSystemEventMetaList operation to obtain the value of the response parameter `Name`. The value of the Name parameter indicates the names of system events that occurred for all cloud services in your Alibaba Cloud account. For more information, see [DescribeSystemEventMetaList](~~114972~~).
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The name of the cloud service in which the system event occurred.
         * <p>
         * 
         * You can call the DescribeSystemEventMetaList operation to obtain the value of the response parameter `Product`. The value of the Product parameter indicates the names of all cloud services in which the system events of your Alibaba Cloud account occurred. For more information, see [DescribeSystemEventMetaList](~~114972~~).
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * The keywords that are used to search for the system event. You can use a logical operator to connect keywords. Valid values:
         * <p>
         * 
         * *   If you want to search for the system event whose content contains a and b, set the value to `a and b`.
         * *   If you want to search for the system event whose content contains a or b, set the value to `a or b`.
         */
        public Builder searchKeywords(String searchKeywords) {
            this.putQueryParameter("SearchKeywords", searchKeywords);
            this.searchKeywords = searchKeywords;
            return this;
        }

        /**
         * The timestamp that specifies the start of the time range to query. Unit: milliseconds.
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
         * You can call the DescribeSystemEventMetaList operation to obtain the value of the response parameter `Status`. The value of the Status parameter indicates the status of system events that occurred for all cloud services in your Alibaba Cloud account. For more information, see [DescribeSystemEventMetaList](~~114972~~).
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeSystemEventCountRequest build() {
            return new DescribeSystemEventCountRequest(this);
        } 

    } 

}
