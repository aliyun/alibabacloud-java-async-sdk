// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetBoardCallbackRequest} extends {@link RequestModel}
 *
 * <p>SetBoardCallbackRequest</p>
 */
public class SetBoardCallbackRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("AuthKey")
    private String authKey;

    @Query
    @NameInMap("AuthSwitch")
    private String authSwitch;

    @Query
    @NameInMap("CallbackEnable")
    @Validation(required = true)
    private Integer callbackEnable;

    @Query
    @NameInMap("CallbackEvents")
    private String callbackEvents;

    @Query
    @NameInMap("CallbackUri")
    private String callbackUri;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private SetBoardCallbackRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.authKey = builder.authKey;
        this.authSwitch = builder.authSwitch;
        this.callbackEnable = builder.callbackEnable;
        this.callbackEvents = builder.callbackEvents;
        this.callbackUri = builder.callbackUri;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetBoardCallbackRequest create() {
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
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSwitch
     */
    public String getAuthSwitch() {
        return this.authSwitch;
    }

    /**
     * @return callbackEnable
     */
    public Integer getCallbackEnable() {
        return this.callbackEnable;
    }

    /**
     * @return callbackEvents
     */
    public String getCallbackEvents() {
        return this.callbackEvents;
    }

    /**
     * @return callbackUri
     */
    public String getCallbackUri() {
        return this.callbackUri;
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

    public static final class Builder extends Request.Builder<SetBoardCallbackRequest, Builder> {
        private String appId; 
        private String authKey; 
        private String authSwitch; 
        private Integer callbackEnable; 
        private String callbackEvents; 
        private String callbackUri; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetBoardCallbackRequest response) {
            super(response);
            this.appId = response.appId;
            this.authKey = response.authKey;
            this.authSwitch = response.authSwitch;
            this.callbackEnable = response.callbackEnable;
            this.callbackEvents = response.callbackEvents;
            this.callbackUri = response.callbackUri;
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
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSwitch.
         */
        public Builder authSwitch(String authSwitch) {
            this.putQueryParameter("AuthSwitch", authSwitch);
            this.authSwitch = authSwitch;
            return this;
        }

        /**
         * CallbackEnable.
         */
        public Builder callbackEnable(Integer callbackEnable) {
            this.putQueryParameter("CallbackEnable", callbackEnable);
            this.callbackEnable = callbackEnable;
            return this;
        }

        /**
         * CallbackEvents.
         */
        public Builder callbackEvents(String callbackEvents) {
            this.putQueryParameter("CallbackEvents", callbackEvents);
            this.callbackEvents = callbackEvents;
            return this;
        }

        /**
         * CallbackUri.
         */
        public Builder callbackUri(String callbackUri) {
            this.putQueryParameter("CallbackUri", callbackUri);
            this.callbackUri = callbackUri;
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
        public SetBoardCallbackRequest build() {
            return new SetBoardCallbackRequest(this);
        } 

    } 

}
