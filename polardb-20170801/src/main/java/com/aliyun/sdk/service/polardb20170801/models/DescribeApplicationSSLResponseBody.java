// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationSSLResponseBody</p>
 */
public class DescribeApplicationSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertCommonName")
    private String certCommonName;

    @com.aliyun.core.annotation.NameInMap("CertExpiredTime")
    private String certExpiredTime;

    @com.aliyun.core.annotation.NameInMap("CertFingerprintSha256Der")
    private String certFingerprintSha256Der;

    @com.aliyun.core.annotation.NameInMap("CertModifiedTime")
    private String certModifiedTime;

    @com.aliyun.core.annotation.NameInMap("CertSource")
    private String certSource;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SSLAutoRotate")
    private Boolean SSLAutoRotate;

    @com.aliyun.core.annotation.NameInMap("SSLEnabled")
    private Boolean SSLEnabled;

    private DescribeApplicationSSLResponseBody(Builder builder) {
        this.certCommonName = builder.certCommonName;
        this.certExpiredTime = builder.certExpiredTime;
        this.certFingerprintSha256Der = builder.certFingerprintSha256Der;
        this.certModifiedTime = builder.certModifiedTime;
        this.certSource = builder.certSource;
        this.requestId = builder.requestId;
        this.SSLAutoRotate = builder.SSLAutoRotate;
        this.SSLEnabled = builder.SSLEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationSSLResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certCommonName
     */
    public String getCertCommonName() {
        return this.certCommonName;
    }

    /**
     * @return certExpiredTime
     */
    public String getCertExpiredTime() {
        return this.certExpiredTime;
    }

    /**
     * @return certFingerprintSha256Der
     */
    public String getCertFingerprintSha256Der() {
        return this.certFingerprintSha256Der;
    }

    /**
     * @return certModifiedTime
     */
    public String getCertModifiedTime() {
        return this.certModifiedTime;
    }

    /**
     * @return certSource
     */
    public String getCertSource() {
        return this.certSource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SSLAutoRotate
     */
    public Boolean getSSLAutoRotate() {
        return this.SSLAutoRotate;
    }

    /**
     * @return SSLEnabled
     */
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

    public static final class Builder {
        private String certCommonName; 
        private String certExpiredTime; 
        private String certFingerprintSha256Der; 
        private String certModifiedTime; 
        private String certSource; 
        private String requestId; 
        private Boolean SSLAutoRotate; 
        private Boolean SSLEnabled; 

        private Builder() {
        } 

        private Builder(DescribeApplicationSSLResponseBody model) {
            this.certCommonName = model.certCommonName;
            this.certExpiredTime = model.certExpiredTime;
            this.certFingerprintSha256Der = model.certFingerprintSha256Der;
            this.certModifiedTime = model.certModifiedTime;
            this.certSource = model.certSource;
            this.requestId = model.requestId;
            this.SSLAutoRotate = model.SSLAutoRotate;
            this.SSLEnabled = model.SSLEnabled;
        } 

        /**
         * CertCommonName.
         */
        public Builder certCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }

        /**
         * CertExpiredTime.
         */
        public Builder certExpiredTime(String certExpiredTime) {
            this.certExpiredTime = certExpiredTime;
            return this;
        }

        /**
         * CertFingerprintSha256Der.
         */
        public Builder certFingerprintSha256Der(String certFingerprintSha256Der) {
            this.certFingerprintSha256Der = certFingerprintSha256Der;
            return this;
        }

        /**
         * CertModifiedTime.
         */
        public Builder certModifiedTime(String certModifiedTime) {
            this.certModifiedTime = certModifiedTime;
            return this;
        }

        /**
         * CertSource.
         */
        public Builder certSource(String certSource) {
            this.certSource = certSource;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2F029645-FED9-4FE8-A6D3-488954******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SSLAutoRotate.
         */
        public Builder SSLAutoRotate(Boolean SSLAutoRotate) {
            this.SSLAutoRotate = SSLAutoRotate;
            return this;
        }

        /**
         * SSLEnabled.
         */
        public Builder SSLEnabled(Boolean SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        public DescribeApplicationSSLResponseBody build() {
            return new DescribeApplicationSSLResponseBody(this);
        } 

    } 

}
