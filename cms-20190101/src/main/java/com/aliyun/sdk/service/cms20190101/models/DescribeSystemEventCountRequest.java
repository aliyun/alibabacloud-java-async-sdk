// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeSystemEventCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeSystemEventCountRequest</p>
 */
public class DescribeSystemEventCountRequest extends Request {
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
         * <p>The timestamp of the end time for the event query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1635993921000</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The event type.</p>
         * <p>Call the DescribeSystemEventMetaList operation to obtain the value of the <code>EventType</code> response parameter, which provides the event types for all Alibaba Cloud services under the current Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>StatusNotification</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The application group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17285****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The event level. Valid values:</p>
         * <ul>
         * <li><p>Critical: critical.</p>
         * </li>
         * <li><p>Warn: warning.</p>
         * </li>
         * <li><p>Info: information.</p>
         * </li>
         * </ul>
         * <p>Call the DescribeSystemEventMetaList operation to obtain the value of the <code>Level</code> response parameter, which provides the event levels for all Alibaba Cloud services under the current Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Info</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The event name.</p>
         * <p>Call the DescribeSystemEventMetaList operation to obtain the value of the <code>Name</code> response parameter, which provides the event names for all Alibaba Cloud services under the current Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance:StateChange</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the Alibaba Cloud service.</p>
         * <p>Call the DescribeSystemEventMetaList operation to obtain the value of the <code>Product</code> response parameter, which provides the Alibaba Cloud service names for all events under the current Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * <p>The keywords contained in the event content for searching. Valid values:</p>
         * <ul>
         * <li><p>To search for event content that contains both a and b, search for <code>a and b</code>.</p>
         * </li>
         * <li><p>To search for event content that contains either a or b, search for <code>a or b</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder searchKeywords(String searchKeywords) {
            this.putQueryParameter("SearchKeywords", searchKeywords);
            this.searchKeywords = searchKeywords;
            return this;
        }

        /**
         * <p>The timestamp of the start time for the event query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1635993541000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The event status.</p>
         * <p>Call the DescribeSystemEventMetaList operation to obtain the value of the <code>Status</code> response parameter, which provides the event statuses for all Alibaba Cloud services under the current Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
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
