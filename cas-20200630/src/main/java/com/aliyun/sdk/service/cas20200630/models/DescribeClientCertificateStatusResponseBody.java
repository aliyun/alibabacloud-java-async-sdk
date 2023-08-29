// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientCertificateStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientCertificateStatusResponseBody</p>
 */
public class DescribeClientCertificateStatusResponseBody extends TeaModel {
    @NameInMap("CertificateStatus")
    private java.util.List < CertificateStatus> certificateStatus;

    @NameInMap("RequestId")
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

    /**
     * @return certificateStatus
     */
    public java.util.List < CertificateStatus> getCertificateStatus() {
        return this.certificateStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CertificateStatus> certificateStatus; 
        private String requestId; 

        /**
         * CertificateStatus.
         */
        public Builder certificateStatus(java.util.List < CertificateStatus> certificateStatus) {
            this.certificateStatus = certificateStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClientCertificateStatusResponseBody build() {
            return new DescribeClientCertificateStatusResponseBody(this);
        } 

    } 

    public static class CertificateStatus extends TeaModel {
        @NameInMap("RevokeTime")
        private Long revokeTime;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("Status")
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

            /**
             * RevokeTime.
             */
            public Builder revokeTime(Long revokeTime) {
                this.revokeTime = revokeTime;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * Status.
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
