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
 * {@link SubmitSmartAuditRequest} extends {@link RequestModel}
 *
 * <p>SubmitSmartAuditRequest</p>
 */
public class SubmitSmartAuditRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubCodes")
    private java.util.List<String> subCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private SubmitSmartAuditRequest(Builder builder) {
        super(builder);
        this.subCodes = builder.subCodes;
        this.text = builder.text;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSmartAuditRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subCodes
     */
    public java.util.List<String> getSubCodes() {
        return this.subCodes;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitSmartAuditRequest, Builder> {
        private java.util.List<String> subCodes; 
        private String text; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSmartAuditRequest request) {
            super(request);
            this.subCodes = request.subCodes;
            this.text = request.text;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * SubCodes.
         */
        public Builder subCodes(java.util.List<String> subCodes) {
            String subCodesShrink = shrink(subCodes, "SubCodes", "json");
            this.putBodyParameter("SubCodes", subCodesShrink);
            this.subCodes = subCodes;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitSmartAuditRequest build() {
            return new SubmitSmartAuditRequest(this);
        } 

    } 

}
