// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenAttachedChildInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenAttachedChildInstancesResponseBody</p>
 */
public class DescribeCenAttachedChildInstancesResponseBody extends TeaModel {
    @NameInMap("ChildInstances")
    private ChildInstances childInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * ChildInstances.
         */
        public Builder childInstances(ChildInstances childInstances) {
            this.childInstances = childInstances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("ChildInstanceAttachTime")
        private String childInstanceAttachTime;

        @NameInMap("ChildInstanceId")
        private String childInstanceId;

        @NameInMap("ChildInstanceOwnerId")
        private Long childInstanceOwnerId;

        @NameInMap("ChildInstanceRegionId")
        private String childInstanceRegionId;

        @NameInMap("ChildInstanceType")
        private String childInstanceType;

        @NameInMap("Status")
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
    public static class ChildInstances extends TeaModel {
        @NameInMap("ChildInstance")
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
