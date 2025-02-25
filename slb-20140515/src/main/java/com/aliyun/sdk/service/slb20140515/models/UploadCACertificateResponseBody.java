// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link UploadCACertificateResponseBody} extends {@link TeaModel}
 *
 * <p>UploadCACertificateResponseBody</p>
 */
public class UploadCACertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CACertificateId")
    private String CACertificateId;

    @com.aliyun.core.annotation.NameInMap("CACertificateName")
    private String CACertificateName;

    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimeStamp")
    private Long createTimeStamp;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTimeStamp")
    private Long expireTimeStamp;

    @com.aliyun.core.annotation.NameInMap("Fingerprint")
    private String fingerprint;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
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
         * <p>The ID of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>139a0******-cn-east-hangzhou-01</p>
         */
        public Builder CACertificateId(String CACertificateId) {
            this.CACertificateId = CACertificateId;
            return this;
        }

        /**
         * <p>The CA certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>mycacert01</p>
         */
        public Builder CACertificateName(String CACertificateName) {
            this.CACertificateName = CACertificateName;
            return this;
        }

        /**
         * <p>The domain name on the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>.example.com</p>
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The time when the CA certificate was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-08-31T02:49:05Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The timestamp when the CA certificate was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1504147745000</p>
         */
        public Builder createTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }

        /**
         * <p>The time when the CA certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-21T06:04:25Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The timestamp when the server certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1732169065000</p>
         */
        public Builder expireTimeStamp(Long expireTimeStamp) {
            this.expireTimeStamp = expireTimeStamp;
            return this;
        }

        /**
         * <p>The fingerprint of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>02:DF:AB:ED</p>
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rt******</p>
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
