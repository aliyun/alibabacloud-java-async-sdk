// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSmartAccessGatewaysRequest} extends {@link RequestModel}
 *
 * <p>DescribeSmartAccessGatewaysRequest</p>
 */
public class DescribeSmartAccessGatewaysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclIds")
    private String aclIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociatedCcnId")
    private String associatedCcnId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociatedCcnName")
    private String associatedCcnName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessState")
    private String businessState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CanAssociateQos")
    private Boolean canAssociateQos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HardwareType")
    private String hardwareType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    private String smartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGIds")
    private java.util.List<String> smartAGIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftwareVersion")
    private String softwareVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnboundAclIds")
    private String unboundAclIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionComparator")
    private String versionComparator;

    private DescribeSmartAccessGatewaysRequest(Builder builder) {
        super(builder);
        this.aclIds = builder.aclIds;
        this.associatedCcnId = builder.associatedCcnId;
        this.associatedCcnName = builder.associatedCcnName;
        this.businessState = builder.businessState;
        this.canAssociateQos = builder.canAssociateQos;
        this.hardwareType = builder.hardwareType;
        this.instanceType = builder.instanceType;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serialNumber = builder.serialNumber;
        this.smartAGId = builder.smartAGId;
        this.smartAGIds = builder.smartAGIds;
        this.softwareVersion = builder.softwareVersion;
        this.status = builder.status;
        this.unboundAclIds = builder.unboundAclIds;
        this.versionComparator = builder.versionComparator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartAccessGatewaysRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclIds
     */
    public String getAclIds() {
        return this.aclIds;
    }

    /**
     * @return associatedCcnId
     */
    public String getAssociatedCcnId() {
        return this.associatedCcnId;
    }

    /**
     * @return associatedCcnName
     */
    public String getAssociatedCcnName() {
        return this.associatedCcnName;
    }

    /**
     * @return businessState
     */
    public String getBusinessState() {
        return this.businessState;
    }

    /**
     * @return canAssociateQos
     */
    public Boolean getCanAssociateQos() {
        return this.canAssociateQos;
    }

    /**
     * @return hardwareType
     */
    public String getHardwareType() {
        return this.hardwareType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    /**
     * @return smartAGIds
     */
    public java.util.List<String> getSmartAGIds() {
        return this.smartAGIds;
    }

    /**
     * @return softwareVersion
     */
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return unboundAclIds
     */
    public String getUnboundAclIds() {
        return this.unboundAclIds;
    }

    /**
     * @return versionComparator
     */
    public String getVersionComparator() {
        return this.versionComparator;
    }

    public static final class Builder extends Request.Builder<DescribeSmartAccessGatewaysRequest, Builder> {
        private String aclIds; 
        private String associatedCcnId; 
        private String associatedCcnName; 
        private String businessState; 
        private Boolean canAssociateQos; 
        private String hardwareType; 
        private String instanceType; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String serialNumber; 
        private String smartAGId; 
        private java.util.List<String> smartAGIds; 
        private String softwareVersion; 
        private String status; 
        private String unboundAclIds; 
        private String versionComparator; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSmartAccessGatewaysRequest request) {
            super(request);
            this.aclIds = request.aclIds;
            this.associatedCcnId = request.associatedCcnId;
            this.associatedCcnName = request.associatedCcnName;
            this.businessState = request.businessState;
            this.canAssociateQos = request.canAssociateQos;
            this.hardwareType = request.hardwareType;
            this.instanceType = request.instanceType;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serialNumber = request.serialNumber;
            this.smartAGId = request.smartAGId;
            this.smartAGIds = request.smartAGIds;
            this.softwareVersion = request.softwareVersion;
            this.status = request.status;
            this.unboundAclIds = request.unboundAclIds;
            this.versionComparator = request.versionComparator;
        } 

        /**
         * <p>The ID of the ACL with which the SAG instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-xhwhyuo43l0n****</p>
         */
        public Builder aclIds(String aclIds) {
            this.putQueryParameter("AclIds", aclIds);
            this.aclIds = aclIds;
            return this;
        }

        /**
         * <p>The ID of the CCN instance with which the SAG instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-bxuau4ezctt****</p>
         */
        public Builder associatedCcnId(String associatedCcnId) {
            this.putQueryParameter("AssociatedCcnId", associatedCcnId);
            this.associatedCcnId = associatedCcnId;
            return this;
        }

        /**
         * <p>The name of the associated CCN instance.</p>
         * <p>The name must be 2 to 100 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn</p>
         */
        public Builder associatedCcnName(String associatedCcnName) {
            this.putQueryParameter("AssociatedCcnName", associatedCcnName);
            this.associatedCcnName = associatedCcnName;
            return this;
        }

        /**
         * <p>The business status of the SAG instance. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: running as expected.</li>
         * <li><strong>Arrearage</strong>: locked due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder businessState(String businessState) {
            this.putQueryParameter("BusinessState", businessState);
            this.businessState = businessState;
            return this;
        }

        /**
         * <p>Specifies whether the SAG instance can be associated with a quality of service (QoS) policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <p>Specifies whether to query SAG instances that cannot be associated with QoS policies.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder canAssociateQos(Boolean canAssociateQos) {
            this.putQueryParameter("CanAssociateQos", canAssociateQos);
            this.canAssociateQos = canAssociateQos;
            return this;
        }

        /**
         * <p>The model of SAG device. Valid values:</p>
         * <ul>
         * <li><strong>sag-1000</strong></li>
         * <li><strong>sag-100wm</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sag-100wm</p>
         */
        public Builder hardwareType(String hardwareType) {
            this.putQueryParameter("HardwareType", hardwareType);
            this.hardwareType = hardwareType;
            return this;
        }

        /**
         * <p>The type of the SAG instance. Valid values:</p>
         * <ul>
         * <li><strong>software</strong>: an SAG app instance</li>
         * <li><strong>hardware</strong>: an SAG CPE instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hardware</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The name of the SAG instance.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
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
         * <p>The ID of the region where the SAG instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the SAG instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2iu4fnc****</p>
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
         * <p>The serial number of the SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>sag32a3****</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-6z21oj0vjjrx6s****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>The IDs of the SAG instances.</p>
         */
        public Builder smartAGIds(java.util.List<String> smartAGIds) {
            this.putQueryParameter("SmartAGIds", smartAGIds);
            this.smartAGIds = smartAGIds;
            return this;
        }

        /**
         * <p>The software version of the SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>2.3.0.0</p>
         */
        public Builder softwareVersion(String softwareVersion) {
            this.putQueryParameter("SoftwareVersion", softwareVersion);
            this.softwareVersion = softwareVersion;
            return this;
        }

        /**
         * <p>The status of the SAG instance. Valid values:</p>
         * <ul>
         * <li><strong>Ordered</strong>: Your order has been placed.</li>
         * <li><strong>Delivered</strong>: Your order has been shipped.</li>
         * <li><strong>Received</strong>: You have received the SAG device.</li>
         * <li><strong>Returning</strong>: The order is being returned.</li>
         * <li><strong>Active</strong>: The SAG device is active.</li>
         * <li><strong>init</strong>: The SAG device is being initialized.</li>
         * <li><strong>Offline</strong>: The SAG device is disconnected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the ACL rule.</p>
         * <p>Specifies that the SAG instance which is not associated with the ACL is queried. Separate ACL IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>acl-sjfbgngj****</p>
         */
        public Builder unboundAclIds(String unboundAclIds) {
            this.putQueryParameter("UnboundAclIds", unboundAclIds);
            this.unboundAclIds = unboundAclIds;
            return this;
        }

        /**
         * <p>The version filter. Valid values:</p>
         * <ul>
         * <li><strong>greater</strong>: later than the current version</li>
         * <li><strong>less</strong>: earlier than the current version</li>
         * <li><strong>equals</strong>: equal to the current version</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>equals</p>
         */
        public Builder versionComparator(String versionComparator) {
            this.putQueryParameter("VersionComparator", versionComparator);
            this.versionComparator = versionComparator;
            return this;
        }

        @Override
        public DescribeSmartAccessGatewaysRequest build() {
            return new DescribeSmartAccessGatewaysRequest(this);
        } 

    } 

}
