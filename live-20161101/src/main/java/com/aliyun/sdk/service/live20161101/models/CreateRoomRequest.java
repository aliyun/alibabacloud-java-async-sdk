// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRoomRequest} extends {@link RequestModel}
 *
 * <p>CreateRoomRequest</p>
 */
public class CreateRoomRequest extends Request {
    @Query
    @NameInMap("AnchorId")
    @Validation(required = true)
    private String anchorId;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    @Query
    @NameInMap("TemplateIds")
    private String templateIds;

    @Query
    @NameInMap("UseAppTranscode")
    private Boolean useAppTranscode;

    private CreateRoomRequest(Builder builder) {
        super(builder);
        this.anchorId = builder.anchorId;
        this.appId = builder.appId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
        this.templateIds = builder.templateIds;
        this.useAppTranscode = builder.useAppTranscode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoomRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anchorId
     */
    public String getAnchorId() {
        return this.anchorId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    /**
     * @return templateIds
     */
    public String getTemplateIds() {
        return this.templateIds;
    }

    /**
     * @return useAppTranscode
     */
    public Boolean getUseAppTranscode() {
        return this.useAppTranscode;
    }

    public static final class Builder extends Request.Builder<CreateRoomRequest, Builder> {
        private String anchorId; 
        private String appId; 
        private Long ownerId; 
        private String regionId; 
        private String roomId; 
        private String templateIds; 
        private Boolean useAppTranscode; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoomRequest response) {
            super(response);
            this.anchorId = response.anchorId;
            this.appId = response.appId;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.roomId = response.roomId;
            this.templateIds = response.templateIds;
            this.useAppTranscode = response.useAppTranscode;
        } 

        /**
         * AnchorId.
         */
        public Builder anchorId(String anchorId) {
            this.putQueryParameter("AnchorId", anchorId);
            this.anchorId = anchorId;
            return this;
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

        /**
         * RoomId.
         */
        public Builder roomId(String roomId) {
            this.putQueryParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * TemplateIds.
         */
        public Builder templateIds(String templateIds) {
            this.putQueryParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        /**
         * UseAppTranscode.
         */
        public Builder useAppTranscode(Boolean useAppTranscode) {
            this.putQueryParameter("UseAppTranscode", useAppTranscode);
            this.useAppTranscode = useAppTranscode;
            return this;
        }

        @Override
        public CreateRoomRequest build() {
            return new CreateRoomRequest(this);
        } 

    } 

}
