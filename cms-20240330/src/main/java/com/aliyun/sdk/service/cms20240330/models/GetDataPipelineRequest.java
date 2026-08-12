// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetDataPipelineRequest} extends {@link RequestModel}
 *
 * <p>GetDataPipelineRequest</p>
 */
public class GetDataPipelineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineName;

    private GetDataPipelineRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.pipelineName = builder.pipelineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataPipelineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    public static final class Builder extends Request.Builder<GetDataPipelineRequest, Builder> {
        private String workspace; 
        private String pipelineName; 

        private Builder() {
            super();
        } 

        private Builder(GetDataPipelineRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.pipelineName = request.pipelineName;
        } 

        /**
         * <p>数据流水线所属的工作空间名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-source</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>工作空间内唯一的数据流水线名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>export-traces-to-prod</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.putPathParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        @Override
        public GetDataPipelineRequest build() {
            return new GetDataPipelineRequest(this);
        } 

    } 

}
