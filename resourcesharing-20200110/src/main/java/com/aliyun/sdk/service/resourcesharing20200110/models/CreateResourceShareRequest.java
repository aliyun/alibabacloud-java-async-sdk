// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateResourceShareRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceShareRequest</p>
 */
public class CreateResourceShareRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowExternalTargets")
    private Boolean allowExternalTargets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionNames")
    private java.util.List < String > permissionNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceShareName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List < Resources> resources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetProperties")
    private java.util.List < TargetProperties> targetProperties;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    private java.util.List < String > targets;

    private CreateResourceShareRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.allowExternalTargets = builder.allowExternalTargets;
        this.permissionNames = builder.permissionNames;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceShareName = builder.resourceShareName;
        this.resources = builder.resources;
        this.tag = builder.tag;
        this.targetProperties = builder.targetProperties;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceShareRequest create() {
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
     * @return allowExternalTargets
     */
    public Boolean getAllowExternalTargets() {
        return this.allowExternalTargets;
    }

    /**
     * @return permissionNames
     */
    public java.util.List < String > getPermissionNames() {
        return this.permissionNames;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceShareName
     */
    public String getResourceShareName() {
        return this.resourceShareName;
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return targetProperties
     */
    public java.util.List < TargetProperties> getTargetProperties() {
        return this.targetProperties;
    }

    /**
     * @return targets
     */
    public java.util.List < String > getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<CreateResourceShareRequest, Builder> {
        private String regionId; 
        private Boolean allowExternalTargets; 
        private java.util.List < String > permissionNames; 
        private String resourceGroupId; 
        private String resourceShareName; 
        private java.util.List < Resources> resources; 
        private java.util.List < Tag> tag; 
        private java.util.List < TargetProperties> targetProperties; 
        private java.util.List < String > targets; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceShareRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.allowExternalTargets = request.allowExternalTargets;
            this.permissionNames = request.permissionNames;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceShareName = request.resourceShareName;
            this.resources = request.resources;
            this.tag = request.tag;
            this.targetProperties = request.targetProperties;
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
         * <p>Specifies whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:</p>
         * <ul>
         * <li>false (default): Resources in the resource share can be shared only with accounts in the resource directory.</li>
         * <li>true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowExternalTargets(Boolean allowExternalTargets) {
            this.putQueryParameter("AllowExternalTargets", allowExternalTargets);
            this.allowExternalTargets = allowExternalTargets;
            return this;
        }

        /**
         * <p>The information about the permissions. If you do not configure this parameter, the system automatically associates the default permission for the specified resource type with the resource share. For more information, see <a href="https://help.aliyun.com/document_detail/465474.html">Permission library</a>.</p>
         */
        public Builder permissionNames(java.util.List < String > permissionNames) {
            this.putQueryParameter("PermissionNames", permissionNames);
            this.permissionNames = permissionNames;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the resource share.</p>
         * <p>The name must be 1 to 50 characters in length.</p>
         * <p>The name can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder resourceShareName(String resourceShareName) {
            this.putQueryParameter("ResourceShareName", resourceShareName);
            this.resourceShareName = resourceShareName;
            return this;
        }

        /**
         * <p>The information about the shared resources.</p>
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The properties of the principal.</p>
         * <blockquote>
         * <p> This parameter is available only when you specify an Alibaba Cloud service as a principal.</p>
         * </blockquote>
         */
        public Builder targetProperties(java.util.List < TargetProperties> targetProperties) {
            this.putQueryParameter("TargetProperties", targetProperties);
            this.targetProperties = targetProperties;
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
        public CreateResourceShareRequest build() {
            return new CreateResourceShareRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateResourceShareRequest} extends {@link TeaModel}
     *
     * <p>CreateResourceShareRequest</p>
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
             * <p>The ID of a shared resource.</p>
             * <p>Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.</p>
             * <blockquote>
             * <p> <code>Resources.N.ResourceId</code> and <code>Resources.N.ResourceType</code> must be used in pairs.</p>
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
             * <p> <code>Resources.N.ResourceId</code> and <code>Resources.N.ResourceType</code> must be used in pairs.</p>
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
    /**
     * 
     * {@link CreateResourceShareRequest} extends {@link TeaModel}
     *
     * <p>CreateResourceShareRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateResourceShareRequest} extends {@link TeaModel}
     *
     * <p>CreateResourceShareRequest</p>
     */
    public static class TargetProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Property")
        private String property;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        private TargetProperties(Builder builder) {
            this.property = builder.property;
            this.targetId = builder.targetId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetProperties create() {
            return builder().build();
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        public static final class Builder {
            private String property; 
            private String targetId; 

            /**
             * <p>The property parameter of the principal. For example, you can specify a parameter that indicates the time range for resource sharing. Valid values of <code>timeRangeType</code>:</p>
             * <ul>
             * <li>timeRange: a specific time range</li>
             * <li>day: all day</li>
             * </ul>
             * <blockquote>
             * <p> <code>TargetProperties.N.TargetId</code> and <code>TargetProperties.N.Property</code> must be used in pairs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;timeRange&quot;:{
             *         &quot;timeRangeType&quot;:&quot;timeRange&quot;,
             *         &quot;beginAtTime&quot;:&quot;00:00&quot;,
             *         &quot;timezone&quot;:&quot;UTC+8&quot;,
             *         &quot;endAtTime&quot;:&quot;19:59&quot;
             *     }
             * }</p>
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * <p>The ID of the principal.</p>
             * <blockquote>
             * <p> <code>TargetProperties.N.TargetId</code> and <code>TargetProperties.N.Property</code> must be used in pairs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172050525300****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            public TargetProperties build() {
                return new TargetProperties(this);
            } 

        } 

    }
}
