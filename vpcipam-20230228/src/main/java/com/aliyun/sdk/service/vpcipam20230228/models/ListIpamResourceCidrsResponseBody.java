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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListIpamResourceCidrsResponseBody model) {
            this.count = model.count;
            this.ipamResourceCidrs = model.ipamResourceCidrs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of resources in the IPAM pool.</p>
         */
        public Builder ipamResourceCidrs(java.util.List<IpamResourceCidrs> ipamResourceCidrs) {
            this.ipamResourceCidrs = ipamResourceCidrs;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>49A9DE56-B68C-5FFC-BC06-509D086F287C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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
    public static class IpCountDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FreeIpCount")
        private String freeIpCount;

        @com.aliyun.core.annotation.NameInMap("TotalIpCount")
        private String totalIpCount;

        @com.aliyun.core.annotation.NameInMap("UsedIpCount")
        private String usedIpCount;

        private IpCountDetail(Builder builder) {
            this.freeIpCount = builder.freeIpCount;
            this.totalIpCount = builder.totalIpCount;
            this.usedIpCount = builder.usedIpCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpCountDetail create() {
            return builder().build();
        }

        /**
         * @return freeIpCount
         */
        public String getFreeIpCount() {
            return this.freeIpCount;
        }

        /**
         * @return totalIpCount
         */
        public String getTotalIpCount() {
            return this.totalIpCount;
        }

        /**
         * @return usedIpCount
         */
        public String getUsedIpCount() {
            return this.usedIpCount;
        }

        public static final class Builder {
            private String freeIpCount; 
            private String totalIpCount; 
            private String usedIpCount; 

            private Builder() {
            } 

            private Builder(IpCountDetail model) {
                this.freeIpCount = model.freeIpCount;
                this.totalIpCount = model.totalIpCount;
                this.usedIpCount = model.usedIpCount;
            } 

            /**
             * FreeIpCount.
             */
            public Builder freeIpCount(String freeIpCount) {
                this.freeIpCount = freeIpCount;
                return this;
            }

            /**
             * TotalIpCount.
             */
            public Builder totalIpCount(String totalIpCount) {
                this.totalIpCount = totalIpCount;
                return this;
            }

            /**
             * UsedIpCount.
             */
            public Builder usedIpCount(String usedIpCount) {
                this.usedIpCount = usedIpCount;
                return this;
            }

            public IpCountDetail build() {
                return new IpCountDetail(this);
            } 

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

            private Builder() {
            } 

            private Builder(OverlapDetail model) {
                this.overlapResourceCidr = model.overlapResourceCidr;
                this.overlapResourceId = model.overlapResourceId;
                this.overlapResourceRegion = model.overlapResourceRegion;
            } 

            /**
             * <p>The CIDR that overlaps with the current resource.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder overlapResourceCidr(String overlapResourceCidr) {
                this.overlapResourceCidr = overlapResourceCidr;
                return this;
            }

            /**
             * <p>Instance ID that overlaps with the current resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-aq3fjgnig5av6jb8d****</p>
             */
            public Builder overlapResourceId(String overlapResourceId) {
                this.overlapResourceId = overlapResourceId;
                return this;
            }

            /**
             * <p>The region of instance that overlaps with the current resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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

        @com.aliyun.core.annotation.NameInMap("IpCountDetail")
        private IpCountDetail ipCountDetail;

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
            this.ipCountDetail = builder.ipCountDetail;
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
         * @return ipCountDetail
         */
        public IpCountDetail getIpCountDetail() {
            return this.ipCountDetail;
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
            private IpCountDetail ipCountDetail; 
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

            private Builder() {
            } 

            private Builder(IpamResourceCidrs model) {
                this.aliUid = model.aliUid;
                this.cidr = model.cidr;
                this.complianceStatus = model.complianceStatus;
                this.ipCountDetail = model.ipCountDetail;
                this.ipUsage = model.ipUsage;
                this.ipamAllocationId = model.ipamAllocationId;
                this.ipamId = model.ipamId;
                this.ipamPoolId = model.ipamPoolId;
                this.ipamScopeId = model.ipamScopeId;
                this.managementStatus = model.managementStatus;
                this.overlapDetail = model.overlapDetail;
                this.overlapStatus = model.overlapStatus;
                this.resourceId = model.resourceId;
                this.resourceOwnerId = model.resourceOwnerId;
                this.resourceRegionId = model.resourceRegionId;
                this.resourceType = model.resourceType;
                this.sourceCidr = model.sourceCidr;
                this.status = model.status;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>132193271328****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The CIDR block of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/32</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The compliance status of the resource.</p>
             * <ul>
             * <li><strong>Compliant</strong></li>
             * <li><strong>Noncompliant</strong></li>
             * <li><strong>Ignored</strong> Ignored resources are not monitored.</li>
             * <li><strong>Unmanaged</strong>: The resource does not have a CIDR block allocated from the IPAM pool. IPAM does not monitor whether the CIDR block of the resource meets the allocation rules of the IP address pool.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Compliant</p>
             */
            public Builder complianceStatus(String complianceStatus) {
                this.complianceStatus = complianceStatus;
                return this;
            }

            /**
             * IpCountDetail.
             */
            public Builder ipCountDetail(IpCountDetail ipCountDetail) {
                this.ipCountDetail = ipCountDetail;
                return this;
            }

            /**
             * <p>The IP usage that is displayed in decimal form.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ipUsage(String ipUsage) {
                this.ipUsage = ipUsage;
                return this;
            }

            /**
             * <p>The ID of the instance to which CIDR blocks are allocated from the IPAM pool.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-pool-alloc-112za33e4****</p>
             */
            public Builder ipamAllocationId(String ipamAllocationId) {
                this.ipamAllocationId = ipamAllocationId;
                return this;
            }

            /**
             * <p>The ID of the IPAM.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-uq5dcfc2eqhpf4****</p>
             */
            public Builder ipamId(String ipamId) {
                this.ipamId = ipamId;
                return this;
            }

            /**
             * <p>The ID of the IPAM pool.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-pool-6rcq3tobayc20t***</p>
             */
            public Builder ipamPoolId(String ipamPoolId) {
                this.ipamPoolId = ipamPoolId;
                return this;
            }

            /**
             * <p>The ID of the IPAM scope.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-scope-glfmcyldpm8lsy****</p>
             */
            public Builder ipamScopeId(String ipamScopeId) {
                this.ipamScopeId = ipamScopeId;
                return this;
            }

            /**
             * <p>The management status of the resource.</p>
             * <ul>
             * <li><strong>Managed</strong>: The resource has a CIDR block allocated from an IPAM pool. IPAM is monitoring whether the allocated CIDR block overlaps with other CIDR blocks and whether the allocated CIDR block meets the allocation rules.</li>
             * <li><strong>Unmanaged</strong>: The resource does not have a CIDR block allocated from the IPAM pool. IPAM is monitoring whether the resource has CIDR blocks that meet the allocation rules. Monitor whether CIDR blocks overlap with each other.</li>
             * <li><strong>Ignored</strong>: The resource is not monitored. Ignored resources are not monitored. If you ignore a resource, CIDR blocks allocated to the resource are returned to the IPAM pool and will not be automatically allocated to the resource (if automatic allocation rules are specified).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Managed</p>
             */
            public Builder managementStatus(String managementStatus) {
                this.managementStatus = managementStatus;
                return this;
            }

            /**
             * <p>List of resources that overlap with the current resource.</p>
             */
            public Builder overlapDetail(java.util.List<OverlapDetail> overlapDetail) {
                this.overlapDetail = overlapDetail;
                return this;
            }

            /**
             * <p>The overlapping status of the resource.</p>
             * <ul>
             * <li><strong>Nonoverlapping</strong></li>
             * <li><strong>Overlapping</strong></li>
             * <li><strong>Ignored</strong> Ignored resources are not monitored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Nonoverlapping</p>
             */
            public Builder overlapStatus(String overlapStatus) {
                this.overlapStatus = overlapStatus;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp16qjewdsunr41m1****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>132193271328****</p>
             */
            public Builder resourceOwnerId(Long resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * <p>The effective region ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * <p>The type of resource. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong></li>
             * <li><strong>VSwitch</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The source CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder sourceCidr(String sourceCidr) {
                this.sourceCidr = sourceCidr;
                return this;
            }

            /**
             * <p>The status of the resource in the IPAM pool. Valid values:</p>
             * <ul>
             * <li><strong>Created</strong></li>
             * <li><strong>Deleted</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1fjfnrg3av6zb9e****</p>
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
