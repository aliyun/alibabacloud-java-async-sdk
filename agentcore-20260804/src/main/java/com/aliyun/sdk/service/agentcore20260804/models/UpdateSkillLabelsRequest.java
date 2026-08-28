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
 * {@link UpdateSkillLabelsRequest} extends {@link RequestModel}
 *
 * <p>UpdateSkillLabelsRequest</p>
 */
public class UpdateSkillLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("skillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateSkillLabelsRequestBody body;

    private UpdateSkillLabelsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.skillName = builder.skillName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillLabelsRequest create() {
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
     * @return body
     */
    public UpdateSkillLabelsRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateSkillLabelsRequest, Builder> {
        private String workspaceId; 
        private String skillName; 
        private UpdateSkillLabelsRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSkillLabelsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.skillName = request.skillName;
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
         * body.
         */
        public Builder body(UpdateSkillLabelsRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateSkillLabelsRequest build() {
            return new UpdateSkillLabelsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSkillLabelsRequest} extends {@link TeaModel}
     *
     * <p>UpdateSkillLabelsRequest</p>
     */
    public static class UpdateSkillLabelsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("labels")
        @com.aliyun.core.annotation.Validation(required = true)
        private String labels;

        private UpdateSkillLabelsRequestBody(Builder builder) {
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateSkillLabelsRequestBody create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private String labels; 

            private Builder() {
            } 

            private Builder(UpdateSkillLabelsRequestBody model) {
                this.labels = model.labels;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;latest&quot;:&quot;0.0.2&quot;,&quot;stable&quot;:&quot;0.0.1&quot;}</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            public UpdateSkillLabelsRequestBody build() {
                return new UpdateSkillLabelsRequestBody(this);
            } 

        } 

    }
}
