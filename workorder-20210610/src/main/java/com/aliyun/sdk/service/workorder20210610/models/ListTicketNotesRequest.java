// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

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
    @com.aliyun.core.annotation.NameInMap("TicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private ListTicketNotesRequest(Builder builder) {
        super(builder);
        this.ticketId = builder.ticketId;
        this.uid = builder.uid;
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
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<ListTicketNotesRequest, Builder> {
        private String ticketId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(ListTicketNotesRequest request) {
            super(request);
            this.ticketId = request.ticketId;
            this.uid = request.uid;
        } 

        /**
         * <p>Work Order Number</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0005PYGCW</p>
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        /**
         * <p>UID</p>
         * 
         * <strong>example:</strong>
         * <p>1936753548534516</p>
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public ListTicketNotesRequest build() {
            return new ListTicketNotesRequest(this);
        } 

    } 

}
