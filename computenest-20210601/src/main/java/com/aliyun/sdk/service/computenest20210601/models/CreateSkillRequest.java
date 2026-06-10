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
    @com.aliyun.core.annotation.NameInMap("SkillDescription")
    private String skillDescription;

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
        this.skillDescription = builder.skillDescription;
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
     * @return skillDescription
     */
    public String getSkillDescription() {
        return this.skillDescription;
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
        private String skillDescription; 
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
            this.skillDescription = request.skillDescription;
            this.skillLabels = request.skillLabels;
            this.skillName = request.skillName;
            this.skillSpaceId = request.skillSpaceId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-111111</p>
         */
        public Builder skillSpaceId(String skillSpaceId) {
            this.putQueryParameter("SkillSpaceId", skillSpaceId);
            this.skillSpaceId = skillSpaceId;
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
