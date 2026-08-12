// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link E2BVolume} extends {@link TeaModel}
 *
 * <p>E2BVolume</p>
 */
public class E2BVolume extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agenticFSVolumeConfig")
    private AgenticFSVolumeConfig agenticFSVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("ossVolumeConfig")
    private OSSVolumeConfig ossVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("storageClass")
    private String storageClass;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    @com.aliyun.core.annotation.NameInMap("volumeID")
    private String volumeID;

    @com.aliyun.core.annotation.NameInMap("volumeName")
    private String volumeName;

    private E2BVolume(Builder builder) {
        this.agenticFSVolumeConfig = builder.agenticFSVolumeConfig;
        this.createdAt = builder.createdAt;
        this.ossVolumeConfig = builder.ossVolumeConfig;
        this.resourceGroupID = builder.resourceGroupID;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.storageClass = builder.storageClass;
        this.teamID = builder.teamID;
        this.updatedAt = builder.updatedAt;
        this.userID = builder.userID;
        this.volumeID = builder.volumeID;
        this.volumeName = builder.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BVolume create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agenticFSVolumeConfig
     */
    public AgenticFSVolumeConfig getAgenticFSVolumeConfig() {
        return this.agenticFSVolumeConfig;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return ossVolumeConfig
     */
    public OSSVolumeConfig getOssVolumeConfig() {
        return this.ossVolumeConfig;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    /**
     * @return volumeID
     */
    public String getVolumeID() {
        return this.volumeID;
    }

    /**
     * @return volumeName
     */
    public String getVolumeName() {
        return this.volumeName;
    }

    public static final class Builder {
        private AgenticFSVolumeConfig agenticFSVolumeConfig; 
        private String createdAt; 
        private OSSVolumeConfig ossVolumeConfig; 
        private String resourceGroupID; 
        private String status; 
        private String statusReason; 
        private String storageClass; 
        private String teamID; 
        private String updatedAt; 
        private String userID; 
        private String volumeID; 
        private String volumeName; 

        private Builder() {
        } 

        private Builder(E2BVolume model) {
            this.agenticFSVolumeConfig = model.agenticFSVolumeConfig;
            this.createdAt = model.createdAt;
            this.ossVolumeConfig = model.ossVolumeConfig;
            this.resourceGroupID = model.resourceGroupID;
            this.status = model.status;
            this.statusReason = model.statusReason;
            this.storageClass = model.storageClass;
            this.teamID = model.teamID;
            this.updatedAt = model.updatedAt;
            this.userID = model.userID;
            this.volumeID = model.volumeID;
            this.volumeName = model.volumeName;
        } 

        /**
         * agenticFSVolumeConfig.
         */
        public Builder agenticFSVolumeConfig(AgenticFSVolumeConfig agenticFSVolumeConfig) {
            this.agenticFSVolumeConfig = agenticFSVolumeConfig;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * ossVolumeConfig.
         */
        public Builder ossVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
            this.ossVolumeConfig = ossVolumeConfig;
            return this;
        }

        /**
         * resourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * statusReason.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * storageClass.
         */
        public Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * userID.
         */
        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        /**
         * volumeID.
         */
        public Builder volumeID(String volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        /**
         * volumeName.
         */
        public Builder volumeName(String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public E2BVolume build() {
            return new E2BVolume(this);
        } 

    } 

}
