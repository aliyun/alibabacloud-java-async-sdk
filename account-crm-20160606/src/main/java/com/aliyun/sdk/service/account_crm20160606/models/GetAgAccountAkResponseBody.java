// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link GetAgAccountAkResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgAccountAkResponseBody</p>
 */
public class GetAgAccountAkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountAkDto")
    private AccountAkDto accountAkDto;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetAgAccountAkResponseBody(Builder builder) {
        this.accountAkDto = builder.accountAkDto;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgAccountAkResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountAkDto
     */
    public AccountAkDto getAccountAkDto() {
        return this.accountAkDto;
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private AccountAkDto accountAkDto; 
        private String code; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetAgAccountAkResponseBody model) {
            this.accountAkDto = model.accountAkDto;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccountAkDto.
         */
        public Builder accountAkDto(AccountAkDto accountAkDto) {
            this.accountAkDto = accountAkDto;
            return this;
        }

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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetAgAccountAkResponseBody build() {
            return new GetAgAccountAkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgAccountAkResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgAccountAkResponseBody</p>
     */
    public static class AccountAkDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ak")
        private String ak;

        @com.aliyun.core.annotation.NameInMap("Secret")
        private String secret;

        private AccountAkDto(Builder builder) {
            this.ak = builder.ak;
            this.secret = builder.secret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountAkDto create() {
            return builder().build();
        }

        /**
         * @return ak
         */
        public String getAk() {
            return this.ak;
        }

        /**
         * @return secret
         */
        public String getSecret() {
            return this.secret;
        }

        public static final class Builder {
            private String ak; 
            private String secret; 

            private Builder() {
            } 

            private Builder(AccountAkDto model) {
                this.ak = model.ak;
                this.secret = model.secret;
            } 

            /**
             * Ak.
             */
            public Builder ak(String ak) {
                this.ak = ak;
                return this;
            }

            /**
             * Secret.
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            public AccountAkDto build() {
                return new AccountAkDto(this);
            } 

        } 

    }
}
