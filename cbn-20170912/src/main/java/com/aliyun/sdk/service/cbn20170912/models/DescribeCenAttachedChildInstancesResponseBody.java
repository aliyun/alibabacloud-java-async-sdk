// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenAttachedChildInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenAttachedChildInstancesResponseBody</p>
 */
public class DescribeCenAttachedChildInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChildInstances")
    private ChildInstances childInstances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCenAttachedChildInstancesResponseBody(Builder builder) {
        this.childInstances = builder.childInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenAttachedChildInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return childInstances
     */
    public ChildInstances getChildInstances() {
        return this.childInstances;
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
        private ChildInstances childInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the network instances.
         */
        public Builder childInstances(ChildInstances childInstances) {
            this.childInstances = childInstances;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCenAttachedChildInstancesResponseBody build() {
            return new DescribeCenAttachedChildInstancesResponseBody(this);
        } 

    } 

    public static class ChildInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("ChildInstanceAttachTime")
        private String childInstanceAttachTime;

        @com.aliyun.core.annotation.NameInMap("ChildInstanceId")
        private String childInstanceId;

        @com.aliyun.core.annotation.NameInMap("ChildInstanceOwnerId")
        private Long childInstanceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ChildInstanceRegionId")
        private String childInstanceRegionId;

        @com.aliyun.core.annotation.NameInMap("ChildInstanceType")
        private String childInstanceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ChildInstance(Builder builder) {
            this.cenId = builder.cenId;
            this.childInstanceAttachTime = builder.childInstanceAttachTime;
            this.childInstanceId = builder.childInstanceId;
            this.childInstanceOwnerId = builder.childInstanceOwnerId;
            this.childInstanceRegionId = builder.childInstanceRegionId;
            this.childInstanceType = builder.childInstanceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildInstance create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return childInstanceAttachTime
         */
        public String getChildInstanceAttachTime() {
            return this.childInstanceAttachTime;
        }

        /**
         * @return childInstanceId
         */
        public String getChildInstanceId() {
            return this.childInstanceId;
        }

        /**
         * @return childInstanceOwnerId
         */
        public Long getChildInstanceOwnerId() {
            return this.childInstanceOwnerId;
        }

        /**
         * @return childInstanceRegionId
         */
        public String getChildInstanceRegionId() {
            return this.childInstanceRegionId;
        }

        /**
         * @return childInstanceType
         */
        public String getChildInstanceType() {
            return this.childInstanceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cenId; 
            private String childInstanceAttachTime; 
            private String childInstanceId; 
            private Long childInstanceOwnerId; 
            private String childInstanceRegionId; 
            private String childInstanceType; 
            private String status; 

            /**
             * The ID of the CEN instance.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The time when the network instance was attached to the CEN instance.
             * <p>
             * 
             * The time follows the ISO8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.
             */
            public Builder childInstanceAttachTime(String childInstanceAttachTime) {
                this.childInstanceAttachTime = childInstanceAttachTime;
                return this;
            }

            /**
             * The ID of the network instance.
             */
            public Builder childInstanceId(String childInstanceId) {
                this.childInstanceId = childInstanceId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the network instance belongs.
             */
            public Builder childInstanceOwnerId(Long childInstanceOwnerId) {
                this.childInstanceOwnerId = childInstanceOwnerId;
                return this;
            }

            /**
             * The ID of the region where the network instance is deployed.
             */
            public Builder childInstanceRegionId(String childInstanceRegionId) {
                this.childInstanceRegionId = childInstanceRegionId;
                return this;
            }

            /**
             * The type of the network instance. Valid values:
             * <p>
             * 
             * *   **VPC**: VPC
             * *   **VBR**: VBR
             * *   **CCN**: CCN instance
             */
            public Builder childInstanceType(String childInstanceType) {
                this.childInstanceType = childInstanceType;
                return this;
            }

            /**
             * The status of the network instance. Valid values:
             * <p>
             * 
             * *   **Attaching**: The network instance is being created on the transit router.
             * *   **Attached**: The network instance has been created on the transit router.
             * *   **Detaching**: The network instance is being deleted from the transit router.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ChildInstance build() {
                return new ChildInstance(this);
            } 

        } 

    }
    public static class ChildInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildInstance")
        private java.util.List < ChildInstance> childInstance;

        private ChildInstances(Builder builder) {
            this.childInstance = builder.childInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildInstances create() {
            return builder().build();
        }

        /**
         * @return childInstance
         */
        public java.util.List < ChildInstance> getChildInstance() {
            return this.childInstance;
        }

        public static final class Builder {
            private java.util.List < ChildInstance> childInstance; 

            /**
             * ChildInstance.
             */
            public Builder childInstance(java.util.List < ChildInstance> childInstance) {
                this.childInstance = childInstance;
                return this;
            }

            public ChildInstances build() {
                return new ChildInstances(this);
            } 

        } 

    }
}
