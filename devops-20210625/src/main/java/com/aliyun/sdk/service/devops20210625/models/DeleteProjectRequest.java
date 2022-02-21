// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteProjectRequest</p>
 */
public class DeleteProjectRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("identifier")
    private String identifier;

    private DeleteProjectRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProjectRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProjectRequest, Builder> {
        private String organizationId; 
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProjectRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.identifier = response.identifier;
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
         * identifier.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        @Override
        public DeleteProjectRequest build() {
            return new DeleteProjectRequest(this);
        } 

    } 

}
