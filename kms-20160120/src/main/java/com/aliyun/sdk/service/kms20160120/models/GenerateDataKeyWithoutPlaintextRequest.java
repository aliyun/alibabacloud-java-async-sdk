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
 * {@link GenerateDataKeyWithoutPlaintextRequest} extends {@link RequestModel}
 *
 * <p>GenerateDataKeyWithoutPlaintextRequest</p>
 */
public class GenerateDataKeyWithoutPlaintextRequest extends Request {
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

    private GenerateDataKeyWithoutPlaintextRequest(Builder builder) {
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

    public static GenerateDataKeyWithoutPlaintextRequest create() {
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

    public static final class Builder extends Request.Builder<GenerateDataKeyWithoutPlaintextRequest, Builder> {
        private String dryRun; 
        private java.util.Map<String, ?> encryptionContext; 
        private String keyId; 
        private String keySpec; 
        private Integer numberOfBytes; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDataKeyWithoutPlaintextRequest request) {
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
         * <p>A JSON string that consists of key-value pairs. If you specify this parameter, an equivalent value is required when you call the Decrypt operation. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
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
         * <p>The globally unique ID of the CMK. You can also set this parameter to an alias that is bound to the CMK. For more information, see Use aliases.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The length of the data key that you want to generate. Valid values:</p>
         * <ul>
         * <li>AES_256: 256-bit symmetric key</li>
         * <li>AES_128: 128-bit symmetric key</li>
         * </ul>
         * <blockquote>
         * <p> We recommend that you use the KeySpec or NumberOfBytes parameter to specify the length of a data key. If both of them are not specified, KMS generates a 256-bit data key. If both of them are specified, KMS ignores the KeySpec parameter.</p>
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
         * <p>The length of the data key that you want to generate.</p>
         * <p>Valid values: 1 to 1024.</p>
         * <p>Unit: bytes.</p>
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
        public GenerateDataKeyWithoutPlaintextRequest build() {
            return new GenerateDataKeyWithoutPlaintextRequest(this);
        } 

    } 

}
