// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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

        /**
         * eventDetail.
         */
        public Builder eventDetail(String eventDetail) {
            this.eventDetail = eventDetail;
            return this;
        }

        /**
         * eventId.
         */
        public Builder eventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * timestamp.
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
