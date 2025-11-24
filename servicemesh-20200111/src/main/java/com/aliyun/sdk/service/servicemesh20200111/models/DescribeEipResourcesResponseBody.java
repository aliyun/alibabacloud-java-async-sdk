// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeEipResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipResourcesResponseBody</p>
 */
public class DescribeEipResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EipList")
    private java.util.List<EipList> eipList;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eipList
     */
    public java.util.List<EipList> getEipList() {
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
        private java.util.List<EipList> eipList; 
        private PageResult pageResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeEipResourcesResponseBody model) {
            this.eipList = model.eipList;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The EIPs.</p>
         */
        public Builder eipList(java.util.List<EipList> eipList) {
            this.eipList = eipList;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEipResourcesResponseBody build() {
            return new DescribeEipResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEipResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipResourcesResponseBody</p>
     */
    public static class EipList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(EipList model) {
                this.allocationId = model.allocationId;
                this.instanceType = model.instanceType;
                this.ipAddress = model.ipAddress;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-2zeerraiwb7ujxscd****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The type of the resource that is associated with the EIP. Valid values:</p>
             * <ul>
             * <li><code>EcsInstance</code>: an ECS instance in a VPC</li>
             * <li><code>SlbInstance</code>: a Server Load Balancer (SLB) instance in a VPC</li>
             * <li><code>Nat</code>: a NAT gateway</li>
             * <li><code>HaVip</code>: a high-availability virtual IP address (HAVIP)</li>
             * <li><code>NetworkInterface</code>: a secondary elastic network interface (ENI)</li>
             * </ul>
             * <p>Default value: <code>EcsInstance</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>SlbInstance</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The IP address of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>120.xx.xx.112</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The status of the EIP. Valid values:</p>
             * <ul>
             * <li><code>Associating</code>: The EIP is being associated with a resource.</li>
             * <li><code>Unassociating</code>: The EIP is being disassociated from a resource.</li>
             * <li><code>InUse</code>: The EIP is associated with a resource.</li>
             * <li><code>Available</code>: The EIP is available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InUse</p>
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
    /**
     * 
     * {@link DescribeEipResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipResourcesResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number of the returned page.</p>
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
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
