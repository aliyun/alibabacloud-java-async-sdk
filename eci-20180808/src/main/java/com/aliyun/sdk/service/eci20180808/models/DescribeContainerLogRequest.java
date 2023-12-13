// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerLogRequest</p>
 */
public class DescribeContainerLogRequest extends Request {
    @Query
    @NameInMap("ContainerGroupId")
    @Validation(required = true)
    private String containerGroupId;

    @Query
    @NameInMap("ContainerName")
    @Validation(required = true)
    private String containerName;

    @Query
    @NameInMap("LastTime")
    private Boolean lastTime;

    @Query
    @NameInMap("LimitBytes")
    private Long limitBytes;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SinceSeconds")
    private Integer sinceSeconds;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Tail")
    private Integer tail;

    @Query
    @NameInMap("Timestamps")
    private Boolean timestamps;

    private DescribeContainerLogRequest(Builder builder) {
        super(builder);
        this.containerGroupId = builder.containerGroupId;
        this.containerName = builder.containerName;
        this.lastTime = builder.lastTime;
        this.limitBytes = builder.limitBytes;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sinceSeconds = builder.sinceSeconds;
        this.startTime = builder.startTime;
        this.tail = builder.tail;
        this.timestamps = builder.timestamps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerGroupId
     */
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    /**
     * @return containerName
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * @return lastTime
     */
    public Boolean getLastTime() {
        return this.lastTime;
    }

    /**
     * @return limitBytes
     */
    public Long getLimitBytes() {
        return this.limitBytes;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return sinceSeconds
     */
    public Integer getSinceSeconds() {
        return this.sinceSeconds;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tail
     */
    public Integer getTail() {
        return this.tail;
    }

    /**
     * @return timestamps
     */
    public Boolean getTimestamps() {
        return this.timestamps;
    }

    public static final class Builder extends Request.Builder<DescribeContainerLogRequest, Builder> {
        private String containerGroupId; 
        private String containerName; 
        private Boolean lastTime; 
        private Long limitBytes; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer sinceSeconds; 
        private String startTime; 
        private Integer tail; 
        private Boolean timestamps; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerLogRequest request) {
            super(request);
            this.containerGroupId = request.containerGroupId;
            this.containerName = request.containerName;
            this.lastTime = request.lastTime;
            this.limitBytes = request.limitBytes;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sinceSeconds = request.sinceSeconds;
            this.startTime = request.startTime;
            this.tail = request.tail;
            this.timestamps = request.timestamps;
        } 

        /**
         * The instance ID.
         */
        public Builder containerGroupId(String containerGroupId) {
            this.putQueryParameter("ContainerGroupId", containerGroupId);
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * The name of the container.
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * Specifies whether to query the logs of the previous container if the container exits and restarts. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder lastTime(Boolean lastTime) {
            this.putQueryParameter("LastTime", lastTime);
            this.lastTime = lastTime;
            return this;
        }

        /**
         * The limit on the total size of logs. Unit: bytes. Valid values: 1 to 1048576(1 MB).
         */
        public Builder limitBytes(Long limitBytes) {
            this.putQueryParameter("LimitBytes", limitBytes);
            this.limitBytes = limitBytes;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * The region ID of the elastic container instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * A relative time in seconds before the current time from which to show logs. Examples: 10, 20, and 30.
         */
        public Builder sinceSeconds(Integer sinceSeconds) {
            this.putQueryParameter("SinceSeconds", sinceSeconds);
            this.sinceSeconds = sinceSeconds;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the RFC 3339 standard. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The number of log entries that you want to query. Default value: 500. Maximum value: 2000. A maximum of 1 MB of logs can be returned.
         */
        public Builder tail(Integer tail) {
            this.putQueryParameter("Tail", tail);
            this.tail = tail;
            return this;
        }

        /**
         * Specifies whether to return the timestamps of logs. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder timestamps(Boolean timestamps) {
            this.putQueryParameter("Timestamps", timestamps);
            this.timestamps = timestamps;
            return this;
        }

        @Override
        public DescribeContainerLogRequest build() {
            return new DescribeContainerLogRequest(this);
        } 

    } 

}
