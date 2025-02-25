// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link UpdateEventBusRequest} extends {@link RequestModel}
 *
 * <p>UpdateEventBusRequest</p>
 */
public class UpdateEventBusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127, minLength = 2)
    private String eventBusName;

    private UpdateEventBusRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eventBusName = builder.eventBusName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventBusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventBusName
     */
    public String getEventBusName() {
        return this.eventBusName;
    }

    public static final class Builder extends Request.Builder<UpdateEventBusRequest, Builder> {
        private String description; 
        private String eventBusName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEventBusRequest request) {
            super(request);
            this.description = request.description;
            this.eventBusName = request.eventBusName;
        } 

        /**
         * The description of the event bus.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the event bus.
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        @Override
        public UpdateEventBusRequest build() {
            return new UpdateEventBusRequest(this);
        } 

    } 

}
