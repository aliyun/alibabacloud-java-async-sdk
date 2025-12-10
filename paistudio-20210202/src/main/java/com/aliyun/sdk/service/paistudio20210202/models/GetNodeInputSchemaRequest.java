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
 * {@link GetNodeInputSchemaRequest} extends {@link RequestModel}
 *
 * <p>GetNodeInputSchemaRequest</p>
 */
public class GetNodeInputSchemaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputId")
    private String inputId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputIndex")
    private Integer inputIndex;

    private GetNodeInputSchemaRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.nodeId = builder.nodeId;
        this.inputId = builder.inputId;
        this.inputIndex = builder.inputIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeInputSchemaRequest create() {
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
     * @return inputId
     */
    public String getInputId() {
        return this.inputId;
    }

    /**
     * @return inputIndex
     */
    public Integer getInputIndex() {
        return this.inputIndex;
    }

    public static final class Builder extends Request.Builder<GetNodeInputSchemaRequest, Builder> {
        private String experimentId; 
        private String nodeId; 
        private String inputId; 
        private Integer inputIndex; 

        private Builder() {
            super();
        } 

        private Builder(GetNodeInputSchemaRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.nodeId = request.nodeId;
            this.inputId = request.inputId;
            this.inputIndex = request.inputIndex;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>experiment-rbvg5wzljzjhc9ks92</p>
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
         * <p>ff1f33b0-426a-46bb-bb30-4a5648058079</p>
         */
        public Builder nodeId(String nodeId) {
            this.putPathParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * InputId.
         */
        public Builder inputId(String inputId) {
            this.putQueryParameter("InputId", inputId);
            this.inputId = inputId;
            return this;
        }

        /**
         * InputIndex.
         */
        public Builder inputIndex(Integer inputIndex) {
            this.putQueryParameter("InputIndex", inputIndex);
            this.inputIndex = inputIndex;
            return this;
        }

        @Override
        public GetNodeInputSchemaRequest build() {
            return new GetNodeInputSchemaRequest(this);
        } 

    } 

}
