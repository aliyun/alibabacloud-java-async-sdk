// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeletePipelineResponseBody model) {
            this.pipelineId = model.pipelineId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the MPS queue that is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>d1ce4d3efcb549419193f50f1fcd****</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>338CA33A-AE83-5DF4-B6F2-C6D3ED8143F5</p>
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
