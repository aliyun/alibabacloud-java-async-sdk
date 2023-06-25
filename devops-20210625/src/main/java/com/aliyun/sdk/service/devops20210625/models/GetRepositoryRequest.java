// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepositoryRequest} extends {@link RequestModel}
 *
 * <p>GetRepositoryRequest</p>
 */
public class GetRepositoryRequest extends Request {
    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("identity")
    @Validation(required = true)
    private String identity;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private GetRepositoryRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.identity = builder.identity;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepositoryRequest create() {
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
     * @return identity
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<GetRepositoryRequest, Builder> {
        private String accessToken; 
        private String identity; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(GetRepositoryRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.identity = request.identity;
            this.organizationId = request.organizationId;
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
         * identity.
         */
        public Builder identity(String identity) {
            this.putQueryParameter("identity", identity);
            this.identity = identity;
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

        @Override
        public GetRepositoryRequest build() {
            return new GetRepositoryRequest(this);
        } 

    } 

}
