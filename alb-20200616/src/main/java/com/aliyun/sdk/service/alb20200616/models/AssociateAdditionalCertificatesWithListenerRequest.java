// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link AssociateAdditionalCertificatesWithListenerRequest} extends {@link RequestModel}
 *
 * <p>AssociateAdditionalCertificatesWithListenerRequest</p>
 */
public class AssociateAdditionalCertificatesWithListenerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Certificates")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Certificates> certificates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    private AssociateAdditionalCertificatesWithListenerRequest(Builder builder) {
        super(builder);
        this.certificates = builder.certificates;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.listenerId = builder.listenerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateAdditionalCertificatesWithListenerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificates
     */
    public java.util.List<Certificates> getCertificates() {
        return this.certificates;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    public static final class Builder extends Request.Builder<AssociateAdditionalCertificatesWithListenerRequest, Builder> {
        private java.util.List<Certificates> certificates; 
        private String clientToken; 
        private Boolean dryRun; 
        private String listenerId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateAdditionalCertificatesWithListenerRequest request) {
            super(request);
            this.certificates = request.certificates;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.listenerId = request.listenerId;
        } 

        /**
         * <p>The extended validation certificates that you want to add to the listener.</p>
         * <p>This parameter is required.</p>
         */
        public Builder certificates(java.util.List<Certificates> certificates) {
            this.putQueryParameter("Certificates", certificates);
            this.certificates = certificates;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a <code>2xx HTTP</code> status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The listener ID. This parameter is supported only by HTTPS and QUIC listeners.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        @Override
        public AssociateAdditionalCertificatesWithListenerRequest build() {
            return new AssociateAdditionalCertificatesWithListenerRequest(this);
        } 

    } 

    /**
     * 
     * {@link AssociateAdditionalCertificatesWithListenerRequest} extends {@link TeaModel}
     *
     * <p>AssociateAdditionalCertificatesWithListenerRequest</p>
     */
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String certificateId;

        private Certificates(Builder builder) {
            this.certificateId = builder.certificateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        public static final class Builder {
            private String certificateId; 

            /**
             * <p>The ID of the certificate. Only server certificates are supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cert-123</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
}
