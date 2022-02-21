// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePipelineResponseBody</p>
 */
public class DeletePipelineResponseBody extends TeaModel {
    @NameInMap("PipelineId")
    private String pipelineId;

    @NameInMap("RequestId")
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
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * RequestId.
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
