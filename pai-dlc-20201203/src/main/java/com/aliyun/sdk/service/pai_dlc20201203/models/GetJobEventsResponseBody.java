// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetJobEventsResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobEventsResponseBody</p>
 */
public class GetJobEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<String> events;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<String> getEvents() {
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
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> events; 
        private String jobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetJobEventsResponseBody model) {
            this.events = model.events;
            this.jobId = model.jobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The events.</p>
         */
        public Builder events(java.util.List<String> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-******</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>78F6FCE2-278F-4C4A-A6B7-DD8ECEA9C456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobEventsResponseBody build() {
            return new GetJobEventsResponseBody(this);
        } 

    } 

}
