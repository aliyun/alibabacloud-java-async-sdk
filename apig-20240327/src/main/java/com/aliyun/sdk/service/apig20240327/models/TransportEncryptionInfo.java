// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link TransportEncryptionInfo} extends {@link TeaModel}
 *
 * <p>TransportEncryptionInfo</p>
 */
public class TransportEncryptionInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("certificates")
    private java.util.List<TransportCertificateInfo> certificates;

    @com.aliyun.core.annotation.NameInMap("deployError")
    private String deployError;

    @com.aliyun.core.annotation.NameInMap("deployStatus")
    private String deployStatus;

    @com.aliyun.core.annotation.NameInMap("http2Enabled")
    private Boolean http2Enabled;

    @com.aliyun.core.annotation.NameInMap("tlsPolicy")
    private String tlsPolicy;

    private TransportEncryptionInfo(Builder builder) {
        this.certificates = builder.certificates;
        this.deployError = builder.deployError;
        this.deployStatus = builder.deployStatus;
        this.http2Enabled = builder.http2Enabled;
        this.tlsPolicy = builder.tlsPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransportEncryptionInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificates
     */
    public java.util.List<TransportCertificateInfo> getCertificates() {
        return this.certificates;
    }

    /**
     * @return deployError
     */
    public String getDeployError() {
        return this.deployError;
    }

    /**
     * @return deployStatus
     */
    public String getDeployStatus() {
        return this.deployStatus;
    }

    /**
     * @return http2Enabled
     */
    public Boolean getHttp2Enabled() {
        return this.http2Enabled;
    }

    /**
     * @return tlsPolicy
     */
    public String getTlsPolicy() {
        return this.tlsPolicy;
    }

    public static final class Builder {
        private java.util.List<TransportCertificateInfo> certificates; 
        private String deployError; 
        private String deployStatus; 
        private Boolean http2Enabled; 
        private String tlsPolicy; 

        private Builder() {
        } 

        private Builder(TransportEncryptionInfo model) {
            this.certificates = model.certificates;
            this.deployError = model.deployError;
            this.deployStatus = model.deployStatus;
            this.http2Enabled = model.http2Enabled;
            this.tlsPolicy = model.tlsPolicy;
        } 

        /**
         * certificates.
         */
        public Builder certificates(java.util.List<TransportCertificateInfo> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * deployError.
         */
        public Builder deployError(String deployError) {
            this.deployError = deployError;
            return this;
        }

        /**
         * deployStatus.
         */
        public Builder deployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }

        /**
         * http2Enabled.
         */
        public Builder http2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }

        /**
         * tlsPolicy.
         */
        public Builder tlsPolicy(String tlsPolicy) {
            this.tlsPolicy = tlsPolicy;
            return this;
        }

        public TransportEncryptionInfo build() {
            return new TransportEncryptionInfo(this);
        } 

    } 

}
