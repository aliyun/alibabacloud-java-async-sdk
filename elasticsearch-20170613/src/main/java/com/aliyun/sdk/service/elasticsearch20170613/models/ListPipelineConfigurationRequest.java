// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineConfigurationRequest</p>
 */
public class ListPipelineConfigurationRequest extends Request {
    @Path
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Path
    @NameInMap("PipelineId")
    @Validation(required = true)
    private String pipelineId;

    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("Size")
    private Integer size;

    private ListPipelineConfigurationRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.pipelineId = builder.pipelineId;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListPipelineConfigurationRequest, Builder> {
        private String projectId; 
        private String pipelineId; 
        private Integer page; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelineConfigurationRequest response) {
            super(response);
            this.projectId = response.projectId;
            this.pipelineId = response.pipelineId;
            this.page = response.page;
            this.size = response.size;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putPathParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListPipelineConfigurationRequest build() {
            return new ListPipelineConfigurationRequest(this);
        } 

    } 

}
