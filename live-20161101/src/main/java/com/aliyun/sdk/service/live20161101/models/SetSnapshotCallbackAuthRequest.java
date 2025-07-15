// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetSnapshotCallbackAuthRequest} extends {@link RequestModel}
 *
 * <p>SetSnapshotCallbackAuthRequest</p>
 */
public class SetSnapshotCallbackAuthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackAuthKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callbackAuthKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackReqAuth")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callbackReqAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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

        private Builder(SetSnapshotCallbackAuthRequest request) {
            super(request);
            this.callbackAuthKey = request.callbackAuthKey;
            this.callbackReqAuth = request.callbackReqAuth;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The custom key that is used for callback authentication.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourkey</p>
         */
        public Builder callbackAuthKey(String callbackAuthKey) {
            this.putQueryParameter("CallbackAuthKey", callbackAuthKey);
            this.callbackAuthKey = callbackAuthKey;
            return this;
        }

        /**
         * <p>Specifies whether to enable callback authentication. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: enables callback authentication.</li>
         * <li><strong>no</strong>: disables callback authentication.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        public Builder callbackReqAuth(String callbackReqAuth) {
            this.putQueryParameter("CallbackReqAuth", callbackReqAuth);
            this.callbackReqAuth = callbackReqAuth;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
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
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetSnapshotCallbackAuthRequest build() {
            return new SetSnapshotCallbackAuthRequest(this);
        } 

    } 

}
