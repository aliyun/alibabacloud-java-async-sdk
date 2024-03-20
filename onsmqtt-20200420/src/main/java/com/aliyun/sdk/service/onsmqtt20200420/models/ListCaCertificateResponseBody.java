// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCaCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>ListCaCertificateResponseBody</p>
 */
public class ListCaCertificateResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListCaCertificateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCaCertificateResponseBody create() {
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

        public ListCaCertificateResponseBody build() {
            return new ListCaCertificateResponseBody(this);
        } 

    } 

    public static class CaCertificateVOS extends TeaModel {
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

        private CaCertificateVOS(Builder builder) {
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

        public static CaCertificateVOS create() {
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

            public CaCertificateVOS build() {
                return new CaCertificateVOS(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CaCertificateVOS")
        private java.util.List < CaCertificateVOS> caCertificateVOS;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.caCertificateVOS = builder.caCertificateVOS;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return caCertificateVOS
         */
        public java.util.List < CaCertificateVOS> getCaCertificateVOS() {
            return this.caCertificateVOS;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < CaCertificateVOS> caCertificateVOS; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * CaCertificateVOS.
             */
            public Builder caCertificateVOS(java.util.List < CaCertificateVOS> caCertificateVOS) {
                this.caCertificateVOS = caCertificateVOS;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
