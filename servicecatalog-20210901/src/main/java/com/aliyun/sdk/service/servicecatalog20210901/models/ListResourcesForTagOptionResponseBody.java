// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcesForTagOptionResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourcesForTagOptionResponseBody</p>
 */
public class ListResourcesForTagOptionResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceDetails")
    private java.util.List < ResourceDetails> resourceDetails;

    @NameInMap("TotalCount")
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
    public java.util.List < ResourceDetails> getResourceDetails() {
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
        private java.util.List < ResourceDetails> resourceDetails; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         * <p>
         * 
         * Valid values: 1 to 100 Minimum value: 1. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the associated resources.
         */
        public Builder resourceDetails(java.util.List < ResourceDetails> resourceDetails) {
            this.resourceDetails = resourceDetails;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourcesForTagOptionResponseBody build() {
            return new ListResourcesForTagOptionResponseBody(this);
        } 

    } 

    public static class ResourceDetails extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ResourceArn")
        private String resourceArn;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceName")
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

            /**
             * The time when the resource was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the resource.
             * <p>
             * 
             * The value must be 1 to 128 characters in length.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the resource.
             */
            public Builder resourceArn(String resourceArn) {
                this.resourceArn = resourceArn;
                return this;
            }

            /**
             * The ID of the resource with which the tag option is associated.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The name of the resource.
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
