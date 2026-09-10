// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationResponseBody</p>
 */
public class CreateApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceAvailable")
    private Boolean resourceAvailable;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateApplicationResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.components = builder.components;
        this.description = builder.description;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.resourceAvailable = builder.resourceAvailable;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceAvailable
     */
    public Boolean getResourceAvailable() {
        return this.resourceAvailable;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder {
        private String applicationId; 
        private java.util.List<Components> components; 
        private String description; 
        private String orderId; 
        private String requestId; 
        private Boolean resourceAvailable; 
        private String resourceGroupId; 

        private Builder() {
        } 

        private Builder(CreateApplicationResponseBody model) {
            this.applicationId = model.applicationId;
            this.components = model.components;
            this.description = model.description;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
            this.resourceAvailable = model.resourceAvailable;
            this.resourceGroupId = model.resourceGroupId;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-********************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The list of child components.</p>
         */
        public Builder components(java.util.List<Components> components) {
            this.components = components;
            return this;
        }

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>myapp</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The generated order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2148126708*****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether resources are sufficient. This parameter is returned only when DryRun is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder resourceAvailable(Boolean resourceAvailable) {
            this.resourceAvailable = resourceAvailable;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-********************</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public CreateApplicationResponseBody build() {
            return new CreateApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>CreateApplicationResponseBody</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private String componentId;

        private Components(Builder builder) {
            this.componentId = builder.componentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        public static final class Builder {
            private String componentId; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.componentId = model.componentId;
            } 

            /**
             * <p>The child component ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pac-********************</p>
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
