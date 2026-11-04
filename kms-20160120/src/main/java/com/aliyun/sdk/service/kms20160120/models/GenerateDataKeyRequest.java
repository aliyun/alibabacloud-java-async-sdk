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
    @com.aliyun.core.annotation.NameInMap("DataKeyName")
    private String dataKeyName;

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
    @com.aliyun.core.annotation.NameInMap("KeyMaterial")
    private String keyMaterial;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeySpec")
    private String keySpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagedByKms")
    private Boolean managedByKms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberOfBytes")
    @com.aliyun.core.annotation.Validation(maximum = 1024)
    private Integer numberOfBytes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Recipient")
    private String recipient;

    private GenerateDataKeyRequest(Builder builder) {
        super(builder);
        this.dataKeyName = builder.dataKeyName;
        this.dryRun = builder.dryRun;
        this.encryptionContext = builder.encryptionContext;
        this.keyId = builder.keyId;
        this.keyMaterial = builder.keyMaterial;
        this.keySpec = builder.keySpec;
        this.managedByKms = builder.managedByKms;
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
     * @return dataKeyName
     */
    public String getDataKeyName() {
        return this.dataKeyName;
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
     * @return keyMaterial
     */
    public String getKeyMaterial() {
        return this.keyMaterial;
    }

    /**
     * @return keySpec
     */
    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * @return managedByKms
     */
    public Boolean getManagedByKms() {
        return this.managedByKms;
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
        private String dataKeyName; 
        private String dryRun; 
        private java.util.Map<String, ?> encryptionContext; 
        private String keyId; 
        private String keyMaterial; 
        private String keySpec; 
        private Boolean managedByKms; 
        private Integer numberOfBytes; 
        private String recipient; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDataKeyRequest request) {
            super(request);
            this.dataKeyName = request.dataKeyName;
            this.dryRun = request.dryRun;
            this.encryptionContext = request.encryptionContext;
            this.keyId = request.keyId;
            this.keyMaterial = request.keyMaterial;
            this.keySpec = request.keySpec;
            this.managedByKms = request.managedByKms;
            this.numberOfBytes = request.numberOfBytes;
            this.recipient = request.recipient;
        } 

        /**
         * <p>The name of the managed data key (DK). This parameter is required only when ManagedByKms is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>example-data-key</p>
         */
        public Builder dataKeyName(String dataKeyName) {
            this.putQueryParameter("DataKeyName", dataKeyName);
            this.dataKeyName = dataKeyName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the dry run mode. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>The dry run mode is used to test API calls, verify whether you have the required permissions on the resources, and check whether the request parameters are correctly configured. After the dry run mode is enabled, KMS always returns a failure and provides the cause of the failure. The causes include:</p>
         * <ul>
         * <li>DryRunOperationError: The request would succeed if the DryRun parameter is not configured.</li>
         * <li>ValidationError: The specified parameters in the request are invalid.</li>
         * <li>AccessDeniedError: You do not have the permissions to perform the operation on the KMS resources.</li>
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
         * <p>The JSON string of key-value pairs.</p>
         * <p>If you specify this parameter, you must provide the same parameter when you call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> API operation. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
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
         * <p>The ID of the key. You can also specify the alias or Alibaba Cloud Resource Name (ARN) of the key. For more information about aliases, see <a href="https://help.aliyun.com/document_detail/480655.html">Manage key aliases</a>.</p>
         * <blockquote>
         * <p>When you access a key that belongs to another Alibaba Cloud account, you must enter the ARN of the key. The ARN of a key is in the <code>acs:kms:${region}:${account}:key/${keyid}</code> format.</p>
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
         * <p>The key material of the managed data key (DK). Specify this parameter only when ManagedByKms is set to true and Bring Your Own Key (BYOK) is used.</p>
         * 
         * <strong>example:</strong>
         * <p>a2V5LXBoeno2YWNkNTNmOTdmZGQyaXZ5Nzctc3UwaDliOTc4q9QB/5uWbEojCtMh0/Y72nto1RlekkSzhZD9Qkxc+WGBT0pHfOU6+fk1W8MTJNJRaAqOum7Ga+w6aJ/4hJUcJrpmDe2voDjQ</p>
         */
        public Builder keyMaterial(String keyMaterial) {
            this.putQueryParameter("KeyMaterial", keyMaterial);
            this.keyMaterial = keyMaterial;
            return this;
        }

        /**
         * <p>Specifies the length of the generated data key (DK). Valid values:</p>
         * <ul>
         * <li><p>AES_256: a 256-bit symmetric key.</p>
         * </li>
         * <li><p>AES_128: a 128-bit symmetric key.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Use KeySpec or NumberOfBytes to specify the length of the data key (DK). If neither parameter is specified, KMS generates a 256-bit data key (DK). If both parameters are specified, KMS ignores the KeySpec parameter.</p>
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
         * <p>Specifies whether the data key (DK) is managed and generated by KMS.</p>
         */
        public Builder managedByKms(Boolean managedByKms) {
            this.putQueryParameter("ManagedByKms", managedByKms);
            this.managedByKms = managedByKms;
            return this;
        }

        /**
         * <p>Specifies the length of the generated data key (DK) in bytes.</p>
         * <p>Valid values: 1 to 1024.</p>
         * <p>Default value:</p>
         * <ul>
         * <li>If KeySpec is set to AES_256, the default value is 32.</li>
         * <li>If KeySpec is set to AES_128, the default value is 16.</li>
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
         * <p>The trusted environment authentication information.</p>
         * <ul>
         * <li><p>AttestationDocument
         * // The trusted environment attestation document using Base64 encoding, which includes information such as environment measurements, signatures, and certificates.</p>
         * </li>
         * <li><p>KeyEncryptionAlgorithm
         * // The secret key encryption algorithm. Only RSAES_OAEP_SHA_256 is supported.</p>
         * </li>
         * </ul>
         * <p>Content structure of AttestationDocument:</p>
         * <ul>
         * <li>quoted                  </li>
         * <li>extendUserData // The user extension data using Base64 encoding. The decoded structure is as follows:<ul>
         * <li>aud // The fixed value &quot;kms&quot;. </li>
         * <li>iat // The issuance time, which is a UNIX timestamp in seconds.</li>
         * <li>exp // The expire time, which is a UNIX timestamp in seconds.</li>
         * <li>pubKey // The RSA2048 public key in SPKI format using Base64 encoding.</li>
         * <li>digestAlg // The summary algorithm. Only &quot;sha256&quot; is supported.</li>
         * <li>ver // The protocol version. Only &quot;v1&quot; is supported.</li>
         * <li>signature // The report signature, which is used to authenticate the integrity of quoted and extendUserData.</li>
         * </ul>
         * </li>
         * <li>pcrInfo:<ul>
         * <li>pcrValues // The Platform Configuration Register (PCR) measurements.</li>
         * <li>pcrSelectionOut // The PCR selection information.</li>
         * <li>pcrUpdateCounter // The number of PCR updates.</li>
         * </ul>
         * </li>
         * <li>cert // The platform attestation certificate, which is used to authenticate the validity of the signature.<blockquote>
         * <p>Notice: This parameter takes effect only when you invoke the API operation through a dedicated gateway.</notice></p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;AttestationDocument&quot;:&quot;base64-encoded-attestion-document&quot;, 
         * &quot;KeyEncryptionAlgorithm&quot;:&quot;RSAES_OAEP_SHA_256&quot;
         * }</p>
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
