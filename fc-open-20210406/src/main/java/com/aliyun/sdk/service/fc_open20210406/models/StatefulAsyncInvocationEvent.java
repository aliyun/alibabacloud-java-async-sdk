// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StatefulAsyncInvocationEvent} extends {@link TeaModel}
 *
 * <p>StatefulAsyncInvocationEvent</p>
 */
public class StatefulAsyncInvocationEvent extends TeaModel {
    @NameInMap("eventDetail")
    private String eventDetail;

    @NameInMap("eventId")
    private Long eventId;

    @NameInMap("status")
    private String status;

    @NameInMap("timestamp")
    private Long timestamp;

    private StatefulAsyncInvocationEvent(Builder builder) {
        this.eventDetail = builder.eventDetail;
        this.eventId = builder.eventId;
        this.status = builder.status;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatefulAsyncInvocationEvent create() {
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

        public StatefulAsyncInvocationEvent build() {
            return new StatefulAsyncInvocationEvent(this);
        } 

    } 

}
