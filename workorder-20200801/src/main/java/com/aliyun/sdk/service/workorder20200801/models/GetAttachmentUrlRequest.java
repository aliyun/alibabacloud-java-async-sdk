// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200801.models;

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
 * {@link GetAttachmentUrlRequest} extends {@link RequestModel}
 *
 * <p>GetAttachmentUrlRequest</p>
 */
public class GetAttachmentUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attachName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String noteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    private GetAttachmentUrlRequest(Builder builder) {
        super(builder);
        this.attachName = builder.attachName;
        this.noteId = builder.noteId;
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttachmentUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachName
     */
    public String getAttachName() {
        return this.attachName;
    }

    /**
     * @return noteId
     */
    public String getNoteId() {
        return this.noteId;
    }

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    public static final class Builder extends Request.Builder<GetAttachmentUrlRequest, Builder> {
        private String attachName; 
        private String noteId; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(GetAttachmentUrlRequest request) {
            super(request);
            this.attachName = request.attachName;
            this.noteId = request.noteId;
            this.ticketId = request.ticketId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder attachName(String attachName) {
            this.putQueryParameter("AttachName", attachName);
            this.attachName = attachName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder noteId(String noteId) {
            this.putQueryParameter("NoteId", noteId);
            this.noteId = noteId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public GetAttachmentUrlRequest build() {
            return new GetAttachmentUrlRequest(this);
        } 

    } 

}
