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
 * {@link ListPipelineRelationsRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineRelationsRequest</p>
 */
public class ListPipelineRelationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineId")
    private Long pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("relObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relObjectType;

    private ListPipelineRelationsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.relObjectType = builder.relObjectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineRelationsRequest create() {
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
     * @return relObjectType
     */
    public String getRelObjectType() {
        return this.relObjectType;
    }

    public static final class Builder extends Request.Builder<ListPipelineRelationsRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private String relObjectType; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelineRelationsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.relObjectType = request.relObjectType;
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
         * pipelineId.
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VARIABLE_GROUP</p>
         */
        public Builder relObjectType(String relObjectType) {
            this.putQueryParameter("relObjectType", relObjectType);
            this.relObjectType = relObjectType;
            return this;
        }

        @Override
        public ListPipelineRelationsRequest build() {
            return new ListPipelineRelationsRequest(this);
        } 

    } 

}
