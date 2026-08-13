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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("includeSkillFiles")
    private Boolean includeSkillFiles;

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
        this.includeSkillFiles = builder.includeSkillFiles;
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
     * @return includeSkillFiles
     */
    public Boolean getIncludeSkillFiles() {
        return this.includeSkillFiles;
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
        private Boolean includeSkillFiles; 
        private String skillCode; 
        private String skillName; 
        private String tenantId; 
        private String viewMode; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillRequest request) {
            super(request);
            this.includeSkillFiles = request.includeSkillFiles;
            this.skillCode = request.skillCode;
            this.skillName = request.skillName;
            this.tenantId = request.tenantId;
            this.viewMode = request.viewMode;
        } 

        /**
         * <p>是否返回完整文件树（默认 False，避免大体积响应）</p>
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
         * <p>技能编码（全局唯一），优先级高于 skillName</p>
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
         * <p>技能名称，未传 skillCode 时使用；租户范围内必须唯一</p>
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
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
         * <p>视角：draft（草稿/编辑视角）或 published（已发布视角，默认）</p>
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
