// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetAvailableAuditNotesRequest} extends {@link RequestModel}
 *
 * <p>GetAvailableAuditNotesRequest</p>
 */
public class GetAvailableAuditNotesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoteId")
    private String noteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetAvailableAuditNotesRequest(Builder builder) {
        super(builder);
        this.noteId = builder.noteId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvailableAuditNotesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return noteId
     */
    public String getNoteId() {
        return this.noteId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetAvailableAuditNotesRequest, Builder> {
        private String noteId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAvailableAuditNotesRequest request) {
            super(request);
            this.noteId = request.noteId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * NoteId.
         */
        public Builder noteId(String noteId) {
            this.putBodyParameter("NoteId", noteId);
            this.noteId = noteId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetAvailableAuditNotesRequest build() {
            return new GetAvailableAuditNotesRequest(this);
        } 

    } 

}
