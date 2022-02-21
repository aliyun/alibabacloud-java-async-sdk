// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySecretNoDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySecretNoDetailResponseBody</p>
 */
public class QuerySecretNoDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretNoInfoDTO")
    private SecretNoInfoDTO secretNoInfoDTO;

    private QuerySecretNoDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretNoInfoDTO = builder.secretNoInfoDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySecretNoDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretNoInfoDTO
     */
    public SecretNoInfoDTO getSecretNoInfoDTO() {
        return this.secretNoInfoDTO;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private SecretNoInfoDTO secretNoInfoDTO; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecretNoInfoDTO.
         */
        public Builder secretNoInfoDTO(SecretNoInfoDTO secretNoInfoDTO) {
            this.secretNoInfoDTO = secretNoInfoDTO;
            return this;
        }

        public QuerySecretNoDetailResponseBody build() {
            return new QuerySecretNoDetailResponseBody(this);
        } 

    } 

    public static class SecretNoInfoDTO extends TeaModel {
        @NameInMap("CertifyStatus")
        private Integer certifyStatus;

        @NameInMap("City")
        private String city;

        @NameInMap("Province")
        private String province;

        @NameInMap("PurchaseTime")
        private String purchaseTime;

        @NameInMap("SecretStatus")
        private Long secretStatus;

        @NameInMap("Vendor")
        private Long vendor;

        private SecretNoInfoDTO(Builder builder) {
            this.certifyStatus = builder.certifyStatus;
            this.city = builder.city;
            this.province = builder.province;
            this.purchaseTime = builder.purchaseTime;
            this.secretStatus = builder.secretStatus;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretNoInfoDTO create() {
            return builder().build();
        }

        /**
         * @return certifyStatus
         */
        public Integer getCertifyStatus() {
            return this.certifyStatus;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return purchaseTime
         */
        public String getPurchaseTime() {
            return this.purchaseTime;
        }

        /**
         * @return secretStatus
         */
        public Long getSecretStatus() {
            return this.secretStatus;
        }

        /**
         * @return vendor
         */
        public Long getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private Integer certifyStatus; 
            private String city; 
            private String province; 
            private String purchaseTime; 
            private Long secretStatus; 
            private Long vendor; 

            /**
             * CertifyStatus.
             */
            public Builder certifyStatus(Integer certifyStatus) {
                this.certifyStatus = certifyStatus;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * PurchaseTime.
             */
            public Builder purchaseTime(String purchaseTime) {
                this.purchaseTime = purchaseTime;
                return this;
            }

            /**
             * SecretStatus.
             */
            public Builder secretStatus(Long secretStatus) {
                this.secretStatus = secretStatus;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(Long vendor) {
                this.vendor = vendor;
                return this;
            }

            public SecretNoInfoDTO build() {
                return new SecretNoInfoDTO(this);
            } 

        } 

    }
}
