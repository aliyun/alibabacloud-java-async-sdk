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
 * {@link RunPipelineRequest} extends {@link RequestModel}
 *
 * <p>RunPipelineRequest</p>
 */
public class RunPipelineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fromTime")
    private Long fromTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("output")
    private Output output;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("toTime")
    private Long toTime;

    private RunPipelineRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.pipelineName = builder.pipelineName;
        this.fromTime = builder.fromTime;
        this.output = builder.output;
        this.toTime = builder.toTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunPipelineRequest create() {
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

    /**
     * @return fromTime
     */
    public Long getFromTime() {
        return this.fromTime;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    /**
     * @return toTime
     */
    public Long getToTime() {
        return this.toTime;
    }

    public static final class Builder extends Request.Builder<RunPipelineRequest, Builder> {
        private String agentSpace; 
        private String pipelineName; 
        private Long fromTime; 
        private Output output; 
        private Long toTime; 

        private Builder() {
            super();
        } 

        private Builder(RunPipelineRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.pipelineName = request.pipelineName;
            this.fromTime = request.fromTime;
            this.output = request.output;
            this.toTime = request.toTime;
        } 

        /**
         * <p>The name of the AgentSpace where the pipeline is located.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The name of the pipeline to trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>my-pipeline</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.putPathParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The start of the data processing window, in UNIX seconds. This parameter is required for SQL Pipeline and time window-based WorkItem Source. This parameter is optional for checkpoint-based WorkItem Source types such as Dataset and Logstore Pull.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        public Builder fromTime(Long fromTime) {
            this.putBodyParameter("fromTime", fromTime);
            this.fromTime = fromTime;
            return this;
        }

        /**
         * <p>The output control settings. SQL Pipeline supports overriding. WorkItem Pipeline uses the saved Sink configuration and must keep the default value.</p>
         */
        public Builder output(Output output) {
            this.putBodyParameter("output", output);
            this.output = output;
            return this;
        }

        /**
         * <p>The end of the data processing window, in UNIX seconds. This parameter must be provided together with fromTime and must be greater than fromTime. This parameter is optional for checkpoint-based WorkItem Source types.</p>
         * 
         * <strong>example:</strong>
         * <p>1735747200</p>
         */
        public Builder toTime(Long toTime) {
            this.putBodyParameter("toTime", toTime);
            this.toTime = toTime;
            return this;
        }

        @Override
        public RunPipelineRequest build() {
            return new RunPipelineRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunPipelineRequest} extends {@link TeaModel}
     *
     * <p>RunPipelineRequest</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataset")
        private Boolean dataset;

        @com.aliyun.core.annotation.NameInMap("inline")
        private Boolean inline;

        private Output(Builder builder) {
            this.dataset = builder.dataset;
            this.inline = builder.inline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return dataset
         */
        public Boolean getDataset() {
            return this.dataset;
        }

        /**
         * @return inline
         */
        public Boolean getInline() {
            return this.inline;
        }

        public static final class Builder {
            private Boolean dataset; 
            private Boolean inline; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.dataset = model.dataset;
                this.inline = model.inline;
            } 

            /**
             * <p>Specifies whether to write to the target Dataset. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataset(Boolean dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * <p>Specifies whether to return inline results in the response. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder inline(Boolean inline) {
                this.inline = inline;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
}
