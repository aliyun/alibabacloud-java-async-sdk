// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubscribedCalendarResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSubscribedCalendarResponseBody</p>
 */
public class CreateSubscribedCalendarResponseBody extends TeaModel {
    @NameInMap("calendarId")
    private String calendarId;

    @NameInMap("requestId")
    private String requestId;

    private CreateSubscribedCalendarResponseBody(Builder builder) {
        this.calendarId = builder.calendarId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubscribedCalendarResponseBody create() {
        return builder().build();
    }

    /**
     * @return calendarId
     */
    public String getCalendarId() {
        return this.calendarId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String calendarId; 
        private String requestId; 

        /**
         * calendarId.
         */
        public Builder calendarId(String calendarId) {
            this.calendarId = calendarId;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSubscribedCalendarResponseBody build() {
            return new CreateSubscribedCalendarResponseBody(this);
        } 

    } 

}
