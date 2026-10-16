// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link GenerateDataKeyRequest} extends {@link RequestModel}
 *
 * <p>GenerateDataKeyRequest</p>
 */
public class GenerateDataKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionContext")
    private java.util.Map<String, ?> encryptionContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeySpec")
    private String keySpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberOfBytes")
    @com.aliyun.core.annotation.Validation(maximum = 1024)
    private Integer numberOfBytes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Recipient")
    private String recipient;

    private GenerateDataKeyRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.encryptionContext = builder.encryptionContext;
        this.keyId = builder.keyId;
        this.keySpec = builder.keySpec;
        this.numberOfBytes = builder.numberOfBytes;
        this.recipient = builder.recipient;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDataKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return encryptionContext
     */
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return keySpec
     */
    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * @return numberOfBytes
     */
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    /**
     * @return recipient
     */
    public String getRecipient() {
        return this.recipient;
    }

    public static final class Builder extends Request.Builder<GenerateDataKeyRequest, Builder> {
        private String dryRun; 
        private java.util.Map<String, ?> encryptionContext; 
        private String keyId; 
        private String keySpec; 
        private Integer numberOfBytes; 
        private String recipient; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDataKeyRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.encryptionContext = request.encryptionContext;
            this.keyId = request.keyId;
            this.keySpec = request.keySpec;
            this.numberOfBytes = request.numberOfBytes;
            this.recipient = request.recipient;
        } 

        /**
         * <p>Specifies whether to enable DryRun mode.</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false (default): disabled.</li>
         * </ul>
         * <p>DryRun mode is used to test API calls, verify that you have the required permissions on the relevant resources, and check whether request parameters are configured correctly. When DryRun mode is enabled, KMS always returns a failure with a reason. Possible failure reasons include:</p>
         * <ul>
         * <li>DryRunOperationError: The request would succeed if the DryRun parameter were not set.</li>
         * <li>ValidationError: A parameter specified in the request is invalid.</li>
         * <li>AccessDeniedError: You do not have permission to perform the operation on the KMS resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>A JSON string of key-value pairs.</p>
         * <p>If you specify this parameter, you must provide the same parameter when you call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Example&quot;:&quot;Example&quot;}</p>
         */
        public Builder encryptionContext(java.util.Map<String, ?> encryptionContext) {
            String encryptionContextShrink = shrink(encryptionContext, "EncryptionContext", "json");
            this.putQueryParameter("EncryptionContext", encryptionContextShrink);
            this.encryptionContext = encryptionContext;
            return this;
        }

        /**
         * <p>The ID of the key. You can also specify a key alias or a key Amazon Resource Name (ARN). For more information about aliases, see <a href="https://help.aliyun.com/document_detail/480655.html">Manage key aliases</a>.</p>
         * <blockquote>
         * <p>To access a key in another Alibaba Cloud account, you must specify the key ARN. The key ARN format is <code>acs:kms:${region}:${account}:key/${keyid}</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key-hzz630494463ejqjx****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The length of the data key (DK) to generate. Valid values:</p>
         * <ul>
         * <li><p>AES_256: a 256-bit symmetric key.</p>
         * </li>
         * <li><p>AES_128: a 128-bit symmetric key.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Use KeySpec or NumberOfBytes to specify the DK length. If neither is specified, KMS generates a 256-bit DK. If both are specified, KMS ignores the KeySpec parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AES_256</p>
         */
        public Builder keySpec(String keySpec) {
            this.putQueryParameter("KeySpec", keySpec);
            this.keySpec = keySpec;
            return this;
        }

        /**
         * <p>The length of the data key (DK) to generate, in bytes.</p>
         * <p>Valid values: 1 to 1024.</p>
         * <p>Default value:</p>
         * <ul>
         * <li>When KeySpec is set to AES_256, the default value of NumberOfBytes is 32.</li>
         * <li>When KeySpec is set to AES_128, the default value of NumberOfBytes is 16.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        public Builder numberOfBytes(Integer numberOfBytes) {
            this.putQueryParameter("NumberOfBytes", numberOfBytes);
            this.numberOfBytes = numberOfBytes;
            return this;
        }

        /**
         * Recipient.
         */
        public Builder recipient(String recipient) {
            this.putBodyParameter("Recipient", recipient);
            this.recipient = recipient;
            return this;
        }

        @Override
        public GenerateDataKeyRequest build() {
            return new GenerateDataKeyRequest(this);
        } 

    } 

}
