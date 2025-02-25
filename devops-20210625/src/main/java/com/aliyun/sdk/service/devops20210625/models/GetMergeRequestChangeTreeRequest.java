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
 * {@link GetMergeRequestChangeTreeRequest} extends {@link RequestModel}
 *
 * <p>GetMergeRequestChangeTreeRequest</p>
 */
public class GetMergeRequestChangeTreeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fromPatchSetBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fromPatchSetBizId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("toPatchSetBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toPatchSetBizId;

    private GetMergeRequestChangeTreeRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.fromPatchSetBizId = builder.fromPatchSetBizId;
        this.localId = builder.localId;
        this.organizationId = builder.organizationId;
        this.repositoryIdentity = builder.repositoryIdentity;
        this.toPatchSetBizId = builder.toPatchSetBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMergeRequestChangeTreeRequest create() {
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
     * @return fromPatchSetBizId
     */
    public String getFromPatchSetBizId() {
        return this.fromPatchSetBizId;
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

    /**
     * @return toPatchSetBizId
     */
    public String getToPatchSetBizId() {
        return this.toPatchSetBizId;
    }

    public static final class Builder extends Request.Builder<GetMergeRequestChangeTreeRequest, Builder> {
        private String accessToken; 
        private String fromPatchSetBizId; 
        private Long localId; 
        private String organizationId; 
        private String repositoryIdentity; 
        private String toPatchSetBizId; 

        private Builder() {
            super();
        } 

        private Builder(GetMergeRequestChangeTreeRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.fromPatchSetBizId = request.fromPatchSetBizId;
            this.localId = request.localId;
            this.organizationId = request.organizationId;
            this.repositoryIdentity = request.repositoryIdentity;
            this.toPatchSetBizId = request.toPatchSetBizId;
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
         * <p>5e733626d53f4b04a6aa0e23d4ff72b8</p>
         */
        public Builder fromPatchSetBizId(String fromPatchSetBizId) {
            this.putQueryParameter("fromPatchSetBizId", fromPatchSetBizId);
            this.fromPatchSetBizId = fromPatchSetBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>513fcfd81a9142d2bb0db4f72c0aa15b</p>
         */
        public Builder toPatchSetBizId(String toPatchSetBizId) {
            this.putQueryParameter("toPatchSetBizId", toPatchSetBizId);
            this.toPatchSetBizId = toPatchSetBizId;
            return this;
        }

        @Override
        public GetMergeRequestChangeTreeRequest build() {
            return new GetMergeRequestChangeTreeRequest(this);
        } 

    } 

}
