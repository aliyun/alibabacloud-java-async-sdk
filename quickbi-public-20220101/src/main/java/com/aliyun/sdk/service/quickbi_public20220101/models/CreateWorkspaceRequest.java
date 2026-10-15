// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link CreateWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkspaceRequest</p>
 */
public class CreateWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowPublish")
    private Boolean allowPublish;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowShare")
    private Boolean allowShare;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowViewAll")
    private Boolean allowViewAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultShareToAll")
    private Boolean defaultShareToAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyAdminCreateDatasource")
    private Boolean onlyAdminCreateDatasource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseComment")
    private Boolean useComment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceDescription")
    private String workspaceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    private CreateWorkspaceRequest(Builder builder) {
        super(builder);
        this.allowPublish = builder.allowPublish;
        this.allowShare = builder.allowShare;
        this.allowViewAll = builder.allowViewAll;
        this.defaultShareToAll = builder.defaultShareToAll;
        this.onlyAdminCreateDatasource = builder.onlyAdminCreateDatasource;
        this.useComment = builder.useComment;
        this.workspaceDescription = builder.workspaceDescription;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowPublish
     */
    public Boolean getAllowPublish() {
        return this.allowPublish;
    }

    /**
     * @return allowShare
     */
    public Boolean getAllowShare() {
        return this.allowShare;
    }

    /**
     * @return allowViewAll
     */
    public Boolean getAllowViewAll() {
        return this.allowViewAll;
    }

    /**
     * @return defaultShareToAll
     */
    public Boolean getDefaultShareToAll() {
        return this.defaultShareToAll;
    }

    /**
     * @return onlyAdminCreateDatasource
     */
    public Boolean getOnlyAdminCreateDatasource() {
        return this.onlyAdminCreateDatasource;
    }

    /**
     * @return useComment
     */
    public Boolean getUseComment() {
        return this.useComment;
    }

    /**
     * @return workspaceDescription
     */
    public String getWorkspaceDescription() {
        return this.workspaceDescription;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder extends Request.Builder<CreateWorkspaceRequest, Builder> {
        private Boolean allowPublish; 
        private Boolean allowShare; 
        private Boolean allowViewAll; 
        private Boolean defaultShareToAll; 
        private Boolean onlyAdminCreateDatasource; 
        private Boolean useComment; 
        private String workspaceDescription; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkspaceRequest request) {
            super(request);
            this.allowPublish = request.allowPublish;
            this.allowShare = request.allowShare;
            this.allowViewAll = request.allowViewAll;
            this.defaultShareToAll = request.defaultShareToAll;
            this.onlyAdminCreateDatasource = request.onlyAdminCreateDatasource;
            this.useComment = request.useComment;
            this.workspaceDescription = request.workspaceDescription;
            this.workspaceName = request.workspaceName;
        } 

        /**
         * <p>Specifies whether reports in the workspace can be made public. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowPublish(Boolean allowPublish) {
            this.putQueryParameter("AllowPublish", allowPublish);
            this.allowPublish = allowPublish;
            return this;
        }

        /**
         * <p>Specifies whether reports in the workspace can be shared. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowShare(Boolean allowShare) {
            this.putQueryParameter("AllowShare", allowShare);
            this.allowShare = allowShare;
            return this;
        }

        /**
         * <p>Specifies whether the workspace is in collaboration mode. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowViewAll(Boolean allowViewAll) {
            this.putQueryParameter("AllowViewAll", allowViewAll);
            this.allowViewAll = allowViewAll;
            return this;
        }

        /**
         * <p>Specifies whether to grant read permissions on the works in the workspace to all workspace members by default. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder defaultShareToAll(Boolean defaultShareToAll) {
            this.putQueryParameter("DefaultShareToAll", defaultShareToAll);
            this.defaultShareToAll = defaultShareToAll;
            return this;
        }

        /**
         * <p>Specifies whether only administrators can create data sources in the workspace. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder onlyAdminCreateDatasource(Boolean onlyAdminCreateDatasource) {
            this.putQueryParameter("OnlyAdminCreateDatasource", onlyAdminCreateDatasource);
            this.onlyAdminCreateDatasource = onlyAdminCreateDatasource;
            return this;
        }

        /**
         * <p>Specifies whether to use table remarks when you create a dataset in the workspace. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useComment(Boolean useComment) {
            this.putQueryParameter("UseComment", useComment);
            this.useComment = useComment;
            return this;
        }

        /**
         * <p>The description of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder workspaceDescription(String workspaceDescription) {
            this.putQueryParameter("WorkspaceDescription", workspaceDescription);
            this.workspaceDescription = workspaceDescription;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putQueryParameter("WorkspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        @Override
        public CreateWorkspaceRequest build() {
            return new CreateWorkspaceRequest(this);
        } 

    } 

}
