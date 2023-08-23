// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSuspEventNodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteSuspEventNodeRequest</p>
 */
public class DeleteSuspEventNodeRequest extends Request {
    @Query
    @NameInMap("NoteId")
    @Validation(required = true)
    private Long noteId;

    private DeleteSuspEventNodeRequest(Builder builder) {
        super(builder);
        this.noteId = builder.noteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSuspEventNodeRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSuspEventNodeRequest, Builder> {
        private Long noteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSuspEventNodeRequest request) {
            super(request);
            this.noteId = request.noteId;
        } 

        /**
         * The ID of the description.
         * <p>
         * 
         * > You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to obtain the ID of the description by using the EventNotes field.
         */
        public Builder noteId(Long noteId) {
            this.putQueryParameter("NoteId", noteId);
            this.noteId = noteId;
            return this;
        }

        @Override
        public DeleteSuspEventNodeRequest build() {
            return new DeleteSuspEventNodeRequest(this);
        } 

    } 

}
