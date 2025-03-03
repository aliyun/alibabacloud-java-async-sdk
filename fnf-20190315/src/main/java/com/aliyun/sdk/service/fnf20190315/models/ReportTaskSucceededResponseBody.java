// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link ReportTaskSucceededResponseBody} extends {@link TeaModel}
 *
 * <p>ReportTaskSucceededResponseBody</p>
 */
public class ReportTaskSucceededResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventId")
    private Long eventId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder eventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testRequestId</p>
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
