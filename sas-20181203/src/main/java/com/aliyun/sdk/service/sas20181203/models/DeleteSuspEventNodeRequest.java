// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSuspEventNodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteSuspEventNodeRequest</p>
 */
public class DeleteSuspEventNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoteId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the description.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain the ID of the description by using the EventNotes field.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
