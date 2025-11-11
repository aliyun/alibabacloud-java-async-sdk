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
 * {@link SubmitExportTermsTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitExportTermsTaskRequest</p>
 */
public class SubmitExportTermsTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TermsName")
    private String termsName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SubmitExportTermsTaskRequest(Builder builder) {
        super(builder);
        this.termsName = builder.termsName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitExportTermsTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return termsName
     */
    public String getTermsName() {
        return this.termsName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitExportTermsTaskRequest, Builder> {
        private String termsName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitExportTermsTaskRequest request) {
            super(request);
            this.termsName = request.termsName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * TermsName.
         */
        public Builder termsName(String termsName) {
            this.putBodyParameter("TermsName", termsName);
            this.termsName = termsName;
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
        public SubmitExportTermsTaskRequest build() {
            return new SubmitExportTermsTaskRequest(this);
        } 

    } 

}
