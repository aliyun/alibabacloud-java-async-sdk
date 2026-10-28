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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The on-call calendar. The key is the shift name, and the value is a list of on-call shifts for the shift within the queried date range.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;testName&quot;:[{&quot;contactId&quot;:&quot;testId&quot;,&quot;contactName&quot;:&quot;Zhang San&quot;,&quot;start&quot;:&quot;2024-10-10 09:00&quot;,&quot;end&quot;:&quot;2024-10-15 18:00&quot;}]}</p>
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
