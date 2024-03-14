// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayFileShareRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayFileShareRequest</p>
 */
public class UpdateGatewayFileShareRequest extends Request {
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
    @NameInMap("IndexId")
    @Validation(required = true)
    private String indexId;

    @Query
    @NameInMap("KmsRotatePeriod")
    private Long kmsRotatePeriod;

    @Query
    @NameInMap("LagPeriod")
    private Long lagPeriod;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("NfsV4Optimization")
    private Boolean nfsV4Optimization;

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
    @NameInMap("ServerSideCmk")
    private String serverSideCmk;

    @Query
    @NameInMap("ServerSideEncryption")
    private Boolean serverSideEncryption;

    @Query
    @NameInMap("Squash")
    private String squash;

    @Query
    @NameInMap("TransferAcceleration")
    private Boolean transferAcceleration;

    @Query
    @NameInMap("WindowsAcl")
    private Boolean windowsAcl;

    private UpdateGatewayFileShareRequest(Builder builder) {
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
        this.indexId = builder.indexId;
        this.kmsRotatePeriod = builder.kmsRotatePeriod;
        this.lagPeriod = builder.lagPeriod;
        this.name = builder.name;
        this.nfsV4Optimization = builder.nfsV4Optimization;
        this.pollingInterval = builder.pollingInterval;
        this.readOnlyClientList = builder.readOnlyClientList;
        this.readOnlyUserList = builder.readOnlyUserList;
        this.readWriteClientList = builder.readWriteClientList;
        this.readWriteUserList = builder.readWriteUserList;
        this.remoteSync = builder.remoteSync;
        this.remoteSyncDownload = builder.remoteSyncDownload;
        this.securityToken = builder.securityToken;
        this.serverSideCmk = builder.serverSideCmk;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.squash = builder.squash;
        this.transferAcceleration = builder.transferAcceleration;
        this.windowsAcl = builder.windowsAcl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayFileShareRequest create() {
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
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
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
     * @return squash
     */
    public String getSquash() {
        return this.squash;
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

    public static final class Builder extends Request.Builder<UpdateGatewayFileShareRequest, Builder> {
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
        private String indexId; 
        private Long kmsRotatePeriod; 
        private Long lagPeriod; 
        private String name; 
        private Boolean nfsV4Optimization; 
        private Integer pollingInterval; 
        private String readOnlyClientList; 
        private String readOnlyUserList; 
        private String readWriteClientList; 
        private String readWriteUserList; 
        private Boolean remoteSync; 
        private Boolean remoteSyncDownload; 
        private String securityToken; 
        private String serverSideCmk; 
        private Boolean serverSideEncryption; 
        private String squash; 
        private Boolean transferAcceleration; 
        private Boolean windowsAcl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayFileShareRequest request) {
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
            this.indexId = request.indexId;
            this.kmsRotatePeriod = request.kmsRotatePeriod;
            this.lagPeriod = request.lagPeriod;
            this.name = request.name;
            this.nfsV4Optimization = request.nfsV4Optimization;
            this.pollingInterval = request.pollingInterval;
            this.readOnlyClientList = request.readOnlyClientList;
            this.readOnlyUserList = request.readOnlyUserList;
            this.readWriteClientList = request.readWriteClientList;
            this.readWriteUserList = request.readWriteUserList;
            this.remoteSync = request.remoteSync;
            this.remoteSyncDownload = request.remoteSyncDownload;
            this.securityToken = request.securityToken;
            this.serverSideCmk = request.serverSideCmk;
            this.serverSideEncryption = request.serverSideEncryption;
            this.squash = request.squash;
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
         * IndexId.
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
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
         * Squash.
         */
        public Builder squash(String squash) {
            this.putQueryParameter("Squash", squash);
            this.squash = squash;
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
        public UpdateGatewayFileShareRequest build() {
            return new UpdateGatewayFileShareRequest(this);
        } 

    } 

}
