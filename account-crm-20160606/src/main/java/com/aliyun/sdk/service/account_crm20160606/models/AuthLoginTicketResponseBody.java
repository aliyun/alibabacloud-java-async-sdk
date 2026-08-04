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
 * {@link AuthLoginTicketResponseBody} extends {@link TeaModel}
 *
 * <p>AuthLoginTicketResponseBody</p>
 */
public class AuthLoginTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LoginTicketDto")
    private LoginTicketDto loginTicketDto;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AuthLoginTicketResponseBody(Builder builder) {
        this.code = builder.code;
        this.loginTicketDto = builder.loginTicketDto;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthLoginTicketResponseBody create() {
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
     * @return loginTicketDto
     */
    public LoginTicketDto getLoginTicketDto() {
        return this.loginTicketDto;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private LoginTicketDto loginTicketDto; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AuthLoginTicketResponseBody model) {
            this.code = model.code;
            this.loginTicketDto = model.loginTicketDto;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LoginTicketDto.
         */
        public Builder loginTicketDto(LoginTicketDto loginTicketDto) {
            this.loginTicketDto = loginTicketDto;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AuthLoginTicketResponseBody build() {
            return new AuthLoginTicketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AuthLoginTicketResponseBody} extends {@link TeaModel}
     *
     * <p>AuthLoginTicketResponseBody</p>
     */
    public static class LoginTicketDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoginTicket")
        private String loginTicket;

        private LoginTicketDto(Builder builder) {
            this.loginTicket = builder.loginTicket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginTicketDto create() {
            return builder().build();
        }

        /**
         * @return loginTicket
         */
        public String getLoginTicket() {
            return this.loginTicket;
        }

        public static final class Builder {
            private String loginTicket; 

            private Builder() {
            } 

            private Builder(LoginTicketDto model) {
                this.loginTicket = model.loginTicket;
            } 

            /**
             * LoginTicket.
             */
            public Builder loginTicket(String loginTicket) {
                this.loginTicket = loginTicket;
                return this;
            }

            public LoginTicketDto build() {
                return new LoginTicketDto(this);
            } 

        } 

    }
}
