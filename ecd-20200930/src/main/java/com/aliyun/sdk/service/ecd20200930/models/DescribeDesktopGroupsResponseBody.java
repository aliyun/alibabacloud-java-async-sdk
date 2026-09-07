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
 * {@link DescribeDesktopGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopGroupsResponseBody</p>
 */
public class DescribeDesktopGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesktopGroups")
    private java.util.List<DesktopGroups> desktopGroups;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDesktopGroupsResponseBody(Builder builder) {
        this.desktopGroups = builder.desktopGroups;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopGroups
     */
    public java.util.List<DesktopGroups> getDesktopGroups() {
        return this.desktopGroups;
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

    public static final class Builder {
        private java.util.List<DesktopGroups> desktopGroups; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDesktopGroupsResponseBody model) {
            this.desktopGroups = model.desktopGroups;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of shared cloud computers.</p>
         */
        public Builder desktopGroups(java.util.List<DesktopGroups> desktopGroups) {
            this.desktopGroups = desktopGroups;
            return this;
        }

        /**
         * <p>The token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDesktopGroupsResponseBody build() {
            return new DescribeDesktopGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDesktopGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopGroupsResponseBody</p>
     */
    public static class CountPerStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CountPerStatus(Builder builder) {
            this.count = builder.count;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CountPerStatus create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer count; 
            private String status; 

            private Builder() {
            } 

            private Builder(CountPerStatus model) {
                this.count = model.count;
                this.status = model.status;
            } 

            /**
             * <p>The number of cloud computers.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The cloud computer status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CountPerStatus build() {
                return new CountPerStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopGroupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>desktop_group_name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-dq2mybjr23yw*****</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopGroupsResponseBody</p>
     */
    public static class DesktopGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("BindAmount")
        private Long bindAmount;

        @com.aliyun.core.annotation.NameInMap("BuyDesktopsCount")
        private Integer buyDesktopsCount;

        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("ConnectDuration")
        private Long connectDuration;

        @com.aliyun.core.annotation.NameInMap("CountPerStatus")
        private java.util.List<CountPerStatus> countPerStatus;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private String dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("DesktopCount")
        private Integer desktopCount;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupName")
        private String desktopGroupName;

        @com.aliyun.core.annotation.NameInMap("DesktopType")
        private String desktopType;

        @com.aliyun.core.annotation.NameInMap("EndUserCount")
        private Integer endUserCount;

        @com.aliyun.core.annotation.NameInMap("EntraDomainName")
        private String entraDomainName;

        @com.aliyun.core.annotation.NameInMap("EnvId")
        private String envId;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("ExpiredTimes")
        private java.util.List<String> expiredTimes;

        @com.aliyun.core.annotation.NameInMap("GpuCount")
        private Float gpuCount;

        @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("IdleDisconnectDuration")
        private Long idleDisconnectDuration;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("IsLdap")
        private Boolean isLdap;

        @com.aliyun.core.annotation.NameInMap("KeepDuration")
        private Long keepDuration;

        @com.aliyun.core.annotation.NameInMap("LoadPolicy")
        private Long loadPolicy;

        @com.aliyun.core.annotation.NameInMap("MaxDesktopsCount")
        private Integer maxDesktopsCount;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("MinDesktopsCount")
        private Integer minDesktopsCount;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
        private String officeSiteType;

        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("OwnBundleId")
        private String ownBundleId;

        @com.aliyun.core.annotation.NameInMap("OwnBundleName")
        private String ownBundleName;

        @com.aliyun.core.annotation.NameInMap("OwnType")
        private Long ownType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupIdList")
        private java.util.List<String> policyGroupIdList;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupName")
        private String policyGroupName;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupNameList")
        private java.util.List<String> policyGroupNameList;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("QosRuleId")
        private String qosRuleId;

        @com.aliyun.core.annotation.NameInMap("RatioThreshold")
        private Float ratioThreshold;

        @com.aliyun.core.annotation.NameInMap("ResetType")
        private Long resetType;

        @com.aliyun.core.annotation.NameInMap("SimpleUserGroupId")
        private String simpleUserGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StopDuration")
        private Long stopDuration;

        @com.aliyun.core.annotation.NameInMap("SubnetId")
        private String subnetId;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UserGroupName")
        private String userGroupName;

        @com.aliyun.core.annotation.NameInMap("UserOuPath")
        private String userOuPath;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionKey")
        private String volumeEncryptionKey;

        private DesktopGroups(Builder builder) {
            this.accountType = builder.accountType;
            this.bindAmount = builder.bindAmount;
            this.buyDesktopsCount = builder.buyDesktopsCount;
            this.comments = builder.comments;
            this.connectDuration = builder.connectDuration;
            this.countPerStatus = builder.countPerStatus;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskSize = builder.dataDiskSize;
            this.desktopCount = builder.desktopCount;
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopGroupName = builder.desktopGroupName;
            this.desktopType = builder.desktopType;
            this.endUserCount = builder.endUserCount;
            this.entraDomainName = builder.entraDomainName;
            this.envId = builder.envId;
            this.envType = builder.envType;
            this.expiredTime = builder.expiredTime;
            this.expiredTimes = builder.expiredTimes;
            this.gpuCount = builder.gpuCount;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.gpuSpec = builder.gpuSpec;
            this.idleDisconnectDuration = builder.idleDisconnectDuration;
            this.imageId = builder.imageId;
            this.isLdap = builder.isLdap;
            this.keepDuration = builder.keepDuration;
            this.loadPolicy = builder.loadPolicy;
            this.maxDesktopsCount = builder.maxDesktopsCount;
            this.memory = builder.memory;
            this.minDesktopsCount = builder.minDesktopsCount;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.orgId = builder.orgId;
            this.osType = builder.osType;
            this.ownBundleId = builder.ownBundleId;
            this.ownBundleName = builder.ownBundleName;
            this.ownType = builder.ownType;
            this.payType = builder.payType;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupIdList = builder.policyGroupIdList;
            this.policyGroupName = builder.policyGroupName;
            this.policyGroupNameList = builder.policyGroupNameList;
            this.protocolType = builder.protocolType;
            this.qosRuleId = builder.qosRuleId;
            this.ratioThreshold = builder.ratioThreshold;
            this.resetType = builder.resetType;
            this.simpleUserGroupId = builder.simpleUserGroupId;
            this.status = builder.status;
            this.stopDuration = builder.stopDuration;
            this.subnetId = builder.subnetId;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
            this.tags = builder.tags;
            this.userGroupName = builder.userGroupName;
            this.userOuPath = builder.userOuPath;
            this.version = builder.version;
            this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
            this.volumeEncryptionKey = builder.volumeEncryptionKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopGroups create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return bindAmount
         */
        public Long getBindAmount() {
            return this.bindAmount;
        }

        /**
         * @return buyDesktopsCount
         */
        public Integer getBuyDesktopsCount() {
            return this.buyDesktopsCount;
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return connectDuration
         */
        public Long getConnectDuration() {
            return this.connectDuration;
        }

        /**
         * @return countPerStatus
         */
        public java.util.List<CountPerStatus> getCountPerStatus() {
            return this.countPerStatus;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return dataDiskSize
         */
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return desktopCount
         */
        public Integer getDesktopCount() {
            return this.desktopCount;
        }

        /**
         * @return desktopGroupId
         */
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        /**
         * @return desktopGroupName
         */
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

        /**
         * @return desktopType
         */
        public String getDesktopType() {
            return this.desktopType;
        }

        /**
         * @return endUserCount
         */
        public Integer getEndUserCount() {
            return this.endUserCount;
        }

        /**
         * @return entraDomainName
         */
        public String getEntraDomainName() {
            return this.entraDomainName;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return expiredTimes
         */
        public java.util.List<String> getExpiredTimes() {
            return this.expiredTimes;
        }

        /**
         * @return gpuCount
         */
        public Float getGpuCount() {
            return this.gpuCount;
        }

        /**
         * @return gpuDriverVersion
         */
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return idleDisconnectDuration
         */
        public Long getIdleDisconnectDuration() {
            return this.idleDisconnectDuration;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return isLdap
         */
        public Boolean getIsLdap() {
            return this.isLdap;
        }

        /**
         * @return keepDuration
         */
        public Long getKeepDuration() {
            return this.keepDuration;
        }

        /**
         * @return loadPolicy
         */
        public Long getLoadPolicy() {
            return this.loadPolicy;
        }

        /**
         * @return maxDesktopsCount
         */
        public Integer getMaxDesktopsCount() {
            return this.maxDesktopsCount;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return minDesktopsCount
         */
        public Integer getMinDesktopsCount() {
            return this.minDesktopsCount;
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
         * @return officeSiteType
         */
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return ownBundleId
         */
        public String getOwnBundleId() {
            return this.ownBundleId;
        }

        /**
         * @return ownBundleName
         */
        public String getOwnBundleName() {
            return this.ownBundleName;
        }

        /**
         * @return ownType
         */
        public Long getOwnType() {
            return this.ownType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        /**
         * @return policyGroupIdList
         */
        public java.util.List<String> getPolicyGroupIdList() {
            return this.policyGroupIdList;
        }

        /**
         * @return policyGroupName
         */
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        /**
         * @return policyGroupNameList
         */
        public java.util.List<String> getPolicyGroupNameList() {
            return this.policyGroupNameList;
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
         * @return ratioThreshold
         */
        public Float getRatioThreshold() {
            return this.ratioThreshold;
        }

        /**
         * @return resetType
         */
        public Long getResetType() {
            return this.resetType;
        }

        /**
         * @return simpleUserGroupId
         */
        public String getSimpleUserGroupId() {
            return this.simpleUserGroupId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return stopDuration
         */
        public Long getStopDuration() {
            return this.stopDuration;
        }

        /**
         * @return subnetId
         */
        public String getSubnetId() {
            return this.subnetId;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return userGroupName
         */
        public String getUserGroupName() {
            return this.userGroupName;
        }

        /**
         * @return userOuPath
         */
        public String getUserOuPath() {
            return this.userOuPath;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return volumeEncryptionEnabled
         */
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        /**
         * @return volumeEncryptionKey
         */
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

        public static final class Builder {
            private String accountType; 
            private Long bindAmount; 
            private Integer buyDesktopsCount; 
            private String comments; 
            private Long connectDuration; 
            private java.util.List<CountPerStatus> countPerStatus; 
            private Integer cpu; 
            private String createTime; 
            private String creator; 
            private String dataDiskCategory; 
            private String dataDiskSize; 
            private Integer desktopCount; 
            private String desktopGroupId; 
            private String desktopGroupName; 
            private String desktopType; 
            private Integer endUserCount; 
            private String entraDomainName; 
            private String envId; 
            private String envType; 
            private String expiredTime; 
            private java.util.List<String> expiredTimes; 
            private Float gpuCount; 
            private String gpuDriverVersion; 
            private String gpuSpec; 
            private Long idleDisconnectDuration; 
            private String imageId; 
            private Boolean isLdap; 
            private Long keepDuration; 
            private Long loadPolicy; 
            private Integer maxDesktopsCount; 
            private Long memory; 
            private Integer minDesktopsCount; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String orgId; 
            private String osType; 
            private String ownBundleId; 
            private String ownBundleName; 
            private Long ownType; 
            private String payType; 
            private String policyGroupId; 
            private java.util.List<String> policyGroupIdList; 
            private String policyGroupName; 
            private java.util.List<String> policyGroupNameList; 
            private String protocolType; 
            private String qosRuleId; 
            private Float ratioThreshold; 
            private Long resetType; 
            private String simpleUserGroupId; 
            private Integer status; 
            private Long stopDuration; 
            private String subnetId; 
            private String systemDiskCategory; 
            private Integer systemDiskSize; 
            private java.util.List<Tags> tags; 
            private String userGroupName; 
            private String userOuPath; 
            private Integer version; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 

            private Builder() {
            } 

            private Builder(DesktopGroups model) {
                this.accountType = model.accountType;
                this.bindAmount = model.bindAmount;
                this.buyDesktopsCount = model.buyDesktopsCount;
                this.comments = model.comments;
                this.connectDuration = model.connectDuration;
                this.countPerStatus = model.countPerStatus;
                this.cpu = model.cpu;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.dataDiskCategory = model.dataDiskCategory;
                this.dataDiskSize = model.dataDiskSize;
                this.desktopCount = model.desktopCount;
                this.desktopGroupId = model.desktopGroupId;
                this.desktopGroupName = model.desktopGroupName;
                this.desktopType = model.desktopType;
                this.endUserCount = model.endUserCount;
                this.entraDomainName = model.entraDomainName;
                this.envId = model.envId;
                this.envType = model.envType;
                this.expiredTime = model.expiredTime;
                this.expiredTimes = model.expiredTimes;
                this.gpuCount = model.gpuCount;
                this.gpuDriverVersion = model.gpuDriverVersion;
                this.gpuSpec = model.gpuSpec;
                this.idleDisconnectDuration = model.idleDisconnectDuration;
                this.imageId = model.imageId;
                this.isLdap = model.isLdap;
                this.keepDuration = model.keepDuration;
                this.loadPolicy = model.loadPolicy;
                this.maxDesktopsCount = model.maxDesktopsCount;
                this.memory = model.memory;
                this.minDesktopsCount = model.minDesktopsCount;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.officeSiteType = model.officeSiteType;
                this.orgId = model.orgId;
                this.osType = model.osType;
                this.ownBundleId = model.ownBundleId;
                this.ownBundleName = model.ownBundleName;
                this.ownType = model.ownType;
                this.payType = model.payType;
                this.policyGroupId = model.policyGroupId;
                this.policyGroupIdList = model.policyGroupIdList;
                this.policyGroupName = model.policyGroupName;
                this.policyGroupNameList = model.policyGroupNameList;
                this.protocolType = model.protocolType;
                this.qosRuleId = model.qosRuleId;
                this.ratioThreshold = model.ratioThreshold;
                this.resetType = model.resetType;
                this.simpleUserGroupId = model.simpleUserGroupId;
                this.status = model.status;
                this.stopDuration = model.stopDuration;
                this.subnetId = model.subnetId;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskSize = model.systemDiskSize;
                this.tags = model.tags;
                this.userGroupName = model.userGroupName;
                this.userOuPath = model.userOuPath;
                this.version = model.version;
                this.volumeEncryptionEnabled = model.volumeEncryptionEnabled;
                this.volumeEncryptionKey = model.volumeEncryptionKey;
            } 

            /**
             * <p>The account type.</p>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The number of concurrent sessions allowed per cloud computer in a multi-session shared cloud computer group with multiple instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bindAmount(Long bindAmount) {
                this.bindAmount = bindAmount;
                return this;
            }

            /**
             * <p>This parameter applies only to subscription shared cloud computers and indicates the initial number of cloud computers purchased. Valid values: 0 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder buyDesktopsCount(Integer buyDesktopsCount) {
                this.buyDesktopsCount = buyDesktopsCount;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The maximum duration that a session can remain in the connected state. The session is automatically disconnected when this duration is reached. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600000</p>
             */
            public Builder connectDuration(Long connectDuration) {
                this.connectDuration = connectDuration;
                return this;
            }

            /**
             * <p>The list of cloud computer counts by status.</p>
             */
            public Builder countPerStatus(java.util.List<CountPerStatus> countPerStatus) {
                this.countPerStatus = countPerStatus;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * <p>The time is displayed in UTC in the ISO 8601 standard format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-17T14:51:07Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1007214305******</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The user disk type.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * <p>The user disk capacity. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * <p>The number of cloud computers that have been created.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder desktopCount(Integer desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * <p>The ID of the shared cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-2i8qxpv6t1a03****</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The name of the shared cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudComputerPool01</p>
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            /**
             * <p>The cloud computer specification. You can call <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> to query the specification IDs supported by Wuying Cloud Computer.</p>
             * 
             * <strong>example:</strong>
             * <p>eds.enterprise_office.4c4g</p>
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * <p>The number of authorized users for the shared cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder endUserCount(Integer endUserCount) {
                this.endUserCount = endUserCount;
                return this;
            }

            /**
             * <p>The domain name of Microsoft Entra ID.</p>
             * 
             * <strong>example:</strong>
             * <p>contoso.onmicrosoft.com</p>
             */
            public Builder entraDomainName(String entraDomainName) {
                this.entraDomainName = entraDomainName;
                return this;
            }

            /**
             * <p>The environment ID. This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>adifa****</p>
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * <p>The environment type. This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The expiration time of the subscription shared cloud computer.</p>
             * <p>The time follows the ISO 8601 standard in UTC: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-17T16:00:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The list of expiration times.</p>
             */
            public Builder expiredTimes(java.util.List<String> expiredTimes) {
                this.expiredTimes = expiredTimes;
                return this;
            }

            /**
             * <p>The number of GPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * <p>The GPU driver version.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * <p>The GPU memory.</p>
             * 
             * <strong>example:</strong>
             * <p>16 GiB</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The maximum idle duration after a user session is established. If no keyboard or mouse operations are performed within this duration, the session is disconnected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>90000</p>
             */
            public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
                this.idleDisconnectDuration = idleDisconnectDuration;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-gq15cq5ydlvwn****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>Indicates whether the directory is an LDAP directory.</p>
             */
            public Builder isLdap(Boolean isLdap) {
                this.isLdap = isLdap;
                return this;
            }

            /**
             * <p>The retention period after a session is disconnected. Unit: milliseconds. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session is always retained.</p>
             * 
             * <strong>example:</strong>
             * <p>180000</p>
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * <p>The load balancing policy for multi-session shared cloud computers with multiple instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder loadPolicy(Long loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * <ul>
             * <li>For pay-as-you-go shared cloud computers, this parameter indicates the maximum number of cloud computers that can be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxDesktopsCount(Integer maxDesktopsCount) {
                this.maxDesktopsCount = maxDesktopsCount;
                return this;
            }

            /**
             * <p>The memory size. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>16384</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <ul>
             * <li>For pay-as-you-go shared cloud computers, this parameter indicates the minimum number of cloud computers that can be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minDesktopsCount(Integer minDesktopsCount) {
                this.minDesktopsCount = minDesktopsCount;
                return this;
            }

            /**
             * <p>The name of the office network to which the shared cloud computer belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-467671****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The ID of the office network to which the shared cloud computers belong.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+os-c5cy7q578s8jc****</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The account system type of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * <p>The organization ID of the team.</p>
             * 
             * <strong>example:</strong>
             * <p>org-aliyun-wy-org-id</p>
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * <p>The operating system type.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The cloud computer template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bundle_eds_general_4c8g_s8d5_win2019</p>
             */
            public Builder ownBundleId(String ownBundleId) {
                this.ownBundleId = ownBundleId;
                return this;
            }

            /**
             * <p>The name of the cloud computer template.</p>
             * 
             * <strong>example:</strong>
             * <p>Standard Office Template</p>
             */
            public Builder ownBundleName(String ownBundleName) {
                this.ownBundleName = ownBundleName;
                return this;
            }

            /**
             * <p>The type of the shared cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ownType(Long ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The ID of the policy associated with the shared cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-53iyi2aar0nd6c8qj</p>
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * <p>The list of cloud computer policy IDs.</p>
             */
            public Builder policyGroupIdList(java.util.List<String> policyGroupIdList) {
                this.policyGroupIdList = policyGroupIdList;
                return this;
            }

            /**
             * <p>The policy name associated with the shared cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>All enabled policy</p>
             */
            public Builder policyGroupName(String policyGroupName) {
                this.policyGroupName = policyGroupName;
                return this;
            }

            /**
             * <p>The list of cloud computer policy names.</p>
             */
            public Builder policyGroupNameList(java.util.List<String> policyGroupNameList) {
                this.policyGroupNameList = policyGroupNameList;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The ID of the QoS rule.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-5605u0gelk200****</p>
             */
            public Builder qosRuleId(String qosRuleId) {
                this.qosRuleId = qosRuleId;
                return this;
            }

            /**
             * <p>The session occupancy threshold used as the auto scaling trigger condition for multi-session shared cloud computers. The session occupancy is calculated by using the following formula:</p>
             * <p><code>Session occupancy = Number of bound sessions / (Total number of cloud computers × Maximum number of sessions supported by each cloud computer) × 100%</code></p>
             * <p>When the session occupancy reaches this threshold, new cloud computers are created. When the session occupancy is below this threshold, excess cloud computers are deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>0.85</p>
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * <p>The reset type of the shared cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder resetType(Long resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The convenience user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ug-3f6c8a2b****</p>
             */
            public Builder simpleUserGroupId(String simpleUserGroupId) {
                this.simpleUserGroupId = simpleUserGroupId;
                return this;
            }

            /**
             * <p>The status of the shared cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The idle shutdown duration. When the cloud computer has been idle for this duration, it is automatically shut down. If a user connects after shutdown, the cloud computer automatically starts. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>900000</p>
             */
            public Builder stopDuration(Long stopDuration) {
                this.stopDuration = stopDuration;
                return this;
            }

            /**
             * <p>The subnet ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf63bb6*****8gfytm</p>
             */
            public Builder subnetId(String subnetId) {
                this.subnetId = subnetId;
                return this;
            }

            /**
             * <p>The system cloud disk type.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The system cloud disk capacity. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The user group name.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D Group</p>
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            /**
             * <p>The organizational unit (OU) path of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder userOuPath(String userOuPath) {
                this.userOuPath = userOuPath;
                return this;
            }

            /**
             * <p>The version number of the shared cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Indicates whether encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * <p>The ID of the KMS key used for disk encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>e5409ada-xxxx-xxxx-xxxx-89e31e23e993</p>
             */
            public Builder volumeEncryptionKey(String volumeEncryptionKey) {
                this.volumeEncryptionKey = volumeEncryptionKey;
                return this;
            }

            public DesktopGroups build() {
                return new DesktopGroups(this);
            } 

        } 

    }
}
