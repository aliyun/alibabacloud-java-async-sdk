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
 * {@link DeleteSuspEventNodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteSuspEventNodeRequest</p>
 */
public class DeleteSuspEventNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long noteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    private DeleteSuspEventNodeRequest(Builder builder) {
        super(builder);
        this.noteId = builder.noteId;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
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

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static final class Builder extends Request.Builder<DeleteSuspEventNodeRequest, Builder> {
        private Long noteId; 
        private Long resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSuspEventNodeRequest request) {
            super(request);
            this.noteId = request.noteId;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * <p>The ID of the note.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain this parameter from the EventNotes field.</p>
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

        /**
         * <p>The Alibaba Cloud account ID of the member account in the resource directory.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        @Override
        public DeleteSuspEventNodeRequest build() {
            return new DeleteSuspEventNodeRequest(this);
        } 

    } 

}
