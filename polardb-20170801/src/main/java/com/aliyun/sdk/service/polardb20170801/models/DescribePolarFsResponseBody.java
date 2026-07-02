// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarFsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarFsResponseBody</p>
 */
public class DescribePolarFsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribePolarFsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarFsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribePolarFsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8CD1852F-8176-55E4-891C-4478DC00CC7A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribePolarFsResponseBody build() {
            return new DescribePolarFsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarFsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsResponseBody</p>
     */
    public static class MountInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolarDbProxy")
        private String polarDbProxy;

        @com.aliyun.core.annotation.NameInMap("PolarFsCluster")
        private String polarFsCluster;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        private MountInfo(Builder builder) {
            this.polarDbProxy = builder.polarDbProxy;
            this.polarFsCluster = builder.polarFsCluster;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountInfo create() {
            return builder().build();
        }

        /**
         * @return polarDbProxy
         */
        public String getPolarDbProxy() {
            return this.polarDbProxy;
        }

        /**
         * @return polarFsCluster
         */
        public String getPolarFsCluster() {
            return this.polarFsCluster;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private String polarDbProxy; 
            private String polarFsCluster; 
            private String token; 

            private Builder() {
            } 

            private Builder(MountInfo model) {
                this.polarDbProxy = model.polarDbProxy;
                this.polarFsCluster = model.polarFsCluster;
                this.token = model.token;
            } 

            /**
             * PolarDbProxy.
             */
            public Builder polarDbProxy(String polarDbProxy) {
                this.polarDbProxy = polarDbProxy;
                return this;
            }

            /**
             * PolarFsCluster.
             */
            public Builder polarFsCluster(String polarFsCluster) {
                this.polarFsCluster = polarFsCluster;
                return this;
            }

            /**
             * <p>token</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public MountInfo build() {
                return new MountInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarFsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsResponseBody</p>
     */
    public static class MountedAIDBClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("MountDir")
        private String mountDir;

        @com.aliyun.core.annotation.NameInMap("MountStatus")
        private String mountStatus;

        @com.aliyun.core.annotation.NameInMap("MountedTime")
        private String mountedTime;

        private MountedAIDBClusters(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.mountDir = builder.mountDir;
            this.mountStatus = builder.mountStatus;
            this.mountedTime = builder.mountedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountedAIDBClusters create() {
            return builder().build();
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return mountDir
         */
        public String getMountDir() {
            return this.mountDir;
        }

        /**
         * @return mountStatus
         */
        public String getMountStatus() {
            return this.mountStatus;
        }

        /**
         * @return mountedTime
         */
        public String getMountedTime() {
            return this.mountedTime;
        }

        public static final class Builder {
            private String DBClusterId; 
            private String mountDir; 
            private String mountStatus; 
            private String mountedTime; 

            private Builder() {
            } 

            private Builder(MountedAIDBClusters model) {
                this.DBClusterId = model.DBClusterId;
                this.mountDir = model.mountDir;
                this.mountStatus = model.mountStatus;
                this.mountedTime = model.mountedTime;
            } 

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * MountDir.
             */
            public Builder mountDir(String mountDir) {
                this.mountDir = mountDir;
                return this;
            }

            /**
             * MountStatus.
             */
            public Builder mountStatus(String mountStatus) {
                this.mountStatus = mountStatus;
                return this;
            }

            /**
             * MountedTime.
             */
            public Builder mountedTime(String mountedTime) {
                this.mountedTime = mountedTime;
                return this;
            }

            public MountedAIDBClusters build() {
                return new MountedAIDBClusters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarFsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsResponseBody</p>
     */
    public static class PolarFsPathsMountedAIDBClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountedAIDBClusters")
        private java.util.List<MountedAIDBClusters> mountedAIDBClusters;

        private PolarFsPathsMountedAIDBClusters(Builder builder) {
            this.mountedAIDBClusters = builder.mountedAIDBClusters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolarFsPathsMountedAIDBClusters create() {
            return builder().build();
        }

        /**
         * @return mountedAIDBClusters
         */
        public java.util.List<MountedAIDBClusters> getMountedAIDBClusters() {
            return this.mountedAIDBClusters;
        }

        public static final class Builder {
            private java.util.List<MountedAIDBClusters> mountedAIDBClusters; 

            private Builder() {
            } 

            private Builder(PolarFsPathsMountedAIDBClusters model) {
                this.mountedAIDBClusters = model.mountedAIDBClusters;
            } 

            /**
             * MountedAIDBClusters.
             */
            public Builder mountedAIDBClusters(java.util.List<MountedAIDBClusters> mountedAIDBClusters) {
                this.mountedAIDBClusters = mountedAIDBClusters;
                return this;
            }

            public PolarFsPathsMountedAIDBClusters build() {
                return new PolarFsPathsMountedAIDBClusters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarFsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsResponseBody</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link DescribePolarFsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarFsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsResponseBody</p>
     */
    public static class PolarFsPaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerateType")
        private String accelerateType;

        @com.aliyun.core.annotation.NameInMap("AcceleratedStorageSpace")
        private String acceleratedStorageSpace;

        @com.aliyun.core.annotation.NameInMap("AcceleratingEnable")
        private String acceleratingEnable;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private String expired;

        @com.aliyun.core.annotation.NameInMap("MountInfo")
        private MountInfo mountInfo;

        @com.aliyun.core.annotation.NameInMap("MountedAIDBClusters")
        private PolarFsPathsMountedAIDBClusters mountedAIDBClusters;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("PolarFsInstanceDescription")
        private String polarFsInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
        private String polarFsInstanceId;

        @com.aliyun.core.annotation.NameInMap("PolarFsPath")
        private String polarFsPath;

        @com.aliyun.core.annotation.NameInMap("PolarFsStatus")
        private String polarFsStatus;

        @com.aliyun.core.annotation.NameInMap("PolarFsType")
        private String polarFsType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RelativeDbClusterId")
        private String relativeDbClusterId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("StorageSpace")
        private Long storageSpace;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private PolarFsPaths(Builder builder) {
            this.accelerateType = builder.accelerateType;
            this.acceleratedStorageSpace = builder.acceleratedStorageSpace;
            this.acceleratingEnable = builder.acceleratingEnable;
            this.bandwidth = builder.bandwidth;
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.mountInfo = builder.mountInfo;
            this.mountedAIDBClusters = builder.mountedAIDBClusters;
            this.payType = builder.payType;
            this.polarFsInstanceDescription = builder.polarFsInstanceDescription;
            this.polarFsInstanceId = builder.polarFsInstanceId;
            this.polarFsPath = builder.polarFsPath;
            this.polarFsStatus = builder.polarFsStatus;
            this.polarFsType = builder.polarFsType;
            this.regionId = builder.regionId;
            this.relativeDbClusterId = builder.relativeDbClusterId;
            this.securityGroupId = builder.securityGroupId;
            this.storageSpace = builder.storageSpace;
            this.storageType = builder.storageType;
            this.tags = builder.tags;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolarFsPaths create() {
            return builder().build();
        }

        /**
         * @return accelerateType
         */
        public String getAccelerateType() {
            return this.accelerateType;
        }

        /**
         * @return acceleratedStorageSpace
         */
        public String getAcceleratedStorageSpace() {
            return this.acceleratedStorageSpace;
        }

        /**
         * @return acceleratingEnable
         */
        public String getAcceleratingEnable() {
            return this.acceleratingEnable;
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expired
         */
        public String getExpired() {
            return this.expired;
        }

        /**
         * @return mountInfo
         */
        public MountInfo getMountInfo() {
            return this.mountInfo;
        }

        /**
         * @return mountedAIDBClusters
         */
        public PolarFsPathsMountedAIDBClusters getMountedAIDBClusters() {
            return this.mountedAIDBClusters;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return polarFsInstanceDescription
         */
        public String getPolarFsInstanceDescription() {
            return this.polarFsInstanceDescription;
        }

        /**
         * @return polarFsInstanceId
         */
        public String getPolarFsInstanceId() {
            return this.polarFsInstanceId;
        }

        /**
         * @return polarFsPath
         */
        public String getPolarFsPath() {
            return this.polarFsPath;
        }

        /**
         * @return polarFsStatus
         */
        public String getPolarFsStatus() {
            return this.polarFsStatus;
        }

        /**
         * @return polarFsType
         */
        public String getPolarFsType() {
            return this.polarFsType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return relativeDbClusterId
         */
        public String getRelativeDbClusterId() {
            return this.relativeDbClusterId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return storageSpace
         */
        public Long getStorageSpace() {
            return this.storageSpace;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accelerateType; 
            private String acceleratedStorageSpace; 
            private String acceleratingEnable; 
            private Long bandwidth; 
            private String category; 
            private String createTime; 
            private String expireTime; 
            private String expired; 
            private MountInfo mountInfo; 
            private PolarFsPathsMountedAIDBClusters mountedAIDBClusters; 
            private String payType; 
            private String polarFsInstanceDescription; 
            private String polarFsInstanceId; 
            private String polarFsPath; 
            private String polarFsStatus; 
            private String polarFsType; 
            private String regionId; 
            private String relativeDbClusterId; 
            private String securityGroupId; 
            private Long storageSpace; 
            private String storageType; 
            private Tags tags; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(PolarFsPaths model) {
                this.accelerateType = model.accelerateType;
                this.acceleratedStorageSpace = model.acceleratedStorageSpace;
                this.acceleratingEnable = model.acceleratingEnable;
                this.bandwidth = model.bandwidth;
                this.category = model.category;
                this.createTime = model.createTime;
                this.expireTime = model.expireTime;
                this.expired = model.expired;
                this.mountInfo = model.mountInfo;
                this.mountedAIDBClusters = model.mountedAIDBClusters;
                this.payType = model.payType;
                this.polarFsInstanceDescription = model.polarFsInstanceDescription;
                this.polarFsInstanceId = model.polarFsInstanceId;
                this.polarFsPath = model.polarFsPath;
                this.polarFsStatus = model.polarFsStatus;
                this.polarFsType = model.polarFsType;
                this.regionId = model.regionId;
                this.relativeDbClusterId = model.relativeDbClusterId;
                this.securityGroupId = model.securityGroupId;
                this.storageSpace = model.storageSpace;
                this.storageType = model.storageType;
                this.tags = model.tags;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AccelerateType.
             */
            public Builder accelerateType(String accelerateType) {
                this.accelerateType = accelerateType;
                return this;
            }

            /**
             * AcceleratedStorageSpace.
             */
            public Builder acceleratedStorageSpace(String acceleratedStorageSpace) {
                this.acceleratedStorageSpace = acceleratedStorageSpace;
                return this;
            }

            /**
             * AcceleratingEnable.
             */
            public Builder acceleratingEnable(String acceleratingEnable) {
                this.acceleratingEnable = acceleratingEnable;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Expired.
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * MountInfo.
             */
            public Builder mountInfo(MountInfo mountInfo) {
                this.mountInfo = mountInfo;
                return this;
            }

            /**
             * MountedAIDBClusters.
             */
            public Builder mountedAIDBClusters(PolarFsPathsMountedAIDBClusters mountedAIDBClusters) {
                this.mountedAIDBClusters = mountedAIDBClusters;
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
             * PolarFsInstanceDescription.
             */
            public Builder polarFsInstanceDescription(String polarFsInstanceDescription) {
                this.polarFsInstanceDescription = polarFsInstanceDescription;
                return this;
            }

            /**
             * PolarFsInstanceId.
             */
            public Builder polarFsInstanceId(String polarFsInstanceId) {
                this.polarFsInstanceId = polarFsInstanceId;
                return this;
            }

            /**
             * PolarFsPath.
             */
            public Builder polarFsPath(String polarFsPath) {
                this.polarFsPath = polarFsPath;
                return this;
            }

            /**
             * PolarFsStatus.
             */
            public Builder polarFsStatus(String polarFsStatus) {
                this.polarFsStatus = polarFsStatus;
                return this;
            }

            /**
             * PolarFsType.
             */
            public Builder polarFsType(String polarFsType) {
                this.polarFsType = polarFsType;
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
             * RelativeDbClusterId.
             */
            public Builder relativeDbClusterId(String relativeDbClusterId) {
                this.relativeDbClusterId = relativeDbClusterId;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * StorageSpace.
             */
            public Builder storageSpace(Long storageSpace) {
                this.storageSpace = storageSpace;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf653ibw32whvnplrnzz4</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public PolarFsPaths build() {
                return new PolarFsPaths(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarFsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolarFsPaths")
        private java.util.List<PolarFsPaths> polarFsPaths;

        private Items(Builder builder) {
            this.polarFsPaths = builder.polarFsPaths;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return polarFsPaths
         */
        public java.util.List<PolarFsPaths> getPolarFsPaths() {
            return this.polarFsPaths;
        }

        public static final class Builder {
            private java.util.List<PolarFsPaths> polarFsPaths; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.polarFsPaths = model.polarFsPaths;
            } 

            /**
             * PolarFsPaths.
             */
            public Builder polarFsPaths(java.util.List<PolarFsPaths> polarFsPaths) {
                this.polarFsPaths = polarFsPaths;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
