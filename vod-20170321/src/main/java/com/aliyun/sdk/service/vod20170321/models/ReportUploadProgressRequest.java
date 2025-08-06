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
 * {@link ReportUploadProgressRequest} extends {@link RequestModel}
 *
 * <p>ReportUploadProgressRequest</p>
 */
public class ReportUploadProgressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DonePartsCount")
    private Integer donePartsCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileCreateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileHash")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileHash;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fileSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long partSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String terminalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalPart")
    private Integer totalPart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadAddress")
    private String uploadAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadPoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadPoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadRatio")
    private Float uploadRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    private String videoId;

    private ReportUploadProgressRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.authInfo = builder.authInfo;
        this.authTimestamp = builder.authTimestamp;
        this.businessType = builder.businessType;
        this.clientId = builder.clientId;
        this.deviceModel = builder.deviceModel;
        this.donePartsCount = builder.donePartsCount;
        this.fileCreateTime = builder.fileCreateTime;
        this.fileHash = builder.fileHash;
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.ownerId = builder.ownerId;
        this.partSize = builder.partSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.source = builder.source;
        this.terminalType = builder.terminalType;
        this.totalPart = builder.totalPart;
        this.uploadAddress = builder.uploadAddress;
        this.uploadId = builder.uploadId;
        this.uploadPoint = builder.uploadPoint;
        this.uploadRatio = builder.uploadRatio;
        this.userId = builder.userId;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportUploadProgressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return authInfo
     */
    public String getAuthInfo() {
        return this.authInfo;
    }

    /**
     * @return authTimestamp
     */
    public Long getAuthTimestamp() {
        return this.authTimestamp;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return deviceModel
     */
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * @return donePartsCount
     */
    public Integer getDonePartsCount() {
        return this.donePartsCount;
    }

    /**
     * @return fileCreateTime
     */
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    /**
     * @return fileHash
     */
    public String getFileHash() {
        return this.fileHash;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return partSize
     */
    public Long getPartSize() {
        return this.partSize;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return terminalType
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    /**
     * @return totalPart
     */
    public Integer getTotalPart() {
        return this.totalPart;
    }

    /**
     * @return uploadAddress
     */
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * @return uploadPoint
     */
    public String getUploadPoint() {
        return this.uploadPoint;
    }

    /**
     * @return uploadRatio
     */
    public Float getUploadRatio() {
        return this.uploadRatio;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<ReportUploadProgressRequest, Builder> {
        private String appVersion; 
        private String authInfo; 
        private Long authTimestamp; 
        private String businessType; 
        private String clientId; 
        private String deviceModel; 
        private Integer donePartsCount; 
        private String fileCreateTime; 
        private String fileHash; 
        private String fileName; 
        private Long fileSize; 
        private Long ownerId; 
        private Long partSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String source; 
        private String terminalType; 
        private Integer totalPart; 
        private String uploadAddress; 
        private String uploadId; 
        private String uploadPoint; 
        private Float uploadRatio; 
        private Long userId; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(ReportUploadProgressRequest request) {
            super(request);
            this.appVersion = request.appVersion;
            this.authInfo = request.authInfo;
            this.authTimestamp = request.authTimestamp;
            this.businessType = request.businessType;
            this.clientId = request.clientId;
            this.deviceModel = request.deviceModel;
            this.donePartsCount = request.donePartsCount;
            this.fileCreateTime = request.fileCreateTime;
            this.fileHash = request.fileHash;
            this.fileName = request.fileName;
            this.fileSize = request.fileSize;
            this.ownerId = request.ownerId;
            this.partSize = request.partSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.source = request.source;
            this.terminalType = request.terminalType;
            this.totalPart = request.totalPart;
            this.uploadAddress = request.uploadAddress;
            this.uploadId = request.uploadId;
            this.uploadPoint = request.uploadPoint;
            this.uploadRatio = request.uploadRatio;
            this.userId = request.userId;
            this.videoId = request.videoId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder authInfo(String authInfo) {
            this.putQueryParameter("AuthInfo", authInfo);
            this.authInfo = authInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder authTimestamp(Long authTimestamp) {
            this.putQueryParameter("AuthTimestamp", authTimestamp);
            this.authTimestamp = authTimestamp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deviceModel(String deviceModel) {
            this.putQueryParameter("DeviceModel", deviceModel);
            this.deviceModel = deviceModel;
            return this;
        }

        /**
         * DonePartsCount.
         */
        public Builder donePartsCount(Integer donePartsCount) {
            this.putQueryParameter("DonePartsCount", donePartsCount);
            this.donePartsCount = donePartsCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fileCreateTime(String fileCreateTime) {
            this.putQueryParameter("FileCreateTime", fileCreateTime);
            this.fileCreateTime = fileCreateTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fileHash(String fileHash) {
            this.putQueryParameter("FileHash", fileHash);
            this.fileHash = fileHash;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fileSize(Long fileSize) {
            this.putQueryParameter("FileSize", fileSize);
            this.fileSize = fileSize;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder partSize(Long partSize) {
            this.putQueryParameter("PartSize", partSize);
            this.partSize = partSize;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder terminalType(String terminalType) {
            this.putQueryParameter("TerminalType", terminalType);
            this.terminalType = terminalType;
            return this;
        }

        /**
         * TotalPart.
         */
        public Builder totalPart(Integer totalPart) {
            this.putQueryParameter("TotalPart", totalPart);
            this.totalPart = totalPart;
            return this;
        }

        /**
         * UploadAddress.
         */
        public Builder uploadAddress(String uploadAddress) {
            this.putQueryParameter("UploadAddress", uploadAddress);
            this.uploadAddress = uploadAddress;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("UploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uploadPoint(String uploadPoint) {
            this.putQueryParameter("UploadPoint", uploadPoint);
            this.uploadPoint = uploadPoint;
            return this;
        }

        /**
         * UploadRatio.
         */
        public Builder uploadRatio(Float uploadRatio) {
            this.putQueryParameter("UploadRatio", uploadRatio);
            this.uploadRatio = uploadRatio;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * VideoId.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public ReportUploadProgressRequest build() {
            return new ReportUploadProgressRequest(this);
        } 

    } 

}
