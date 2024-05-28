// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePipelineBaseInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdatePipelineBaseInfoRequest</p>
 */
public class UpdatePipelineBaseInfoRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("envId")
    private Long envId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tagList")
    private String tagList;

    private UpdatePipelineBaseInfoRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.envId = builder.envId;
        this.pipelineName = builder.pipelineName;
        this.tagList = builder.tagList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePipelineBaseInfoRequest create() {
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
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * @return tagList
     */
    public String getTagList() {
        return this.tagList;
    }

    public static final class Builder extends Request.Builder<UpdatePipelineBaseInfoRequest, Builder> {
        private String organizationId; 
        private String pipelineId; 
        private Long envId; 
        private String pipelineName; 
        private String tagList; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePipelineBaseInfoRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.envId = request.envId;
            this.pipelineName = request.pipelineName;
            this.tagList = request.tagList;
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
        public Builder pipelineId(String pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * envId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("envId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * pipelineName.
         */
        public Builder pipelineName(String pipelineName) {
            this.putQueryParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * tagList.
         */
        public Builder tagList(String tagList) {
            this.putQueryParameter("tagList", tagList);
            this.tagList = tagList;
            return this;
        }

        @Override
        public UpdatePipelineBaseInfoRequest build() {
            return new UpdatePipelineBaseInfoRequest(this);
        } 

    } 

}
