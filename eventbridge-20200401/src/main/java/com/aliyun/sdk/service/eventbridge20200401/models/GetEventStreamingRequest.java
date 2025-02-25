// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link GetEventStreamingRequest} extends {@link RequestModel}
 *
 * <p>GetEventStreamingRequest</p>
 */
public class GetEventStreamingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventStreamingName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventStreamingName;

    private GetEventStreamingRequest(Builder builder) {
        super(builder);
        this.eventStreamingName = builder.eventStreamingName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventStreamingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventStreamingName
     */
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

    public static final class Builder extends Request.Builder<GetEventStreamingRequest, Builder> {
        private String eventStreamingName; 

        private Builder() {
            super();
        } 

        private Builder(GetEventStreamingRequest request) {
            super(request);
            this.eventStreamingName = request.eventStreamingName;
        } 

        /**
         * The name of the event stream whose details you want to query.
         */
        public Builder eventStreamingName(String eventStreamingName) {
            this.putBodyParameter("EventStreamingName", eventStreamingName);
            this.eventStreamingName = eventStreamingName;
            return this;
        }

        @Override
        public GetEventStreamingRequest build() {
            return new GetEventStreamingRequest(this);
        } 

    } 

}
