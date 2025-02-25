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
 * {@link ListPipelineJobsRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineJobsRequest</p>
 */
public class ListPipelineJobsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1000)
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("category")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ListPipelineJobsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.category = request.category;
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
         * <p>1111</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEPLOY</p>
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
