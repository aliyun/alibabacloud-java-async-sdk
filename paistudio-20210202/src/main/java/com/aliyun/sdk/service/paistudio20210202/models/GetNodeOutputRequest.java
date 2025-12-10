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
 * {@link GetNodeOutputRequest} extends {@link RequestModel}
 *
 * <p>GetNodeOutputRequest</p>
 */
public class GetNodeOutputRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("OutputId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputIndex")
    private String outputIndex;

    private GetNodeOutputRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.nodeId = builder.nodeId;
        this.outputId = builder.outputId;
        this.outputIndex = builder.outputIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeOutputRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return outputId
     */
    public String getOutputId() {
        return this.outputId;
    }

    /**
     * @return outputIndex
     */
    public String getOutputIndex() {
        return this.outputIndex;
    }

    public static final class Builder extends Request.Builder<GetNodeOutputRequest, Builder> {
        private String experimentId; 
        private String nodeId; 
        private String outputId; 
        private String outputIndex; 

        private Builder() {
            super();
        } 

        private Builder(GetNodeOutputRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.nodeId = request.nodeId;
            this.outputId = request.outputId;
            this.outputIndex = request.outputIndex;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>draft-rbvg5wzljzjhc9ks92</p>
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>node-5dzotrnwyzfxmbwwc8</p>
         */
        public Builder nodeId(String nodeId) {
            this.putPathParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>outputId</p>
         */
        public Builder outputId(String outputId) {
            this.putPathParameter("OutputId", outputId);
            this.outputId = outputId;
            return this;
        }

        /**
         * OutputIndex.
         */
        public Builder outputIndex(String outputIndex) {
            this.putQueryParameter("OutputIndex", outputIndex);
            this.outputIndex = outputIndex;
            return this;
        }

        @Override
        public GetNodeOutputRequest build() {
            return new GetNodeOutputRequest(this);
        } 

    } 

}
