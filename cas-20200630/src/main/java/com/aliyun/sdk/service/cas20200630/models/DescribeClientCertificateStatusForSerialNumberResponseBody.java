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
 * {@link DescribeClientCertificateStatusForSerialNumberResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientCertificateStatusForSerialNumberResponseBody</p>
 */
public class DescribeClientCertificateStatusForSerialNumberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateStatus")
    private java.util.List<CertificateStatus> certificateStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClientCertificateStatusForSerialNumberResponseBody(Builder builder) {
        this.certificateStatus = builder.certificateStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientCertificateStatusForSerialNumberResponseBody create() {
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

        private Builder(DescribeClientCertificateStatusForSerialNumberResponseBody model) {
            this.certificateStatus = model.certificateStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The certificate status details.</p>
         */
        public Builder certificateStatus(java.util.List<CertificateStatus> certificateStatus) {
            this.certificateStatus = certificateStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClientCertificateStatusForSerialNumberResponseBody build() {
            return new DescribeClientCertificateStatusForSerialNumberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClientCertificateStatusForSerialNumberResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientCertificateStatusForSerialNumberResponseBody</p>
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
             * <p>The date when the certificate was revoked. This value is a UNIX timestamp in milliseconds.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Status</strong> is <strong>revoked</strong> (indicating that the certificate has been revoked).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1787539908871</p>
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
             * <p>The current status of the certificate. Valid values:</p>
             * <ul>
             * <li><strong>good</strong>: The certificate has not been revoked.</li>
             * <li><strong>revoked</strong>: The certificate has been revoked.</li>
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
