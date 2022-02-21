// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineJobsRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineJobsRequest</p>
 */
public class ListPipelineJobsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("pipelineId")
    @Validation(required = true, maxLength = 1000)
    private String pipelineId;

    @Query
    @NameInMap("category")
    @Validation(required = true)
    private String category;

    private ListPipelineJobsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.category = builder.category;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineJobsRequest create() {
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
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    public static final class Builder extends Request.Builder<ListPipelineJobsRequest, Builder> {
        private String organizationId; 
        private String pipelineId; 
        private String category; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelineJobsRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.pipelineId = response.pipelineId;
            this.category = response.category;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如https://devops.aliyun.com/organization/【OrganizationId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * pipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        @Override
        public ListPipelineJobsRequest build() {
            return new ListPipelineJobsRequest(this);
        } 

    } 

}
