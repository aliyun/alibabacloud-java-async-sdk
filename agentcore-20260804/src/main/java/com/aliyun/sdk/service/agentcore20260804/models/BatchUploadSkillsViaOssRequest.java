// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link BatchUploadSkillsViaOssRequest} extends {@link RequestModel}
 *
 * <p>BatchUploadSkillsViaOssRequest</p>
 */
public class BatchUploadSkillsViaOssRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private BatchUploadSkillsViaOssRequestBody body;

    private BatchUploadSkillsViaOssRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUploadSkillsViaOssRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return body
     */
    public BatchUploadSkillsViaOssRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<BatchUploadSkillsViaOssRequest, Builder> {
        private String workspaceId; 
        private BatchUploadSkillsViaOssRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(BatchUploadSkillsViaOssRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(BatchUploadSkillsViaOssRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public BatchUploadSkillsViaOssRequest build() {
            return new BatchUploadSkillsViaOssRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchUploadSkillsViaOssRequest} extends {@link TeaModel}
     *
     * <p>BatchUploadSkillsViaOssRequest</p>
     */
    public static class BatchUploadSkillsViaOssRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ossObjectName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ossObjectName;

        @com.aliyun.core.annotation.NameInMap("overwrite")
        private Boolean overwrite;

        private BatchUploadSkillsViaOssRequestBody(Builder builder) {
            this.ossObjectName = builder.ossObjectName;
            this.overwrite = builder.overwrite;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchUploadSkillsViaOssRequestBody create() {
            return builder().build();
        }

        /**
         * @return ossObjectName
         */
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        /**
         * @return overwrite
         */
        public Boolean getOverwrite() {
            return this.overwrite;
        }

        public static final class Builder {
            private String ossObjectName; 
            private Boolean overwrite; 

            private Builder() {
            } 

            private Builder(BatchUploadSkillsViaOssRequestBody model) {
                this.ossObjectName = model.ossObjectName;
                this.overwrite = model.overwrite;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>skill/import/user123/ns-123456/2026/04/20/uuid/skills.zip</p>
             */
            public Builder ossObjectName(String ossObjectName) {
                this.ossObjectName = ossObjectName;
                return this;
            }

            /**
             * overwrite.
             */
            public Builder overwrite(Boolean overwrite) {
                this.overwrite = overwrite;
                return this;
            }

            public BatchUploadSkillsViaOssRequestBody build() {
                return new BatchUploadSkillsViaOssRequestBody(this);
            } 

        } 

    }
}
