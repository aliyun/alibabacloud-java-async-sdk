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
 * {@link TransferRepositoryRequest} extends {@link RequestModel}
 *
 * <p>TransferRepositoryRequest</p>
 */
public class TransferRepositoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repositoryId;

    private TransferRepositoryRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.groupId = builder.groupId;
        this.organizationId = builder.organizationId;
        this.repositoryId = builder.repositoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferRepositoryRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return repositoryId
     */
    public String getRepositoryId() {
        return this.repositoryId;
    }

    public static final class Builder extends Request.Builder<TransferRepositoryRequest, Builder> {
        private String accessToken; 
        private String groupId; 
        private String organizationId; 
        private String repositoryId; 

        private Builder() {
            super();
        } 

        private Builder(TransferRepositoryRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.groupId = request.groupId;
            this.organizationId = request.organizationId;
            this.repositoryId = request.repositoryId;
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
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("groupId", groupId);
            this.groupId = groupId;
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
        public Builder repositoryId(String repositoryId) {
            this.putQueryParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        @Override
        public TransferRepositoryRequest build() {
            return new TransferRepositoryRequest(this);
        } 

    } 

}
