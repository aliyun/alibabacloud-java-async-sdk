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
 * {@link DeleteProjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteProjectRequest</p>
 */
public class DeleteProjectRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("identifier")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DeleteProjectRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.identifier = request.identifier;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7fb72727f32143574f7a...</p>
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
