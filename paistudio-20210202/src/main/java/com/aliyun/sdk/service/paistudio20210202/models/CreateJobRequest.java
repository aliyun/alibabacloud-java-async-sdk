// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link CreateJobRequest} extends {@link RequestModel}
 *
 * <p>CreateJobRequest</p>
 */
public class CreateJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecuteType")
    private String executeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @Deprecated
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PipelineDraftId")
    private String pipelineDraftId;

    private CreateJobRequest(Builder builder) {
        super(builder);
        this.executeType = builder.executeType;
        this.experimentId = builder.experimentId;
        this.nodeId = builder.nodeId;
        this.options = builder.options;
        this.pipelineDraftId = builder.pipelineDraftId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executeType
     */
    public String getExecuteType() {
        return this.executeType;
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return pipelineDraftId
     */
    public String getPipelineDraftId() {
        return this.pipelineDraftId;
    }

    public static final class Builder extends Request.Builder<CreateJobRequest, Builder> {
        private String executeType; 
        private String experimentId; 
        private String nodeId; 
        private String options; 
        private String pipelineDraftId; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobRequest request) {
            super(request);
            this.executeType = request.executeType;
            this.experimentId = request.experimentId;
            this.nodeId = request.nodeId;
            this.options = request.options;
            this.pipelineDraftId = request.pipelineDraftId;
        } 

        /**
         * ExecuteType.
         */
        public Builder executeType(String executeType) {
            this.putBodyParameter("ExecuteType", executeType);
            this.executeType = executeType;
            return this;
        }

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putBodyParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * PipelineDraftId.
         */
        public Builder pipelineDraftId(String pipelineDraftId) {
            this.putBodyParameter("PipelineDraftId", pipelineDraftId);
            this.pipelineDraftId = pipelineDraftId;
            return this;
        }

        @Override
        public CreateJobRequest build() {
            return new CreateJobRequest(this);
        } 

    } 

}
