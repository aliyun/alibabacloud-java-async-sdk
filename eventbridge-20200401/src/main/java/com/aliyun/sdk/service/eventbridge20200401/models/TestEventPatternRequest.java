// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link TestEventPatternRequest} extends {@link RequestModel}
 *
 * <p>TestEventPatternRequest</p>
 */
public class TestEventPatternRequest extends Request {
    @Body
    @NameInMap("Event")
    @Validation(required = true)
    private String event;

    @Body
    @NameInMap("EventPattern")
    @Validation(required = true)
    private String eventPattern;

    private TestEventPatternRequest(Builder builder) {
        super(builder);
        this.event = builder.event;
        this.eventPattern = builder.eventPattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestEventPatternRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return eventPattern
     */
    public String getEventPattern() {
        return this.eventPattern;
    }

    public static final class Builder extends Request.Builder<TestEventPatternRequest, Builder> {
        private String event; 
        private String eventPattern; 

        private Builder() {
            super();
        } 

        private Builder(TestEventPatternRequest request) {
            super(request);
            this.event = request.event;
            this.eventPattern = request.eventPattern;
        } 

        /**
         * The event.
         */
        public Builder event(String event) {
            this.putBodyParameter("Event", event);
            this.event = event;
            return this;
        }

        /**
         * The event pattern.
         */
        public Builder eventPattern(String eventPattern) {
            this.putBodyParameter("EventPattern", eventPattern);
            this.eventPattern = eventPattern;
            return this;
        }

        @Override
        public TestEventPatternRequest build() {
            return new TestEventPatternRequest(this);
        } 

    } 

}
