// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditShowAndReplaceRequest} extends {@link RequestModel}
 *
 * <p>EditShowAndReplaceRequest</p>
 */
public class EditShowAndReplaceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("EndTime")
    private Float endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ShowId")
    @Validation(required = true)
    private String showId;

    @Query
    @NameInMap("StartTime")
    private Float startTime;

    @Query
    @NameInMap("StorageInfo")
    private String storageInfo;

    @Query
    @NameInMap("UserData")
    private String userData;

    private EditShowAndReplaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.showId = builder.showId;
        this.startTime = builder.startTime;
        this.storageInfo = builder.storageInfo;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditShowAndReplaceRequest create() {
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
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return endTime
     */
    public Float getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return showId
     */
    public String getShowId() {
        return this.showId;
    }

    /**
     * @return startTime
     */
    public Float getStartTime() {
        return this.startTime;
    }

    /**
     * @return storageInfo
     */
    public String getStorageInfo() {
        return this.storageInfo;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<EditShowAndReplaceRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private Float endTime; 
        private Long ownerId; 
        private String showId; 
        private Float startTime; 
        private String storageInfo; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(EditShowAndReplaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.showId = request.showId;
            this.startTime = request.startTime;
            this.storageInfo = request.storageInfo;
            this.userData = request.userData;
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
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Float endTime) {
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
         * ShowId.
         */
        public Builder showId(String showId) {
            this.putQueryParameter("ShowId", showId);
            this.showId = showId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Float startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StorageInfo.
         */
        public Builder storageInfo(String storageInfo) {
            this.putQueryParameter("StorageInfo", storageInfo);
            this.storageInfo = storageInfo;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public EditShowAndReplaceRequest build() {
            return new EditShowAndReplaceRequest(this);
        } 

    } 

}
