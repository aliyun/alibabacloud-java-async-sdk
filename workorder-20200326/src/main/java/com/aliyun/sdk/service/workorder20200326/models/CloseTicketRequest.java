// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200326.models;

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
 * {@link CloseTicketRequest} extends {@link RequestModel}
 *
 * <p>CloseTicketRequest</p>
 */
public class CloseTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    private CloseTicketRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    public static final class Builder extends Request.Builder<CloseTicketRequest, Builder> {
        private String language; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(CloseTicketRequest request) {
            super(request);
            this.language = request.language;
            this.ticketId = request.ticketId;
        } 

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3EBYRY7</p>
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public CloseTicketRequest build() {
            return new CloseTicketRequest(this);
        } 

    } 

}
