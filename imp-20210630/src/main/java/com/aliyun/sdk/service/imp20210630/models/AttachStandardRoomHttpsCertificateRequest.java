// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachStandardRoomHttpsCertificateRequest} extends {@link RequestModel}
 *
 * <p>AttachStandardRoomHttpsCertificateRequest</p>
 */
public class AttachStandardRoomHttpsCertificateRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("CertificatePrivateKey")
    @Validation(required = true)
    private String certificatePrivateKey;

    @Body
    @NameInMap("CertificatePublicKey")
    @Validation(required = true)
    private String certificatePublicKey;

    @Body
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private AttachStandardRoomHttpsCertificateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.certificatePrivateKey = builder.certificatePrivateKey;
        this.certificatePublicKey = builder.certificatePublicKey;
        this.domainName = builder.domainName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachStandardRoomHttpsCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return certificatePrivateKey
     */
    public String getCertificatePrivateKey() {
        return this.certificatePrivateKey;
    }

    /**
     * @return certificatePublicKey
     */
    public String getCertificatePublicKey() {
        return this.certificatePublicKey;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AttachStandardRoomHttpsCertificateRequest, Builder> {
        private String appId; 
        private String certificatePrivateKey; 
        private String certificatePublicKey; 
        private String domainName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachStandardRoomHttpsCertificateRequest response) {
            super(response);
            this.appId = response.appId;
            this.certificatePrivateKey = response.certificatePrivateKey;
            this.certificatePublicKey = response.certificatePublicKey;
            this.domainName = response.domainName;
            this.regionId = response.regionId;
        } 

        /**
         * 应用唯一标识
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * NGINX格式证书私钥
         */
        public Builder certificatePrivateKey(String certificatePrivateKey) {
            this.putBodyParameter("CertificatePrivateKey", certificatePrivateKey);
            this.certificatePrivateKey = certificatePrivateKey;
            return this;
        }

        /**
         * NGINX格式证书公钥
         */
        public Builder certificatePublicKey(String certificatePublicKey) {
            this.putBodyParameter("CertificatePublicKey", certificatePublicKey);
            this.certificatePublicKey = certificatePublicKey;
            return this;
        }

        /**
         * 使用证书的确切域名
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AttachStandardRoomHttpsCertificateRequest build() {
            return new AttachStandardRoomHttpsCertificateRequest(this);
        } 

    } 

}
