// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
    @com.aliyun.core.annotation.NameInMap("Download")
    private Boolean download;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetSkillRequest(Builder builder) {
        super(builder);
        this.download = builder.download;
        this.language = builder.language;
        this.path = builder.path;
        this.skillId = builder.skillId;
        this.versionId = builder.versionId;
        this.workspaceId = builder.workspaceId;
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
     * @return download
     */
    public Boolean getDownload() {
        return this.download;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetSkillRequest, Builder> {
        private Boolean download; 
        private String language; 
        private String path; 
        private String skillId; 
        private String versionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillRequest request) {
            super(request);
            this.download = request.download;
            this.language = request.language;
            this.path = request.path;
            this.skillId = request.skillId;
            this.versionId = request.versionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Specifies whether to obtain a temporary download URL for the specified version. Default value: false.</p>
         */
        public Builder download(Boolean download) {
            this.putQueryParameter("Download", download);
            this.download = download;
            return this;
        }

        /**
         * <p>The supported language. Valid values:</p>
         * <ul>
         * <li>zh-CN: Simplified Chinese</li>
         * <li>zh-TW: Traditional Chinese</li>
         * <li>en-US: English</li>
         * <li>ja-JP: Japanese</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The file path within the package, such as SKILL.md. The body is in File.text, and the full Markdown is in SkillMarkdown.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL.md</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The unique identifier of the skill.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-44665544****</p>
         */
        public Builder skillId(String skillId) {
            this.putQueryParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        /**
         * <p>The version UUID (Versions[].Id), not a version number such as 1.0.0. If omitted, the currently active version is read.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000002</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * <p>The ContextDB workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetSkillRequest build() {
            return new GetSkillRequest(this);
        } 

    } 

}
