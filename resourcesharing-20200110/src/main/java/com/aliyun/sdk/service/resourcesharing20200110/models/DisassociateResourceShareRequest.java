// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisassociateResourceShareRequest} extends {@link RequestModel}
 *
 * <p>DisassociateResourceShareRequest</p>
 */
public class DisassociateResourceShareRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwner")
    private String resourceOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceShareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List < Resources> resources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    private java.util.List < String > targets;

    private DisassociateResourceShareRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceOwner = builder.resourceOwner;
        this.resourceShareId = builder.resourceShareId;
        this.resources = builder.resources;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateResourceShareRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwner
     */
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * @return resourceShareId
     */
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    /**
     * @return targets
     */
    public java.util.List < String > getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<DisassociateResourceShareRequest, Builder> {
        private String regionId; 
        private String resourceOwner; 
        private String resourceShareId; 
        private java.util.List < Resources> resources; 
        private java.util.List < String > targets; 

        private Builder() {
            super();
        } 

        private Builder(DisassociateResourceShareRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceOwner = request.resourceOwner;
            this.resourceShareId = request.resourceShareId;
            this.resources = request.resources;
            this.targets = request.targets;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The owner of the resource share. Valid values:</p>
         * <ul>
         * <li>Self: The resource share belongs to the current account. This is the default value. For resource sharing within a resource directory, if you are a resource owner and you want to disassociate resources or principals from a resource share, set this parameter to Self.</li>
         * <li>OtherAccounts: The resource share belongs to another account. For resource sharing outside a resource directory, if you are a principal and you want to exit a resource share, set this parameter to OtherAccounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Self</p>
         */
        public Builder resourceOwner(String resourceOwner) {
            this.putQueryParameter("ResourceOwner", resourceOwner);
            this.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * <p>The ID of the resource share.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-6GRmdD3X****</p>
         */
        public Builder resourceShareId(String resourceShareId) {
            this.putQueryParameter("ResourceShareId", resourceShareId);
            this.resourceShareId = resourceShareId;
            return this;
        }

        /**
         * <p>The information about the resources.</p>
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * <p>The information about the principals.</p>
         * 
         * <strong>example:</strong>
         * <p>172050525300****</p>
         */
        public Builder targets(java.util.List < String > targets) {
            this.putQueryParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        @Override
        public DisassociateResourceShareRequest build() {
            return new DisassociateResourceShareRequest(this);
        } 

    } 

    /**
     * 
     * {@link DisassociateResourceShareRequest} extends {@link TeaModel}
     *
     * <p>DisassociateResourceShareRequest</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Resources(Builder builder) {
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
            private String resourceId; 
            private String resourceType; 

            /**
             * <p>The ID of the shared resource.</p>
             * <p>Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.</p>
             * <blockquote>
             * <p> Resources.N.ResourceId and Resources.N.ResourceType must be used in pairs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp183p93qs667muql****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of a shared resource.</p>
             * <p>Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.</p>
             * <p>For more information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</p>
             * <blockquote>
             * <p> Resources.N.ResourceId and Resources.N.ResourceType must be used in pairs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>VSwitch</p>
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
