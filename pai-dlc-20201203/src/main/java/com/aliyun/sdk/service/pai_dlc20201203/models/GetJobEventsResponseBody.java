// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobEventsResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobEventsResponseBody</p>
 */
public class GetJobEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    private java.util.List < String > events;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("RequestId")
    private Integer requestId;

    private GetJobEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return events
     */
    public java.util.List < String > getEvents() {
        return this.events;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public Integer getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > events; 
        private String jobId; 
        private Integer requestId; 

        /**
         * 事件
         */
        public Builder events(java.util.List < String > events) {
            this.events = events;
            return this;
        }

        /**
         * 作业ID
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(Integer requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobEventsResponseBody build() {
            return new GetJobEventsResponseBody(this);
        } 

    } 

}
