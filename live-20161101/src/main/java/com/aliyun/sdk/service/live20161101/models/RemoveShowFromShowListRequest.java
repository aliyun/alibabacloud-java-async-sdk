// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveShowFromShowListRequest} extends {@link RequestModel}
 *
 * <p>RemoveShowFromShowListRequest</p>
 */
public class RemoveShowFromShowListRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ShowId")
    private String showId;

    @Query
    @NameInMap("isBatchMode")
    private Boolean isBatchMode;

    @Query
    @NameInMap("showIdList")
    private java.util.List < String > showIdList;

    private RemoveShowFromShowListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.ownerId = builder.ownerId;
        this.showId = builder.showId;
        this.isBatchMode = builder.isBatchMode;
        this.showIdList = builder.showIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveShowFromShowListRequest create() {
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
     * @return isBatchMode
     */
    public Boolean getIsBatchMode() {
        return this.isBatchMode;
    }

    /**
     * @return showIdList
     */
    public java.util.List < String > getShowIdList() {
        return this.showIdList;
    }

    public static final class Builder extends Request.Builder<RemoveShowFromShowListRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private Long ownerId; 
        private String showId; 
        private Boolean isBatchMode; 
        private java.util.List < String > showIdList; 

        private Builder() {
            super();
        } 

        private Builder(RemoveShowFromShowListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.ownerId = request.ownerId;
            this.showId = request.showId;
            this.isBatchMode = request.isBatchMode;
            this.showIdList = request.showIdList;
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
         * isBatchMode.
         */
        public Builder isBatchMode(Boolean isBatchMode) {
            this.putQueryParameter("isBatchMode", isBatchMode);
            this.isBatchMode = isBatchMode;
            return this;
        }

        /**
         * showIdList.
         */
        public Builder showIdList(java.util.List < String > showIdList) {
            this.putQueryParameter("showIdList", showIdList);
            this.showIdList = showIdList;
            return this;
        }

        @Override
        public RemoveShowFromShowListRequest build() {
            return new RemoveShowFromShowListRequest(this);
        } 

    } 

}
