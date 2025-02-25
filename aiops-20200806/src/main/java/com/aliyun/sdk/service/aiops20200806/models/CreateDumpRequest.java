// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDumpRequest} extends {@link RequestModel}
 *
 * <p>CreateDumpRequest</p>
 */
public class CreateDumpRequest extends Request {
    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private CreateDumpRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDumpRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDumpRequest, Builder> {
        private String eventId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDumpRequest request) {
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
        public CreateDumpRequest build() {
            return new CreateDumpRequest(this);
        } 

    } 

}
