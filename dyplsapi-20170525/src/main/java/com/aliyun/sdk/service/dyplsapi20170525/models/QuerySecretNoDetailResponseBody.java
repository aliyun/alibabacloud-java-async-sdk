// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySecretNoDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySecretNoDetailResponseBody</p>
 */
public class QuerySecretNoDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretNoInfoDTO")
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
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other status codes indicate that the request failed. For more information, see [Error codes](~~109196~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The attributes of the phone number.
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
        @com.aliyun.core.annotation.NameInMap("CertifyStatus")
        private Integer certifyStatus;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("PurchaseTime")
        private String purchaseTime;

        @com.aliyun.core.annotation.NameInMap("SecretStatus")
        private Long secretStatus;

        @com.aliyun.core.annotation.NameInMap("Vendor")
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
             * The verification status of the phone number. Valid values:
             * <p>
             * 
             * *   **0**: The phone number is not verified.
             * *   **1**: The phone number is verified.
             */
            public Builder certifyStatus(Integer certifyStatus) {
                this.certifyStatus = certifyStatus;
                return this;
            }

            /**
             * The city.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * The province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * The time when the phone number was purchased.
             */
            public Builder purchaseTime(String purchaseTime) {
                this.purchaseTime = purchaseTime;
                return this;
            }

            /**
             * The status of the phone number. Valid values:
             * <p>
             * 
             * *   **0**: The phone number is not bound to other phone numbers.
             * *   **1**: The phone number is bound to other phone numbers.
             * *   **2**: The phone number is locked.
             * *   **3**: The phone number is frozen.
             */
            public Builder secretStatus(Long secretStatus) {
                this.secretStatus = secretStatus;
                return this;
            }

            /**
             * The carrier to which the phone number belongs. Valid values:
             * <p>
             * 
             * *   **1**: China Mobile
             * *   **2**: China Unicom
             * *   **3**: China Telecom
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
