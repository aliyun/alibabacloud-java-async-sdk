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
 * {@link StopPipelineRunRequest} extends {@link RequestModel}
 *
 * <p>StopPipelineRunRequest</p>
 */
public class StopPipelineRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pipelineId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineRunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pipelineRunId;

    private StopPipelineRunRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.pipelineRunId = builder.pipelineRunId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopPipelineRunRequest create() {
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
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return pipelineRunId
     */
    public Long getPipelineRunId() {
        return this.pipelineRunId;
    }

    public static final class Builder extends Request.Builder<StopPipelineRunRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private Long pipelineRunId; 

        private Builder() {
            super();
        } 

        private Builder(StopPipelineRunRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.pipelineRunId = request.pipelineRunId;
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
         * <p>12</p>
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>223</p>
         */
        public Builder pipelineRunId(Long pipelineRunId) {
            this.putPathParameter("pipelineRunId", pipelineRunId);
            this.pipelineRunId = pipelineRunId;
            return this;
        }

        @Override
        public StopPipelineRunRequest build() {
            return new StopPipelineRunRequest(this);
        } 

    } 

}
