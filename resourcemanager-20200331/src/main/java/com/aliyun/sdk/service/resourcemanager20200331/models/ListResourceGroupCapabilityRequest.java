// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ListResourceGroupCapabilityRequest} extends {@link RequestModel}
 *
 * <p>ListResourceGroupCapabilityRequest</p>
 */
public class ListResourceGroupCapabilityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportResourceGroupEvent")
    private Boolean supportResourceGroupEvent;

    private ListResourceGroupCapabilityRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
        this.service = builder.service;
        this.supportResourceGroupEvent = builder.supportResourceGroupEvent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupCapabilityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return supportResourceGroupEvent
     */
    public Boolean getSupportResourceGroupEvent() {
        return this.supportResourceGroupEvent;
    }

    public static final class Builder extends Request.Builder<ListResourceGroupCapabilityRequest, Builder> {
        private String resourceType; 
        private String service; 
        private Boolean supportResourceGroupEvent; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceGroupCapabilityRequest request) {
            super(request);
            this.resourceType = request.resourceType;
            this.service = request.service;
            this.supportResourceGroupEvent = request.supportResourceGroupEvent;
        } 

        /**
         * <p>The resource type.</p>
         * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud service.</p>
         * <p>You can obtain the service code from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>Specifies whether a specific resource type or cloud service supports resource group events.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportResourceGroupEvent(Boolean supportResourceGroupEvent) {
            this.putQueryParameter("SupportResourceGroupEvent", supportResourceGroupEvent);
            this.supportResourceGroupEvent = supportResourceGroupEvent;
            return this;
        }

        @Override
        public ListResourceGroupCapabilityRequest build() {
            return new ListResourceGroupCapabilityRequest(this);
        } 

    } 

}
