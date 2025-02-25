// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayFileShareRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayFileShareRequest</p>
 */
public class CreateGatewayFileShareRequest extends Request {
    @Query
    @NameInMap("AccessBasedEnumeration")
    private Boolean accessBasedEnumeration;

    @Query
    @NameInMap("BackendLimit")
    private Integer backendLimit;

    @Query
    @NameInMap("Browsable")
    private Boolean browsable;

    @Query
    @NameInMap("BypassCacheRead")
    private Boolean bypassCacheRead;

    @Query
    @NameInMap("CacheMode")
    private String cacheMode;

    @Query
    @NameInMap("ClientSideCmk")
    private String clientSideCmk;

    @Query
    @NameInMap("ClientSideEncryption")
    private Boolean clientSideEncryption;

    @Query
    @NameInMap("DirectIO")
    private Boolean directIO;

    @Query
    @NameInMap("DownloadLimit")
    private Integer downloadLimit;

    @Query
    @NameInMap("FastReclaim")
    private Boolean fastReclaim;

    @Query
    @NameInMap("FrontendLimit")
    private Integer frontendLimit;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IgnoreDelete")
    private Boolean ignoreDelete;

    @Query
    @NameInMap("InPlace")
    private Boolean inPlace;

    @Query
    @NameInMap("KmsRotatePeriod")
    private Long kmsRotatePeriod;

    @Query
    @NameInMap("LagPeriod")
    private Long lagPeriod;

    @Query
    @NameInMap("LocalFilePath")
    @Validation(required = true)
    private String localFilePath;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("NfsV4Optimization")
    private Boolean nfsV4Optimization;

    @Query
    @NameInMap("OssBucketName")
    @Validation(required = true)
    private String ossBucketName;

    @Query
    @NameInMap("OssBucketSsl")
    private Boolean ossBucketSsl;

    @Query
    @NameInMap("OssEndpoint")
    @Validation(required = true)
    private String ossEndpoint;

    @Query
    @NameInMap("PartialSyncPaths")
    private String partialSyncPaths;

    @Query
    @NameInMap("PathPrefix")
    private String pathPrefix;

    @Query
    @NameInMap("PollingInterval")
    private Integer pollingInterval;

    @Query
    @NameInMap("ReadOnlyClientList")
    private String readOnlyClientList;

    @Query
    @NameInMap("ReadOnlyUserList")
    private String readOnlyUserList;

    @Query
    @NameInMap("ReadWriteClientList")
    private String readWriteClientList;

    @Query
    @NameInMap("ReadWriteUserList")
    private String readWriteUserList;

    @Query
    @NameInMap("RemoteSync")
    private Boolean remoteSync;

    @Query
    @NameInMap("RemoteSyncDownload")
    private Boolean remoteSyncDownload;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("ServerSideAlgorithm")
    private String serverSideAlgorithm;

    @Query
    @NameInMap("ServerSideCmk")
    private String serverSideCmk;

    @Query
    @NameInMap("ServerSideEncryption")
    private Boolean serverSideEncryption;

    @Query
    @NameInMap("ShareProtocol")
    @Validation(required = true)
    private String shareProtocol;

    @Query
    @NameInMap("Squash")
    private String squash;

    @Query
    @NameInMap("SupportArchive")
    private Boolean supportArchive;

    @Query
    @NameInMap("TransferAcceleration")
    private Boolean transferAcceleration;

    @Query
    @NameInMap("WindowsAcl")
    private Boolean windowsAcl;

