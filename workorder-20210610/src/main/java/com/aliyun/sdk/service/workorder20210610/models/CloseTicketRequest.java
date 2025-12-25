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
 * {@link CloseTicketRequest} extends {@link RequestModel}
 *
 * <p>CloseTicketRequest</p>
 */
public class CloseTicketRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private CloseTicketRequest(Builder builder) {
        super(builder);
        this.ticketId = builder.ticketId;
        this.uid = builder.uid;
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

    public static final class Builder extends Request.Builder<CloseTicketRequest, Builder> {
        private String ticketId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(CloseTicketRequest request) {
            super(request);
            this.ticketId = request.ticketId;
            this.uid = request.uid;
        } 

        /**
         * <p>Work Order Number</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>G2BKRWG</p>
         */
        public Builder ticketId(String ticketId) {
            this.putBodyParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account. You can view your UID in the profile picture in the upper-right corner of the DMS console.</p>
         * 
         * <strong>example:</strong>
         * <p>1139477549527134</p>
         */
        public Builder uid(String uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public CloseTicketRequest build() {
            return new CloseTicketRequest(this);
        } 

    } 

}
