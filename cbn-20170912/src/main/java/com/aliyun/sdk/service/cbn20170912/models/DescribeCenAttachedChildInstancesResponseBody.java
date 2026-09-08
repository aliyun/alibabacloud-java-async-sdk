// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCenAttachedChildInstancesResponseBody model) {
            this.childInstances = model.childInstances;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ChildInstances.
         */
        public Builder childInstances(ChildInstances childInstances) {
            this.childInstances = childInstances;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B2063B16-852B-5B66-B73D-4ED4D1A5E5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCenAttachedChildInstancesResponseBody build() {
            return new DescribeCenAttachedChildInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCenAttachedChildInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenAttachedChildInstancesResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("ManagedService")
        private String managedService;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ChildInstance(Builder builder) {
            this.cenId = builder.cenId;
            this.childInstanceAttachTime = builder.childInstanceAttachTime;
            this.childInstanceId = builder.childInstanceId;
            this.childInstanceOwnerId = builder.childInstanceOwnerId;
            this.childInstanceRegionId = builder.childInstanceRegionId;
            this.childInstanceType = builder.childInstanceType;
            this.managedService = builder.managedService;
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
         * @return managedService
         */
        public String getManagedService() {
            return this.managedService;
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
            private String managedService; 
            private String status; 

            private Builder() {
            } 

            private Builder(ChildInstance model) {
                this.cenId = model.cenId;
                this.childInstanceAttachTime = model.childInstanceAttachTime;
                this.childInstanceId = model.childInstanceId;
                this.childInstanceOwnerId = model.childInstanceOwnerId;
                this.childInstanceRegionId = model.childInstanceRegionId;
                this.childInstanceType = model.childInstanceType;
                this.managedService = model.managedService;
                this.status = model.status;
            } 

            /**
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * ChildInstanceAttachTime.
             */
            public Builder childInstanceAttachTime(String childInstanceAttachTime) {
                this.childInstanceAttachTime = childInstanceAttachTime;
                return this;
            }

            /**
             * ChildInstanceId.
             */
            public Builder childInstanceId(String childInstanceId) {
                this.childInstanceId = childInstanceId;
                return this;
            }

            /**
             * ChildInstanceOwnerId.
             */
            public Builder childInstanceOwnerId(Long childInstanceOwnerId) {
                this.childInstanceOwnerId = childInstanceOwnerId;
                return this;
            }

            /**
             * ChildInstanceRegionId.
             */
            public Builder childInstanceRegionId(String childInstanceRegionId) {
                this.childInstanceRegionId = childInstanceRegionId;
                return this;
            }

            /**
             * ChildInstanceType.
             */
            public Builder childInstanceType(String childInstanceType) {
                this.childInstanceType = childInstanceType;
                return this;
            }

            /**
             * ManagedService.
             */
            public Builder managedService(String managedService) {
                this.managedService = managedService;
                return this;
            }

            /**
             * Status.
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
    /**
     * 
     * {@link DescribeCenAttachedChildInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenAttachedChildInstancesResponseBody</p>
     */
    public static class ChildInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildInstance")
        private java.util.List<ChildInstance> childInstance;

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
        public java.util.List<ChildInstance> getChildInstance() {
            return this.childInstance;
        }

        public static final class Builder {
            private java.util.List<ChildInstance> childInstance; 

            private Builder() {
            } 

            private Builder(ChildInstances model) {
                this.childInstance = model.childInstance;
            } 

            /**
             * ChildInstance.
             */
            public Builder childInstance(java.util.List<ChildInstance> childInstance) {
                this.childInstance = childInstance;
                return this;
            }

            public ChildInstances build() {
                return new ChildInstances(this);
            } 

        } 

    }
}
