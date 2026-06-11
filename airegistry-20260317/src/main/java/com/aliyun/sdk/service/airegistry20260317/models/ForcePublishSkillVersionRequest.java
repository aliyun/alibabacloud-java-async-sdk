// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateLatestLabel")
    private Boolean updateLatestLabel;

    private ForcePublishSkillVersionRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.skillName = builder.skillName;
        this.skillVersion = builder.skillVersion;
        this.updateLatestLabel = builder.updateLatestLabel;
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
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
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
     * @return updateLatestLabel
     */
    public Boolean getUpdateLatestLabel() {
        return this.updateLatestLabel;
    }

    public static final class Builder extends Request.Builder<ForcePublishSkillVersionRequest, Builder> {
        private String namespaceId; 
        private String skillName; 
        private String skillVersion; 
        private Boolean updateLatestLabel; 

        private Builder() {
            super();
        } 

        private Builder(ForcePublishSkillVersionRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.skillName = request.skillName;
            this.skillVersion = request.skillVersion;
            this.updateLatestLabel = request.updateLatestLabel;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-skill</p>
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
         * <p>0.0.2</p>
         */
        public Builder skillVersion(String skillVersion) {
            this.putQueryParameter("SkillVersion", skillVersion);
            this.skillVersion = skillVersion;
            return this;
        }

        /**
         * UpdateLatestLabel.
         */
        public Builder updateLatestLabel(Boolean updateLatestLabel) {
            this.putQueryParameter("UpdateLatestLabel", updateLatestLabel);
            this.updateLatestLabel = updateLatestLabel;
            return this;
        }

        @Override
        public ForcePublishSkillVersionRequest build() {
            return new ForcePublishSkillVersionRequest(this);
        } 

    } 

}
