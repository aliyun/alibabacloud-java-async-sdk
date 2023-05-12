// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopsRequest</p>
 */
public class DescribeDesktopsRequest extends Request {
    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @Query
    @NameInMap("DesktopId")
    private java.util.List < String > desktopId;

    @Query
    @NameInMap("DesktopName")
    private String desktopName;

    @Query
    @NameInMap("DesktopStatus")
    private String desktopStatus;

    @Query
    @NameInMap("DesktopStatusList")
    private java.util.List < String > desktopStatusList;

    @Query
    @NameInMap("DesktopType")
    private String desktopType;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("EndUserId")
    private java.util.List < String > endUserId;

    @Query
    @NameInMap("ExcludedEndUserId")
    private java.util.List < String > excludedEndUserId;

    @Query
    @NameInMap("ExpiredTime")
    private String expiredTime;

    @Query
    @NameInMap("FilterDesktopGroup")
    private Boolean filterDesktopGroup;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("ImageId")
    private java.util.List < String > imageId;

    @Query
    @NameInMap("ManagementFlag")
    private String managementFlag;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @Query
    @NameInMap("OfficeSiteName")
    private String officeSiteName;

    @Query
    @NameInMap("OnlyDesktopGroup")
    private Boolean onlyDesktopGroup;

    @Query
    @NameInMap("OsTypes")
    private java.util.List < String > osTypes;

    @Query
    @NameInMap("PolicyGroupId")
    private String policyGroupId;

    @Query
    @NameInMap("ProtocolType")
    private String protocolType;

