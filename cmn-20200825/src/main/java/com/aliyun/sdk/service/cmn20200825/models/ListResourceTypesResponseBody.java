// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

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

    @NameInMap("ResourceType")
    private java.util.List < ResourceType> resourceType;

    private ListResourceTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
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
     * @return resourceType
     */
    public java.util.List < ResourceType> getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceType> resourceType; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(java.util.List < ResourceType> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public ListResourceTypesResponseBody build() {
            return new ListResourceTypesResponseBody(this);
        } 

    } 

    public static class ResourceType extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ResourceTypeName")
        private String resourceTypeName;

        private ResourceType(Builder builder) {
            this.key = builder.key;
            this.resourceType = builder.resourceType;
            this.resourceTypeName = builder.resourceTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceType create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
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
            private String key; 
            private String resourceType; 
            private String resourceTypeName; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ResourceTypeName.
             */
            public Builder resourceTypeName(String resourceTypeName) {
                this.resourceTypeName = resourceTypeName;
                return this;
            }

            public ResourceType build() {
                return new ResourceType(this);
            } 

        } 

    }
}
