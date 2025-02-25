// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayFileSharesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayFileSharesResponseBody</p>
 */
public class DescribeGatewayFileSharesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("FileShares")
    private FileShares fileShares;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewayFileSharesResponseBody(Builder builder) {
        this.code = builder.code;
        this.fileShares = builder.fileShares;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayFileSharesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return fileShares
     */
    public FileShares getFileShares() {
        return this.fileShares;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private FileShares fileShares; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * FileShares.
         */
        public Builder fileShares(FileShares fileShares) {
            this.fileShares = fileShares;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeGatewayFileSharesResponseBody build() {
            return new DescribeGatewayFileSharesResponseBody(this);
        } 

    } 

    public static class FileShare extends TeaModel {
        @NameInMap("AccessBasedEnumeration")
        private Boolean accessBasedEnumeration;

        @NameInMap("ActiveMessages")
        private Long activeMessages;

        @NameInMap("Address")
        private String address;

        @NameInMap("BeLimit")
        private Integer beLimit;

        @NameInMap("Browsable")
        private Boolean browsable;

        @NameInMap("BucketInfos")
        private String bucketInfos;

        @NameInMap("BucketsStub")
        private Boolean bucketsStub;

        @NameInMap("BypassCacheRead")
        private Boolean bypassCacheRead;

        @NameInMap("CacheMode")
        private String cacheMode;

        @NameInMap("ClientSideCmk")
        private String clientSideCmk;

        @NameInMap("ClientSideEncryption")
        private Boolean clientSideEncryption;

        @NameInMap("DirectIO")
        private Boolean directIO;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("DownloadLimit")
        private Integer downloadLimit;

        @NameInMap("DownloadQueue")
        private Long downloadQueue;

        @NameInMap("DownloadRate")
        private Long downloadRate;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("ExpressSyncId")
        private String expressSyncId;

        @NameInMap("FastReclaim")
        private Boolean fastReclaim;

        @NameInMap("FeLimit")
        private Integer feLimit;

        @NameInMap("FileNumLimit")
        private Long fileNumLimit;

        @NameInMap("FsSizeLimit")
        private Long fsSizeLimit;

        @NameInMap("HighWatermark")
        private Integer highWatermark;

        @NameInMap("IgnoreDelete")
        private Boolean ignoreDelete;

        @NameInMap("InPlace")
        private Boolean inPlace;

        @NameInMap("InRate")
        private Long inRate;

        @NameInMap("IndexId")
        private String indexId;

        @NameInMap("KmsRotatePeriod")
        private String kmsRotatePeriod;

        @NameInMap("LagPeriod")
        private Long lagPeriod;

        @NameInMap("LocalPath")
        private String localPath;

        @NameInMap("LowWatermark")
        private Integer lowWatermark;

        @NameInMap("MnsHealth")
        private String mnsHealth;

        @NameInMap("Name")
        private String name;

        @NameInMap("NfsV4Optimization")
        private Boolean nfsV4Optimization;

        @NameInMap("NoPartition")
        private Boolean noPartition;

        @NameInMap("ObsoleteBuckets")
        private String obsoleteBuckets;

        @NameInMap("OssBucketName")
        private String ossBucketName;

        @NameInMap("OssBucketSsl")
        private Boolean ossBucketSsl;

        @NameInMap("OssEndpoint")
        private String ossEndpoint;

        @NameInMap("OssHealth")
        private String ossHealth;

        @NameInMap("OssUsed")
        private Long ossUsed;

        @NameInMap("OutRate")
        private Long outRate;

        @NameInMap("PartialSyncPaths")
        private String partialSyncPaths;

        @NameInMap("PathPrefix")
        private String pathPrefix;

        @NameInMap("PollingInterval")
        private Integer pollingInterval;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RemainingMetaSpace")
        private Long remainingMetaSpace;

        @NameInMap("RemoteSync")
        private Boolean remoteSync;

        @NameInMap("RemoteSyncDownload")
        private Boolean remoteSyncDownload;

        @NameInMap("RoClientList")
        private String roClientList;

        @NameInMap("RoUserList")
        private String roUserList;

        @NameInMap("RwClientList")
        private String rwClientList;

        @NameInMap("RwUserList")
        private String rwUserList;

        @NameInMap("ServerSideAlgorithm")
        private String serverSideAlgorithm;

        @NameInMap("ServerSideCmk")
        private String serverSideCmk;

        @NameInMap("ServerSideEncryption")
        private Boolean serverSideEncryption;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Squash")
        private String squash;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupportArchive")
        private Boolean supportArchive;

        @NameInMap("SyncProgress")
        private Integer syncProgress;

        @NameInMap("Throttling")
        private Boolean throttling;

        @NameInMap("TotalDownload")
        private Long totalDownload;

        @NameInMap("TotalUpload")
        private Long totalUpload;

        @NameInMap("TransferAcceleration")
        private Boolean transferAcceleration;

        @NameInMap("UploadQueue")
        private Long uploadQueue;

        @NameInMap("Used")
        private Long used;

        @NameInMap("WindowsAcl")
        private Boolean windowsAcl;

        private FileShare(Builder builder) {
            this.accessBasedEnumeration = builder.accessBasedEnumeration;
            this.activeMessages = builder.activeMessages;
            this.address = builder.address;
            this.beLimit = builder.beLimit;
            this.browsable = builder.browsable;
            this.bucketInfos = builder.bucketInfos;
            this.bucketsStub = builder.bucketsStub;
            this.bypassCacheRead = builder.bypassCacheRead;
            this.cacheMode = builder.cacheMode;
            this.clientSideCmk = builder.clientSideCmk;
            this.clientSideEncryption = builder.clientSideEncryption;
            this.directIO = builder.directIO;
            this.diskId = builder.diskId;
            this.diskType = builder.diskType;
            this.downloadLimit = builder.downloadLimit;
            this.downloadQueue = builder.downloadQueue;
            this.downloadRate = builder.downloadRate;
            this.enabled = builder.enabled;
            this.expressSyncId = builder.expressSyncId;
            this.fastReclaim = builder.fastReclaim;
            this.feLimit = builder.feLimit;
            this.fileNumLimit = builder.fileNumLimit;
            this.fsSizeLimit = builder.fsSizeLimit;
            this.highWatermark = builder.highWatermark;
            this.ignoreDelete = builder.ignoreDelete;
            this.inPlace = builder.inPlace;
            this.inRate = builder.inRate;
            this.indexId = builder.indexId;
            this.kmsRotatePeriod = builder.kmsRotatePeriod;
            this.lagPeriod = builder.lagPeriod;
            this.localPath = builder.localPath;
            this.lowWatermark = builder.lowWatermark;
            this.mnsHealth = builder.mnsHealth;
            this.name = builder.name;
            this.nfsV4Optimization = builder.nfsV4Optimization;
            this.noPartition = builder.noPartition;
            this.obsoleteBuckets = builder.obsoleteBuckets;
            this.ossBucketName = builder.ossBucketName;
            this.ossBucketSsl = builder.ossBucketSsl;
            this.ossEndpoint = builder.ossEndpoint;
            this.ossHealth = builder.ossHealth;
            this.ossUsed = builder.ossUsed;
            this.outRate = builder.outRate;
            this.partialSyncPaths = builder.partialSyncPaths;
            this.pathPrefix = builder.pathPrefix;
            this.pollingInterval = builder.pollingInterval;
            this.protocol = builder.protocol;
            this.remainingMetaSpace = builder.remainingMetaSpace;
            this.remoteSync = builder.remoteSync;
            this.remoteSyncDownload = builder.remoteSyncDownload;
            this.roClientList = builder.roClientList;
            this.roUserList = builder.roUserList;
            this.rwClientList = builder.rwClientList;
            this.rwUserList = builder.rwUserList;
            this.serverSideAlgorithm = builder.serverSideAlgorithm;
            this.serverSideCmk = builder.serverSideCmk;
            this.serverSideEncryption = builder.serverSideEncryption;
            this.size = builder.size;
            this.squash = builder.squash;
            this.state = builder.state;
            this.status = builder.status;
            this.supportArchive = builder.supportArchive;
            this.syncProgress = builder.syncProgress;
            this.throttling = builder.throttling;
            this.totalDownload = builder.totalDownload;
            this.totalUpload = builder.totalUpload;
            this.transferAcceleration = builder.transferAcceleration;
            this.uploadQueue = builder.uploadQueue;
            this.used = builder.used;
            this.windowsAcl = builder.windowsAcl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileShare create() {
            return builder().build();
        }

        /**
         * @return accessBasedEnumeration
         */
        public Boolean getAccessBasedEnumeration() {
            return this.accessBasedEnumeration;
        }

        /**
         * @return activeMessages
         */
        public Long getActiveMessages() {
            return this.activeMessages;
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return beLimit
         */
        public Integer getBeLimit() {
            return this.beLimit;
        }

        /**
         * @return browsable
         */
        public Boolean getBrowsable() {
            return this.browsable;
        }

        /**
         * @return bucketInfos
         */
        public String getBucketInfos() {
            return this.bucketInfos;
        }

        /**
         * @return bucketsStub
         */
        public Boolean getBucketsStub() {
            return this.bucketsStub;
        }

        /**
         * @return bypassCacheRead
         */
        public Boolean getBypassCacheRead() {
            return this.bypassCacheRead;
        }

        /**
         * @return cacheMode
         */
        public String getCacheMode() {
            return this.cacheMode;
        }

        /**
         * @return clientSideCmk
         */
        public String getClientSideCmk() {
            return this.clientSideCmk;
        }

        /**
         * @return clientSideEncryption
         */
        public Boolean getClientSideEncryption() {
            return this.clientSideEncryption;
        }

        /**
         * @return directIO
         */
        public Boolean getDirectIO() {
            return this.directIO;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return downloadLimit
         */
        public Integer getDownloadLimit() {
            return this.downloadLimit;
        }

        /**
         * @return downloadQueue
         */
        public Long getDownloadQueue() {
            return this.downloadQueue;
        }

        /**
         * @return downloadRate
         */
        public Long getDownloadRate() {
            return this.downloadRate;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return expressSyncId
         */
        public String getExpressSyncId() {
            return this.expressSyncId;
        }

        /**
         * @return fastReclaim
         */
        public Boolean getFastReclaim() {
            return this.fastReclaim;
        }

        /**
         * @return feLimit
         */
        public Integer getFeLimit() {
            return this.feLimit;
        }

        /**
         * @return fileNumLimit
         */
        public Long getFileNumLimit() {
            return this.fileNumLimit;
        }

        /**
         * @return fsSizeLimit
         */
        public Long getFsSizeLimit() {
            return this.fsSizeLimit;
        }

        /**
         * @return highWatermark
         */
        public Integer getHighWatermark() {
            return this.highWatermark;
        }

        /**
         * @return ignoreDelete
         */
        public Boolean getIgnoreDelete() {
            return this.ignoreDelete;
        }

        /**
         * @return inPlace
         */
        public Boolean getInPlace() {
            return this.inPlace;
        }

        /**
         * @return inRate
         */
        public Long getInRate() {
            return this.inRate;
        }

        /**
         * @return indexId
         */
        public String getIndexId() {
            return this.indexId;
        }

        /**
         * @return kmsRotatePeriod
         */
        public String getKmsRotatePeriod() {
            return this.kmsRotatePeriod;
        }

        /**
         * @return lagPeriod
         */
        public Long getLagPeriod() {
            return this.lagPeriod;
        }

        /**
         * @return localPath
         */
        public String getLocalPath() {
            return this.localPath;
        }

        /**
         * @return lowWatermark
         */
        public Integer getLowWatermark() {
            return this.lowWatermark;
        }

        /**
         * @return mnsHealth
         */
        public String getMnsHealth() {
            return this.mnsHealth;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nfsV4Optimization
         */
        public Boolean getNfsV4Optimization() {
            return this.nfsV4Optimization;
        }

        /**
         * @return noPartition
         */
        public Boolean getNoPartition() {
            return this.noPartition;
        }

        /**
         * @return obsoleteBuckets
         */
        public String getObsoleteBuckets() {
            return this.obsoleteBuckets;
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return ossBucketSsl
         */
        public Boolean getOssBucketSsl() {
            return this.ossBucketSsl;
        }

        /**
         * @return ossEndpoint
         */
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        /**
         * @return ossHealth
         */
        public String getOssHealth() {
            return this.ossHealth;
        }

        /**
         * @return ossUsed
         */
        public Long getOssUsed() {
            return this.ossUsed;
        }

        /**
         * @return outRate
         */
        public Long getOutRate() {
            return this.outRate;
        }

        /**
         * @return partialSyncPaths
         */
        public String getPartialSyncPaths() {
            return this.partialSyncPaths;
        }

        /**
         * @return pathPrefix
         */
        public String getPathPrefix() {
            return this.pathPrefix;
        }

        /**
         * @return pollingInterval
         */
        public Integer getPollingInterval() {
            return this.pollingInterval;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return remainingMetaSpace
         */
        public Long getRemainingMetaSpace() {
            return this.remainingMetaSpace;
        }

        /**
         * @return remoteSync
         */
        public Boolean getRemoteSync() {
            return this.remoteSync;
        }

        /**
         * @return remoteSyncDownload
         */
        public Boolean getRemoteSyncDownload() {
            return this.remoteSyncDownload;
        }

        /**
         * @return roClientList
         */
        public String getRoClientList() {
            return this.roClientList;
        }

        /**
         * @return roUserList
         */
        public String getRoUserList() {
            return this.roUserList;
        }

        /**
         * @return rwClientList
         */
        public String getRwClientList() {
            return this.rwClientList;
        }

        /**
         * @return rwUserList
         */
        public String getRwUserList() {
            return this.rwUserList;
        }

        /**
         * @return serverSideAlgorithm
         */
        public String getServerSideAlgorithm() {
            return this.serverSideAlgorithm;
        }

        /**
         * @return serverSideCmk
         */
        public String getServerSideCmk() {
            return this.serverSideCmk;
        }

        /**
         * @return serverSideEncryption
         */
        public Boolean getServerSideEncryption() {
            return this.serverSideEncryption;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return squash
         */
        public String getSquash() {
            return this.squash;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportArchive
         */
        public Boolean getSupportArchive() {
            return this.supportArchive;
        }

        /**
         * @return syncProgress
         */
        public Integer getSyncProgress() {
            return this.syncProgress;
        }

        /**
         * @return throttling
         */
        public Boolean getThrottling() {
            return this.throttling;
        }

        /**
         * @return totalDownload
         */
        public Long getTotalDownload() {
            return this.totalDownload;
        }

        /**
         * @return totalUpload
         */
        public Long getTotalUpload() {
            return this.totalUpload;
        }

        /**
         * @return transferAcceleration
         */
        public Boolean getTransferAcceleration() {
            return this.transferAcceleration;
        }

        /**
         * @return uploadQueue
         */
        public Long getUploadQueue() {
            return this.uploadQueue;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return windowsAcl
         */
        public Boolean getWindowsAcl() {
            return this.windowsAcl;
        }

        public static final class Builder {
            private Boolean accessBasedEnumeration; 
            private Long activeMessages; 
            private String address; 
            private Integer beLimit; 
            private Boolean browsable; 
            private String bucketInfos; 
            private Boolean bucketsStub; 
            private Boolean bypassCacheRead; 
            private String cacheMode; 
            private String clientSideCmk; 
            private Boolean clientSideEncryption; 
            private Boolean directIO; 
            private String diskId; 
            private String diskType; 
            private Integer downloadLimit; 
            private Long downloadQueue; 
            private Long downloadRate; 
            private Boolean enabled; 
            private String expressSyncId; 
            private Boolean fastReclaim; 
            private Integer feLimit; 
            private Long fileNumLimit; 
            private Long fsSizeLimit; 
            private Integer highWatermark; 
            private Boolean ignoreDelete; 
            private Boolean inPlace; 
            private Long inRate; 
            private String indexId; 
            private String kmsRotatePeriod; 
            private Long lagPeriod; 
            private String localPath; 
            private Integer lowWatermark; 
            private String mnsHealth; 
            private String name; 
            private Boolean nfsV4Optimization; 
            private Boolean noPartition; 
            private String obsoleteBuckets; 
            private String ossBucketName; 
            private Boolean ossBucketSsl; 
            private String ossEndpoint; 
            private String ossHealth; 
            private Long ossUsed; 
            private Long outRate; 
            private String partialSyncPaths; 
            private String pathPrefix; 
            private Integer pollingInterval; 
            private String protocol; 
            private Long remainingMetaSpace; 
            private Boolean remoteSync; 
            private Boolean remoteSyncDownload; 
            private String roClientList; 
            private String roUserList; 
            private String rwClientList; 
            private String rwUserList; 
            private String serverSideAlgorithm; 
            private String serverSideCmk; 
            private Boolean serverSideEncryption; 
            private Long size; 
            private String squash; 
            private String state; 
            private String status; 
            private Boolean supportArchive; 
            private Integer syncProgress; 
            private Boolean throttling; 
            private Long totalDownload; 
            private Long totalUpload; 
            private Boolean transferAcceleration; 
            private Long uploadQueue; 
            private Long used; 
            private Boolean windowsAcl; 

            /**
             * AccessBasedEnumeration.
             */
            public Builder accessBasedEnumeration(Boolean accessBasedEnumeration) {
                this.accessBasedEnumeration = accessBasedEnumeration;
                return this;
            }

            /**
             * ActiveMessages.
             */
            public Builder activeMessages(Long activeMessages) {
                this.activeMessages = activeMessages;
                return this;
            }

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * BeLimit.
             */
            public Builder beLimit(Integer beLimit) {
                this.beLimit = beLimit;
                return this;
            }

            /**
             * Browsable.
             */
            public Builder browsable(Boolean browsable) {
                this.browsable = browsable;
                return this;
            }

            /**
             * BucketInfos.
             */
            public Builder bucketInfos(String bucketInfos) {
                this.bucketInfos = bucketInfos;
                return this;
            }

            /**
             * BucketsStub.
             */
            public Builder bucketsStub(Boolean bucketsStub) {
                this.bucketsStub = bucketsStub;
                return this;
            }

            /**
             * BypassCacheRead.
             */
            public Builder bypassCacheRead(Boolean bypassCacheRead) {
                this.bypassCacheRead = bypassCacheRead;
                return this;
            }

            /**
             * CacheMode.
             */
            public Builder cacheMode(String cacheMode) {
                this.cacheMode = cacheMode;
                return this;
            }

            /**
             * ClientSideCmk.
             */
            public Builder clientSideCmk(String clientSideCmk) {
                this.clientSideCmk = clientSideCmk;
                return this;
            }

            /**
             * ClientSideEncryption.
             */
            public Builder clientSideEncryption(Boolean clientSideEncryption) {
                this.clientSideEncryption = clientSideEncryption;
                return this;
            }

            /**
             * DirectIO.
             */
            public Builder directIO(Boolean directIO) {
                this.directIO = directIO;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * DownloadLimit.
             */
            public Builder downloadLimit(Integer downloadLimit) {
                this.downloadLimit = downloadLimit;
                return this;
            }

            /**
             * DownloadQueue.
             */
            public Builder downloadQueue(Long downloadQueue) {
                this.downloadQueue = downloadQueue;
                return this;
            }

            /**
             * DownloadRate.
             */
            public Builder downloadRate(Long downloadRate) {
                this.downloadRate = downloadRate;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * ExpressSyncId.
             */
            public Builder expressSyncId(String expressSyncId) {
                this.expressSyncId = expressSyncId;
                return this;
            }

            /**
             * FastReclaim.
             */
            public Builder fastReclaim(Boolean fastReclaim) {
                this.fastReclaim = fastReclaim;
                return this;
            }

            /**
             * FeLimit.
             */
            public Builder feLimit(Integer feLimit) {
                this.feLimit = feLimit;
                return this;
            }

            /**
             * FileNumLimit.
             */
            public Builder fileNumLimit(Long fileNumLimit) {
                this.fileNumLimit = fileNumLimit;
                return this;
            }

            /**
             * FsSizeLimit.
             */
            public Builder fsSizeLimit(Long fsSizeLimit) {
                this.fsSizeLimit = fsSizeLimit;
                return this;
            }

            /**
             * HighWatermark.
             */
            public Builder highWatermark(Integer highWatermark) {
                this.highWatermark = highWatermark;
                return this;
            }

            /**
             * IgnoreDelete.
             */
            public Builder ignoreDelete(Boolean ignoreDelete) {
                this.ignoreDelete = ignoreDelete;
                return this;
            }

            /**
             * InPlace.
             */
            public Builder inPlace(Boolean inPlace) {
                this.inPlace = inPlace;
                return this;
            }

            /**
             * InRate.
             */
            public Builder inRate(Long inRate) {
                this.inRate = inRate;
                return this;
            }

            /**
             * IndexId.
             */
            public Builder indexId(String indexId) {
                this.indexId = indexId;
                return this;
            }

            /**
             * KmsRotatePeriod.
             */
            public Builder kmsRotatePeriod(String kmsRotatePeriod) {
                this.kmsRotatePeriod = kmsRotatePeriod;
                return this;
            }

            /**
             * LagPeriod.
             */
            public Builder lagPeriod(Long lagPeriod) {
                this.lagPeriod = lagPeriod;
                return this;
            }

            /**
             * LocalPath.
             */
            public Builder localPath(String localPath) {
                this.localPath = localPath;
                return this;
            }

            /**
             * LowWatermark.
             */
            public Builder lowWatermark(Integer lowWatermark) {
                this.lowWatermark = lowWatermark;
                return this;
            }

            /**
             * MnsHealth.
             */
            public Builder mnsHealth(String mnsHealth) {
                this.mnsHealth = mnsHealth;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NfsV4Optimization.
             */
            public Builder nfsV4Optimization(Boolean nfsV4Optimization) {
                this.nfsV4Optimization = nfsV4Optimization;
                return this;
            }

            /**
             * NoPartition.
             */
            public Builder noPartition(Boolean noPartition) {
                this.noPartition = noPartition;
                return this;
            }

            /**
             * ObsoleteBuckets.
             */
            public Builder obsoleteBuckets(String obsoleteBuckets) {
                this.obsoleteBuckets = obsoleteBuckets;
                return this;
            }

            /**
             * OssBucketName.
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * OssBucketSsl.
             */
            public Builder ossBucketSsl(Boolean ossBucketSsl) {
                this.ossBucketSsl = ossBucketSsl;
                return this;
            }

            /**
             * OssEndpoint.
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * OssHealth.
             */
            public Builder ossHealth(String ossHealth) {
                this.ossHealth = ossHealth;
                return this;
            }

            /**
             * OssUsed.
             */
            public Builder ossUsed(Long ossUsed) {
                this.ossUsed = ossUsed;
                return this;
            }

            /**
             * OutRate.
             */
            public Builder outRate(Long outRate) {
                this.outRate = outRate;
                return this;
            }

            /**
             * PartialSyncPaths.
             */
            public Builder partialSyncPaths(String partialSyncPaths) {
                this.partialSyncPaths = partialSyncPaths;
                return this;
            }

            /**
             * OSS Prefix。
             */
            public Builder pathPrefix(String pathPrefix) {
                this.pathPrefix = pathPrefix;
                return this;
            }

            /**
             * PollingInterval.
             */
            public Builder pollingInterval(Integer pollingInterval) {
                this.pollingInterval = pollingInterval;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * RemainingMetaSpace.
             */
            public Builder remainingMetaSpace(Long remainingMetaSpace) {
                this.remainingMetaSpace = remainingMetaSpace;
                return this;
            }

            /**
             * RemoteSync.
             */
            public Builder remoteSync(Boolean remoteSync) {
                this.remoteSync = remoteSync;
                return this;
            }

            /**
             * RemoteSyncDownload.
             */
            public Builder remoteSyncDownload(Boolean remoteSyncDownload) {
                this.remoteSyncDownload = remoteSyncDownload;
                return this;
            }

            /**
             * RoClientList.
             */
            public Builder roClientList(String roClientList) {
                this.roClientList = roClientList;
                return this;
            }

            /**
             * RoUserList.
             */
            public Builder roUserList(String roUserList) {
                this.roUserList = roUserList;
                return this;
            }

            /**
             * RwClientList.
             */
            public Builder rwClientList(String rwClientList) {
                this.rwClientList = rwClientList;
                return this;
            }

            /**
             * RwUserList.
             */
            public Builder rwUserList(String rwUserList) {
                this.rwUserList = rwUserList;
                return this;
            }

            /**
             * ServerSideAlgorithm.
             */
            public Builder serverSideAlgorithm(String serverSideAlgorithm) {
                this.serverSideAlgorithm = serverSideAlgorithm;
                return this;
            }

            /**
             * ServerSideCmk.
             */
            public Builder serverSideCmk(String serverSideCmk) {
                this.serverSideCmk = serverSideCmk;
                return this;
            }

            /**
             * ServerSideEncryption.
             */
            public Builder serverSideEncryption(Boolean serverSideEncryption) {
                this.serverSideEncryption = serverSideEncryption;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Squash.
             */
            public Builder squash(String squash) {
                this.squash = squash;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
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
             * SupportArchive.
             */
            public Builder supportArchive(Boolean supportArchive) {
                this.supportArchive = supportArchive;
                return this;
            }

            /**
             * SyncProgress.
             */
            public Builder syncProgress(Integer syncProgress) {
                this.syncProgress = syncProgress;
                return this;
            }

            /**
             * Throttling.
             */
            public Builder throttling(Boolean throttling) {
                this.throttling = throttling;
                return this;
            }

            /**
             * TotalDownload.
             */
            public Builder totalDownload(Long totalDownload) {
                this.totalDownload = totalDownload;
                return this;
            }

            /**
             * TotalUpload.
             */
            public Builder totalUpload(Long totalUpload) {
                this.totalUpload = totalUpload;
                return this;
            }

            /**
             * TransferAcceleration.
             */
            public Builder transferAcceleration(Boolean transferAcceleration) {
                this.transferAcceleration = transferAcceleration;
                return this;
            }

            /**
             * UploadQueue.
             */
            public Builder uploadQueue(Long uploadQueue) {
                this.uploadQueue = uploadQueue;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * WindowsAcl.
             */
            public Builder windowsAcl(Boolean windowsAcl) {
                this.windowsAcl = windowsAcl;
                return this;
            }

            public FileShare build() {
                return new FileShare(this);
            } 

        } 

    }
    public static class FileShares extends TeaModel {
        @NameInMap("FileShare")
        private java.util.List < FileShare> fileShare;

        private FileShares(Builder builder) {
            this.fileShare = builder.fileShare;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileShares create() {
            return builder().build();
        }

        /**
         * @return fileShare
         */
        public java.util.List < FileShare> getFileShare() {
            return this.fileShare;
        }

        public static final class Builder {
            private java.util.List < FileShare> fileShare; 

            /**
             * FileShare.
             */
            public Builder fileShare(java.util.List < FileShare> fileShare) {
                this.fileShare = fileShare;
                return this;
            }

            public FileShares build() {
                return new FileShares(this);
            } 

        } 

    }
}
