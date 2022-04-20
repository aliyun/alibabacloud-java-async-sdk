// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEipResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipResourcesResponseBody</p>
 */
public class DescribeEipResourcesResponseBody extends TeaModel {
    @NameInMap("EipList")
    private java.util.List < EipList> eipList;

    @NameInMap("PageResult")
    private PageResult pageResult;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEipResourcesResponseBody(Builder builder) {
        this.eipList = builder.eipList;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return eipList
     */
    public java.util.List < EipList> getEipList() {
        return this.eipList;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EipList> eipList; 
        private PageResult pageResult; 
        private String requestId; 

        /**
         * EipList.
         */
        public Builder eipList(java.util.List < EipList> eipList) {
            this.eipList = eipList;
            return this;
        }

        /**
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEipResourcesResponseBody build() {
            return new DescribeEipResourcesResponseBody(this);
        } 

    } 

    public static class EipList extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Status")
        private String status;

        private EipList(Builder builder) {
            this.allocationId = builder.allocationId;
            this.instanceType = builder.instanceType;
            this.ipAddress = builder.ipAddress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipList create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String allocationId; 
            private String instanceType; 
            private String ipAddress; 
            private String status; 

            /**
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EipList build() {
                return new EipList(this);
            } 

        } 

    }
    public static class PageResult extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
