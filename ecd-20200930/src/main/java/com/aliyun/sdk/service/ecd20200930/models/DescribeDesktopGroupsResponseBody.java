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
         * DesktopGroups.
         */
        public Builder desktopGroups(java.util.List < DesktopGroups> desktopGroups) {
            this.desktopGroups = desktopGroups;
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

        public DescribeDesktopGroupsResponseBody build() {
            return new DescribeDesktopGroupsResponseBody(this);
        } 

    } 

    public static class DesktopGroups extends TeaModel {
        @NameInMap("BindAmount")
        private Long bindAmount;

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
            this.ownBundleId = builder.ownBundleId;
            this.ownBundleName = builder.ownBundleName;
            this.ownType = builder.ownType;
            this.payType = builder.payType;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupName = builder.policyGroupName;
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
            private String ownBundleId; 
            private String ownBundleName; 
            private Long ownType; 
            private String payType; 
            private String policyGroupId; 
            private String policyGroupName; 
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
             * BindAmount.
             */
            public Builder bindAmount(Long bindAmount) {
                this.bindAmount = bindAmount;
                return this;
            }

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * ConnectDuration.
             */
            public Builder connectDuration(Long connectDuration) {
                this.connectDuration = connectDuration;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DataDiskCategory.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * DesktopGroupId.
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * DesktopGroupName.
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            /**
             * EndUserCount.
             */
            public Builder endUserCount(Integer endUserCount) {
                this.endUserCount = endUserCount;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * GpuCount.
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * GpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * IdleDisconnectDuration.
             */
            public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
                this.idleDisconnectDuration = idleDisconnectDuration;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * KeepDuration.
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * LoadPolicy.
             */
            public Builder loadPolicy(Long loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * MaxDesktopsCount.
             */
            public Builder maxDesktopsCount(Integer maxDesktopsCount) {
                this.maxDesktopsCount = maxDesktopsCount;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * MinDesktopsCount.
             */
            public Builder minDesktopsCount(Integer minDesktopsCount) {
                this.minDesktopsCount = minDesktopsCount;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * OfficeSiteName.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * OfficeSiteType.
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * OwnBundleId.
             */
            public Builder ownBundleId(String ownBundleId) {
                this.ownBundleId = ownBundleId;
                return this;
            }

            /**
             * OwnBundleName.
             */
            public Builder ownBundleName(String ownBundleName) {
                this.ownBundleName = ownBundleName;
                return this;
            }

            /**
             * OwnType.
             */
            public Builder ownType(Long ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * PolicyGroupId.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * PolicyGroupName.
             */
            public Builder policyGroupName(String policyGroupName) {
                this.policyGroupName = policyGroupName;
                return this;
            }

            /**
             * RatioThreshold.
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * ResetType.
             */
            public Builder resetType(Long resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StopDuration.
             */
            public Builder stopDuration(Long stopDuration) {
                this.stopDuration = stopDuration;
                return this;
            }

            /**
             * SystemDiskCategory.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * VolumeEncryptionEnabled.
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * VolumeEncryptionKey.
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
