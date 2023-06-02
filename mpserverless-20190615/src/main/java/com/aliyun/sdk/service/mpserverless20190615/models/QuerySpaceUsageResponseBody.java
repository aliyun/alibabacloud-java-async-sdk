// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpaceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySpaceUsageResponseBody</p>
 */
public class QuerySpaceUsageResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpaceId")
    private String spaceId;

    @NameInMap("SpaceUsageDataList")
    private java.util.List < SpaceUsageDataList> spaceUsageDataList;

    @NameInMap("StartTime")
    private String startTime;

    private QuerySpaceUsageResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.spaceId = builder.spaceId;
        this.spaceUsageDataList = builder.spaceUsageDataList;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpaceUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return spaceUsageDataList
     */
    public java.util.List < SpaceUsageDataList> getSpaceUsageDataList() {
        return this.spaceUsageDataList;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private String requestId; 
        private String spaceId; 
        private java.util.List < SpaceUsageDataList> spaceUsageDataList; 
        private String startTime; 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
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
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        /**
         * SpaceUsageDataList.
         */
        public Builder spaceUsageDataList(java.util.List < SpaceUsageDataList> spaceUsageDataList) {
            this.spaceUsageDataList = spaceUsageDataList;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public QuerySpaceUsageResponseBody build() {
            return new QuerySpaceUsageResponseBody(this);
        } 

    } 

    public static class CsUsage extends TeaModel {
        @NameInMap("CdnTraffic")
        private Long cdnTraffic;

        @NameInMap("DownloadCount")
        private Long downloadCount;

        @NameInMap("StorageSize")
        private Long storageSize;

        @NameInMap("UploadCount")
        private Long uploadCount;

        private CsUsage(Builder builder) {
            this.cdnTraffic = builder.cdnTraffic;
            this.downloadCount = builder.downloadCount;
            this.storageSize = builder.storageSize;
            this.uploadCount = builder.uploadCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CsUsage create() {
            return builder().build();
        }

        /**
         * @return cdnTraffic
         */
        public Long getCdnTraffic() {
            return this.cdnTraffic;
        }

        /**
         * @return downloadCount
         */
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        /**
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return uploadCount
         */
        public Long getUploadCount() {
            return this.uploadCount;
        }

        public static final class Builder {
            private Long cdnTraffic; 
            private Long downloadCount; 
            private Long storageSize; 
            private Long uploadCount; 

            /**
             * CdnTraffic.
             */
            public Builder cdnTraffic(Long cdnTraffic) {
                this.cdnTraffic = cdnTraffic;
                return this;
            }

            /**
             * DownloadCount.
             */
            public Builder downloadCount(Long downloadCount) {
                this.downloadCount = downloadCount;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * UploadCount.
             */
            public Builder uploadCount(Long uploadCount) {
                this.uploadCount = uploadCount;
                return this;
            }

            public CsUsage build() {
                return new CsUsage(this);
            } 

        } 

    }
    public static class DbUsage extends TeaModel {
        @NameInMap("ReadCount")
        private Long readCount;

        @NameInMap("StorageSize")
        private Long storageSize;

        @NameInMap("WriteCount")
        private Long writeCount;

        private DbUsage(Builder builder) {
            this.readCount = builder.readCount;
            this.storageSize = builder.storageSize;
            this.writeCount = builder.writeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbUsage create() {
            return builder().build();
        }

        /**
         * @return readCount
         */
        public Long getReadCount() {
            return this.readCount;
        }

        /**
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return writeCount
         */
        public Long getWriteCount() {
            return this.writeCount;
        }

        public static final class Builder {
            private Long readCount; 
            private Long storageSize; 
            private Long writeCount; 

            /**
             * ReadCount.
             */
            public Builder readCount(Long readCount) {
                this.readCount = readCount;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * WriteCount.
             */
            public Builder writeCount(Long writeCount) {
                this.writeCount = writeCount;
                return this;
            }

            public DbUsage build() {
                return new DbUsage(this);
            } 

        } 

    }
    public static class FcUsage extends TeaModel {
        @NameInMap("Cost")
        private Long cost;

        @NameInMap("RequestCount")
        private Long requestCount;

        @NameInMap("TxTraffic")
        private Long txTraffic;

        private FcUsage(Builder builder) {
            this.cost = builder.cost;
            this.requestCount = builder.requestCount;
            this.txTraffic = builder.txTraffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FcUsage create() {
            return builder().build();
        }

        /**
         * @return cost
         */
        public Long getCost() {
            return this.cost;
        }

        /**
         * @return requestCount
         */
        public Long getRequestCount() {
            return this.requestCount;
        }

        /**
         * @return txTraffic
         */
        public Long getTxTraffic() {
            return this.txTraffic;
        }

        public static final class Builder {
            private Long cost; 
            private Long requestCount; 
            private Long txTraffic; 

            /**
             * Cost.
             */
            public Builder cost(Long cost) {
                this.cost = cost;
                return this;
            }

            /**
             * RequestCount.
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * TxTraffic.
             */
            public Builder txTraffic(Long txTraffic) {
                this.txTraffic = txTraffic;
                return this;
            }

            public FcUsage build() {
                return new FcUsage(this);
            } 

        } 

    }
    public static class WhUsage extends TeaModel {
        @NameInMap("CdnTraffic")
        private Long cdnTraffic;

        @NameInMap("StorageSize")
        private Long storageSize;

        private WhUsage(Builder builder) {
            this.cdnTraffic = builder.cdnTraffic;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhUsage create() {
            return builder().build();
        }

        /**
         * @return cdnTraffic
         */
        public Long getCdnTraffic() {
            return this.cdnTraffic;
        }

        /**
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private Long cdnTraffic; 
            private Long storageSize; 

            /**
             * CdnTraffic.
             */
            public Builder cdnTraffic(Long cdnTraffic) {
                this.cdnTraffic = cdnTraffic;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public WhUsage build() {
                return new WhUsage(this);
            } 

        } 

    }
    public static class SpaceUsageDataList extends TeaModel {
        @NameInMap("CsUsage")
        private CsUsage csUsage;

        @NameInMap("DbUsage")
        private DbUsage dbUsage;

        @NameInMap("EffectiveBillFlag")
        private Boolean effectiveBillFlag;

        @NameInMap("FcUsage")
        private FcUsage fcUsage;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("WhUsage")
        private WhUsage whUsage;

        private SpaceUsageDataList(Builder builder) {
            this.csUsage = builder.csUsage;
            this.dbUsage = builder.dbUsage;
            this.effectiveBillFlag = builder.effectiveBillFlag;
            this.fcUsage = builder.fcUsage;
            this.timestamp = builder.timestamp;
            this.whUsage = builder.whUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpaceUsageDataList create() {
            return builder().build();
        }

        /**
         * @return csUsage
         */
        public CsUsage getCsUsage() {
            return this.csUsage;
        }

        /**
         * @return dbUsage
         */
        public DbUsage getDbUsage() {
            return this.dbUsage;
        }

        /**
         * @return effectiveBillFlag
         */
        public Boolean getEffectiveBillFlag() {
            return this.effectiveBillFlag;
        }

        /**
         * @return fcUsage
         */
        public FcUsage getFcUsage() {
            return this.fcUsage;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return whUsage
         */
        public WhUsage getWhUsage() {
            return this.whUsage;
        }

        public static final class Builder {
            private CsUsage csUsage; 
            private DbUsage dbUsage; 
            private Boolean effectiveBillFlag; 
            private FcUsage fcUsage; 
            private String timestamp; 
            private WhUsage whUsage; 

            /**
             * CsUsage.
             */
            public Builder csUsage(CsUsage csUsage) {
                this.csUsage = csUsage;
                return this;
            }

            /**
             * DbUsage.
             */
            public Builder dbUsage(DbUsage dbUsage) {
                this.dbUsage = dbUsage;
                return this;
            }

            /**
             * 标记该数据是否出账。
             * <p>
             * - true：正常出账。
             * - false：不出账，例如在空间停服的情况下，用量数据不用于出账。
             */
            public Builder effectiveBillFlag(Boolean effectiveBillFlag) {
                this.effectiveBillFlag = effectiveBillFlag;
                return this;
            }

            /**
             * FcUsage.
             */
            public Builder fcUsage(FcUsage fcUsage) {
                this.fcUsage = fcUsage;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * WhUsage.
             */
            public Builder whUsage(WhUsage whUsage) {
                this.whUsage = whUsage;
                return this;
            }

            public SpaceUsageDataList build() {
                return new SpaceUsageDataList(this);
            } 

        } 

    }
}
