// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOwnAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateOwnAccountRequest</p>
 */
public class CreateOwnAccountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizid")
    private String bizid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Identity")
    private String identity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublicKey")
    private String publicKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecoveryKey")
    private String recoveryKey;

    private CreateOwnAccountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.identity = builder.identity;
        this.publicKey = builder.publicKey;
        this.recoveryKey = builder.recoveryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOwnAccountRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return identity
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * @return recoveryKey
     */
    public String getRecoveryKey() {
        return this.recoveryKey;
    }

    public static final class Builder extends Request.Builder<CreateOwnAccountRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private String identity; 
        private String publicKey; 
        private String recoveryKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateOwnAccountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
            this.identity = request.identity;
            this.publicKey = request.publicKey;
            this.recoveryKey = request.recoveryKey;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * Identity.
         */
        public Builder identity(String identity) {
            this.putBodyParameter("Identity", identity);
            this.identity = identity;
            return this;
        }

        /**
         * PublicKey.
         */
        public Builder publicKey(String publicKey) {
            this.putBodyParameter("PublicKey", publicKey);
            this.publicKey = publicKey;
            return this;
        }

        /**
         * RecoveryKey.
         */
        public Builder recoveryKey(String recoveryKey) {
            this.putBodyParameter("RecoveryKey", recoveryKey);
            this.recoveryKey = recoveryKey;
            return this;
        }

        @Override
        public CreateOwnAccountRequest build() {
            return new CreateOwnAccountRequest(this);
        } 

    } 

}
