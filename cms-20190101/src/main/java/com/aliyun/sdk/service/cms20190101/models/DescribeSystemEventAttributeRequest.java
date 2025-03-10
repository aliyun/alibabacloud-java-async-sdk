// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSystemEventAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeSystemEventAttributeRequest</p>
 */
public class DescribeSystemEventAttributeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

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

    private DescribeSystemEventAttributeRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.eventType = builder.eventType;
        this.groupId = builder.groupId;
        this.level = builder.level;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.product = builder.product;
        this.searchKeywords = builder.searchKeywords;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemEventAttributeRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<DescribeSystemEventAttributeRequest, Builder> {
        private String endTime; 
        private String eventType; 
        private String groupId; 
        private String level; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String product; 
        private String searchKeywords; 
        private String startTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSystemEventAttributeRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.eventType = request.eventType;
            this.groupId = request.groupId;
            this.level = request.level;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.product = request.product;
            this.searchKeywords = request.searchKeywords;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * <p>The end of the time range to query.</p>
         * <p>The value must be a UNIX timestamp. It is the number of seconds that have elapsed since 00:00:00 UTC, January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1552221584949</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The type of the system event.</p>
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
         * <p>12346</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The level of the system event. Valid values:</p>
         * <ul>
         * <li>CRITICAL: critical</li>
         * <li>WARN: warning</li>
         * <li>INFO: information</li>
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
         * <p>The name of the system event.</p>
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
         * <p>The number of the page to return.</p>
         * <p>Valid values: 1 to 100000000.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The abbreviation of the service name.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the abbreviations of service names.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
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
         * <p>The beginning of the time range to query.</p>
         * <p>The value must be a UNIX timestamp. It is the number of seconds that have elapsed since 00:00:00 UTC, January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1552199984949</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the system event.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the statuses of system events.</p>
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
        public DescribeSystemEventAttributeRequest build() {
            return new DescribeSystemEventAttributeRequest(this);
        } 

    } 

}
