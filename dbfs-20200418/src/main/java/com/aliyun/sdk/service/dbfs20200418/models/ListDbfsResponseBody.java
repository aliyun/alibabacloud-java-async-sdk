// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDbfsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDbfsResponseBody</p>
 */
public class ListDbfsResponseBody extends TeaModel {
    @NameInMap("DBFSInfo")
    private java.util.List < DBFSInfo> DBFSInfo;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDbfsResponseBody(Builder builder) {
        this.DBFSInfo = builder.DBFSInfo;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDbfsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBFSInfo
     */
    public java.util.List < DBFSInfo> getDBFSInfo() {
        return this.DBFSInfo;
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
        private java.util.List < DBFSInfo> DBFSInfo; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DBFSInfo.
         */
        public Builder DBFSInfo(java.util.List < DBFSInfo> DBFSInfo) {
            this.DBFSInfo = DBFSInfo;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDbfsResponseBody build() {
            return new ListDbfsResponseBody(this);
        } 

    } 

    public static class EbsList extends TeaModel {
        @NameInMap("EbsId")
        private String ebsId;

        @NameInMap("SizeG")
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
    public static class EcsList extends TeaModel {
        @NameInMap("EcsId")
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
    public static class SnapshotInfo extends TeaModel {
        @NameInMap("LinkId")
        private String linkId;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("SnapshotCount")
        private Integer snapshotCount;

        @NameInMap("TotalSize")
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
    public static class Tags extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
        public Long getId() {
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
            private Long id; 
            private String tagKey; 
            private String tagValue; 

            /**
             * Id.
             */
            public Builder id(Long id) {
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
    public static class DBFSInfo extends TeaModel {
        @NameInMap("AttachNodeNumber")
        private Integer attachNodeNumber;

        @NameInMap("Category")
        private String category;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DBFSClusterId")
        private String DBFSClusterId;

        @NameInMap("EbsList")
        private java.util.List < EbsList> ebsList;

        @NameInMap("EcsList")
        private java.util.List < EcsList> ecsList;

        @NameInMap("EnableRaid")
        private Boolean enableRaid;

        @NameInMap("Encryption")
        private Boolean encryption;

        @NameInMap("FsId")
        private String fsId;

        @NameInMap("FsName")
        private String fsName;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("LastFailed")
        private String lastFailed;

        @NameInMap("LastMountTime")
        private String lastMountTime;

        @NameInMap("LastUmountTime")
        private String lastUmountTime;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("RaidStrip")
        private Integer raidStrip;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SizeG")
        private Integer sizeG;

        @NameInMap("SnapshotInfo")
        private SnapshotInfo snapshotInfo;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("UsedScene")
        private String usedScene;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBFSInfo(Builder builder) {
            this.attachNodeNumber = builder.attachNodeNumber;
            this.category = builder.category;
            this.createdTime = builder.createdTime;
            this.DBFSClusterId = builder.DBFSClusterId;
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
            private Integer attachNodeNumber; 
            private String category; 
            private String createdTime; 
            private String DBFSClusterId; 
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
            private SnapshotInfo snapshotInfo; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String usedScene; 
            private String zoneId; 

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
