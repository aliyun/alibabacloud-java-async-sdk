// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePipelineRequest} extends {@link RequestModel}
 *
 * <p>DescribePipelineRequest</p>
 */
public class DescribePipelineRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("PipelineId")
    @Validation(required = true)
    private String pipelineId;

    @Body
    @NameInMap("body")
    private String body;

    private DescribePipelineRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pipelineId = builder.pipelineId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePipelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DescribePipelineRequest, Builder> {
        private String instanceId; 
        private String pipelineId; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(DescribePipelineRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pipelineId = request.pipelineId;
            this.body = request.body;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public DescribePipelineRequest build() {
            return new DescribePipelineRequest(this);
        } 

    } 

}
