// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QuerySecretNoRemainResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.secretRemainDTO = model.secretRemainDTO;
        } 

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
         * <p>9FC30594-3841-43AD-9008-03393BCB5CD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information returned after the operation was called.</p>
         */
        public Builder secretRemainDTO(SecretRemainDTO secretRemainDTO) {
            this.secretRemainDTO = secretRemainDTO;
            return this;
        }

        public QuerySecretNoRemainResponseBody build() {
            return new QuerySecretNoRemainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySecretNoRemainResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySecretNoRemainResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RemainDTO model) {
                this.amount = model.amount;
                this.city = model.city;
            } 

            /**
             * <p>The quantity of remaining phone numbers available for online purchase for the city.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The home location of the phone numbers.</p>
             * 
             * <strong>example:</strong>
             * <p>Wuhan</p>
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
    /**
     * 
     * {@link QuerySecretNoRemainResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySecretNoRemainResponseBody</p>
     */
    public static class RemainDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("remainDTO")
        private java.util.List<RemainDTO> remainDTO;

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
        public java.util.List<RemainDTO> getRemainDTO() {
            return this.remainDTO;
        }

        public static final class Builder {
            private java.util.List<RemainDTO> remainDTO; 

            private Builder() {
            } 

            private Builder(RemainDTOList model) {
                this.remainDTO = model.remainDTO;
            } 

            /**
             * remainDTO.
             */
            public Builder remainDTO(java.util.List<RemainDTO> remainDTO) {
                this.remainDTO = remainDTO;
                return this;
            }

            public RemainDTOList build() {
                return new RemainDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySecretNoRemainResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySecretNoRemainResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SecretRemainDTO model) {
                this.amount = model.amount;
                this.city = model.city;
                this.remainDTOList = model.remainDTOList;
            } 

            /**
             * <p>The quantity of remaining phone numbers available for online purchase.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The home location of the phone numbers.</p>
             * 
             * <strong>example:</strong>
             * <p>hangzhou</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The information about remaining phone numbers available for online purchase.</p>
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
