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
 * {@link UploadSkillViaOssRequest} extends {@link RequestModel}
 *
 * <p>UploadSkillViaOssRequest</p>
 */
public class UploadSkillViaOssRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UploadSkillViaOssRequestBody body;

    private UploadSkillViaOssRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadSkillViaOssRequest create() {
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
    public UploadSkillViaOssRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UploadSkillViaOssRequest, Builder> {
        private String workspaceId; 
        private UploadSkillViaOssRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UploadSkillViaOssRequest request) {
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
        public Builder body(UploadSkillViaOssRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UploadSkillViaOssRequest build() {
            return new UploadSkillViaOssRequest(this);
        } 

    } 

    /**
     * 
     * {@link UploadSkillViaOssRequest} extends {@link TeaModel}
     *
     * <p>UploadSkillViaOssRequest</p>
     */
    public static class UploadSkillViaOssRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commitMsg")
        private String commitMsg;

        @com.aliyun.core.annotation.NameInMap("ossObjectName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ossObjectName;

        @com.aliyun.core.annotation.NameInMap("overwrite")
        private Boolean overwrite;

        @com.aliyun.core.annotation.NameInMap("targetVersion")
        private String targetVersion;

        private UploadSkillViaOssRequestBody(Builder builder) {
            this.commitMsg = builder.commitMsg;
            this.ossObjectName = builder.ossObjectName;
            this.overwrite = builder.overwrite;
            this.targetVersion = builder.targetVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadSkillViaOssRequestBody create() {
            return builder().build();
        }

        /**
         * @return commitMsg
         */
        public String getCommitMsg() {
            return this.commitMsg;
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

        /**
         * @return targetVersion
         */
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public static final class Builder {
            private String commitMsg; 
            private String ossObjectName; 
            private Boolean overwrite; 
            private String targetVersion; 

            private Builder() {
            } 

            private Builder(UploadSkillViaOssRequestBody model) {
                this.commitMsg = model.commitMsg;
                this.ossObjectName = model.ossObjectName;
                this.overwrite = model.overwrite;
                this.targetVersion = model.targetVersion;
            } 

            /**
             * commitMsg.
             */
            public Builder commitMsg(String commitMsg) {
                this.commitMsg = commitMsg;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>imports/example.zip</p>
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

            /**
             * targetVersion.
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
                return this;
            }

            public UploadSkillViaOssRequestBody build() {
                return new UploadSkillViaOssRequestBody(this);
            } 

        } 

    }
}
