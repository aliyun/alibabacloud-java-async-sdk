// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportTaskSucceededResponseBody} extends {@link TeaModel}
 *
 * <p>ReportTaskSucceededResponseBody</p>
 */
public class ReportTaskSucceededResponseBody extends TeaModel {
    @NameInMap("EventId")
    private Long eventId;

    @NameInMap("RequestId")
    private String requestId;

    private ReportTaskSucceededResponseBody(Builder builder) {
        this.eventId = builder.eventId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportTaskSucceededResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long eventId; 
        private String requestId; 

        /**
         * The ID of the event.
         */
        public Builder eventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReportTaskSucceededResponseBody build() {
            return new ReportTaskSucceededResponseBody(this);
        } 

    } 

}
