// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resourceType.
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
    public static class Operations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("apiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("operationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("serviceCode")
        private String serviceCode;

        private Operations(Builder builder) {
            this.apiName = builder.apiName;
            this.apiVersion = builder.apiVersion;
            this.operationType = builder.operationType;
            this.serviceCode = builder.serviceCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operations create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        public static final class Builder {
            private String apiName; 
            private String apiVersion; 
            private String operationType; 
            private String serviceCode; 

            private Builder() {
            } 

            private Builder(Operations model) {
                this.apiName = model.apiName;
                this.apiVersion = model.apiVersion;
                this.operationType = model.operationType;
                this.serviceCode = model.serviceCode;
            } 

            /**
             * apiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * apiVersion.
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * operationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>serviceCode</p>
             * 
             * <strong>example:</strong>
             * <p>Vpc</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            public Operations build() {
                return new Operations(this);
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
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("operations")
        private java.util.List<Operations> operations;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("productName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("productNameEn")
        private String productNameEn;

        @com.aliyun.core.annotation.NameInMap("properties")
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("resourceDetailPageUrl")
        private String resourceDetailPageUrl;

        @com.aliyun.core.annotation.NameInMap("resourceListPageUrl")
        private String resourceListPageUrl;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusStartVersion")
        private String statusStartVersion;

        @com.aliyun.core.annotation.NameInMap("subcategory")
        private String subcategory;

        @com.aliyun.core.annotation.NameInMap("supportExported")
        private Boolean supportExported;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        @com.aliyun.core.annotation.NameInMap("terraformResourceType")
        private String terraformResourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private ResourceType(Builder builder) {
            this.description = builder.description;
            this.operations = builder.operations;
            this.product = builder.product;
            this.productName = builder.productName;
            this.productNameEn = builder.productNameEn;
            this.properties = builder.properties;
            this.resourceDetailPageUrl = builder.resourceDetailPageUrl;
            this.resourceListPageUrl = builder.resourceListPageUrl;
            this.status = builder.status;
            this.statusStartVersion = builder.statusStartVersion;
            this.subcategory = builder.subcategory;
            this.supportExported = builder.supportExported;
            this.terraformProviderVersion = builder.terraformProviderVersion;
            this.terraformResourceType = builder.terraformResourceType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceType create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return operations
         */
        public java.util.List<Operations> getOperations() {
            return this.operations;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productNameEn
         */
        public String getProductNameEn() {
            return this.productNameEn;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        /**
         * @return resourceDetailPageUrl
         */
        public String getResourceDetailPageUrl() {
            return this.resourceDetailPageUrl;
        }

        /**
         * @return resourceListPageUrl
         */
        public String getResourceListPageUrl() {
            return this.resourceListPageUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusStartVersion
         */
        public String getStatusStartVersion() {
            return this.statusStartVersion;
        }

        /**
         * @return subcategory
         */
        public String getSubcategory() {
            return this.subcategory;
        }

        /**
         * @return supportExported
         */
        public Boolean getSupportExported() {
            return this.supportExported;
        }

        /**
         * @return terraformProviderVersion
         */
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        /**
         * @return terraformResourceType
         */
        public String getTerraformResourceType() {
            return this.terraformResourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<Operations> operations; 
            private String product; 
            private String productName; 
            private String productNameEn; 
            private java.util.Map<String, ?> properties; 
            private String resourceDetailPageUrl; 
            private String resourceListPageUrl; 
            private String status; 
            private String statusStartVersion; 
            private String subcategory; 
            private Boolean supportExported; 
            private String terraformProviderVersion; 
            private String terraformResourceType; 
            private String title; 

            private Builder() {
            } 

            private Builder(ResourceType model) {
                this.description = model.description;
                this.operations = model.operations;
                this.product = model.product;
                this.productName = model.productName;
                this.productNameEn = model.productNameEn;
                this.properties = model.properties;
                this.resourceDetailPageUrl = model.resourceDetailPageUrl;
                this.resourceListPageUrl = model.resourceListPageUrl;
                this.status = model.status;
                this.statusStartVersion = model.statusStartVersion;
                this.subcategory = model.subcategory;
                this.supportExported = model.supportExported;
                this.terraformProviderVersion = model.terraformProviderVersion;
                this.terraformResourceType = model.terraformResourceType;
                this.title = model.title;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * operations.
             */
            public Builder operations(java.util.List<Operations> operations) {
                this.operations = operations;
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
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * productNameEn.
             */
            public Builder productNameEn(String productNameEn) {
                this.productNameEn = productNameEn;
                return this;
            }

            /**
             * properties.
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * resourceDetailPageUrl.
             */
            public Builder resourceDetailPageUrl(String resourceDetailPageUrl) {
                this.resourceDetailPageUrl = resourceDetailPageUrl;
                return this;
            }

            /**
             * resourceListPageUrl.
             */
            public Builder resourceListPageUrl(String resourceListPageUrl) {
                this.resourceListPageUrl = resourceListPageUrl;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * statusStartVersion.
             */
            public Builder statusStartVersion(String statusStartVersion) {
                this.statusStartVersion = statusStartVersion;
                return this;
            }

            /**
             * subcategory.
             */
            public Builder subcategory(String subcategory) {
                this.subcategory = subcategory;
                return this;
            }

            /**
             * supportExported.
             */
            public Builder supportExported(Boolean supportExported) {
                this.supportExported = supportExported;
                return this;
            }

            /**
             * terraformProviderVersion.
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            /**
             * terraformResourceType.
             */
            public Builder terraformResourceType(String terraformResourceType) {
                this.terraformResourceType = terraformResourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ResourceType build() {
                return new ResourceType(this);
            } 

        } 

    }
}
