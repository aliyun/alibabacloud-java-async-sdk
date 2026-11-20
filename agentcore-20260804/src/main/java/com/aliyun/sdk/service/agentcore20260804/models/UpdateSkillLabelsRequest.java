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
         * <p>The workspace ID.</p>
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
         * <p>The skill name.</p>
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
         * <p>The request body.</p>
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
        @com.aliyun.core.annotation.NameInMap("labelDescriptions")
        private String labelDescriptions;

        @com.aliyun.core.annotation.NameInMap("labels")
        @com.aliyun.core.annotation.Validation(required = true)
        private String labels;

        private UpdateSkillLabelsRequestBody(Builder builder) {
            this.labelDescriptions = builder.labelDescriptions;
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateSkillLabelsRequestBody create() {
            return builder().build();
        }

        /**
         * @return labelDescriptions
         */
        public String getLabelDescriptions() {
            return this.labelDescriptions;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private String labelDescriptions; 
            private String labels; 

            private Builder() {
            } 

            private Builder(UpdateSkillLabelsRequestBody model) {
                this.labelDescriptions = model.labelDescriptions;
                this.labels = model.labels;
            } 

            /**
             * <p>The label descriptions.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;stable&quot;:&quot;prod environment usage&quot;}</p>
             */
            public Builder labelDescriptions(String labelDescriptions) {
                this.labelDescriptions = labelDescriptions;
                return this;
            }

            /**
             * <p>The version label mapping JSON string.</p>
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
