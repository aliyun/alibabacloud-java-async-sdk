// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetPipelineRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineRequest</p>
 */
public class GetPipelineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    private GetPipelineRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.pipelineName = builder.pipelineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    public static final class Builder extends Request.Builder<GetPipelineRequest, Builder> {
        private String agentSpace; 
        private String pipelineName; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.pipelineName = request.pipelineName;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * pipelineName.
         */
        public Builder pipelineName(String pipelineName) {
            this.putPathParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        @Override
        public GetPipelineRequest build() {
            return new GetPipelineRequest(this);
        } 

    } 

}
