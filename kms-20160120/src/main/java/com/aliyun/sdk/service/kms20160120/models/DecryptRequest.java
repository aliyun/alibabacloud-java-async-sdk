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
 * {@link DecryptRequest} extends {@link RequestModel}
 *
 * <p>DecryptRequest</p>
 */
public class DecryptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ciphertextBlob;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionContext")
    private java.util.Map<String, ?> encryptionContext;

    private DecryptRequest(Builder builder) {
        super(builder);
        this.ciphertextBlob = builder.ciphertextBlob;
        this.dryRun = builder.dryRun;
        this.encryptionContext = builder.encryptionContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecryptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
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

    public static final class Builder extends Request.Builder<DecryptRequest, Builder> {
        private String ciphertextBlob; 
        private String dryRun; 
        private java.util.Map<String, ?> encryptionContext; 

        private Builder() {
            super();
        } 

        private Builder(DecryptRequest request) {
            super(request);
            this.ciphertextBlob = request.ciphertextBlob;
            this.dryRun = request.dryRun;
            this.encryptionContext = request.encryptionContext;
        } 

        /**
         * <p>The ciphertext that you want to decrypt.</p>
         * <p>You can generate the ciphertext by calling the following operations:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmaaSl+TztSIMe43nbTH/Z1Wr4XfLftKhAciUmDQXuMRl4WTvKhxjMThjK****</p>
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.putQueryParameter("CiphertextBlob", ciphertextBlob);
            this.ciphertextBlob = ciphertextBlob;
            return this;
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
         * <blockquote>
         * <p> If you specify the EncryptionContext parameter when you call the <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>, <a href="https://help.aliyun.com/document_detail/28949.html">Encrypt</a>, or <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a> operation, you must specify the same context when you call the Decrypt operation. For more information, see <a href="https://help.aliyun.com/document_detail/42975.html">EncryptionContext</a>.</p>
         * </blockquote>
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

        @Override
        public DecryptRequest build() {
            return new DecryptRequest(this);
        } 

    } 

}
