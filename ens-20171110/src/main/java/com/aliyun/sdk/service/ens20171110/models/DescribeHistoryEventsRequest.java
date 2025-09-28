// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeHistoryEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHistoryEventsRequest</p>
 */
public class DescribeHistoryEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventLevels")
    private java.util.List<String> eventLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventStatus")
    private java.util.List<String> eventStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> eventTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    private DescribeHistoryEventsRequest(Builder builder) {
        super(builder);
        this.eventLevels = builder.eventLevels;
        this.eventStatus = builder.eventStatus;
        this.eventTypes = builder.eventTypes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceIds = builder.resourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventLevels
     */
    public java.util.List<String> getEventLevels() {
        return this.eventLevels;
    }

    /**
     * @return eventStatus
     */
    public java.util.List<String> getEventStatus() {
        return this.eventStatus;
    }

    /**
     * @return eventTypes
     */
    public java.util.List<String> getEventTypes() {
        return this.eventTypes;
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
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public static final class Builder extends Request.Builder<DescribeHistoryEventsRequest, Builder> {
        private java.util.List<String> eventLevels; 
        private java.util.List<String> eventStatus; 
        private java.util.List<String> eventTypes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> resourceIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHistoryEventsRequest request) {
            super(request);
            this.eventLevels = request.eventLevels;
            this.eventStatus = request.eventStatus;
            this.eventTypes = request.eventTypes;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceIds = request.resourceIds;
        } 

        /**
         * EventLevels.
         */
        public Builder eventLevels(java.util.List<String> eventLevels) {
            String eventLevelsShrink = shrink(eventLevels, "EventLevels", "simple");
            this.putQueryParameter("EventLevels", eventLevelsShrink);
            this.eventLevels = eventLevels;
            return this;
        }

        /**
         * EventStatus.
         */
        public Builder eventStatus(java.util.List<String> eventStatus) {
            String eventStatusShrink = shrink(eventStatus, "EventStatus", "simple");
            this.putQueryParameter("EventStatus", eventStatusShrink);
            this.eventStatus = eventStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder eventTypes(java.util.List<String> eventTypes) {
            String eventTypesShrink = shrink(eventTypes, "EventTypes", "simple");
            this.putQueryParameter("EventTypes", eventTypesShrink);
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            String resourceIdsShrink = shrink(resourceIds, "ResourceIds", "simple");
            this.putQueryParameter("ResourceIds", resourceIdsShrink);
            this.resourceIds = resourceIds;
            return this;
        }

        @Override
        public DescribeHistoryEventsRequest build() {
            return new DescribeHistoryEventsRequest(this);
        } 

    } 

}
