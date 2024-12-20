// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link RegistryCertificateConfig} extends {@link TeaModel}
 *
 * <p>RegistryCertificateConfig</p>
 */
public class RegistryCertificateConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertBase64")
    private String certBase64;

    @com.aliyun.core.annotation.NameInMap("Insecure")
    private Boolean insecure;

    private RegistryCertificateConfig(Builder builder) {
        this.certBase64 = builder.certBase64;
        this.insecure = builder.insecure;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegistryCertificateConfig create() {
        return builder().build();
    }

    /**
     * @return certBase64
     */
    public String getCertBase64() {
        return this.certBase64;
    }

    /**
     * @return insecure
     */
    public Boolean getInsecure() {
        return this.insecure;
    }

    public static final class Builder {
        private String certBase64; 
        private Boolean insecure; 

        /**
         * CertBase64.
         */
        public Builder certBase64(String certBase64) {
            this.certBase64 = certBase64;
            return this;
        }

        /**
         * Insecure.
         */
        public Builder insecure(Boolean insecure) {
            this.insecure = insecure;
            return this;
        }

        public RegistryCertificateConfig build() {
            return new RegistryCertificateConfig(this);
        } 

    } 

}
