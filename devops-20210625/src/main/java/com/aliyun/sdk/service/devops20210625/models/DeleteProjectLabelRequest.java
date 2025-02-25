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
 * {@link DeleteProjectLabelRequest} extends {@link RequestModel}
 *
 * <p>DeleteProjectLabelRequest</p>
 */
public class DeleteProjectLabelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("labelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("repositoryIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repositoryIdentity;

    private DeleteProjectLabelRequest(Builder builder) {
        super(builder);
        this.labelId = builder.labelId;
        this.accessToken = builder.accessToken;
        this.organizationId = builder.organizationId;
        this.repositoryIdentity = builder.repositoryIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProjectLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
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

    public static final class Builder extends Request.Builder<DeleteProjectLabelRequest, Builder> {
        private String labelId; 
        private String accessToken; 
        private String organizationId; 
        private String repositoryIdentity; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProjectLabelRequest request) {
            super(request);
            this.labelId = request.labelId;
            this.accessToken = request.accessToken;
            this.organizationId = request.organizationId;
            this.repositoryIdentity = request.repositoryIdentity;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>54e2699e538b4ba985177d6eb4d16cee</p>
         */
        public Builder labelId(String labelId) {
            this.putPathParameter("labelId", labelId);
            this.labelId = labelId;
            return this;
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
        public DeleteProjectLabelRequest build() {
            return new DeleteProjectLabelRequest(this);
        } 

    } 

}
