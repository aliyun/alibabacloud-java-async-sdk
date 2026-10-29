// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ViewOncallScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>ViewOncallScheduleResponseBody</p>
 */
public class ViewOncallScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("schedule")
    private java.util.Map<String, java.util.List<ScheduleValue>> schedule;

    private ViewOncallScheduleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewOncallScheduleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schedule
     */
    public java.util.Map<String, java.util.List<ScheduleValue>> getSchedule() {
        return this.schedule;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, java.util.List<ScheduleValue>> schedule; 

        private Builder() {
        } 

        private Builder(ViewOncallScheduleResponseBody model) {
            this.requestId = model.requestId;
            this.schedule = model.schedule;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * schedule.
         */
        public Builder schedule(java.util.Map<String, java.util.List<ScheduleValue>> schedule) {
            this.schedule = schedule;
            return this;
        }

        public ViewOncallScheduleResponseBody build() {
            return new ViewOncallScheduleResponseBody(this);
        } 

    } 

}
