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
 * {@link ForcePublishSkillVersionRequest} extends {@link RequestModel}
 *
 * <p>ForcePublishSkillVersionRequest</p>
 */
public class ForcePublishSkillVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("skillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("skillVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ForcePublishSkillVersionRequestBody body;

    private ForcePublishSkillVersionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.skillName = builder.skillName;
        this.skillVersion = builder.skillVersion;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForcePublishSkillVersionRequest create() {
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
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return skillVersion
     */
    public String getSkillVersion() {
        return this.skillVersion;
    }

    /**
     * @return body
     */
    public ForcePublishSkillVersionRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ForcePublishSkillVersionRequest, Builder> {
        private String workspaceId; 
        private String skillName; 
        private String skillVersion; 
        private ForcePublishSkillVersionRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(ForcePublishSkillVersionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.skillName = request.skillName;
            this.skillVersion = request.skillVersion;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-skill</p>
         */
        public Builder skillName(String skillName) {
            this.putPathParameter("skillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        public Builder skillVersion(String skillVersion) {
            this.putPathParameter("skillVersion", skillVersion);
            this.skillVersion = skillVersion;
            return this;
        }

        /**
         * body.
         */
        public Builder body(ForcePublishSkillVersionRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public ForcePublishSkillVersionRequest build() {
            return new ForcePublishSkillVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link ForcePublishSkillVersionRequest} extends {@link TeaModel}
     *
     * <p>ForcePublishSkillVersionRequest</p>
     */
    public static class ForcePublishSkillVersionRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("updateLatestLabel")
        private Boolean updateLatestLabel;

        private ForcePublishSkillVersionRequestBody(Builder builder) {
            this.updateLatestLabel = builder.updateLatestLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForcePublishSkillVersionRequestBody create() {
            return builder().build();
        }

        /**
         * @return updateLatestLabel
         */
        public Boolean getUpdateLatestLabel() {
            return this.updateLatestLabel;
        }

        public static final class Builder {
            private Boolean updateLatestLabel; 

            private Builder() {
            } 

            private Builder(ForcePublishSkillVersionRequestBody model) {
                this.updateLatestLabel = model.updateLatestLabel;
            } 

            /**
             * updateLatestLabel.
             */
            public Builder updateLatestLabel(Boolean updateLatestLabel) {
                this.updateLatestLabel = updateLatestLabel;
                return this;
            }

            public ForcePublishSkillVersionRequestBody build() {
                return new ForcePublishSkillVersionRequestBody(this);
            } 

        } 

    }
}
