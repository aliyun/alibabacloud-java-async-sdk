// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMaliciousNoteRequest} extends {@link RequestModel}
 *
 * <p>DeleteMaliciousNoteRequest</p>
 */
public class DeleteMaliciousNoteRequest extends Request {
    @Query
    @NameInMap("NoteId")
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
         * The ID of the remarks.
         * <p>
         * 
         * >  You can call the [ListAgentlessMaliciousFiles](~~ListAgentlessMaliciousFiles~~) operation to obtain the ID from the NoteId parameter.
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
