// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ListOperationEventsRequest} extends {@link RequestModel}
 *
 * <p>ListOperationEventsRequest</p>
 */
public class ListOperationEventsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("eventName")
    private String eventName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("eventNameDesc")
    private Boolean eventNameDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("eventType")
    private String eventType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scheduleTimeDesc")
    private Boolean scheduleTimeDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    private ListOperationEventsRequest(Builder builder) {
        super(builder);
        this.eventName = builder.eventName;
        this.eventNameDesc = builder.eventNameDesc;
        this.eventType = builder.eventType;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scheduleTimeDesc = builder.scheduleTimeDesc;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventNameDesc
     */
    public Boolean getEventNameDesc() {
        return this.eventNameDesc;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scheduleTimeDesc
     */
    public Boolean getScheduleTimeDesc() {
        return this.scheduleTimeDesc;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListOperationEventsRequest, Builder> {
        private String eventName; 
        private Boolean eventNameDesc; 
        private String eventType; 
        private String instanceId; 
        private Long pageNumber; 
        private Long pageSize; 
        private Boolean scheduleTimeDesc; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationEventsRequest request) {
            super(request);
            this.eventName = request.eventName;
            this.eventNameDesc = request.eventNameDesc;
            this.eventType = request.eventType;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scheduleTimeDesc = request.scheduleTimeDesc;
            this.state = request.state;
        } 

        /**
         * eventName.
         */
        public Builder eventName(String eventName) {
            this.putBodyParameter("eventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * eventNameDesc.
         */
        public Builder eventNameDesc(Boolean eventNameDesc) {
            this.putBodyParameter("eventNameDesc", eventNameDesc);
            this.eventNameDesc = eventNameDesc;
            return this;
        }

        /**
         * eventType.
         */
        public Builder eventType(String eventType) {
            this.putBodyParameter("eventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * scheduleTimeDesc.
         */
        public Builder scheduleTimeDesc(Boolean scheduleTimeDesc) {
            this.putBodyParameter("scheduleTimeDesc", scheduleTimeDesc);
            this.scheduleTimeDesc = scheduleTimeDesc;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.putBodyParameter("state", state);
            this.state = state;
            return this;
        }

        @Override
        public ListOperationEventsRequest build() {
            return new ListOperationEventsRequest(this);
        } 

    } 

}
