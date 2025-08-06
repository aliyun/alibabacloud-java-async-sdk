// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetStorageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageInfoResponseBody</p>
 */
public class GetStorageInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainInfoList")
    private DomainInfoList domainInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Storage")
    private Storage storage;

    @com.aliyun.core.annotation.NameInMap("StorageACL")
    private String storageACL;

    private GetStorageInfoResponseBody(Builder builder) {
        this.domainInfoList = builder.domainInfoList;
        this.requestId = builder.requestId;
        this.storage = builder.storage;
        this.storageACL = builder.storageACL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainInfoList
     */
    public DomainInfoList getDomainInfoList() {
        return this.domainInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storage
     */
    public Storage getStorage() {
        return this.storage;
    }

    /**
     * @return storageACL
     */
    public String getStorageACL() {
        return this.storageACL;
    }

    public static final class Builder {
        private DomainInfoList domainInfoList; 
        private String requestId; 
        private Storage storage; 
        private String storageACL; 

        private Builder() {
        } 

        private Builder(GetStorageInfoResponseBody model) {
            this.domainInfoList = model.domainInfoList;
            this.requestId = model.requestId;
            this.storage = model.storage;
            this.storageACL = model.storageACL;
        } 

        /**
         * DomainInfoList.
         */
        public Builder domainInfoList(DomainInfoList domainInfoList) {
            this.domainInfoList = domainInfoList;
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
         * Storage.
         */
        public Builder storage(Storage storage) {
            this.storage = storage;
            return this;
        }

        /**
         * StorageACL.
         */
        public Builder storageACL(String storageACL) {
            this.storageACL = storageACL;
            return this;
        }

        public GetStorageInfoResponseBody build() {
            return new GetStorageInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStorageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageInfoResponseBody</p>
     */
    public static class DomainInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultPlay")
        private Boolean defaultPlay;

        @com.aliyun.core.annotation.NameInMap("DomainCname")
        private String domainCname;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        private DomainInfo(Builder builder) {
            this.defaultPlay = builder.defaultPlay;
            this.domainCname = builder.domainCname;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfo create() {
            return builder().build();
        }

        /**
         * @return defaultPlay
         */
        public Boolean getDefaultPlay() {
            return this.defaultPlay;
        }

        /**
         * @return domainCname
         */
        public String getDomainCname() {
            return this.domainCname;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainStatus
         */
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public static final class Builder {
            private Boolean defaultPlay; 
            private String domainCname; 
            private String domainName; 
            private String domainStatus; 

            private Builder() {
            } 

            private Builder(DomainInfo model) {
                this.defaultPlay = model.defaultPlay;
                this.domainCname = model.domainCname;
                this.domainName = model.domainName;
                this.domainStatus = model.domainStatus;
            } 

            /**
             * DefaultPlay.
             */
            public Builder defaultPlay(Boolean defaultPlay) {
                this.defaultPlay = defaultPlay;
                return this;
            }

            /**
             * DomainCname.
             */
            public Builder domainCname(String domainCname) {
                this.domainCname = domainCname;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainStatus.
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            public DomainInfo build() {
                return new DomainInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStorageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageInfoResponseBody</p>
     */
    public static class DomainInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainInfo")
        private java.util.List<DomainInfo> domainInfo;

        private DomainInfoList(Builder builder) {
            this.domainInfo = builder.domainInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfoList create() {
            return builder().build();
        }

        /**
         * @return domainInfo
         */
        public java.util.List<DomainInfo> getDomainInfo() {
            return this.domainInfo;
        }

        public static final class Builder {
            private java.util.List<DomainInfo> domainInfo; 

            private Builder() {
            } 

            private Builder(DomainInfoList model) {
                this.domainInfo = model.domainInfo;
            } 

            /**
             * DomainInfo.
             */
            public Builder domainInfo(java.util.List<DomainInfo> domainInfo) {
                this.domainInfo = domainInfo;
                return this;
            }

            public DomainInfoList build() {
                return new DomainInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStorageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageInfoResponseBody</p>
     */
    public static class Storage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultUpload")
        private Boolean defaultUpload;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StorageUsage")
        private Integer storageUsage;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Storage(Builder builder) {
            this.defaultUpload = builder.defaultUpload;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupId = builder.groupId;
            this.location = builder.location;
            this.region = builder.region;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.storageUsage = builder.storageUsage;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return defaultUpload
         */
        public Boolean getDefaultUpload() {
            return this.defaultUpload;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return storageUsage
         */
        public Integer getStorageUsage() {
            return this.storageUsage;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean defaultUpload; 
            private String gmtCreate; 
            private String gmtModified; 
            private String groupId; 
            private String location; 
            private String region; 
            private String resourceGroupId; 
            private Integer status; 
            private Integer storageUsage; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Storage model) {
                this.defaultUpload = model.defaultUpload;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.groupId = model.groupId;
                this.location = model.location;
                this.region = model.region;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.storageUsage = model.storageUsage;
                this.type = model.type;
            } 

            /**
             * DefaultUpload.
             */
            public Builder defaultUpload(Boolean defaultUpload) {
                this.defaultUpload = defaultUpload;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * StorageUsage.
             */
            public Builder storageUsage(Integer storageUsage) {
                this.storageUsage = storageUsage;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
}
