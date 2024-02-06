// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportKeyPairRequest} extends {@link RequestModel}
 *
 * <p>ImportKeyPairRequest</p>
 */
public class ImportKeyPairRequest extends Request {
    @Query
    @NameInMap("KeyPairName")
    @Validation(required = true)
    private String keyPairName;

    @Query
    @NameInMap("PublicKeyBody")
    @Validation(required = true)
    private String publicKeyBody;

    private ImportKeyPairRequest(Builder builder) {
        super(builder);
        this.keyPairName = builder.keyPairName;
        this.publicKeyBody = builder.publicKeyBody;
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

    public static final class Builder extends Request.Builder<ImportKeyPairRequest, Builder> {
        private String keyPairName; 
        private String publicKeyBody; 

        private Builder() {
            super();
        } 

        private Builder(ImportKeyPairRequest request) {
            super(request);
            this.keyPairName = request.keyPairName;
            this.publicKeyBody = request.publicKeyBody;
        } 

        /**
         * The name of the key pair. The name must conform to the following naming conventions:
         * <p>
         * 
         * *   The name must be 2 to 128 characters in length.
         * *   The name must start with a letter but cannot start with `http://` or `https://`.
         * *   The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         * 
         * You can specify the name of only one key pair.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The public key of the key pair. You can specify only one public key.
         */
        public Builder publicKeyBody(String publicKeyBody) {
            this.putQueryParameter("PublicKeyBody", publicKeyBody);
            this.publicKeyBody = publicKeyBody;
            return this;
        }

        @Override
        public ImportKeyPairRequest build() {
            return new ImportKeyPairRequest(this);
        } 

    } 

}
