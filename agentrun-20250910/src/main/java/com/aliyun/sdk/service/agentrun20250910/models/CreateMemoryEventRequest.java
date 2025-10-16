// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMemoryEventRequest} extends {@link RequestModel}
 *
 * <p>CreateMemoryEventRequest</p>
 */
public class CreateMemoryEventRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("events")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Events> events;

    private CreateMemoryEventRequest(Builder builder) {
        super(builder);
        this.memoryName = builder.memoryName;
        this.events = builder.events;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memoryName
     */
    public String getMemoryName() {
        return this.memoryName;
    }

    /**
     * @return events
     */
    public java.util.List<Events> getEvents() {
        return this.events;
    }

    public static final class Builder extends Request.Builder<CreateMemoryEventRequest, Builder> {
        private String memoryName; 
        private java.util.List<Events> events; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemoryEventRequest request) {
            super(request);
            this.memoryName = request.memoryName;
            this.events = request.events;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-memory</p>
         */
        public Builder memoryName(String memoryName) {
            this.putPathParameter("memoryName", memoryName);
            this.memoryName = memoryName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.putBodyParameter("events", events);
            this.events = events;
            return this;
        }

        @Override
        public CreateMemoryEventRequest build() {
            return new CreateMemoryEventRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMemoryEventRequest} extends {@link TeaModel}
     *
     * <p>CreateMemoryEventRequest</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("message")
        private java.util.List<java.util.Map<String, String>> message;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("userId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private Events(Builder builder) {
            this.eventId = builder.eventId;
            this.message = builder.message;
            this.metadata = builder.metadata;
            this.sessionId = builder.sessionId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return message
         */
        public java.util.List<java.util.Map<String, String>> getMessage() {
            return this.message;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String eventId; 
            private java.util.List<java.util.Map<String, String>> message; 
            private java.util.Map<String, ?> metadata; 
            private String sessionId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.eventId = model.eventId;
                this.message = model.message;
                this.metadata = model.metadata;
                this.sessionId = model.sessionId;
                this.userId = model.userId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>33.63.112.139_29914368_MTEE3_1754878127662_117007</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * message.
             */
            public Builder message(java.util.List<java.util.Map<String, String>> message) {
                this.message = message;
                return this;
            }

            /**
             * metadata.
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>fd0bbf26-3c0c-4d91-a392-42d59501e12b</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>uid1</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
