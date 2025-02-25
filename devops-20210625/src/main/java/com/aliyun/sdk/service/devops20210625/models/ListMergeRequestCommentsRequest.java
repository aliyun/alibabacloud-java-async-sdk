// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListMergeRequestCommentsRequest} extends {@link RequestModel}
 *
 * <p>ListMergeRequestCommentsRequest</p>
 */
public class ListMergeRequestCommentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("commentType")
    private String commentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filePath")
    private String filePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("patchSetBizIds")
    private java.util.List<String> patchSetBizIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resolved")
    private Boolean resolved;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("localId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long localId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("repositoryIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repositoryIdentity;

    private ListMergeRequestCommentsRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.commentType = builder.commentType;
        this.filePath = builder.filePath;
        this.patchSetBizIds = builder.patchSetBizIds;
        this.resolved = builder.resolved;
        this.state = builder.state;
        this.localId = builder.localId;
        this.organizationId = builder.organizationId;
        this.repositoryIdentity = builder.repositoryIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMergeRequestCommentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return commentType
     */
    public String getCommentType() {
        return this.commentType;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return patchSetBizIds
     */
    public java.util.List<String> getPatchSetBizIds() {
        return this.patchSetBizIds;
    }

    /**
     * @return resolved
     */
    public Boolean getResolved() {
        return this.resolved;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return localId
     */
    public Long getLocalId() {
        return this.localId;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return repositoryIdentity
     */
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public static final class Builder extends Request.Builder<ListMergeRequestCommentsRequest, Builder> {
        private String accessToken; 
        private String commentType; 
        private String filePath; 
        private java.util.List<String> patchSetBizIds; 
        private Boolean resolved; 
        private String state; 
        private Long localId; 
        private String organizationId; 
        private String repositoryIdentity; 

        private Builder() {
            super();
        } 

        private Builder(ListMergeRequestCommentsRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.commentType = request.commentType;
            this.filePath = request.filePath;
            this.patchSetBizIds = request.patchSetBizIds;
            this.resolved = request.resolved;
            this.state = request.state;
            this.localId = request.localId;
            this.organizationId = request.organizationId;
            this.repositoryIdentity = request.repositoryIdentity;
        } 

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * commentType.
         */
        public Builder commentType(String commentType) {
            this.putBodyParameter("commentType", commentType);
            this.commentType = commentType;
            return this;
        }

        /**
         * filePath.
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("filePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * patchSetBizIds.
         */
        public Builder patchSetBizIds(java.util.List<String> patchSetBizIds) {
            this.putBodyParameter("patchSetBizIds", patchSetBizIds);
            this.patchSetBizIds = patchSetBizIds;
            return this;
        }

        /**
         * resolved.
         */
        public Builder resolved(Boolean resolved) {
            this.putBodyParameter("resolved", resolved);
            this.resolved = resolved;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.putBodyParameter("state", state);
            this.state = state;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder localId(Long localId) {
            this.putQueryParameter("localId", localId);
            this.localId = localId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder repositoryIdentity(String repositoryIdentity) {
            this.putQueryParameter("repositoryIdentity", repositoryIdentity);
            this.repositoryIdentity = repositoryIdentity;
            return this;
        }

        @Override
        public ListMergeRequestCommentsRequest build() {
            return new ListMergeRequestCommentsRequest(this);
        } 

    } 

}
