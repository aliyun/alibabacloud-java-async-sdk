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
 * {@link ListTicketNotesRequest} extends {@link RequestModel}
 *
 * <p>ListTicketNotesRequest</p>
 */
public class ListTicketNotesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    private ListTicketNotesRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketNotesRequest create() {
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

    public static final class Builder extends Request.Builder<ListTicketNotesRequest, Builder> {
        private String language; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(ListTicketNotesRequest request) {
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
         * <p>G2BKRWG</p>
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public ListTicketNotesRequest build() {
            return new ListTicketNotesRequest(this);
        } 

    } 

}
