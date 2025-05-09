// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link BindConfigGroupRequest} extends {@link RequestModel}
 *
 * <p>BindConfigGroupRequest</p>
 */
public class BindConfigGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ResourceInfos> resourceInfos;

    private BindConfigGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.regionId = builder.regionId;
        this.resourceInfos = builder.resourceInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindConfigGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceInfos
     */
    public java.util.List<ResourceInfos> getResourceInfos() {
        return this.resourceInfos;
    }

    public static final class Builder extends Request.Builder<BindConfigGroupRequest, Builder> {
        private String groupId; 
        private String regionId; 
        private java.util.List<ResourceInfos> resourceInfos; 

        private Builder() {
            super();
        } 

        private Builder(BindConfigGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.regionId = request.regionId;
            this.resourceInfos = request.resourceInfos;
        } 

        /**
         * <p>The ID of the configuration group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-0chlk9b65lj8z****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the region. Set the value to <code>cn-shanghai</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resources to which you want to bind the configuration group.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceInfos(java.util.List<ResourceInfos> resourceInfos) {
            this.putQueryParameter("ResourceInfos", resourceInfos);
            this.resourceInfos = resourceInfos;
            return this;
        }

        @Override
        public BindConfigGroupRequest build() {
            return new BindConfigGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link BindConfigGroupRequest} extends {@link TeaModel}
     *
     * <p>BindConfigGroupRequest</p>
     */
    public static class ResourceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceInfos(Builder builder) {
            this.productType = builder.productType;
            this.resourceId = builder.resourceId;
            this.resourceRegionId = builder.resourceRegionId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInfos create() {
            return builder().build();
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String productType; 
            private String resourceId; 
            private String resourceRegionId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourceInfos model) {
                this.productType = model.productType;
                this.resourceId = model.resourceId;
                this.resourceRegionId = model.resourceRegionId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The service type of the resource.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>CLOUD_DESKTOP: the cloud computer service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_DESKTOP</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-1bo4xotjvwyon****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The region ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RESOURCE_GROUP: the resource group</li>
             * <li>CLOUD_DESKTOP: the cloud computer service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_DESKTOP</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceInfos build() {
                return new ResourceInfos(this);
            } 

        } 

    }
}
