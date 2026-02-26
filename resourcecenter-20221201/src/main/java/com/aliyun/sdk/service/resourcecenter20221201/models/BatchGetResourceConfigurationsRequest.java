// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link BatchGetResourceConfigurationsRequest} extends {@link RequestModel}
 *
 * <p>BatchGetResourceConfigurationsRequest</p>
 */
public class BatchGetResourceConfigurationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    private BatchGetResourceConfigurationsRequest(Builder builder) {
        super(builder);
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetResourceConfigurationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<BatchGetResourceConfigurationsRequest, Builder> {
        private java.util.List<Resources> resources; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetResourceConfigurationsRequest request) {
            super(request);
            this.resources = request.resources;
        } 

        /**
         * Resources.
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public BatchGetResourceConfigurationsRequest build() {
            return new BatchGetResourceConfigurationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetResourceConfigurationsRequest} extends {@link TeaModel}
     *
     * <p>BatchGetResourceConfigurationsRequest</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Resources(Builder builder) {
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String regionId; 
            private String resourceId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
