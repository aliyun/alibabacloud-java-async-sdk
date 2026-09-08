// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link SaveWorkspaceCodeRequest} extends {@link RequestModel}
 *
 * <p>SaveWorkspaceCodeRequest</p>
 */
public class SaveWorkspaceCodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Iac")
    private Boolean iac;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mtime")
    private String mtime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Repo")
    private String repo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SaveWorkspaceCodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.content = builder.content;
        this.force = builder.force;
        this.iac = builder.iac;
        this.mtime = builder.mtime;
        this.path = builder.path;
        this.repo = builder.repo;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWorkspaceCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return iac
     */
    public Boolean getIac() {
        return this.iac;
    }

    /**
     * @return mtime
     */
    public String getMtime() {
        return this.mtime;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return repo
     */
    public String getRepo() {
        return this.repo;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SaveWorkspaceCodeRequest, Builder> {
        private String regionId; 
        private String content; 
        private Boolean force; 
        private Boolean iac; 
        private String mtime; 
        private String path; 
        private String repo; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SaveWorkspaceCodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.content = request.content;
            this.force = request.force;
            this.iac = request.iac;
            this.mtime = request.mtime;
            this.path = request.path;
            this.repo = request.repo;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The code content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>print(123)</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly overwrite the file regardless of whether it has been modified by others.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder force(Boolean force) {
            this.putBodyParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>Specifies whether the file is an infrastructure as code template file. Set this parameter to true for YAML configuration files edited through the visual editor.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder iac(Boolean iac) {
            this.putBodyParameter("Iac", iac);
            this.iac = iac;
            return this;
        }

        /**
         * <p>The file modification time. The GetWorkspaceCode operation returns this mtime value. When calling SaveWorkspaceCode, include this mtime to compare against the server-side value. If the mtime does not match, the save fails, indicating that the server-side version has changed.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T10:11:12Z</p>
         */
        public Builder mtime(String mtime) {
            this.putBodyParameter("Mtime", mtime);
            this.mtime = mtime;
            return this;
        }

        /**
         * <p>The file path to save.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/Workspace/code/test.py</p>
         */
        public Builder path(String path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The repository information. Pass this parameter when creating a git repo directory during the save action.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:git@codeup.aliyun.com">git@codeup.aliyun.com</a>:test/abc.git</p>
         */
        public Builder repo(String repo) {
            this.putBodyParameter("Repo", repo);
            this.repo = repo;
            return this;
        }

        /**
         * <p>The ID of the workspace to publish (numeric ID).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SaveWorkspaceCodeRequest build() {
            return new SaveWorkspaceCodeRequest(this);
        } 

    } 

}
