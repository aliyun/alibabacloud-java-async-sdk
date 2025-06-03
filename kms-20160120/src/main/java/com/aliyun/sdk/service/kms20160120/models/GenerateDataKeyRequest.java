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

    private GenerateDataKeyRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.encryptionContext = builder.encryptionContext;
        this.keyId = builder.keyId;
        this.keySpec = builder.keySpec;
        this.numberOfBytes = builder.numberOfBytes;
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

    public static final class Builder extends Request.Builder<GenerateDataKeyRequest, Builder> {
        private String dryRun; 
        private java.util.Map<String, ?> encryptionContext; 
        private String keyId; 
        private String keySpec; 
        private Integer numberOfBytes; 

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
        } 

        /**
         * DryRun.
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The JSON string that consists of key-value pairs.</p>
         * <p>If you specify this parameter, an equivalent value is required when you call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
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
         * <p>The ID of the CMK. The ID must be globally unique.</p>
         * <p>You can also set this parameter to an alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Alias overview</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7906979c-8e06-46a2-be2d-68e3ccbc****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The type of the data key that you want to generate. Valid values:</p>
         * <ul>
         * <li>AES_256: a 256-bit symmetric key</li>
         * <li>AES_128: a 128-bit symmetric key</li>
         * </ul>
         * <blockquote>
         * <p> We recommend that you use the KeySpec or NumberOfBytes parameter to specify the length of a data key. If none of the parameters are specified, KMS generates a 256-bit data key. If both parameters are specified, KMS ignores the KeySpec parameter.</p>
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
         * <p>The length of the data key that you want to generate. Unit: bytes.</p>
         * <p>Valid values: 1 to 1024.</p>
         * <p>Default value:</p>
         * <ul>
         * <li>If the KeySpec parameter is set to AES_256, set the value of the NumberOfBytes parameter to 32.</li>
         * <li>If the KeySpec parameter is set to AES_128, set the value of the NumberOfBytes parameter to 16.</li>
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

        @Override
        public GenerateDataKeyRequest build() {
            return new GenerateDataKeyRequest(this);
        } 

    } 

}
