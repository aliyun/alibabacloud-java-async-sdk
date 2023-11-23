// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCustInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCustInfoResponseBody</p>
 */
public class QueryCustInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    private QueryCustInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Data data; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryCustInfoResponseBody build() {
            return new QueryCustInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CertifyType")
        private Integer certifyType;

        @NameInMap("ContactPhone")
        private String contactPhone;

        @NameInMap("CustId")
        private Long custId;

        @NameInMap("CustName")
        private String custName;

        @NameInMap("IsDayuCustomer")
        private Boolean isDayuCustomer;

        @NameInMap("OsStatus")
        private Integer osStatus;

        @NameInMap("PartnerId")
        private Long partnerId;

        @NameInMap("UserTag")
        private Long userTag;

        @NameInMap("UserTag2")
        private Long userTag2;

        private Data(Builder builder) {
            this.certifyType = builder.certifyType;
            this.contactPhone = builder.contactPhone;
            this.custId = builder.custId;
            this.custName = builder.custName;
            this.isDayuCustomer = builder.isDayuCustomer;
            this.osStatus = builder.osStatus;
            this.partnerId = builder.partnerId;
            this.userTag = builder.userTag;
            this.userTag2 = builder.userTag2;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return certifyType
         */
        public Integer getCertifyType() {
            return this.certifyType;
        }

        /**
         * @return contactPhone
         */
        public String getContactPhone() {
            return this.contactPhone;
        }

        /**
         * @return custId
         */
        public Long getCustId() {
            return this.custId;
        }

        /**
         * @return custName
         */
        public String getCustName() {
            return this.custName;
        }

        /**
         * @return isDayuCustomer
         */
        public Boolean getIsDayuCustomer() {
            return this.isDayuCustomer;
        }

        /**
         * @return osStatus
         */
        public Integer getOsStatus() {
            return this.osStatus;
        }

        /**
         * @return partnerId
         */
        public Long getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return userTag
         */
        public Long getUserTag() {
            return this.userTag;
        }

        /**
         * @return userTag2
         */
        public Long getUserTag2() {
            return this.userTag2;
        }

        public static final class Builder {
            private Integer certifyType; 
            private String contactPhone; 
            private Long custId; 
            private String custName; 
            private Boolean isDayuCustomer; 
            private Integer osStatus; 
            private Long partnerId; 
            private Long userTag; 
            private Long userTag2; 

            /**
             * CertifyType.
             */
            public Builder certifyType(Integer certifyType) {
                this.certifyType = certifyType;
                return this;
            }

            /**
             * ContactPhone.
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
                return this;
            }

            /**
             * CustId.
             */
            public Builder custId(Long custId) {
                this.custId = custId;
                return this;
            }

            /**
             * CustName.
             */
            public Builder custName(String custName) {
                this.custName = custName;
                return this;
            }

            /**
             * IsDayuCustomer.
             */
            public Builder isDayuCustomer(Boolean isDayuCustomer) {
                this.isDayuCustomer = isDayuCustomer;
                return this;
            }

            /**
             * OsStatus.
             */
            public Builder osStatus(Integer osStatus) {
                this.osStatus = osStatus;
                return this;
            }

            /**
             * PartnerId.
             */
            public Builder partnerId(Long partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * UserTag.
             */
            public Builder userTag(Long userTag) {
                this.userTag = userTag;
                return this;
            }

            /**
             * UserTag2.
             */
            public Builder userTag2(Long userTag2) {
                this.userTag2 = userTag2;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
