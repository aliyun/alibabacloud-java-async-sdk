// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePipelineResponseBody</p>
 */
public class DeletePipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeletePipelineResponseBody(Builder builder) {
        this.pipelineId = builder.pipelineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePipelineResponseBody create() {
        return builder().build();
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String pipelineId; 
        private String requestId; 

        /**
         * The ID of the MPS queue that is deleted.
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePipelineResponseBody build() {
            return new DeletePipelineResponseBody(this);
        } 

    } 

}
