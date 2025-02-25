// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourcesResponseBody</p>
 */
public class ListResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List < Resources> resources;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListResourcesResponseBody(Builder builder) {
        this.resources = builder.resources;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Resources> resources; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourcesResponseBody build() {
            return new ListResourcesResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dependsOnResourceIds")
        private java.util.List < String > dependsOnResourceIds;

        @com.aliyun.core.annotation.NameInMap("productCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("properties")
        private java.util.Map < String, ? > properties;

        @com.aliyun.core.annotation.NameInMap("propertyVariables")
        private java.util.Map < String, ? > propertyVariables;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("resourceArn")
        private String resourceArn;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("terraformArn")
        private String terraformArn;

        @com.aliyun.core.annotation.NameInMap("terraformCode")
        private String terraformCode;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private Resources(Builder builder) {
            this.accountId = builder.accountId;
            this.createTime = builder.createTime;
            this.dependsOnResourceIds = builder.dependsOnResourceIds;
            this.productCode = builder.productCode;
            this.properties = builder.properties;
            this.propertyVariables = builder.propertyVariables;
            this.regionId = builder.regionId;
            this.resourceArn = builder.resourceArn;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.terraformArn = builder.terraformArn;
            this.terraformCode = builder.terraformCode;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dependsOnResourceIds
         */
        public java.util.List < String > getDependsOnResourceIds() {
            return this.dependsOnResourceIds;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return properties
         */
        public java.util.Map < String, ? > getProperties() {
            return this.properties;
        }

        /**
         * @return propertyVariables
         */
        public java.util.Map < String, ? > getPropertyVariables() {
            return this.propertyVariables;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceArn
         */
        public String getResourceArn() {
            return this.resourceArn;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return terraformArn
         */
        public String getTerraformArn() {
            return this.terraformArn;
        }

        /**
         * @return terraformCode
         */
        public String getTerraformCode() {
            return this.terraformCode;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accountId; 
            private String createTime; 
            private java.util.List < String > dependsOnResourceIds; 
            private String productCode; 
            private java.util.Map < String, ? > properties; 
            private java.util.Map < String, ? > propertyVariables; 
            private String regionId; 
            private String resourceArn; 
            private String resourceGroupId; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String terraformArn; 
            private String terraformCode; 
            private String zoneId; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * dependsOnResourceIds.
             */
            public Builder dependsOnResourceIds(java.util.List < String > dependsOnResourceIds) {
                this.dependsOnResourceIds = dependsOnResourceIds;
                return this;
            }

            /**
             * productCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
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
             * propertyVariables.
             */
            public Builder propertyVariables(java.util.Map < String, ? > propertyVariables) {
                this.propertyVariables = propertyVariables;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * resourceArn.
             */
            public Builder resourceArn(String resourceArn) {
                this.resourceArn = resourceArn;
                return this;
            }

            /**
             * resourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * resourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * resourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * terraformArn.
             */
            public Builder terraformArn(String terraformArn) {
                this.terraformArn = terraformArn;
                return this;
            }

            /**
             * terraformCode.
             */
            public Builder terraformCode(String terraformCode) {
                this.terraformCode = terraformCode;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
