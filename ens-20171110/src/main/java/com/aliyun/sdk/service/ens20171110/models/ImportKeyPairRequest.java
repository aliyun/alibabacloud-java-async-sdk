// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ImportKeyPairRequest} extends {@link RequestModel}
 *
 * <p>ImportKeyPairRequest</p>
 */
public class ImportKeyPairRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKeyBody")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the key pair. The name must conform to the following naming conventions:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length.</li>
         * <li>The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * <p>You can specify the name of only one key pair.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKeyPairName</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The public key of the key pair. You can specify only one public key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ssh-rsa AAAAB****</p>
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
