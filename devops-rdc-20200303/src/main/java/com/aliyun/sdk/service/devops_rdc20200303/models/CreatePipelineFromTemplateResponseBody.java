// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineFromTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePipelineFromTemplateResponseBody</p>
 */
public class CreatePipelineFromTemplateResponseBody extends TeaModel {
    @NameInMap("PipelineId")
    private Long pipelineId;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePipelineFromTemplateResponseBody(Builder builder) {
        this.pipelineId = builder.pipelineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineFromTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long pipelineId; 
        private String requestId; 

        /**
         * 流水线ID
         */
        public Builder pipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePipelineFromTemplateResponseBody build() {
            return new CreatePipelineFromTemplateResponseBody(this);
        } 

    } 

}
