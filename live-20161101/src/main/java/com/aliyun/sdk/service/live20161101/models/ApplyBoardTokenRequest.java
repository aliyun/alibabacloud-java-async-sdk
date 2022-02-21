// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyBoardTokenRequest} extends {@link RequestModel}
 *
 * <p>ApplyBoardTokenRequest</p>
 */
public class ApplyBoardTokenRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("AppUid")
    @Validation(required = true)
    private String appUid;

    @Query
    @NameInMap("BoardId")
    @Validation(required = true)
    private String boardId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ApplyBoardTokenRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appUid = builder.appUid;
        this.boardId = builder.boardId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyBoardTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appUid
     */
    public String getAppUid() {
        return this.appUid;
    }

    /**
     * @return boardId
     */
    public String getBoardId() {
        return this.boardId;
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

    public static final class Builder extends Request.Builder<ApplyBoardTokenRequest, Builder> {
        private String appId; 
        private String appUid; 
        private String boardId; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyBoardTokenRequest response) {
            super(response);
            this.appId = response.appId;
            this.appUid = response.appUid;
            this.boardId = response.boardId;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppUid.
         */
        public Builder appUid(String appUid) {
            this.putQueryParameter("AppUid", appUid);
            this.appUid = appUid;
            return this;
        }

        /**
         * BoardId.
         */
        public Builder boardId(String boardId) {
            this.putQueryParameter("BoardId", boardId);
            this.boardId = boardId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ApplyBoardTokenRequest build() {
            return new ApplyBoardTokenRequest(this);
        } 

    } 

}
