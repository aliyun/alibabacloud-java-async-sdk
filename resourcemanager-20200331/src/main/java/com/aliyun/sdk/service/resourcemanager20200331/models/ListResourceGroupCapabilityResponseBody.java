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
 * {@link ListResourceGroupCapabilityResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupCapabilityResponseBody</p>
 */
public class ListResourceGroupCapabilityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Capabilities")
    private java.util.List<Capabilities> capabilities;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListResourceGroupCapabilityResponseBody(Builder builder) {
        this.capabilities = builder.capabilities;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupCapabilityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capabilities
     */
    public java.util.List<Capabilities> getCapabilities() {
        return this.capabilities;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Capabilities> capabilities; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListResourceGroupCapabilityResponseBody model) {
            this.capabilities = model.capabilities;
            this.requestId = model.requestId;
        } 

        /**
         * Capabilities.
         */
        public Builder capabilities(java.util.List<Capabilities> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListResourceGroupCapabilityResponseBody build() {
            return new ListResourceGroupCapabilityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceGroupCapabilityResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupCapabilityResponseBody</p>
     */
    public static class Capabilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("SupportResourceGroupEvent")
        private Boolean supportResourceGroupEvent;

        private Capabilities(Builder builder) {
            this.resourceType = builder.resourceType;
            this.service = builder.service;
            this.supportResourceGroupEvent = builder.supportResourceGroupEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capabilities create() {
            return builder().build();
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

        public static final class Builder {
            private String resourceType; 
            private String service; 
            private Boolean supportResourceGroupEvent; 

            private Builder() {
            } 

            private Builder(Capabilities model) {
                this.resourceType = model.resourceType;
                this.service = model.service;
                this.supportResourceGroupEvent = model.supportResourceGroupEvent;
            } 

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * SupportResourceGroupEvent.
             */
            public Builder supportResourceGroupEvent(Boolean supportResourceGroupEvent) {
                this.supportResourceGroupEvent = supportResourceGroupEvent;
                return this;
            }

            public Capabilities build() {
                return new Capabilities(this);
            } 

        } 

    }
}
