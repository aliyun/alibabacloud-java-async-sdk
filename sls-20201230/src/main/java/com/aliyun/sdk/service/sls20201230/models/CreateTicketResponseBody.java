// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateTicketResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTicketResponseBody</p>
 */
public class CreateTicketResponseBody extends TeaModel {
    @NameInMap("ticket")
    private String ticket;

    private CreateTicketResponseBody(Builder builder) {
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicketResponseBody create() {
        return builder().build();
    }

    /**
     * @return ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    public static final class Builder {
        private String ticket; 

        /**
         * ticket.
         */
        public Builder ticket(String ticket) {
            this.ticket = ticket;
            return this;
        }

        public CreateTicketResponseBody build() {
            return new CreateTicketResponseBody(this);
        } 

    } 

}
