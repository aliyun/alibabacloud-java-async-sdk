// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetLindormFsUsedDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormFsUsedDetailResponseBody</p>
 */
public class GetLindormFsUsedDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("FsCapacity")
    private String fsCapacity;

    @com.aliyun.core.annotation.NameInMap("FsCapacityCold")
    private String fsCapacityCold;

    @com.aliyun.core.annotation.NameInMap("FsCapacityHot")
    private String fsCapacityHot;

    @com.aliyun.core.annotation.NameInMap("FsUsedCold")
    private String fsUsedCold;

    @com.aliyun.core.annotation.NameInMap("FsUsedColdOnLindormSearch")
    private String fsUsedColdOnLindormSearch;

    @com.aliyun.core.annotation.NameInMap("FsUsedColdOnLindormTSDB")
    private String fsUsedColdOnLindormTSDB;

    @com.aliyun.core.annotation.NameInMap("FsUsedColdOnLindormTable")
    private String fsUsedColdOnLindormTable;

    @com.aliyun.core.annotation.NameInMap("FsUsedHot")
    private String fsUsedHot;

    @com.aliyun.core.annotation.NameInMap("FsUsedHotOnLindormSearch")
    private String fsUsedHotOnLindormSearch;

    @com.aliyun.core.annotation.NameInMap("FsUsedHotOnLindormTSDB")
    private String fsUsedHotOnLindormTSDB;

    @com.aliyun.core.annotation.NameInMap("FsUsedHotOnLindormTable")
    private String fsUsedHotOnLindormTable;

    @com.aliyun.core.annotation.NameInMap("FsUsedOnLindormSearch")
    private String fsUsedOnLindormSearch;

    @com.aliyun.core.annotation.NameInMap("FsUsedOnLindormTSDB")
    private String fsUsedOnLindormTSDB;

    @com.aliyun.core.annotation.NameInMap("FsUsedOnLindormTable")
    private String fsUsedOnLindormTable;

    @com.aliyun.core.annotation.NameInMap("FsUsedOnLindormTableData")
    private String fsUsedOnLindormTableData;

    @com.aliyun.core.annotation.NameInMap("FsUsedOnLindormTableWAL")
    private String fsUsedOnLindormTableWAL;

    @com.aliyun.core.annotation.NameInMap("LStorageUsageList")
    private java.util.List<LStorageUsageList> lStorageUsageList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Valid")
    private String valid;

    private GetLindormFsUsedDetailResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.fsCapacity = builder.fsCapacity;
        this.fsCapacityCold = builder.fsCapacityCold;
        this.fsCapacityHot = builder.fsCapacityHot;
        this.fsUsedCold = builder.fsUsedCold;
        this.fsUsedColdOnLindormSearch = builder.fsUsedColdOnLindormSearch;
        this.fsUsedColdOnLindormTSDB = builder.fsUsedColdOnLindormTSDB;
        this.fsUsedColdOnLindormTable = builder.fsUsedColdOnLindormTable;
        this.fsUsedHot = builder.fsUsedHot;
        this.fsUsedHotOnLindormSearch = builder.fsUsedHotOnLindormSearch;
        this.fsUsedHotOnLindormTSDB = builder.fsUsedHotOnLindormTSDB;
        this.fsUsedHotOnLindormTable = builder.fsUsedHotOnLindormTable;
        this.fsUsedOnLindormSearch = builder.fsUsedOnLindormSearch;
        this.fsUsedOnLindormTSDB = builder.fsUsedOnLindormTSDB;
        this.fsUsedOnLindormTable = builder.fsUsedOnLindormTable;
        this.fsUsedOnLindormTableData = builder.fsUsedOnLindormTableData;
        this.fsUsedOnLindormTableWAL = builder.fsUsedOnLindormTableWAL;
        this.lStorageUsageList = builder.lStorageUsageList;
        this.requestId = builder.requestId;
        this.valid = builder.valid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLindormFsUsedDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return fsCapacity
     */
    public String getFsCapacity() {
        return this.fsCapacity;
    }

    /**
     * @return fsCapacityCold
     */
    public String getFsCapacityCold() {
        return this.fsCapacityCold;
    }

    /**
     * @return fsCapacityHot
     */
    public String getFsCapacityHot() {
        return this.fsCapacityHot;
    }

    /**
     * @return fsUsedCold
     */
    public String getFsUsedCold() {
        return this.fsUsedCold;
    }

    /**
     * @return fsUsedColdOnLindormSearch
     */
    public String getFsUsedColdOnLindormSearch() {
        return this.fsUsedColdOnLindormSearch;
    }

    /**
     * @return fsUsedColdOnLindormTSDB
     */
    public String getFsUsedColdOnLindormTSDB() {
        return this.fsUsedColdOnLindormTSDB;
    }

    /**
     * @return fsUsedColdOnLindormTable
     */
    public String getFsUsedColdOnLindormTable() {
        return this.fsUsedColdOnLindormTable;
    }

    /**
     * @return fsUsedHot
     */
    public String getFsUsedHot() {
        return this.fsUsedHot;
    }

    /**
     * @return fsUsedHotOnLindormSearch
     */
    public String getFsUsedHotOnLindormSearch() {
        return this.fsUsedHotOnLindormSearch;
    }

    /**
     * @return fsUsedHotOnLindormTSDB
     */
    public String getFsUsedHotOnLindormTSDB() {
        return this.fsUsedHotOnLindormTSDB;
    }

    /**
     * @return fsUsedHotOnLindormTable
     */
    public String getFsUsedHotOnLindormTable() {
        return this.fsUsedHotOnLindormTable;
    }

    /**
     * @return fsUsedOnLindormSearch
     */
    public String getFsUsedOnLindormSearch() {
        return this.fsUsedOnLindormSearch;
    }

    /**
     * @return fsUsedOnLindormTSDB
     */
    public String getFsUsedOnLindormTSDB() {
        return this.fsUsedOnLindormTSDB;
    }

    /**
     * @return fsUsedOnLindormTable
     */
    public String getFsUsedOnLindormTable() {
        return this.fsUsedOnLindormTable;
    }

    /**
     * @return fsUsedOnLindormTableData
     */
    public String getFsUsedOnLindormTableData() {
        return this.fsUsedOnLindormTableData;
    }

    /**
     * @return fsUsedOnLindormTableWAL
     */
    public String getFsUsedOnLindormTableWAL() {
        return this.fsUsedOnLindormTableWAL;
    }

    /**
     * @return lStorageUsageList
     */
    public java.util.List<LStorageUsageList> getLStorageUsageList() {
        return this.lStorageUsageList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return valid
     */
    public String getValid() {
        return this.valid;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String fsCapacity; 
        private String fsCapacityCold; 
        private String fsCapacityHot; 
        private String fsUsedCold; 
        private String fsUsedColdOnLindormSearch; 
        private String fsUsedColdOnLindormTSDB; 
        private String fsUsedColdOnLindormTable; 
        private String fsUsedHot; 
        private String fsUsedHotOnLindormSearch; 
        private String fsUsedHotOnLindormTSDB; 
        private String fsUsedHotOnLindormTable; 
        private String fsUsedOnLindormSearch; 
        private String fsUsedOnLindormTSDB; 
        private String fsUsedOnLindormTable; 
        private String fsUsedOnLindormTableData; 
        private String fsUsedOnLindormTableWAL; 
        private java.util.List<LStorageUsageList> lStorageUsageList; 
        private String requestId; 
        private String valid; 

        private Builder() {
        } 

        private Builder(GetLindormFsUsedDetailResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.fsCapacity = model.fsCapacity;
            this.fsCapacityCold = model.fsCapacityCold;
            this.fsCapacityHot = model.fsCapacityHot;
            this.fsUsedCold = model.fsUsedCold;
            this.fsUsedColdOnLindormSearch = model.fsUsedColdOnLindormSearch;
            this.fsUsedColdOnLindormTSDB = model.fsUsedColdOnLindormTSDB;
            this.fsUsedColdOnLindormTable = model.fsUsedColdOnLindormTable;
            this.fsUsedHot = model.fsUsedHot;
            this.fsUsedHotOnLindormSearch = model.fsUsedHotOnLindormSearch;
            this.fsUsedHotOnLindormTSDB = model.fsUsedHotOnLindormTSDB;
            this.fsUsedHotOnLindormTable = model.fsUsedHotOnLindormTable;
            this.fsUsedOnLindormSearch = model.fsUsedOnLindormSearch;
            this.fsUsedOnLindormTSDB = model.fsUsedOnLindormTSDB;
            this.fsUsedOnLindormTable = model.fsUsedOnLindormTable;
            this.fsUsedOnLindormTableData = model.fsUsedOnLindormTableData;
            this.fsUsedOnLindormTableWAL = model.fsUsedOnLindormTableWAL;
            this.lStorageUsageList = model.lStorageUsageList;
            this.requestId = model.requestId;
            this.valid = model.valid;
        } 

        /**
         * <p>The detailed reason why the access was denied.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The total storage space of the cluster. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>85899345920</p>
         */
        public Builder fsCapacity(String fsCapacity) {
            this.fsCapacity = fsCapacity;
            return this;
        }

        /**
         * <p>The cold storage space of the cluster. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>85899345920</p>
         */
        public Builder fsCapacityCold(String fsCapacityCold) {
            this.fsCapacityCold = fsCapacityCold;
            return this;
        }

        /**
         * <p>The hot storage space of the cluster. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>85899345920</p>
         */
        public Builder fsCapacityHot(String fsCapacityHot) {
            this.fsCapacityHot = fsCapacityHot;
            return this;
        }

        /**
         * <p>The cold storage usage of the cluster. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedCold(String fsUsedCold) {
            this.fsUsedCold = fsUsedCold;
            return this;
        }

        /**
         * <p>The cold storage usage of the table data of the search engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedColdOnLindormSearch(String fsUsedColdOnLindormSearch) {
            this.fsUsedColdOnLindormSearch = fsUsedColdOnLindormSearch;
            return this;
        }

        /**
         * <p>The cold storage usage of the table data of the time series engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedColdOnLindormTSDB(String fsUsedColdOnLindormTSDB) {
            this.fsUsedColdOnLindormTSDB = fsUsedColdOnLindormTSDB;
            return this;
        }

        /**
         * <p>The cold storage usage of the table data of the wide table engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedColdOnLindormTable(String fsUsedColdOnLindormTable) {
            this.fsUsedColdOnLindormTable = fsUsedColdOnLindormTable;
            return this;
        }

        /**
         * <p>The hot storage usage of the cluster. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedHot(String fsUsedHot) {
            this.fsUsedHot = fsUsedHot;
            return this;
        }

        /**
         * <p>The hot storage usage of the table data of the search engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedHotOnLindormSearch(String fsUsedHotOnLindormSearch) {
            this.fsUsedHotOnLindormSearch = fsUsedHotOnLindormSearch;
            return this;
        }

        /**
         * <p>The hot storage usage of the table data of the time series engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedHotOnLindormTSDB(String fsUsedHotOnLindormTSDB) {
            this.fsUsedHotOnLindormTSDB = fsUsedHotOnLindormTSDB;
            return this;
        }

        /**
         * <p>The hot storage usage of the table data of the wide table engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedHotOnLindormTable(String fsUsedHotOnLindormTable) {
            this.fsUsedHotOnLindormTable = fsUsedHotOnLindormTable;
            return this;
        }

        /**
         * <p>The storage usage of the search engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedOnLindormSearch(String fsUsedOnLindormSearch) {
            this.fsUsedOnLindormSearch = fsUsedOnLindormSearch;
            return this;
        }

        /**
         * <p>The storage usage of the time series engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedOnLindormTSDB(String fsUsedOnLindormTSDB) {
            this.fsUsedOnLindormTSDB = fsUsedOnLindormTSDB;
            return this;
        }

        /**
         * <p>The space usage of the wide table engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedOnLindormTable(String fsUsedOnLindormTable) {
            this.fsUsedOnLindormTable = fsUsedOnLindormTable;
            return this;
        }

        /**
         * <p>The storage usage of the table data of the wide table engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedOnLindormTableData(String fsUsedOnLindormTableData) {
            this.fsUsedOnLindormTableData = fsUsedOnLindormTableData;
            return this;
        }

        /**
         * <p>The storage usage of the log data of the wide table engine. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>33269</p>
         */
        public Builder fsUsedOnLindormTableWAL(String fsUsedOnLindormTableWAL) {
            this.fsUsedOnLindormTableWAL = fsUsedOnLindormTableWAL;
            return this;
        }

        /**
         * <p>If the version of the underlying storage engine is 4.1.9 or later, the storage usage values returned for the LStorageUsageList parameter prevail. Storage details are returned based on the storage type.</p>
         */
        public Builder lStorageUsageList(java.util.List<LStorageUsageList> lStorageUsageList) {
            this.lStorageUsageList = lStorageUsageList;
            return this;
        }

        /**
         * <p>The request ID. Each request has a unique ID. You can use the request ID to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4F23D50C-400C-592C-9486-9D1E10179065</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the return value is valid. Valid values: true and false. If a value of false is returned, you must provide the request ID for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder valid(String valid) {
            this.valid = valid;
            return this;
        }

        public GetLindormFsUsedDetailResponseBody build() {
            return new GetLindormFsUsedDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLindormFsUsedDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormFsUsedDetailResponseBody</p>
     */
    public static class LStorageUsageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private String capacity;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("Used")
        private String used;

        @com.aliyun.core.annotation.NameInMap("UsedLindormSearch")
        private String usedLindormSearch;

        @com.aliyun.core.annotation.NameInMap("UsedLindormSpark")
        private String usedLindormSpark;

        @com.aliyun.core.annotation.NameInMap("UsedLindormTable")
        private String usedLindormTable;

        @com.aliyun.core.annotation.NameInMap("UsedLindormTsdb")
        private String usedLindormTsdb;

        @com.aliyun.core.annotation.NameInMap("UsedOther")
        private String usedOther;

        private LStorageUsageList(Builder builder) {
            this.capacity = builder.capacity;
            this.diskType = builder.diskType;
            this.used = builder.used;
            this.usedLindormSearch = builder.usedLindormSearch;
            this.usedLindormSpark = builder.usedLindormSpark;
            this.usedLindormTable = builder.usedLindormTable;
            this.usedLindormTsdb = builder.usedLindormTsdb;
            this.usedOther = builder.usedOther;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LStorageUsageList create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public String getCapacity() {
            return this.capacity;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return used
         */
        public String getUsed() {
            return this.used;
        }

        /**
         * @return usedLindormSearch
         */
        public String getUsedLindormSearch() {
            return this.usedLindormSearch;
        }

        /**
         * @return usedLindormSpark
         */
        public String getUsedLindormSpark() {
            return this.usedLindormSpark;
        }

        /**
         * @return usedLindormTable
         */
        public String getUsedLindormTable() {
            return this.usedLindormTable;
        }

        /**
         * @return usedLindormTsdb
         */
        public String getUsedLindormTsdb() {
            return this.usedLindormTsdb;
        }

        /**
         * @return usedOther
         */
        public String getUsedOther() {
            return this.usedOther;
        }

        public static final class Builder {
            private String capacity; 
            private String diskType; 
            private String used; 
            private String usedLindormSearch; 
            private String usedLindormSpark; 
            private String usedLindormTable; 
            private String usedLindormTsdb; 
            private String usedOther; 

            private Builder() {
            } 

            private Builder(LStorageUsageList model) {
                this.capacity = model.capacity;
                this.diskType = model.diskType;
                this.used = model.used;
                this.usedLindormSearch = model.usedLindormSearch;
                this.usedLindormSpark = model.usedLindormSpark;
                this.usedLindormTable = model.usedLindormTable;
                this.usedLindormTsdb = model.usedLindormTsdb;
                this.usedOther = model.usedOther;
            } 

            /**
             * <p>The total storage capacity. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>85899345920</p>
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The storage type of the cluster. Valid values:</p>
             * <ul>
             * <li>StandardCloudStorage</li>
             * <li>PerformanceCloudStorage</li>
             * <li>CapacityCloudStorage</li>
             * <li>LocalSsdStorage</li>
             * <li>LocalHddStorage</li>
             * <li>LocalEbsStorage</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>StandardCloudStorage</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The storage usage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>33269</p>
             */
            public Builder used(String used) {
                this.used = used;
                return this;
            }

            /**
             * <p>The storage usage of the search engine. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>33269</p>
             */
            public Builder usedLindormSearch(String usedLindormSearch) {
                this.usedLindormSearch = usedLindormSearch;
                return this;
            }

            /**
             * <p>The storage usage of the compute engine. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>33269</p>
             */
            public Builder usedLindormSpark(String usedLindormSpark) {
                this.usedLindormSpark = usedLindormSpark;
                return this;
            }

            /**
             * <p>The storage usage of the wide table engine. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>33269</p>
             */
            public Builder usedLindormTable(String usedLindormTable) {
                this.usedLindormTable = usedLindormTable;
                return this;
            }

            /**
             * <p>The storage usage of the time series engine. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>33269</p>
             */
            public Builder usedLindormTsdb(String usedLindormTsdb) {
                this.usedLindormTsdb = usedLindormTsdb;
                return this;
            }

            /**
             * <p>The storage usage of other resources, such as logs and recycle bins. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>33269</p>
             */
            public Builder usedOther(String usedOther) {
                this.usedOther = usedOther;
                return this;
            }

            public LStorageUsageList build() {
                return new LStorageUsageList(this);
            } 

        } 

    }
}
