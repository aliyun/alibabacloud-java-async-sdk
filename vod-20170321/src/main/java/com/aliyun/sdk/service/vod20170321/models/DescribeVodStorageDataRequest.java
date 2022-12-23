// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodStorageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodStorageDataRequest</p>
 */
public class DescribeVodStorageDataRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Storage")
    private String storage;

    @Query
    @NameInMap("StorageType")
    private String storageType;

    private DescribeVodStorageDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.startTime = builder.startTime;
        this.storage = builder.storage;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodStorageDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return storage
     */
    public String getStorage() {
        return this.storage;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<DescribeVodStorageDataRequest, Builder> {
        private String endTime; 
        private Long ownerId; 
        private String region; 
        private String startTime; 
        private String storage; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodStorageDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.startTime = request.startTime;
            this.storage = request.storage;
            this.storageType = request.storageType;
        } 

        /**
         * The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * The region where media assets are stored. If you do not set this parameter, the data in all regions is returned. You can specify multiple regions. Separate them with commas (,). Valid values:
         * <p>
         * 
         * *   **cn-shanghai**: China (Shanghai)
         * *   **cn-beijing**: China (Beijing)
         * *   **eu-central-1**: Germany (Frankfurt)
         * *   **ap-southeast-1**: Singapore
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The name of the Object Storage Service (OSS) bucket. If you do not set this parameter, the data of all buckets is returned. You can specify multiple buckets. Separate them with commas (,).
         */
        public Builder storage(String storage) {
            this.putQueryParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        /**
         * The storage type. Set the value to **OSS**.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public DescribeVodStorageDataRequest build() {
            return new DescribeVodStorageDataRequest(this);
        } 

    } 

}
