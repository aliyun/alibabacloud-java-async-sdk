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
 * {@link CreateSkillRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillRequest</p>
 */
public class CreateSkillRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SkillLabels")
    private java.util.List<String> skillLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceSkillId")
    private String sourceSkillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    private CreateSkillRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ossUrl = builder.ossUrl;
        this.requiredConnections = builder.requiredConnections;
        this.skillDescription = builder.skillDescription;
        this.skillDisplayName = builder.skillDisplayName;
        this.skillLabels = builder.skillLabels;
        this.skillName = builder.skillName;
        this.skillSpaceId = builder.skillSpaceId;
        this.sourceSkillId = builder.sourceSkillId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillRequest create() {
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
     * @return skillSpaceId
     */
    public String getSkillSpaceId() {
        return this.skillSpaceId;
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

    public static final class Builder extends Request.Builder<CreateSkillRequest, Builder> {
        private String clientToken; 
        private String ossUrl; 
        private java.util.List<String> requiredConnections; 
        private String skillDescription; 
        private String skillDisplayName; 
        private java.util.List<String> skillLabels; 
        private String skillName; 
        private String skillSpaceId; 
        private String sourceSkillId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ossUrl = request.ossUrl;
            this.requiredConnections = request.requiredConnections;
            this.skillDescription = request.skillDescription;
            this.skillDisplayName = request.skillDisplayName;
            this.skillLabels = request.skillLabels;
            this.skillName = request.skillName;
            this.skillSpaceId = request.skillSpaceId;
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
         * <p>The OSS URL of the Skill package to upload. This parameter is required when SourceType is set to UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/skill-creator.zip">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/skill-creator.zip</a></p>
         */
        public Builder ossUrl(String ossUrl) {
            this.putQueryParameter("OssUrl", ossUrl);
            this.ossUrl = ossUrl;
            return this;
        }

        /**
         * <p>The set of connection types that the Skill depends on.</p>
         */
        public Builder requiredConnections(java.util.List<String> requiredConnections) {
            this.putQueryParameter("RequiredConnections", requiredConnections);
            this.requiredConnections = requiredConnections;
            return this;
        }

        /**
         * <p>The Skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>Create new skills, modify and improve existing skills, and measure skill performance</p>
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
         * <p>The set of Skill labels.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;category:frontend-development&quot;]</p>
         */
        public Builder skillLabels(java.util.List<String> skillLabels) {
            this.putQueryParameter("SkillLabels", skillLabels);
            this.skillLabels = skillLabels;
            return this;
        }

        /**
         * <p>The Skill name.</p>
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
         * <p>The ID of the SkillSpace to which the Skill belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-xxxxx</p>
         */
        public Builder skillSpaceId(String skillSpaceId) {
            this.putQueryParameter("SkillSpaceId", skillSpaceId);
            this.skillSpaceId = skillSpaceId;
            return this;
        }

        /**
         * <p>The public Skill ID. This parameter is required when SourceType is set to COPY.</p>
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
         * <p>The source type for creating the Skill.</p>
         * <p>This parameter is required.</p>
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
        public CreateSkillRequest build() {
            return new CreateSkillRequest(this);
        } 

    } 

}
