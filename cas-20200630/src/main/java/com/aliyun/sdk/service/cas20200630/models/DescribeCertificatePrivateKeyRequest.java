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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeCertificatePrivateKeyRequest(Builder builder) {
        super(builder);
        this.encryptedCode = builder.encryptedCode;
        this.identifier = builder.identifier;
        this.resourceGroupId = builder.resourceGroupId;
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

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeCertificatePrivateKeyRequest, Builder> {
        private String encryptedCode; 
        private String identifier; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCertificatePrivateKeyRequest request) {
            super(request);
            this.encryptedCode = request.encryptedCode;
            this.identifier = request.identifier;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The password to encrypt the private key. The password can contain uppercase letters, lowercase letters, digits, and special characters, such as <code>,.+-_#</code>. The maximum length is 32 bytes.</p>
         * <blockquote>
         * <p>Warning: </p>
         * </blockquote>
         * <p>Remember the password you set. You need this password to decrypt the encrypted private key. If you forget the password, you cannot decrypt the private key that you get from this API call. You must call this API again to get a new encrypted key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>!Demo@WS3ed</p>
         */
        public Builder encryptedCode(String encryptedCode) {
            this.putQueryParameter("EncryptedCode", encryptedCode);
            this.encryptedCode = encryptedCode;
            return this;
        }

        /**
         * <p>The unique identifier of the client or server-side certificate for which you want to get the private key.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/465990.html">ListClientCertificate</a> to query the unique identifiers of all client and server-side certificates.</p>
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

        /**
         * <p>The ID of the resource group to which the certificate belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeCertificatePrivateKeyRequest build() {
            return new DescribeCertificatePrivateKeyRequest(this);
        } 

    } 

}
