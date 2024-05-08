// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody</p>
 */
public class DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VirtualBorderRouterForPhysicalConnectionSet")
    private VirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet;

    private DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.virtualBorderRouterForPhysicalConnectionSet = builder.virtualBorderRouterForPhysicalConnectionSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody create() {
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return virtualBorderRouterForPhysicalConnectionSet
     */
    public VirtualBorderRouterForPhysicalConnectionSet getVirtualBorderRouterForPhysicalConnectionSet() {
        return this.virtualBorderRouterForPhysicalConnectionSet;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet; 

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

        /**
         * VirtualBorderRouterForPhysicalConnectionSet.
         */
        public Builder virtualBorderRouterForPhysicalConnectionSet(VirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet) {
            this.virtualBorderRouterForPhysicalConnectionSet = virtualBorderRouterForPhysicalConnectionSet;
            return this;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody build() {
            return new DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody(this);
        } 

    } 

    public static class VirtualBorderRouterForPhysicalConnectionType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivationTime")
        private String activationTime;

        @com.aliyun.core.annotation.NameInMap("CircuitCode")
        private String circuitCode;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("RecoveryTime")
        private String recoveryTime;

        @com.aliyun.core.annotation.NameInMap("TerminationTime")
        private String terminationTime;

        @com.aliyun.core.annotation.NameInMap("VbrId")
        private String vbrId;

        @com.aliyun.core.annotation.NameInMap("VbrOwnerUid")
        private Long vbrOwnerUid;

        @com.aliyun.core.annotation.NameInMap("VlanId")
        private Integer vlanId;

        private VirtualBorderRouterForPhysicalConnectionType(Builder builder) {
            this.activationTime = builder.activationTime;
            this.circuitCode = builder.circuitCode;
            this.creationTime = builder.creationTime;
            this.recoveryTime = builder.recoveryTime;
            this.terminationTime = builder.terminationTime;
            this.vbrId = builder.vbrId;
            this.vbrOwnerUid = builder.vbrOwnerUid;
            this.vlanId = builder.vlanId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterForPhysicalConnectionType create() {
            return builder().build();
        }

        /**
         * @return activationTime
         */
        public String getActivationTime() {
            return this.activationTime;
        }

        /**
         * @return circuitCode
         */
        public String getCircuitCode() {
            return this.circuitCode;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return recoveryTime
         */
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        /**
         * @return terminationTime
         */
        public String getTerminationTime() {
            return this.terminationTime;
        }

        /**
         * @return vbrId
         */
        public String getVbrId() {
            return this.vbrId;
        }

        /**
         * @return vbrOwnerUid
         */
        public Long getVbrOwnerUid() {
            return this.vbrOwnerUid;
        }

        /**
         * @return vlanId
         */
        public Integer getVlanId() {
            return this.vlanId;
        }

        public static final class Builder {
            private String activationTime; 
            private String circuitCode; 
            private String creationTime; 
            private String recoveryTime; 
            private String terminationTime; 
            private String vbrId; 
            private Long vbrOwnerUid; 
            private Integer vlanId; 

            /**
             * ActivationTime.
             */
            public Builder activationTime(String activationTime) {
                this.activationTime = activationTime;
                return this;
            }

            /**
             * CircuitCode.
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * RecoveryTime.
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * TerminationTime.
             */
            public Builder terminationTime(String terminationTime) {
                this.terminationTime = terminationTime;
                return this;
            }

            /**
             * VbrId.
             */
            public Builder vbrId(String vbrId) {
                this.vbrId = vbrId;
                return this;
            }

            /**
             * VbrOwnerUid.
             */
            public Builder vbrOwnerUid(Long vbrOwnerUid) {
                this.vbrOwnerUid = vbrOwnerUid;
                return this;
            }

            /**
             * VlanId.
             */
            public Builder vlanId(Integer vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            public VirtualBorderRouterForPhysicalConnectionType build() {
                return new VirtualBorderRouterForPhysicalConnectionType(this);
            } 

        } 

    }
    public static class VirtualBorderRouterForPhysicalConnectionSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VirtualBorderRouterForPhysicalConnectionType")
        private java.util.List < VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType;

        private VirtualBorderRouterForPhysicalConnectionSet(Builder builder) {
            this.virtualBorderRouterForPhysicalConnectionType = builder.virtualBorderRouterForPhysicalConnectionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterForPhysicalConnectionSet create() {
            return builder().build();
        }

        /**
         * @return virtualBorderRouterForPhysicalConnectionType
         */
        public java.util.List < VirtualBorderRouterForPhysicalConnectionType> getVirtualBorderRouterForPhysicalConnectionType() {
            return this.virtualBorderRouterForPhysicalConnectionType;
        }

        public static final class Builder {
            private java.util.List < VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType; 

            /**
             * VirtualBorderRouterForPhysicalConnectionType.
             */
            public Builder virtualBorderRouterForPhysicalConnectionType(java.util.List < VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType) {
                this.virtualBorderRouterForPhysicalConnectionType = virtualBorderRouterForPhysicalConnectionType;
                return this;
            }

            public VirtualBorderRouterForPhysicalConnectionSet build() {
                return new VirtualBorderRouterForPhysicalConnectionSet(this);
            } 

        } 

    }
}
