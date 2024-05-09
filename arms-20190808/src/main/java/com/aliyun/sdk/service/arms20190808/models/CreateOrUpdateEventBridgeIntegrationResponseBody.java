// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateEventBridgeIntegrationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateEventBridgeIntegrationResponseBody</p>
 */
public class CreateOrUpdateEventBridgeIntegrationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventBridgeIntegration")
    private EventBridgeIntegration eventBridgeIntegration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateOrUpdateEventBridgeIntegrationResponseBody(Builder builder) {
        this.eventBridgeIntegration = builder.eventBridgeIntegration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateEventBridgeIntegrationResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventBridgeIntegration
     */
    public EventBridgeIntegration getEventBridgeIntegration() {
        return this.eventBridgeIntegration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EventBridgeIntegration eventBridgeIntegration; 
        private String requestId; 

        /**
         * The information about the EventBridge integration.
         */
        public Builder eventBridgeIntegration(EventBridgeIntegration eventBridgeIntegration) {
            this.eventBridgeIntegration = eventBridgeIntegration;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateEventBridgeIntegrationResponseBody build() {
            return new CreateOrUpdateEventBridgeIntegrationResponseBody(this);
        } 

    } 

    public static class EventBridgeIntegration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("AccessSecret")
        private String accessSecret;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("EventBusName")
        private String eventBusName;

        @com.aliyun.core.annotation.NameInMap("EventBusRegionId")
        private String eventBusRegionId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private EventBridgeIntegration(Builder builder) {
            this.accessKey = builder.accessKey;
            this.accessSecret = builder.accessSecret;
            this.description = builder.description;
            this.endpoint = builder.endpoint;
            this.eventBusName = builder.eventBusName;
            this.eventBusRegionId = builder.eventBusRegionId;
            this.id = builder.id;
            this.name = builder.name;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventBridgeIntegration create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return accessSecret
         */
        public String getAccessSecret() {
            return this.accessSecret;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        /**
         * @return eventBusRegionId
         */
        public String getEventBusRegionId() {
            return this.eventBusRegionId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String accessKey; 
            private String accessSecret; 
            private String description; 
            private String endpoint; 
            private String eventBusName; 
            private String eventBusRegionId; 
            private Long id; 
            private String name; 
            private String source; 

            /**
             * The AccessKey ID that is used to connect to EventBridge.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * The AccessKey secret that is used to connect to EventBridge.
             */
            public Builder accessSecret(String accessSecret) {
                this.accessSecret = accessSecret;
                return this;
            }

            /**
             * The description of the EventBridge integration.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The public endpoint of EventBridge.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The name of the event bus.
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * The region ID of the event bus.
             */
            public Builder eventBusRegionId(String eventBusRegionId) {
                this.eventBusRegionId = eventBusRegionId;
                return this;
            }

            /**
             * The ID of the EventBridge integration.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the EventBridge integration.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The event source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public EventBridgeIntegration build() {
                return new EventBridgeIntegration(this);
            } 

        } 

    }
}
