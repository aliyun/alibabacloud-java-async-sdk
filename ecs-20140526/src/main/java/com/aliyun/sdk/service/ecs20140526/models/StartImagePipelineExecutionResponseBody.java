// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartImagePipelineExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>StartImagePipelineExecutionResponseBody</p>
 */
public class StartImagePipelineExecutionResponseBody extends TeaModel {
    @NameInMap("ExecutionId")
    private String executionId;

    @NameInMap("RequestId")
    private String requestId;

    private StartImagePipelineExecutionResponseBody(Builder builder) {
        this.executionId = builder.executionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartImagePipelineExecutionResponseBody create() {
        return builder().build();
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String executionId; 
        private String requestId; 

        /**
         * The ID of the image creation task.
         */
        public Builder executionId(String executionId) {
            this.executionId = executionId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartImagePipelineExecutionResponseBody build() {
            return new StartImagePipelineExecutionResponseBody(this);
        } 

    } 

}
