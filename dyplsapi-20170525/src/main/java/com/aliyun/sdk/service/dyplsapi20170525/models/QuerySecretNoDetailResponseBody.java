// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other status codes indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>066E6E47-04CB-4774-A976-4F73CB76D4A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The attributes of the phone number.</p>
         */
        public Builder secretNoInfoDTO(SecretNoInfoDTO secretNoInfoDTO) {
            this.secretNoInfoDTO = secretNoInfoDTO;
            return this;
        }

        public QuerySecretNoDetailResponseBody build() {
            return new QuerySecretNoDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySecretNoDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySecretNoDetailResponseBody</p>
     */
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
             * <p>The verification status of the phone number. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The phone number is not verified.</li>
             * <li><strong>1</strong>: The phone number is verified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder certifyStatus(Integer certifyStatus) {
                this.certifyStatus = certifyStatus;
                return this;
            }

            /**
             * <p>The city.</p>
             * 
             * <strong>example:</strong>
             * <p>chengdu</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The province.</p>
             * 
             * <strong>example:</strong>
             * <p>sichuan</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * <p>The time when the phone number was purchased.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-03 15:19:27</p>
             */
            public Builder purchaseTime(String purchaseTime) {
                this.purchaseTime = purchaseTime;
                return this;
            }

            /**
             * <p>The status of the phone number. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The phone number is not bound to other phone numbers.</li>
             * <li><strong>1</strong>: The phone number is bound to other phone numbers.</li>
             * <li><strong>2</strong>: The phone number is locked.</li>
             * <li><strong>3</strong>: The phone number is frozen.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder secretStatus(Long secretStatus) {
                this.secretStatus = secretStatus;
                return this;
            }

            /**
             * <p>The carrier to which the phone number belongs. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: China Mobile</li>
             * <li><strong>2</strong>: China Unicom</li>
             * <li><strong>3</strong>: China Telecom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
