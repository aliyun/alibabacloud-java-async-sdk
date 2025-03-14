// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteMaliciousNoteRequest} extends {@link RequestModel}
 *
 * <p>DeleteMaliciousNoteRequest</p>
 */
public class DeleteMaliciousNoteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoteId")
    private Long noteId;

    private DeleteMaliciousNoteRequest(Builder builder) {
        super(builder);
        this.noteId = builder.noteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMaliciousNoteRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteMaliciousNoteRequest, Builder> {
        private Long noteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMaliciousNoteRequest request) {
            super(request);
            this.noteId = request.noteId;
        } 

        /**
         * <p>The ID of the remarks.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListAgentlessMaliciousFiles~~">ListAgentlessMaliciousFiles</a> operation to obtain the ID from the NoteId parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder noteId(Long noteId) {
            this.putQueryParameter("NoteId", noteId);
            this.noteId = noteId;
            return this;
        }

        @Override
        public DeleteMaliciousNoteRequest build() {
            return new DeleteMaliciousNoteRequest(this);
        } 

    } 

}
