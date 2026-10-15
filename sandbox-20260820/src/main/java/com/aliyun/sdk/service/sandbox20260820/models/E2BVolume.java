// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
    @com.aliyun.core.annotation.NameInMap("agenticBucketVolumeConfig")
    private AgenticBucketVolumeConfig agenticBucketVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("agenticFSVolumeConfig")
    private AgenticFSVolumeConfig agenticFSVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("juiceFSVolumeConfig")
    private JuiceFSVolumeConfig juiceFSVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("mountConfig")
    private VolumeMountConfig mountConfig;

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
        this.agenticBucketVolumeConfig = builder.agenticBucketVolumeConfig;
        this.agenticFSVolumeConfig = builder.agenticFSVolumeConfig;
        this.createdAt = builder.createdAt;
        this.juiceFSVolumeConfig = builder.juiceFSVolumeConfig;
        this.mountConfig = builder.mountConfig;
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
     * @return agenticBucketVolumeConfig
     */
    public AgenticBucketVolumeConfig getAgenticBucketVolumeConfig() {
        return this.agenticBucketVolumeConfig;
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
     * @return juiceFSVolumeConfig
     */
    public JuiceFSVolumeConfig getJuiceFSVolumeConfig() {
        return this.juiceFSVolumeConfig;
    }

    /**
     * @return mountConfig
     */
    public VolumeMountConfig getMountConfig() {
        return this.mountConfig;
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
        private AgenticBucketVolumeConfig agenticBucketVolumeConfig; 
        private AgenticFSVolumeConfig agenticFSVolumeConfig; 
        private String createdAt; 
        private JuiceFSVolumeConfig juiceFSVolumeConfig; 
        private VolumeMountConfig mountConfig; 
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
            this.agenticBucketVolumeConfig = model.agenticBucketVolumeConfig;
            this.agenticFSVolumeConfig = model.agenticFSVolumeConfig;
            this.createdAt = model.createdAt;
            this.juiceFSVolumeConfig = model.juiceFSVolumeConfig;
            this.mountConfig = model.mountConfig;
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
         * <p>The AgenticBucket volume configuration.</p>
         */
        public Builder agenticBucketVolumeConfig(AgenticBucketVolumeConfig agenticBucketVolumeConfig) {
            this.agenticBucketVolumeConfig = agenticBucketVolumeConfig;
            return this;
        }

        /**
         * <p>The AgenticFS volume configuration.</p>
         */
        public Builder agenticFSVolumeConfig(AgenticFSVolumeConfig agenticFSVolumeConfig) {
            this.agenticFSVolumeConfig = agenticFSVolumeConfig;
            return this;
        }

        /**
         * <p>The time when the volume was created, in UTC. The time is in the yyyy-MM-ddTHH:mm:ss.SSSSSSZ format, with exactly 6 decimal places for fractional seconds (microsecond precision).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07T02:12:36.531000Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The JuiceFS volume configuration.</p>
         */
        public Builder juiceFSVolumeConfig(JuiceFSVolumeConfig juiceFSVolumeConfig) {
            this.juiceFSVolumeConfig = juiceFSVolumeConfig;
            return this;
        }

        /**
         * <p>The mount configuration.</p>
         */
        public Builder mountConfig(VolumeMountConfig mountConfig) {
            this.mountConfig = mountConfig;
            return this;
        }

        /**
         * <p>The OSS volume configuration.</p>
         */
        public Builder ossVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
            this.ossVolumeConfig = ossVolumeConfig;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-****</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * <p>The volume status. Valid values:</p>
         * <ul>
         * <li>AVAILABLE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The status reason.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>OSS</li>
         * <li>AGENTIC_FS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * <p>The unique identifier of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>9f5a1fe9-****</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The time when the volume was last updated, in UTC. The time is in the yyyy-MM-ddTHH:mm:ss.SSSSSSZ format, with exactly 6 decimal places for fractional seconds (microsecond precision).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07T03:48:05.274000Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>2000****</p>
         */
        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        /**
         * <p>The unique identifier of the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>25878d34-****</p>
         */
        public Builder volumeID(String volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        /**
         * <p>The name, which is unique within the team.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace</p>
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
