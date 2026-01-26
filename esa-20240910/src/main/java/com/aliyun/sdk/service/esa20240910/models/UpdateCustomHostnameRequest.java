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
         * <p>云盾证书ID，使用云盾证书时必填</p>
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
         * <p>云盾证书所在地域，使用云盾证书时必填</p>
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
         * <p>证书类型，SSL 开启时必填</p>
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
         * <p>证书公钥，使用上传证书时必填</p>
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
         * <p>证书私钥，使用上传证书时必填</p>
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
         * <p>绑定的源站记录ID</p>
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
         * <p>SSL开关</p>
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
