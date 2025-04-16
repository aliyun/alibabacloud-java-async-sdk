// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link StartImagePipelineExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>StartImagePipelineExecutionResponseBody</p>
 */
public class StartImagePipelineExecutionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExecutionId")
    private String executionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(StartImagePipelineExecutionResponseBody model) {
            this.executionId = model.executionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the image creation task.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-5fb8facb8ed7427c****</p>
         */
        public Builder executionId(String executionId) {
            this.executionId = executionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
