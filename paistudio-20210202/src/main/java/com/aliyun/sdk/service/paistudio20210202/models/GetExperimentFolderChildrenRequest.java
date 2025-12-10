// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetExperimentFolderChildrenRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentFolderChildrenRequest</p>
 */
public class GetExperimentFolderChildrenRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FolderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyFolder")
    private Boolean onlyFolder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetExperimentFolderChildrenRequest(Builder builder) {
        super(builder);
        this.folderId = builder.folderId;
        this.accessibility = builder.accessibility;
        this.onlyFolder = builder.onlyFolder;
        this.source = builder.source;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentFolderChildrenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return onlyFolder
     */
    public Boolean getOnlyFolder() {
        return this.onlyFolder;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetExperimentFolderChildrenRequest, Builder> {
        private String folderId; 
        private String accessibility; 
        private Boolean onlyFolder; 
        private String source; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentFolderChildrenRequest request) {
            super(request);
            this.folderId = request.folderId;
            this.accessibility = request.accessibility;
            this.onlyFolder = request.onlyFolder;
            this.source = request.source;
            this.userId = request.userId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>folder-xzf7t7****ch7qce</p>
         */
        public Builder folderId(String folderId) {
            this.putPathParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * OnlyFolder.
         */
        public Builder onlyFolder(Boolean onlyFolder) {
            this.putQueryParameter("OnlyFolder", onlyFolder);
            this.onlyFolder = onlyFolder;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetExperimentFolderChildrenRequest build() {
            return new GetExperimentFolderChildrenRequest(this);
        } 

    } 

}
