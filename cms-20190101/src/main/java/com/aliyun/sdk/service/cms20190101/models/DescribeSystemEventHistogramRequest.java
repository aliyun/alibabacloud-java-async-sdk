// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSystemEventHistogramRequest} extends {@link RequestModel}
 *
 * <p>DescribeSystemEventHistogramRequest</p>
 */
public class DescribeSystemEventHistogramRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKeywords")
    private String searchKeywords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>The end time.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
         * <p>The event type.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the types of system events.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Exception</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
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
         * <p>The level of the event. Valid values:</p>
         * <ul>
         * <li>CRITICAL</li>
         * <li>WARN</li>
         * <li>INFO</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The event name.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the names of system events.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>BucketIngressBandwidth</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The abbreviation of the service name.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the abbreviations of service names.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * <p>The keywords that are used to search for the system event. Valid values:</p>
         * <ul>
         * <li>If you want to search for the system event whose content contains a and b, set the value to <code>a and b</code>.</li>
         * <li>If you want to search for the system event whose content contains a or b, set the value to <code>a or b</code>.</li>
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
         * <p>The start time.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1552209685596</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The event status.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the status of system events.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
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
