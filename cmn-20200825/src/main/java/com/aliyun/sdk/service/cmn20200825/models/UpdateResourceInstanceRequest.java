// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceInstanceRequest</p>
 */
public class UpdateResourceInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ResourceInformation")
    @Validation(required = true)
    private java.util.List < ResourceInformation> resourceInformation;

    @Query
    @NameInMap("ResourceInformationId")
    private String resourceInformationId;

    @Query
    @NameInMap("SetupProjectId")
    @Validation(required = true)
    private String setupProjectId;

    private UpdateResourceInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceInformation = builder.resourceInformation;
        this.resourceInformationId = builder.resourceInformationId;
        this.setupProjectId = builder.setupProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceInstanceRequest create() {
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
     * @return resourceInformation
     */
    public java.util.List < ResourceInformation> getResourceInformation() {
        return this.resourceInformation;
    }

    /**
     * @return resourceInformationId
     */
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

    /**
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public static final class Builder extends Request.Builder<UpdateResourceInstanceRequest, Builder> {
        private String instanceId; 
        private java.util.List < ResourceInformation> resourceInformation; 
        private String resourceInformationId; 
        private String setupProjectId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceInformation = request.resourceInformation;
            this.resourceInformationId = request.resourceInformationId;
            this.setupProjectId = request.setupProjectId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ResourceInformation.
         */
        public Builder resourceInformation(java.util.List < ResourceInformation> resourceInformation) {
            String resourceInformationShrink = shrink(resourceInformation, "ResourceInformation", "json");
            this.putQueryParameter("ResourceInformation", resourceInformationShrink);
            this.resourceInformation = resourceInformation;
            return this;
        }

        /**
         * ResourceInformationId.
         */
        public Builder resourceInformationId(String resourceInformationId) {
            this.putQueryParameter("ResourceInformationId", resourceInformationId);
            this.resourceInformationId = resourceInformationId;
            return this;
        }

        /**
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.putQueryParameter("SetupProjectId", setupProjectId);
            this.setupProjectId = setupProjectId;
            return this;
        }

        @Override
        public UpdateResourceInstanceRequest build() {
            return new UpdateResourceInstanceRequest(this);
        } 

    } 

    public static class ResourceInformation extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        private String value;

        private ResourceInformation(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInformation create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResourceInformation build() {
                return new ResourceInformation(this);
            } 

        } 

    }
}
