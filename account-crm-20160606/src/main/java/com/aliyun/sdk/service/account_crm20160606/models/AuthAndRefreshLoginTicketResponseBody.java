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
 * {@link AuthAndRefreshLoginTicketResponseBody} extends {@link TeaModel}
 *
 * <p>AuthAndRefreshLoginTicketResponseBody</p>
 */
public class AuthAndRefreshLoginTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AuthAndRefreshLoginTicketResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthAndRefreshLoginTicketResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AuthAndRefreshLoginTicketResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AuthAndRefreshLoginTicketResponseBody build() {
            return new AuthAndRefreshLoginTicketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AuthAndRefreshLoginTicketResponseBody} extends {@link TeaModel}
     *
     * <p>AuthAndRefreshLoginTicketResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewLoginTicket")
        private String newLoginTicket;

        private Data(Builder builder) {
            this.newLoginTicket = builder.newLoginTicket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return newLoginTicket
         */
        public String getNewLoginTicket() {
            return this.newLoginTicket;
        }

        public static final class Builder {
            private String newLoginTicket; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.newLoginTicket = model.newLoginTicket;
            } 

            /**
             * NewLoginTicket.
             */
            public Builder newLoginTicket(String newLoginTicket) {
                this.newLoginTicket = newLoginTicket;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
