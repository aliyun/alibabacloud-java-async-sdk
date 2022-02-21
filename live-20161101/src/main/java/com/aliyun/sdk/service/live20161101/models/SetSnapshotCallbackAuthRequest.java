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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private SetSnapshotCallbackAuthRequest(Builder builder) {
        super(builder);
        this.callbackAuthKey = builder.callbackAuthKey;
        this.callbackReqAuth = builder.callbackReqAuth;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetSnapshotCallbackAuthRequest, Builder> {
        private String callbackAuthKey; 
        private String callbackReqAuth; 
        private String domainName; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetSnapshotCallbackAuthRequest response) {
            super(response);
            this.callbackAuthKey = response.callbackAuthKey;
            this.callbackReqAuth = response.callbackReqAuth;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetSnapshotCallbackAuthRequest build() {
            return new SetSnapshotCallbackAuthRequest(this);
        } 

    } 

}
