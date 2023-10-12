// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventDefinitionRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventDefinitionRequest</p>
 */
public class DeleteEventDefinitionRequest extends Request {
    @Body
    @NameInMap("EventId")
    @Validation(required = true)
    private String eventId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteEventDefinitionRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventDefinitionRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEventDefinitionRequest, Builder> {
        private String eventId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventDefinitionRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.instanceId = request.instanceId;
        } 

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putBodyParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteEventDefinitionRequest build() {
            return new DeleteEventDefinitionRequest(this);
        } 

    } 

}