    private CreateGatewayFileShareRequest(Builder builder) {
        super(builder);
        this.accessBasedEnumeration = builder.accessBasedEnumeration;
        this.backendLimit = builder.backendLimit;
        this.browsable = builder.browsable;
        this.bypassCacheRead = builder.bypassCacheRead;
        this.cacheMode = builder.cacheMode;
        this.clientSideCmk = builder.clientSideCmk;
        this.clientSideEncryption = builder.clientSideEncryption;
        this.directIO = builder.directIO;
        this.downloadLimit = builder.downloadLimit;
        this.fastReclaim = builder.fastReclaim;
        this.frontendLimit = builder.frontendLimit;
        this.gatewayId = builder.gatewayId;
        this.ignoreDelete = builder.ignoreDelete;
        this.inPlace = builder.inPlace;
        this.kmsRotatePeriod = builder.kmsRotatePeriod;
        this.lagPeriod = builder.lagPeriod;
        this.localFilePath = builder.localFilePath;
        this.name = builder.name;
        this.nfsV4Optimization = builder.nfsV4Optimization;
        this.ossBucketName = builder.ossBucketName;
        this.ossBucketSsl = builder.ossBucketSsl;
        this.ossEndpoint = builder.ossEndpoint;
        this.partialSyncPaths = builder.partialSyncPaths;
        this.pathPrefix = builder.pathPrefix;
        this.pollingInterval = builder.pollingInterval;
        this.readOnlyClientList = builder.readOnlyClientList;
        this.readOnlyUserList = builder.readOnlyUserList;
        this.readWriteClientList = builder.readWriteClientList;
        this.readWriteUserList = builder.readWriteUserList;
        this.remoteSync = builder.remoteSync;
        this.remoteSyncDownload = builder.remoteSyncDownload;
        this.securityToken = builder.securityToken;
        this.serverSideAlgorithm = builder.serverSideAlgorithm;
        this.serverSideCmk = builder.serverSideCmk;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.shareProtocol = builder.shareProtocol;
        this.squash = builder.squash;
        this.supportArchive = builder.supportArchive;
        this.transferAcceleration = builder.transferAcceleration;
        this.windowsAcl = builder.windowsAcl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayFileShareRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessBasedEnumeration
     */
    public Boolean getAccessBasedEnumeration() {
        return this.accessBasedEnumeration;
    }

    /**
     * @return backendLimit
     */
    public Integer getBackendLimit() {
        return this.backendLimit;
    }

    /**
     * @return browsable
     */
    public Boolean getBrowsable() {
        return this.browsable;
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
     * @return downloadLimit
     */
    public Integer getDownloadLimit() {
        return this.downloadLimit;
    }

    /**
     * @return fastReclaim
     */
    public Boolean getFastReclaim() {
        return this.fastReclaim;
    }

    /**
     * @return frontendLimit
     */
    public Integer getFrontendLimit() {
        return this.frontendLimit;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
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
     * @return kmsRotatePeriod
     */
    public Long getKmsRotatePeriod() {
        return this.kmsRotatePeriod;
    }

    /**
     * @return lagPeriod
     */
    public Long getLagPeriod() {
        return this.lagPeriod;
    }

    /**
     * @return localFilePath
     */
    public String getLocalFilePath() {
        return this.localFilePath;
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
     * @return readOnlyClientList
     */
    public String getReadOnlyClientList() {
        return this.readOnlyClientList;
    }

    /**
     * @return readOnlyUserList
     */
    public String getReadOnlyUserList() {
        return this.readOnlyUserList;
    }

    /**
     * @return readWriteClientList
     */
    public String getReadWriteClientList() {
        return this.readWriteClientList;
    }

    /**
     * @return readWriteUserList
     */
    public String getReadWriteUserList() {
        return this.readWriteUserList;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
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
     * @return shareProtocol
     */
    public String getShareProtocol() {
        return this.shareProtocol;
    }

    /**
     * @return squash
     */
    public String getSquash() {
        return this.squash;
    }

    /**
     * @return supportArchive
     */
    public Boolean getSupportArchive() {
        return this.supportArchive;
    }

    /**
     * @return transferAcceleration
     */
    public Boolean getTransferAcceleration() {
        return this.transferAcceleration;
    }

    /**
     * @return windowsAcl
     */
    public Boolean getWindowsAcl() {
        return this.windowsAcl;
    }

    public static final class Builder extends Request.Builder<CreateGatewayFileShareRequest, Builder> {
        private Boolean accessBasedEnumeration; 
        private Integer backendLimit; 
        private Boolean browsable; 
        private Boolean bypassCacheRead; 
        private String cacheMode; 
        private String clientSideCmk; 
        private Boolean clientSideEncryption; 
        private Boolean directIO; 
        private Integer downloadLimit; 
        private Boolean fastReclaim; 
        private Integer frontendLimit; 
        private String gatewayId; 
        private Boolean ignoreDelete; 
        private Boolean inPlace; 
        private Long kmsRotatePeriod; 
        private Long lagPeriod; 
        private String localFilePath; 
        private String name; 
        private Boolean nfsV4Optimization; 
        private String ossBucketName; 
        private Boolean ossBucketSsl; 
        private String ossEndpoint; 
        private String partialSyncPaths; 
        private String pathPrefix; 
        private Integer pollingInterval; 
        private String readOnlyClientList; 
        private String readOnlyUserList; 
        private String readWriteClientList; 
        private String readWriteUserList; 
        private Boolean remoteSync; 
        private Boolean remoteSyncDownload; 
        private String securityToken; 
        private String serverSideAlgorithm; 
        private String serverSideCmk; 
        private Boolean serverSideEncryption; 
        private String shareProtocol; 
        private String squash; 
        private Boolean supportArchive; 
        private Boolean transferAcceleration; 
        private Boolean windowsAcl; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayFileShareRequest request) {
            super(request);
            this.accessBasedEnumeration = request.accessBasedEnumeration;
            this.backendLimit = request.backendLimit;
            this.browsable = request.browsable;
            this.bypassCacheRead = request.bypassCacheRead;
            this.cacheMode = request.cacheMode;
            this.clientSideCmk = request.clientSideCmk;
            this.clientSideEncryption = request.clientSideEncryption;
            this.directIO = request.directIO;
            this.downloadLimit = request.downloadLimit;
            this.fastReclaim = request.fastReclaim;
            this.frontendLimit = request.frontendLimit;
            this.gatewayId = request.gatewayId;
            this.ignoreDelete = request.ignoreDelete;
            this.inPlace = request.inPlace;
            this.kmsRotatePeriod = request.kmsRotatePeriod;
            this.lagPeriod = request.lagPeriod;
            this.localFilePath = request.localFilePath;
            this.name = request.name;
            this.nfsV4Optimization = request.nfsV4Optimization;
            this.ossBucketName = request.ossBucketName;
            this.ossBucketSsl = request.ossBucketSsl;
            this.ossEndpoint = request.ossEndpoint;
            this.partialSyncPaths = request.partialSyncPaths;
            this.pathPrefix = request.pathPrefix;
            this.pollingInterval = request.pollingInterval;
            this.readOnlyClientList = request.readOnlyClientList;
            this.readOnlyUserList = request.readOnlyUserList;
            this.readWriteClientList = request.readWriteClientList;
            this.readWriteUserList = request.readWriteUserList;
            this.remoteSync = request.remoteSync;
            this.remoteSyncDownload = request.remoteSyncDownload;
            this.securityToken = request.securityToken;
            this.serverSideAlgorithm = request.serverSideAlgorithm;
            this.serverSideCmk = request.serverSideCmk;
            this.serverSideEncryption = request.serverSideEncryption;
            this.shareProtocol = request.shareProtocol;
            this.squash = request.squash;
            this.supportArchive = request.supportArchive;
            this.transferAcceleration = request.transferAcceleration;
            this.windowsAcl = request.windowsAcl;
        } 

        /**
         * AccessBasedEnumeration.
         */
        public Builder accessBasedEnumeration(Boolean accessBasedEnumeration) {
            this.putQueryParameter("AccessBasedEnumeration", accessBasedEnumeration);
            this.accessBasedEnumeration = accessBasedEnumeration;
            return this;
        }

        /**
         * BackendLimit.
         */
        public Builder backendLimit(Integer backendLimit) {
            this.putQueryParameter("BackendLimit", backendLimit);
            this.backendLimit = backendLimit;
            return this;
        }

        /**
         * Browsable.
         */
        public Builder browsable(Boolean browsable) {
            this.putQueryParameter("Browsable", browsable);
            this.browsable = browsable;
            return this;
        }

        /**
         * BypassCacheRead.
         */
        public Builder bypassCacheRead(Boolean bypassCacheRead) {
            this.putQueryParameter("BypassCacheRead", bypassCacheRead);
            this.bypassCacheRead = bypassCacheRead;
            return this;
        }

        /**
         * CacheMode.
         */
        public Builder cacheMode(String cacheMode) {
            this.putQueryParameter("CacheMode", cacheMode);
            this.cacheMode = cacheMode;
            return this;
        }

        /**
         * ClientSideCmk.
         */
        public Builder clientSideCmk(String clientSideCmk) {
            this.putQueryParameter("ClientSideCmk", clientSideCmk);
            this.clientSideCmk = clientSideCmk;
            return this;
        }

        /**
         * ClientSideEncryption.
         */
        public Builder clientSideEncryption(Boolean clientSideEncryption) {
            this.putQueryParameter("ClientSideEncryption", clientSideEncryption);
            this.clientSideEncryption = clientSideEncryption;
            return this;
        }

        /**
         * DirectIO.
         */
        public Builder directIO(Boolean directIO) {
            this.putQueryParameter("DirectIO", directIO);
            this.directIO = directIO;
            return this;
        }

        /**
         * DownloadLimit.
         */
        public Builder downloadLimit(Integer downloadLimit) {
            this.putQueryParameter("DownloadLimit", downloadLimit);
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * FastReclaim.
         */
        public Builder fastReclaim(Boolean fastReclaim) {
            this.putQueryParameter("FastReclaim", fastReclaim);
            this.fastReclaim = fastReclaim;
            return this;
        }

        /**
         * FrontendLimit.
         */
        public Builder frontendLimit(Integer frontendLimit) {
            this.putQueryParameter("FrontendLimit", frontendLimit);
            this.frontendLimit = frontendLimit;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * IgnoreDelete.
         */
        public Builder ignoreDelete(Boolean ignoreDelete) {
            this.putQueryParameter("IgnoreDelete", ignoreDelete);
            this.ignoreDelete = ignoreDelete;
            return this;
        }

        /**
         * InPlace.
         */
        public Builder inPlace(Boolean inPlace) {
            this.putQueryParameter("InPlace", inPlace);
            this.inPlace = inPlace;
            return this;
        }

        /**
         * KmsRotatePeriod.
         */
        public Builder kmsRotatePeriod(Long kmsRotatePeriod) {
            this.putQueryParameter("KmsRotatePeriod", kmsRotatePeriod);
            this.kmsRotatePeriod = kmsRotatePeriod;
            return this;
        }

        /**
         * LagPeriod.
         */
        public Builder lagPeriod(Long lagPeriod) {
            this.putQueryParameter("LagPeriod", lagPeriod);
            this.lagPeriod = lagPeriod;
            return this;
        }

        /**
         * LocalFilePath.
         */
        public Builder localFilePath(String localFilePath) {
            this.putQueryParameter("LocalFilePath", localFilePath);
            this.localFilePath = localFilePath;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NfsV4Optimization.
         */
        public Builder nfsV4Optimization(Boolean nfsV4Optimization) {
            this.putQueryParameter("NfsV4Optimization", nfsV4Optimization);
            this.nfsV4Optimization = nfsV4Optimization;
            return this;
        }

        /**
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssBucketSsl.
         */
        public Builder ossBucketSsl(Boolean ossBucketSsl) {
            this.putQueryParameter("OssBucketSsl", ossBucketSsl);
            this.ossBucketSsl = ossBucketSsl;
            return this;
        }

        /**
         * OssEndpoint.
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.putQueryParameter("OssEndpoint", ossEndpoint);
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * PartialSyncPaths.
         */
        public Builder partialSyncPaths(String partialSyncPaths) {
            this.putQueryParameter("PartialSyncPaths", partialSyncPaths);
            this.partialSyncPaths = partialSyncPaths;
            return this;
        }

        /**
         * PathPrefix.
         */
        public Builder pathPrefix(String pathPrefix) {
            this.putQueryParameter("PathPrefix", pathPrefix);
            this.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * PollingInterval.
         */
        public Builder pollingInterval(Integer pollingInterval) {
            this.putQueryParameter("PollingInterval", pollingInterval);
            this.pollingInterval = pollingInterval;
            return this;
        }

        /**
         * ReadOnlyClientList.
         */
        public Builder readOnlyClientList(String readOnlyClientList) {
            this.putQueryParameter("ReadOnlyClientList", readOnlyClientList);
            this.readOnlyClientList = readOnlyClientList;
            return this;
        }

        /**
         * ReadOnlyUserList.
         */
        public Builder readOnlyUserList(String readOnlyUserList) {
            this.putQueryParameter("ReadOnlyUserList", readOnlyUserList);
            this.readOnlyUserList = readOnlyUserList;
            return this;
        }

        /**
         * ReadWriteClientList.
         */
        public Builder readWriteClientList(String readWriteClientList) {
            this.putQueryParameter("ReadWriteClientList", readWriteClientList);
            this.readWriteClientList = readWriteClientList;
            return this;
        }

        /**
         * ReadWriteUserList.
         */
        public Builder readWriteUserList(String readWriteUserList) {
            this.putQueryParameter("ReadWriteUserList", readWriteUserList);
            this.readWriteUserList = readWriteUserList;
            return this;
        }

        /**
         * RemoteSync.
         */
        public Builder remoteSync(Boolean remoteSync) {
            this.putQueryParameter("RemoteSync", remoteSync);
            this.remoteSync = remoteSync;
            return this;
        }

        /**
         * RemoteSyncDownload.
         */
        public Builder remoteSyncDownload(Boolean remoteSyncDownload) {
            this.putQueryParameter("RemoteSyncDownload", remoteSyncDownload);
            this.remoteSyncDownload = remoteSyncDownload;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * ServerSideAlgorithm.
         */
        public Builder serverSideAlgorithm(String serverSideAlgorithm) {
            this.putQueryParameter("ServerSideAlgorithm", serverSideAlgorithm);
            this.serverSideAlgorithm = serverSideAlgorithm;
            return this;
        }

        /**
         * ServerSideCmk.
         */
        public Builder serverSideCmk(String serverSideCmk) {
            this.putQueryParameter("ServerSideCmk", serverSideCmk);
            this.serverSideCmk = serverSideCmk;
            return this;
        }

        /**
         * ServerSideEncryption.
         */
        public Builder serverSideEncryption(Boolean serverSideEncryption) {
            this.putQueryParameter("ServerSideEncryption", serverSideEncryption);
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * ShareProtocol.
         */
        public Builder shareProtocol(String shareProtocol) {
            this.putQueryParameter("ShareProtocol", shareProtocol);
            this.shareProtocol = shareProtocol;
            return this;
        }

        /**
         * Squash.
         */
        public Builder squash(String squash) {
            this.putQueryParameter("Squash", squash);
            this.squash = squash;
            return this;
        }

        /**
         * SupportArchive.
         */
        public Builder supportArchive(Boolean supportArchive) {
            this.putQueryParameter("SupportArchive", supportArchive);
            this.supportArchive = supportArchive;
            return this;
        }

        /**
         * TransferAcceleration.
         */
        public Builder transferAcceleration(Boolean transferAcceleration) {
            this.putQueryParameter("TransferAcceleration", transferAcceleration);
            this.transferAcceleration = transferAcceleration;
            return this;
        }

        /**
         * WindowsAcl.
         */
        public Builder windowsAcl(Boolean windowsAcl) {
            this.putQueryParameter("WindowsAcl", windowsAcl);
            this.windowsAcl = windowsAcl;
            return this;
        }

        @Override
        public CreateGatewayFileShareRequest build() {
            return new CreateGatewayFileShareRequest(this);
        } 

    } 

}
