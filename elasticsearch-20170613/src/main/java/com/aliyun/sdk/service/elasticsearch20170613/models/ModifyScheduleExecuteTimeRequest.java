// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ModifyScheduleExecuteTimeRequest} extends {@link RequestModel}
 *
 * <p>ModifyScheduleExecuteTimeRequest</p>
 */
public class ModifyScheduleExecuteTimeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scheduleExecuteTime")
    private String scheduleExecuteTime;

    private ModifyScheduleExecuteTimeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.eventId = builder.eventId;
        this.scheduleExecuteTime = builder.scheduleExecuteTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScheduleExecuteTimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return scheduleExecuteTime
     */
    public String getScheduleExecuteTime() {
        return this.scheduleExecuteTime;
    }

    public static final class Builder extends Request.Builder<ModifyScheduleExecuteTimeRequest, Builder> {
        private String instanceId; 
        private String eventId; 
        private String scheduleExecuteTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScheduleExecuteTimeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.eventId = request.eventId;
            this.scheduleExecuteTime = request.scheduleExecuteTime;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * eventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("eventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * scheduleExecuteTime.
         */
        public Builder scheduleExecuteTime(String scheduleExecuteTime) {
            this.putQueryParameter("scheduleExecuteTime", scheduleExecuteTime);
            this.scheduleExecuteTime = scheduleExecuteTime;
            return this;
        }

        @Override
        public ModifyScheduleExecuteTimeRequest build() {
            return new ModifyScheduleExecuteTimeRequest(this);
        } 

    } 

}
