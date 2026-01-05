// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ListResourcesForTagOptionResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourcesForTagOptionResponseBody</p>
 */
public class ListResourcesForTagOptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceDetails")
    private java.util.List<ResourceDetails> resourceDetails;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListResourcesForTagOptionResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resourceDetails = builder.resourceDetails;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesForTagOptionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceDetails
     */
    public java.util.List<ResourceDetails> getResourceDetails() {
        return this.resourceDetails;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ResourceDetails> resourceDetails; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListResourcesForTagOptionResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resourceDetails = model.resourceDetails;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * <p>Valid values: 1 to 100 Minimum value: 1. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E465F21C-8712-5794-A754-5E4D9152****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the associated resources.</p>
         */
        public Builder resourceDetails(java.util.List<ResourceDetails> resourceDetails) {
            this.resourceDetails = resourceDetails;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourcesForTagOptionResponseBody build() {
            return new ListResourcesForTagOptionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourcesForTagOptionResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesForTagOptionResponseBody</p>
     */
    public static class ResourceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ResourceArn")
        private String resourceArn;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        private ResourceDetails(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.resourceArn = builder.resourceArn;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDetails create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return resourceArn
         */
        public String getResourceArn() {
            return this.resourceArn;
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

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String resourceArn; 
            private String resourceId; 
            private String resourceName; 

            private Builder() {
            } 

            private Builder(ResourceDetails model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.resourceArn = model.resourceArn;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
            } 

            /**
             * <p>The time when the resource was created.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-04T08:07:04.281986714Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the resource.</p>
             * <p>The value must be 1 to 128 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the resource.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:servicecatalog:cn-hangzhou:146611588617****:product/prod-bp18r7q127****</p>
             */
            public Builder resourceArn(String resourceArn) {
                this.resourceArn = resourceArn;
                return this;
            }

            /**
             * <p>The ID of the resource with which the tag option is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>port-bp15p96922****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-ECS</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            public ResourceDetails build() {
                return new ResourceDetails(this);
            } 

        } 

    }
}
