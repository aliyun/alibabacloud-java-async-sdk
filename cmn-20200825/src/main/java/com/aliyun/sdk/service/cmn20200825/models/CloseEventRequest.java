// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseEventRequest} extends {@link RequestModel}
 *
 * <p>CloseEventRequest</p>
 */
public class CloseEventRequest extends Request {
    @Body
    @NameInMap("EventName")
    @Validation(required = true)
    private String eventName;

    @Body
    @NameInMap("EventObjectId")
    @Validation(required = true)
    private String eventObjectId;

    @Body
    @NameInMap("EventType")
    @Validation(required = true)
    private String eventType;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private CloseEventRequest(Builder builder) {
        super(builder);
        this.eventName = builder.eventName;
        this.eventObjectId = builder.eventObjectId;
        this.eventType = builder.eventType;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventObjectId
     */
    public String getEventObjectId() {
        return this.eventObjectId;
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

    public static final class Builder extends Request.Builder<CloseEventRequest, Builder> {
        private String eventName; 
        private String eventObjectId; 
        private String eventType; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CloseEventRequest request) {
            super(request);
            this.eventName = request.eventName;
            this.eventObjectId = request.eventObjectId;
            this.eventType = request.eventType;
            this.instanceId = request.instanceId;
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
         * EventObjectId.
         */
        public Builder eventObjectId(String eventObjectId) {
            this.putBodyParameter("EventObjectId", eventObjectId);
            this.eventObjectId = eventObjectId;
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

        @Override
        public CloseEventRequest build() {
            return new CloseEventRequest(this);
        } 

    } 

}
