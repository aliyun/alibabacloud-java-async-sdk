// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveRecordVodConfigRequest} extends {@link RequestModel}
 *
 * <p>AddLiveRecordVodConfigRequest</p>
 */
public class AddLiveRecordVodConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("AutoCompose")
    private String autoCompose;

    @Query
    @NameInMap("ComposeVodTranscodeGroupId")
    private String composeVodTranscodeGroupId;

    @Query
    @NameInMap("CycleDuration")
    @Validation(maximum = 21600, minimum = 300)
    private Integer cycleDuration;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StorageLocation")
    private String storageLocation;

    @Query
    @NameInMap("StreamName")
    private String streamName;

    @Query
    @NameInMap("VodTranscodeGroupId")
    @Validation(required = true)
    private String vodTranscodeGroupId;

    private AddLiveRecordVodConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.autoCompose = builder.autoCompose;
        this.composeVodTranscodeGroupId = builder.composeVodTranscodeGroupId;
        this.cycleDuration = builder.cycleDuration;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.storageLocation = builder.storageLocation;
        this.streamName = builder.streamName;
        this.vodTranscodeGroupId = builder.vodTranscodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveRecordVodConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return autoCompose
     */
    public String getAutoCompose() {
        return this.autoCompose;
    }

    /**
     * @return composeVodTranscodeGroupId
     */
    public String getComposeVodTranscodeGroupId() {
        return this.composeVodTranscodeGroupId;
    }

    /**
     * @return cycleDuration
     */
    public Integer getCycleDuration() {
        return this.cycleDuration;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return vodTranscodeGroupId
     */
    public String getVodTranscodeGroupId() {
        return this.vodTranscodeGroupId;
    }

    public static final class Builder extends Request.Builder<AddLiveRecordVodConfigRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String autoCompose; 
        private String composeVodTranscodeGroupId; 
        private Integer cycleDuration; 
        private String domainName; 
        private Long ownerId; 
        private String storageLocation; 
        private String streamName; 
        private String vodTranscodeGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveRecordVodConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.autoCompose = request.autoCompose;
            this.composeVodTranscodeGroupId = request.composeVodTranscodeGroupId;
            this.cycleDuration = request.cycleDuration;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.storageLocation = request.storageLocation;
            this.streamName = request.streamName;
            this.vodTranscodeGroupId = request.vodTranscodeGroupId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AutoCompose.
         */
        public Builder autoCompose(String autoCompose) {
            this.putQueryParameter("AutoCompose", autoCompose);
            this.autoCompose = autoCompose;
            return this;
        }

        /**
         * ComposeVodTranscodeGroupId.
         */
        public Builder composeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
            this.putQueryParameter("ComposeVodTranscodeGroupId", composeVodTranscodeGroupId);
            this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
            return this;
        }

        /**
         * CycleDuration.
         */
        public Builder cycleDuration(Integer cycleDuration) {
            this.putQueryParameter("CycleDuration", cycleDuration);
            this.cycleDuration = cycleDuration;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * StorageLocation.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * VodTranscodeGroupId.
         */
        public Builder vodTranscodeGroupId(String vodTranscodeGroupId) {
            this.putQueryParameter("VodTranscodeGroupId", vodTranscodeGroupId);
            this.vodTranscodeGroupId = vodTranscodeGroupId;
            return this;
        }

        @Override
        public AddLiveRecordVodConfigRequest build() {
            return new AddLiveRecordVodConfigRequest(this);
        } 

    } 

}
