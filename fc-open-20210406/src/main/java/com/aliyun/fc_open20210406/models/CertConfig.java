// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CertConfig} extends {@link TeaModel}
 *
 * <p>CertConfig</p>
 */
public class CertConfig extends TeaModel {
    @NameInMap("certName")
    private String certName;

    @NameInMap("certificate")
    private String certificate;

    @NameInMap("privateKey")
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

        /**
         * <p>证书名称</p>
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * <p>证书，如果是证书链则依次填写多个证书</p>
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>私钥</p>
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
