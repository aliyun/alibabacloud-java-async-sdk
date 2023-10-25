// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadCACertificateResponseBody} extends {@link TeaModel}
 *
 * <p>UploadCACertificateResponseBody</p>
 */
public class UploadCACertificateResponseBody extends TeaModel {
    @NameInMap("CACertificateId")
    private String CACertificateId;

    @NameInMap("CACertificateName")
    private String CACertificateName;

    @NameInMap("CommonName")
    private String commonName;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateTimeStamp")
    private Long createTimeStamp;

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("ExpireTimeStamp")
    private Long expireTimeStamp;

    @NameInMap("Fingerprint")
    private String fingerprint;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private UploadCACertificateResponseBody(Builder builder) {
        this.CACertificateId = builder.CACertificateId;
        this.CACertificateName = builder.CACertificateName;
        this.commonName = builder.commonName;
        this.createTime = builder.createTime;
        this.createTimeStamp = builder.createTimeStamp;
        this.expireTime = builder.expireTime;
        this.expireTimeStamp = builder.expireTimeStamp;
        this.fingerprint = builder.fingerprint;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadCACertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return CACertificateId
     */
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    /**
     * @return CACertificateName
     */
    public String getCACertificateName() {
        return this.CACertificateName;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expireTimeStamp
     */
    public Long getExpireTimeStamp() {
        return this.expireTimeStamp;
    }

    /**
     * @return fingerprint
     */
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder {
        private String CACertificateId; 
        private String CACertificateName; 
        private String commonName; 
        private String createTime; 
        private Long createTimeStamp; 
        private String expireTime; 
        private Long expireTimeStamp; 
        private String fingerprint; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * The name of the CA certificate.
         */
        public Builder CACertificateId(String CACertificateId) {
            this.CACertificateId = CACertificateId;
            return this;
        }

        /**
         * The domain name of the CA certificate.
         */
        public Builder CACertificateName(String CACertificateName) {
            this.CACertificateName = CACertificateName;
            return this;
        }

        /**
         * The fingerprint of the CA certificate.
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * The time when the CA certificate expires.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The name of the CA certificate.
         */
        public Builder createTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }

        /**
         * The timestamp generated when the CA certificate is uploaded.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * The ID of the enterprise resource group.
         */
        public Builder expireTimeStamp(Long expireTimeStamp) {
            this.expireTimeStamp = expireTimeStamp;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * The ID of the enterprise resource group.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the CA certificate is uploaded.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public UploadCACertificateResponseBody build() {
            return new UploadCACertificateResponseBody(this);
        } 

    } 

}
