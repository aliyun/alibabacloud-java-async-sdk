// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBackupConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetBackupConfigResponseBody</p>
 */
public class GetBackupConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private Integer backupMode;

    @com.aliyun.core.annotation.NameInMap("Bucket")
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("EnableBackup")
    private Boolean enableBackup;

    @com.aliyun.core.annotation.NameInMap("EnableBackupVoice")
    private Boolean enableBackupVoice;

    @com.aliyun.core.annotation.NameInMap("ExpireSeconds")
    private Integer expireSeconds;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("PathVoice")
    private String pathVoice;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private GetBackupConfigResponseBody(Builder builder) {
        this.backupMode = builder.backupMode;
        this.bucket = builder.bucket;
        this.enable = builder.enable;
        this.enableBackup = builder.enableBackup;
        this.enableBackupVoice = builder.enableBackupVoice;
        this.expireSeconds = builder.expireSeconds;
        this.gmtModified = builder.gmtModified;
        this.path = builder.path;
        this.pathVoice = builder.pathVoice;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.serviceCode = builder.serviceCode;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBackupConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupMode
     */
    public Integer getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return enableBackup
     */
    public Boolean getEnableBackup() {
        return this.enableBackup;
    }

    /**
     * @return enableBackupVoice
     */
    public Boolean getEnableBackupVoice() {
        return this.enableBackupVoice;
    }

    /**
     * @return expireSeconds
     */
    public Integer getExpireSeconds() {
        return this.expireSeconds;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return pathVoice
     */
    public String getPathVoice() {
        return this.pathVoice;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private Integer backupMode; 
        private String bucket; 
        private Boolean enable; 
        private Boolean enableBackup; 
        private Boolean enableBackupVoice; 
        private Integer expireSeconds; 
        private String gmtModified; 
        private String path; 
        private String pathVoice; 
        private String region; 
        private String requestId; 
        private String resourceType; 
        private String serviceCode; 
        private String uid; 

        /**
         * BackupMode.
         */
        public Builder backupMode(Integer backupMode) {
            this.backupMode = backupMode;
            return this;
        }

        /**
         * Bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * EnableBackup.
         */
        public Builder enableBackup(Boolean enableBackup) {
            this.enableBackup = enableBackup;
            return this;
        }

        /**
         * EnableBackupVoice.
         */
        public Builder enableBackupVoice(Boolean enableBackupVoice) {
            this.enableBackupVoice = enableBackupVoice;
            return this;
        }

        /**
         * ExpireSeconds.
         */
        public Builder expireSeconds(Integer expireSeconds) {
            this.expireSeconds = expireSeconds;
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
         * Path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * PathVoice.
         */
        public Builder pathVoice(String pathVoice) {
            this.pathVoice = pathVoice;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * UID。
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public GetBackupConfigResponseBody build() {
            return new GetBackupConfigResponseBody(this);
        } 

    } 

}
