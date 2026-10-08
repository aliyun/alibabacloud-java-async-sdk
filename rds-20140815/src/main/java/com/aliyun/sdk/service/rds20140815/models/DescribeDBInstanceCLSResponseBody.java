// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeDBInstanceCLSResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceCLSResponseBody</p>
 */
public class DescribeDBInstanceCLSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.NameInMap("EncryptionKeyMode")
    private String encryptionKeyMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WhiteListMode")
    private Boolean whiteListMode;

    private DescribeDBInstanceCLSResponseBody(Builder builder) {
        this.algorithm = builder.algorithm;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionKeyMode = builder.encryptionKeyMode;
        this.requestId = builder.requestId;
        this.whiteListMode = builder.whiteListMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceCLSResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptionKeyMode
     */
    public String getEncryptionKeyMode() {
        return this.encryptionKeyMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return whiteListMode
     */
    public Boolean getWhiteListMode() {
        return this.whiteListMode;
    }

    public static final class Builder {
        private String algorithm; 
        private String encryptionKey; 
        private String encryptionKeyMode; 
        private String requestId; 
        private Boolean whiteListMode; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceCLSResponseBody model) {
            this.algorithm = model.algorithm;
            this.encryptionKey = model.encryptionKey;
            this.encryptionKeyMode = model.encryptionKeyMode;
            this.requestId = model.requestId;
            this.whiteListMode = model.whiteListMode;
        } 

        /**
         * <p>The encryption algorithm. Valid values:</p>
         * <ul>
         * <li>AES_128_CBC</li>
         * <li>AES_128_GCM</li>
         * <li>AES_128_CTR</li>
         * <li>AES_128_ECB</li>
         * <li>AES_256_CBC</li>
         * <li>AES_256_GCM</li>
         * <li>AES_256_CTR</li>
         * <li>AES_256_ECB</li>
         * <li>SM4_128_CBC</li>
         * <li>SM4_128_GCM</li>
         * <li>SM4_128_CTR</li>
         * <li>SM4_128_ECB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AES_256_GCM</p>
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The custom KMS master key ID.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the column encryption key pattern is set to kms_key. If this parameter is not specified, the current column encryption key settings of the database remain unchanged.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>749c1df7-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong></p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The column encryption key mode. Valid values:</p>
         * <ul>
         * <li>client_key: configures a user-generated random key on the client side.</li>
         * <li>kms_key: configures a custom key by using Alibaba Cloud Key Management Service (KMS).</li>
         * </ul>
         * <blockquote>
         * <p> After an instance is configured to use KMS for key management, you can no longer switch back to the client-side random key mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>kms_key</p>
         */
        public Builder encryptionKeyMode(String encryptionKeyMode) {
            this.encryptionKeyMode = encryptionKeyMode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D0073A98-52F1-3075-8256-3943F*******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the whitelist mode is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder whiteListMode(Boolean whiteListMode) {
            this.whiteListMode = whiteListMode;
            return this;
        }

        public DescribeDBInstanceCLSResponseBody build() {
            return new DescribeDBInstanceCLSResponseBody(this);
        } 

    } 

}
