// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeDesktopsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopsRequest</p>
 */
public class DescribeDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopName")
    private String desktopName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopStatus")
    private String desktopStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopStatusList")
    private java.util.List<String> desktopStatusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopType")
    private String desktopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private java.util.List<String> endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludedEndUserId")
    private java.util.List<String> excludedEndUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FillResourceGroup")
    private Boolean fillResourceGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterDesktopGroup")
    private Boolean filterDesktopGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuInstanceGroupId")
    private String gpuInstanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private java.util.List<String> imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagementFlag")
    private String managementFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiResource")
    private Boolean multiResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
    private String officeSiteName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyDesktopGroup")
    private Boolean onlyDesktopGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsTypes")
    private java.util.List<String> osTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosRuleId")
    private String qosRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryFotaUpdate")
    private Boolean queryFotaUpdate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotPolicyId")
    private String snapshotPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubPayType")
    private String subPayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private DescribeDesktopsRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopId = builder.desktopId;
        this.desktopName = builder.desktopName;
        this.desktopStatus = builder.desktopStatus;
        this.desktopStatusList = builder.desktopStatusList;
        this.desktopType = builder.desktopType;
        this.directoryId = builder.directoryId;
        this.endUserId = builder.endUserId;
        this.excludedEndUserId = builder.excludedEndUserId;
        this.expiredTime = builder.expiredTime;
        this.fillResourceGroup = builder.fillResourceGroup;
        this.filterDesktopGroup = builder.filterDesktopGroup;
        this.gpuInstanceGroupId = builder.gpuInstanceGroupId;
        this.groupId = builder.groupId;
        this.imageId = builder.imageId;
        this.managementFlag = builder.managementFlag;
        this.maxResults = builder.maxResults;
        this.multiResource = builder.multiResource;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteName = builder.officeSiteName;
        this.onlyDesktopGroup = builder.onlyDesktopGroup;
        this.osTypes = builder.osTypes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policyGroupId = builder.policyGroupId;
        this.protocolType = builder.protocolType;
        this.qosRuleId = builder.qosRuleId;
        this.queryFotaUpdate = builder.queryFotaUpdate;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.snapshotPolicyId = builder.snapshotPolicyId;
        this.subPayType = builder.subPayType;
        this.tag = builder.tag;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopName
     */
    public String getDesktopName() {
        return this.desktopName;
    }

    /**
     * @return desktopStatus
     */
    public String getDesktopStatus() {
        return this.desktopStatus;
    }

    /**
     * @return desktopStatusList
     */
    public java.util.List<String> getDesktopStatusList() {
        return this.desktopStatusList;
    }

    /**
     * @return desktopType
     */
    public String getDesktopType() {
        return this.desktopType;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return endUserId
     */
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return excludedEndUserId
     */
    public java.util.List<String> getExcludedEndUserId() {
        return this.excludedEndUserId;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return fillResourceGroup
     */
    public Boolean getFillResourceGroup() {
        return this.fillResourceGroup;
    }

    /**
     * @return filterDesktopGroup
     */
    public Boolean getFilterDesktopGroup() {
        return this.filterDesktopGroup;
    }

    /**
     * @return gpuInstanceGroupId
     */
    public String getGpuInstanceGroupId() {
        return this.gpuInstanceGroupId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return imageId
     */
    public java.util.List<String> getImageId() {
        return this.imageId;
    }

    /**
     * @return managementFlag
     */
    public String getManagementFlag() {
        return this.managementFlag;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return multiResource
     */
    public Boolean getMultiResource() {
        return this.multiResource;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return officeSiteName
     */
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    /**
     * @return onlyDesktopGroup
     */
    public Boolean getOnlyDesktopGroup() {
        return this.onlyDesktopGroup;
    }

    /**
     * @return osTypes
     */
    public java.util.List<String> getOsTypes() {
        return this.osTypes;
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
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return qosRuleId
     */
    public String getQosRuleId() {
        return this.qosRuleId;
    }

    /**
     * @return queryFotaUpdate
     */
    public Boolean getQueryFotaUpdate() {
        return this.queryFotaUpdate;
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
     * @return snapshotPolicyId
     */
    public String getSnapshotPolicyId() {
        return this.snapshotPolicyId;
    }

    /**
     * @return subPayType
     */
    public String getSubPayType() {
        return this.subPayType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopsRequest, Builder> {
        private String chargeType; 
        private String desktopGroupId; 
        private java.util.List<String> desktopId; 
        private String desktopName; 
        private String desktopStatus; 
        private java.util.List<String> desktopStatusList; 
        private String desktopType; 
        private String directoryId; 
        private java.util.List<String> endUserId; 
        private java.util.List<String> excludedEndUserId; 
        private String expiredTime; 
        private Boolean fillResourceGroup; 
        private Boolean filterDesktopGroup; 
        private String gpuInstanceGroupId; 
        private String groupId; 
        private java.util.List<String> imageId; 
        private String managementFlag; 
        private Integer maxResults; 
        private Boolean multiResource; 
        private String nextToken; 
        private String officeSiteId; 
        private String officeSiteName; 
        private Boolean onlyDesktopGroup; 
        private java.util.List<String> osTypes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String policyGroupId; 
        private String protocolType; 
        private String qosRuleId; 
        private Boolean queryFotaUpdate; 
        private String regionId; 
        private String resourceGroupId; 
        private String snapshotPolicyId; 
        private String subPayType; 
        private java.util.List<Tag> tag; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopsRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.desktopGroupId = request.desktopGroupId;
            this.desktopId = request.desktopId;
            this.desktopName = request.desktopName;
            this.desktopStatus = request.desktopStatus;
            this.desktopStatusList = request.desktopStatusList;
            this.desktopType = request.desktopType;
            this.directoryId = request.directoryId;
            this.endUserId = request.endUserId;
            this.excludedEndUserId = request.excludedEndUserId;
            this.expiredTime = request.expiredTime;
            this.fillResourceGroup = request.fillResourceGroup;
            this.filterDesktopGroup = request.filterDesktopGroup;
            this.gpuInstanceGroupId = request.gpuInstanceGroupId;
            this.groupId = request.groupId;
            this.imageId = request.imageId;
            this.managementFlag = request.managementFlag;
            this.maxResults = request.maxResults;
            this.multiResource = request.multiResource;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.officeSiteName = request.officeSiteName;
            this.onlyDesktopGroup = request.onlyDesktopGroup;
            this.osTypes = request.osTypes;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.policyGroupId = request.policyGroupId;
            this.protocolType = request.protocolType;
            this.qosRuleId = request.qosRuleId;
            this.queryFotaUpdate = request.queryFotaUpdate;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.snapshotPolicyId = request.snapshotPolicyId;
            this.subPayType = request.subPayType;
            this.tag = request.tag;
            this.userName = request.userName;
        } 

        /**
         * <p>The billing method of the cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Postpaid (default): pay-as-you-go</li>
         * <li>PrePaid: subscription</li>
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
         * <p>The ID of the cloud computer pool. If you specify <code>OnlyDesktopGroup</code>, ignore <code>DesktopGroupId</code>. If you leave <code>DesktopId</code> empty, all IDs of the cloud computers in the cloud computer pool are queried.````</p>
         * 
         * <strong>example:</strong>
         * <p>dg-2i8qxpv6t1a03****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>The cloud computer IDs. You can specify the IDs of 1 to 100 cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The cloud computer name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDesktopName</p>
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * <p>The cloud computer status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Stopped</li>
         * <li>Starting</li>
         * <li>Rebuilding</li>
         * <li>Running</li>
         * <li>Stopping</li>
         * <li>Expired</li>
         * <li>Deleted</li>
         * <li>Pending</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder desktopStatus(String desktopStatus) {
            this.putQueryParameter("DesktopStatus", desktopStatus);
            this.desktopStatus = desktopStatus;
            return this;
        }

        /**
         * <p>The list of cloud computer status.</p>
         */
        public Builder desktopStatusList(java.util.List<String> desktopStatusList) {
            this.putQueryParameter("DesktopStatusList", desktopStatusList);
            this.desktopStatusList = desktopStatusList;
            return this;
        }

        /**
         * <p>The cloud computer type. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the IDs of all supported types.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.general.2c8g</p>
         */
        public Builder desktopType(String desktopType) {
            this.putQueryParameter("DesktopType", desktopType);
            this.desktopType = desktopType;
            return this;
        }

        /**
         * <p>The directory ID, which is the same as the office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The authorized users of the cloud computer. You can specify the IDs of 1 to 100 users.</p>
         * <blockquote>
         * <p> During a specific period of time, only one user can connect to and use the cloud computer.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(java.util.List<String> endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The list of authorized users that you want to exclude from the cloud computer. You can specify the IDs of 1 to 100 users.</p>
         * 
         * <strong>example:</strong>
         * <p>andy</p>
         */
        public Builder excludedEndUserId(java.util.List<String> excludedEndUserId) {
            this.putQueryParameter("ExcludedEndUserId", excludedEndUserId);
            this.excludedEndUserId = excludedEndUserId;
            return this;
        }

        /**
         * <p>The time when a subscription cloud computer expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-31T15:59:59Z</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.putQueryParameter("ExpiredTime", expiredTime);
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>Specifies whether to query the information about the enterprise resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fillResourceGroup(Boolean fillResourceGroup) {
            this.putQueryParameter("FillResourceGroup", fillResourceGroup);
            this.fillResourceGroup = fillResourceGroup;
            return this;
        }

        /**
         * <p>Specifies whether to exclude pooled cloud computers.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder filterDesktopGroup(Boolean filterDesktopGroup) {
            this.putQueryParameter("FilterDesktopGroup", filterDesktopGroup);
            this.filterDesktopGroup = filterDesktopGroup;
            return this;
        }

        /**
         * <p>The ID of the elastic GPU pool.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-0bm2iz1v6m6nx****</p>
         */
        public Builder gpuInstanceGroupId(String gpuInstanceGroupId) {
            this.putQueryParameter("GpuInstanceGroupId", gpuInstanceGroupId);
            this.gpuInstanceGroupId = gpuInstanceGroupId;
            return this;
        }

        /**
         * <p>The ID of the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-boyczi8enfyc5****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The IDs of the images.</p>
         */
        public Builder imageId(java.util.List<String> imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The flag that is used to manage the cloud desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>NoFlag</p>
         */
        public Builder managementFlag(String managementFlag) {
            this.putQueryParameter("ManagementFlag", managementFlag);
            this.managementFlag = managementFlag;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <ul>
         * <li>Maximum value: 100</li>
         * <li>Default value: 10</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Specifies whether the shared group is a multi-cloud computer type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: a multi-cloud computer type.</li>
         * <li>false: a single-cloud computer type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder multiResource(Boolean multiResource) {
            this.putQueryParameter("MultiResource", multiResource);
            this.multiResource = multiResource;
            return this;
        }

        /**
         * <p>The token that determines the start point of the next query. If this parameter is left empty, all results are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The office network name.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * <p>Specifies whether to query pooled cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder onlyDesktopGroup(Boolean onlyDesktopGroup) {
            this.putQueryParameter("OnlyDesktopGroup", onlyDesktopGroup);
            this.onlyDesktopGroup = onlyDesktopGroup;
            return this;
        }

        /**
         * <p>The operating systems (OSs).</p>
         */
        public Builder osTypes(java.util.List<String> osTypes) {
            this.putQueryParameter("OsTypes", osTypes);
            this.osTypes = osTypes;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries returned per page.</p>
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
         * <p>The ID of the cloud computer policy.</p>
         * 
         * <strong>example:</strong>
         * <p>system-all-enabled-policy</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>The protocol.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>HDX: High-definition Experience (HDX) protocol</li>
         * <li>ASP: in-house Adaptive Streaming Protocol (ASP) (recommended)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The ID of the network throttling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-5605u0gelk200****</p>
         */
        public Builder qosRuleId(String qosRuleId) {
            this.putQueryParameter("QosRuleId", qosRuleId);
            this.qosRuleId = qosRuleId;
            return this;
        }

        /**
         * <p>Specifies whether to query the image update information about the cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder queryFotaUpdate(Boolean queryFotaUpdate) {
            this.putQueryParameter("QueryFotaUpdate", queryFotaUpdate);
            this.queryFotaUpdate = queryFotaUpdate;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service (EDS).</p>
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
         * <p>The ID of the enterprise resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-4hsvzbbmqdzu3s****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-hb12mclyne09xw***</p>
         */
        public Builder snapshotPolicyId(String snapshotPolicyId) {
            this.putQueryParameter("SnapshotPolicyId", snapshotPolicyId);
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }

        /**
         * <p>The billing method of the cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>duration: hourly plan (available for users in the whitelist)</li>
         * <li>postPaid: pay-as-you-go</li>
         * <li>monthPackage: monthly subscription (120-hour or 250-hour computing plan)</li>
         * <li>prePaid: monthly subscription (unlimited-hour computing plan)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>monthPackage</p>
         */
        public Builder subPayType(String subPayType) {
            this.putQueryParameter("SubPayType", subPayType);
            this.subPayType = subPayType;
            return this;
        }

        /**
         * <p>The tags that you want to add to the cloud computer. A tag is a key-value pair that consists of a tag key and a tag value. Tags are used to identify resources. You can use tags to manage cloud computers by group. This facilitates search and batch operations. For more information, see <a href="https://help.aliyun.com/document_detail/203781.html">Use tags to manage cloud computers</a>.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The name of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DescribeDesktopsRequest build() {
            return new DescribeDesktopsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDesktopsRequest} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. If you specify the <code>Tag</code> parameter, you must also specify the <code>Key</code> parameter. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code> and contain only spaces.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
