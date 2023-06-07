// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadInstanceKeyPairRequest} extends {@link RequestModel}
 *
 * <p>UploadInstanceKeyPairRequest</p>
 */
public class UploadInstanceKeyPairRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("PublicKey")
    private String publicKey;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UploadInstanceKeyPairRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.keyPairName = builder.keyPairName;
        this.publicKey = builder.publicKey;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadInstanceKeyPairRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UploadInstanceKeyPairRequest, Builder> {
        private String clientToken; 
        private String instanceId; 
        private String keyPairName; 
        private String publicKey; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UploadInstanceKeyPairRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.keyPairName = request.keyPairName;
            this.publicKey = request.publicKey;
            this.regionId = request.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * PublicKey.
         */
        public Builder publicKey(String publicKey) {
            this.putQueryParameter("PublicKey", publicKey);
            this.publicKey = publicKey;
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
        public UploadInstanceKeyPairRequest build() {
            return new UploadInstanceKeyPairRequest(this);
        } 

    } 

}
