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
 * {@link UpdateSkillBizTagsRequest} extends {@link RequestModel}
 *
 * <p>UpdateSkillBizTagsRequest</p>
 */
public class UpdateSkillBizTagsRequest extends Request {
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
    private UpdateSkillBizTagsRequestBody body;

    private UpdateSkillBizTagsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.skillName = builder.skillName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillBizTagsRequest create() {
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
    public UpdateSkillBizTagsRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateSkillBizTagsRequest, Builder> {
        private String workspaceId; 
        private String skillName; 
        private UpdateSkillBizTagsRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSkillBizTagsRequest request) {
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
        public Builder body(UpdateSkillBizTagsRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateSkillBizTagsRequest build() {
            return new UpdateSkillBizTagsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSkillBizTagsRequest} extends {@link TeaModel}
     *
     * <p>UpdateSkillBizTagsRequest</p>
     */
    public static class UpdateSkillBizTagsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizTags")
        @com.aliyun.core.annotation.Validation(required = true)
        private String bizTags;

        private UpdateSkillBizTagsRequestBody(Builder builder) {
            this.bizTags = builder.bizTags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateSkillBizTagsRequestBody create() {
            return builder().build();
        }

        /**
         * @return bizTags
         */
        public String getBizTags() {
            return this.bizTags;
        }

        public static final class Builder {
            private String bizTags; 

            private Builder() {
            } 

            private Builder(UpdateSkillBizTagsRequestBody model) {
                this.bizTags = model.bizTags;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;cs&quot;,&quot;qa&quot;,&quot;support&quot;]</p>
             */
            public Builder bizTags(String bizTags) {
                this.bizTags = bizTags;
                return this;
            }

            public UpdateSkillBizTagsRequestBody build() {
                return new UpdateSkillBizTagsRequestBody(this);
            } 

        } 

    }
}
