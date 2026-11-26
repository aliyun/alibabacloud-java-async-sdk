// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetSkillRequest} extends {@link RequestModel}
 *
 * <p>GetSkillRequest</p>
 */
public class GetSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("includeSkillFiles")
    private Boolean includeSkillFiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skillCode")
    private String skillCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skillName")
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("viewMode")
    private String viewMode;

    private GetSkillRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.includeSkillFiles = builder.includeSkillFiles;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.skillCode = builder.skillCode;
        this.skillName = builder.skillName;
        this.tenantId = builder.tenantId;
        this.viewMode = builder.viewMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
    }

    /**
     * @return includeSkillFiles
     */
    public Boolean getIncludeSkillFiles() {
        return this.includeSkillFiles;
    }

    /**
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
    }

    /**
     * @return skillCode
     */
    public String getSkillCode() {
        return this.skillCode;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return viewMode
     */
    public String getViewMode() {
        return this.viewMode;
    }

    public static final class Builder extends Request.Builder<GetSkillRequest, Builder> {
        private String appToken; 
        private Boolean includeSkillFiles; 
        private String opsUserCode; 
        private String opsUserId; 
        private String skillCode; 
        private String skillName; 
        private String tenantId; 
        private String viewMode; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.includeSkillFiles = request.includeSkillFiles;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.skillCode = request.skillCode;
            this.skillName = request.skillName;
            this.tenantId = request.tenantId;
            this.viewMode = request.viewMode;
        } 

        /**
         * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>Specifies whether to return the complete file tree. Default value: false. This prevents large response payloads.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeSkillFiles(Boolean includeSkillFiles) {
            this.putBodyParameter("includeSkillFiles", includeSkillFiles);
            this.includeSkillFiles = includeSkillFiles;
            return this;
        }

        /**
         * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The skill code. This parameter has a value when type is set to skill.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder skillCode(String skillCode) {
            this.putBodyParameter("skillCode", skillCode);
            this.skillCode = skillCode;
            return this;
        }

        /**
         * <p>The name of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder skillName(String skillName) {
            this.putBodyParameter("skillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>The ID of the tenant to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The view mode. Valid values: draft (draft or edit view) and published (published view, default).</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        public Builder viewMode(String viewMode) {
            this.putBodyParameter("viewMode", viewMode);
            this.viewMode = viewMode;
            return this;
        }

        @Override
        public GetSkillRequest build() {
            return new GetSkillRequest(this);
        } 

    } 

}
