// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link GetCaCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>GetCaCertificateResponseBody</p>
 */
public class GetCaCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCaCertificateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCaCertificateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCaCertificateResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Certificate details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Public parameters, each request ID is unique and can be used for troubleshooting and problem localization.</p>
         * 
         * <strong>example:</strong>
         * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCaCertificateResponseBody build() {
            return new GetCaCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCaCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>GetCaCertificateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaContent")
        private String caContent;

        @com.aliyun.core.annotation.NameInMap("CaName")
        private String caName;

        @com.aliyun.core.annotation.NameInMap("RegistrationCode")
        private String registrationCode;

        @com.aliyun.core.annotation.NameInMap("Sn")
        private String sn;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ValidBegin")
        private String validBegin;

        @com.aliyun.core.annotation.NameInMap("ValidEnd")
        private String validEnd;

        @com.aliyun.core.annotation.NameInMap("VerificationContent")
        private String verificationContent;

        private Data(Builder builder) {
            this.caContent = builder.caContent;
            this.caName = builder.caName;
            this.registrationCode = builder.registrationCode;
            this.sn = builder.sn;
            this.status = builder.status;
            this.validBegin = builder.validBegin;
            this.validEnd = builder.validEnd;
            this.verificationContent = builder.verificationContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return caContent
         */
        public String getCaContent() {
            return this.caContent;
        }

        /**
         * @return caName
         */
        public String getCaName() {
            return this.caName;
        }

        /**
         * @return registrationCode
         */
        public String getRegistrationCode() {
            return this.registrationCode;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return validBegin
         */
        public String getValidBegin() {
            return this.validBegin;
        }

        /**
         * @return validEnd
         */
        public String getValidEnd() {
            return this.validEnd;
        }

        /**
         * @return verificationContent
         */
        public String getVerificationContent() {
            return this.verificationContent;
        }

        public static final class Builder {
            private String caContent; 
            private String caName; 
            private String registrationCode; 
            private String sn; 
            private String status; 
            private String validBegin; 
            private String validEnd; 
            private String verificationContent; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.caContent = model.caContent;
                this.caName = model.caName;
                this.registrationCode = model.registrationCode;
                this.sn = model.sn;
                this.status = model.status;
                this.validBegin = model.validBegin;
                this.validEnd = model.validEnd;
                this.verificationContent = model.verificationContent;
            } 

            /**
             * <p>Content of the CA certificate.</p>
             * <blockquote>
             * <p>\n represents a new line.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----\nMIIDuzCCAqdGVzdC5jbi1xaW5n******\n-----END CERTIFICATE-----</p>
             */
            public Builder caContent(String caContent) {
                this.caContent = caContent;
                return this;
            }

            /**
             * <p>Name of the CA certificate</p>
             * 
             * <strong>example:</strong>
             * <p>mqtt_ca</p>
             */
            public Builder caName(String caName) {
                this.caName = caName;
                return this;
            }

            /**
             * <p>Registration code of the CA certificate</p>
             * 
             * <strong>example:</strong>
             * <p>13274673-8f90-4630-bea1-9cccb25756ad2089******</p>
             */
            public Builder registrationCode(String registrationCode) {
                this.registrationCode = registrationCode;
                return this;
            }

            /**
             * <p>The SN serial number of the CA certificate, used to uniquely identify a CA certificate. Value range: no more than 128 bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>00f26900ba87******</p>
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * <p>The status of the CA certificate. The values are as follows:</p>
             * <ul>
             * <li><strong>0</strong>: Indicates that the certificate is in an inactive state. - <strong>1</strong>: Indicates that the certificate is in an active state.<blockquote>
             * <p>After the CA certificate is registered, it is in an active state by default.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The start time when the CA certificate becomes effective. The format is a Unix timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1654137303000</p>
             */
            public Builder validBegin(String validBegin) {
                this.validBegin = validBegin;
                return this;
            }

            /**
             * <p>The end time when the CA certificate becomes effective. The format is a Unix timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1969497303000</p>
             */
            public Builder validEnd(String validEnd) {
                this.validEnd = validEnd;
                return this;
            }

            /**
             * <p>Content of the Verification certificate.</p>
             * <blockquote>
             * <p>\n represents a new line.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----\nMIID/DCCAu+Y5sRMpp9tnd+4s******\n-----END CERTIFICATE-----</p>
             */
            public Builder verificationContent(String verificationContent) {
                this.verificationContent = verificationContent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
