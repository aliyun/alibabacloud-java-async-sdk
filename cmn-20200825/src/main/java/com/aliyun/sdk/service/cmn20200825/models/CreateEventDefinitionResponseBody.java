// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEventDefinitionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEventDefinitionResponseBody</p>
 */
public class CreateEventDefinitionResponseBody extends TeaModel {
    @NameInMap("EventId")
    private String eventId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateEventDefinitionResponseBody(Builder builder) {
        this.eventId = builder.eventId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventDefinitionResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String eventId; 
        private String requestId; 

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEventDefinitionResponseBody build() {
            return new CreateEventDefinitionResponseBody(this);
        } 

    } 

}
