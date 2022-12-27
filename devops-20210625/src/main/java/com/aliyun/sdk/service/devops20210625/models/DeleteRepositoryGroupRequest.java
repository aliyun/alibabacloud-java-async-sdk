// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepositoryGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteRepositoryGroupRequest</p>
 */
public class DeleteRepositoryGroupRequest extends Request {
    @Path
    @NameInMap("groupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("reason")
    @Validation(required = true)
    private String reason;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private DeleteRepositoryGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.accessToken = builder.accessToken;
        this.reason = builder.reason;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRepositoryGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<DeleteRepositoryGroupRequest, Builder> {
        private Long groupId; 
        private String accessToken; 
        private String reason; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRepositoryGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.accessToken = request.accessToken;
            this.reason = request.reason;
            this.organizationId = request.organizationId;
        } 

        /**
         * groupId.
         */
        public Builder groupId(Long groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
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
         * reason.
         */
        public Builder reason(String reason) {
            this.putBodyParameter("reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public DeleteRepositoryGroupRequest build() {
            return new DeleteRepositoryGroupRequest(this);
        } 

    } 

}
