// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckRunRequest} extends {@link RequestModel}
 *
 * <p>GetCheckRunRequest</p>
 */
public class GetCheckRunRequest extends Request {
    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("checkRunId")
    @Validation(required = true)
    private Long checkRunId;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("repositoryIdentity")
    @Validation(required = true)
    private String repositoryIdentity;

    private GetCheckRunRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.checkRunId = builder.checkRunId;
        this.organizationId = builder.organizationId;
        this.repositoryIdentity = builder.repositoryIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckRunRequest create() {
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
     * @return checkRunId
     */
    public Long getCheckRunId() {
        return this.checkRunId;
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

    public static final class Builder extends Request.Builder<GetCheckRunRequest, Builder> {
        private String accessToken; 
        private Long checkRunId; 
        private String organizationId; 
        private String repositoryIdentity; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckRunRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.checkRunId = request.checkRunId;
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
         * checkRunId.
         */
        public Builder checkRunId(Long checkRunId) {
            this.putQueryParameter("checkRunId", checkRunId);
            this.checkRunId = checkRunId;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * repositoryIdentity.
         */
        public Builder repositoryIdentity(String repositoryIdentity) {
            this.putQueryParameter("repositoryIdentity", repositoryIdentity);
            this.repositoryIdentity = repositoryIdentity;
            return this;
        }

        @Override
        public GetCheckRunRequest build() {
            return new GetCheckRunRequest(this);
        } 

    } 

}
