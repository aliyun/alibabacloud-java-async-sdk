// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link DescribeCertificatePrivateKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeCertificatePrivateKeyRequest</p>
 */
public class DescribeCertificatePrivateKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptedCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encryptedCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    private DescribeCertificatePrivateKeyRequest(Builder builder) {
        super(builder);
        this.encryptedCode = builder.encryptedCode;
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertificatePrivateKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptedCode
     */
    public String getEncryptedCode() {
        return this.encryptedCode;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    public static final class Builder extends Request.Builder<DescribeCertificatePrivateKeyRequest, Builder> {
        private String encryptedCode; 
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCertificatePrivateKeyRequest request) {
            super(request);
            this.encryptedCode = request.encryptedCode;
            this.identifier = request.identifier;
        } 

        /**
         * <p>The password that is used to encrypt the private key. The password can contain letters, digits, and special characters, such as <code>, + - _ #</code>. The password can be up to 32 bytes in length.</p>
         * <p><strong>Warning</strong> You must remember the password that you specify. The password is required to decrypt the encrypted private key. If you forget the password, the encrypted private key that is returned cannot be decrypted. You must call this operation again.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>!QA@WS3ed</p>
         */
        public Builder encryptedCode(String encryptedCode) {
            this.putQueryParameter("EncryptedCode", encryptedCode);
            this.encryptedCode = encryptedCode;
            return this;
        }

        /**
         * <p>The unique identifier of the client certificate or server certificate that you want to query.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/330884.html">ListClientCertificate</a> operation to query the unique identifiers of all client certificates and server certificates.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bc37133bb7ed68c7938d928fd26d****</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        @Override
        public DescribeCertificatePrivateKeyRequest build() {
            return new DescribeCertificatePrivateKeyRequest(this);
        } 

    } 

}
