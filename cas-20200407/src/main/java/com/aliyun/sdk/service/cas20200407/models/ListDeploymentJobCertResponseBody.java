// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeploymentJobCertResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeploymentJobCertResponseBody</p>
 */
public class ListDeploymentJobCertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDeploymentJobCertResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentJobCertResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeploymentJobCertResponseBody build() {
            return new ListDeploymentJobCertResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private Long certId;

        @com.aliyun.core.annotation.NameInMap("CertInstanceId")
        private String certInstanceId;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CertOrderType")
        private String certOrderType;

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("IsTrustee")
        private Boolean isTrustee;

        @com.aliyun.core.annotation.NameInMap("Month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("NotAfterTime")
        private Long notAfterTime;

        @com.aliyun.core.annotation.NameInMap("NotBeforeTime")
        private Long notBeforeTime;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("Sans")
        private java.util.List < String > sans;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        private Data(Builder builder) {
            this.algorithm = builder.algorithm;
            this.certId = builder.certId;
            this.certInstanceId = builder.certInstanceId;
            this.certName = builder.certName;
            this.certOrderType = builder.certOrderType;
            this.certType = builder.certType;
            this.commonName = builder.commonName;
            this.isTrustee = builder.isTrustee;
            this.month = builder.month;
            this.notAfterTime = builder.notAfterTime;
            this.notBeforeTime = builder.notBeforeTime;
            this.orderId = builder.orderId;
            this.sans = builder.sans;
            this.statusCode = builder.statusCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return certId
         */
        public Long getCertId() {
            return this.certId;
        }

        /**
         * @return certInstanceId
         */
        public String getCertInstanceId() {
            return this.certInstanceId;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certOrderType
         */
        public String getCertOrderType() {
            return this.certOrderType;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return isTrustee
         */
        public Boolean getIsTrustee() {
            return this.isTrustee;
        }

        /**
         * @return month
         */
        public Integer getMonth() {
            return this.month;
        }

        /**
         * @return notAfterTime
         */
        public Long getNotAfterTime() {
            return this.notAfterTime;
        }

        /**
         * @return notBeforeTime
         */
        public Long getNotBeforeTime() {
            return this.notBeforeTime;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return sans
         */
        public java.util.List < String > getSans() {
            return this.sans;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        public static final class Builder {
            private String algorithm; 
            private Long certId; 
            private String certInstanceId; 
            private String certName; 
            private String certOrderType; 
            private String certType; 
            private String commonName; 
            private Boolean isTrustee; 
            private Integer month; 
            private Long notAfterTime; 
            private Long notBeforeTime; 
            private Long orderId; 
            private java.util.List < String > sans; 
            private String statusCode; 

            /**
             * Algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * CertId.
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * CertInstanceId.
             */
            public Builder certInstanceId(String certInstanceId) {
                this.certInstanceId = certInstanceId;
                return this;
            }

            /**
             * CertName.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * CertOrderType.
             */
            public Builder certOrderType(String certOrderType) {
                this.certOrderType = certOrderType;
                return this;
            }

            /**
             * CertType.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * CommonName.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * IsTrustee.
             */
            public Builder isTrustee(Boolean isTrustee) {
                this.isTrustee = isTrustee;
                return this;
            }

            /**
             * Month.
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * NotAfterTime.
             */
            public Builder notAfterTime(Long notAfterTime) {
                this.notAfterTime = notAfterTime;
                return this;
            }

            /**
             * NotBeforeTime.
             */
            public Builder notBeforeTime(Long notBeforeTime) {
                this.notBeforeTime = notBeforeTime;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * Sans.
             */
            public Builder sans(java.util.List < String > sans) {
                this.sans = sans;
                return this;
            }

            /**
             * StatusCode.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
