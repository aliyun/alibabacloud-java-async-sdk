// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link StartEventStreamingRequest} extends {@link RequestModel}
 *
 * <p>StartEventStreamingRequest</p>
 */
public class StartEventStreamingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventStreamingName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventStreamingName;

    private StartEventStreamingRequest(Builder builder) {
        super(builder);
        this.eventStreamingName = builder.eventStreamingName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartEventStreamingRequest create() {
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

    public static final class Builder extends Request.Builder<StartEventStreamingRequest, Builder> {
        private String eventStreamingName; 

        private Builder() {
            super();
        } 

        private Builder(StartEventStreamingRequest request) {
            super(request);
            this.eventStreamingName = request.eventStreamingName;
        } 

        /**
         * <p>The name of the event stream that you want to enable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rocketmq-sync</p>
         */
        public Builder eventStreamingName(String eventStreamingName) {
            this.putBodyParameter("EventStreamingName", eventStreamingName);
            this.eventStreamingName = eventStreamingName;
            return this;
        }

        @Override
        public StartEventStreamingRequest build() {
            return new StartEventStreamingRequest(this);
        } 

    } 

}
