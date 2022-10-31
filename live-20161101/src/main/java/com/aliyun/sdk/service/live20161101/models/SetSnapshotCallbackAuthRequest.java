// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSnapshotCallbackAuthRequest} extends {@link RequestModel}
 *
 * <p>SetSnapshotCallbackAuthRequest</p>
 */
public class SetSnapshotCallbackAuthRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CallbackAuthKey")
    @Validation(required = true)
    private String callbackAuthKey;

    @Query
    @NameInMap("CallbackReqAuth")
    @Validation(required = true)
    private String callbackReqAuth;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetSnapshotCallbackAuthRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.callbackAuthKey = builder.callbackAuthKey;
        this.callbackReqAuth = builder.callbackReqAuth;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSnapshotCallbackAuthRequest create() {
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
     * @return callbackAuthKey
     */
    public String getCallbackAuthKey() {
        return this.callbackAuthKey;
    }

    /**
     * @return callbackReqAuth
     */
    public String getCallbackReqAuth() {
        return this.callbackReqAuth;
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

    public static final class Builder extends Request.Builder<SetSnapshotCallbackAuthRequest, Builder> {
        private String regionId; 
        private String callbackAuthKey; 
        private String callbackReqAuth; 
        private String domainName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetSnapshotCallbackAuthRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.callbackAuthKey = request.callbackAuthKey;
            this.callbackReqAuth = request.callbackReqAuth;
            this.domainName = request.domainName;
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
         * CallbackAuthKey.
         */
        public Builder callbackAuthKey(String callbackAuthKey) {
            this.putQueryParameter("CallbackAuthKey", callbackAuthKey);
            this.callbackAuthKey = callbackAuthKey;
            return this;
        }

        /**
         * CallbackReqAuth.
         */
        public Builder callbackReqAuth(String callbackReqAuth) {
            this.putQueryParameter("CallbackReqAuth", callbackReqAuth);
            this.callbackReqAuth = callbackReqAuth;
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

        @Override
        public SetSnapshotCallbackAuthRequest build() {
            return new SetSnapshotCallbackAuthRequest(this);
        } 

    } 

}
