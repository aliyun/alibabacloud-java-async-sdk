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
            this.skillDescription = request.skillDescription;
            this.skillDisplayName = request.skillDisplayName;
            this.skillId = request.skillId;
            this.skillLabels = request.skillLabels;
            this.skillName = request.skillName;
            this.sourceSkillId = request.sourceSkillId;
            this.sourceType = request.sourceType;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OssUrl.
         */
        public Builder ossUrl(String ossUrl) {
            this.putQueryParameter("OssUrl", ossUrl);
            this.ossUrl = ossUrl;
            return this;
        }

        /**
         * SkillDescription.
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>06e9dca2-0ac9-4d2e-a965-e9db9c057e00</p>
         */
        public Builder skillId(String skillId) {
            this.putQueryParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        /**
         * SkillLabels.
         */
        public Builder skillLabels(java.util.List<String> skillLabels) {
            this.putQueryParameter("SkillLabels", skillLabels);
            this.skillLabels = skillLabels;
            return this;
        }

        /**
         * SkillName.
         */
        public Builder skillName(String skillName) {
            this.putQueryParameter("SkillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * SourceSkillId.
         */
        public Builder sourceSkillId(String sourceSkillId) {
            this.putQueryParameter("SourceSkillId", sourceSkillId);
            this.sourceSkillId = sourceSkillId;
            return this;
        }

        /**
         * SourceType.
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
