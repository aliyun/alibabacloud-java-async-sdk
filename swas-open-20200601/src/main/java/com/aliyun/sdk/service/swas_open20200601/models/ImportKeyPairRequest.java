// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportKeyPairRequest} extends {@link RequestModel}
 *
 * <p>ImportKeyPairRequest</p>
 */
public class ImportKeyPairRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKeyBody")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publicKeyBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ImportKeyPairRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.keyPairName = builder.keyPairName;
        this.publicKeyBody = builder.publicKeyBody;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportKeyPairRequest create() {
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
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return publicKeyBody
     */
    public String getPublicKeyBody() {
        return this.publicKeyBody;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ImportKeyPairRequest, Builder> {
        private String clientToken; 
        private String keyPairName; 
        private String publicKeyBody; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ImportKeyPairRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.keyPairName = request.keyPairName;
            this.publicKeyBody = request.publicKeyBody;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The name of the key pair. The name must be 2 to 64 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter and cannot start with http:// or https://.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The public key of the key pair.
         */
        public Builder publicKeyBody(String publicKeyBody) {
            this.putQueryParameter("PublicKeyBody", publicKeyBody);
            this.publicKeyBody = publicKeyBody;
            return this;
        }

        /**
         * The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ImportKeyPairRequest build() {
            return new ImportKeyPairRequest(this);
        } 

    } 

}
