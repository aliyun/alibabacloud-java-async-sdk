// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDbfsResponseBody} extends {@link TeaModel}
 *
 * <p>GetDbfsResponseBody</p>
 */
public class GetDbfsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBFSInfo")
    private DBFSInfo DBFSInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDbfsResponseBody(Builder builder) {
        this.DBFSInfo = builder.DBFSInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDbfsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBFSInfo
     */
    public DBFSInfo getDBFSInfo() {
        return this.DBFSInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DBFSInfo DBFSInfo; 
        private String requestId; 

        /**
         * DBFSInfo.
         */
        public Builder DBFSInfo(DBFSInfo DBFSInfo) {
            this.DBFSInfo = DBFSInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDbfsResponseBody build() {
            return new GetDbfsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDbfsResponseBody} extends {@link TeaModel}
     *
     * <p>GetDbfsResponseBody</p>
     */
    public static class EbsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EbsId")
        private String ebsId;

        @com.aliyun.core.annotation.NameInMap("SizeG")
        private Integer sizeG;

        private EbsList(Builder builder) {
            this.ebsId = builder.ebsId;
            this.sizeG = builder.sizeG;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EbsList create() {
            return builder().build();
        }

        /**
         * @return ebsId
         */
        public String getEbsId() {
            return this.ebsId;
        }

        /**
         * @return sizeG
         */
        public Integer getSizeG() {
            return this.sizeG;
        }

        public static final class Builder {
            private String ebsId; 
            private Integer sizeG; 

            /**
             * EbsId.
             */
            public Builder ebsId(String ebsId) {
                this.ebsId = ebsId;
                return this;
            }

            /**
             * SizeG.
             */
            public Builder sizeG(Integer sizeG) {
                this.sizeG = sizeG;
                return this;
            }

            public EbsList build() {
                return new EbsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDbfsResponseBody} extends {@link TeaModel}
     *
     * <p>GetDbfsResponseBody</p>
     */
    public static class EcsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsId")
        private String ecsId;

        private EcsList(Builder builder) {
            this.ecsId = builder.ecsId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsList create() {
            return builder().build();
        }

        /**
         * @return ecsId
         */
        public String getEcsId() {
            return this.ecsId;
        }

        public static final class Builder {
            private String ecsId; 

            /**
             * EcsId.
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            public EcsList build() {
                return new EcsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDbfsResponseBody} extends {@link TeaModel}
     *
     * <p>GetDbfsResponseBody</p>
     */
    public static class SnapshotInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LinkId")
        private String linkId;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("SnapshotCount")
        private Integer snapshotCount;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private SnapshotInfo(Builder builder) {
            this.linkId = builder.linkId;
            this.policyId = builder.policyId;
            this.snapshotCount = builder.snapshotCount;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotInfo create() {
            return builder().build();
        }

        /**
         * @return linkId
         */
        public String getLinkId() {
            return this.linkId;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return snapshotCount
         */
        public Integer getSnapshotCount() {
            return this.snapshotCount;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String linkId; 
            private String policyId; 
            private Integer snapshotCount; 
            private Long totalSize; 

            /**
             * LinkId.
             */
            public Builder linkId(String linkId) {
                this.linkId = linkId;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * SnapshotCount.
             */
            public Builder snapshotCount(Integer snapshotCount) {
                this.snapshotCount = snapshotCount;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public SnapshotInfo build() {
                return new SnapshotInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDbfsResponseBody} extends {@link TeaModel}
     *
     * <p>GetDbfsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.id = builder.id;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private Integer id; 
            private String tagKey; 
            private String tagValue; 

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDbfsResponseBody} extends {@link TeaModel}
     *
     * <p>GetDbfsResponseBody</p>
     */
    public static class DBFSInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedFeatures")
        private String advancedFeatures;

        @com.aliyun.core.annotation.NameInMap("AttachNodeNumber")
        private Integer attachNodeNumber;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DBFSClusterId")
        private String DBFSClusterId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EbsList")
        private java.util.List < EbsList> ebsList;

        @com.aliyun.core.annotation.NameInMap("EcsList")
        private java.util.List < EcsList> ecsList;

        @com.aliyun.core.annotation.NameInMap("EnableRaid")
        private Boolean enableRaid;

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private Boolean encryption;

        @com.aliyun.core.annotation.NameInMap("FsId")
        private String fsId;

        @com.aliyun.core.annotation.NameInMap("FsName")
        private String fsName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("LastFailed")
        private String lastFailed;

        @com.aliyun.core.annotation.NameInMap("LastMountTime")
        private String lastMountTime;

        @com.aliyun.core.annotation.NameInMap("LastUmountTime")
        private String lastUmountTime;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("RaidStrip")
        private Integer raidStrip;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SizeG")
        private Integer sizeG;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SnapshotInfo")
        private SnapshotInfo snapshotInfo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UsedScene")
        private String usedScene;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBFSInfo(Builder builder) {
            this.advancedFeatures = builder.advancedFeatures;
            this.attachNodeNumber = builder.attachNodeNumber;
            this.category = builder.category;
            this.createdTime = builder.createdTime;
            this.DBFSClusterId = builder.DBFSClusterId;
            this.description = builder.description;
            this.ebsList = builder.ebsList;
            this.ecsList = builder.ecsList;
            this.enableRaid = builder.enableRaid;
            this.encryption = builder.encryption;
            this.fsId = builder.fsId;
            this.fsName = builder.fsName;
            this.instanceType = builder.instanceType;
            this.KMSKeyId = builder.KMSKeyId;
            this.lastFailed = builder.lastFailed;
            this.lastMountTime = builder.lastMountTime;
            this.lastUmountTime = builder.lastUmountTime;
            this.payType = builder.payType;
            this.performanceLevel = builder.performanceLevel;
            this.raidStrip = builder.raidStrip;
            this.regionId = builder.regionId;
            this.sizeG = builder.sizeG;
            this.snapshotId = builder.snapshotId;
            this.snapshotInfo = builder.snapshotInfo;
            this.status = builder.status;
            this.tags = builder.tags;
            this.usedScene = builder.usedScene;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBFSInfo create() {
            return builder().build();
        }

        /**
         * @return advancedFeatures
         */
        public String getAdvancedFeatures() {
            return this.advancedFeatures;
        }

        /**
         * @return attachNodeNumber
         */
        public Integer getAttachNodeNumber() {
            return this.attachNodeNumber;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return DBFSClusterId
         */
        public String getDBFSClusterId() {
            return this.DBFSClusterId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ebsList
         */
        public java.util.List < EbsList> getEbsList() {
            return this.ebsList;
        }

        /**
         * @return ecsList
         */
        public java.util.List < EcsList> getEcsList() {
            return this.ecsList;
        }

        /**
         * @return enableRaid
         */
        public Boolean getEnableRaid() {
            return this.enableRaid;
        }

        /**
         * @return encryption
         */
        public Boolean getEncryption() {
            return this.encryption;
        }

        /**
         * @return fsId
         */
        public String getFsId() {
            return this.fsId;
        }

        /**
         * @return fsName
         */
        public String getFsName() {
            return this.fsName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return lastFailed
         */
        public String getLastFailed() {
            return this.lastFailed;
        }

        /**
         * @return lastMountTime
         */
        public String getLastMountTime() {
            return this.lastMountTime;
        }

        /**
         * @return lastUmountTime
         */
        public String getLastUmountTime() {
            return this.lastUmountTime;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return raidStrip
         */
        public Integer getRaidStrip() {
            return this.raidStrip;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sizeG
         */
        public Integer getSizeG() {
            return this.sizeG;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return snapshotInfo
         */
        public SnapshotInfo getSnapshotInfo() {
            return this.snapshotInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return usedScene
         */
        public String getUsedScene() {
            return this.usedScene;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String advancedFeatures; 
            private Integer attachNodeNumber; 
            private String category; 
            private String createdTime; 
            private String DBFSClusterId; 
            private String description; 
            private java.util.List < EbsList> ebsList; 
            private java.util.List < EcsList> ecsList; 
            private Boolean enableRaid; 
            private Boolean encryption; 
            private String fsId; 
            private String fsName; 
            private String instanceType; 
            private String KMSKeyId; 
            private String lastFailed; 
            private String lastMountTime; 
            private String lastUmountTime; 
            private String payType; 
            private String performanceLevel; 
            private Integer raidStrip; 
            private String regionId; 
            private Integer sizeG; 
            private String snapshotId; 
            private SnapshotInfo snapshotInfo; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String usedScene; 
            private String zoneId; 

            /**
             * AdvancedFeatures.
             */
            public Builder advancedFeatures(String advancedFeatures) {
                this.advancedFeatures = advancedFeatures;
                return this;
            }

            /**
             * AttachNodeNumber.
             */
            public Builder attachNodeNumber(Integer attachNodeNumber) {
                this.attachNodeNumber = attachNodeNumber;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DBFSClusterId.
             */
            public Builder DBFSClusterId(String DBFSClusterId) {
                this.DBFSClusterId = DBFSClusterId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EbsList.
             */
            public Builder ebsList(java.util.List < EbsList> ebsList) {
                this.ebsList = ebsList;
                return this;
            }

            /**
             * EcsList.
             */
            public Builder ecsList(java.util.List < EcsList> ecsList) {
                this.ecsList = ecsList;
                return this;
            }

            /**
             * EnableRaid.
             */
            public Builder enableRaid(Boolean enableRaid) {
                this.enableRaid = enableRaid;
                return this;
            }

            /**
             * Encryption.
             */
            public Builder encryption(Boolean encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * FsId.
             */
            public Builder fsId(String fsId) {
                this.fsId = fsId;
                return this;
            }

            /**
             * FsName.
             */
            public Builder fsName(String fsName) {
                this.fsName = fsName;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * KMSKeyId.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * LastFailed.
             */
            public Builder lastFailed(String lastFailed) {
                this.lastFailed = lastFailed;
                return this;
            }

            /**
             * LastMountTime.
             */
            public Builder lastMountTime(String lastMountTime) {
                this.lastMountTime = lastMountTime;
                return this;
            }

            /**
             * LastUmountTime.
             */
            public Builder lastUmountTime(String lastUmountTime) {
                this.lastUmountTime = lastUmountTime;
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
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * RaidStrip.
             */
            public Builder raidStrip(Integer raidStrip) {
                this.raidStrip = raidStrip;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SizeG.
             */
            public Builder sizeG(Integer sizeG) {
                this.sizeG = sizeG;
                return this;
            }

            /**
             * SnapshotId.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * SnapshotInfo.
             */
            public Builder snapshotInfo(SnapshotInfo snapshotInfo) {
                this.snapshotInfo = snapshotInfo;
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
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UsedScene.
             */
            public Builder usedScene(String usedScene) {
                this.usedScene = usedScene;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBFSInfo build() {
                return new DBFSInfo(this);
            } 

        } 

    }
}
