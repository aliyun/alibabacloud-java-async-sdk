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
 * {@link PutEventsRequest} extends {@link RequestModel}
 *
 * <p>PutEventsRequest</p>
 */
public class PutEventsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventBusName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventList")
    private java.util.List<EventList> eventList;

    private PutEventsRequest(Builder builder) {
        super(builder);
        this.eventBusName = builder.eventBusName;
        this.eventList = builder.eventList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventBusName
     */
    public String getEventBusName() {
        return this.eventBusName;
    }

    /**
     * @return eventList
     */
    public java.util.List<EventList> getEventList() {
        return this.eventList;
    }

    public static final class Builder extends Request.Builder<PutEventsRequest, Builder> {
        private String eventBusName; 
        private java.util.List<EventList> eventList; 

        private Builder() {
            super();
        } 

        private Builder(PutEventsRequest request) {
            super(request);
            this.eventBusName = request.eventBusName;
            this.eventList = request.eventList;
        } 

        /**
         * <p>The name of the event bus.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-bus</p>
         */
        public Builder eventBusName(String eventBusName) {
            this.putBodyParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * <p>The list of events.</p>
         */
        public Builder eventList(java.util.List<EventList> eventList) {
            String eventListShrink = shrink(eventList, "EventList", "json");
            this.putBodyParameter("EventList", eventListShrink);
            this.eventList = eventList;
            return this;
        }

        @Override
        public PutEventsRequest build() {
            return new PutEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link PutEventsRequest} extends {@link TeaModel}
     *
     * <p>PutEventsRequest</p>
     */
    public static class EventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("DataContentType")
        private String dataContentType;

        @com.aliyun.core.annotation.NameInMap("DataSchema")
        private String dataSchema;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("Source")
        @com.aliyun.core.annotation.Validation(required = true)
        private String source;

        @com.aliyun.core.annotation.NameInMap("SpecVersion")
        private String specVersion;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private EventList(Builder builder) {
            this.data = builder.data;
            this.dataContentType = builder.dataContentType;
            this.dataSchema = builder.dataSchema;
            this.id = builder.id;
            this.source = builder.source;
            this.specVersion = builder.specVersion;
            this.subject = builder.subject;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return dataContentType
         */
        public String getDataContentType() {
            return this.dataContentType;
        }

        /**
         * @return dataSchema
         */
        public String getDataSchema() {
            return this.dataSchema;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return specVersion
         */
        public String getSpecVersion() {
            return this.specVersion;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Object data; 
            private String dataContentType; 
            private String dataSchema; 
            private String id; 
            private String source; 
            private String specVersion; 
            private String subject; 
            private String time; 
            private String type; 

            private Builder() {
            } 

            private Builder(EventList model) {
                this.data = model.data;
                this.dataContentType = model.dataContentType;
                this.dataSchema = model.dataSchema;
                this.id = model.id;
                this.source = model.source;
                this.specVersion = model.specVersion;
                this.subject = model.subject;
                this.time = model.time;
                this.type = model.type;
            } 

            /**
             * <p>The event payload.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;orderId&quot;: &quot;1001&quot;, &quot;amount&quot;: 99.9}</p>
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The data format.</p>
             * 
             * <strong>example:</strong>
             * <p>application/json</p>
             */
            public Builder dataContentType(String dataContentType) {
                this.dataContentType = dataContentType;
                return this;
            }

            /**
             * <p>The data schema address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/schema/v1">https://example.com/schema/v1</a></p>
             */
            public Builder dataSchema(String dataSchema) {
                this.dataSchema = dataSchema;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>5a2c8f4e-0001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The event source.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my.custom.source</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The protocol version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder specVersion(String specVersion) {
                this.specVersion = specVersion;
                return this;
            }

            /**
             * <p>The event subject.</p>
             * 
             * <strong>example:</strong>
             * <p>order-1001</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * <p>The event time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-04T10:00:00Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The event type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>order:created</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
}
