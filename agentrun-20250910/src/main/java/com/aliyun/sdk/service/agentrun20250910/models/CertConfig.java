// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CertConfig} extends {@link TeaModel}
 *
 * <p>CertConfig</p>
 */
public class CertConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("certName")
    @com.aliyun.core.annotation.Validation(maximum = 128, minimum = 1)
    private String certName;

    @com.aliyun.core.annotation.NameInMap("certificate")
    private String certificate;

    @com.aliyun.core.annotation.NameInMap("privateKey")
    private String privateKey;

    private CertConfig(Builder builder) {
        this.certName = builder.certName;
        this.certificate = builder.certificate;
        this.privateKey = builder.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    public static final class Builder {
        private String certName; 
        private String certificate; 
        private String privateKey; 

        private Builder() {
        } 

        private Builder(CertConfig model) {
            this.certName = model.certName;
            this.certificate = model.certificate;
            this.privateKey = model.privateKey;
        } 

        /**
         * <p>证书的名称。支持字母、数字、下划线（_）和短划线（-），不能以数字和短划线（-）开头。长度范围为 1~128 个字符。</p>
         * 
         * <strong>example:</strong>
         * <p>my-cert</p>
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * <p>证书，如果是证书链，则需要依次填写多个证书。</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\nxxxxx\n-----END CERTIFICATE-----</p>
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>私钥。</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY-----\nxxxxx\n-----END RSA PRIVATE KEY-----</p>
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public CertConfig build() {
            return new CertConfig(this);
        } 

    } 

}
