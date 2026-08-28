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
 * {@link PrecheckSkillUploadViaOssRequest} extends {@link RequestModel}
 *
 * <p>PrecheckSkillUploadViaOssRequest</p>
 */
public class PrecheckSkillUploadViaOssRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PrecheckSkillUploadViaOssRequestBody body;

    private PrecheckSkillUploadViaOssRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrecheckSkillUploadViaOssRequest create() {
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
    public PrecheckSkillUploadViaOssRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PrecheckSkillUploadViaOssRequest, Builder> {
        private String workspaceId; 
        private PrecheckSkillUploadViaOssRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(PrecheckSkillUploadViaOssRequest request) {
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
        public Builder body(PrecheckSkillUploadViaOssRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public PrecheckSkillUploadViaOssRequest build() {
            return new PrecheckSkillUploadViaOssRequest(this);
        } 

    } 

    /**
     * 
     * {@link PrecheckSkillUploadViaOssRequest} extends {@link TeaModel}
     *
     * <p>PrecheckSkillUploadViaOssRequest</p>
     */
    public static class PrecheckSkillUploadViaOssRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ossObjectName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ossObjectName;

        private PrecheckSkillUploadViaOssRequestBody(Builder builder) {
            this.ossObjectName = builder.ossObjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckSkillUploadViaOssRequestBody create() {
            return builder().build();
        }

        /**
         * @return ossObjectName
         */
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        public static final class Builder {
            private String ossObjectName; 

            private Builder() {
            } 

            private Builder(PrecheckSkillUploadViaOssRequestBody model) {
                this.ossObjectName = model.ossObjectName;
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

            public PrecheckSkillUploadViaOssRequestBody build() {
                return new PrecheckSkillUploadViaOssRequestBody(this);
            } 

        } 

    }
}
