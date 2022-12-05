// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveSnapshotNotifyConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveSnapshotNotifyConfigRequest</p>
 */
public class UpdateLiveSnapshotNotifyConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("NotifyAuthKey")
    private String notifyAuthKey;

    @Query
    @NameInMap("NotifyReqAuth")
    private String notifyReqAuth;

    @Query
    @NameInMap("NotifyUrl")
    private String notifyUrl;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private UpdateLiveSnapshotNotifyConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.notifyAuthKey = builder.notifyAuthKey;
        this.notifyReqAuth = builder.notifyReqAuth;
        this.notifyUrl = builder.notifyUrl;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveSnapshotNotifyConfigRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return notifyAuthKey
     */
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    /**
     * @return notifyReqAuth
     */
    public String getNotifyReqAuth() {
        return this.notifyReqAuth;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<UpdateLiveSnapshotNotifyConfigRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private String notifyAuthKey; 
        private String notifyReqAuth; 
        private String notifyUrl; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveSnapshotNotifyConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.notifyAuthKey = request.notifyAuthKey;
            this.notifyReqAuth = request.notifyReqAuth;
            this.notifyUrl = request.notifyUrl;
            this.ownerId = request.ownerId;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * NotifyAuthKey.
         */
        public Builder notifyAuthKey(String notifyAuthKey) {
            this.putQueryParameter("NotifyAuthKey", notifyAuthKey);
            this.notifyAuthKey = notifyAuthKey;
            return this;
        }

        /**
         * NotifyReqAuth.
         */
        public Builder notifyReqAuth(String notifyReqAuth) {
            this.putQueryParameter("NotifyReqAuth", notifyReqAuth);
            this.notifyReqAuth = notifyReqAuth;
            return this;
        }

        /**
         * NotifyUrl.
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
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

        @Override
        public UpdateLiveSnapshotNotifyConfigRequest build() {
            return new UpdateLiveSnapshotNotifyConfigRequest(this);
        } 

    } 

}
