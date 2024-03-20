// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCaCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>GetCaCertificateResponseBody</p>
 */
public class GetCaCertificateResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public GetCaCertificateResponseBody build() {
            return new GetCaCertificateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CaContent")
        private String caContent;

        @NameInMap("CaName")
        private String caName;

        @NameInMap("RegistrationCode")
        private String registrationCode;

        @NameInMap("Sn")
        private String sn;

        @NameInMap("Status")
        private String status;

        @NameInMap("ValidBegin")
        private String validBegin;

        @NameInMap("ValidEnd")
        private String validEnd;

        @NameInMap("VerificationContent")
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

            /**
             * CaContent.
             */
            public Builder caContent(String caContent) {
                this.caContent = caContent;
                return this;
            }

            /**
             * CaName.
             */
            public Builder caName(String caName) {
                this.caName = caName;
                return this;
            }

            /**
             * RegistrationCode.
             */
            public Builder registrationCode(String registrationCode) {
                this.registrationCode = registrationCode;
                return this;
            }

            /**
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * ValidBegin.
             */
            public Builder validBegin(String validBegin) {
                this.validBegin = validBegin;
                return this;
            }

            /**
             * ValidEnd.
             */
            public Builder validEnd(String validEnd) {
                this.validEnd = validEnd;
                return this;
            }

            /**
             * VerificationContent.
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
