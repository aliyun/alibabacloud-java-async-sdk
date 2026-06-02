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
 * {@link DeleteWorkspaceCodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkspaceCodeRequest</p>
 */
public class DeleteWorkspaceCodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Repo")
    private String repo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Symlink")
    private Boolean symlink;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DeleteWorkspaceCodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.path = builder.path;
        this.repo = builder.repo;
        this.symlink = builder.symlink;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkspaceCodeRequest create() {
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
     * @return symlink
     */
    public Boolean getSymlink() {
        return this.symlink;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteWorkspaceCodeRequest, Builder> {
        private String regionId; 
        private String path; 
        private String repo; 
        private Boolean symlink; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkspaceCodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.path = request.path;
            this.repo = request.repo;
            this.symlink = request.symlink;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/Workspace/code/default/test.ipynb</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * Repo.
         */
        public Builder repo(String repo) {
            this.putQueryParameter("Repo", repo);
            this.repo = repo;
            return this;
        }

        /**
         * Symlink.
         */
        public Builder symlink(Boolean symlink) {
            this.putQueryParameter("Symlink", symlink);
            this.symlink = symlink;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteWorkspaceCodeRequest build() {
            return new DeleteWorkspaceCodeRequest(this);
        } 

    } 

}
