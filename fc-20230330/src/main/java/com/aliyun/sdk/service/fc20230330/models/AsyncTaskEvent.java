// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link AsyncTaskEvent} extends {@link TeaModel}
 *
 * <p>AsyncTaskEvent</p>
 */
public class AsyncTaskEvent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("eventDetail")
    private String eventDetail;

    @com.aliyun.core.annotation.NameInMap("eventId")
    private Long eventId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("timestamp")
    private Long timestamp;

    private AsyncTaskEvent(Builder builder) {
        this.eventDetail = builder.eventDetail;
        this.eventId = builder.eventId;
        this.status = builder.status;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncTaskEvent create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventDetail
     */
    public String getEventDetail() {
        return this.eventDetail;
    }

    /**
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private String eventDetail; 
        private Long eventId; 
        private String status; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(AsyncTaskEvent model) {
            this.eventDetail = model.eventDetail;
            this.eventId = model.eventId;
            this.status = model.status;
            this.timestamp = model.timestamp;
        } 

        /**
         * <p>The details of the event payload.</p>
         * 
         * <strong>example:</strong>
         * <p>body</p>
         */
        public Builder eventDetail(String eventDetail) {
            this.eventDetail = eventDetail;
            return this;
        }

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder eventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The state of the event.</p>
         * <ul>
         * <li>Enqueued: The asynchronous invocation is enqueued and is waiting to be executed.</li>
         * <li>Succeeded: The invocation is successful.</li>
         * <li>Failed: The invocation fails.</li>
         * <li>Running: The invocation is being executed.</li>
         * <li>Stopped: The invocation is terminated.</li>
         * <li>Stopping: The invocation is being terminated.</li>
         * <li>Invalid: The invocation is invalid and not executed due to specific reasons. For example, the function is deleted.</li>
         * <li>Expired: The maximum validity period of messages is specified for asynchronous invocation. The invocation is discarded and not executed because the specified maximum validity period of has elapsed.</li>
         * <li>Retrying: The asynchronous invocation is being retried due to an execution error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The timestamp when the event occurred. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1647420449721</p>
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public AsyncTaskEvent build() {
            return new AsyncTaskEvent(this);
        } 

    } 

}
