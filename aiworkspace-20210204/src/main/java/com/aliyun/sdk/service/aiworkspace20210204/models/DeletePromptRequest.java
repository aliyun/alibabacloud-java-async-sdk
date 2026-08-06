// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link DeletePromptRequest} extends {@link RequestModel}
 *
 * <p>DeletePromptRequest</p>
 */
public class DeletePromptRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("PromptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DeletePromptRequest(Builder builder) {
        super(builder);
        this.promptId = builder.promptId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePromptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return promptId
     */
    public String getPromptId() {
        return this.promptId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeletePromptRequest, Builder> {
        private String promptId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePromptRequest request) {
            super(request);
            this.promptId = request.promptId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The prompt ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pmt-axbxtc****xxx</p>
         */
        public Builder promptId(String promptId) {
            this.putPathParameter("PromptId", promptId);
            this.promptId = promptId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeletePromptRequest build() {
            return new DeletePromptRequest(this);
        } 

    } 

}
