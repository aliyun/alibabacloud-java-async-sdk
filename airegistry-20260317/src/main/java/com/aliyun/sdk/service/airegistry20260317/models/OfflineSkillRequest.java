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
 * {@link OfflineSkillRequest} extends {@link RequestModel}
 *
 * <p>OfflineSkillRequest</p>
 */
public class OfflineSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillVersion")
    private String skillVersion;

    private OfflineSkillRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.scope = builder.scope;
        this.skillName = builder.skillName;
        this.skillVersion = builder.skillVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfflineSkillRequest create() {
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
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

    public static final class Builder extends Request.Builder<OfflineSkillRequest, Builder> {
        private String namespaceId; 
        private String scope; 
        private String skillName; 
        private String skillVersion; 

        private Builder() {
            super();
        } 

        private Builder(OfflineSkillRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.scope = request.scope;
            this.skillName = request.skillName;
            this.skillVersion = request.skillVersion;
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
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
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
         * SkillVersion.
         */
        public Builder skillVersion(String skillVersion) {
            this.putQueryParameter("SkillVersion", skillVersion);
            this.skillVersion = skillVersion;
            return this;
        }

        @Override
        public OfflineSkillRequest build() {
            return new OfflineSkillRequest(this);
        } 

    } 

}
