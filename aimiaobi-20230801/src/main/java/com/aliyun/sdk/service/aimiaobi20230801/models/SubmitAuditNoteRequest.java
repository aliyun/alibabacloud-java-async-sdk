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
 * {@link SubmitAuditNoteRequest} extends {@link RequestModel}
 *
 * <p>SubmitAuditNoteRequest</p>
 */
public class SubmitAuditNoteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SubmitAuditNoteRequest(Builder builder) {
        super(builder);
        this.fileKey = builder.fileKey;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAuditNoteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitAuditNoteRequest, Builder> {
        private String fileKey; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAuditNoteRequest request) {
            super(request);
            this.fileKey = request.fileKey;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://default/your/file/key</p>
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
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
        public SubmitAuditNoteRequest build() {
            return new SubmitAuditNoteRequest(this);
        } 

    } 

}
