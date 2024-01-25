// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMessageRequest} extends {@link RequestModel}
 *
 * <p>CreateMessageRequest</p>
 */
public class CreateMessageRequest extends Request {
    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private CreateMessageRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateMessageRequest, Builder> {
        private String eventId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMessageRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.instanceId = request.instanceId;
        } 

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CreateMessageRequest build() {
            return new CreateMessageRequest(this);
        } 

    } 

}
