// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceTypeResponseBody</p>
 */
public class GetResourceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private ResourceType resourceType;

    private GetResourceTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public ResourceType getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceType resourceType; 

        private Builder() {
        } 

        private Builder(GetResourceTypeResponseBody model) {
            this.requestId = model.requestId;
            this.resourceType = model.resourceType;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         */
        public Builder resourceType(ResourceType resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public GetResourceTypeResponseBody build() {
            return new GetResourceTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceTypeResponseBody</p>
     */
    public static class Create extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("permissions")
        private java.util.List<String> permissions;

        private Create(Builder builder) {
            this.permissions = builder.permissions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Create create() {
            return builder().build();
        }

        /**
         * @return permissions
         */
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private java.util.List<String> permissions; 

            private Builder() {
            } 

            private Builder(Create model) {
                this.permissions = model.permissions;
            } 

            /**
             * <p>The information about the required RAM permissions.</p>
             */
            public Builder permissions(java.util.List<String> permissions) {
                this.permissions = permissions;
                return this;
            }

            public Create build() {
                return new Create(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceTypeResponseBody</p>
     */
    public static class Delete extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("permissions")
        private java.util.List<String> permissions;

        private Delete(Builder builder) {
            this.permissions = builder.permissions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delete create() {
            return builder().build();
        }

        /**
         * @return permissions
         */
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private java.util.List<String> permissions; 

            private Builder() {
            } 

            private Builder(Delete model) {
                this.permissions = model.permissions;
            } 

            /**
             * <p>The information about the required RAM permissions.</p>
             */
            public Builder permissions(java.util.List<String> permissions) {
                this.permissions = permissions;
                return this;
            }

            public Delete build() {
                return new Delete(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceTypeResponseBody</p>
     */
    public static class Get extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("permissions")
        private java.util.List<String> permissions;

        private Get(Builder builder) {
            this.permissions = builder.permissions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Get create() {
            return builder().build();
        }

        /**
         * @return permissions
         */
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private java.util.List<String> permissions; 

            private Builder() {
            } 

            private Builder(Get model) {
                this.permissions = model.permissions;
            } 

            /**
             * <p>The information about the required RAM permissions.</p>
             */
            public Builder permissions(java.util.List<String> permissions) {
                this.permissions = permissions;
                return this;
            }

            public Get build() {
                return new Get(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceTypeResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("permissions")
        private java.util.List<String> permissions;

        private List(Builder builder) {
            this.permissions = builder.permissions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return permissions
         */
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private java.util.List<String> permissions; 

            private Builder() {
            } 

            private Builder(List model) {
                this.permissions = model.permissions;
            } 

            /**
             * <p>The information about the required RAM permissions.</p>
             */
            public Builder permissions(java.util.List<String> permissions) {
                this.permissions = permissions;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceTypeResponseBody</p>
     */
    public static class Update extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("permissions")
        private java.util.List<String> permissions;

        private Update(Builder builder) {
            this.permissions = builder.permissions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Update create() {
            return builder().build();
        }

        /**
         * @return permissions
         */
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private java.util.List<String> permissions; 

            private Builder() {
            } 

            private Builder(Update model) {
                this.permissions = model.permissions;
            } 

            /**
             * <p>The information about the required RAM permissions.</p>
             */
            public Builder permissions(java.util.List<String> permissions) {
                this.permissions = permissions;
                return this;
            }

            public Update build() {
                return new Update(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceTypeResponseBody</p>
     */
    public static class Handlers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("create")
        private Create create;

        @com.aliyun.core.annotation.NameInMap("delete")
        private Delete delete;

        @com.aliyun.core.annotation.NameInMap("get")
        private Get get;

        @com.aliyun.core.annotation.NameInMap("list")
        private List list;

        @com.aliyun.core.annotation.NameInMap("update")
        private Update update;

        private Handlers(Builder builder) {
            this.create = builder.create;
            this.delete = builder.delete;
            this.get = builder.get;
            this.list = builder.list;
            this.update = builder.update;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Handlers create() {
            return builder().build();
        }

        /**
         * @return create
         */
        public Create getCreate() {
            return this.create;
        }

        /**
         * @return delete
         */
        public Delete getDelete() {
            return this.delete;
        }

        /**
         * @return get
         */
        public Get getGet() {
            return this.get;
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return update
         */
        public Update getUpdate() {
            return this.update;
        }

        public static final class Builder {
            private Create create; 
            private Delete delete; 
            private Get get; 
            private List list; 
            private Update update; 

            private Builder() {
            } 

            private Builder(Handlers model) {
                this.create = model.create;
                this.delete = model.delete;
                this.get = model.get;
                this.list = model.list;
                this.update = model.update;
            } 

            /**
             * <p>The information about the create operation.</p>
             */
            public Builder create(Create create) {
                this.create = create;
                return this;
            }

            /**
             * <p>The information about the delete operation.</p>
             */
            public Builder delete(Delete delete) {
                this.delete = delete;
                return this;
            }

            /**
             * <p>The information about the query operation.</p>
             */
            public Builder get(Get get) {
                this.get = get;
                return this;
            }

            /**
             * <p>The information about the list operation.</p>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The information about the update operation.</p>
             */
            public Builder update(Update update) {
                this.update = update;
                return this;
            }

            public Handlers build() {
                return new Handlers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceTypeResponseBody</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("deliveryScope")
        private String deliveryScope;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Info(Builder builder) {
            this.chargeType = builder.chargeType;
            this.deliveryScope = builder.deliveryScope;
            this.description = builder.description;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return deliveryScope
         */
        public String getDeliveryScope() {
            return this.deliveryScope;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String chargeType; 
            private String deliveryScope; 
            private String description; 
            private String title; 

            private Builder() {
            } 

            private Builder(Info model) {
                this.chargeType = model.chargeType;
                this.deliveryScope = model.deliveryScope;
                this.description = model.description;
                this.title = model.title;
            } 

            /**
             * <p>The payment form. Valid values:</p>
             * <p>paid free</p>
             * 
             * <strong>example:</strong>
             * <p>paid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The delivery level. Valid values:</p>
             * <p>center</p>
             * <p>region</p>
             * <p>zone</p>
             * 
             * <strong>example:</strong>
             * <p>region</p>
             */
            public Builder deliveryScope(String deliveryScope) {
                this.deliveryScope = deliveryScope;
                return this;
            }

            /**
             * <p>The description of the resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>An ECS instance is equivalent to a virtual machine, including the most basic computing components such as CPU, memory, operating system, network, and disk. You can easily customize and change the configuration of the instance. You have full control over the virtual machine.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceTypeResponseBody</p>
     */
    public static class ResourceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createOnlyProperties")
        private java.util.List<String> createOnlyProperties;

        @com.aliyun.core.annotation.NameInMap("deleteOnlyProperties")
        private java.util.List<String> deleteOnlyProperties;

        @com.aliyun.core.annotation.NameInMap("filterProperties")
        private java.util.List<String> filterProperties;

        @com.aliyun.core.annotation.NameInMap("getOnlyProperties")
        private java.util.List<String> getOnlyProperties;

        @com.aliyun.core.annotation.NameInMap("getResponseProperties")
        private java.util.List<String> getResponseProperties;

        @com.aliyun.core.annotation.NameInMap("handlers")
        private Handlers handlers;

        @com.aliyun.core.annotation.NameInMap("info")
        private Info info;

        @com.aliyun.core.annotation.NameInMap("listOnlyProperties")
        private java.util.List<String> listOnlyProperties;

        @com.aliyun.core.annotation.NameInMap("listResponseProperties")
        private java.util.List<String> listResponseProperties;

        @com.aliyun.core.annotation.NameInMap("primaryIdentifier")
        private String primaryIdentifier;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("properties")
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("publicProperties")
        private java.util.List<String> publicProperties;

        @com.aliyun.core.annotation.NameInMap("readOnlyProperties")
        private java.util.List<String> readOnlyProperties;

        @com.aliyun.core.annotation.NameInMap("required")
        private java.util.List<String> required;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("sensitiveInfoProperties")
        private java.util.List<String> sensitiveInfoProperties;

        @com.aliyun.core.annotation.NameInMap("updateOnlyProperties")
        private java.util.List<String> updateOnlyProperties;

        @com.aliyun.core.annotation.NameInMap("updateTypeProperties")
        private java.util.List<String> updateTypeProperties;

        private ResourceType(Builder builder) {
            this.createOnlyProperties = builder.createOnlyProperties;
            this.deleteOnlyProperties = builder.deleteOnlyProperties;
            this.filterProperties = builder.filterProperties;
            this.getOnlyProperties = builder.getOnlyProperties;
            this.getResponseProperties = builder.getResponseProperties;
            this.handlers = builder.handlers;
            this.info = builder.info;
            this.listOnlyProperties = builder.listOnlyProperties;
            this.listResponseProperties = builder.listResponseProperties;
            this.primaryIdentifier = builder.primaryIdentifier;
            this.product = builder.product;
            this.properties = builder.properties;
            this.publicProperties = builder.publicProperties;
            this.readOnlyProperties = builder.readOnlyProperties;
            this.required = builder.required;
            this.resourceType = builder.resourceType;
            this.sensitiveInfoProperties = builder.sensitiveInfoProperties;
            this.updateOnlyProperties = builder.updateOnlyProperties;
            this.updateTypeProperties = builder.updateTypeProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceType create() {
            return builder().build();
        }

        /**
         * @return createOnlyProperties
         */
        public java.util.List<String> getCreateOnlyProperties() {
            return this.createOnlyProperties;
        }

        /**
         * @return deleteOnlyProperties
         */
        public java.util.List<String> getDeleteOnlyProperties() {
            return this.deleteOnlyProperties;
        }

        /**
         * @return filterProperties
         */
        public java.util.List<String> getFilterProperties() {
            return this.filterProperties;
        }

        /**
         * @return getOnlyProperties
         */
        public java.util.List<String> getGetOnlyProperties() {
            return this.getOnlyProperties;
        }

        /**
         * @return getResponseProperties
         */
        public java.util.List<String> getGetResponseProperties() {
            return this.getResponseProperties;
        }

        /**
         * @return handlers
         */
        public Handlers getHandlers() {
            return this.handlers;
        }

        /**
         * @return info
         */
        public Info getInfo() {
            return this.info;
        }

        /**
         * @return listOnlyProperties
         */
        public java.util.List<String> getListOnlyProperties() {
            return this.listOnlyProperties;
        }

        /**
         * @return listResponseProperties
         */
        public java.util.List<String> getListResponseProperties() {
            return this.listResponseProperties;
        }

        /**
         * @return primaryIdentifier
         */
        public String getPrimaryIdentifier() {
            return this.primaryIdentifier;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        /**
         * @return publicProperties
         */
        public java.util.List<String> getPublicProperties() {
            return this.publicProperties;
        }

        /**
         * @return readOnlyProperties
         */
        public java.util.List<String> getReadOnlyProperties() {
            return this.readOnlyProperties;
        }

        /**
         * @return required
         */
        public java.util.List<String> getRequired() {
            return this.required;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return sensitiveInfoProperties
         */
        public java.util.List<String> getSensitiveInfoProperties() {
            return this.sensitiveInfoProperties;
        }

        /**
         * @return updateOnlyProperties
         */
        public java.util.List<String> getUpdateOnlyProperties() {
            return this.updateOnlyProperties;
        }

        /**
         * @return updateTypeProperties
         */
        public java.util.List<String> getUpdateTypeProperties() {
            return this.updateTypeProperties;
        }

        public static final class Builder {
            private java.util.List<String> createOnlyProperties; 
            private java.util.List<String> deleteOnlyProperties; 
            private java.util.List<String> filterProperties; 
            private java.util.List<String> getOnlyProperties; 
            private java.util.List<String> getResponseProperties; 
            private Handlers handlers; 
            private Info info; 
            private java.util.List<String> listOnlyProperties; 
            private java.util.List<String> listResponseProperties; 
            private String primaryIdentifier; 
            private String product; 
            private java.util.Map<String, ?> properties; 
            private java.util.List<String> publicProperties; 
            private java.util.List<String> readOnlyProperties; 
            private java.util.List<String> required; 
            private String resourceType; 
            private java.util.List<String> sensitiveInfoProperties; 
            private java.util.List<String> updateOnlyProperties; 
            private java.util.List<String> updateTypeProperties; 

            private Builder() {
            } 

            private Builder(ResourceType model) {
                this.createOnlyProperties = model.createOnlyProperties;
                this.deleteOnlyProperties = model.deleteOnlyProperties;
                this.filterProperties = model.filterProperties;
                this.getOnlyProperties = model.getOnlyProperties;
                this.getResponseProperties = model.getResponseProperties;
                this.handlers = model.handlers;
                this.info = model.info;
                this.listOnlyProperties = model.listOnlyProperties;
                this.listResponseProperties = model.listResponseProperties;
                this.primaryIdentifier = model.primaryIdentifier;
                this.product = model.product;
                this.properties = model.properties;
                this.publicProperties = model.publicProperties;
                this.readOnlyProperties = model.readOnlyProperties;
                this.required = model.required;
                this.resourceType = model.resourceType;
                this.sensitiveInfoProperties = model.sensitiveInfoProperties;
                this.updateOnlyProperties = model.updateOnlyProperties;
                this.updateTypeProperties = model.updateTypeProperties;
            } 

            /**
             * <p>The properties that are specific to the create operation. You need to specify these properties when you create the resource. These properties are not returned when you query the resource.</p>
             */
            public Builder createOnlyProperties(java.util.List<String> createOnlyProperties) {
                this.createOnlyProperties = createOnlyProperties;
                return this;
            }

            /**
             * <p>The properties that are specific to the delete operation. You need to specify these properties when you delete the resource. These properties are not returned when you query the resource.</p>
             */
            public Builder deleteOnlyProperties(java.util.List<String> deleteOnlyProperties) {
                this.deleteOnlyProperties = deleteOnlyProperties;
                return this;
            }

            /**
             * <p>The properties that can be used to filter the resource when you list the resource.</p>
             */
            public Builder filterProperties(java.util.List<String> filterProperties) {
                this.filterProperties = filterProperties;
                return this;
            }

            /**
             * <p>The properties that are specific to the query operation. You need to specify these properties when you query the resource. These properties are not returned in the query result.</p>
             */
            public Builder getOnlyProperties(java.util.List<String> getOnlyProperties) {
                this.getOnlyProperties = getOnlyProperties;
                return this;
            }

            /**
             * <p>The properties that are returned when you query the resource.</p>
             */
            public Builder getResponseProperties(java.util.List<String> getResponseProperties) {
                this.getResponseProperties = getResponseProperties;
                return this;
            }

            /**
             * <p>The information about the operation, including the required Resource Access Management (RAM) permissions.</p>
             */
            public Builder handlers(Handlers handlers) {
                this.handlers = handlers;
                return this;
            }

            /**
             * <p>The basic information about the resource type.</p>
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The properties that are specific to the list operation. You need to specify these properties when you list the resource. These properties are not returned when you query the resource.</p>
             */
            public Builder listOnlyProperties(java.util.List<String> listOnlyProperties) {
                this.listOnlyProperties = listOnlyProperties;
                return this;
            }

            /**
             * <p>The properties that are returned when you list the resource.</p>
             */
            public Builder listResponseProperties(java.util.List<String> listResponseProperties) {
                this.listResponseProperties = listResponseProperties;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>/properties/InstanceId</p>
             */
            public Builder primaryIdentifier(String primaryIdentifier) {
                this.primaryIdentifier = primaryIdentifier;
                return this;
            }

            /**
             * <p>The code of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The resource properties. The key specifies the property name and the value specifies the details of the property.</p>
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The common properties of the resource. The common properties are not operation-specific.</p>
             */
            public Builder publicProperties(java.util.List<String> publicProperties) {
                this.publicProperties = publicProperties;
                return this;
            }

            /**
             * <p>The read-only properties. These properties are returned only when you perform the List or Get operation. You do not need to specify these properties when you create or update the resource.</p>
             */
            public Builder readOnlyProperties(java.util.List<String> readOnlyProperties) {
                this.readOnlyProperties = readOnlyProperties;
                return this;
            }

            /**
             * <p>The properties that must be specified when you create the resource.</p>
             */
            public Builder required(java.util.List<String> required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The type of the resource. If the resource belongs to a parent resource, the return format is {parent resource type code /resource type code}.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The sensitive properties, such as the password.</p>
             */
            public Builder sensitiveInfoProperties(java.util.List<String> sensitiveInfoProperties) {
                this.sensitiveInfoProperties = sensitiveInfoProperties;
                return this;
            }

            /**
             * <p>The properties that are specific to the update operation. You need to specify these properties when you update the resource. These properties are not returned when you query the resource.</p>
             */
            public Builder updateOnlyProperties(java.util.List<String> updateOnlyProperties) {
                this.updateOnlyProperties = updateOnlyProperties;
                return this;
            }

            /**
             * <p>The properties that can be modified.</p>
             */
            public Builder updateTypeProperties(java.util.List<String> updateTypeProperties) {
                this.updateTypeProperties = updateTypeProperties;
                return this;
            }

            public ResourceType build() {
                return new ResourceType(this);
            } 

        } 

    }
}
