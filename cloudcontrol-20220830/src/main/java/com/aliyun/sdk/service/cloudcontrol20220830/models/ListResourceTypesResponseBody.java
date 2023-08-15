// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceTypesResponseBody</p>
 */
public class ListResourceTypesResponseBody extends TeaModel {
    @NameInMap("maxResults")
    private Integer maxResults;

    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("resourceTypes")
    private java.util.List < ResourceTypes> resourceTypes;

    @NameInMap("totalCount")
    private Integer totalCount;

    private ListResourceTypesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceTypes = builder.resourceTypes;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List < ResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ResourceTypes> resourceTypes; 
        private Integer totalCount; 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resourceTypes.
         */
        public Builder resourceTypes(java.util.List < ResourceTypes> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceTypesResponseBody build() {
            return new ListResourceTypesResponseBody(this);
        } 

    } 

    public static class Create extends TeaModel {
        @NameInMap("permissions")
        private java.util.List < String > permissions;

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
        public java.util.List < String > getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private java.util.List < String > permissions; 

            /**
             * permissions.
             */
            public Builder permissions(java.util.List < String > permissions) {
                this.permissions = permissions;
                return this;
            }

            public Create build() {
                return new Create(this);
            } 

        } 

    }
    public static class Delete extends TeaModel {
        @NameInMap("permissions")
        private java.util.List < String > permissions;

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
        public java.util.List < String > getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private java.util.List < String > permissions; 

            /**
             * permissions.
             */
            public Builder permissions(java.util.List < String > permissions) {
                this.permissions = permissions;
                return this;
            }

            public Delete build() {
                return new Delete(this);
            } 

        } 

    }
    public static class Get extends TeaModel {
        @NameInMap("permissions")
        private java.util.List < String > permissions;

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
        public java.util.List < String > getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private java.util.List < String > permissions; 

            /**
             * permissions.
             */
            public Builder permissions(java.util.List < String > permissions) {
                this.permissions = permissions;
                return this;
            }

            public Get build() {
                return new Get(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("permissions")
        private java.util.List < String > permissions;

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
        public java.util.List < String > getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private java.util.List < String > permissions; 

            /**
             * permissions.
             */
            public Builder permissions(java.util.List < String > permissions) {
                this.permissions = permissions;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Update extends TeaModel {
        @NameInMap("permissions")
        private java.util.List < String > permissions;

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
        public java.util.List < String > getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private java.util.List < String > permissions; 

            /**
             * permissions.
             */
            public Builder permissions(java.util.List < String > permissions) {
                this.permissions = permissions;
                return this;
            }

            public Update build() {
                return new Update(this);
            } 

        } 

    }
    public static class Handlers extends TeaModel {
        @NameInMap("create")
        private Create create;

        @NameInMap("delete")
        private Delete delete;

        @NameInMap("get")
        private Get get;

        @NameInMap("list")
        private List list;

        @NameInMap("update")
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

            /**
             * create.
             */
            public Builder create(Create create) {
                this.create = create;
                return this;
            }

            /**
             * delete.
             */
            public Builder delete(Delete delete) {
                this.delete = delete;
                return this;
            }

            /**
             * get.
             */
            public Builder get(Get get) {
                this.get = get;
                return this;
            }

            /**
             * list.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * update.
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
    public static class Info extends TeaModel {
        @NameInMap("chargeType")
        private String chargeType;

        @NameInMap("deliveryScope")
        private String deliveryScope;

        @NameInMap("description")
        private String description;

        @NameInMap("title")
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

            /**
             * chargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * deliveryScope.
             */
            public Builder deliveryScope(String deliveryScope) {
                this.deliveryScope = deliveryScope;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * title.
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
    public static class ResourceTypes extends TeaModel {
        @NameInMap("createOnlyProperties")
        private java.util.List < String > createOnlyProperties;

        @NameInMap("deleteOnlyProperties")
        private java.util.List < String > deleteOnlyProperties;

        @NameInMap("filterProperties")
        private java.util.List < String > filterProperties;

        @NameInMap("getOnlyProperties")
        private java.util.List < String > getOnlyProperties;

        @NameInMap("getResponseProperties")
        private java.util.List < String > getResponseProperties;

        @NameInMap("handlers")
        private Handlers handlers;

        @NameInMap("info")
        private Info info;

        @NameInMap("listOnlyProperties")
        private java.util.List < String > listOnlyProperties;

        @NameInMap("listResponseProperties")
        private java.util.List < String > listResponseProperties;

        @NameInMap("primaryIdentifier")
        private String primaryIdentifier;

        @NameInMap("product")
        private String product;

        @NameInMap("properties")
        private java.util.Map < String, ? > properties;

        @NameInMap("publicProperties")
        private java.util.List < String > publicProperties;

        @NameInMap("readOnlyProperties")
        private java.util.List < String > readOnlyProperties;

        @NameInMap("required")
        private java.util.List < String > required;

        @NameInMap("resourceType")
        private String resourceType;

        @NameInMap("sensitiveInfoProperties")
        private java.util.List < String > sensitiveInfoProperties;

        @NameInMap("updateOnlyProperties")
        private java.util.List < String > updateOnlyProperties;

        @NameInMap("updateTypeProperties")
        private java.util.List < String > updateTypeProperties;

        private ResourceTypes(Builder builder) {
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

        public static ResourceTypes create() {
            return builder().build();
        }

        /**
         * @return createOnlyProperties
         */
        public java.util.List < String > getCreateOnlyProperties() {
            return this.createOnlyProperties;
        }

        /**
         * @return deleteOnlyProperties
         */
        public java.util.List < String > getDeleteOnlyProperties() {
            return this.deleteOnlyProperties;
        }

        /**
         * @return filterProperties
         */
        public java.util.List < String > getFilterProperties() {
            return this.filterProperties;
        }

        /**
         * @return getOnlyProperties
         */
        public java.util.List < String > getGetOnlyProperties() {
            return this.getOnlyProperties;
        }

        /**
         * @return getResponseProperties
         */
        public java.util.List < String > getGetResponseProperties() {
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
        public java.util.List < String > getListOnlyProperties() {
            return this.listOnlyProperties;
        }

        /**
         * @return listResponseProperties
         */
        public java.util.List < String > getListResponseProperties() {
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
        public java.util.Map < String, ? > getProperties() {
            return this.properties;
        }

        /**
         * @return publicProperties
         */
        public java.util.List < String > getPublicProperties() {
            return this.publicProperties;
        }

        /**
         * @return readOnlyProperties
         */
        public java.util.List < String > getReadOnlyProperties() {
            return this.readOnlyProperties;
        }

        /**
         * @return required
         */
        public java.util.List < String > getRequired() {
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
        public java.util.List < String > getSensitiveInfoProperties() {
            return this.sensitiveInfoProperties;
        }

        /**
         * @return updateOnlyProperties
         */
        public java.util.List < String > getUpdateOnlyProperties() {
            return this.updateOnlyProperties;
        }

        /**
         * @return updateTypeProperties
         */
        public java.util.List < String > getUpdateTypeProperties() {
            return this.updateTypeProperties;
        }

        public static final class Builder {
            private java.util.List < String > createOnlyProperties; 
            private java.util.List < String > deleteOnlyProperties; 
            private java.util.List < String > filterProperties; 
            private java.util.List < String > getOnlyProperties; 
            private java.util.List < String > getResponseProperties; 
            private Handlers handlers; 
            private Info info; 
            private java.util.List < String > listOnlyProperties; 
            private java.util.List < String > listResponseProperties; 
            private String primaryIdentifier; 
            private String product; 
            private java.util.Map < String, ? > properties; 
            private java.util.List < String > publicProperties; 
            private java.util.List < String > readOnlyProperties; 
            private java.util.List < String > required; 
            private String resourceType; 
            private java.util.List < String > sensitiveInfoProperties; 
            private java.util.List < String > updateOnlyProperties; 
            private java.util.List < String > updateTypeProperties; 

            /**
             * createOnlyProperties.
             */
            public Builder createOnlyProperties(java.util.List < String > createOnlyProperties) {
                this.createOnlyProperties = createOnlyProperties;
                return this;
            }

            /**
             * deleteOnlyProperties.
             */
            public Builder deleteOnlyProperties(java.util.List < String > deleteOnlyProperties) {
                this.deleteOnlyProperties = deleteOnlyProperties;
                return this;
            }

            /**
             * filterProperties.
             */
            public Builder filterProperties(java.util.List < String > filterProperties) {
                this.filterProperties = filterProperties;
                return this;
            }

            /**
             * getOnlyProperties.
             */
            public Builder getOnlyProperties(java.util.List < String > getOnlyProperties) {
                this.getOnlyProperties = getOnlyProperties;
                return this;
            }

            /**
             * getResponseProperties.
             */
            public Builder getResponseProperties(java.util.List < String > getResponseProperties) {
                this.getResponseProperties = getResponseProperties;
                return this;
            }

            /**
             * handlers.
             */
            public Builder handlers(Handlers handlers) {
                this.handlers = handlers;
                return this;
            }

            /**
             * info.
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * listOnlyProperties.
             */
            public Builder listOnlyProperties(java.util.List < String > listOnlyProperties) {
                this.listOnlyProperties = listOnlyProperties;
                return this;
            }

            /**
             * listResponseProperties.
             */
            public Builder listResponseProperties(java.util.List < String > listResponseProperties) {
                this.listResponseProperties = listResponseProperties;
                return this;
            }

            /**
             * primaryIdentifier.
             */
            public Builder primaryIdentifier(String primaryIdentifier) {
                this.primaryIdentifier = primaryIdentifier;
                return this;
            }

            /**
             * product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * properties.
             */
            public Builder properties(java.util.Map < String, ? > properties) {
                this.properties = properties;
                return this;
            }

            /**
             * publicProperties.
             */
            public Builder publicProperties(java.util.List < String > publicProperties) {
                this.publicProperties = publicProperties;
                return this;
            }

            /**
             * readOnlyProperties.
             */
            public Builder readOnlyProperties(java.util.List < String > readOnlyProperties) {
                this.readOnlyProperties = readOnlyProperties;
                return this;
            }

            /**
             * required.
             */
            public Builder required(java.util.List < String > required) {
                this.required = required;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * sensitiveInfoProperties.
             */
            public Builder sensitiveInfoProperties(java.util.List < String > sensitiveInfoProperties) {
                this.sensitiveInfoProperties = sensitiveInfoProperties;
                return this;
            }

            /**
             * updateOnlyProperties.
             */
            public Builder updateOnlyProperties(java.util.List < String > updateOnlyProperties) {
                this.updateOnlyProperties = updateOnlyProperties;
                return this;
            }

            /**
             * updateTypeProperties.
             */
            public Builder updateTypeProperties(java.util.List < String > updateTypeProperties) {
                this.updateTypeProperties = updateTypeProperties;
                return this;
            }

            public ResourceTypes build() {
                return new ResourceTypes(this);
            } 

        } 

    }
}
