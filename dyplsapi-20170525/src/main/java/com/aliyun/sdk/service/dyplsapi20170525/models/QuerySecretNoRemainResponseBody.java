// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySecretNoRemainResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySecretNoRemainResponseBody</p>
 */
public class QuerySecretNoRemainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretRemainDTO")
    private SecretRemainDTO secretRemainDTO;

    private QuerySecretNoRemainResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretRemainDTO = builder.secretRemainDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySecretNoRemainResponseBody create() {
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
     * @return secretRemainDTO
     */
    public SecretRemainDTO getSecretRemainDTO() {
        return this.secretRemainDTO;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private SecretRemainDTO secretRemainDTO; 

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
         * The information returned after the operation was called.
         */
        public Builder secretRemainDTO(SecretRemainDTO secretRemainDTO) {
            this.secretRemainDTO = secretRemainDTO;
            return this;
        }

        public QuerySecretNoRemainResponseBody build() {
            return new QuerySecretNoRemainResponseBody(this);
        } 

    } 

    public static class RemainDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        private RemainDTO(Builder builder) {
            this.amount = builder.amount;
            this.city = builder.city;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemainDTO create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        public static final class Builder {
            private Long amount; 
            private String city; 

            /**
             * The quantity of remaining phone numbers available for online purchase for the city.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * The home location of the phone numbers.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            public RemainDTO build() {
                return new RemainDTO(this);
            } 

        } 

    }
    public static class RemainDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("remainDTO")
        private java.util.List < RemainDTO> remainDTO;

        private RemainDTOList(Builder builder) {
            this.remainDTO = builder.remainDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemainDTOList create() {
            return builder().build();
        }

        /**
         * @return remainDTO
         */
        public java.util.List < RemainDTO> getRemainDTO() {
            return this.remainDTO;
        }

        public static final class Builder {
            private java.util.List < RemainDTO> remainDTO; 

            /**
             * remainDTO.
             */
            public Builder remainDTO(java.util.List < RemainDTO> remainDTO) {
                this.remainDTO = remainDTO;
                return this;
            }

            public RemainDTOList build() {
                return new RemainDTOList(this);
            } 

        } 

    }
    public static class SecretRemainDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("RemainDTOList")
        private RemainDTOList remainDTOList;

        private SecretRemainDTO(Builder builder) {
            this.amount = builder.amount;
            this.city = builder.city;
            this.remainDTOList = builder.remainDTOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretRemainDTO create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return remainDTOList
         */
        public RemainDTOList getRemainDTOList() {
            return this.remainDTOList;
        }

        public static final class Builder {
            private Long amount; 
            private String city; 
            private RemainDTOList remainDTOList; 

            /**
             * The quantity of remaining phone numbers available for online purchase.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * The home location of the phone numbers.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * The information about remaining phone numbers available for online purchase.
             */
            public Builder remainDTOList(RemainDTOList remainDTOList) {
                this.remainDTOList = remainDTOList;
                return this;
            }

            public SecretRemainDTO build() {
                return new SecretRemainDTO(this);
            } 

        } 

    }
}