    @Query
    @NameInMap("QueryFotaUpdate")
    private Boolean queryFotaUpdate;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SnapshotPolicyId")
    private String snapshotPolicyId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("UserName")
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
        this.filterDesktopGroup = builder.filterDesktopGroup;
        this.groupId = builder.groupId;
        this.imageId = builder.imageId;
        this.managementFlag = builder.managementFlag;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteName = builder.officeSiteName;
        this.onlyDesktopGroup = builder.onlyDesktopGroup;
        this.osTypes = builder.osTypes;
        this.policyGroupId = builder.policyGroupId;
        this.protocolType = builder.protocolType;
        this.queryFotaUpdate = builder.queryFotaUpdate;
        this.regionId = builder.regionId;
        this.snapshotPolicyId = builder.snapshotPolicyId;
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
    public java.util.List < String > getDesktopId() {
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
    public java.util.List < String > getDesktopStatusList() {
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
    public java.util.List < String > getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return excludedEndUserId
     */
    public java.util.List < String > getExcludedEndUserId() {
        return this.excludedEndUserId;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return filterDesktopGroup
     */
    public Boolean getFilterDesktopGroup() {
        return this.filterDesktopGroup;
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
    public java.util.List < String > getImageId() {
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
    public java.util.List < String > getOsTypes() {
        return this.osTypes;
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
     * @return snapshotPolicyId
     */
    public String getSnapshotPolicyId() {
        return this.snapshotPolicyId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
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
        private java.util.List < String > desktopId; 
        private String desktopName; 
        private String desktopStatus; 
        private java.util.List < String > desktopStatusList; 
        private String desktopType; 
        private String directoryId; 
        private java.util.List < String > endUserId; 
        private java.util.List < String > excludedEndUserId; 
        private String expiredTime; 
        private Boolean filterDesktopGroup; 
        private String groupId; 
        private java.util.List < String > imageId; 
        private String managementFlag; 
        private Integer maxResults; 
        private String nextToken; 
        private String officeSiteId; 
        private String officeSiteName; 
        private Boolean onlyDesktopGroup; 
        private java.util.List < String > osTypes; 
        private String policyGroupId; 
        private String protocolType; 
        private Boolean queryFotaUpdate; 
        private String regionId; 
        private String snapshotPolicyId; 
        private java.util.List < Tag> tag; 
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
            this.filterDesktopGroup = request.filterDesktopGroup;
            this.groupId = request.groupId;
            this.imageId = request.imageId;
            this.managementFlag = request.managementFlag;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.officeSiteName = request.officeSiteName;
            this.onlyDesktopGroup = request.onlyDesktopGroup;
            this.osTypes = request.osTypes;
            this.policyGroupId = request.policyGroupId;
            this.protocolType = request.protocolType;
            this.queryFotaUpdate = request.queryFotaUpdate;
            this.regionId = request.regionId;
            this.snapshotPolicyId = request.snapshotPolicyId;
            this.tag = request.tag;
            this.userName = request.userName;
        } 

        /**
         * The billing method of the cloud desktop.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The ID of the desktop group. If you specify the `DesktopId` parameter, ignore the `DesktopGroupId` parameter. If you do not specify the `DesktopId` parameter, specify the `DesktopGroupId` parameter in the call to request all IDs of the cloud desktops in the specified desktop group.``
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The IDs of the cloud desktops. You can specify 1 to 100 IDs of cloud desktops.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The name of the cloud desktop.
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * The state of the cloud desktop.
         */
        public Builder desktopStatus(String desktopStatus) {
            this.putQueryParameter("DesktopStatus", desktopStatus);
            this.desktopStatus = desktopStatus;
            return this;
        }

        /**
         * DesktopStatusList.
         */
        public Builder desktopStatusList(java.util.List < String > desktopStatusList) {
            this.putQueryParameter("DesktopStatusList", desktopStatusList);
            this.desktopStatusList = desktopStatusList;
            return this;
        }

        /**
         * The new desktop type. You can call the [DescribeDesktopTypes](~~188882~~) operation to query the IDs of supported desktop types.
         */
        public Builder desktopType(String desktopType) {
            this.putQueryParameter("DesktopType", desktopType);
            this.desktopType = desktopType;
            return this;
        }

        /**
         * The ID of the directory. The ID is the same as the workspace ID.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The IDs of the users that are assigned the cloud desktop. You can specify IDs of 1 to 100 users.
         * <p>
         * 
         * > Only one user can use the cloud desktop at a time.
         */
        public Builder endUserId(java.util.List < String > endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The IDs of the users that are excluded from the users that are assigned the cloud desktop. You can specify IDs of 1 to 100 users.
         */
        public Builder excludedEndUserId(java.util.List < String > excludedEndUserId) {
            this.putQueryParameter("ExcludedEndUserId", excludedEndUserId);
            this.excludedEndUserId = excludedEndUserId;
            return this;
        }

        /**
         * The time when the subscription cloud desktop expires.
         */
        public Builder expiredTime(String expiredTime) {
            this.putQueryParameter("ExpiredTime", expiredTime);
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * Specifies whether to filter cloud desktops in the desktop group.
         */
        public Builder filterDesktopGroup(Boolean filterDesktopGroup) {
            this.putQueryParameter("FilterDesktopGroup", filterDesktopGroup);
            this.filterDesktopGroup = filterDesktopGroup;
            return this;
        }

        /**
         * The ID of the desktop group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * 镜像ID列表。
         */
        public Builder imageId(java.util.List < String > imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The flag that is used for management.
         */
        public Builder managementFlag(String managementFlag) {
            this.putQueryParameter("ManagementFlag", managementFlag);
            this.managementFlag = managementFlag;
            return this;
        }

        /**
         * The maximum number of entries to return on each page.
         * <p>
         * 
         * *   Maximum value: 100
         * *   Default value: 10
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the next query. If this parameter is left empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The name of the workspace.
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * Specifies whether to query cloud desktops in the desktop group.
         */
        public Builder onlyDesktopGroup(Boolean onlyDesktopGroup) {
            this.putQueryParameter("OnlyDesktopGroup", onlyDesktopGroup);
            this.onlyDesktopGroup = onlyDesktopGroup;
            return this;
        }

        /**
         * The types of the OSs.
         */
        public Builder osTypes(java.util.List < String > osTypes) {
            this.putQueryParameter("OsTypes", osTypes);
            this.osTypes = osTypes;
            return this;
        }

        /**
         * The ID of the policy.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * The type of the protocol.
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * Specifies whether to query the information about image version of the cloud desktop.
         */
        public Builder queryFotaUpdate(Boolean queryFotaUpdate) {
            this.putQueryParameter("QueryFotaUpdate", queryFotaUpdate);
            this.queryFotaUpdate = queryFotaUpdate;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the automatic snapshot policy.
         */
        public Builder snapshotPolicyId(String snapshotPolicyId) {
            this.putQueryParameter("SnapshotPolicyId", snapshotPolicyId);
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }

        /**
         * The tags that you want to add. A tag is a key-value pair that consists of a tag key and a tag value. Tags are used to identify resources. You can use tags to manage cloud desktops by group for easy searching and batch operations. For more information, see [Use tags to manage cloud desktops](~~203781~~).
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The name of the user.
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

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of the tag. If you specify the `Tag` parameter, you must also specify the `Key` parameter. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`. You cannot specify an empty string as a tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag. The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` or `acs:`.
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
