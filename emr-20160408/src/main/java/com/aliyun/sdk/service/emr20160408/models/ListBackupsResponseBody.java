// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBackupsResponseBody</p>
 */
public class ListBackupsResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListBackupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBackupsResponseBody create() {
        return builder().build();
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
        private Items items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

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

        public ListBackupsResponseBody build() {
            return new ListBackupsResponseBody(this);
        } 

    } 

    public static class MetadataInfo extends TeaModel {
        @NameInMap("MetadataType")
        private String metadataType;

        @NameInMap("Properties")
        private String properties;

        private MetadataInfo(Builder builder) {
            this.metadataType = builder.metadataType;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetadataInfo create() {
            return builder().build();
        }

        /**
         * @return metadataType
         */
        public String getMetadataType() {
            return this.metadataType;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String metadataType; 
            private String properties; 

            /**
             * MetadataType.
             */
            public Builder metadataType(String metadataType) {
                this.metadataType = metadataType;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            public MetadataInfo build() {
                return new MetadataInfo(this);
            } 

        } 

    }
    public static class Item extends TeaModel {
        @NameInMap("BackupPlanId")
        private String backupPlanId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("MetadataInfo")
        private MetadataInfo metadataInfo;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorePath")
        private String storePath;

        @NameInMap("TarFileName")
        private String tarFileName;

        private Item(Builder builder) {
            this.backupPlanId = builder.backupPlanId;
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.md5 = builder.md5;
            this.metadataInfo = builder.metadataInfo;
            this.status = builder.status;
            this.storePath = builder.storePath;
            this.tarFileName = builder.tarFileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return backupPlanId
         */
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return metadataInfo
         */
        public MetadataInfo getMetadataInfo() {
            return this.metadataInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storePath
         */
        public String getStorePath() {
            return this.storePath;
        }

        /**
         * @return tarFileName
         */
        public String getTarFileName() {
            return this.tarFileName;
        }

        public static final class Builder {
            private String backupPlanId; 
            private String clusterId; 
            private Long createTime; 
            private String id; 
            private String md5; 
            private MetadataInfo metadataInfo; 
            private String status; 
            private String storePath; 
            private String tarFileName; 

            /**
             * BackupPlanId.
             */
            public Builder backupPlanId(String backupPlanId) {
                this.backupPlanId = backupPlanId;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * MetadataInfo.
             */
            public Builder metadataInfo(MetadataInfo metadataInfo) {
                this.metadataInfo = metadataInfo;
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
             * StorePath.
             */
            public Builder storePath(String storePath) {
                this.storePath = storePath;
                return this;
            }

            /**
             * TarFileName.
             */
            public Builder tarFileName(String tarFileName) {
                this.tarFileName = tarFileName;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

        private Items(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
