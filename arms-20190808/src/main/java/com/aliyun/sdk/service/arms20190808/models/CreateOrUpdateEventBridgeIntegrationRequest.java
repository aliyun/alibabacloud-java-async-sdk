// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link CreateOrUpdateEventBridgeIntegrationRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateEventBridgeIntegrationRequest</p>
 */
public class CreateOrUpdateEventBridgeIntegrationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessKey")
    private String accessKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessSecret")
    private String accessSecret;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    private String eventBusName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventBusRegionId")
    private String eventBusRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private CreateOrUpdateEventBridgeIntegrationRequest(Builder builder) {
        super(builder);
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

    public static CreateOrUpdateEventBridgeIntegrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateOrUpdateEventBridgeIntegrationRequest, Builder> {
        private String accessKey; 
        private String accessSecret; 
        private String description; 
        private String endpoint; 
        private String eventBusName; 
        private String eventBusRegionId; 
        private Long id; 
        private String name; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateEventBridgeIntegrationRequest request) {
            super(request);
            this.accessKey = request.accessKey;
            this.accessSecret = request.accessSecret;
            this.description = request.description;
            this.endpoint = request.endpoint;
            this.eventBusName = request.eventBusName;
            this.eventBusRegionId = request.eventBusRegionId;
            this.id = request.id;
            this.name = request.name;
            this.source = request.source;
        } 

        /**
         * <p>The AccessKey ID that is used to connect to EventBridge.</p>
         * 
         * <strong>example:</strong>
         * <p>abc******************</p>
         */
        public Builder accessKey(String accessKey) {
            this.putBodyParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * <p>The AccessKey secret that is used to connect to EventBridge.</p>
         * 
         * <strong>example:</strong>
         * <p>abc******************</p>
         */
        public Builder accessSecret(String accessSecret) {
            this.putBodyParameter("AccessSecret", accessSecret);
            this.accessSecret = accessSecret;
            return this;
        }

        /**
         * <p>The description of the EventBridge integration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The public endpoint of EventBridge.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxxx">http://xxxxx</a></p>
         */
        public Builder endpoint(String endpoint) {
            this.putBodyParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>EventBus_Test</p>
         */
        public Builder eventBusName(String eventBusName) {
            this.putBodyParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * <p>The region ID of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder eventBusRegionId(String eventBusRegionId) {
            this.putBodyParameter("EventBusRegionId", eventBusRegionId);
            this.eventBusRegionId = eventBusRegionId;
            return this;
        }

        /**
         * <p>The ID of the EventBridge integration.</p>
         * <ul>
         * <li>If you do not specify this parameter, an EventBridge integration is created.</li>
         * <li>If you specify this parameter, the specified EventBridge integration is modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the EventBridge integration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EventBridge_Test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The event source.</p>
         * 
         * <strong>example:</strong>
         * <p>arms</p>
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateOrUpdateEventBridgeIntegrationRequest build() {
            return new CreateOrUpdateEventBridgeIntegrationRequest(this);
        } 

    } 

}
