// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineRelationsRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineRelationsRequest</p>
 */
public class ListPipelineRelationsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("pipelineId")
    private Long pipelineId;

    @Query
    @NameInMap("relObjectType")
    @Validation(required = true)
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
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如  https:// devops.aliyun.com/organization/【OrgId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 流水线ID，可在流水线链接中获取，如https://flow.aliyun.com/pipelines/【PipelineId】/current
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * 关联的资源类型，暂只支持VARIABLE_GROUP
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
