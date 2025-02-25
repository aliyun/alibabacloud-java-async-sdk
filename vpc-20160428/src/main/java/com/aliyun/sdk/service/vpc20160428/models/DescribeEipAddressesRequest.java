// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeEipAddressesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEipAddressesRequest</p>
 */
public class DescribeEipAddressesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private String allocationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociatedInstanceId")
    private String associatedInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociatedInstanceType")
    private String associatedInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipAddress")
    private String eipAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipName")
    private String eipName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ISP")
    private String ISP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeReservationData")
    private Boolean includeReservationData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LockReason")
    private String lockReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIpAddressPoolId")
    private String publicIpAddressPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityProtectionEnabled")
    private Boolean securityProtectionEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegmentInstanceId")
    private String segmentInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private DescribeEipAddressesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.allocationId = builder.allocationId;
        this.associatedInstanceId = builder.associatedInstanceId;
        this.associatedInstanceType = builder.associatedInstanceType;
        this.chargeType = builder.chargeType;
        this.dryRun = builder.dryRun;
        this.eipAddress = builder.eipAddress;
        this.eipName = builder.eipName;
        this.ISP = builder.ISP;
        this.includeReservationData = builder.includeReservationData;
        this.lockReason = builder.lockReason;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publicIpAddressPoolId = builder.publicIpAddressPoolId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityProtectionEnabled = builder.securityProtectionEnabled;
        this.segmentInstanceId = builder.segmentInstanceId;
        this.serviceManaged = builder.serviceManaged;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipAddressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public java.util.List<Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return allocationId
     */
    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return associatedInstanceId
     */
    public String getAssociatedInstanceId() {
        return this.associatedInstanceId;
    }

    /**
     * @return associatedInstanceType
     */
    public String getAssociatedInstanceType() {
        return this.associatedInstanceType;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return eipAddress
     */
    public String getEipAddress() {
        return this.eipAddress;
    }

    /**
     * @return eipName
     */
    public String getEipName() {
        return this.eipName;
    }

    /**
     * @return ISP
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * @return includeReservationData
     */
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    /**
     * @return lockReason
     */
    public String getLockReason() {
        return this.lockReason;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return publicIpAddressPoolId
     */
    public String getPublicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityProtectionEnabled
     */
    public Boolean getSecurityProtectionEnabled() {
        return this.securityProtectionEnabled;
    }

    /**
     * @return segmentInstanceId
     */
    public String getSegmentInstanceId() {
        return this.segmentInstanceId;
    }

    /**
     * @return serviceManaged
     */
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeEipAddressesRequest, Builder> {
        private java.util.List<Filter> filter; 
        private String allocationId; 
        private String associatedInstanceId; 
        private String associatedInstanceType; 
        private String chargeType; 
        private Boolean dryRun; 
        private String eipAddress; 
        private String eipName; 
        private String ISP; 
        private Boolean includeReservationData; 
        private String lockReason; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String publicIpAddressPoolId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean securityProtectionEnabled; 
        private String segmentInstanceId; 
        private Boolean serviceManaged; 
        private String status; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEipAddressesRequest request) {
            super(request);
            this.filter = request.filter;
            this.allocationId = request.allocationId;
            this.associatedInstanceId = request.associatedInstanceId;
            this.associatedInstanceType = request.associatedInstanceType;
            this.chargeType = request.chargeType;
            this.dryRun = request.dryRun;
            this.eipAddress = request.eipAddress;
            this.eipName = request.eipName;
            this.ISP = request.ISP;
            this.includeReservationData = request.includeReservationData;
            this.lockReason = request.lockReason;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.publicIpAddressPoolId = request.publicIpAddressPoolId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityProtectionEnabled = request.securityProtectionEnabled;
            this.segmentInstanceId = request.segmentInstanceId;
            this.serviceManaged = request.serviceManaged;
            this.status = request.status;
            this.tag = request.tag;
        } 

        /**
         * Filter.
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The ID of the EIP that you want to query.</p>
         * <p>You can specify up to 50 EIP IDs. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p> If both <strong>EipAddress</strong> and <strong>AllocationId</strong> are specified, you can specify up to 50 EIP IDs for <strong>AllocationId</strong>, and specify up to 50 EIPs for <strong>EipAddress</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eip-2zeerraiwb7ujxscd****</p>
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
            return this;
        }

        /**
         * <p>The ID of the instance associated with the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zebb08phyccdvf****</p>
         */
        public Builder associatedInstanceId(String associatedInstanceId) {
            this.putQueryParameter("AssociatedInstanceId", associatedInstanceId);
            this.associatedInstanceId = associatedInstanceId;
            return this;
        }

        /**
         * <p>The type of the cloud resource with which you want to associate the EIP. Valid values:</p>
         * <ul>
         * <li><strong>EcsInstance</strong> (default): an Elastic Compute Service (ECS) instance in a virtual private cloud (VPC).</li>
         * <li><strong>SlbInstance</strong>: a CLB instance in a VPC.</li>
         * <li><strong>Nat</strong>: a NAT gateway.</li>
         * <li><strong>HaVip</strong>: an HAVIP.</li>
         * <li><strong>NetworkInterface</strong>: a secondary ENI.</li>
         * <li><strong>IpAddress</strong>: an IP address.</li>
         * </ul>
         * <blockquote>
         * <p> Each ECS instance, CLB instance, HAVIP, and IP address can be associated with only one EIP. A NAT gateway can be associated with multiple EIPs. The number of EIPs that you can associate with a secondary ENI depends on the association mode. For more information, see <a href="https://help.aliyun.com/document_detail/72125.html">Associate EIPs with and disassociate EIPs from cloud resources</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EcsInstance</p>
         */
        public Builder associatedInstanceType(String associatedInstanceType) {
            this.putQueryParameter("AssociatedInstanceType", associatedInstanceType);
            this.associatedInstanceType = associatedInstanceType;
            return this;
        }

        /**
         * <p>The billing method of the EIP. Valid values:</p>
         * <ul>
         * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The EIP that you want to query.</p>
         * <p>You can specify up to 50 EIPs. Separate multiple EIPs with commas (,).</p>
         * <blockquote>
         * <p> If both <strong>EipAddress</strong> and <strong>AllocationId</strong> are specified, you can specify up to 50 EIPs for <strong>EipAddress</strong>, and specify up to 50 EIP IDs for <strong>AllocationId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>47.75.XX.XX</p>
         */
        public Builder eipAddress(String eipAddress) {
            this.putQueryParameter("EipAddress", eipAddress);
            this.eipAddress = eipAddress;
            return this;
        }

        /**
         * <p>The name of the EIP.</p>
         * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>EIP-01</p>
         */
        public Builder eipName(String eipName) {
            this.putQueryParameter("EipName", eipName);
            this.eipName = eipName;
            return this;
        }

        /**
         * <p>The line type. Valid values:</p>
         * <ul>
         * <li><strong>BGP</strong> (default): Border Gateway Protocol (BGP) (Multi-ISP) lines. All regions support BGP (Multi-ISP) EIPs.</li>
         * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines. Only the following regions support BGP (Multi-ISP) Pro lines: China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok).</li>
         * </ul>
         * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see the <a href="https://help.aliyun.com/document_detail/32321.html">Line types</a> section of the &quot;What is EIP?&quot; topic.</p>
         * <p>If you are allowed to use single-ISP bandwidth, you can also use one of the following values:</p>
         * <ul>
         * <li><strong>ChinaTelecom</strong></li>
         * <li><strong>ChinaUnicom</strong></li>
         * <li><strong>ChinaMobile</strong></li>
         * <li><strong>ChinaTelecom_L2</strong></li>
         * <li><strong>ChinaUnicom_L2</strong></li>
         * <li><strong>ChinaMobile_L2</strong></li>
         * </ul>
         * <p>If your services are deployed in China East 1 Finance, this parameter is required and you must set the value to <strong>BGP_FinanceCloud</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        public Builder ISP(String ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
            return this;
        }

        /**
         * <p>Specifies whether to return information about pending orders. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeReservationData(Boolean includeReservationData) {
            this.putQueryParameter("IncludeReservationData", includeReservationData);
            this.includeReservationData = includeReservationData;
            return this;
        }

        /**
         * <p>The reason why the EIP is locked. Valid values:</p>
         * <ul>
         * <li><strong>financial</strong>: The EIP is locked due to overdue payments.</li>
         * <li><strong>security</strong>: The EIP is locked for security reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>financial</p>
         */
        public Builder lockReason(String lockReason) {
            this.putQueryParameter("LockReason", lockReason);
            this.lockReason = lockReason;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to <strong>100</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The IP address pool to which the EIP that you want to query belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pippool-2vc0kxcedhquybdsz****</p>
         */
        public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
            this.putQueryParameter("PublicIpAddressPoolId", publicIpAddressPoolId);
            this.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }

        /**
         * <p>The region ID of the EIP.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the EIP belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4pcdvf****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>Specifies whether to activate Anti-DDoS Pro/Premium. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder securityProtectionEnabled(Boolean securityProtectionEnabled) {
            this.putQueryParameter("SecurityProtectionEnabled", securityProtectionEnabled);
            this.securityProtectionEnabled = securityProtectionEnabled;
            return this;
        }

        /**
         * <p>The ID of the contiguous EIP group.</p>
         * 
         * <strong>example:</strong>
         * <p>eipsg-t4nr90yik5oy38xdy****</p>
         */
        public Builder segmentInstanceId(String segmentInstanceId) {
            this.putQueryParameter("SegmentInstanceId", segmentInstanceId);
            this.segmentInstanceId = segmentInstanceId;
            return this;
        }

        /**
         * ServiceManaged.
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.putQueryParameter("ServiceManaged", serviceManaged);
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * <p>The state of the EIP. Valid values:</p>
         * <ul>
         * <li><strong>Associating</strong></li>
         * <li><strong>Unassociating</strong></li>
         * <li><strong>InUse</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Releasing</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags used to filter EIPs.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeEipAddressesRequest build() {
            return new DescribeEipAddressesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEipAddressesRequest} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The filter key used to query resources. Set the value to <strong>CreationStartTime</strong>, which specifies the time when the system started to create the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>CreationStartTime</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The filter value used to query resources. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time must be in Coordinated Universal Time (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-01T01:00Z</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEipAddressesRequest} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
