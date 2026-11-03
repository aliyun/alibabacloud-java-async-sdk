// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link UpdateSkillRequest} extends {@link RequestModel}
 *
 * <p>UpdateSkillRequest</p>
 */
public class UpdateSkillRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssUrl")
    private String ossUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequiredConnections")
    private java.util.List<String> requiredConnections;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillDescription")
    private String skillDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillDisplayName")
    private String skillDisplayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillLabels")
    private java.util.List<String> skillLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceSkillId")
    private String sourceSkillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private UpdateSkillRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ossUrl = builder.ossUrl;
        this.requiredConnections = builder.requiredConnections;
        this.skillDescription = builder.skillDescription;
        this.skillDisplayName = builder.skillDisplayName;
        this.skillId = builder.skillId;
        this.skillLabels = builder.skillLabels;
        this.skillName = builder.skillName;
        this.sourceSkillId = builder.sourceSkillId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ossUrl
     */
    public String getOssUrl() {
        return this.ossUrl;
    }

    /**
     * @return requiredConnections
     */
    public java.util.List<String> getRequiredConnections() {
        return this.requiredConnections;
    }

    /**
     * @return skillDescription
     */
    public String getSkillDescription() {
        return this.skillDescription;
    }

    /**
     * @return skillDisplayName
     */
    public String getSkillDisplayName() {
        return this.skillDisplayName;
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    /**
     * @return skillLabels
     */
    public java.util.List<String> getSkillLabels() {
        return this.skillLabels;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return sourceSkillId
     */
    public String getSourceSkillId() {
        return this.sourceSkillId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<UpdateSkillRequest, Builder> {
        private String clientToken; 
        private String ossUrl; 
        private java.util.List<String> requiredConnections; 
        private String skillDescription; 
        private String skillDisplayName; 
        private String skillId; 
        private java.util.List<String> skillLabels; 
        private String skillName; 
        private String sourceSkillId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSkillRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ossUrl = request.ossUrl;
            this.requiredConnections = request.requiredConnections;
            this.skillDescription = request.skillDescription;
            this.skillDisplayName = request.skillDisplayName;
            this.skillId = request.skillId;
            this.skillLabels = request.skillLabels;
            this.skillName = request.skillName;
            this.sourceSkillId = request.sourceSkillId;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Required when SourceType is set to UPLOAD. The OSS URL of the skill package to upload.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/skill-creator1.zip">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/skill-creator1.zip</a></p>
         */
        public Builder ossUrl(String ossUrl) {
            this.putQueryParameter("OssUrl", ossUrl);
            this.ossUrl = ossUrl;
            return this;
        }

        /**
         * <p>The collection of connection types required by the skill.</p>
         */
        public Builder requiredConnections(java.util.List<String> requiredConnections) {
            this.putQueryParameter("RequiredConnections", requiredConnections);
            this.requiredConnections = requiredConnections;
            return this;
        }

        /**
         * <p>The description of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>Create new skills.</p>
         */
        public Builder skillDescription(String skillDescription) {
            this.putQueryParameter("SkillDescription", skillDescription);
            this.skillDescription = skillDescription;
            return this;
        }

        /**
         * SkillDisplayName.
         */
        public Builder skillDisplayName(String skillDisplayName) {
            this.putQueryParameter("SkillDisplayName", skillDisplayName);
            this.skillDisplayName = skillDisplayName;
            return this;
        }

        /**
         * <p>The ID of the skill to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s-xxxxx</p>
         */
        public Builder skillId(String skillId) {
            this.putQueryParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        /**
         * <p>The labels of the skill.</p>
         */
        public Builder skillLabels(java.util.List<String> skillLabels) {
            this.putQueryParameter("SkillLabels", skillLabels);
            this.skillLabels = skillLabels;
            return this;
        }

        /**
         * <p>The name of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-creator</p>
         */
        public Builder skillName(String skillName) {
            this.putQueryParameter("SkillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>Required when SourceType is set to COPY. The ID of the public skill.</p>
         * 
         * <strong>example:</strong>
         * <p>s-xxxxx</p>
         */
        public Builder sourceSkillId(String sourceSkillId) {
            this.putQueryParameter("SourceSkillId", sourceSkillId);
            this.sourceSkillId = sourceSkillId;
            return this;
        }

        /**
         * <p>The source type for updating the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>COPY</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public UpdateSkillRequest build() {
            return new UpdateSkillRequest(this);
        } 

    } 

}
