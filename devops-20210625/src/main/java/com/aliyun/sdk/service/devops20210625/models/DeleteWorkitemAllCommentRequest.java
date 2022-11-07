// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkitemAllCommentRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkitemAllCommentRequest</p>
 */
public class DeleteWorkitemAllCommentRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("identifier")
    @Validation(required = true)
    private String identifier;

    private DeleteWorkitemAllCommentRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkitemAllCommentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    public static final class Builder extends Request.Builder<DeleteWorkitemAllCommentRequest, Builder> {
        private String organizationId; 
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkitemAllCommentRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.identifier = request.identifier;
        } 

        /**
         * 企业id
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 工作项id
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        @Override
        public DeleteWorkitemAllCommentRequest build() {
            return new DeleteWorkitemAllCommentRequest(this);
        } 

    } 

}
