// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopsResponseBody</p>
 */
public class DescribeDesktopsResponseBody extends TeaModel {
    @NameInMap("Desktops")
    private java.util.List < Desktops> desktops;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDesktopsResponseBody(Builder builder) {
        this.desktops = builder.desktops;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopsResponseBody create() {
        return builder().build();
    }

    /**
     * @return desktops
     */
    public java.util.List < Desktops> getDesktops() {
        return this.desktops;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Desktops> desktops; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details of the cloud desktops.
         */
        public Builder desktops(java.util.List < Desktops> desktops) {
            this.desktops = desktops;
            return this;
        }

        /**
         * The token that is used for the next query. If this parameter is empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of cloud desktops.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDesktopsResponseBody build() {
            return new DescribeDesktopsResponseBody(this);
        } 

    } 

    public static class DesktopDurationList extends TeaModel {
        @NameInMap("PackageCreationTime")
        private String packageCreationTime;

        @NameInMap("PackageExpiredTime")
        private String packageExpiredTime;

        @NameInMap("PackageId")
        private String packageId;

        @NameInMap("PackageStatus")
        private String packageStatus;

        @NameInMap("TotalDuration")
        private Long totalDuration;

        @NameInMap("UsedDuration")
        private Long usedDuration;

        private DesktopDurationList(Builder builder) {
            this.packageCreationTime = builder.packageCreationTime;
            this.packageExpiredTime = builder.packageExpiredTime;
            this.packageId = builder.packageId;
            this.packageStatus = builder.packageStatus;
            this.totalDuration = builder.totalDuration;
            this.usedDuration = builder.usedDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopDurationList create() {
            return builder().build();
        }

        /**
         * @return packageCreationTime
         */
        public String getPackageCreationTime() {
            return this.packageCreationTime;
        }

        /**
         * @return packageExpiredTime
         */
        public String getPackageExpiredTime() {
            return this.packageExpiredTime;
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        /**
         * @return packageStatus
         */
        public String getPackageStatus() {
            return this.packageStatus;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return usedDuration
         */
        public Long getUsedDuration() {
            return this.usedDuration;
        }

        public static final class Builder {
            private String packageCreationTime; 
            private String packageExpiredTime; 
            private String packageId; 
            private String packageStatus; 
            private Long totalDuration; 
            private Long usedDuration; 

            /**
             * PackageCreationTime.
             */
            public Builder packageCreationTime(String packageCreationTime) {
                this.packageCreationTime = packageCreationTime;
                return this;
            }

            /**
             * PackageExpiredTime.
             */
            public Builder packageExpiredTime(String packageExpiredTime) {
                this.packageExpiredTime = packageExpiredTime;
                return this;
            }

            /**
             * PackageId.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * PackageStatus.
             */
            public Builder packageStatus(String packageStatus) {
                this.packageStatus = packageStatus;
                return this;
            }

            /**
             * TotalDuration.
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * UsedDuration.
             */
            public Builder usedDuration(Long usedDuration) {
                this.usedDuration = usedDuration;
                return this;
            }

            public DesktopDurationList build() {
                return new DesktopDurationList(this);
            } 

        } 

    }
    public static class Disks extends TeaModel {
        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskSize")
        private Integer diskSize;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        private Disks(Builder builder) {
            this.diskId = builder.diskId;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private String diskId; 
            private Integer diskSize; 
            private String diskType; 
            private String performanceLevel; 

            /**
             * The ID of the disk.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The size of the disk. Unit: GiB.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The type of the disk.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The performance level (PL) of the disk that is an enhanced SSD (ESSD). Valid values:
             * <p>
             * 
             * *   PL0
             * *   PL1
             * *   PL2
             * *   PL3
             * 
             * For more information about the differences between disks of different PLs, see [Enhanced SSDs](~~122389~~).
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
    public static class FotaUpdate extends TeaModel {
        @NameInMap("CurrentAppVersion")
        private String currentAppVersion;

        @NameInMap("NewAppVersion")
        private String newAppVersion;

        @NameInMap("ReleaseNote")
        private String releaseNote;

        @NameInMap("ReleaseNoteEn")
        private String releaseNoteEn;

        @NameInMap("ReleaseNoteJp")
        private String releaseNoteJp;

        @NameInMap("Size")
        private Long size;

        private FotaUpdate(Builder builder) {
            this.currentAppVersion = builder.currentAppVersion;
            this.newAppVersion = builder.newAppVersion;
            this.releaseNote = builder.releaseNote;
            this.releaseNoteEn = builder.releaseNoteEn;
            this.releaseNoteJp = builder.releaseNoteJp;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FotaUpdate create() {
            return builder().build();
        }

        /**
         * @return currentAppVersion
         */
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        /**
         * @return newAppVersion
         */
        public String getNewAppVersion() {
            return this.newAppVersion;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return releaseNoteEn
         */
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        /**
         * @return releaseNoteJp
         */
        public String getReleaseNoteJp() {
            return this.releaseNoteJp;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String currentAppVersion; 
            private String newAppVersion; 
            private String releaseNote; 
            private String releaseNoteEn; 
            private String releaseNoteJp; 
            private Long size; 

            /**
             * The current version of the cloud desktop.
             */
            public Builder currentAppVersion(String currentAppVersion) {
                this.currentAppVersion = currentAppVersion;
                return this;
            }

            /**
             * The version to which the cloud desktop can be updated.
             */
            public Builder newAppVersion(String newAppVersion) {
                this.newAppVersion = newAppVersion;
                return this;
            }

            /**
             * The description of the version to which the cloud desktop can be updated.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * ReleaseNoteEn.
             */
            public Builder releaseNoteEn(String releaseNoteEn) {
                this.releaseNoteEn = releaseNoteEn;
                return this;
            }

            /**
             * ReleaseNoteJp.
             */
            public Builder releaseNoteJp(String releaseNoteJp) {
                this.releaseNoteJp = releaseNoteJp;
                return this;
            }

            /**
             * The size of the installation package for the version to which the cloud desktop can be updated. Unit: KB.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public FotaUpdate build() {
                return new FotaUpdate(this);
            } 

        } 

    }
    public static class Sessions extends TeaModel {
        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("EstablishmentTime")
        private String establishmentTime;

        @NameInMap("ExternalUserName")
        private String externalUserName;

        private Sessions(Builder builder) {
            this.endUserId = builder.endUserId;
            this.establishmentTime = builder.establishmentTime;
            this.externalUserName = builder.externalUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return establishmentTime
         */
        public String getEstablishmentTime() {
            return this.establishmentTime;
        }

        /**
         * @return externalUserName
         */
        public String getExternalUserName() {
            return this.externalUserName;
        }

        public static final class Builder {
            private String endUserId; 
            private String establishmentTime; 
            private String externalUserName; 

            /**
             * The ID of the user that logged on to the cloud desktop.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The time when the desktop session was established.
             */
            public Builder establishmentTime(String establishmentTime) {
                this.establishmentTime = establishmentTime;
                return this;
            }

            /**
             * The name of the external user.
             */
            public Builder externalUserName(String externalUserName) {
                this.externalUserName = externalUserName;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class Desktops extends TeaModel {
        @NameInMap("BindAmount")
        private Integer bindAmount;

        @NameInMap("BundleId")
        private String bundleId;

        @NameInMap("BundleName")
        private String bundleName;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ConnectionStatus")
        private String connectionStatus;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @NameInMap("DataDiskSize")
        private String dataDiskSize;

        @NameInMap("DesktopDurationList")
        private java.util.List < DesktopDurationList> desktopDurationList;

        @NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("DesktopStatus")
        private String desktopStatus;

        @NameInMap("DesktopType")
        private String desktopType;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("DirectoryType")
        private String directoryType;

        @NameInMap("Disks")
        private java.util.List < Disks> disks;

        @NameInMap("DowngradeQuota")
        private Long downgradeQuota;

        @NameInMap("DowngradedTimes")
        private Long downgradedTimes;

        @NameInMap("EndUserIds")
        private java.util.List < String > endUserIds;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("FotaUpdate")
        private FotaUpdate fotaUpdate;

        @NameInMap("GpuCategory")
        private Long gpuCategory;

        @NameInMap("GpuCount")
        private Float gpuCount;

        @NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @NameInMap("GpuSpec")
        private String gpuSpec;

        @NameInMap("HibernationBeta")
        private Boolean hibernationBeta;

        @NameInMap("HibernationOptionsConfigured")
        private Boolean hibernationOptionsConfigured;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ManagementFlag")
        private String managementFlag;

        @NameInMap("ManagementFlags")
        private java.util.List < String > managementFlags;

        @NameInMap("Memory")
        private Long memory;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("NetworkInterfaceIp")
        private String networkInterfaceIp;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("OfficeSiteName")
        private String officeSiteName;

        @NameInMap("OfficeSiteType")
        private String officeSiteType;

        @NameInMap("OfficeSiteVpcType")
        private String officeSiteVpcType;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("PolicyGroupId")
        private String policyGroupId;

        @NameInMap("PolicyGroupIdList")
        private java.util.List < String > policyGroupIdList;

        @NameInMap("PolicyGroupName")
        private String policyGroupName;

        @NameInMap("PolicyGroupNameList")
        private java.util.List < String > policyGroupNameList;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("SessionType")
        private String sessionType;

        @NameInMap("Sessions")
        private java.util.List < Sessions> sessions;

        @NameInMap("SnapshotPolicyId")
        private String snapshotPolicyId;

        @NameInMap("SnapshotPolicyName")
        private String snapshotPolicyName;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("SupportHibernation")
        private Boolean supportHibernation;

        @NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @NameInMap("VolumeEncryptionKey")
        private String volumeEncryptionKey;

        @NameInMap("ZoneType")
        private String zoneType;

        private Desktops(Builder builder) {
            this.bindAmount = builder.bindAmount;
            this.bundleId = builder.bundleId;
            this.bundleName = builder.bundleName;
            this.chargeType = builder.chargeType;
            this.connectionStatus = builder.connectionStatus;
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskSize = builder.dataDiskSize;
            this.desktopDurationList = builder.desktopDurationList;
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.desktopType = builder.desktopType;
            this.directoryId = builder.directoryId;
            this.directoryType = builder.directoryType;
            this.disks = builder.disks;
            this.downgradeQuota = builder.downgradeQuota;
            this.downgradedTimes = builder.downgradedTimes;
            this.endUserIds = builder.endUserIds;
            this.expiredTime = builder.expiredTime;
            this.fotaUpdate = builder.fotaUpdate;
            this.gpuCategory = builder.gpuCategory;
            this.gpuCount = builder.gpuCount;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.gpuSpec = builder.gpuSpec;
            this.hibernationBeta = builder.hibernationBeta;
            this.hibernationOptionsConfigured = builder.hibernationOptionsConfigured;
            this.hostName = builder.hostName;
            this.imageId = builder.imageId;
            this.managementFlag = builder.managementFlag;
            this.managementFlags = builder.managementFlags;
            this.memory = builder.memory;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.officeSiteVpcType = builder.officeSiteVpcType;
            this.osType = builder.osType;
            this.platform = builder.platform;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupIdList = builder.policyGroupIdList;
            this.policyGroupName = builder.policyGroupName;
            this.policyGroupNameList = builder.policyGroupNameList;
            this.progress = builder.progress;
            this.protocolType = builder.protocolType;
            this.sessionType = builder.sessionType;
            this.sessions = builder.sessions;
            this.snapshotPolicyId = builder.snapshotPolicyId;
            this.snapshotPolicyName = builder.snapshotPolicyName;
            this.startTime = builder.startTime;
            this.supportHibernation = builder.supportHibernation;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
            this.tags = builder.tags;
            this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
            this.volumeEncryptionKey = builder.volumeEncryptionKey;
            this.zoneType = builder.zoneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Desktops create() {
            return builder().build();
        }

        /**
         * @return bindAmount
         */
        public Integer getBindAmount() {
            return this.bindAmount;
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return bundleName
         */
        public String getBundleName() {
            return this.bundleName;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return desktopDurationList
         */
        public java.util.List < DesktopDurationList> getDesktopDurationList() {
            return this.desktopDurationList;
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
        public String getDesktopId() {
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
         * @return directoryType
         */
        public String getDirectoryType() {
            return this.directoryType;
        }

        /**
         * @return disks
         */
        public java.util.List < Disks> getDisks() {
            return this.disks;
        }

        /**
         * @return downgradeQuota
         */
        public Long getDowngradeQuota() {
            return this.downgradeQuota;
        }

        /**
         * @return downgradedTimes
         */
        public Long getDowngradedTimes() {
            return this.downgradedTimes;
        }

        /**
         * @return endUserIds
         */
        public java.util.List < String > getEndUserIds() {
            return this.endUserIds;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return fotaUpdate
         */
        public FotaUpdate getFotaUpdate() {
            return this.fotaUpdate;
        }

        /**
         * @return gpuCategory
         */
        public Long getGpuCategory() {
            return this.gpuCategory;
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
         * @return hibernationBeta
         */
        public Boolean getHibernationBeta() {
            return this.hibernationBeta;
        }

        /**
         * @return hibernationOptionsConfigured
         */
        public Boolean getHibernationOptionsConfigured() {
            return this.hibernationOptionsConfigured;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return managementFlag
         */
        public String getManagementFlag() {
            return this.managementFlag;
        }

        /**
         * @return managementFlags
         */
        public java.util.List < String > getManagementFlags() {
            return this.managementFlags;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return networkInterfaceIp
         */
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
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
         * @return officeSiteVpcType
         */
        public String getOfficeSiteVpcType() {
            return this.officeSiteVpcType;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
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
        public java.util.List < String > getPolicyGroupIdList() {
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
        public java.util.List < String > getPolicyGroupNameList() {
            return this.policyGroupNameList;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return sessionType
         */
        public String getSessionType() {
            return this.sessionType;
        }

        /**
         * @return sessions
         */
        public java.util.List < Sessions> getSessions() {
            return this.sessions;
        }

        /**
         * @return snapshotPolicyId
         */
        public String getSnapshotPolicyId() {
            return this.snapshotPolicyId;
        }

        /**
         * @return snapshotPolicyName
         */
        public String getSnapshotPolicyName() {
            return this.snapshotPolicyName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return supportHibernation
         */
        public Boolean getSupportHibernation() {
            return this.supportHibernation;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
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

        /**
         * @return zoneType
         */
        public String getZoneType() {
            return this.zoneType;
        }

        public static final class Builder {
            private Integer bindAmount; 
            private String bundleId; 
            private String bundleName; 
            private String chargeType; 
            private String connectionStatus; 
            private Integer cpu; 
            private String creationTime; 
            private String dataDiskCategory; 
            private String dataDiskSize; 
            private java.util.List < DesktopDurationList> desktopDurationList; 
            private String desktopGroupId; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private String desktopType; 
            private String directoryId; 
            private String directoryType; 
            private java.util.List < Disks> disks; 
            private Long downgradeQuota; 
            private Long downgradedTimes; 
            private java.util.List < String > endUserIds; 
            private String expiredTime; 
            private FotaUpdate fotaUpdate; 
            private Long gpuCategory; 
            private Float gpuCount; 
            private String gpuDriverVersion; 
            private String gpuSpec; 
            private Boolean hibernationBeta; 
            private Boolean hibernationOptionsConfigured; 
            private String hostName; 
            private String imageId; 
            private String managementFlag; 
            private java.util.List < String > managementFlags; 
            private Long memory; 
            private String networkInterfaceId; 
            private String networkInterfaceIp; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String officeSiteVpcType; 
            private String osType; 
            private String platform; 
            private String policyGroupId; 
            private java.util.List < String > policyGroupIdList; 
            private String policyGroupName; 
            private java.util.List < String > policyGroupNameList; 
            private String progress; 
            private String protocolType; 
            private String sessionType; 
            private java.util.List < Sessions> sessions; 
            private String snapshotPolicyId; 
            private String snapshotPolicyName; 
            private String startTime; 
            private Boolean supportHibernation; 
            private String systemDiskCategory; 
            private Integer systemDiskSize; 
            private java.util.List < Tags> tags; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 
            private String zoneType; 

            /**
             * The number of sessions allowed for each cloud desktop in the multi-session desktop group.
             */
            public Builder bindAmount(Integer bindAmount) {
                this.bindAmount = bindAmount;
                return this;
            }

            /**
             * The ID of the desktop template that is used to create the cloud desktop.
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * The name of the desktop template that is used to create the cloud desktop.
             */
            public Builder bundleName(String bundleName) {
                this.bundleName = bundleName;
                return this;
            }

            /**
             * The billing method of the cloud desktop.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The connection status of the user.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * The number of vCPUs.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time when the cloud desktop was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable to the public.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable to the public.
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * DesktopDurationList.
             */
            public Builder desktopDurationList(java.util.List < DesktopDurationList> desktopDurationList) {
                this.desktopDurationList = desktopDurationList;
                return this;
            }

            /**
             * The ID of the group to which the cloud desktop belongs. Default value: null.
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * The ID of the cloud desktop.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The name of the cloud desktop.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The state of the cloud desktop.
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * The desktop type.
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * The ID is the same as the workspace ID that is indicated by the value of the OfficeSiteId parameter.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * This parameter is in invitational preview and unavailable for general users.
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * Details of the disks.
             */
            public Builder disks(java.util.List < Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * The number of times for which the cloud desktop can be downgraded.
             */
            public Builder downgradeQuota(Long downgradeQuota) {
                this.downgradeQuota = downgradeQuota;
                return this;
            }

            /**
             * The number of times for which the cloud desktop is downgraded.
             */
            public Builder downgradedTimes(Long downgradedTimes) {
                this.downgradedTimes = downgradedTimes;
                return this;
            }

            /**
             * The IDs of the users that have the permissions to connect to the cloud desktops.
             */
            public Builder endUserIds(java.util.List < String > endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * The time when the subscription cloud desktop expires.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The information about the image version that the cloud desktop uses.
             */
            public Builder fotaUpdate(FotaUpdate fotaUpdate) {
                this.fotaUpdate = fotaUpdate;
                return this;
            }

            /**
             * Indicates whether the cloud desktop is of the GPU-accelerated type.
             */
            public Builder gpuCategory(Long gpuCategory) {
                this.gpuCategory = gpuCategory;
                return this;
            }

            /**
             * The number of GPUs.
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * The version of the GPU driver with which the cloud desktop is equipped.
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * The GPU model.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * HibernationBeta.
             */
            public Builder hibernationBeta(Boolean hibernationBeta) {
                this.hibernationBeta = hibernationBeta;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable to the public.
             */
            public Builder hibernationOptionsConfigured(Boolean hibernationOptionsConfigured) {
                this.hibernationOptionsConfigured = hibernationOptionsConfigured;
                return this;
            }

            /**
             * The hostname of the cloud desktop.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The flag that is used for management.
             */
            public Builder managementFlag(String managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * ManagementFlags.
             */
            public Builder managementFlags(java.util.List < String > managementFlags) {
                this.managementFlags = managementFlags;
                return this;
            }

            /**
             * The memory size. Unit: MiB.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The ID of the secondary network interface controller (NIC) created by the RAM user or Active Directory (AD) user in EDS. You do not have the permissions to modify this ID.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The IP address of the secondary NIC that is created by the RAM user or AD user in EDS.
             */
            public Builder networkInterfaceIp(String networkInterfaceIp) {
                this.networkInterfaceIp = networkInterfaceIp;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The name of the workspace.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * The account type of the workspace.
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * The virtual private cloud (VPC) type of the workspace.
             */
            public Builder officeSiteVpcType(String officeSiteVpcType) {
                this.officeSiteVpcType = officeSiteVpcType;
                return this;
            }

            /**
             * The type of the OS.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The information about the OS platform. Valid values:
             * <p>
             * 
             * *   CentOS
             * *   Ubuntu
             * *   Windows Server 2016
             * *   Windows Server 2019
             * *   UOS
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The ID of the policy.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * The IDs of the policies.
             */
            public Builder policyGroupIdList(java.util.List < String > policyGroupIdList) {
                this.policyGroupIdList = policyGroupIdList;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder policyGroupName(String policyGroupName) {
                this.policyGroupName = policyGroupName;
                return this;
            }

            /**
             * The names of the policies.
             */
            public Builder policyGroupNameList(java.util.List < String > policyGroupNameList) {
                this.policyGroupNameList = policyGroupNameList;
                return this;
            }

            /**
             * The progress when the cloud desktop was created.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The type of the protocol.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The type of the session.
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * Details of the desktop sessions that users hold.
             */
            public Builder sessions(java.util.List < Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * The ID of the snapshot policy.
             */
            public Builder snapshotPolicyId(String snapshotPolicyId) {
                this.snapshotPolicyId = snapshotPolicyId;
                return this;
            }

            /**
             * The name of the snapshot policy.
             */
            public Builder snapshotPolicyName(String snapshotPolicyName) {
                this.snapshotPolicyName = snapshotPolicyName;
                return this;
            }

            /**
             * The first time when the cloud desktop was started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Indicates whether hibernation is supported for the cloud desktop.
             */
            public Builder supportHibernation(Boolean supportHibernation) {
                this.supportHibernation = supportHibernation;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable to the public.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable to the public.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * Details of the tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether disk encryption is enabled.
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to obtain a list of KMS keys.
             */
            public Builder volumeEncryptionKey(String volumeEncryptionKey) {
                this.volumeEncryptionKey = volumeEncryptionKey;
                return this;
            }

            /**
             * The type of the zone. Default value: **AvailabilityZone**. This value indicates Alibaba Cloud zones.
             */
            public Builder zoneType(String zoneType) {
                this.zoneType = zoneType;
                return this;
            }

            public Desktops build() {
                return new Desktops(this);
            } 

        } 

    }
}
