// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEventDefinitionRequest} extends {@link RequestModel}
 *
 * <p>UpdateEventDefinitionRequest</p>
 */
public class UpdateEventDefinitionRequest extends Request {
    @Body
    @NameInMap("EventId")
    @Validation(required = true)
    private String eventId;

    @Body
    @NameInMap("EventName")
    @Validation(required = true)
    private String eventName;

    @Body
    @NameInMap("EventType")
    @Validation(required = true)
    private String eventType;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("TemplateId")
    private String templateId;

    private UpdateEventDefinitionRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.eventName = builder.eventName;
        this.eventType = builder.eventType;
        this.instanceId = builder.instanceId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventDefinitionRequest create() {
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
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<UpdateEventDefinitionRequest, Builder> {
        private String eventId; 
        private String eventName; 
        private String eventType; 
        private String instanceId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEventDefinitionRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.eventName = request.eventName;
            this.eventType = request.eventType;
            this.instanceId = request.instanceId;
            this.templateId = request.templateId;
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
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.putBodyParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.putBodyParameter("EventType", eventType);
            this.eventType = eventType;
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

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public UpdateEventDefinitionRequest build() {
            return new UpdateEventDefinitionRequest(this);
        } 

    } 

}
