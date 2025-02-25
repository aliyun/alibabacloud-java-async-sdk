// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CertInfo} extends {@link TeaModel}
 *
 * <p>CertInfo</p>
 */
public class CertInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cert_body")
    private String certBody;

    @com.aliyun.core.annotation.NameInMap("cert_name")
    private String certName;

    @com.aliyun.core.annotation.NameInMap("cert_privatekey")
    private String certPrivatekey;

    private CertInfo(Builder builder) {
        this.certBody = builder.certBody;
        this.certName = builder.certName;
        this.certPrivatekey = builder.certPrivatekey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertInfo create() {
        return builder().build();
    }

    /**
     * @return certBody
     */
    public String getCertBody() {
        return this.certBody;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return certPrivatekey
     */
    public String getCertPrivatekey() {
        return this.certPrivatekey;
    }

    public static final class Builder {
        private String certBody; 
        private String certName; 
        private String certPrivatekey; 

        /**
         * cert_body.
         */
        public Builder certBody(String certBody) {
            this.certBody = certBody;
            return this;
        }

        /**
         * cert_name.
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * cert_privatekey.
         */
        public Builder certPrivatekey(String certPrivatekey) {
            this.certPrivatekey = certPrivatekey;
            return this;
        }

        public CertInfo build() {
            return new CertInfo(this);
        } 

    } 

}
