// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link CustomerNoteListDetailRequest} extends {@link RequestModel}
 *
 * <p>CustomerNoteListDetailRequest</p>
 */
public class CustomerNoteListDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoteId")
    private Long noteId;

    private CustomerNoteListDetailRequest(Builder builder) {
        super(builder);
        this.noteId = builder.noteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomerNoteListDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return noteId
     */
    public Long getNoteId() {
        return this.noteId;
    }

    public static final class Builder extends Request.Builder<CustomerNoteListDetailRequest, Builder> {
        private Long noteId; 

        private Builder() {
            super();
        } 

        private Builder(CustomerNoteListDetailRequest request) {
            super(request);
            this.noteId = request.noteId;
        } 

        /**
         * NoteId.
         */
        public Builder noteId(Long noteId) {
            this.putBodyParameter("NoteId", noteId);
            this.noteId = noteId;
            return this;
        }

        @Override
        public CustomerNoteListDetailRequest build() {
            return new CustomerNoteListDetailRequest(this);
        } 

    } 

}
