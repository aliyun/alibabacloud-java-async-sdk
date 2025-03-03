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
 * {@link CreateEventBusRequest} extends {@link RequestModel}
 *
 * <p>CreateEventBusRequest</p>
 */
public class CreateEventBusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127, minLength = 2)
    private String eventBusName;

    private CreateEventBusRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eventBusName = builder.eventBusName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventBusRequest create() {
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

    public static final class Builder extends Request.Builder<CreateEventBusRequest, Builder> {
        private String description; 
        private String eventBusName; 

        private Builder() {
            super();
        } 

        private Builder(CreateEventBusRequest request) {
            super(request);
            this.description = request.description;
            this.eventBusName = request.eventBusName;
        } 

        /**
         * <p>The description of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. The value true indicates that the request is successful.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyEventBus</p>
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        @Override
        public CreateEventBusRequest build() {
            return new CreateEventBusRequest(this);
        } 

    } 

}
