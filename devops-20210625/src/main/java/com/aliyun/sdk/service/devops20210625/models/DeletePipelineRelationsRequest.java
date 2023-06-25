// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelineRelationsRequest} extends {@link RequestModel}
 *
 * <p>DeletePipelineRelationsRequest</p>
 */
public class DeletePipelineRelationsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("pipelineId")
    @Validation(required = true)
    private Long pipelineId;

    @Query
    @NameInMap("relObjectId")
    @Validation(required = true)
    private String relObjectId;

    @Query
    @NameInMap("relObjectType")
    @Validation(required = true)
    private String relObjectType;

    private DeletePipelineRelationsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.relObjectId = builder.relObjectId;
        this.relObjectType = builder.relObjectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePipelineRelationsRequest create() {
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
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return relObjectId
     */
    public String getRelObjectId() {
        return this.relObjectId;
    }

    /**
     * @return relObjectType
     */
    public String getRelObjectType() {
        return this.relObjectType;
    }

    public static final class Builder extends Request.Builder<DeletePipelineRelationsRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private String relObjectId; 
        private String relObjectType; 

        private Builder() {
            super();
        } 

        private Builder(DeletePipelineRelationsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.relObjectId = request.relObjectId;
            this.relObjectType = request.relObjectType;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * pipelineId.
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * relObjectId.
         */
        public Builder relObjectId(String relObjectId) {
            this.putQueryParameter("relObjectId", relObjectId);
            this.relObjectId = relObjectId;
            return this;
        }

        /**
         * relObjectType.
         */
        public Builder relObjectType(String relObjectType) {
            this.putQueryParameter("relObjectType", relObjectType);
            this.relObjectType = relObjectType;
            return this;
        }

        @Override
        public DeletePipelineRelationsRequest build() {
            return new DeletePipelineRelationsRequest(this);
        } 

    } 

}
