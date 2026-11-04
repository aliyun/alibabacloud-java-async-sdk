// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListAgentEventsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentEventsRequest</p>
 */
public class ListAgentEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Event")
    private java.util.List<String> event;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> ramId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopTime")
    private Long stopTime;

    private ListAgentEventsRequest(Builder builder) {
        super(builder);
        this.event = builder.event;
        this.instanceId = builder.instanceId;
        this.ramId = builder.ramId;
        this.startTime = builder.startTime;
        this.stopTime = builder.stopTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return event
     */
    public java.util.List<String> getEvent() {
        return this.event;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ramId
     */
    public java.util.List<String> getRamId() {
        return this.ramId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return stopTime
     */
    public Long getStopTime() {
        return this.stopTime;
    }

    public static final class Builder extends Request.Builder<ListAgentEventsRequest, Builder> {
        private java.util.List<String> event; 
        private String instanceId; 
        private java.util.List<String> ramId; 
        private Long startTime; 
        private Long stopTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentEventsRequest request) {
            super(request);
            this.event = request.event;
            this.instanceId = request.instanceId;
            this.ramId = request.ramId;
            this.startTime = request.startTime;
            this.stopTime = request.stopTime;
        } 

        /**
         * Event.
         */
        public Builder event(java.util.List<String> event) {
            this.putQueryParameter("Event", event);
            this.event = event;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ramId(java.util.List<String> ramId) {
            this.putQueryParameter("RamId", ramId);
            this.ramId = ramId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StopTime.
         */
        public Builder stopTime(Long stopTime) {
            this.putQueryParameter("StopTime", stopTime);
            this.stopTime = stopTime;
            return this;
        }

        @Override
        public ListAgentEventsRequest build() {
            return new ListAgentEventsRequest(this);
        } 

    } 

}
