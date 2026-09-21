// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateCustomHostnameRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomHostnameRequest</p>
 */
public class UpdateCustomHostnameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasId")
    private Long casId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasRegion")
    private String casRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertType")
    private String certType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Certificate")
    private String certificate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostnameId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long hostnameId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    private Long recordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SslFlag")
    private String sslFlag;

    private UpdateCustomHostnameRequest(Builder builder) {
        super(builder);
        this.casId = builder.casId;
        this.casRegion = builder.casRegion;
        this.certType = builder.certType;
        this.certificate = builder.certificate;
        this.hostnameId = builder.hostnameId;
        this.privateKey = builder.privateKey;
        this.recordId = builder.recordId;
        this.sslFlag = builder.sslFlag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomHostnameRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casId
     */
    public Long getCasId() {
        return this.casId;
    }

    /**
     * @return casRegion
     */
    public String getCasRegion() {
        return this.casRegion;
    }

    /**
     * @return certType
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return hostnameId
     */
    public Long getHostnameId() {
        return this.hostnameId;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    /**
     * @return sslFlag
     */
    public String getSslFlag() {
        return this.sslFlag;
    }

    public static final class Builder extends Request.Builder<UpdateCustomHostnameRequest, Builder> {
        private Long casId; 
        private String casRegion; 
        private String certType; 
        private String certificate; 
        private Long hostnameId; 
        private String privateKey; 
        private Long recordId; 
        private String sslFlag; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomHostnameRequest request) {
            super(request);
            this.casId = request.casId;
            this.casRegion = request.casRegion;
            this.certType = request.certType;
            this.certificate = request.certificate;
            this.hostnameId = request.hostnameId;
            this.privateKey = request.privateKey;
            this.recordId = request.recordId;
            this.sslFlag = request.sslFlag;
        } 

        /**
         * <p>The ID of the SSL Certificates Service certificate. This parameter is required when CertType is set to cas.</p>
         * 
         * <strong>example:</strong>
         * <p>30000478</p>
         */
        public Builder casId(Long casId) {
            this.putQueryParameter("CasId", casId);
            this.casId = casId;
            return this;
        }

        /**
         * <p>The region of the SSL Certificates Service certificate. This parameter is required when CertType is set to cas. Valid values:</p>
         * <ul>
         * <li>Chinese mainland accounts: cn-hangzhou.</li>
         * <li>International accounts: ap-southeast-1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder casRegion(String casRegion) {
            this.putQueryParameter("CasRegion", casRegion);
            this.casRegion = casRegion;
            return this;
        }

        /**
         * <p>The certificate type. This parameter is required when SslFlag is set to on. Valid values:</p>
         * <ul>
         * <li><strong>free</strong>: free certificate.</li>
         * <li><strong>upload</strong>: uploaded certificate.</li>
         * <li><strong>cas</strong>: SSL Certificates Service certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cas</p>
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * <p>The certificate content. This parameter is required when CertType is set to upload.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----</p>
         */
        public Builder certificate(String certificate) {
            this.putQueryParameter("Certificate", certificate);
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>The ID of the SaaS domain name. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/3018667.html">ListCustomHostnames</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder hostnameId(Long hostnameId) {
            this.putQueryParameter("HostnameId", hostnameId);
            this.hostnameId = hostnameId;
            return this;
        }

        /**
         * <p>The certificate private key. This parameter is required when CertType is set to upload.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PRIVATE KEY-----</p>
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * <p>The ID of the record to bind. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The SSL switch. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enables SSL.</li>
         * <li><strong>off</strong>: Disables SSL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder sslFlag(String sslFlag) {
            this.putQueryParameter("SslFlag", sslFlag);
            this.sslFlag = sslFlag;
            return this;
        }

        @Override
        public UpdateCustomHostnameRequest build() {
            return new UpdateCustomHostnameRequest(this);
        } 

    } 

}
