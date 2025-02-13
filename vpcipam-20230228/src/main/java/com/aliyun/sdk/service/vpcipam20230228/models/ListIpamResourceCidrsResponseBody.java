// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link ListIpamResourceCidrsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamResourceCidrsResponseBody</p>
 */
public class ListIpamResourceCidrsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("IpamResourceCidrs")
    private java.util.List<IpamResourceCidrs> ipamResourceCidrs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIpamResourceCidrsResponseBody(Builder builder) {
        this.count = builder.count;
        this.ipamResourceCidrs = builder.ipamResourceCidrs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamResourceCidrsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return ipamResourceCidrs
     */
    public java.util.List<IpamResourceCidrs> getIpamResourceCidrs() {
        return this.ipamResourceCidrs;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long count; 
        private java.util.List<IpamResourceCidrs> ipamResourceCidrs; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * IpamResourceCidrs.
         */
        public Builder ipamResourceCidrs(java.util.List<IpamResourceCidrs> ipamResourceCidrs) {
            this.ipamResourceCidrs = ipamResourceCidrs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIpamResourceCidrsResponseBody build() {
            return new ListIpamResourceCidrsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamResourceCidrsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamResourceCidrsResponseBody</p>
     */
    public static class OverlapDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverlapResourceCidr")
        private String overlapResourceCidr;

        @com.aliyun.core.annotation.NameInMap("OverlapResourceId")
        private String overlapResourceId;

        @com.aliyun.core.annotation.NameInMap("OverlapResourceRegion")
        private String overlapResourceRegion;

        private OverlapDetail(Builder builder) {
            this.overlapResourceCidr = builder.overlapResourceCidr;
            this.overlapResourceId = builder.overlapResourceId;
            this.overlapResourceRegion = builder.overlapResourceRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverlapDetail create() {
            return builder().build();
        }

        /**
         * @return overlapResourceCidr
         */
        public String getOverlapResourceCidr() {
            return this.overlapResourceCidr;
        }

        /**
         * @return overlapResourceId
         */
        public String getOverlapResourceId() {
            return this.overlapResourceId;
        }

        /**
         * @return overlapResourceRegion
         */
        public String getOverlapResourceRegion() {
            return this.overlapResourceRegion;
        }

        public static final class Builder {
            private String overlapResourceCidr; 
            private String overlapResourceId; 
            private String overlapResourceRegion; 

            /**
             * OverlapResourceCidr.
             */
            public Builder overlapResourceCidr(String overlapResourceCidr) {
                this.overlapResourceCidr = overlapResourceCidr;
                return this;
            }

            /**
             * OverlapResourceId.
             */
            public Builder overlapResourceId(String overlapResourceId) {
                this.overlapResourceId = overlapResourceId;
                return this;
            }

            /**
             * OverlapResourceRegion.
             */
            public Builder overlapResourceRegion(String overlapResourceRegion) {
                this.overlapResourceRegion = overlapResourceRegion;
                return this;
            }

            public OverlapDetail build() {
                return new OverlapDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIpamResourceCidrsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamResourceCidrsResponseBody</p>
     */
    public static class IpamResourceCidrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("ComplianceStatus")
        private String complianceStatus;

        @com.aliyun.core.annotation.NameInMap("IpUsage")
        private String ipUsage;

        @com.aliyun.core.annotation.NameInMap("IpamAllocationId")
        private String ipamAllocationId;

        @com.aliyun.core.annotation.NameInMap("IpamId")
        private String ipamId;

        @com.aliyun.core.annotation.NameInMap("IpamPoolId")
        private String ipamPoolId;

        @com.aliyun.core.annotation.NameInMap("IpamScopeId")
        private String ipamScopeId;

        @com.aliyun.core.annotation.NameInMap("ManagementStatus")
        private String managementStatus;

        @com.aliyun.core.annotation.NameInMap("OverlapDetail")
        private java.util.List<OverlapDetail> overlapDetail;

        @com.aliyun.core.annotation.NameInMap("OverlapStatus")
        private String overlapStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
        private Long resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SourceCidr")
        private String sourceCidr;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private IpamResourceCidrs(Builder builder) {
            this.aliUid = builder.aliUid;
            this.cidr = builder.cidr;
            this.complianceStatus = builder.complianceStatus;
            this.ipUsage = builder.ipUsage;
            this.ipamAllocationId = builder.ipamAllocationId;
            this.ipamId = builder.ipamId;
            this.ipamPoolId = builder.ipamPoolId;
            this.ipamScopeId = builder.ipamScopeId;
            this.managementStatus = builder.managementStatus;
            this.overlapDetail = builder.overlapDetail;
            this.overlapStatus = builder.overlapStatus;
            this.resourceId = builder.resourceId;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.resourceRegionId = builder.resourceRegionId;
            this.resourceType = builder.resourceType;
            this.sourceCidr = builder.sourceCidr;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpamResourceCidrs create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return complianceStatus
         */
        public String getComplianceStatus() {
            return this.complianceStatus;
        }

        /**
         * @return ipUsage
         */
        public String getIpUsage() {
            return this.ipUsage;
        }

        /**
         * @return ipamAllocationId
         */
        public String getIpamAllocationId() {
            return this.ipamAllocationId;
        }

        /**
         * @return ipamId
         */
        public String getIpamId() {
            return this.ipamId;
        }

        /**
         * @return ipamPoolId
         */
        public String getIpamPoolId() {
            return this.ipamPoolId;
        }

        /**
         * @return ipamScopeId
         */
        public String getIpamScopeId() {
            return this.ipamScopeId;
        }

        /**
         * @return managementStatus
         */
        public String getManagementStatus() {
            return this.managementStatus;
        }

        /**
         * @return overlapDetail
         */
        public java.util.List<OverlapDetail> getOverlapDetail() {
            return this.overlapDetail;
        }

        /**
         * @return overlapStatus
         */
        public String getOverlapStatus() {
            return this.overlapStatus;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceOwnerId
         */
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        /**
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return sourceCidr
         */
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Long aliUid; 
            private String cidr; 
            private String complianceStatus; 
            private String ipUsage; 
            private String ipamAllocationId; 
            private String ipamId; 
            private String ipamPoolId; 
            private String ipamScopeId; 
            private String managementStatus; 
            private java.util.List<OverlapDetail> overlapDetail; 
            private String overlapStatus; 
            private String resourceId; 
            private Long resourceOwnerId; 
            private String resourceRegionId; 
            private String resourceType; 
            private String sourceCidr; 
            private String status; 
            private String vpcId; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * ComplianceStatus.
             */
            public Builder complianceStatus(String complianceStatus) {
                this.complianceStatus = complianceStatus;
                return this;
            }

            /**
             * IpUsage.
             */
            public Builder ipUsage(String ipUsage) {
                this.ipUsage = ipUsage;
                return this;
            }

            /**
             * IpamAllocationId.
             */
            public Builder ipamAllocationId(String ipamAllocationId) {
                this.ipamAllocationId = ipamAllocationId;
                return this;
            }

            /**
             * IpamId.
             */
            public Builder ipamId(String ipamId) {
                this.ipamId = ipamId;
                return this;
            }

            /**
             * IpamPoolId.
             */
            public Builder ipamPoolId(String ipamPoolId) {
                this.ipamPoolId = ipamPoolId;
                return this;
            }

            /**
             * IpamScopeId.
             */
            public Builder ipamScopeId(String ipamScopeId) {
                this.ipamScopeId = ipamScopeId;
                return this;
            }

            /**
             * ManagementStatus.
             */
            public Builder managementStatus(String managementStatus) {
                this.managementStatus = managementStatus;
                return this;
            }

            /**
             * OverlapDetail.
             */
            public Builder overlapDetail(java.util.List<OverlapDetail> overlapDetail) {
                this.overlapDetail = overlapDetail;
                return this;
            }

            /**
             * OverlapStatus.
             */
            public Builder overlapStatus(String overlapStatus) {
                this.overlapStatus = overlapStatus;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceOwnerId.
             */
            public Builder resourceOwnerId(Long resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * ResourceRegionId.
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SourceCidr.
             */
            public Builder sourceCidr(String sourceCidr) {
                this.sourceCidr = sourceCidr;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public IpamResourceCidrs build() {
                return new IpamResourceCidrs(this);
            } 

        } 

    }
}
