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
 * {@link GetPromptRequest} extends {@link RequestModel}
 *
 * <p>GetPromptRequest</p>
 */
public class GetPromptRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("PromptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetPromptRequest(Builder builder) {
        super(builder);
        this.promptId = builder.promptId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPromptRequest create() {
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

    public static final class Builder extends Request.Builder<GetPromptRequest, Builder> {
        private String promptId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetPromptRequest request) {
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
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>114243</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetPromptRequest build() {
            return new GetPromptRequest(this);
        } 

    } 

}
