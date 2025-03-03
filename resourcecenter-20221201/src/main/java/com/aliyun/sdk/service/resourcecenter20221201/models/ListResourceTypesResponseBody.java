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
 * {@link ListResourceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceTypesResponseBody</p>
 */
public class ListResourceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private java.util.List<ResourceTypes> resourceTypes;

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
    public java.util.List<ResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResourceTypes> resourceTypes; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E5556E4C-479A-5BBB-B325-F07563E7E917</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the resource types.</p>
         */
        public Builder resourceTypes(java.util.List<ResourceTypes> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public ListResourceTypesResponseBody build() {
            return new ListResourceTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceTypesResponseBody</p>
     */
    public static class CodeMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private CodeMapping(Builder builder) {
            this.resourceGroup = builder.resourceGroup;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeMapping create() {
            return builder().build();
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String resourceGroup; 
            private String tag; 

            /**
             * ResourceGroup.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public CodeMapping build() {
                return new CodeMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceTypesResponseBody</p>
     */
    public static class ResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeMapping")
        private CodeMapping codeMapping;

        @com.aliyun.core.annotation.NameInMap("FilterKeys")
        private java.util.List<String> filterKeys;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("RelatedResourceTypes")
        private java.util.List<String> relatedResourceTypes;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceTypeName")
        private String resourceTypeName;

        private ResourceTypes(Builder builder) {
            this.codeMapping = builder.codeMapping;
            this.filterKeys = builder.filterKeys;
            this.productName = builder.productName;
            this.relatedResourceTypes = builder.relatedResourceTypes;
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
         * @return codeMapping
         */
        public CodeMapping getCodeMapping() {
            return this.codeMapping;
        }

        /**
         * @return filterKeys
         */
        public java.util.List<String> getFilterKeys() {
            return this.filterKeys;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return relatedResourceTypes
         */
        public java.util.List<String> getRelatedResourceTypes() {
            return this.relatedResourceTypes;
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
            private CodeMapping codeMapping; 
            private java.util.List<String> filterKeys; 
            private String productName; 
            private java.util.List<String> relatedResourceTypes; 
            private String resourceType; 
            private String resourceTypeName; 

            /**
             * CodeMapping.
             */
            public Builder codeMapping(CodeMapping codeMapping) {
                this.codeMapping = codeMapping;
                return this;
            }

            /**
             * <p>The supported filter conditions.</p>
             */
            public Builder filterKeys(java.util.List<String> filterKeys) {
                this.filterKeys = filterKeys;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>Container Service for Kubernetes</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * RelatedResourceTypes.
             */
            public Builder relatedResourceTypes(java.util.List<String> relatedResourceTypes) {
                this.relatedResourceTypes = relatedResourceTypes;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ACK::Cluster</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The name of the resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>Cluster</p>
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
