// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrendForSourceEventRequest} extends {@link RequestModel}
 *
 * <p>ListTrendForSourceEventRequest</p>
 */
public class ListTrendForSourceEventRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timeUnit")
    private Long timeUnit;

    private ListTrendForSourceEventRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.timeUnit = builder.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrendForSourceEventRequest create() {
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
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeUnit
     */
    public Long getTimeUnit() {
        return this.timeUnit;
    }

    public static final class Builder extends Request.Builder<ListTrendForSourceEventRequest, Builder> {
        private String endTime; 
        private Long instanceId; 
        private String instanceType; 
        private String requestId; 
        private String startTime; 
        private Long timeUnit; 

        private Builder() {
            super();
        } 

        private Builder(ListTrendForSourceEventRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.requestId = request.requestId;
            this.startTime = request.startTime;
            this.timeUnit = request.timeUnit;
        } 

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * instanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * timeUnit.
         */
        public Builder timeUnit(Long timeUnit) {
            this.putBodyParameter("timeUnit", timeUnit);
            this.timeUnit = timeUnit;
            return this;
        }

        @Override
        public ListTrendForSourceEventRequest build() {
            return new ListTrendForSourceEventRequest(this);
        } 

    } 

}
