// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopGroupsResponseBody</p>
 */
public class DescribeDesktopGroupsResponseBody extends TeaModel {
    @NameInMap("DesktopGroups")
    private java.util.List < DesktopGroups> desktopGroups;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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

    /**
     * @return desktopGroups
     */
    public java.util.List < DesktopGroups> getDesktopGroups() {
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
        private java.util.List < DesktopGroups> desktopGroups; 
        private String nextToken; 
        private String requestId; 

        /**
         * Details about desktop groups.
         */
        public Builder desktopGroups(java.util.List < DesktopGroups> desktopGroups) {
            this.desktopGroups = desktopGroups;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDesktopGroupsResponseBody build() {
            return new DescribeDesktopGroupsResponseBody(this);
        } 

    } 

    public static class DesktopGroups extends TeaModel {
        @NameInMap("BindAmount")
        private Long bindAmount;

        @NameInMap("BuyDesktopsCount")
        private Integer buyDesktopsCount;

        @NameInMap("Comments")
        private String comments;

        @NameInMap("ConnectDuration")
        private Long connectDuration;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @NameInMap("DataDiskSize")
        private String dataDiskSize;

        @NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @NameInMap("DesktopGroupName")
        private String desktopGroupName;

        @NameInMap("EndUserCount")
        private Integer endUserCount;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("GpuCount")
        private Float gpuCount;

        @NameInMap("GpuSpec")
        private String gpuSpec;

        @NameInMap("IdleDisconnectDuration")
        private Long idleDisconnectDuration;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("KeepDuration")
        private Long keepDuration;

        @NameInMap("LoadPolicy")
        private Long loadPolicy;

        @NameInMap("MaxDesktopsCount")
        private Integer maxDesktopsCount;

        @NameInMap("Memory")
        private Long memory;

        @NameInMap("MinDesktopsCount")
        private Integer minDesktopsCount;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("OfficeSiteName")
        private String officeSiteName;

        @NameInMap("OfficeSiteType")
        private String officeSiteType;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("OwnBundleId")
        private String ownBundleId;

        @NameInMap("OwnBundleName")
        private String ownBundleName;

        @NameInMap("OwnType")
        private Long ownType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("PolicyGroupId")
        private String policyGroupId;

        @NameInMap("PolicyGroupName")
        private String policyGroupName;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("RatioThreshold")
        private Float ratioThreshold;

        @NameInMap("ResetType")
        private Long resetType;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StopDuration")
        private Long stopDuration;

        @NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("Version")
        private Integer version;

        @NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @NameInMap("VolumeEncryptionKey")
        private String volumeEncryptionKey;

        private DesktopGroups(Builder builder) {
            this.bindAmount = builder.bindAmount;
            this.buyDesktopsCount = builder.buyDesktopsCount;
            this.comments = builder.comments;
            this.connectDuration = builder.connectDuration;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskSize = builder.dataDiskSize;
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopGroupName = builder.desktopGroupName;
            this.endUserCount = builder.endUserCount;
            this.expiredTime = builder.expiredTime;
            this.gpuCount = builder.gpuCount;
            this.gpuSpec = builder.gpuSpec;
            this.idleDisconnectDuration = builder.idleDisconnectDuration;
            this.imageId = builder.imageId;
            this.keepDuration = builder.keepDuration;
            this.loadPolicy = builder.loadPolicy;
            this.maxDesktopsCount = builder.maxDesktopsCount;
            this.memory = builder.memory;
            this.minDesktopsCount = builder.minDesktopsCount;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.osType = builder.osType;
            this.ownBundleId = builder.ownBundleId;
            this.ownBundleName = builder.ownBundleName;
            this.ownType = builder.ownType;
            this.payType = builder.payType;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupName = builder.policyGroupName;
            this.protocolType = builder.protocolType;
            this.ratioThreshold = builder.ratioThreshold;
            this.resetType = builder.resetType;
            this.status = builder.status;
            this.stopDuration = builder.stopDuration;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
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
         * @return endUserCount
         */
        public Integer getEndUserCount() {
            return this.endUserCount;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return gpuCount
         */
        public Float getGpuCount() {
            return this.gpuCount;
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
         * @return policyGroupName
         */
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
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
            private Long bindAmount; 
            private Integer buyDesktopsCount; 
            private String comments; 
            private Long connectDuration; 
            private Integer cpu; 
            private String createTime; 
            private String creator; 
            private String dataDiskCategory; 
            private String dataDiskSize; 
            private String desktopGroupId; 
            private String desktopGroupName; 
            private Integer endUserCount; 
            private String expiredTime; 
            private Float gpuCount; 
            private String gpuSpec; 
            private Long idleDisconnectDuration; 
            private String imageId; 
            private Long keepDuration; 
            private Long loadPolicy; 
            private Integer maxDesktopsCount; 
            private Long memory; 
            private Integer minDesktopsCount; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String osType; 
            private String ownBundleId; 
            private String ownBundleName; 
            private Long ownType; 
            private String payType; 
            private String policyGroupId; 
            private String policyGroupName; 
            private String protocolType; 
            private Float ratioThreshold; 
            private Long resetType; 
            private Integer status; 
            private Long stopDuration; 
            private String systemDiskCategory; 
            private Integer systemDiskSize; 
            private Integer version; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 

            /**
             * The number of sessions that are allowed for each cloud desktop in the multi-session desktop group.
             */
            public Builder bindAmount(Long bindAmount) {
                this.bindAmount = bindAmount;
                return this;
            }

            /**
             * The number of purchased cloud desktops. Valid values: 0 to 200.
             */
            public Builder buyDesktopsCount(Integer buyDesktopsCount) {
                this.buyDesktopsCount = buyDesktopsCount;
                return this;
            }

            /**
             * The remarks.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * The maximum period of time during which the session is connected. When the specified maximum period of time is reached, the session is automatically disconnected. Unit: milliseconds. This parameter is required only for cloud desktops of the same desktop group.
             */
            public Builder connectDuration(Long connectDuration) {
                this.connectDuration = connectDuration;
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
             * The time when the desktop group was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the desktop group.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The category of the data disk.
             * <p>
             * 
             * Valid values:
             * 
             * *   cloud_efficiency
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     ultra disk
             * 
             *     <!-- -->
             * 
             * *   cloud_ssd
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     standard SSD
             * 
             *     <!-- -->
             * 
             * *   cloud_essd
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     ehhanced SSD (ESSD)
             * 
             *     <!-- -->
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * The size of the data disk. Unit: GiB.
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * The desktop group ID.
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * The desktop group name.
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            /**
             * The number of users that are authorized to use the desktop group.
             */
            public Builder endUserCount(Integer endUserCount) {
                this.endUserCount = endUserCount;
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
             * The number of GPUs.
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * The GPU memory.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * The maximum period of time during which the session is idle. When a session is idle, no inputs of keyboards or mouses are detected. When the specified maximum period of time is reached, the session is automatically disconnected. Unit: milliseconds. This parameter is required only for cloud desktops of the same desktop group.
             */
            public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
                this.idleDisconnectDuration = idleDisconnectDuration;
                return this;
            }

            /**
             * The image ID.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The keep-alive duration of the cloud desktop after the end user disconnects from the cloud desktop. Unit: milliseconds.
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * The load balancing policy of the multi-session desktop group.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     depth first
             * 
             *     <!-- -->
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     breadth first
             * 
             *     <!-- -->
             */
            public Builder loadPolicy(Long loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * The maximum number of cloud desktops that the desktop group can contain.
             */
            public Builder maxDesktopsCount(Integer maxDesktopsCount) {
                this.maxDesktopsCount = maxDesktopsCount;
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
             * The minimum number of cloud desktops that the desktop group must contain.
             */
            public Builder minDesktopsCount(Integer minDesktopsCount) {
                this.minDesktopsCount = minDesktopsCount;
                return this;
            }

            /**
             * The workspace ID.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The workspace name.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * The account type of the workspace.
             * <p>
             * 
             * Valid values:
             * 
             * *   PERSONAL
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     personal account type
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   SIMPLE
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     convenience account type
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   AD_CONNECTOR:
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     workspace of the enterprise AD account type
             * 
             *     <!-- -->
             * 
             * *   RAM
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     Resource Access Management (RAM) account type
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * The OS. Valid values:
             * <p>
             * 
             * *   Windows
             * *   Linux
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The desktop template ID.
             */
            public Builder ownBundleId(String ownBundleId) {
                this.ownBundleId = ownBundleId;
                return this;
            }

            /**
             * The desktop template name.
             */
            public Builder ownBundleName(String ownBundleName) {
                this.ownBundleName = ownBundleName;
                return this;
            }

            /**
             * The desktop group type.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     personal desktop group
             * 
             *     <!-- -->
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     shared desktop group (multi-session)
             * 
             *     <!-- -->
             */
            public Builder ownType(Long ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * The billing method of the desktop group.
             * <p>
             * 
             * Valid values:
             * 
             * *   PostPaid
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     pay-as-you-go
             * 
             *     <!-- -->
             * 
             * *   PrePaid
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     subscription
             * 
             *     <!-- -->
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The policy ID.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * The policy name.
             */
            public Builder policyGroupName(String policyGroupName) {
                this.policyGroupName = policyGroupName;
                return this;
            }

            /**
             * The protocol. Valid values:
             * <p>
             * 
             * *   ASP
             * *   HDX
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session desktop group. `Ratio of connected sessions = Number of connected sessions/(Total number of cloud desktops × Maximum number of sessions allowed for each cloud desktop) × 100%`. When the specified threshold is reached, new cloud desktops are automatically created. When the specified threshold is not reached, idle cloud desktops are released.
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * Indicates which type of disk that is used by cloud desktops in the desktop group is reset.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     No disks are reset.
             * 
             *     <!-- -->
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     Only the system disk is reset.
             * 
             *     <!-- -->
             * 
             * *   2
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     Only the data disk is reset.
             * 
             *     <!-- -->
             * 
             * *   3
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     Both the system disk and data disk are reset.
             * 
             *     <!-- -->
             */
            public Builder resetType(Long resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * The payment status of the desktop group.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     unpaid
             * 
             *     <!-- -->
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     paid
             * 
             *     <!-- -->
             * 
             * *   2
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     overdue or expired
             * 
             *     <!-- -->
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The period of time before the idle cloud desktop enters the Stopped state. When the specified period of time is reached, the idle cloud desktop automatically enters the Stopped state. If an end user connects to a cloud desktop that is in the Stopped state, the cloud desktop automatically starts. Unit: milliseconds.
             */
            public Builder stopDuration(Long stopDuration) {
                this.stopDuration = stopDuration;
                return this;
            }

            /**
             * The category of the system disk.
             * <p>
             * 
             * Valid values:
             * 
             * *   cloud_efficiency
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     ultra disk
             * 
             *     <!-- -->
             * 
             * *   cloud_ssd
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     standard SSD
             * 
             *     <!-- -->
             * 
             * *   cloud_essd
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     ESSD
             * 
             *     <!-- -->
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The version number of the desktop group.
             */
            public Builder version(Integer version) {
                this.version = version;
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
             * The ID of the Key Management Service (KMS) key for disk encryption.
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
