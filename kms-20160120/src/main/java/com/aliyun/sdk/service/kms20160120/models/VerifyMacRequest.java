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
 * {@link VerifyMacRequest} extends {@link RequestModel}
 *
 * <p>VerifyMacRequest</p>
 */
public class VerifyMacRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mac;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    private VerifyMacRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.dryRun = builder.dryRun;
        this.keyId = builder.keyId;
        this.mac = builder.mac;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyMacRequest create() {
        return builder().build();
    }

@Override
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
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder extends Request.Builder<VerifyMacRequest, Builder> {
        private String algorithm; 
        private String dryRun; 
        private String keyId; 
        private String mac; 
        private String message; 

        private Builder() {
            super();
        } 

        private Builder(VerifyMacRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.dryRun = request.dryRun;
            this.keyId = request.keyId;
            this.mac = request.mac;
            this.message = request.message;
        } 

        /**
         * <p>The algorithm used to generate the message authentication code. Valid values vary based on the key specification:  </p>
         * <ul>
         * <li><p>HMAC_SM3</p>
         * </li>
         * <li><p>HMAC_SHA_224</p>
         * </li>
         * <li><p>HMAC_SHA_256</p>
         * </li>
         * <li><p>HMAC_SHA_384</p>
         * </li>
         * <li><p>HMAC_SHA_512</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HMAC_SHA_256</p>
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>Specifies whether to enable DryRun mode. Valid values:</p>
         * <ul>
         * <li>true: enables DryRun mode.</li>
         * <li>false (default): disables DryRun mode.</li>
         * </ul>
         * <p>DryRun mode is used to test API calls and verify whether you have the required permissions on the corresponding resources and whether the request parameters are correctly configured. When DryRun mode is enabled, KMS always returns a failure and provides the failure reason. Failure reasons include:</p>
         * <ul>
         * <li>DryRunOperationError: The request would succeed if the DryRun parameter is not specified.</li>
         * <li>ValidationError: The parameters specified in the request are invalid.</li>
         * <li>AccessDeniedError: You are not authorized to perform this operation on the KMS resource.</li>
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
         * <p>The ID of the key. You can also specify a key alias or key Amazon Resource Name (ARN). For more information about aliases, refer to <a href="https://help.aliyun.com/document_detail/480655.html">Manage key aliases</a>.</p>
         * <blockquote>
         * <p>To access a key in a different Alibaba Cloud account, you must specify the key ARN. The key ARN is in the format of <code>acs:kms:${region}:${account}:key/${keyid}</code>.</p>
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
         * <p>The Base64-encoding message authentication code to verify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vz1Snp+jGJbgydCFRWVWxAwIMdyfKCSp+jnMWQ==</p>
         */
        public Builder mac(String mac) {
            this.putQueryParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        /**
         * <p>The original message data.  </p>
         * <p>Use Base64 encoding. For example, if the hexadecimal content of the message for which you want to generate a message authentication code is <code>[0x31, 0x32, 0x33, 0x34]</code>, the corresponding Base64-encoded value is <code>MTIzNA==</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</p>
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        @Override
        public VerifyMacRequest build() {
            return new VerifyMacRequest(this);
        } 

    } 

}
