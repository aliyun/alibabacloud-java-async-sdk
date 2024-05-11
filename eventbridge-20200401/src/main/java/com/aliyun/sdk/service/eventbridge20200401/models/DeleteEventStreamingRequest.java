// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link DeleteEventStreamingRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventStreamingRequest</p>
 */
public class DeleteEventStreamingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventStreamingName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventStreamingName;

    private DeleteEventStreamingRequest(Builder builder) {
        super(builder);
        this.eventStreamingName = builder.eventStreamingName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventStreamingRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEventStreamingRequest, Builder> {
        private String eventStreamingName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventStreamingRequest request) {
            super(request);
            this.eventStreamingName = request.eventStreamingName;
        } 

        /**
         * The name of the event stream that you want to delete.
         */
        public Builder eventStreamingName(String eventStreamingName) {
            this.putBodyParameter("EventStreamingName", eventStreamingName);
            this.eventStreamingName = eventStreamingName;
            return this;
        }

        @Override
        public DeleteEventStreamingRequest build() {
            return new DeleteEventStreamingRequest(this);
        } 

    } 

}
