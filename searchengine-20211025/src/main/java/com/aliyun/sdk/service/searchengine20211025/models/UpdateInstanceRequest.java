// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @Path
    @NameInMap("instanceId")
    private String instanceId;

    @Body
    @NameInMap("components")
    private java.util.List < Components> components;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("orderType")
    private String orderType;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.components = builder.components;
        this.description = builder.description;
        this.orderType = builder.orderType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return components
     */
    public java.util.List < Components> getComponents() {
        return this.components;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String instanceId; 
        private java.util.List < Components> components; 
        private String description; 
        private String orderType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.components = request.components;
            this.description = request.description;
            this.orderType = request.orderType;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * A list of instance-related specifications.
         */
        public Builder components(java.util.List < Components> components) {
            this.putBodyParameter("components", components);
            this.components = components;
            return this;
        }

        /**
         * The description of the instance.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * Valid values: UPGRADE and DOWNGRADE. UPGRADE indicates to upgrade the instance specifications. DOWNGRADE indicates to downgrade the instance specifications.
         */
        public Builder orderType(String orderType) {
            this.putBodyParameter("orderType", orderType);
            this.orderType = orderType;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

    public static class Components extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("value")
        private String value;

        private Components(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            /**
             * The specification code, which must be consistent with the values of the corresponding module parameters.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The value of the specification.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
