// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContainerLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerLogRequest</p>
 */
public class DescribeContainerLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String containerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String containerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastTime")
    private Boolean lastTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitBytes")
    private Long limitBytes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SinceSeconds")
    private Integer sinceSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tail")
    private Integer tail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timestamps")
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-uf6fonnghi50v6nq****</p>
         */
        public Builder containerGroupId(String containerGroupId) {
            this.putQueryParameter("ContainerGroupId", containerGroupId);
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * <p>The name of the container.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * <p>Specifies whether to query the logs of the previous container if the container exits and restarts. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder lastTime(Boolean lastTime) {
            this.putQueryParameter("LastTime", lastTime);
            this.lastTime = lastTime;
            return this;
        }

        /**
         * <p>The limit on the total size of logs. Unit: bytes. Valid values: 1 to 1048576(1 MB).</p>
         * 
         * <strong>example:</strong>
         * <p>123798</p>
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
         * <p>The region ID of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>A relative time in seconds before the current time from which to show logs. Examples: 10, 20, and 30.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder sinceSeconds(Integer sinceSeconds) {
            this.putQueryParameter("SinceSeconds", sinceSeconds);
            this.sinceSeconds = sinceSeconds;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the RFC 3339 standard. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-02T15:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The number of the most recent log entries that you want to query. Default value: 500. Maximum value: 2000.<br>A maximum of 1 MB log data can be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder tail(Integer tail) {
            this.putQueryParameter("Tail", tail);
            this.tail = tail;
            return this;
        }

        /**
         * <p>Specifies whether to return the timestamps of logs. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
