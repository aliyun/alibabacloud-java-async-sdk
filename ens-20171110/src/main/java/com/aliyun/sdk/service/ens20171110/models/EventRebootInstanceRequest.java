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
 * {@link EventRebootInstanceRequest} extends {@link RequestModel}
 *
 * <p>EventRebootInstanceRequest</p>
 */
public class EventRebootInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String opsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanTime")
    private Long planTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanUtcTime")
    private String planUtcTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    private EventRebootInstanceRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.opsType = builder.opsType;
        this.planTime = builder.planTime;
        this.planUtcTime = builder.planUtcTime;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventRebootInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return opsType
     */
    public String getOpsType() {
        return this.opsType;
    }

    /**
     * @return planTime
     */
    public Long getPlanTime() {
        return this.planTime;
    }

    /**
     * @return planUtcTime
     */
    public String getPlanUtcTime() {
        return this.planUtcTime;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<EventRebootInstanceRequest, Builder> {
        private String eventId; 
        private String opsType; 
        private Long planTime; 
        private String planUtcTime; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(EventRebootInstanceRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.opsType = request.opsType;
            this.planTime = request.planTime;
            this.planUtcTime = request.planUtcTime;
            this.resourceId = request.resourceId;
        } 

        /**
         * <p>The system event ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e-9d992570200d86b9126d78aa8c37b54b</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The O&amp;M task type. Valid values:</p>
         * <ul>
         * <li><p>immediate: Executes the task immediately.</p>
         * </li>
         * <li><p>scheduled: Executes the task at a scheduled time.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immediate</p>
         */
        public Builder opsType(String opsType) {
            this.putQueryParameter("OpsType", opsType);
            this.opsType = opsType;
            return this;
        }

        /**
         * <p>The scheduled execution time. The value is a timestamp in milliseconds. This parameter is required when OpsType is set to scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>1742452232000</p>
         */
        public Builder planTime(Long planTime) {
            this.putQueryParameter("PlanTime", planTime);
            this.planTime = planTime;
            return this;
        }

        /**
         * PlanUtcTime.
         */
        public Builder planUtcTime(String planUtcTime) {
            this.putQueryParameter("PlanUtcTime", planUtcTime);
            this.planUtcTime = planUtcTime;
            return this;
        }

        /**
         * <p>The resource ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public EventRebootInstanceRequest build() {
            return new EventRebootInstanceRequest(this);
        } 

    } 

}
