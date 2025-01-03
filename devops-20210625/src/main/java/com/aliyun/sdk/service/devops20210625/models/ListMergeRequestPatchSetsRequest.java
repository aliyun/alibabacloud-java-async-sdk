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
 * {@link ListMergeRequestPatchSetsRequest} extends {@link RequestModel}
 *
 * <p>ListMergeRequestPatchSetsRequest</p>
 */
public class ListMergeRequestPatchSetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

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

    private ListMergeRequestPatchSetsRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.localId = builder.localId;
        this.organizationId = builder.organizationId;
        this.repositoryIdentity = builder.repositoryIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMergeRequestPatchSetsRequest create() {
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

    public static final class Builder extends Request.Builder<ListMergeRequestPatchSetsRequest, Builder> {
        private String accessToken; 
        private Long localId; 
        private String organizationId; 
        private String repositoryIdentity; 

        private Builder() {
            super();
        } 

        private Builder(ListMergeRequestPatchSetsRequest request) {
            super(request);
            this.accessToken = request.accessToken;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
         * <p>5ebbc0228123212b59xxxxx</p>
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
        public ListMergeRequestPatchSetsRequest build() {
            return new ListMergeRequestPatchSetsRequest(this);
        } 

    } 

}
