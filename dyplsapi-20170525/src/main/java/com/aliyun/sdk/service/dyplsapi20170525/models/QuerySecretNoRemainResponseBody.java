// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySecretNoRemainResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySecretNoRemainResponseBody</p>
 */
public class QuerySecretNoRemainResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretRemainDTO")
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
         * SecretRemainDTO.
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
        @NameInMap("Amount")
        private Long amount;

        @NameInMap("City")
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
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * City.
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
        @NameInMap("remainDTO")
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
        @NameInMap("Amount")
        private Long amount;

        @NameInMap("City")
        private String city;

        @NameInMap("RemainDTOList")
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
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
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
             * RemainDTOList.
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
