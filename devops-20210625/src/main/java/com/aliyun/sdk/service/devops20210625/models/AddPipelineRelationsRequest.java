// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPipelineRelationsRequest} extends {@link RequestModel}
 *
 * <p>AddPipelineRelationsRequest</p>
 */
public class AddPipelineRelationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("relObjectIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relObjectIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("relObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relObjectType;

    private AddPipelineRelationsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.relObjectIds = builder.relObjectIds;
        this.relObjectType = builder.relObjectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPipelineRelationsRequest create() {
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
     * @return relObjectIds
     */
    public String getRelObjectIds() {
        return this.relObjectIds;
    }

    /**
     * @return relObjectType
     */
    public String getRelObjectType() {
        return this.relObjectType;
    }

    public static final class Builder extends Request.Builder<AddPipelineRelationsRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private String relObjectIds; 
        private String relObjectType; 

        private Builder() {
            super();
        } 

        private Builder(AddPipelineRelationsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.relObjectIds = request.relObjectIds;
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
         * relObjectIds.
         */
        public Builder relObjectIds(String relObjectIds) {
            this.putQueryParameter("relObjectIds", relObjectIds);
            this.relObjectIds = relObjectIds;
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
        public AddPipelineRelationsRequest build() {
            return new AddPipelineRelationsRequest(this);
        } 

    } 

}
