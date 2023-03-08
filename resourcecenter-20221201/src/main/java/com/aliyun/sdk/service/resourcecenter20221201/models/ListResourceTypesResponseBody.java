// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceTypes")
    private java.util.List < ResourceTypes> resourceTypes;

    private ListResourceTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypesResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceTypes> resourceTypes; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceTypes.
         */
        public Builder resourceTypes(java.util.List < ResourceTypes> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public ListResourceTypesResponseBody build() {
            return new ListResourceTypesResponseBody(this);
        } 

    } 

    public static class ResourceTypes extends TeaModel {
        @NameInMap("FilterKeys")
        private java.util.List < String > filterKeys;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ResourceTypeName")
        private String resourceTypeName;

        private ResourceTypes(Builder builder) {
            this.filterKeys = builder.filterKeys;
            this.productName = builder.productName;
            this.resourceType = builder.resourceType;
            this.resourceTypeName = builder.resourceTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypes create() {
            return builder().build();
        }

        /**
         * @return filterKeys
         */
        public java.util.List < String > getFilterKeys() {
            return this.filterKeys;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceTypeName
         */
        public String getResourceTypeName() {
            return this.resourceTypeName;
        }

        public static final class Builder {
            private java.util.List < String > filterKeys; 
            private String productName; 
            private String resourceType; 
            private String resourceTypeName; 

            /**
             * 支持的过滤条件
             */
            public Builder filterKeys(java.util.List < String > filterKeys) {
                this.filterKeys = filterKeys;
                return this;
            }

            /**
             * 产品名称 (国际化)
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * 资源类型fullCode ACS::ECS::Instance
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * 资源类型名称
             */
            public Builder resourceTypeName(String resourceTypeName) {
                this.resourceTypeName = resourceTypeName;
                return this;
            }

            public ResourceTypes build() {
                return new ResourceTypes(this);
            } 

        } 

    }
}
