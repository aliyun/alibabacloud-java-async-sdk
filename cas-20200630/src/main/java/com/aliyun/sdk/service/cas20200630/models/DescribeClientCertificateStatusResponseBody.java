// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link DescribeClientCertificateStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientCertificateStatusResponseBody</p>
 */
public class DescribeClientCertificateStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateStatus")
    private java.util.List<CertificateStatus> certificateStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClientCertificateStatusResponseBody(Builder builder) {
        this.certificateStatus = builder.certificateStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientCertificateStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateStatus
     */
    public java.util.List<CertificateStatus> getCertificateStatus() {
        return this.certificateStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CertificateStatus> certificateStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClientCertificateStatusResponseBody model) {
            this.certificateStatus = model.certificateStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the status information about the certificates.</p>
         */
        public Builder certificateStatus(java.util.List<CertificateStatus> certificateStatus) {
            this.certificateStatus = certificateStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClientCertificateStatusResponseBody build() {
            return new DescribeClientCertificateStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClientCertificateStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientCertificateStatusResponseBody</p>
     */
    public static class CertificateStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RevokeTime")
        private Long revokeTime;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CertificateStatus(Builder builder) {
            this.revokeTime = builder.revokeTime;
            this.serialNumber = builder.serialNumber;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateStatus create() {
            return builder().build();
        }

        /**
         * @return revokeTime
         */
        public Long getRevokeTime() {
            return this.revokeTime;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long revokeTime; 
            private String serialNumber; 
            private String status; 

            private Builder() {
            } 

            private Builder(CertificateStatus model) {
                this.revokeTime = model.revokeTime;
                this.serialNumber = model.serialNumber;
                this.status = model.status;
            } 

            /**
             * <p>The date on which the certificate was revoked.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of the <strong>Status</strong> parameter is <strong>revoked</strong>. The value revoked indicates that the certificate is revoked.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2021-01-01T00:00Z</p>
             */
            public Builder revokeTime(Long revokeTime) {
                this.revokeTime = revokeTime;
                return this;
            }

            /**
             * <p>The serial number of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>b67e53ebcea9b77d65b0c3236646d715****</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The status of the certificate. Valid values:</p>
             * <ul>
             * <li><strong>good</strong>: The certificate is not revoked.</li>
             * <li><strong>revoked</strong>: The certificate is revoked.</li>
             * <li><strong>unknown</strong>: The server cannot determine the status of the certificate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>good</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CertificateStatus build() {
                return new CertificateStatus(this);
            } 

        } 

    }
}
